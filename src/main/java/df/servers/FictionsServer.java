package df.servers;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import df.beans.costombean.ReadChapter;
import df.beans.dbbeans.Chapter;
import df.beans.dbbeans.Fiction;
import df.dao.Dao;
import df.dao.mappers.ChapterMapper;
import df.dao.mappers.FictionMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FictionsServer {

    /**
     * 根据页数和每页数量多少获取小说列表
     * @param pageNum 第几页
     * @param pageSize 每页的查询数量
     * @return
     */
    public static List<Fiction> getFictions(int pageNum,int pageSize){
        SqlSession sqlSession = Dao.getSqlSession();
        List<Fiction> fictions = null;
        try {
            FictionMapper mapper = sqlSession.getMapper(FictionMapper.class);
            Page<Object> page = PageHelper.startPage(pageNum,pageSize,"id");
            fictions = mapper.selectByExample(null);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return fictions;
    }

    /**
     * 根据小说id和章节id获取章节内容
     * @param fictionId 小说id
     * @param chapterId 章节id
     * @return
     */
    public static ReadChapter getChpter(int fictionId, int chapterId){
        SqlSession sqlSession = Dao.getSqlSession();
        ReadChapter chapter = null;
        try {
            FictionMapper mapper = sqlSession.getMapper(FictionMapper.class);
            chapter = mapper.chapter(fictionId, chapterId);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return chapter;
    }

    /**
     * 根据给定小说id集合进行查询
     * @param randomIds 小说id集合
     * @return
     */
    public static List<Fiction> selectFromIds(List<Integer> randomIds){
        SqlSession sqlSession = Dao.getSqlSession();
        List<Fiction> initFictions = null;

        try {
            FictionMapper mapper = sqlSession.getMapper(FictionMapper.class);
            initFictions = mapper.selectFromIds(randomIds);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return initFictions;
    }


    /**
     * 获取小说最后一章的章节信息
     * @param fictionId 小说id
     * @return
     */
    public static Chapter lastChapter(Integer fictionId){
        SqlSession sqlSession = Dao.getSqlSession();
        Chapter lastChapter = null;

        try {
            ChapterMapper mapper = sqlSession.getMapper(ChapterMapper.class);
            lastChapter = mapper.selectLastChapter(fictionId);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return lastChapter;
    }

    public static List<Chapter> allChapters(Integer fictionId){
        SqlSession sqlSession = Dao.getSqlSession();
        List<Chapter> allChapters = null;

        try {
            ChapterMapper mapper = sqlSession.getMapper(ChapterMapper.class);
            allChapters = mapper.selectAllChapters(fictionId);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return allChapters;
    }

    public static List<Fiction> sameTypeFictions(String typeName){
        SqlSession sqlSession = Dao.getSqlSession();
        List<Fiction> sameTypeFictions = null;

        try {
            FictionMapper mapper = sqlSession.getMapper(FictionMapper.class);
            sameTypeFictions = mapper.selectSameTypeFictions(typeName);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return sameTypeFictions;
    }
}
