package JavaConcepts;
/**
 * Created by pling on 03/12/2016.
 */
public class AutoParent {
    public AutoParent()
    {
        System.out.println("Inside AutoParent constructor....");
        Make="ParentMake";
    }

    public AutoParent(String _make) {
        Make= _make;

    }
      public String Make;
    //class : All the attributes/features and the actions of an entity are abstracted into fields and methods.

    private int speed;
    //Private fields is private to the class : cannot be accessed by the objects of the class

    private String model;
    // Alt+Insert can be used to set the getter setter for private String fields,
    // which helps to hide implementation details
     static int engineMaxSpeed;

    public String getModel()
    {
        return model;
    }
    //public properties acts a gate keepers to private fields. Hence private fields should not be used in methods

    public void setModel(char model) {
        switch (model) {
            //has to be byte, char, short or int
            case 'l':
                this.model = "Maruthi";
                break;
            //case 2 :
            //    Model = "Ford";
            //   break;
            default :
                this.model="zen";
                break; }

    }

    //encapsulation : process of keeping implementation details of object private
    //by making fields private ; and creating public properties
    //enables less coupling between classes, as private methods and fields not accessible outside of the class
    //enforce blackbox programming
    //enforce objects to interact each other in public interface through public fields
    //modification inside the black box will not affect the code that relies just on the interfaces of the black box
    //use Pascal casing for public e.g. Speed and Camel casing for private e.g. previousValue

    public Engine Engine;
    //class is used as datatype (custom reference type)
    public Engine createEngine(int size,int horsePower){

        return new Engine(size,horsePower);
    }

    public void setSpeed(int speed) {
        if (speed < 100) {
            this.speed = 100;
        } else if (speed > 1000) {
            this.speed = 1000;
        } else
            this.speed = speed;
    }

    public int getSpeed()
    {
        return speed;
    }
     //By using the above method and making speed private, we avoid setting speed to any negative value or unable states
    //though the implementation details is hidden to outside world

    public int accelerate()
    {
        if(speed>0 && speed<1001) {
            speed++;
            Writeline("speed is being accelerated");
        }
        else
            Writeline("Cannot be accelerated, will go beyond limits");
        return speed;
    }
    private void Writeline(String message)
    {
        System.out.println("from helper method ....");
        System.out.println(message);
    }
    // Private methods are usually called helper methods. Good practice to make calling methods private


    public String start()
    {
        String message = ("Starting from Parent Class");
        return message;
    }


    public String Stop()
    {
        String message = ("Stopping from Parent Class");
        return message;
    }



}




