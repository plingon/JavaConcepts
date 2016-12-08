package JavaConceptsTest;

import org.junit.Test;

/**
 * Created by pling on 05/12/2016.
 */
public class DataTypesTest {


    /**
     * Created by pling on 05/12/2016.
     */

        @Test
        public void day1test(){
// TODO Auto-generated method st/*
 /* 
            * variable : arbitrary place holder for storing data values
           * ---------
           * datatype : specifies type of data variable can store
           * ---------
           *     integer : supports only signed integers so have -ve and +ve values
            *     byte(1byte width), short(2bytes width), int(4bytes width) , long(8bytes width)
           *    
            *     character : follows unicode character set(supports all international characters of
            *     various languages such as American/Latin)that can uniquely identified by the processor
           *     width 2 bytes
           *    
            *     floating point types : represented by float and double datatypes. Used to represent
           *     numbers with decimal values. float can have 7 digits after decimal point whereas
           *     double can represent 15 digits after decimal point. float (4 bytes width) and
            *     double (8 bytes width)
           *    
            *     boolean : this dat type represents 2 logical values denoted by true or false
           *    
            *     Note : String is an in-built class in Java and not a data type
           *
            * Tokens in Java : building blocks in Java
           * ________________________________________
           *
            *     Identifier : name given to a variable . Should start with underscore, letter or dollar sign
           *     Is case sensitive for e.g age different to AGE. Spaces not allowed. Java keywords(e.g. int public etc)
           *     can't be used as identifier
           *    
            *     literal : we assign a literal value to a variable , so based on data type it can be
            *     int literal(e.g. 5) , string literal (e.g."TTC"), boolean literal( true or flase)
           *     double literal(124.34), character literal ('v')
           *    
            *     Keyword : predefined words that have specific meanings in programming language
            *     e.g. byte, int, public, enum, switch etc..
           *    
            *     Separator : parantheses () while declaring or invoking methods, Braces {} initialising arrays,
           *     brackets [] in arrays , semicolon ; terminates java statements , colon : loop labels,
           *     period . separate variable/method from an object
           *    
            *     Comments : single line comments //
           *     multi-line comments /* comments */
/*
           *     Operator : used to perform actions on variables
           *     Arithmetic operators : + - * % /
            *     Increment /decrement operators x++ = x+1
           *     int y = ++x pre-increment operator , value of x is incremented by 1 and then
           *     value assigned to y . So if initial value of x is 2, value assigned to y is 3
           *    
            *     int y = x++ post-increment operator , value assigned to y value of x is incremented by 1 .
           *     So if initial value of x is 2, value assigned to y is 2 and then value of y is incremented to 3
           *  
            *      Relational operators > < != <= >= == compare 2 operands and outcome is a boolean value i.e. true or false
           *     
            *      Boolean logical operators AND && OR || used in compound conditions and operated in boolean operands
           *      if (a==b && a==c) , if (name =="Tim" || name =="John")
           *      
            *      ?: operator e.g. String tourDescription = (tourCost>1000)?"Expensive": "Cheap";
           *      checks for a condition and if true first expression implemented else second one
           *      used to replace if else condition
            */
// below is the example to calculate netAmount
// passengerName is identifier , Preetha is string literal ,
// String is the in built class in Java, int, double etc datatypes
            // + is the concatenation operator

            String passengerName= "Preetha";
            int numberOfPassengers = 5;
            double tourCost = 2555.88;
            double earlyPaymentDiscount= 55.55;
            double netAmount ;
            netAmount = tourCost - earlyPaymentDiscount;
            System.out.println("The net amount to be paid by "+passengerName+ " is : "+ netAmount);

            //output : The net amount to be paid by Preetha is 2500.33

            //increment or decrement operator


            System.out.println("pre-increment ++i");
            int i =2;
            System.out.println("value of i first time is : "+i);
            int j=++i;

            System.out.println("value of j first time is : "+j);
            System.out.println("value of i second time is : " +i);
            System.out.println("");
            System.out.println("pre-decrement --x");
            int x =2;
            System.out.println("value of x first time is : "+x);
            int y=--x;

            System.out.println("value of y first time is : "+y);
            System.out.println("value of x second time is : " +x);
            System.out.println("");
            System.out.println("post-increment a++");
            int a =2;
            System.out.println("value of a first time is : "+a);
            int b=a++;

            System.out.println("value of b first time is : "+b);
            System.out.println("value of a second time is : " +a);
            System.out.println("");
            System.out.println("post-decrement c--");
            int c =2;
            System.out.println("value of c first time is : "+c);
            int d=c--;

            System.out.println("value of d first time is : "+d);
            System.out.println("value of c second time is : " +c);

/* Output
            * pre-increment ++i
            value of i first time is : 2
            value of j first time is : 3
            value of i second time is : 3
 
           pre-decrement --x
           value of x first time is : 2
           value of y first time is : 1
           value of x second time is : 1
 
           post-increment a++
           value of a first time is : 2
           value of b first time is : 2
           value of a second time is : 3
 
           post-decrement c--
           value of c first time is : 2
           value of d first time is : 2
           value of c second time is : 1
 
           */

            //find the biggest of 3 numbers

            int num1=2;
            int num2=4;
            int num3=6;

            if(num1>num2 && num1>num3)
            {
                System.out.println("the biggest number is : "+ num1);

            }
            else if(num2 > num3)
                System.out.println("the biggest number is : "+ num2);

            else
                System.out.println("the biggest number is : "+ num3);

//output : the biggest number is :6

//find the biggest using ?: operator and not if else
            int num4= 10;
            int num5=20;
            int big = (num4>num5)?num4:num5;

//output : the biggest number is :20
        }

    }





