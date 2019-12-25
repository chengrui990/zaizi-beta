package com.crui.zaizi.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.crui.zaizi.bean.PmsBaseAttrInfo;
import com.crui.zaizi.bean.PmsBaseCatalog1;
import com.crui.zaizi.bean.PmsBaseCatalog2;
import com.crui.zaizi.bean.PmsBaseCatalog3;
import com.crui.zaizi.service.CatalogService;
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
public class CatalogController {
    @Reference
    private CatalogService catalogService;

    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){
        return catalogService.getCatalog1s();
    }

    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id){
        return catalogService.getCatalog2s(catalog1Id);
    }

    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(Integer catalog2Id){
        return catalogService.getCatalog3s(catalog2Id);
    }


}
