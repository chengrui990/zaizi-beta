package com.crui.zaizi.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.crui.zaizi.bean.PmsBaseAttrInfo;
import com.crui.zaizi.manage.mapper.PmsBaseAttrInfoMapper;
import com.crui.zaizi.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * VM Args:
 *
 * @author crui
 */
@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    private PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;


    @Override
    public List<PmsBaseAttrInfo> attrInfoList(Integer catalog3Id) {
        Example example = new Example(PmsBaseAttrInfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("catalog3Id", catalog3Id);

        return pmsBaseAttrInfoMapper.selectByExample(example);
    }
}
