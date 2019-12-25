package com.crui.zaizi.service;

import com.crui.zaizi.bean.PmsBaseAttrInfo;
import com.crui.zaizi.bean.PmsBaseCatalog1;
import com.crui.zaizi.bean.PmsBaseCatalog2;
import com.crui.zaizi.bean.PmsBaseCatalog3;

import java.util.List;

/**
 * VM Args:
 *
 * @author crui
 */
public interface AttrService {

    List<PmsBaseAttrInfo> attrInfoList(Integer catalog3Id);
}
