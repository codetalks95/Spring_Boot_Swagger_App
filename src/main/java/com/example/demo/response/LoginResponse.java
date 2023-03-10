package com.example.demo.response;

import java.util.List;

import com.example.demo.entity.LoginEntity;

public class LoginResponse {

    private Integer status;
    private String message;
    private LoginEntity loginEntity;
    private List<LoginEntity> loginEntityList;


    public LoginEntity getLoginEntity() {
        return loginEntity;
    }

    public void setLoginEntity(LoginEntity loginEntity) {
        this.loginEntity = loginEntity;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public List<LoginEntity> getLoginEntityList() {
        return loginEntityList;
    }
    public void setLoginEntityList(List<LoginEntity> loginEntityList) {
    	this.loginEntityList=loginEntityList;
    }
}
