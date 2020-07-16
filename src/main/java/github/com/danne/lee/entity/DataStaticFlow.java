package github.com.danne.lee.entity;

public class DataStaticFlow extends DataStaticFlowKey {
    private Float staticFlow;

    private Float threshold;

    private Float staticLoads;

    public Float getStaticFlow() {
        return staticFlow;
    }

    public void setStaticFlow(Float staticFlow) {
        this.staticFlow = staticFlow;
    }

    public Float getThreshold() {
        return threshold;
    }

    public void setThreshold(Float threshold) {
        this.threshold = threshold;
    }

    public Float getStaticLoads() {
        return staticLoads;
    }

    public void setStaticLoads(Float staticLoads) {
        this.staticLoads = staticLoads;
    }
}