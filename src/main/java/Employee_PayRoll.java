import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee_PayRoll {
    public static boolean getData(){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Addressbook_service","root","mysql@1234");
            Statement stm = con.createStatement();
            stm.execute("insert into addressbook values('Amol','Dhangar','khokrale','Nandurbar','MH','Abc@@1233,5652442,6753552,'Brother','yogesh');");

        } catch (SQLException e) {
           e.printStackTrace();
        }
        return true;
    }
}
