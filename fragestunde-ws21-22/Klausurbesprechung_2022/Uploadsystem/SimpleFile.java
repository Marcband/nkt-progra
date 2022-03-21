package Klausurbesprechung_2022.Uploadsystem;

public class SimpleFile implements Uploadable {

    private String dateiname;

    SimpleFile(String dateiname){
        this.dateiname = dateiname;
    }

    @Override
    public String getName() {
        return dateiname;
    }
}
