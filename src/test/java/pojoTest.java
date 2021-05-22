import com.ellsom.pojo.employee;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class pojoTest {
    @Test
    public void eee(){
        employee e=new employee("zz","job",12,new SimpleDateFormat("yyyy-MM-dd").format(new Date()),11,22,11,12);
        System.out.println(e.toString());
    }
}
