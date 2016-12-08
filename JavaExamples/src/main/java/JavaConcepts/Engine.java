package JavaConcepts;

/**
 * Created by pling on 03/12/2016.
 */
public class Engine {
    public int Size;
    public int HorsePower;
    public Engine()
    {

    }

    public Engine(int Size,int HorsePower)
    {
        this.Size=Size;
        this.HorsePower=HorsePower;
    }

    public void setEngineMaxSpeed()
    {
        AutoParent.engineMaxSpeed=100;
    }
}


