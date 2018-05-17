public class Livre {
    private String titre;
    private String auteur;
    private boolean cadeau;

    public Livre(String titre, String auteur, boolean cadeau) {
        this.titre = titre;
        this.auteur = auteur;
        this.cadeau = cadeau;
    }

    public void acheter() {
        System.out.println("Livre acheter");
    }

    public void offrir() {
        System.out.println("Livre offert");
    }

    public void afficher() {
        System.out.println("Titre : " + titre + " Auteur : " + auteur + " Cadeau : " + cadeau);
    }
}
