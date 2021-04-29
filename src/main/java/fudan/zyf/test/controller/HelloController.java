package fudan.zyf.test.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object sayHello(@RequestParam("name") String name,
                           @RequestParam("password") String password,
                           @RequestParam("id") String id) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", name);
        map.put("password", password);
        map.put("id", id);
        return map;
    }
}
