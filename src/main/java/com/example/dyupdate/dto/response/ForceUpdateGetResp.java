package com.example.dyupdate.dto.response;

public class ForceUpdateGetResp {
    private Integer forceUpdateVersion;
    private Integer fullUpdate;
    private String url;

    public ForceUpdateGetResp(Integer forceUpdateVersion, Integer fullUpdate, String url) {
        this.forceUpdateVersion = forceUpdateVersion;
        this.fullUpdate = fullUpdate;
        this.url = url;
    }

    public Integer getForceUpdateVersion() {
        return forceUpdateVersion;
    }

    public void setForceUpdateVersion(Integer forceUpdateVersion) {
        this.forceUpdateVersion = forceUpdateVersion;
    }

    public Integer getFullUpdate() {
        return fullUpdate;
    }

    public void setFullUpdate(Integer fullUpdate) {
        this.fullUpdate = fullUpdate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "ForceUpdateGetResp{" +
                "forceUpdateVersion=" + forceUpdateVersion +
                ", fullUpdate=" + fullUpdate +
                ", url='" + url + '\'' +
                '}';
    }
}
