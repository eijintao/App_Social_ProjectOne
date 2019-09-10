package com.xm.app.entity;

import java.util.Date;

public class Users {
    private Integer id;

    private String mobile;

    private String nickname;

    private String avatar;

    private String gender;

    private String cover;

    private String birthday;

    private String province;

    private String city;

    private String signature;

    private String occupation;

    private String type;

    private Integer level;

    private Integer exp;

    private String onlineState;

    private Integer andhorLevel;

    private Integer anchorAudioPrice;

    private Integer anchorVideoPrice;

    private Integer consumption;

    private Integer revenue;

    private Integer vipLevel;

    private Date vipExpiresAt;

    private String updatedIp;

    private Date createdAt;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public String getOnlineState() {
        return onlineState;
    }

    public void setOnlineState(String onlineState) {
        this.onlineState = onlineState == null ? null : onlineState.trim();
    }

    public Integer getAndhorLevel() {
        return andhorLevel;
    }

    public void setAndhorLevel(Integer andhorLevel) {
        this.andhorLevel = andhorLevel;
    }

    public Integer getAnchorAudioPrice() {
        return anchorAudioPrice;
    }

    public void setAnchorAudioPrice(Integer anchorAudioPrice) {
        this.anchorAudioPrice = anchorAudioPrice;
    }

    public Integer getAnchorVideoPrice() {
        return anchorVideoPrice;
    }

    public void setAnchorVideoPrice(Integer anchorVideoPrice) {
        this.anchorVideoPrice = anchorVideoPrice;
    }

    public Integer getConsumption() {
        return consumption;
    }

    public void setConsumption(Integer consumption) {
        this.consumption = consumption;
    }

    public Integer getRevenue() {
        return revenue;
    }

    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    public Integer getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(Integer vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Date getVipExpiresAt() {
        return vipExpiresAt;
    }

    public void setVipExpiresAt(Date vipExpiresAt) {
        this.vipExpiresAt = vipExpiresAt;
    }

    public String getUpdatedIp() {
        return updatedIp;
    }

    public void setUpdatedIp(String updatedIp) {
        this.updatedIp = updatedIp == null ? null : updatedIp.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}