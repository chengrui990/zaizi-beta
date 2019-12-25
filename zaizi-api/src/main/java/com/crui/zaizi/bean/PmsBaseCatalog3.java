package com.crui.zaizi.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * pms_base_catalog3
 * 
 * @author crui
 * @version 1.0.0 2019-12-25
 */
public class PmsBaseCatalog3 implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 5916443204163562026L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键返回策略
    private Long id;

    private String name;

    private Long catalog2Id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCatalog2Id() {
        return this.catalog2Id;
    }

    public void setCatalog2Id(Long catalog2Id) {
        this.catalog2Id = catalog2Id;
    }

}