public class WindFarm {
    private EngineeringModel engineeringModel;   //!Do not change this instance variable!
    private WindGenerator[] windGenerators = new WindGenerator[10];
    private int numWindGenerators = 0;


    public WindFarm(EngineeringModel engineeringModel) {
        this.engineeringModel = engineeringModel;
    }                                           //! Do not change this constructor

    public void addWindGenerator(WindGenerator windGenerator){
        if(numWindGenerators < windGenerators.length){
            windGenerators[numWindGenerators] = windGenerator;
            numWindGenerators++;
    } else {
        System.out.println("The number of wind generators is out of limit");
    }
}

    public String getGeneratorsReport (int windSpeed) {
        String StringDiscription = "";
        for (int i = 0; i < windGenerators.length; i++) {
            WindGenerator windGenerator = windGenerators[i];
            PerformanceData performanceData = engineeringModel.getPerformanceData(windSpeed, windGenerator);
            double performanceIndex = performanceData.getPerformanceIndex();
            
            StringDiscription += "Wind Generator: " + windGenerator.toString() + ", " + "Performance Index: " +performanceIndex;
        }
        return StringDiscription;
        
    }


    public WindGenerator findBestPerformer(int windSpeed) {
        if (numWindGenerators == 0) {
            System.out.println("No wind generators");
            return null;
        }

        WindGenerator bestPerformer = windGenerators[0]; 
        double bestPerformanceIndex = engineeringModel.getPerformanceData(windSpeed, bestPerformer).getPerformanceIndex();

        for (int i = 1; i < numWindGenerators; i++) {
            WindGenerator windGenerator = windGenerators[i];
            PerformanceData performanceData = engineeringModel.getPerformanceData(windSpeed, windGenerator);
            double performanceIndex = performanceData.getPerformanceIndex();

            if (performanceIndex > bestPerformanceIndex) {
                bestPerformer = windGenerator;
                bestPerformanceIndex = performanceIndex;
            }
        }

        return bestPerformer;
    }


    }

    

