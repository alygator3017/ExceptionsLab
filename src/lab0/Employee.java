package lab0;

import java.util.Date;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.hireDate != null ? this.hireDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.hireDate != other.hireDate && (this.hireDate == null || !this.hireDate.equals(other.hireDate))) {
            return false;
        }
        return true;
    }

    
    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }

    //**FIXED**
    public void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if(daysVacation < -30 || daysVacation > 30){
            throw new IllegalArgumentException("Vacation days must be between -30 and 30");
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Sets the required first name.
     * @param firstName - may not be null or empty
     * @throws IllegalArgumentException is firstName == null || has a length of 0
     */
    public final void setFirstName(String firstName) throws IllegalArgumentException {
       if(firstName == null || firstName.isEmpty()){
           throw new IllegalArgumentException("First Name cannot be null");
       }
        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    /**
     *Sets required hire date
     * @param hireDate - may not be null or before current date
     * @throws IllegalArgumentException is hireDate 
     */
    public void setHireDate(Date hireDate) {
        if(hireDate == null || hireDate == )
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    // 333-33-3333
    // 333333333

    /**
     *
     * @param ssn
     */
        public void setSsn(String ssn) {
//        if(ssn == null){
//            throw new IllegalArgumentException();
//        }
//        //if length is equal to nine or 11 (no dashes or dashes)
//        if(ssn.length() == 9 || ssn.length() == 11){
//            //split on dashes
//            String[] parts = ssn.split("-");
//            //if length of parts is 0 then split characters into array
//            if(parts.length == 0){
//                char[] chars = ssn.toCharArray(); //chars is an array of 9 characters
//                //else if parts length is equal to 3 parts then....
//            }else if (parts.length == 3){
//                char[] partChars = null;
//                //loop through the parts
//                for(int s = 0; s< parts.length;s++){
//                    //for each part put the characters into array c
//                    char[] c = parts[s].toCharArray();
//                    for(int x = 0; x<c.length;x++){
//                        partChars = 
//                    }
//                }
//                 
//                for(int c = 0; c<partChars.length-1;c++){
//                    System.out.println(partChars[c]);
//                }
//            }
//            
//        }else{
//            throw new IllegalArgumentException();
//        }
//        
        this.ssn = ssn;
    }
    
    public static void main(String[] args) {
        Employee em = new Employee();
        em.setSsn("333-33-3333");
    }
    
}
