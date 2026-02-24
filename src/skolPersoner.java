public class skolPersoner {
    protected String namn;
    protected int ålder;
    protected String personnummer;
    

    // Konstruktor
    public skolPersoner(String namn, int ålder, String personnummer){
        if (namn == null || namn.trim().isBlank()) {throw new IllegalArgumentException("Namnet får inte vara tom");}
        else if (ålder < 0) {throw new IllegalArgumentException("Ålder får inte vara negativt");}
        else if (personnummer == null ||  personnummer.trim().isBlank()) {throw new IllegalArgumentException("Personnummret får inte vara tomt");}
        else{
            this.namn=namn;
            this.ålder=ålder;
            this.personnummer=personnummer;
        }
    }

    // Getters
    public String getNamn(){
        return namn;
    }
    
    public int getÅlder(){
        return ålder;
    }

    public String getPersonnummer(){
        return personnummer;
    }

    // Setters
    public void setNamn(String namn){
        if (namn == null || namn.trim().isBlank()) {
            throw new IllegalArgumentException("Namnet får inte vara tomt");
        }
        else{this.namn=namn;}
    }

    public void setÅlder(int ålder){
        if (ålder < 0) {
            throw new IllegalArgumentException("Ålder får inte vara negativt");
        }
        else{this.ålder=ålder;}
    }

    public void setPersonnumer(String personnumer){
        if (personnummer == null ||  personnummer.trim().isBlank()) {
            throw new IllegalArgumentException("Personnummret får inte vara tomt");
        }
        else{this.personnummer=personnumer;}
    }

    // toString
    @Override
    public String toString(){
        return "Skolperson - Namn: " + namn + ", Ålder: " + ålder + ", Personnummer: " + personnummer + ".";
    }
}
