public class WindGenerator {
    private int windGeneratorID;
    private GearPackage gearPackage;
    private GeneratorPackage generatorPackage;

    public WindGenerator(int windGeneratorID, GearPackage gearPackage, GeneratorPackage generatorPackage) {
        this.windGeneratorID = windGeneratorID;
        this.gearPackage = gearPackage;
        this.generatorPackage = generatorPackage;
    }

    public WindGenerator() {
    }

    public int getWindGeneratorID() {
        return windGeneratorID;
    }

    public void setWindGeneratorID(int windGeneratorID) {
        this.windGeneratorID = windGeneratorID;
    }

    public GearPackage getGearPackage() {
        return gearPackage;
    }

    public void setGearPackage(GearPackage gearPackage) {
        this.gearPackage = gearPackage;
    }

    public GeneratorPackage getGeneratorPackage() {
        return generatorPackage;
    }

    public void setGeneratorPackage(GeneratorPackage generatorPackage) {
        this.generatorPackage = generatorPackage;
    }

    @Override
    public String toString() {
        return "Wind Generator ID -- " + windGeneratorID + "; Gear Package -- " + gearPackage.toString()
                + "; Generator Package -- " + generatorPackage.toString();
    }
    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WindGenerator that = (WindGenerator) o;
        return windGeneratorID == that.windGeneratorID;
    }

    public PerformanceData getPerformanceData(int windSpeed, EngineeringModel engineeringModel){
        return engineeringModel.getPerformanceData(windSpeed, this);

    }
   
}

