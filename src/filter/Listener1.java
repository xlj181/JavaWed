package filter;


import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;

import javax.servlet.http.HttpSessionBindingEvent;

@WebListener()
public class Listener1 implements  HttpSessionAttributeListener {
    public Listener1() {
    }

    public void attributeAdded(HttpSessionBindingEvent sbe) {
        System.out.println("session中添加了数据");
        String name=sbe.getName();
        String value= (String) sbe.getValue();
        System.out.println("session中添加了属性为："+name+"值为："+value);
    }

    public void attributeRemoved(HttpSessionBindingEvent sbe) {
        String name=sbe.getName();
        String value= (String) sbe.getValue();
        System.out.println("session中删除了属性为："+name+"值为："+value);
        System.out.println("session中删除了数据");
    }

    public void attributeReplaced(HttpSessionBindingEvent sbe) {
        String name=sbe.getName();
        String value= (String) sbe.getValue();
        System.out.println("session中修改了属性为："+name+"值为："+value);
        System.out.println("session中修改了数据");
    }
}
