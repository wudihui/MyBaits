package com.gaussic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by dzkan on 2016/3/8.
 */
//@Controller注解：采用注解的方式，可以明确地定义该类为处理请求的Controller类
@Controller
public class MainController {
//    @RequestMapping()用于定义一个请求映射，value为请求的url，值为 / 说明，
//    该请为求首页请求，method用以指定该请求类型，一般为get和post；
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap model) {
        return "zhuche";
//      进入zhuche页面
    }

    //  输入xxx/page/name/age可以把name和age传入name页面
    @RequestMapping(value = "/page/{name}/{age}", method = RequestMethod.GET)
    public String getName(ModelMap model, @PathVariable("name") String name, @PathVariable("age") int age) {
        model.put("name", name);
        model.put("age", age);
        return "name";
    }

    //  输入xxx/page?name=张三/age=20可以把name和age传入result页面
    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String result(ModelMap model, @RequestParam("name") String name, @RequestParam("age") int age) {
        model.put("name", name);
        model.put("age", age);
        return "result";
    }

//     输入xxx/page?name=张三/age=20可以把name和age传入result页面(同上)
    @RequestMapping(value = "/name", method = RequestMethod.POST)
    public String name(ModelMap model, @RequestParam("name") String name, @RequestParam("age") int age) {
        model.put("name", name);
        model.put("age", age);
        return "name";
    }

//    get方式写在地址栏里
//    post方式提交不写在地址栏里
//    提交的页面必须是get
    @RequestMapping(value = "/add_user", method = RequestMethod.GET)
    public String addUser(ModelMap map) {
        return "addUser";
    }
}
