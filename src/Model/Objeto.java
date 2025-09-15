package Model;

public class Objeto {
    private int idObjeto;
    private String nomeObjeto;
    private Categoria categoria;
    private String descricao;
    private Foto fotoObjeto;
    private int status; // 1-Perdido 2-Encontrado 3-Devolvido

    public Objeto(int idObjeto, String nomeObjeto, Categoria categoria, String descricao, Foto fotoObjeto, int status) {
        this.idObjeto = idObjeto;
        this.nomeObjeto = nomeObjeto;
        this.categoria = categoria;
        this.descricao = descricao;
        this.fotoObjeto = fotoObjeto;
        this.status = status;
    }

    // Getters
    public int getIdObjeto() {
        return idObjeto;
    }

    public String getNomeObjeto() {
        return nomeObjeto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public Foto getFotoObjeto() {
        return fotoObjeto;
    }

    public int getStatus() {
        return status;
    }

    // Setters
    public void setStatus(int status) {
        this.status = status;
    }
}
