/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Course;

import java.util.ArrayList;

/**
 *
 * @author Grant Bacaltos
 */
public class Course {
    private String courseNo;
    private String courseDesc;
    private int lecHours;
    private int labHours;
    private int units;
    private ArrayList<Offering> offerings;
    private int trackOffered;

    public Course(String courseNo, String courseDesc, int lecHours, int labHours, int units, ArrayList<Offering> offerings, int trackOffered) {
        this.courseNo = courseNo;
        this.courseDesc = courseDesc;
        this.lecHours = lecHours;
        this.labHours = labHours;
        this.offerings = offerings;
        this.trackOffered = trackOffered;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public int getLecHours() {
        return lecHours;
    }

    public void setLecHours(int lecHours) {
        this.lecHours = lecHours;
    }

    public int getLabHours() {
        return labHours;
    }

    public void setLabHours(int labHours) {
        this.labHours = labHours;
    }

    public ArrayList<Offering> getOfferings() {
        return offerings;
    }

    public void setOfferings(ArrayList<Offering> offerings) {
        this.offerings = offerings;
    }

    public int getTrackOffered() {
        return trackOffered;
    }

    public void setTrackOffered(int trackOffered) {
        this.trackOffered = trackOffered;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }
    
    //methods
    public int getYearLevelOffered() {
        //assuming subject follows "CS ___" pattern
        System.out.println(courseNo.substring(3,3));
        return Integer.parseInt(courseNo.substring(3,3));
    }
    
    public int getSemesterOffered() {
        System.out.println(courseNo.substring(4,4));
        return Integer.parseInt(courseNo.substring(4,4));
    }
}
