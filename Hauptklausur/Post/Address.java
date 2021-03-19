package Hauptklausur.Post;


//Da in der Aufgabenstellung geforderten Klassen und Methoden englisch sind, haben wir der einheit halber den rest auch englisch gemacht.
public class Address {
    private String country;
    private String city;
    private int plz;
    private String street;
    private int number; // Anmerkung: String wäre hier auch nicht unbedingt falsch, da es Hausnummern wie 54a,54b usw. gibt, in der Regel wird aber ein int erwartet.

    public Address(String country, String city, int plz, String street, int number) {
        this.country = country;
        this.city = city;
        this.plz = plz;
        this.street = street;
        this.number = number;
    }

    public String getCountry(){
        return country;
    }
}
