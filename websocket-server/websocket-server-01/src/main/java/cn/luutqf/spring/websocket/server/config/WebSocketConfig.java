package cn.luutqf.spring.websocket.server.config;

//import cn.zhenyang.socket.server.handler.MyHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 *
 * @Author ZhenYang
 * @Date Created in 2018/1/31 9:13
 * @Description
 * 使用@ServerEndpoint创立websocket endpoint
 * 首先要注入 ServerEndpointExporter，
 * 这个bean会自动注册使用了 @ServerEndpoint 注
 * 解声明的 Web Socket endpoint。
 * 要注意，如果使用独立的 Servlet 容器，
 * 而不是直接使用 Spring Boot 的内置容器，
 * 就不要注入 ServerEndpointExporter，
 * 因为它将由容器自己提供和管理
 */
@Configuration
//@EnableWebSocket
//public class WebSocketConfig implements WebSocketConfigurer {
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter(){
        return new ServerEndpointExporter();
    }
//@Override
//public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//    registry.addHandler(myHandler(),"/websocket")
//            .addInterceptors(new HttpSessionHandshakeInterceptor())
//    ;
//}
//    @Bean
//    public WebSocketHandler myHandler(){
//        return new MyHandler();
//    }
}
