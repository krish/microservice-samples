package lk.codelabs.echoservice.controller;

import com.google.gson.JsonObject;
import lk.codelabs.echoservice.service.EchoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 10-February-2020 14:03
 * @Project echo-service
 */
@RestController
public class EchoController {

    @Autowired
    EchoServiceImpl echoService;

@RequestMapping("echo")
public String echo(@RequestBody String jsondata){
    return echoService.echoJson(jsondata);

}



}
