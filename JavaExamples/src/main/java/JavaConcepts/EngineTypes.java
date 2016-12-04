package JavaConcepts;

/**
 * Created by pling on 03/12/2016.
 */
public class EngineTypes {
    public static void engineOptions()
    {
        Engine V7 = new Engine();
        V7.HorsePower=7000;
        Engine V9 = new Engine();
        V9.HorsePower=9000;
        AutoParent testCar= new AutoParent();
        testCar.Engine=V7;
        System.out.println(testCar.Engine.HorsePower);
    }
}
