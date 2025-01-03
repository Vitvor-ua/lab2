package lab2;

/**
 * Class Cl3 extends Cl1 and implements If3, providing a concrete implementation
 * for the meth3() method from If3 and overrides meth2() from Cl1.
 */
public class Cl3 extends Cl1 implements If3 {

    /**
     * Implements meth3() from the If3 interface. This method prints a message
     * indicating that meth3 is called from Class3.
     */
    @Override
    public void meth3() {
        System.out.println("Class3: meth3");
    }

    /**
     * Overrides meth2() from Cl1. This method prints a message indicating
     * that meth2 is called from Class3.
     */
    @Override
    public void meth2() {
        System.out.println("Class3: meth2");
    }
}