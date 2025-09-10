public class Foto {
    private int idFoto;
    private String caminho; // ex: "fotos/protocolo_01.png" ver como vamos precisar fazer com banco
    private String dataUpload;

    public Foto(int idFoto, String caminho, String dataUpload) {
        this.idFoto = idFoto;
        this.caminho = caminho;
        this.dataUpload = dataUpload;
    }

    public int getIdFoto() {
        return idFoto;
    }

    public String getCaminho() {
        return caminho;
    }

    public String getDataUpload() {
        return dataUpload;
    }

    public void exibirFoto() {
        System.out.println("Foto #" + idFoto + " - " + caminho + " (" + dataUpload + ")");
    }
}
