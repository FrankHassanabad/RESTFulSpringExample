package spring.rest.frankhassanabad.com.github;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Point your browser to http://localhost:8080/restfulspringexample/helloworld
 * and this will return
 * <pre>
 * Hello World! (From within the rest service)
 * </pre>
 */
@Controller
@RequestMapping(value="/helloworld")
public class HelloWorldResource {

    /**
     * The Java method will process HTTP GET requests from
     * the URL  http://localhost:8080/restfulspringexample/helloworld
     * The Java method will produce content identified by the MIME Media
     * type "text/plain"
     * @return A Hello World string
     */
	@RequestMapping(method=RequestMethod.GET, produces="text/plain")
    public @ResponseBody String getClichedMessage() {
        // Return some cliched textual content
        return "Hello World! (From within the rest service)";
    }
}
