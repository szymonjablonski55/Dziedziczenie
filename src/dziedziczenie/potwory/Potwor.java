
package dziedziczenie.potwory;


public class Potwor 
{
    public int speed = 10;
    public int power;
    
    
    public Potwor(int speed, int power)
    {
        this.speed = speed;
        this.power = power;
        
            
    }
    public void Statystki()
    {
        System.out.println("Potwor: " + "Speed: " + speed + ( " Power: " + power));
    }
}
