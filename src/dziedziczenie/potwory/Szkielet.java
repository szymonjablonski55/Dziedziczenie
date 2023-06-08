
package dziedziczenie.potwory;


public class Szkielet extends Potwor
{
    
   String typBroni;
    public Szkielet(int speed, int power, String typBroni)
    {
        super(speed, power);
        this.typBroni = typBroni;
        
    }
@Override
public void Statystki()
    {
        System.out.println("Szkielet: " + "Speed: " + speed + " Power: " + power + " Weapon: " + typBroni);
    }
}
