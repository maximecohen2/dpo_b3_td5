namespace chain_of_responsability
{
    public abstract class Handler
    {
        protected Handler nextHandler;

        protected readonly int quantity;

        protected Handler(int quantity)
        {
            this.quantity = quantity;
        }
        
        public void setNextHandler(Handler nextHandler)
        {
            this.nextHandler = nextHandler;
        }

        public abstract bool handle(int amount);
    }
}