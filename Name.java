/**
   A class that represents a person's name.
   Appendix C version.

   @author Frank M. Carrano
   @author Timothy M. Henry
   @author Mr. Reed   
   @version 4.0
*/

public class Name
{
 private String first; // First name
 private String last;  // Last name

 public Name()
 {
 } // end default constructor

 public Name(String firstName, String lastName)
 {
  first = firstName;
  last = lastName;
 } // end constructor

 public void setName(String firstName, String lastName)
 {
  setFirst(firstName);
  setLast(lastName);
 } // end setName

 public String getName()
 {
  return toString();
 } // end getName

 public void setFirst(String firstName)
 {
  first = firstName; 
 } // end setFirst

 public String getFirst()
 {
  return first;
 } // end getFirst

 public void setLast(String lastName)
 {
  last = lastName;
 } // end setLast

 public String getLast()
 {
  return last;
 } // end getLast

 public void giveLastNameTo(Name aName)
 {
  aName.setLast(last);
 } // end giveLastNameTo

 public String toString()
 {
  return first + " " + last;
 } // end toString
} // end Name