/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Main.Population.Degree;
import java.util.ArrayList;

/**
 *
 * @author Grant Bacaltos
 */
public class Constraints {
    private static int minUnits_FT;
    private static int maxUnits_FT;
    private static int minUnits_PT;
    private static int maxUnits_PT;
    private static int maxDistinct;
    private static int maxConsecutive;
    private static int classDensity;
//    private static boolean available_BCL1;
//    private static boolean available_BCL2;
//    private static boolean available_BCL3;
//    private static boolean available_BCL4;
//    private static boolean available_BCL5;
//    private static boolean available_BCL8;
//    private static boolean available_BCL9;
//    private static boolean available_B503;
    private static ArrayList<Degree> degreePrograms = new ArrayList<Degree>();

    public static int getMinUnits_FT() {
        return minUnits_FT;
    }

    public static void setMinUnits_FT(int minUnits_FT) {
        Constraints.minUnits_FT = minUnits_FT;
    }

    public static int getMaxUnits_FT() {
        return maxUnits_FT;
    }

    public static void setMaxUnits_FT(int maxUnits_FT) {
        Constraints.maxUnits_FT = maxUnits_FT;
    }

    public static int getMinUnits_PT() {
        return minUnits_PT;
    }

    public static void setMinUnits_PT(int minUnits_PT) {
        Constraints.minUnits_PT = minUnits_PT;
    }

    public static int getMaxUnits_PT() {
        return maxUnits_PT;
    }

    public static void setMaxUnits_PT(int maxUnits_PT) {
        Constraints.maxUnits_PT = maxUnits_PT;
    }

    public static int getMaxDistinct() {
        return maxDistinct;
    }

    public static void setMaxDistinct(int maxDistinct) {
        Constraints.maxDistinct = maxDistinct;
    }

    public static int getMaxConsecutive() {
        return maxConsecutive;
    }

    public static void setMaxConsecutive(int maxConsecutive) {
        Constraints.maxConsecutive = maxConsecutive;
    }

    public static int getClassDensity() {
        return classDensity;
    }

    public static void setClassDensity(int classDensity) {
        Constraints.classDensity = classDensity;
    }

//    public static boolean isAvailable_BCL1() {
//        return available_BCL1;
//    }
//
//    public static void setAvailable_BCL1(boolean available_BCL1) {
//        Constraints.available_BCL1 = available_BCL1;
//    }
//
//    public static boolean isAvailable_BCL2() {
//        return available_BCL2;
//    }
//
//    public static void setAvailable_BCL2(boolean available_BCL2) {
//        Constraints.available_BCL2 = available_BCL2;
//    }
//
//    public static boolean isAvailable_BCL3() {
//        return available_BCL3;
//    }
//
//    public static void setAvailable_BCL3(boolean available_BCL3) {
//        Constraints.available_BCL3 = available_BCL3;
//    }
//
//    public static boolean isAvailable_BCL4() {
//        return available_BCL4;
//    }
//
//    public static void setAvailable_BCL4(boolean available_BCL4) {
//        Constraints.available_BCL4 = available_BCL4;
//    }
//
//    public static boolean isAvailable_BCL5() {
//        return available_BCL5;
//    }
//
//    public static void setAvailable_BCL5(boolean available_BCL5) {
//        Constraints.available_BCL5 = available_BCL5;
//    }
//
//    public static boolean isAvailable_BCL8() {
//        return available_BCL8;
//    }
//
//    public static void setAvailable_BCL8(boolean available_BCL8) {
//        Constraints.available_BCL8 = available_BCL8;
//    }
//
//    public static boolean isAvailable_BCL9() {
//        return available_BCL9;
//    }
//
//    public static void setAvailable_BCL9(boolean available_BCL9) {
//        Constraints.available_BCL9 = available_BCL9;
//    }
//
//    public static boolean isAvailable_B503() {
//        return available_B503;
//    }
//
//    public static void setAvailable_B503(boolean available_B503) {
//        Constraints.available_B503 = available_B503;
//    }

    public static ArrayList<Degree> getDegreePrograms() {
        return degreePrograms;
    }

    public static void setDegreePrograms(ArrayList<Degree> degreePrograms) {
        Constraints.degreePrograms = degreePrograms;
    }
    
    
}
