package TravelNumbers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csstudent
 */
public class Inspection {
    private int zip;
    private DataPoint [] results;
    
    /**
     *
     * @return
     */
    public DataPoint [] getFact(){
        return results;
    }
    public Inspection() {
    }
    
    public int getZip() {
        return zip;
    }
    
    public boolean failed() {
        return results.equals("Fail");
    }
    
    @Override
    public String toString() {
        return "" + zip + " " + results;
    }
}
