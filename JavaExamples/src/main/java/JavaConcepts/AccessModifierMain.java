package JavaConcepts;

/**
 * Created by pling on 08/12/2016.
 */
public class AccessModifierMain {
    public static void main(String[] args) {
        AccessModifier am = new AccessModifier();
        System.out.println(am.version);
        boolean speakerState= am.openSpeaker("Yes");
        AccessModifier.staticVariableValue=100;
        System.out.println("static variable value is : "+AccessModifier.staticVariableValue);
    }
}
