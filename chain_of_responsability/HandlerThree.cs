using System;

namespace chain_of_responsability
{
    public class HandlerThree : Handler
    {
        public override bool handle(int amount)
        {
            int nb = 0;
            bool result = false;
            int value = 20;
            for (; amount - value >= 0 && quantity > 0; nb++)
            {
                amount -= value;
            }

            if (amount == 0)
            {
                result = true;
            }
            else if (nextHandler != null)
            {
                result = nextHandler.handle(amount);
            }

            if (result && nb > 0)
            {
                Console.WriteLine("{0} x {1}€", nb, value);
            }
            else if (!result && nextHandler == null)
            {
                Console.WriteLine("Error: can't reach the amount");
            }

            return result;
        }

        public HandlerThree(int quantity) : base(quantity)
        {
        }
    }
}
