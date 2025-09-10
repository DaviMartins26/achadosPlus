public class Objeto {
    private int idObjeto;
    private String nomeObjeto;
    private Categoria categoria;
    private String descricao;
    private Foto fotoObjeto;
    private int status; // 1-Perdido 2-Encontrado 3- Devolvido (regra de negocio mas podemos mudar pra String pra evitar if else no print da log ou algo assim)

    public Objeto(int idObjeto,String nomeObjeto,Categoria categoria,String descricao,Foto fotoObjeto,int status){
        this.idObjeto = idObjeto;
        this.nomeObjeto = nomeObjeto;
        this.categoria = categoria;
        this.descricao = descricao;
        this.fotoObjeto = fotoObjeto;
        this.status = status;
    }

    public void alterarStatus(int idObjeto,int statusNovo) {
        if (idObjeto == statusNovo) {
            status = statusNovo;
        }
    }
}
