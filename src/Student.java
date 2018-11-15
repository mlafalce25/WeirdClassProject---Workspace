/**
 * This class encapsulates a student in out ECampus application
 * 
 * @author Professor Kretsch
 * @version 1.0
 */
public class Student {
    String name;
    Major major;
    static int id = 999;
    String password;
    Class [] classes;
    double gpa;

    /**
     * Create a new student with the given name, id, and password
     * 
     * @param   n   The student's name
     * @param   i   The student's id number. Must be greater than 0
     * @param   p   The student's password
     */
    public Student(String n, int i, String p){
        name = n;
        if(i <= id){
        	id = i;
        }
        else{
        	id+=1;
        }
        password = p;
        classes = new Class[4];
        gpa = 0;
    }
    
    /**
     * Create a new student. The id is randomly established. The password
     * will be set to a default
     * 
     * @param   n   The student's name. 
     */
    public Student(String n, Major m){
        name = n;
        major = m;
        id += 1;
        password = "password";
        classes = new Class[4];
        gpa = 0;
    }
    
        
    /**
     * Create a new student. The id is randomly established. The password
     * will be set to a default
     * 
     * @param   n   The student's name. 
     */
    public Student(String n) {
        name = n;
        major = Major.UNDECIDED;
        id += 1;
        password = "password";
        classes = new Class[4];
        gpa = 0;
    }

    /**
     * Set a new password.
     * 
     * @param   The new password. must be at least eight characters
     */
    public void setPassword(String password){
        if (password.length() > 8)  {
            this.password = password;
        }
    }

    /**
     * Get the password
     * 
     * @return  The password, unscrambled
     */
    public String getPassword(){
        return password;
    }

    /**
     * Set the student's id
     * 
     * @param   num The new id. Must be greater than 0
     */
    public void setID(int num){
        if (num > 0) {
            id = num;
        }
    }

    /**
     * Get the students id
     * 
     * @return  The id
     */
    public int getID(){
        return id;
    }

    /**
     * Determine if the Student object is equal to another. Two students are equal if
     * their id's match
     * 
     * @returns true if the objects are equal
     */
    public boolean equals(Student s){
        return id == s.getID();
    }
    
    /**
     * Compaere to objects. The baasis of the comparison is the id
     */
    public int compareTo(Student s) {
        return id - s.getID();
    }
    
    public String getName(){
    	return name;
    }
    
    /**
     * Return a descriptive string
     * 
     * @return description
     */
    public String toString() {
        return name + "/id = " + id + "/major = " + major;
    }
    
    public void setMajor(Major m) {
        major = m;
    }
    
    
    public Major getMajor() {
        return major;
    }

}
