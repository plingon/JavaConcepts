package JavaConceptsTest;

import JavaConcepts.*;
import org.junit.Test;

/**
 * Created by pling on 03/12/2016.
 */
public class ClassTest {

    @Test    //Ctrl+Shift+F10 to run the test
    public void classTest()
    {
        AutoParent Car= new AutoParent();
        //instantiation : process by which an object of a class is created. Object : Instance of a class
        //car is reference variable or pointer in memory to the new car object created
        //car the pointer or reference variable stored in memory stack & address of memory location of object stored in heap
        //keyword new is like a cookie cutter creating new instances of classes i.e. objects in memory
        //()paranthesis is used because it implicity calls the constructor method, used to initialise the object before using it

        Car.setModel('z');  //Ctrl+B to go to declaration //switch case we can pass int,char,byte
        System.out.println("Model is : "+Car.getModel() );
        //Only public methods & properties of class can be accessed by the object
        // car.Engine is accessible but car.speed, car.model and or car.WriteLine() is not accessible
        // as speed & model are private fields and WriteLine is a private or helper method

        Car.setSpeed(50);
        int currentSpeed = Car.getSpeed();
        System.out.println("speed now is : "+currentSpeed );
        Car.accelerate();
        currentSpeed = Car.getSpeed();
        System.out.println("speed after accelerating is : "+currentSpeed );


        //Engine V4= new Engine();
        //V4.HorsePower=4000;

        Engine V6= new Engine();
        V6.HorsePower=6000;
        Car.createEngine(10,1000);

        Car.Engine= V6;
        System.out.println("My car Power is "+ String.valueOf(Car.Engine.HorsePower));

        //relation between car & engine is called Aggregation.
        // Car object aggregates other objects like Engine
        //Even if 1000 car objects has Engine V4 , only one V4 engine is stored in memory

        AutoCustomer customer= new AutoCustomer();
        customer.FirstName="Preetha";

        AssemblyRobot PreethaRobot = new AssemblyRobot();

        //Class within class called containment. Every car ahs an owner.If a customer has 2 cars his details will be duplicated
        AutoWithOwnerChild PreethaCar= PreethaRobot.AssembleCar("Zen",V6,customer);
        System.out.println("Newly assembled car engine Power : "+ PreethaCar.Engine.HorsePower);
        System.out.println("Newly assembled car owner : "+ PreethaCar.Customer.FirstName);
        System.out.println();


        AutoWithOwnerChild CarInherited= new AutoWithOwnerChild();
        //Constructor of AutoParent and AutoWithOwnerChild is called on creation of AutoWithOwnerChild Object
        //Every custom class inherits from base class System.Object which is called whenever a new operator used
        CarInherited.createEngine(20,2000);
        CarInherited.setSpeed(156);
        CarInherited.setModel('l');
        System.out.println("Inherited car speed is : "+CarInherited.getSpeed());
        System.out.println("Inherited car model is : "+CarInherited.getModel());

        //calling classes overriden methods in child class
        System.out.println(Car.start());
        System.out.println(CarInherited.start());
        System.out.println(CarInherited.Stop());

        // initialising values inside Constructor
        System.out.println("parent Make from child class "+CarInherited.Make);
        System.out.println("child Make from child class "+CarInherited.ChildMake);
        System.out.println("parent make from parent class "+Car.Make);
        //Child class field cannot accessed by Child class for e.g Car.ChildMake is not possible

        //methods overloaded :
        CarInherited.Drive(30,90);

        //constructor overloaded
        //value of make passed while creation
        AutoParent ConstructorOverloaded = new AutoParent("ConstructorMake");
        System.out.println("Object make passed via constructor : "+ConstructorOverloaded.Make);

        AutoParent ChildConstructorOverloaded = new AutoParent("ChildConstructorMake");
        System.out.println("Object make passed via constructor : "+ChildConstructorOverloaded.Make);

        /*
        package JavaConcepts;

        public class FreshJuice {
        public enum FreshJuiceSizes {SMALL,MEDIUM,LARGE}
        public JavaConcepts.FreshJuice.FreshJuiceSizes size;
        }

        */

         FreshJuice lemonade = new FreshJuice();
         lemonade.size= FreshJuice.FreshJuiceSizes.MEDIUM;
         String juiceMessage = String.format("Juice size %s was selected",lemonade.size);
        System.out.println(juiceMessage);

    }
}
