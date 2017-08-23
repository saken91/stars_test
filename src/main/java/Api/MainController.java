package Api;

import Entities.JsonResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/main")
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse getStarList(){
        JsonResponse response = new JsonResponse(-1, "");

        return response;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse getStar(@PathVariable int id){
        JsonResponse response = new JsonResponse(-1, "");

        return response;
    }

    @RequestMapping(method = RequestMethod.POST)
    public JsonResponse updateStar(@PathVariable int id, @PathVariable String name,
                                   @PathVariable float latitude, @PathVariable float longitude){
        JsonResponse response = new JsonResponse(-1, "");

        return response;
    }


    @RequestMapping(method = RequestMethod.GET)
    public JsonResponse deleteStar(@PathVariable int id){
        JsonResponse response = new JsonResponse(-1, "");

        return response;
    }
}