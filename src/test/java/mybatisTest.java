import com.ellsom.dao.employeeMapper;
import com.ellsom.pojo.employee;
import com.ellsom.service.empServiceImp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class mybatisTest {
    public static void main(String[] args) throws IOException {
        employee e=new employee("ellsom","job",1246,new SimpleDateFormat("yyyy-MM-dd").format(new Date().getTime()),1100,0,10,1246);
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        employeeMapper mapper = sqlSession.getMapper(employeeMapper.class);
        mapper.deleteEmp(1246);
        System.out.println(mapper.addEmp(e));

        System.out.println(mapper.findMgr(7788));
        sqlSession.commit();
        sqlSession.close();

    }
}
