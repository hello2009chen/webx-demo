import com.wellong.dao.UserDao;
import com.wellong.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wellong on 16/4/19.
 */
public class TestDal {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/application-dal.xml");
        UserDao userDao = (UserDao) ctx.getBean("userDao");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "activity");
        map.put("uuid", "8720a0c17554452e9b45864a28c8bc11");
        List<User> list = userDao.getUserById(map);
        System.out.println(list.size());
    }
}
