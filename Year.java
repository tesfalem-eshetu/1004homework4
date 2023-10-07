/*
*
* @author Tesfalem Eshetu 
* @date 10/20/2022
*
* This class represents a calendar year.
*
* It contains a method that determines if
* the year is a leap year.
*
*/


public class Year{
    // declare your instance variables here
    private int year;


    // write your constructor here

    public Year(int y){
        // your code here
        year = y;
    }



    public boolean isLeapYear(){
        // your code here 
        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0) ){
            return true;
    } 
            return false;
             
        
    }

}    

