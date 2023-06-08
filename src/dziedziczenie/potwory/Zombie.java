
package dziedziczenie.potwory;


public class Zombie extends Potwor
{

  
    public Zombie (int speed, int power)
    {
        super(speed, power);
        
    }
    
    @Override
    public void Statystki()
    {
        System.out.println("Zombie: " + "Speed: " + speed + ( " Power: " + power));
    }
}
