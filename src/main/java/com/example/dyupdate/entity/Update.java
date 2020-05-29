package com.example.dyupdate.entity;

import java.io.Serializable;
import java.util.Date;

public class Update implements Serializable {
    private Integer id;
    private Integer gameId;
    private Integer platform;
    private String channelId;
    private Integer forceUpdateVersion;
    private String url;
    private Integer fullUpdate;
    private Integer updateVersion;
    private Date modifyTime;

    public Update(Integer id, Integer gameId, Integer platform, String channelId, Integer forceUpdateVersion, String url, Integer fullUpdate, Integer updateVersion, Date modifyTime) {
        this.id = id;
        this.gameId = gameId;
        this.platform = platform;
        this.channelId = channelId;
        this.forceUpdateVersion = forceUpdateVersion;
        this.url = url;
        this.fullUpdate = fullUpdate;
        this.updateVersion = updateVersion;
        this.modifyTime = modifyTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Integer getForceUpdateVersion() {
        return forceUpdateVersion;
    }

    public void setForceUpdateVersion(Integer forceUpdateVersion) {
        this.forceUpdateVersion = forceUpdateVersion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getFullUpdate() {
        return fullUpdate;
    }

    public void setFullUpdate(Integer fullUpdate) {
        this.fullUpdate = fullUpdate;
    }

    public Integer getUpdateVersion() {
        return updateVersion;
    }

    public void setUpdateVersion(Integer updateVersion) {
        this.updateVersion = updateVersion;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "Update{" +
                "id=" + id +
                ", gameId=" + gameId +
                ", platform=" + platform +
                ", channelId='" + channelId + '\'' +
                ", forceUpdateVersion=" + forceUpdateVersion +
                ", url='" + url + '\'' +
                ", fullUpdate=" + fullUpdate +
                ", updateVersion=" + updateVersion +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
