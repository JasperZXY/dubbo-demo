package zxy.demo.dubbo.consumer;


import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import zxy.demo.dubbo.api.domain.User;
import zxy.demo.dubbo.api.service.UserService;

public class UserServiceTest {

    private UserService userService;
    
    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:spring/appContext.xml");
        userService = applicationContext.getBean(UserService.class);
    }

    @Test
    public void testQueryAll() {
        List<User> userList = userService.queryAll();
        for(User user : userList){
            System.out.println(user.toString());
        }
    }

}
