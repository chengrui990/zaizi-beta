package com.crui.zaizi.bean;
/**
 * 属性表(pms_base_attr_info)
 * 
 * @author crui
 * @version 1.0.0 2019-12-25
 */
public class PmsBaseAttrInfo implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7430071317477659060L;

    private Long id;

    private String attrName;

    private Long catalog3Id;

    private String isEnabled;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttrName() {
        return this.attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public Long getCatalog3Id() {
        return this.catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String getIsEnabled() {
        return this.isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }
}