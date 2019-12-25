package com.crui.zaizi.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;

/**
 * pms_base_catalog2
 * 
 * @author crui
 * @version 1.0.0 2019-12-25
 */
public class PmsBaseCatalog2 implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -4863189711723297399L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键返回策略
    private Integer id;

    private String name;

    private Integer catalog1Id;

    @Transient
    private List<PmsBaseCatalog3> catalog3s;

    public List<PmsBaseCatalog3> getCatalog3s() {
        return catalog3s;
    }

    public void setCatalog3s(List<PmsBaseCatalog3> catalog3s) {
        this.catalog3s = catalog3s;
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

    public Integer getCatalog1Id() {
        return this.catalog1Id;
    }

    public void setCatalog1Id(Integer catalog1Id) {
        this.catalog1Id = catalog1Id;
    }

}