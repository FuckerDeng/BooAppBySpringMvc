package df.dao.mappers;

import df.beans.costombean.ReadChapter;
import df.beans.dbbeans.Fiction;
import df.beans.dbbeans.FictionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FictionMapper {
    long countByExample(FictionExample example);

    int deleteByExample(FictionExample example);

    int insert(Fiction record);

    int insertSelective(Fiction record);

    List<Fiction> selectByExampleWithBLOBs(FictionExample example);

    List<Fiction> selectByExample(FictionExample example);



    int updateByExampleSelective(@Param("record") Fiction record, @Param("example") FictionExample example);

    int updateByExampleWithBLOBs(@Param("record") Fiction record, @Param("example") FictionExample example);

    int updateByExample(@Param("record") Fiction record, @Param("example") FictionExample example);

    ///下面为自己添加的方法
    ReadChapter chapter(@Param("fictionId") int fictionId,@Param("chapterId") int chapterId);

    List<Fiction> selectFromIds(List<Integer> fictionIds);

    List<Fiction> selectSameTypeFictions(@Param("typeName") String typeName);
}