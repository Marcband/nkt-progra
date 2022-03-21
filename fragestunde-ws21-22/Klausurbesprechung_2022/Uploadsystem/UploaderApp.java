package Klausurbesprechung_2022.Uploadsystem;

public class UploaderApp {

    public static void main(String[] args) {
        String name = args[0];

        UploadVerifier verifier = new JavaFileVerifier();
        Uploadable file = new SimpleFile(name);
        Uploader uploader = new VerifyingUploader(verifier);
        if(uploader.upload(file)){
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }
    }
}
