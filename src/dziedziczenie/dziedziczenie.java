
package dziedziczenie;

import dziedziczenie.potwory.Potwor;
import dziedziczenie.potwory.Szkielet;
import dziedziczenie.potwory.Zombie;


public class dziedziczenie {
    
    public static void main(String[] args)
    {
        Potwor p = new Potwor(10, 100);
        Szkielet s = new Szkielet(20, 80, "Kusza");
        Zombie z = new Zombie(5, 50);
        p.Statystki();
        s.Statystki();
        z.Statystki();
        
    }
    
}
