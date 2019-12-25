package com.crui.zaizi.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.crui.zaizi.bean.PmsBaseCatalog1;
import com.crui.zaizi.bean.PmsBaseCatalog2;
import com.crui.zaizi.bean.PmsBaseCatalog3;
import com.crui.zaizi.manage.mapper.PmsBaseCatalog1Mapper;
import com.crui.zaizi.manage.mapper.PmsBaseCatalog2Mapper;
import com.crui.zaizi.manage.mapper.PmsBaseCatalog3Mapper;
import com.crui.zaizi.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * VM Args:
 *
 * @author crui
 */
@Service
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    private PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;
    @Autowired
    private PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;
    @Autowired
    private PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;


    @Override
    public List<PmsBaseCatalog1> getCatalog1s() {
        return pmsBaseCatalog1Mapper.selectAll();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2s(Integer catalog1Id) {
        Example example = new Example(PmsBaseCatalog2.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("catalog1Id", catalog1Id);

        return pmsBaseCatalog2Mapper.selectByExample(example);
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3s(Integer catalog2Id) {
        Example example = new Example(PmsBaseCatalog3.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("catalog2Id", catalog2Id);

        return pmsBaseCatalog3Mapper.selectByExample(example);
    }
}
