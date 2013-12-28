/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Carmel and Grant
 */

import Interface.*;
import Main.Course.Course;
import Main.Course.Offering;
import Main.Population.*;
import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    
    static ArrayList<Degree> degreePrograms = new ArrayList<Degree>();
    static ArrayList<YearLevel> yearLevels = new ArrayList<YearLevel>();
    static ArrayList<YearLevel> yearLevels2 = new ArrayList<YearLevel>();
    static ArrayList<Track> tracks = new ArrayList<Track>();
    static ArrayList<Track> tracks2 = new ArrayList<Track>();
    
    public static void main(String[] args) {
        createDegreePrograms();
        System.out.println("Degree programs created.");
        createConstraints();
        System.out.println("Constraints created.");
        Login.start();
    }
    
    public static void createDegreePrograms() {
        try
        {
            //IT-------------------------------------------------------------------------
            //1st year
            tracks.add(new Track(0, "None", 250));
            yearLevels.add(new YearLevel(1,tracks));
            tracks.clear();
            //2nd year
            tracks.add(new Track(0, "None", 200));
            yearLevels.add(new YearLevel(2,tracks));
            tracks.clear();
            //3rd year
            tracks.add(new Track(1, "Web Applications", 60));
            tracks.add(new Track(2, "Mobile Applications", 30));
            tracks.add(new Track(3, "Multimedia", 20));
            yearLevels.add(new YearLevel(3,tracks));
            tracks.clear();
            //4th year
            tracks.add(new Track(1, "Web Applications", 30));
            tracks.add(new Track(2, "Mobile Applications", 15));
            tracks.add(new Track(3, "Multimedia", 15));
            yearLevels.add(new YearLevel(4,tracks));
            degreePrograms.add(new Degree("BSIT", "Information Technology", yearLevels));
            //-------------------------------------------------------------------------
            //CS-------------------------------------------------------------------------
            //1st year
            tracks2.add(new Track(0, "None", 50));
            yearLevels2.add(new YearLevel(1,tracks2));
            tracks2.clear();
            //2nd year
            tracks2.add(new Track(0, "None", 20));
            yearLevels2.add(new YearLevel(2,tracks2));
            tracks2.clear();
            //3rd year
            tracks2.add(new Track(0, "None", 10));
            yearLevels2.add(new YearLevel(3,tracks2));
            System.out.println(yearLevels2.get(2).getTracks().toString());
            tracks2.clear();
            //4th year
            tracks2.add(new Track(0, "None", 5));
            yearLevels2.add(new YearLevel(4,tracks2));
            degreePrograms.add(new Degree("BSCS", "Computer Science", yearLevels2));
            //-------------------------------------------------------------------------
            System.out.println("Degree Programs = " + degreePrograms.size());

            //System.out.println(degreePrograms.toString());
            //set constraints
            //System.out.println(degreePrograms.get(1).getYearLevels().get(3).getTracks().size());
            Constraints.setDegreePrograms(degreePrograms);
        }catch(Exception e){System.err.println("Error @ createDegrees: " + e.getMessage());}
    }
    
    public static void createConstraints() {
        try {
            Constraints.setMaxUnits_FT(24);
            Constraints.setMaxUnits_PT(12);
            Constraints.setMinUnits_FT(18);
            Constraints.setMinUnits_PT(3);
            Constraints.setClassDensity(40);
            Constraints.setMaxDistinct(4);
            Constraints.setMaxConsecutive(3);
        }catch(Exception e){System.err.println("Error @ createConstraints: " + e.getMessage());}
    }
    
    public static ArrayList<Course> createCurriculum() {
        ArrayList<Course> courses = new ArrayList<Course>();
        try {
            courses.add(new Course("IT110", "Computer Concepts", 3, 0, 3, new ArrayList<Offering>(),0));
            courses.add(new Course("IT111", "Computer Concepts", 3, 0, 3, new ArrayList<Offering>(),0));
            courses.add(new Course("IT211", "Computer Concepts", 3, 0, 3, new ArrayList<Offering>(),0));
            courses.add(new Course("IT212", "Computer Concepts", 3, 0, 3, new ArrayList<Offering>(),0));
            courses.add(new Course("IT311", "Computer Concepts", 3, 0, 3, new ArrayList<Offering>(),0));
            courses.add(new Course("IT312", "Computer Concepts", 3, 0, 3, new ArrayList<Offering>(),0));
            courses.add(new Course("IT313", "Computer Concepts", 3, 0, 3, new ArrayList<Offering>(),0));
            courses.add(new Course("IT314", "Computer Concepts", 3, 0, 3, new ArrayList<Offering>(),0));
        }catch(Exception e){System.err.println("Error @ createCurriculum: " + e.getMessage());}
        return courses;
    }
}
