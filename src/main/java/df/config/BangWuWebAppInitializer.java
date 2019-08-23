package df.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BangWuWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    private Logger logger = LogManager.getLogger(BangWuWebAppInitializer.class);
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("执行了");
        logger.info("------root配置类初始化------");
        return new Class<?>[]{SpringConfig.class};//spring配置类
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        logger.info("------web配置类初始化------");
        return new Class<?>[]{WebConfig.class};//dispatcher类
    }

    @Override
    protected String[] getServletMappings() {
        logger.info("------映射根路径初始化------");
        return new String[]{"/"}; //将所有的请求都映射到springMVC dispatcherServlet
    }
}
