import java.util.ArrayList;
import java.util.List;

public class UploadDeFotos {
    // instancia unica
    private static UploadDeFotos instancia;

    // lista das fotos, com banco vai mudar provavelmente
    private List<Foto> fotos;

    // construtor privado
    private UploadDeFotos(){
        fotos = new ArrayList<>();
    }

    //Metodo pra criar a instancia
    public static UploadDeFotos getInstance(){
        if (instancia == null){
            instancia = new UploadDeFotos();
        }
        return instancia;
    }

    // Simula o upload de foto
    public void uploadFoto(Foto foto){
        fotos.add(foto);
        System.out.println("Foto Salva"); // melhorar isso
    }

    // buscar foto por ID mas vamos fazer com


}
