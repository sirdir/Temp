import access.Connection;
import access.ConnectionManager;

/**
 * Created by sirdir on 11.04.17.
 */
public class Main {
    public static void main(String[] args){
        ConnectionManager cm = new ConnectionManager(5);

        for (int i = 0; i < ConnectionManager.getNumOfCon() +1; i++) {
            Connection con = cm.getConnection();
            System.out.println(con != null ? con.innerNum : null);
        }
    }
}
