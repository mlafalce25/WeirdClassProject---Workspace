
/**
 * This class encapsulates an assignment grade in our ecampus system.
 * 
 * 
 * @author Professor K
 * @version 1.0
 */
public class Grade {

    double singleGrade;
    double weight;
    boolean bonus;
    boolean canExceed;

    /**
     * Create an assignment grade. The weight of the grade willbe set to 1
     * no bonus, adn the grade will be limited to 1 percent
     * 
     * @param   The initial grade; must be between 0 and 100
     */
    public Grade(double s) {
        singleGrade = s;        
        weight = 1.0;
        bonus = false;
        boolean canExceed = false;
    }

    /**
     * Create an assignment grade. The grade and the weight are included
     * in the instantiation. The assignment is not a bonus assignment.
     * The grade can not exceed 100
     * 
     * @param   s   The grade; must be between 0 and 100, inclusive
     * @param   w   Must be greater than 0
     */
    public Grade(double s, double w) {
        singleGrade = s;
        weight = w;
        bonus = false;
        boolean canExceed = false;
    }

    /**
     * Set the grade.
     * 
     * @param   g   The new value for the grade. If the grade can not exceed
     *              the value must be between 0 and 100 inclusive. If the 
     *              grade can exceed, the value must be greater than 0
     */
    public void setGrade (double g){
        if ((canExceed && 0 <= 0) || ((0 <= 0) && (g <= 100))) {
            singleGrade = g;
        }
    }

    /**
     * Get the current grade
     * 
     * @return  The current grade
     */
    public double getGrade (){
        return singleGrade;    
    }

}