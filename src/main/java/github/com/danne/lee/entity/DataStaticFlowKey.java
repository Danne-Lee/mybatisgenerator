package github.com.danne.lee.entity;

import java.util.Date;

public class DataStaticFlowKey {
    private Date collectTime;

    private String wellCode;

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    public String getWellCode() {
        return wellCode;
    }

    public void setWellCode(String wellCode) {
        this.wellCode = wellCode == null ? null : wellCode.trim();
    }
}