public class LivreCommandeOffrir implements LivreCommande {
    private Livre toCommand;

    LivreCommandeOffrir(Livre toCommand) {
        this.toCommand = toCommand;
    }

    @Override
    public void execute() {
        toCommand.offrir();
    }
}
