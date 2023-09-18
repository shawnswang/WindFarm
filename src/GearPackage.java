public class GearPackage {
    private GearModel gearModel;
    private double gearingRatio;

    public GearPackage(GearModel gearModel, double gearingRatio) {
        this.gearModel = gearModel;
        this.gearingRatio = gearingRatio;
    }

    public GearModel getGearModel() {
        return gearModel;
    }

    public double getGearingRatio() {
        return gearingRatio;
    }
    @Override
    public String toString() {
        return "Gear Model is " + gearModel + " Gearing Ratio is " + gearingRatio;
    }

}
