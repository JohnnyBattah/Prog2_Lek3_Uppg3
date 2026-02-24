public class Rektor extends skolPersoner {
    protected String arbetsrum;

    // Konstruktor
    public Rektor(String namn, int ålder, String personnummer, String arbetsrum) {
        super(namn, ålder, personnummer);

        if (arbetsrum == null || arbetsrum.trim().isBlank()) {
            throw new IllegalArgumentException("Arbetsrum får inte vara tomt");
        } else {
            this.arbetsrum = arbetsrum;
        }
    }

    // Getters
    public String getArbetsrum() {
        return arbetsrum;
    }

    // Setters
    public void setArbetsrum(String arbetsrum){
        if (arbetsrum == null || arbetsrum.trim().isBlank()) {
            throw new IllegalArgumentException("Arbetsrum får inte vara tomt");
        } else{
            this.arbetsrum=arbetsrum;
        }
    }

    // toString
    @Override
    public String toString(){
        return "Retor - " + super.toString() + ", Arbetsrum: " + arbetsrum + ".";
    }
}
