public class Start {
    public static void main(String[] args) {

        /*
         * Wind Generator 1 objects: ID=1;
         * Gear Model: Quixote, Gearing Ration:1.5
         * Generator Model:Shockington4, Manufacte data:2021Jun
         */

        GearPackage gearPackage1 = new GearPackage(GearModel.CYCLONE3, 1.5);
        GeneratorPackage generatorPack1 = new GeneratorPackage(GeneratorModel.SHOCKINGTON4, "2021Jun");
        WindGenerator windGenerator1 = new WindGenerator(1, gearPackage1, generatorPack1);

        /*
         * Wind Generator 2 objects: ID=2;
         * Gear Model: Quixote, Gearing Ration:2.5
         * Generator Model:Spark1000, Manufacte data:2020May
         */

        WindGenerator windGenerator2 = new WindGenerator();
        windGenerator2.setWindGeneratorID(2);

        GearPackage gearPackage2 = new GearPackage(GearModel.QUIXOTE7, 2.5);
        windGenerator2.setGearPackage(gearPackage2);

        GeneratorPackage generatorPackage2 = new GeneratorPackage(GeneratorModel.SPARK1000, "2022May");
        windGenerator2.setGeneratorPackage(generatorPackage2);

        /*
         * Wind Generator 3 objects: ID=3;
         * Gear Model: WINDJAMMER1, Gearing Ration:3.5
         * Generator Model:THUNDERBOLT7, Manufacte data:2023Mar
         */
        WindGenerator windGenerator3 = new WindGenerator();
        windGenerator3.setWindGeneratorID(3);

        GearPackage gearPackage3 = new GearPackage(GearModel.WINDJAMMER1, 3.5);
        windGenerator2.setGearPackage(gearPackage3);

        GeneratorPackage generatorPackage3 = new GeneratorPackage(GeneratorModel.THUNDERBOLT7, "2023Mar");
        windGenerator2.setGeneratorPackage(generatorPackage2);
        /*
         * Wind Generator 4 objects: ID=4;
         * Gear Model: CYCLONE3, Gearing Ration:3.5
         * Generator Model:THUNDERBOLT7, Manufacte data:2023May
         */
        WindGenerator windGenerator4 = new WindGenerator();
        windGenerator3.setWindGeneratorID(4);

        GearPackage gearPackage4 = new GearPackage(GearModel.CYCLONE3, 3.5);
        windGenerator4.setGearPackage(gearPackage4);

        GeneratorPackage generatorPackage4 = new GeneratorPackage(GeneratorModel.THUNDERBOLT7, "2023May");

        /*
         * Wind Generator 5 objects: ID=5;
         * Gear Model: WINDJAMMER1, Gearing Ration:5
         * Generator Model:SHOCKINGTON4, Manufacte data:2023July
         */
        WindGenerator windGenerator5 = new WindGenerator();
        windGenerator5.setWindGeneratorID(5);

        GearPackage gearPackage5 = new GearPackage(GearModel.WINDJAMMER1, 5);
        windGenerator2.setGearPackage(gearPackage5);

        GeneratorPackage generatorPackage5 = new GeneratorPackage(GeneratorModel.SHOCKINGTON4, "2023July");
        windGenerator2.setGeneratorPackage(generatorPackage5);

        WindFarm windFarm = new WindFarm(new EngineeringModelsStub());

        windFarm.addWindGenerator(windGenerator1);
        windFarm.addWindGenerator(windGenerator2);
        windFarm.addWindGenerator(windGenerator3);
        windFarm.addWindGenerator(windGenerator4);
        windFarm.addWindGenerator(windGenerator5);

        // windFarm.getGeneratorsReport(5);

        // check if it is equal to windgenerator1 and 2
        System.out.println("Generator 1: " + windGenerator1);
        System.out.println("Generator 2: " + windGenerator2);
        System.out.println("Are the generators equal? " + windGenerator1.equals(windGenerator2));

        int[] windSpeeds = { 5, 25, 45 };
        for (int speed : windSpeeds) {
            WindGenerator bestPerformer = windFarm.findBestPerformer(speed);
            if (bestPerformer != null) {
                System.out.println("Best wind speed " + speed + ":");
                System.out.println(bestPerformer.toString());
            } else {
                System.out.println("No best wind speed and Wind Generator");
            }
        }

    }

}
