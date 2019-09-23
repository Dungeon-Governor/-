package core.servicelmpl;

import com.alibaba.dubbo.config.annotation.Service;
import core.service.UserService;

@Service
public class UserServicelmpl implements UserService {
    @Override
    public String getname() {
        return "abc";
    }
}
