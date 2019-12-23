package com.crui.zaizi.member.bean;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * ums_member
 * 
 * @author bianj
 * @version 1.0.0 2019-12-18
 */
public class UmsMember implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 5534089644384997899L;


    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键返回策略
    private Long id;

    /** memberLevelId */
    private Long memberLevelId;

    /** username */
    private String username;

    /** password */
    private String password;

    /** nickname */
    private String nickname;

    /** phone */
    private String phone;

    /** status */
    private Integer status;

    /** createTime */
    private Date createTime;

    /** icon */
    private String icon;

    /** gender */
    private Integer gender;

    /** birthday */
    private Date birthday;

    /** city */
    private String city;

    /** job */
    private String job;

    /** personalizedSignture */
    private String personalizedSignature;

    /** sourceType */
    private Integer sourceType;

    /** integration */
    private Integer integration;

    /** growth */
    private Integer growth;

    /** luckyCount */
    private Integer luckeyCount;

    /** historyIntegration */
    private Integer historyIntegration;


    /**
     * 获取id
     * 
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置id
     * 
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取memberLevelId
     * 
     * @return memberLevelId
     */
    public Long getMemberLevelId() {
        return this.memberLevelId;
    }

    /**
     * 设置memberLevelId
     * 
     * @param memberLevelId
     */
    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    /**
     * 获取username
     * 
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * 设置username
     * 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取password
     * 
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 设置password
     * 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取nickname
     * 
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * 设置nickname
     * 
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取phone
     * 
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * 设置phone
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取status
     * 
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置status
     * 
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取createTime
     * 
     * @return createTime
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置createTime
     * 
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取icon
     * 
     * @return icon
     */
    public String getIcon() {
        return this.icon;
    }

    /**
     * 设置icon
     * 
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取gender
     * 
     * @return gender
     */
    public Integer getGender() {
        return this.gender;
    }

    /**
     * 设置gender
     * 
     * @param gender
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取birthday
     * 
     * @return birthday
     */
    public Date getBirthday() {
        return this.birthday;
    }

    /**
     * 设置birthday
     * 
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取city
     * 
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * 设置city
     * 
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取job
     * 
     * @return job
     */
    public String getJob() {
        return this.job;
    }

    /**
     * 设置job
     * 
     * @param job
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * 获取personalizedSignture
     * 
     * @return personalizedSignture
     */
    public String getPersonalizedSignture() {
        return this.personalizedSignature;
    }

    /**
     * 设置personalizedSignture
     * 
     * @param personalizedSignture
     */
    public void setPersonalizedSignture(String personalizedSignture) {
        this.personalizedSignature = personalizedSignture;
    }

    /**
     * 获取sourceType
     * 
     * @return sourceType
     */
    public Integer getSourceType() {
        return this.sourceType;
    }

    /**
     * 设置sourceType
     * 
     * @param sourceType
     */
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * 获取integration
     * 
     * @return integration
     */
    public Integer getIntegration() {
        return this.integration;
    }

    /**
     * 设置integration
     * 
     * @param integration
     */
    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    /**
     * 获取growth
     * 
     * @return growth
     */
    public Integer getGrowth() {
        return this.growth;
    }

    /**
     * 设置growth
     * 
     * @param growth
     */
    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    /**
     * 获取luckyCount
     * 
     * @return luckyCount
     */
    public Integer getLuckyCount() {
        return this.luckeyCount;
    }

    /**
     * 设置luckyCount
     * 
     * @param luckyCount
     */
    public void setLuckyCount(Integer luckyCount) {
        this.luckeyCount = luckyCount;
    }

    /**
     * 获取historyIntegration
     * 
     * @return historyIntegration
     */
    public Integer getHistoryIntegration() {
        return this.historyIntegration;
    }

    /**
     * 设置historyIntegration
     * 
     * @param historyIntegration
     */
    public void setHistoryIntegration(Integer historyIntegration) {
        this.historyIntegration = historyIntegration;
    }

}