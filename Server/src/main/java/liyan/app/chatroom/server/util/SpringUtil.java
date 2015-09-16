package liyan.app.chatroom.server.util;

import com.google.common.base.Preconditions;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 获取ApplicationContext
 * Created by LiYan on 2015/9/16.
 */
@Component
public class SpringUtil implements ApplicationContextAware {
    private static  ApplicationContext context = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    /**
     * 获取 ApplicationContext
     * @return ApplicationContext
     */
    public static ApplicationContext getApplicationContext(){
        Preconditions.checkNotNull(context);
        return context;
    }
}
