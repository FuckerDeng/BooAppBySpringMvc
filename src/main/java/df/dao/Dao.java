package df.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Dao {
    private static Logger logger = LogManager.getLogger(Dao.class);
    static SqlSessionFactory factory = null;

    static {
        try {
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//            String path = System.getProperty("user.dir")+ File.separator+"config"+File.separator+"mybatis.xml";
            String path = Dao.class.getResource("/").getPath()+"mybatis.xml";
            InputStream is = new FileInputStream(new File(path));
            factory = builder.build(is);
        }catch (Exception e){
            logger.info("dao init failed",e);
        }
    }

    public static SqlSession getSqlSession(){
        return factory.openSession();
    }

    public static void closeSession(SqlSession sqlSession){
        sqlSession.close();
    }
}
