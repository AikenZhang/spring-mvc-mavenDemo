package com.wq.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.wq.service.index.IndexService;
import com.wq.model.index.IndexModel;
@Controller
public class IndexController {
    private IndexService indexservice=new IndexService();
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/getName",method = RequestMethod.GET)
    @ResponseBody
    public IndexModel getName(){

        return indexservice.getName();
    }
}
