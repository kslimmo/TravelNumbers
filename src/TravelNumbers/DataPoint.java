
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csstudent
 */
/**
 * Write a description of class Dim here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
package TravelNumbers;

public class DataPoint {
    private String per_capita_income_;
    private String ca;
    private String hardship_index;
    private String percent_aged_under_18_or_over_64;
    private String community_area_name;
    private String percent_of_housing_crowded;
    private String percent_aged_25_without_high_school_diploma;
    private String percent_aged_16_unemployed;
    private String percent_households_below_poverty;
    
    public String getIncome(){
        return per_capita_income_;
    }
    public String getCA(){
        return ca;
    }
    public String getIndex(){
        return hardship_index;
    }
    public String getPercent1864(){
        return percent_aged_under_18_or_over_64;
    }
    public String getAreaName(){
        return community_area_name;
    }
    public String getHousingCrowded(){
        return percent_of_housing_crowded;
    }
    public String getNoDiploma(){
        return percent_aged_25_without_high_school_diploma;
    }
    public String getPercentUnemployed(){
        return percent_aged_16_unemployed;
    }
    public String getPercentBelowPoverty(){
        return percent_households_below_poverty;
    }
    @Override 
    public String toString(){
        return community_area_name + ": " + percent_aged_16_unemployed + "% unemployed";
    }

    double getValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


