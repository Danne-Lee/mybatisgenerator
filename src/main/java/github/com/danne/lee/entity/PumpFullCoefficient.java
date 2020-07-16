package github.com.danne.lee.entity;

import java.math.BigDecimal;

public class PumpFullCoefficient extends PumpFullCoefficientKey {
    private BigDecimal fullCoefficient;

    private BigDecimal threshold;

    public BigDecimal getFullCoefficient() {
        return fullCoefficient;
    }

    public void setFullCoefficient(BigDecimal fullCoefficient) {
        this.fullCoefficient = fullCoefficient;
    }

    public BigDecimal getThreshold() {
        return threshold;
    }

    public void setThreshold(BigDecimal threshold) {
        this.threshold = threshold;
    }
}