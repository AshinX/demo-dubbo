package serviceImpl;

import org.springframework.stereotype.Service;
import service.DemoService;


@Service("demoService")
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return name;
    }
}
