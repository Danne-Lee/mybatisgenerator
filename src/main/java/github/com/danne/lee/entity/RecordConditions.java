package github.com.danne.lee.entity;

public class RecordConditions extends RecordConditionsKey {
    private String condName;

    public String getCondName() {
        return condName;
    }

    public void setCondName(String condName) {
        this.condName = condName == null ? null : condName.trim();
    }
}