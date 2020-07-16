package github.com.danne.lee.entity;

public class RecordConditionsKey {
    private String wellType;

    private String condCode;

    public String getWellType() {
        return wellType;
    }

    public void setWellType(String wellType) {
        this.wellType = wellType == null ? null : wellType.trim();
    }

    public String getCondCode() {
        return condCode;
    }

    public void setCondCode(String condCode) {
        this.condCode = condCode == null ? null : condCode.trim();
    }
}