package spring.rest.frankhassanabad.com.github;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * This tests out the parameters feature of Jersey and
 * REST.
 * Point your browser to http://localhost:8080/restfulspringexample/usersRegEx/someName
 * and this will return
 * <pre>
 * UserName entered was:someName
 * </pre>
 * If you point your browser to a different user name like
 * http://localhost:8080/restfulspringexample/usersRegEx/someOtherName
 * You will get
 * <pre>
 * UserName entered was:someOtherName
 * </pre>
 *
 * This differs from {@link UserNameParameter} in that
 * the username variable will only match user names that
 * begin with one upper or lower case letter and zero or more
 * alpha numeric characters and the underscore character. If a
 * user name does not match that a 404 (Not Found) response
 * will occur.
 */
@Controller
@RequestMapping("/usersRegEx")
public class UserNameParameterRegEx {

    /**
     * Called with the url of http://localhost:8080/restfulspringexample/users/{userName}
     * @param userName The userName from the URL
     * @return The string from {userName} so that you can see it
     */
    @RequestMapping(value="/{username:[a-zA-Z][a-zA-Z_0-9]*}", method= RequestMethod.GET, produces="text/plain")
    public @ResponseBody
    String getUser(@PathVariable("username") String userName) {
        return "UserName entered was:" + userName;
    }
}
