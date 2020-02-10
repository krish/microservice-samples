package lk.codelabs.echoservice.service;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.stereotype.Service;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 10-February-2020 13:52
 * @Project echo-service
 */
@Service
public class EchoServiceImpl {




    public String echoJson(String jsonData){


        JsonObject jsonObject=new JsonParser().parse(jsonData).getAsJsonObject();


        String addition="{\"status\":\"response\"}";
        JsonElement jsonElement= new JsonParser().parse(addition);
        jsonObject.add("status", jsonElement);

        return jsonObject.toString();
    }
}
