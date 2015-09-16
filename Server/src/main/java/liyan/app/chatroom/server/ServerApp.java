package liyan.app.chatroom.server;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by LiYan on 2015/9/16.
 */
@Configurable
@ImportResource("classpath:applicationContext.xml")
public class ServerApp {

    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ServerApp.class,args);
    }

}
