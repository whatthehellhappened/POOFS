/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Population;

import java.util.ArrayList;

/**
 *
 * @author Grant Bacaltos
 */
public class Degree {
    private String degreeID;
    private String degreeName;
    private ArrayList<YearLevel> yearLevels;

    public Degree(String degreeID, String degreeName, ArrayList<YearLevel> yearLevels) {
        this.degreeID = degreeID;
        this.degreeName = degreeName;
        this.yearLevels = yearLevels;
    }

    public String getDegreeID() {
        return degreeID;
    }

    public void setDegreeID(String degreeID) {
        this.degreeID = degreeID;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public ArrayList<YearLevel> getYearLevels() {
        return yearLevels;
    }

    public void setYearLevels(ArrayList<YearLevel> yearLevels) {
        this.yearLevels = yearLevels;
    }

    @Override
    public String toString() {
        return "Degree{" + "degreeID=" + degreeID + ", degreeName=" + degreeName + ", yearLevels=" + yearLevels + '}';
    }
    
    
}
