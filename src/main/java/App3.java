import com.cn.hl.config.SpringConfig;
import com.cn.hl.mapper.UserMapper;
import com.cn.hl.pojo.User;
import com.cn.hl.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
       /* UserMapper userMapper = ctx.getBean(UserMapper.class);
        List<User> users = userMapper.selectAll();
        System.out.println(users);*/
        UserService userService = ctx.getBean(UserService.class);
        List<User> users = userService.selectAll();
        System.out.println(users);
    }
}
