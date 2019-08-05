package df.servers;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import df.beans.dbbeans.Fiction;
import df.dao.Dao;
import df.dao.mappers.FictionMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class FictionsServer {

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
}
