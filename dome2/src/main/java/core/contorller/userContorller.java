package core.contorller;

import com.alibaba.dubbo.config.annotation.Reference;
import core.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class userContorller {

    @Reference
    private UserService UserService;

    @RequestMapping("/showName")
    @ResponseBody
    public String showName(){
        return UserService.getname();
    }
}
