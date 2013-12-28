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
public class Curriculum {
    private ArrayList<Course> curriculum;
    
    public Curriculum() {
        curriculum = new ArrayList<Course>();
        
    }
    public Curriculum(int semester, ArrayList<Course> courses) {
        for(int i = 0; i < courses.size(); i++)
            if(courses.get(i).getSemesterOffered() == semester)
                curriculum.add(courses.get(i));
    }
    
    public Course get(int i) {
        return curriculum.get(i);
    }
    
    public int size() {
        return curriculum.size();
    }
}
