import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class EmployeeJDBC {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","mysql@1234");
            con.setAutoCommit(false);
            Statement stm = con.createStatement();
            //stm.execute("select * from payroll_details");
            stm.execute("insert into payroll_details values(1,'Amol',73667373,'Khokrale','Farmer','male',20000,2000,1000,200,18000,2020-10-22,'Nandurbar','IN');");
            stm.execute("insert into emp values (11,'Yogesh','Dhangar','Abc@123);");
        } catch (SQLException e) {
            e.printStackTrace();
            con.rollback();
        }finally {
            con.commit();
        }
    }
    }

