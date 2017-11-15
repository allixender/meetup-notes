package controllers;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

import java.util.Arrays;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Your new application is still ready."));
    }

    public Result people() {
        List<Integer> peopleList = Arrays.asList(1,2,3,4,7);
        return ok(listExample.render(peopleList));
    }

    public Result sayHello(Integer id) {
        List<Integer> peopleList = Arrays.asList(1,2,3,4,7);
        ObjectNode result = Json.newObject();
        ArrayNode jsArr = Json.newArray();
        for (Integer elem: peopleList) {
            jsArr.add(elem);
        }

        result.put("exampleField", jsArr);
        result.put("you said", id);

        return ok(result);
    }

}
