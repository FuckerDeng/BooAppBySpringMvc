package df.controller;

import com.alibaba.fastjson.JSONArray;
import df.servers.FictionsServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Controller
@RequestMapping(produces = {"text/html;charset=UTF-8;","application/json;"},path = "home")
@ResponseBody
public class HomeModel {

    @RequestMapping("initdata")
    public String initData(){
        List<Integer> randomIds = new ArrayList<Integer>(){
            {
                Random random = new Random();
                for(int i = 0;i<13;i++){
                    Integer id = random.nextInt(5000);
                    if(this.contains(id)){
                        i--;
                        continue;
                    }
                    add(id);
                }
            }
        };
        return JSONArray.toJSON(FictionsServer.selectFromIds(randomIds)).toString();
    }
}
