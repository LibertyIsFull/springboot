package cn.sdn.web.controller;

import cn.sdn.pojo.User;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.http.HttpRequest;
import org.springframework.web.HttpMediaTypeException;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther: lixiang
 * @Description:
 * @Date: Created in 14:44 2017/11/3
 * @Modified By:
 */
@RestController
@RequestMapping
public class WelcomeController {

    @GetMapping(path = "/home")
    public void home(HttpServletResponse request , HttpServletResponse response){
        try {
            response.getWriter().write("<html><body><h1 style='color:red;'>Hi World</h1></body></html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
