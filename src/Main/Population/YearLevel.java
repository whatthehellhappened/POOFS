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
public class YearLevel {
    private int yearNo;
    private ArrayList<Track> tracks;

    public YearLevel(int yearNo, ArrayList<Track> tracks) {
        this.yearNo = yearNo;
        this.tracks = tracks;
    }
    
    public int getYearNo() {
        return yearNo;
    }

    public void setYearNo(int yearNo) {
        this.yearNo = yearNo;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "YearLevel{" + "yearNo=" + yearNo + ", tracks=" + tracks + '}';
    }
    
    
}
