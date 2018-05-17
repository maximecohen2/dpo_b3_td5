public class LivreCommandeAcheter implements LivreCommande {
        private Livre toCommand;

        LivreCommandeAcheter(Livre toCommand) {
            this.toCommand = toCommand;
        }

        @Override
        public void execute() {
            toCommand.acheter();
        }
}
