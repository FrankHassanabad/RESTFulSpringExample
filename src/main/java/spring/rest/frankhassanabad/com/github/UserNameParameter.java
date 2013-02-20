package spring.rest.frankhassanabad.com.github;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * This tests out the parameters feature of Spring MVC and
 * REST.
 * Point your browser to http://localhost:8080/restfulspringexample/users/someName
 * and this will return
 * <pre>
 * UserName entered was:someName
 * </pre>
 * If you point your browser to a different user name like
 * http://localhost:8080/restfulspringexample/users/someOtherName
 * You will get
 * <pre>
 * UserName entered was:someOtherName
 * </pre>
 */
@Controller
@RequestMapping("/users")
public class UserNameParameter {

    @RequestMapping(value="/{username}", method= RequestMethod.GET, produces="text/plain")
    public @ResponseBody
    String getClichedMessage(@PathVariable("username") String userName) {
        return "UserName entered was:" + userName;
    }

}
