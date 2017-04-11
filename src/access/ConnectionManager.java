package access;

/**
 * Created by sirdir on 11.04.17.
 */
public class  ConnectionManager {
    int iterator = 0;
    private static int numOfConnection = 6;
    Connection[] array;

    public ConnectionManager(int magicNumber){
        this.numOfConnection = magicNumber;
        array = new Connection[numOfConnection];
        for (int i = 0; i < numOfConnection; i++) {
            array[i] = new Connection(i*5);
        }
    }

    public static int getNumOfCon() {
        return numOfConnection;
    }

    public Connection getConnection() {
        return iterator++ < numOfConnection ? array[iterator-1] : null;
    }

}