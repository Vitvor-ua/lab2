package lab2;

/**
 * Class Cl1 implements the If1 interface and provides concrete implementations
 * for the methods declared in If1 and If2 interfaces.
 */
public class Cl1 implements If1 {
    If1 if1;
    If2 if2;

    /**
     * Implements meth1() from the If1 interface. This method prints a message
     * indicating that meth1 is called from Class1.
     */
    @Override
    public void meth1() {
        System.out.println("Class1: meth1");
    }

    /**
     * Implements meth2() from the If2 interface. This method prints a message
     * indicating that meth2 is called from Class1.
     */
    @Override
    public void meth2() {
        System.out.println("Class1: meth2");
    }
}



