public class Elever extends skolPersoner{
    protected String klass;
    protected String betyg;

    // Konstruktor
    public Elever(String namn, int ålder, String personnummer, String klass, String betyg){
        super(namn, ålder, personnummer);
        if (klass == null || klass.trim().isBlank()) {throw new IllegalArgumentException("Klass får inte vara tomt");}
        else if (betyg == null || betyg.trim().isBlank()) {throw new IllegalArgumentException("Klass får inte vara tomt");}
        else{
            this.klass=klass;
            this.betyg=betyg;
        }
    }

    // Getters
    public String getKlass(){
        return klass;
    }

    public String getBetyg(){
        return betyg;
    }

    // Setters 
    public void setKlass(String klass){
        if (klass == null || klass.trim().isBlank()) {throw new IllegalArgumentException("Klass får inte vara tomt");}
        else{
            this.klass=klass;
        }
    }

    public void setBetyg(String betyg){
        if (betyg == null || betyg.trim().isBlank()) {throw new IllegalArgumentException("Klass får inte vara tomt");}
        else{
            this.betyg=betyg;
        }
    }

    // toString
    @Override
    public String toString(){
        return "Elever - " + super.toString() + "Klass: " + klass + ", Betyg: " + betyg + ".";
    }
}
