document.addEventListener('DOMContentLoaded', () => {
    carregarCategorias();
    carregarBlocos();
    limitarDataHoje();
});

// === Limita o calendário ===
function limitarDataHoje() {
    const today = new Date().toISOString().split('T')[0];
    const dataPerdaInput = document.getElementById('data_perda');
    dataPerdaInput.value = today;
    dataPerdaInput.setAttribute('max', today);
}

// Carrega categorias 
function carregarCategorias() {
    fetch('http://localhost:8080/categorias')
        .then(r => r.json())
        .then(data => {
            const tipoItem = document.getElementById('tipo_item');
            data.forEach(cat => {
                const option = document.createElement('option');
                option.value = cat.idCategoria;
                option.textContent = cat.nomeCategoria;
                tipoItem.appendChild(option);
            });
        })
        .catch(err => console.error('Erro ao carregar categorias:', err));
}

//  Carrega blocos
function carregarBlocos() {
    fetch('http://localhost:8080/blocos')
        .then(r => r.json())
        .then(data => {
            const selectBloco = document.getElementById('bloco_encontro');
            data.forEach(bloco => {
                const option = document.createElement('option');
                option.value = bloco.idBloco;
                option.textContent = bloco.nomeBloco;
                selectBloco.appendChild(option);
            });
            if (data.length > 0) carregarSalas(data[0].idBloco);
        })
        .catch(err => console.error('Erro ao carregar blocos:', err));
}

// Carrega salas conforme bloco
function carregarSalas(idBloco) {
    fetch(`http://localhost:8080/salas/bloco/${idBloco}`)
        .then(r => r.json())
        .then(data => {
            const selectSala = document.getElementById('sala_perda');
            selectSala.innerHTML = '';
            data.forEach(sala => {
                const option = document.createElement('option');
                option.value = sala.idSala;
                option.textContent = sala.nomeSala;
                selectSala.appendChild(option);
            });
        })
        .catch(err => console.error('Erro ao carregar salas:', err));
}

// Atualiza as salas quando o bloco mudar
document.getElementById('bloco_encontro').addEventListener('change', e => {
    carregarSalas(e.target.value);
});

// Envia o formulario
document.getElementById('enviar_objeto').addEventListener('click', async () => {
    const nomeObjeto = document.getElementById('nome_item').value;
    const tipoItem = document.getElementById('tipo_item').value;
    const blocoEncontro = document.getElementById('bloco_encontro').value;
    const salaEncontro = document.getElementById('sala_perda').value;
    const dataPerda = document.getElementById('data_perda').value;
    const descricao = document.getElementById('descricao').value.trim();

    if (!nomeObjeto) {
        alert('Por favor, insira um nome válido.');
        return;
    }

    try {
        //  Cria o objeto
        const objetoResponse = await fetch('http://localhost:8080/objetos/criar', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({
                nome_objeto: nomeObjeto,
                categoria: { idCategoria: tipoItem },
                descricao: descricao,
                status: 1,
                relacionado: null
            })
        });

        if (!objetoResponse.ok) throw new Error('Erro ao registrar objeto.');
        const objetoCriado = await objetoResponse.json();
        console.log('Objeto criado:', objetoCriado);

        // cria o protocolo
        const protocoloResponse = await fetch('http://localhost:8080/protocolos/criar', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({
                objetoPerdido: { idObjeto: objetoCriado.idObjeto },
                status: 1,
                dataCriacao: dataPerda
            })
        });

        if (!protocoloResponse.ok) throw new Error('Erro ao registrar protocolo.');
        const protocoloCriado = await protocoloResponse.json();
        console.log('Protocolo criado:', protocoloCriado);

        alert('Protocolo registrado com sucesso!');
        window.location.href = '../html/ver_protocolos.html';
    } catch (err) {
        console.error(err);
        alert('Erro ao registrar o protocolo. Verifique o console.');
    }
});
