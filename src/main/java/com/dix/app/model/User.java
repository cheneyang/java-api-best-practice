package com.dix.app.model;

import com.dix.base.common.CoreConfig;
import com.dix.base.model.BaseModel;
import com.dix.base.model.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.dix.base.common.Core;
import com.dix.base.common.ModelApiInterface;
import com.dix.base.common.Util;
import com.dix.app.mapper.UserMapper;

import javax.persistence.*;
import java.util.Map;

/**
 * Created by dd on 1/26/16.
 */
@Model(tableName = "user", mapper = UserMapper.class)
public class User extends BaseModel implements ModelApiInterface {
    private Long id;
    private String uid;
    private String username = "";
    private String phone = "";
    private String password = "";
    private String email = "";
    private String name = "";
    private String tel = "";
    private Integer gender = 0;
    private Long birthday = 0L;
    private String avatar = "";
    private Integer sourceId = 0;
    private Integer sourceType = 0;
    private Integer sourceClient = 0;
    private Integer weight = 0;
    private Long createTime;
    private Long updateTime;

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("tel")
    public String getTel() { return tel; }

    public void setTel(String tel) { this.tel = tel; }

    @JsonProperty("gender")
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @JsonProperty("birthday")
    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    @JsonProperty("avatar")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @JsonProperty("source_id")
    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    @JsonProperty("source_type")
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    @JsonProperty("source_client")
    public Integer getSourceClient() {
        return sourceClient;
    }

    public void setSourceClient(Integer sourceClient) {
        this.sourceClient = sourceClient;
    }

    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @JsonProperty("create_time")
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @JsonProperty("update_time")
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User that = (User) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (tel != null ? !tel.equals(that.tel) : that.tel != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (avatar != null ? !avatar.equals(that.avatar) : that.avatar != null) return false;
        if (sourceId != null ? !sourceId.equals(that.sourceId) : that.sourceId != null) return false;
        if (sourceType != null ? !sourceType.equals(that.sourceType) : that.sourceType != null) return false;
        if (sourceClient != null ? !sourceClient.equals(that.sourceClient) : that.sourceClient != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (avatar != null ? avatar.hashCode() : 0);
        result = 31 * result + (sourceId != null ? sourceId.hashCode() : 0);
        result = 31 * result + (sourceType != null ? sourceType.hashCode() : 0);
        result = 31 * result + (sourceClient != null ? sourceClient.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }

    @Override
    protected boolean beforeSave() {
        if (this.getId() == null || this.getId() == 0)
        {
            this.setCreateTime(Util.time());
            this.setUpdateTime(this.getCreateTime());
        }
        else
        {
            this.setUpdateTime(Util.time());
        }

        return super.beforeSave();
    }

    public static String[] getBasicAttrs() {
        return new String[] {
                "id",
                "username",
                "email",
                "phone",
                "name",
                "gender",
                "birthday",
                "avatar"
        };
    }

    @Override
    public String[] getAttributes() {
        return new String[] {
                "id",
                "uid",
                "username",
                "email",
                "phone",
                "password",
                "name",
                "gender",
                "birthday",
                "avatar",
                "weight",
                "create_time",
                "update_time"
        };
    }

    @Override
    public String[] getBasicAttributes() {
        return new String[] {
                "id",
                "username",
                "email",
                "phone",
                "name",
                "avatar",
        };
    }

    @Override
    public String[] getDetailAttributes() {
        return new String[] {
                "id",
                "uid",
                "username",
                "email",
                "phone",
                "name",
                "gender",
                "birthday",
                "avatar",
                "create_time",
                "update_time"
        };
    }

    @Override
    public Map<String, Object> processModel(Object model, String[] keys) {
        Map<String, Object> map = Core.processModel(model, keys);

        if (map != null)
        {

        }

        return map;
    }

    private static volatile User instance;
    public static User getInstance() {
        if (instance == null) {
            synchronized (User.class) {
                if (instance == null) {
                    instance = new User();
                }
            }
        }
        return instance;
    }

    public static User Q() {
        return getInstance();
    }
}
