package dosopt.server.eqlserver.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173", "https://eql-client.vercel.app:5173","http://localhost:8080", "http://localhost:3000", "http://localhost:3001")
                .allowedMethods("OPTIONS","GET","POST","PUT","DELETE");
    }
}
