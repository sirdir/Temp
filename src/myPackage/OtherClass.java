package myPackage;

/**
 * Created by sirdir on 11.04.17.
 */
public class OtherClass {
    void someMethod(){
        ClassWithProtected cp = new ClassWithProtected();
//        cp.methodPriv();
        cp.methodPackage();
        cp.methodProt();
        cp.methodPub();
    }
}