package cajas.spring.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hi folks!!  PROPERTY";
    }

}
