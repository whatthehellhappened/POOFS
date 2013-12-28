/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Population;

/**
 *
 * @author Grant Bacaltos
 */
public class Track {
    private int trackNo;
    private String trackDesc;
    private int enrolees;

    //track nos.
    //0 - none
    //1 - web
    //2 - mobile
    //3 - multi
    public Track(int trackNo, String trackDesc, int enrolees) {
        this.trackNo = trackNo;
        this.trackDesc = trackDesc;
        this.enrolees = enrolees;
    }

    public int getEnrolees() {
        return enrolees;
    }

    public void setEnrolees(int enrolees) {
        this.enrolees = enrolees;
    }

    public int getTrackNo() {
        return trackNo;
    }

    public void setTrackNo(int trackNo) {
        this.trackNo = trackNo;
    }

    public String getTrackDesc() {
        return trackDesc;
    }

    public void setTrackDesc(String trackDesc) {
        this.trackDesc = trackDesc;
    }

    @Override
    public String toString() {
        return "Track{" + "trackNo=" + trackNo + ", trackDesc=" + trackDesc + ", enrolees=" + enrolees + '}';
    }
    
    
}
