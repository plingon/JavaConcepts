package JavaConcepts;

/**
 * Created by pling on 08/12/2016.
 */
public class AccessModifier {
    String version = "1.5.1";  //access modifier default, can't be accessed by class in another package

    boolean processOrder() {
        return true;
    }

    private String format;

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
    protected boolean openSpeaker(String sp) {
        // implementation details
        if(sp=="Yes")
        return true;
        else
            return false;
    }
    /*
    The static keyword is used to create variables that will exist independently of any instances created for the class.
    Only one copy of the static variable exists regardless of the number of instances of the class.
     */
    public static int staticVariableValue;

    public AccessModifier() {
        AccessModifier.addInstance();
    }
    private static int numInstances = 0;

    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }


}
