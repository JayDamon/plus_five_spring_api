package plusfive.spring_api.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import plusfive.spring_api.model.User;
import plusfive.spring_api.repository.UserRepository;

@Component
public class APIBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private UserRepository userRepository;

    public APIBootstrap(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        User user = new User("Arnold", "Alois",
                "Schwarzenegger",
                "TheTerminator@Aol.com", "IllBeBack");
        userRepository.save(user);
    }
}
