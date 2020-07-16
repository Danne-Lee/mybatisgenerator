package github.com.danne.lee.entity;

import java.util.Date;

public class RecordFile {
    private String id;

    private String recordName;

    private String groupId;

    private String recordStorageType;

    private Long recordSize;

    private String recordPath;

    private String recordWaveformPath;

    private Date createTime;

    private String recordDesc;

    private String isResolved;

    private Long recordLength;

    private String code;

    private String conditions;

    private String orgName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName == null ? null : recordName.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getRecordStorageType() {
        return recordStorageType;
    }

    public void setRecordStorageType(String recordStorageType) {
        this.recordStorageType = recordStorageType == null ? null : recordStorageType.trim();
    }

    public Long getRecordSize() {
        return recordSize;
    }

    public void setRecordSize(Long recordSize) {
        this.recordSize = recordSize;
    }

    public String getRecordPath() {
        return recordPath;
    }

    public void setRecordPath(String recordPath) {
        this.recordPath = recordPath == null ? null : recordPath.trim();
    }

    public String getRecordWaveformPath() {
        return recordWaveformPath;
    }

    public void setRecordWaveformPath(String recordWaveformPath) {
        this.recordWaveformPath = recordWaveformPath == null ? null : recordWaveformPath.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRecordDesc() {
        return recordDesc;
    }

    public void setRecordDesc(String recordDesc) {
        this.recordDesc = recordDesc == null ? null : recordDesc.trim();
    }

    public String getIsResolved() {
        return isResolved;
    }

    public void setIsResolved(String isResolved) {
        this.isResolved = isResolved == null ? null : isResolved.trim();
    }

    public Long getRecordLength() {
        return recordLength;
    }

    public void setRecordLength(Long recordLength) {
        this.recordLength = recordLength;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions == null ? null : conditions.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }
}