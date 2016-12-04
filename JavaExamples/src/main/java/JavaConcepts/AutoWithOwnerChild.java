package JavaConcepts;

/**
 * Created by pling on 04/12/2016.
 */
public class AutoWithOwnerChild extends AutoParent {

    public AutoWithOwnerChild()
    {
        System.out.println("Inside AutoWithOwnerChild constructor....");

        ChildMake= "ChildMake";
    }
     //Constructor of AutoParent and AutoWithOwnerChild is called on creation of AutoWithOwnerChild Object
    //Every custom class inherits from base class System.Object which is called whenever a new operator used
    //Important event in lifecycle of object that allow to take control of intialising of object with
    //the intent of getting into valid state

    //inheritance : Properties and methods inherited from another class
    //make change in parent class and it will affect all child classes

    public AutoCustomer Customer;
    public String ChildMake;
    public void Drive()
    {
        System.out.println("inside drive without any parameters");

    }
    public void Drive(int lowLimit, int HighLimit)
    {
       String message = String.format("Speed low limit %d  and speed high limit %d",lowLimit,HighLimit);
       System.out.println(message);

    }



    @Override
    public String start()
    {
        String message = "starting from child class";
        return message;
    }

    //overriding methods in base class

    @Override
     public String Stop()
    {
        String message = "stopping from child class";
        return message;
    }

}
