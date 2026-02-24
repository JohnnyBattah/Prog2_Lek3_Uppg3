public class Larare extends skolPersoner{
    protected String kurs;

    // Konstruktor
    public Larare(String namn, int ålder, String personnummer, String kurs){
        super(namn, ålder, personnummer);

        if (kurs == null || kurs.trim().isBlank()) {
            throw new IllegalArgumentException("Kurs får inte vara tomt");
        } else {
            this.kurs=kurs;
        }
    }

    // Getters
    public String getKurs(){
        return kurs;
    }

    // Setters
    public void setKurs(String kurs){
        if (kurs == null || kurs.trim().isBlank()) {
            throw new IllegalArgumentException("Kurs får inte vara tomt");
        } else {
            this.kurs=kurs;
        }
    }

    // tostring
    @Override
    public String toString(){
        return "Lärare - " + super.toString() + ", Kurs: " + kurs + ".";
    }
}
