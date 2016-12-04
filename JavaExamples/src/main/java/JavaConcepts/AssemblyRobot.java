package JavaConcepts;

/**
 * Created by pling on 03/12/2016.
 */
public class AssemblyRobot {

    //encapsulate the process of creating a car ; putting an engine and delivers a car
    //Containment : Class inside another class
    //customer belongs to the car, if a customer has 2 cars, his details will be duplicated

    public AutoWithOwnerChild AssembleCar(String model, Engine engineType, AutoCustomer customer) //custom reference type AutoParent & Engine
    {
        AutoWithOwnerChild newCar = new AutoWithOwnerChild();

        newCar.Engine= engineType;
        newCar.Customer= customer;
        return newCar;
    }

}
