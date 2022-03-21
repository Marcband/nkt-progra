package Klausurbesprechung_2022.Uploadsystem;

public class JavaFileVerifier implements UploadVerifier {

    @Override
    public boolean isValid(Uploadable object) {
        return object.getName().endsWith(".java");
    }

}
