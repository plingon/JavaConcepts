package JavaConceptsTest;

import JavaConcepts.*;
import org.junit.Test;

/**
 * Created by pling on 03/12/2016.
 */
public class ConceptsTest {

    @Test    //Ctrl+Shift+F10 to run the test
    public void classTest() {
        AutoParent Car = new AutoParent();
        //instantiation : process by which an object of a class is created. Object : Instance of a class
        //car is reference variable or pointer in memory to the new car object created
        //car the pointer or reference variable stored in memory stack & address of memory location of object stored in heap
        //keyword new is like a cookie cutter creating new instances of classes i.e. objects in memory
        //()paranthesis is used because it implicity calls the constructor method, used to initialise the object before using it

        Car.setModel('z');  //Ctrl+B to go to declaration //switch case we can pass int,char,byte
        System.out.println("Model is : " + Car.getModel());
        //Only public methods & properties of class can be accessed by the object
        // car.Engine is accessible but car.speed, car.model and or car.WriteLine() is not accessible
        // as speed & model are private fields and WriteLine is a private or helper method

        Car.setSpeed(50);
        int currentSpeed = Car.getSpeed();
        System.out.println("speed now is : " + currentSpeed);
        Car.accelerate();
        currentSpeed = Car.getSpeed();
        System.out.println("speed after accelerating is : " + currentSpeed);


        //Engine V4= new Engine();
        //V4.HorsePower=4000;

        Engine V6 = new Engine();
        V6.HorsePower = 6000;
        Car.createEngine(10, 1000);

        Car.Engine = V6;
        System.out.println("My car Power is " + String.valueOf(Car.Engine.HorsePower));

        //relation between car & engine is called Aggregation.
        // Car object aggregates other objects like Engine
        //Even if 1000 car objects has Engine V4 , only one V4 engine is stored in memory

        AutoCustomer customer = new AutoCustomer();
        customer.FirstName = "Preetha";

        AssemblyRobot PreethaRobot = new AssemblyRobot();

        //Class within class called containment. Every car ahs an owner.If a customer has 2 cars his details will be duplicated
        AutoWithOwnerChild PreethaCar = PreethaRobot.AssembleCar("Zen", V6, customer);
        System.out.println("Newly assembled car engine Power : " + PreethaCar.Engine.HorsePower);
        System.out.println("Newly assembled car owner : " + PreethaCar.Customer.FirstName);
        System.out.println();


        AutoWithOwnerChild CarInherited = new AutoWithOwnerChild();
        //Constructor of AutoParent and AutoWithOwnerChild is called on creation of AutoWithOwnerChild Object
        //Every custom class inherits from base class System.Object which is called whenever a new operator used
        CarInherited.createEngine(20, 2000);
        CarInherited.setSpeed(156);
        CarInherited.setModel('l');
        System.out.println("Inherited car speed is : " + CarInherited.getSpeed());
        System.out.println("Inherited car model is : " + CarInherited.getModel());

        //calling classes overriden methods in child class
        System.out.println(Car.start());
        System.out.println(CarInherited.start());
        System.out.println(CarInherited.Stop());

        // initialising values inside Constructor
        System.out.println("parent Make from child class " + CarInherited.Make);
        System.out.println("child Make from child class " + CarInherited.ChildMake);
        System.out.println("parent make from parent class " + Car.Make);
        //Child class field cannot accessed by Child class for e.g Car.ChildMake is not possible

        //methods overloaded :
        CarInherited.Drive(30, 90);

        //constructor overloaded
        //value of make passed while creation
        AutoParent ConstructorOverloaded = new AutoParent("ConstructorMake");
        System.out.println("Object make passed via constructor : " + ConstructorOverloaded.Make);

        AutoParent ChildConstructorOverloaded = new AutoParent("ChildConstructorMake");
        System.out.println("Object make passed via constructor : " + ChildConstructorOverloaded.Make);

        /*
        Enums restrict a variable to have one of only a few predefined values. The values in this enumerated list are called enums.
        With the use of enums it is possible to reduce the number of bugs in our code.

        For example, if we consider an application for a fresh juice shop,
        it would be possible to restrict the glass size to small, medium, and large.
        This would make sure that it would not allow anyone to order any size other than small, medium, or large.
         */

        /*
        package JavaConcepts;

        public class FreshJuice {
        public enum FreshJuiceSizes {SMALL,MEDIUM,LARGE}
        public JavaConcepts.FreshJuice.FreshJuiceSizes size;
         public static String JuiceType;
        }

        */
        /*
        Class variables also known as static
        variables are declared with the static keyword in a class, but outside a method, constructor or a block.
         */

        FreshJuice lemonade = new FreshJuice();
        lemonade.size = FreshJuice.FreshJuiceSizes.MEDIUM;
        String juiceMessage = String.format("Juice size %s was selected", lemonade.size);
        System.out.println(juiceMessage);
        FreshJuice.JuiceType = "lemonade";
        String juiceTypeMessage = String.format("Juice type %s was selected", FreshJuice.JuiceType);
        System.out.println(juiceTypeMessage);

        String name = "James";
         /*
         This operator is used only for object reference variables.
         The operator checks whether the object is of a particular type (class type or interface type).

          */
        // following will return true since name is type of String
        boolean result = name instanceof String;
        System.out.println("Usage of instanceof Operator : " + result);


        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.print("testing break statement : " + x);
            System.out.print("\n");
        }
        System.out.println("came out of loop because of break");

        String[] names = {"Tom","Tim","Jim","Kim"};

        for (String nameNew : names) {
            if (nameNew=="Jim") {
                break;
            }
            System.out.print("testing break statement : " + nameNew);
            System.out.print("\n");
        }
        System.out.println("came out of loop second time because of break");

        int [] numbers1 = {10, 20, 30, 40, 50};

        /*
        In a for loop, the continue keyword causes control to immediately jump to the update statement.
        In a while loop or do/while loop, control immediately jumps to the Boolean expression
         */

        for(int x : numbers1 ) {
            if( x == 30 ) {
                continue;
            }
            System.out.print( "testing continue statement : "+x );
            System.out.print("\n");
        }

        Integer numX= 5;
        System.out.println(numX.byteValue());

        System.out.println("numX byte value is : "+numX.byteValue() ); //5
        System.out.println("numX long value is : "+numX.longValue()); //5
        System.out.println("numX double value is : "+numX.doubleValue() );  //5.0
        //System.out.println("numX byte value is : "+ );


        //integer.compareTo
        /*
        If the Integer is equal to the argument then 0 is returned.
If the Integer is less than the argument then -1 is returned.
If the Integer is greater than the argument then 1 is returned.
         */

        Integer numY = 5;

        System.out.println(numY.compareTo(3)); //1
        System.out.println(numY.compareTo(5)); //0
        System.out.println(numY.compareTo(8)); //-1

        //System.out.println(x.equals(a));
    }
}
