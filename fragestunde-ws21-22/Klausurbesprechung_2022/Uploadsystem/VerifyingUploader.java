package Klausurbesprechung_2022.Uploadsystem;

public class VerifyingUploader extends Uploader {
    private UploadVerifier uploadVerifier;

    VerifyingUploader(UploadVerifier uploadVerifier){
        this.uploadVerifier = uploadVerifier;
    }

    @Override
    public boolean upload(Uploadable uploadable){
        if (uploadVerifier.isValid(uploadable)) {
            return super.upload(uploadable);
        }
        return false;
    }


}
