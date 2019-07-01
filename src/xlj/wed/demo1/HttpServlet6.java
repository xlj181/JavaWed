package xlj.wed.demo1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class HttpServlet6 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String[] hobbies = req.getParameterValues("hobby");
        for(String hobby:hobbies){
           resp.getWriter().println(hobby);
        }
       /* Map<String,String[]> map=req.getParameterMap();
        Set<String> keys=map.keySet();

        for(String key:keys){
            String[] strings=map.get(key);
            resp.getWriter().println(key+"=");
            for(String value:strings){
                resp.getWriter().println(value);
            }

        }*/
    }
}
