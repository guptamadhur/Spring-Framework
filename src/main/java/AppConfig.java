import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import web.app.madhurgupta.repository.HibernateSpeakerRepositoryImpl;
import web.app.madhurgupta.repository.SpeakerRepository;
import web.app.madhurgupta.service.SpeakerService;
import web.app.madhurgupta.service.SpeakerServiceImpl;

@Configuration
@ComponentScan({"web.app.madhurgupta"})
public class AppConfig {

    @Bean(name = "speakerService")
    @Scope(value= BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//        service.setRepository(getSpeakerRepository());
        return service;
    }


    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

}
