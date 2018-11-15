/**
 * This class encapsulates one class of a subject
 * 
 * @author Professor Kretsch
 * @version 1.0
 */

public class Class {

    Student [] students;
    Department dept;
    String name;
    String title;
    int section;
    double credits;
    String schedule;
    Grade [] grades;

    /**
     * Create a class from a given name, title, and section number. The
     * class will be worth 4 credits
     * 
     * @param   n   Class name, e.g. "CS176"
     * @param   t   Class Title, e.g., "Introductionn to Java II"
     * @param   s   Section number
     * @param   d   Department name
     */
    public Class(String n, String t, int s, Department d) {
        name = n;
        title = t;
        section = s;
        dept = d;
        credits = 4;
    }

    /**
     * Create a class from a given name and title. The section number will be 1
     * The class will be worth 4 credits
     * 
     * @param   n   Class name, e.g. "CS176"
     * @param   t   Class Title, e.g., "Introductionn to Java II"
     * @param   s   Section number
     * @param   d   Department name
     */
    public Class(String n, String t) {
        name = n;
        title = t;
        section = 1;
        dept = Department.OTHER;
        credits = 4;
    }

    public String getClassName() {
        return name;
    }

    /**
     * Chenage the classes title
     * 
     * @param   name    New title
     */
    public void setTitle(String name) {
        this.name = name;
    }

}
