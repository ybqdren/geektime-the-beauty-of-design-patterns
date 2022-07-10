package www.github.ybqdren.chapter3.project.auth;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * authid authkey token ts 鉴权
 *
 * @author zhao wen
 * @sice 2022/7/11
 **/

@WebServlet(urlPatterns = "/easylogin")
public class AuthLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
