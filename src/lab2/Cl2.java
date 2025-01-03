package lab2;

/**
 * Class Cl2 implements the If2 interface and provides a concrete implementation
 * for the meth2() method.
 */
public class Cl2 implements If2 {
    Cl3 cl3;

    /**
     * Implements meth2() from the If2 interface. This method prints a message
     * indicating that meth2 is called from Class2.
     */
    @Override
    public void meth2() {
        System.out.println("Class2: meth2");
    }
}
