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
public interface CatalogService {

    List<PmsBaseCatalog1> getCatalog1s();

    List<PmsBaseCatalog2> getCatalog2s(Integer catalog1Id);

    List<PmsBaseCatalog3> getCatalog3s(Integer catalog2Id);

}
