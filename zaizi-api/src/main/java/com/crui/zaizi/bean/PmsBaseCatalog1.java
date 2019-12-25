package com.crui.zaizi.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;

/**
 * 一级分类表(pms_base_catalog1)
 * 
 * @author crui
 * @version 1.0.0 2019-12-25
 */
public class PmsBaseCatalog1 implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7445365028424811179L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键返回策略
    private Integer id;

    private String name;

    @Transient//不序列化
    private List<PmsBaseCatalog2> catalog2s;

    public List<PmsBaseCatalog2> getCatalog2s() {
        return catalog2s;
    }

    public void setCatalog2s(List<PmsBaseCatalog2> catalog2s) {
        this.catalog2s = catalog2s;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}