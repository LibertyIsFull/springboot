package cn.sdn.web.controller;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public void home(HttpServletResponse request, HttpServletResponse response) {
        try {
            Logger logger = LoggerFactory.getLogger(this.getClass());
            logger.info("xxxxxxxxxxx");

            response.getWriter().write("<html><body><h1 style='color:red;'>Hi World</h1></body></html>");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        Logger logger1 = LoggerFactory.getLogger(WelcomeController.class);
        org.apache.logging.log4j.Logger logger = LogManager.getLogger("mylog");
        for (int i = 0; i < 50000; i++) {
            logger.trace("trace level");
            logger.debug("debug level");
            logger.info("info level");
            logger.warn("warn level");
            logger.error("error level");
            logger.fatal("fatal level");
        }
        try {
            System.out.println("线程睡眠中!");
            Thread.sleep(1000 * 61);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");
    }
}
