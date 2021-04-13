package com.alin.swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * User
 *
 * @author 李钰林
 * @date 2021/4/13
 */
//给实体类加api说明
@ApiModel("用户实体类")
public class User {
    @ApiModelProperty("用户id")
    private Integer uid;
    @ApiModelProperty("用户名")
    private String username;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
