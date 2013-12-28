/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Grant Bacaltos
 */
public class User {
    
    private int user_id;
    private String fname;
    private String mname;
    private String lname;
    private String user_type;
    private String email;
    private String contact_no;
    private int year_started;

    //constructor
    public User(int user_id, String fname, String mname, String lname, String user_type, String email, String contact_no, int year_started) {
        this.user_id = user_id;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.user_type = user_type;
        this.email = email;
        this.contact_no = contact_no;
        this.year_started = year_started;
    }

    //getters and setters
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public int getYear_started() {
        return year_started;
    }

    public void setYear_started(int year_started) {
        this.year_started = year_started;
    }

    @Override
    public String toString() {
        return "User{" + "user_id=" + user_id + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", user_type=" + user_type + ", email=" + email + ", contact_no=" + contact_no + ", year_started=" + year_started + '}';
    }
    
    
}
