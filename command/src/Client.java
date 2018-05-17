public class Client {
    private Livre myCommand;

    public void acheter(String titre, String auteur) {
        myCommand = new Livre(titre, auteur, false);
        LivreCommandeAcheter acheterCommand = new LivreCommandeAcheter(myCommand);
        acheterCommand.execute();
    }

    public void offrir(String titre, String auteur) {
        myCommand = new Livre(titre, auteur, true);
        LivreCommandeOffrir offrirCommand = new LivreCommandeOffrir(myCommand);
        offrirCommand.execute();
    }

    public void afficher() {
        myCommand.afficher();
    }

    public static void main(String[] args) {
        Client client = new Client();

        client.acheter("Goerge", "La Fontaine");
        client.afficher();

        client.offrir("Goerge", "La Fontaine");
        client.afficher();
    }
}
