public class yourCarbonFootprint  extends CarbonFootprint 

{
   private double initialManufacturingFootprint;
   private double averageDailyToll;

   public InitialPlusAverageDailyToll(String initialFootprint, String dailyFootprint, 
      String carbonFootprint, double totalFootprint, 
      double dailyAverage, double initialFootprint)
   
   {
      super(initialFootprint, dailyFootprint, carbonFootprint, 
         carbonFootprint, totalFootprint);                      
   
      if (initialFootprint < 0.0)                   
         throw new IllegalArgumentException(
            "Initial Footprint must be >= 0.0");  
   
      this.initialFootprint = initialFootprint;
   }
}