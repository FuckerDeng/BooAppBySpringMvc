package df.controller;

import com.alibaba.fastjson.JSONArray;
import df.beans.costombean.ReadChapter;
import df.beans.dbbeans.Chapter;
import df.beans.dbbeans.Fiction;
import df.servers.FictionsServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;
import java.util.stream.Collectors;

@Controller
@RequestMapping(produces = {"text/html;charset=UTF-8;","application/json;"},path = "fiction")
@ResponseBody
public class FictionModel {
    private Logger logger = LogManager.getLogger(FictionModel.class);

    @RequestMapping("fictions")
    public String fictions(@RequestParam(value = "nextPage",defaultValue = "1") int nextPage, @RequestParam(value = "c",defaultValue = "20") int pageSize){
        return JSONArray.toJSON(FictionsServer.getFictions(nextPage,pageSize)).toString();
    }

    /**
     * 获取章节内容
     * @param ficitonId 小说id
     * @param chapterId 章节id
     * @param needPreAndNext 是否需要查询前后章节内容：1是 0否
     * @return
     */
    @RequestMapping("chapter")
    public String chapter(@RequestParam(value ="fictionid") int ficitonId, @RequestParam(value = "chapterid" ) int chapterId,@RequestParam(value = "needpreandnext") int needPreAndNext){
        System.out.println("fictionid="+ficitonId+"\tchapterid="+chapterId);
        ReadChapter preChapter = null;
        ReadChapter nextChapter = null;
        if(needPreAndNext==1){
            preChapter = FictionsServer.getChpter(ficitonId,chapterId-1);
            nextChapter = FictionsServer.getChpter(ficitonId,chapterId+1);
        }
        ReadChapter nowChapter = FictionsServer.getChpter(ficitonId,chapterId);

        List<ReadChapter> readChapters = new ArrayList<>();
        if(preChapter!=null) readChapters.add(preChapter);
        if(nowChapter!=null) readChapters.add(nowChapter);
        if(nextChapter!=null) readChapters.add(nextChapter);

        System.out.println(JSONArray.toJSON(readChapters).toString());
        return JSONArray.toJSON(readChapters).toString();
    }

    @RequestMapping("detailpage")
    public String detailPageFictions(@RequestParam(value = "showfictionid") int showFictionId){
        if(showFictionId<=0){
            return null;
        }
        Random random = new Random();
        List<Integer> randomIds = new ArrayList<Integer>(){
            {
                for(int i = 0;i<2;i++){
                    Integer id = random.nextInt(5000);
                    if(this.contains(id) || id==showFictionId){
                        i--;
                        continue;
                    }
                    add(id);
                }
            }
        };
        randomIds.add(showFictionId);

        List<Fiction> fictions = FictionsServer.selectFromIds(randomIds);
        Chapter lastChapter = FictionsServer.lastChapter(showFictionId);

        String showFictionType="";
        for(Fiction f:fictions){
            if(f.getId().equals(showFictionId)){
                showFictionType = f.getFictiontype();
            }
        }
        List<Fiction> sameTypeFictions = FictionsServer.sameTypeFictions(showFictionType);
        sameTypeFictions =  sameTypeFictions.stream().limit(6).collect(Collectors.toList());
        Map<String,Object> result = new HashMap<>();
        result.put("ficitons",fictions);
        result.put("lastChapter",lastChapter);
        result.put("sameTypeFictions",sameTypeFictions);
        return  JSONArray.toJSON(result).toString();
    }

    @RequestMapping("chapterlist")
    public String chapterlist(@RequestParam(value = "fictionid") int fictionId){
        return JSONArray.toJSON(FictionsServer.allChapters(fictionId)).toString();
    }
}
