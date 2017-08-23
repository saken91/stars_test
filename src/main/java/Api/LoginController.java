package Api;

import Entities.JsonResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse auth(@PathVariable String login, @PathVariable String pwd){
        JsonResponse response = new JsonResponse(-100, "Неверный логин или пароль");

        if (login == "admin" && pwd == "123"){
            response = new JsonResponse(0, "Операция выполнена успешно");
        }
        return response;
    }
}
