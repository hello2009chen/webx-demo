package com.wellong.model;

import java.io.Serializable;
import java.util.Date;


public class User implements Serializable {

    private static final long        serialVersionUID = 1L;

    private Integer                  id;

    private String                   name;

    private String                   displayName;

    private String                   appName;

    private String                   description;

    private String                   uuid;

    private String                   createdBy;

    private String                   modifiedBy;

    private Date                     gmtCreate;

    private Date                     gmtModified;

    private String                   tag;                  // 标示只有SA可操作，为避免在角色管理选择模块时一起展示

    private Integer                  groupCount;

    private Integer                  funcCount;


    /**
     * @return the funcCount
     */
    public Integer getFuncCount() {
        return funcCount;
    }

    /**
     * @param funcCount the funcCount to set
     */
    public void setFuncCount(Integer funcCount) {
        this.funcCount = funcCount;
    }


    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * @return the groupCount
     */
    public Integer getGroupCount() {
        return groupCount;
    }

    /**
     * @param groupCount the groupCount to set
     */
    public void setGroupCount(Integer groupCount) {
        this.groupCount = groupCount;
    }

    /**
     * @return the tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * @param tag the tag to set
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * @return the displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * @param displayName the displayName to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return the createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated_by() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
