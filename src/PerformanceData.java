public class PerformanceData {
    private double performanceIndex;
    private Status status;
    private WindGenerator windGenerator;
    
    public PerformanceData(double performanceIndex, Status status, WindGenerator windGenerator) {
        this.performanceIndex = performanceIndex;
        this.status = status;
        this.windGenerator = windGenerator;
    }
    public double getPerformanceIndex() {
        return performanceIndex;
    }
    public Status getStatus() {
        return status;
    }
    public WindGenerator getWindGenerator() {
        return windGenerator;
    }

    @Override
    public String toString() {
        return "Performance Index -- " + performanceIndex + " ; Status -- " + status + "; windGenerator -- " + windGenerator.toString();
    }
}
