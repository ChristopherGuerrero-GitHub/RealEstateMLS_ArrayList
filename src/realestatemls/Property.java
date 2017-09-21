  
package realestatemls;

/**
 *
 * @author Christopher
 */
public class Property {

    //This class "Property" is invoked by the main program class "RealEstateListing". 
    //This class creates and instantiating new objects when invoked by
    //by the main program class "RealEstateListing"

    
    //Declaring instance variables
    private double askingPrice;
    private String propertyType;
    private double lotSize;
    private int numBaths;
    private int numBeds;
    
    //Constructors return no value and have the exact same name as the 
    //Class name.
    
    //declaring two contructors using the this keyword to assign value from
    //parameter to instance variable.
    //
    //First constructor only assigns the values passed for only the Land
    //data instance variables.
    public Property(double askingPrice, String propertyType, double lotSize){
        
        //the reason for "this" is because the instance variable and the parameter
        //variable name are the same. Therefore the "this" will indicate which 
        //is the instance variable and NOT the parameter variable.
        this.askingPrice = askingPrice;
        this.propertyType = propertyType;
        this.lotSize = lotSize;    
        numBaths = 0;
        numBeds = 0;
        
    }
    
    //This second constructor assigns the values passed via parameters to the
    //Land and Property data instance variables.
    public Property(double askingPrice, String propertyType, double lotSize,
            int numBaths, int numBeds){
        
        //the reason for "this" is because the instance variable and the parameter
        //variable name are the same. Therefore the "this" will indicate which 
        //is the instance variable and NOT the parameter variable.
        this.askingPrice = askingPrice;
        this.propertyType = propertyType;
        this.lotSize = lotSize;
        this.numBaths = numBaths;
        this.numBeds = numBeds;
        
    }
    
    public String toString(){
        
        return "Asking price: $ " + askingPrice +
                "\n Property Type: " + propertyType +
                "\n Lot Size: " + lotSize +
                "\n Number of Baths: " + numBaths +
                "\n Number of Bedrooms: " + numBeds;
    }
    
    //using a mutator method to change the value in the instance variable.
    public void setAskingPrice(double newValue){
       
        askingPrice = newValue;
        
    }
}
