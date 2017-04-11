import myPackage.ClassWithProtected;

/**
 * Created by sirdir on 11.04.17.
 */
public class ChildOfProtected extends ClassWithProtected {
    public void someMeth(){
//        methodPriv();
//        methodPackage();
        methodProt();
        methodPub();
    }
}
