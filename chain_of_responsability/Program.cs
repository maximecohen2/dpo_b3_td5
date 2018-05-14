using System;

namespace chain_of_responsability
{
    class Program
    {
        static void Main(string[] args)
        {
            Handler h1 = new HandlerOne(0);
            Handler h2 = new HandlerTwo(0);
            Handler h3 = new HandlerThree(10);
            Handler h4 = new HandlerFour(20);
            
            h1.setNextHandler(h2);
            h2.setNextHandler(h3);
            h3.setNextHandler(h4);

            h1.handle(170);
        }
    }
}