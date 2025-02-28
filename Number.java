/*The Number class contains one constructor and four methods. These methods allow the user to
create an object out of a given int value, as well as return the value, check if it equals another object,return the hash
code of the object's value, and return the value as a string.
@author Kenedi Carson*/
public class Number{
	private int theValue; //Instance variable representing the value associated with the Number Object
	
	/*Parameterized constructor- Creates the Number object and sets theValue equal to the given
	int value.
	@param int 
	@return none*/
	public Number(int value){
        theValue = value;
	}	
	
	/*getValue()- Returns the theValue instance variable for the specified object.
	@param none
	@return int*/
	public int getValue(){
		return theValue;
	}
	/*equals()- Compares one Number object to another Object.
	@param Object
	@return boolean*/
    public boolean equals(Object obj) {
        //If the objects are identical return true.
        if (this == obj) {
            return true; 
        }
        //If the given object is null, or if the classes are different, return false.
        if (obj == null || getClass() != obj.getClass()) {
            return false; 
        }
        //Cast the given object to a Number, and compare once again. 
        Number other = (Number) obj; 
        return this.getValue() == other.getValue();  
    }
	
	/*hashCode()- Returns the hash code of a Number object. 
	@param non
	@return int*/
	public int hashCode(){
		return theValue % 10;
	}
    /*Returns the value of a Number object as a String.
    @param none
    @return String*/
	public String toString(){
		return " " + theValue;
	}	
}
