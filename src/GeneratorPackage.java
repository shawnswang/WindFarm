public class GeneratorPackage {
    private GeneratorModel generatorModel;
    private String manufactureDate;
    
    public GeneratorPackage(GeneratorModel generatorModel, String manufactureDate) {
        this.generatorModel = generatorModel;
        this.manufactureDate = manufactureDate;
    }
    
    public GeneratorModel getGeneratorModel() {
        return generatorModel;
    }
    
    public String getManufactureDate() {
        return manufactureDate;
    }
    @Override
    public String toString() {
        
        return "Generator Model: "+ generatorModel + "Manufacture Date: " + manufactureDate;
    }
    
}
