/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Database.DB;
import java.util.ArrayList;

/**
 *
 * @author Grant Bacaltos
 */
public class TeachersList {
    ArrayList<User> teachers;
    
    public TeachersList() {
        teachers = DB.getAllTeachers();
    }
}
