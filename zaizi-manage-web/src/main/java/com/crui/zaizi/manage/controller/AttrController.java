package com.crui.zaizi.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.crui.zaizi.bean.PmsBaseAttrInfo;
import com.crui.zaizi.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * VM Args:
 *
 * @author crui
 */
@Controller
@CrossOrigin
public class AttrController {
    @Reference
    private AttrService attrService;


    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(Integer catalog3Id){
        return attrService.attrInfoList(catalog3Id);
    }
}
