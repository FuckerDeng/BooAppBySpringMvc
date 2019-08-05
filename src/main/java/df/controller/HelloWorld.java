package df.controller;

import com.alibaba.fastjson.JSONArray;
import df.servers.FictionsServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(produces = {"text/html;charset=UTF-8;","application/json;"})
public class HelloWorld {

    private Logger logger = LogManager.getLogger(HelloWorld.class);
    private volatile int requestCount = 0;
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        logger.info("收到前请求！");
        return "hello world!";
    }

    @RequestMapping("root")
    @ResponseBody
    public String root(@RequestParam(value = "id",defaultValue = "20") int id,@RequestParam(value = "name",defaultValue = "张三") String name){
        logger.info("id: "+id+" name: "+name);
        return "访问成功";
    }

    @RequestMapping("fictions")
    @ResponseBody
    public String getFiction(@RequestParam(value = "nextPage",defaultValue = "1") int nextPage,@RequestParam(value = "c",defaultValue = "20") int pageSize){
        logger.info("收到请求"+(++requestCount));
        return JSONArray.toJSON(FictionsServer.getFictions(nextPage,pageSize)).toString();
    }
}
