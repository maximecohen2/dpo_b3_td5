import java.util.*;

public class PetitPoucet {
	 private int x;
	 private int y;

	    public void set( int x, int y)
	    {
	        System.out.println("PetitPoucet actuellment à : "+ x + " " + y);
	        this.x = x;
	        this.y = y;
	    }

	    public Object saveToMemento()
	    {
	        System.out.println("PetitPoucet : Cailloux posé.");
	        return new Cailloux(x, y);
	    }

	    public void restoreFromMemento(Object m)
	    {
	        if (m instanceof Cailloux)
	        {
	            Cailloux memento = (Cailloux)m;
	            x = memento.getSavedState();
	            y = memento.getSavedState();
	            System.out.println("PetitPoucet : retour sur : "+x + y);
	        }
	    }

	    private static class Cailloux
	    {
	        private int x;
	   	 	private int y;

	        public Cailloux(int x, int y) { x = stateToSave; y = stateToSave }
	        public int getSavedState() { return x; return y; }
	    }
}

class AngeGardien
{
    private ArrayList savedStates = new ArrayList();

    public void addMemento(Object m) { savedStates.add(m); }
    public Object getMemento(int index) { return savedStates.get(index); }
}

class MementoExample
{
    public static void main(String[] args)
    {
    	AngeGardien angegardien = new AngeGardien();

        PetitPoucet originator = new PetitPoucet();
        originator.set(0, 0);
        originator.set(1, 1);
        angegardien.addMemento( originator.saveToMemento() );
        originator.set(2, 2);
        angegardien.addMemento( originator.saveToMemento() );
        originator.set(3, 3);

        originator.restoreFromMemento( angegardien.getMemento(1) );
    }
}


