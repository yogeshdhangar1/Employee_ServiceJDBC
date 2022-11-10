import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {
    @Test
    public void AddEmployeeToDb(){
        Employee_PayRoll obj = new Employee_PayRoll();
        Assert.assertEquals(true,obj.getData());
    }
}
