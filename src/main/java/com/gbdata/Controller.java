package com.gbdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lisa.wei on 2018/11/5.
 */
@RestController
@RequestMapping("/data")
public class Controller {
    @Autowired
    private List<BeanInterface> list;

    @ResponseBody
    @RequestMapping(value = { "/solr/create" }, method = { RequestMethod.GET, RequestMethod.POST })
    public void say() {
        System.out.println("list...");
        if (null != list && 0 != list.size()) {
            for (BeanInterface bean : list) {
                System.out.println(bean.getClass().getName());
            }
        }
    }
}
