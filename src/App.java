public class App {
    public static void main(String[] args) throws Exception {
        //Skapa rektor
        Rektor rektorn = new Rektor("Greger", 19, "5604093023", "T17");
        
        //Skapa elever
        Elever elev1 = new  Elever("Lars", 180, "0384539438", "TE23E", "A");
        Elever elev2 = new Elever("Stina", 50, "4095949334", "TE23E", "F");

        //Skapa lärare
        Larare lärare1 = new Larare("Åsa", 77, "8765432435", "Syslöjd");
        Larare lärare2 = new Larare("Kent", 54, "9083657467", "Teknik");

        IO.println(rektorn);
        IO.println(elev1);
        IO.println(elev2);
        IO.println(lärare1);
        IO.println(lärare2);
    }
}
