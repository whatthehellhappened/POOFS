/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Course;

/**
 *
 * @author Grant Bacaltos
 */
public class Offering {
    private String offerCode;
    private String time;
    private int classDensity;
    private String room;
    private String days; //MWF or TTh
    private int teacherID;

    public Offering(String offerCode, int teacherID, String time, int classDensity, String room, String days) {
        this.offerCode = offerCode;
        this.teacherID = teacherID;
        this.time = time;
        this.classDensity = classDensity;
        this.room = room;
        this.days = days;
    }

    public String getOfferCode() {
        return offerCode;
    }

    public void setOfferCode(String offerCode) {
        this.offerCode = offerCode;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getClassDensity() {
        return classDensity;
    }

    public void setClassDensity(int classDensity) {
        this.classDensity = classDensity;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }
    
}
