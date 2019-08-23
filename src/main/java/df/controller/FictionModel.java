package df.controller;

import com.alibaba.fastjson.JSONArray;
import df.beans.costombean.ReadChapter;
import df.servers.FictionsServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(produces = {"text/html;charset=UTF-8;","application/json;"},path = "fiction")
public class FictionModel {
    private Logger logger = LogManager.getLogger(FictionModel.class);

    @RequestMapping("fictions")
    @ResponseBody
    public String fictions(@RequestParam(value = "nextPage",defaultValue = "1") int nextPage, @RequestParam(value = "c",defaultValue = "20") int pageSize){
        return JSONArray.toJSON(FictionsServer.getFictions(nextPage,pageSize)).toString();
    }

    @RequestMapping("chapter")
    @ResponseBody
    public String chapter(@RequestParam(value ="fictionid") int ficitonId, @RequestParam(value = "chapterid") int chapterId){
        System.out.println("fictionid="+ficitonId+"\tchapterid="+chapterId);
        ReadChapter readChapter = FictionsServer.getChpter(ficitonId,chapterId);
//        System.out.println(readChapter);
        return JSONArray.toJSON(readChapter).toString();
    }
}
