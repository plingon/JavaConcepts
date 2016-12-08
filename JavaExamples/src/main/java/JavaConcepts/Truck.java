package JavaConcepts;

/**
 * Created by pling on 08/12/2016.
 */
public class Truck extends Vehicle {

    @Override
    public void start() {
        super.start();
        System.out.println("Truck starting");
    }

        public void writeline()
    {
        System.out.println("writing inside truck");
    }

}
