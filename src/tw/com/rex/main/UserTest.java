package tw.com.rex.main;

import tw.com.rex.service.user.User;
import tw.com.rex.service.user.UserWebService;
import tw.com.rex.service.user.UserWebServiceImplService;

/**
 * @author Rex
 */
public class UserTest {

    public static void main(String[] args) {
        UserWebService service = new UserWebServiceImplService().getUserWebServiceImplPort();
        UserTest test = new UserTest();
        test.insert(service);
    }

    public void insert(UserWebService service) {
        User user = new User();
        user.setAddress("address");
        user.setEmail("email");
        user.setMobile("0912345678");
        user.setName("real name");
        user.setPassword("pwd");
        user.setUsername("username");
        System.out.println(service.insert(user));
    }

}
