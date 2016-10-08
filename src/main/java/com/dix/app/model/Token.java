package com.dix.app.model;

import com.dix.base.common.Util;
import com.dix.app.mapper.TokenMapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.dix.base.common.Core;
import com.dix.base.common.ModelApiInterface;
import org.springframework.util.DigestUtils;

import javax.persistence.*;
import java.util.Map;
import java.util.UUID;

@Entity
@Table(name = "token", schema = "dix", catalog = "")
public class Token implements ModelApiInterface {

    public static final int STATUS_INVALID = 0;
    public static final int STATUS_VALID = 1;

    public static final int TYPE_PUBLIC = 1;
    public static final int TYPE_PRIVATE = 2;

    private Long id;
    private String token;
    private Integer type = TYPE_PUBLIC;
    private Integer status;
    private Long userId;
    private Long expireTime;
    private Long createTime;
    private Long updateTime;

    public static String makeToken()
    {
        String token = System.currentTimeMillis() + ":" + Math.random() + ":" + Math.random() + ':' + UUID.randomUUID().toString();
        return DigestUtils.md5DigestAsHex(token.getBytes());
    }

    @Id
    @Column(name = "id", nullable = false)
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "token", nullable = false, length = 99)
    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Basic
    @Column(name = "type", nullable = false)
    @JsonProperty("type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "status", nullable = false)
    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    @JsonProperty("user_id")
    public Long getUserId() { return userId; }

    public void setUserId(Long userId) { this.userId = userId; }

    @Basic
    @Column(name = "expire_time", nullable = false)
    @JsonProperty("expire_time")
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    @Basic
    @Column(name = "create_time", nullable = false)
    @JsonProperty("create_time")
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time", nullable = false)
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

        Token that = (Token) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (expireTime != null ? !expireTime.equals(that.expireTime) : that.expireTime != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (expireTime != null ? expireTime.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }

    public Long save() {
        TokenMapper tokenMapper = (TokenMapper) Core.getBean(TokenMapper.class);

        if (this.getId() == null || this.getId() == 0)
        {
            this.setCreateTime(Util.time());
            this.setUpdateTime(this.getCreateTime());
            return tokenMapper.insert(this);
        }
        else
        {
            this.setUpdateTime(Util.time());
            return tokenMapper.update(this);
        }
    }

    @Transient
    @Override
    public String[] getAttributes() {
        return new String[] {
                "id",
                "token",
                "type",
                "status",
                "user_id",
                "expire_time"
        };
    }

    @Transient
    @Override
    public String[] getBasicAttributes() {
        return new String[] {
                "id",
                "token",
                "type",
                "status",
                "user_id",
                "expire_time"
        };
    }

    @Transient
    @Override
    public String[] getDetailAttributes() {
        return new String[] {
                "id",
                "token",
                "type",
                "status",
                "user_id",
                "expire_time",
                "create_time",
                "update_time"
        };
    }

    @Override
    public Map<String, Object> processModel() {
        return this.processModel(this, null);
    }

    @Override
    public Map<String, Object> processModel(Object model) {
        return this.processModel(model, null);
    }

    @Override
    public Map<String, Object> processModel(String[] keys) {
        return this.processModel(null, keys);
    }

    @Override
    public Map<String, Object> processModel(Object model, String[] keys) {
        Map<String, Object> map = Core.processModel(model, keys);

        if (map != null)
        {

        }

        return map;
    }

    public static Map<String, Object> processModelStatic(Object model, String[] keys) {
        Map<String, Object> map = Core.processModel(model, keys);

        if (map != null)
        {

        }

        return map;
    }

    public Map<String, Object> processModelForClient(Object model, String[] keys, Object[] params) {
        Map<String, Object> map = Core.processModel(model, keys);

        if (map != null)
        {
        }

        return map;
    }
}