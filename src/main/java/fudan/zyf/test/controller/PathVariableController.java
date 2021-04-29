package fudan.zyf.test.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PathVariableController {

    @CrossOrigin
    @GetMapping("/test/{type}")
    public String pathVariableTest(@PathVariable String type){
        switch (type){
            case "red":
                return "颜色是红的";
            case "blue":
                return "颜色是蓝的";
            default:return "没有颜色";
        }

    }
}
