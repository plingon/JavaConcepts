package JavaConceptsTest;

import JavaConcepts.AccessModifier;
import org.junit.Test;

/**
 * Created by pling on 08/12/2016.
 */
public class AccessModifierTest extends AccessModifier {
    @Test
    public void accessModifierTest()
    {

        //System.out.println(version);  version access modifier is default, so cannot be accessed from this
        //package, it has to be changed to public if it has to be accessed
        setFormat("Unicode");
        String valuex = getFormat();
        String message=String.format("format is %s",valuex);
        //public getter methods used to access private variables in class

        System.out.println(message);
        boolean speakerState= openSpeaker("Yes");
        System.out.println("Speaker state is : "+speakerState);

        AccessModifier.staticVariableValue=200;
        System.out.println("static variable value is : "+AccessModifier.staticVariableValue);
        AccessModifier am = new AccessModifier();
        AccessModifier am1 = new AccessModifier();
        AccessModifier.staticVariableValue=300;
        System.out.println("static variable latest value is : "+AccessModifier.staticVariableValue);

        System.out.println("Starting with " + AccessModifier.getCount() + " instances");

        for (int i = 0; i < 10; ++i) {
            new AccessModifier();
        }
        System.out.println("Created " + AccessModifier.getCount() + " instances");
    }
}
