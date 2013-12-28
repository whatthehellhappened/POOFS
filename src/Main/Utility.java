/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Main.Course.Offering;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Grant Bacaltos
 */
public class Utility {
    
    private ArrayList<Offering> schedule = new ArrayList<Offering>();
    public static void centerFrame(JFrame fr){
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int width = fr.getSize().width;
        int height = fr.getSize().height;
        int x = (dimension.width - width) / 2;
        int y = (dimension.height - height) / 2;
        fr.setLocation(x, y);
    }
    
    public static String getFirstWord(String s) {
        String result;
        if(s.contains(" "))
            result = s.substring(0, s.lastIndexOf(" "));
        else {
            result = s;
        }
        return result.toLowerCase();
    }
    
    public static String eliminateSpaces(String s) {
        String result;
        if(s.contains(" ")) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.substring(0,s.indexOf(" ")));
            int lastIndexOfSpace = s.indexOf(" ");
            int i;
            for(i = lastIndexOfSpace+1; i < s.length(); i++) {
                if(s.charAt(i) == ' ') {
                    sb.append(s.substring(lastIndexOfSpace+1, i));
                    lastIndexOfSpace = i;
                }
            }
            sb.append(s.substring(lastIndexOfSpace+1, i));
            result = sb.toString();
        }
        else {
            result = s;
        }
        return result.toLowerCase();
    }
    
//    public static ArrayList<Offering> generateSchedules(int semester, ArrayList<Course> courses) {
//        int minUnits_FT = Constraints.getMinUnits_FT();
//        int maxUnits_FT = Constraints.getMaxUnits_FT();
//        int minUnits_PT = Constraints.getMinUnits_PT();
//        int maxUnits_PT = Constraints.getMaxUnits_PT();
//        int maxDistinct = Constraints.getMaxDistinct();
//        int maxConsecutive = Constraints.getMaxConsecutive();
//        int classDensity = Constraints.getClassDensity();
//        ArrayList<Degree> degrees = Constraints.getDegreePrograms();
//        Curriculum curriculum = new Curriculum(semester, courses);
//        ArrayList<Offering> schedule = new ArrayList<Offering>();
//        // DUE FOR HEAVY HEAVY IMPROVEMENT
//        for(int i = 0; i < curriculum.size(); i++)
//            
////            for(int i = degrees.size()-1; i >= 0; i--) 
////            {
////                ArrayList<YearLevel> years = degrees.get(i).getYearLevels();
////                for(int j = years.size()-1; j >= 0; j--)
////                {
////                    ArrayList<Track> tracks = years.get(j).getTracks();
////                    for(int k = 0; k < tracks.size(); k++)
////                    {
////                        
////                    }
////                }
////            }
//        //}
//        return schedule;
//    }
//    //public static String generateOfferCode(String ) {}
}
