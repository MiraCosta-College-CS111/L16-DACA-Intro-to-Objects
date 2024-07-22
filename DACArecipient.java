//**********************SOLUTION VERSION******************************
/**
 * Represents one person
 * 
 * <TODO add @author info here for all group-mates!>
 **/

//DONE PART 2: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
					DACArecipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFromDate : int
- expirationDate : int
- sex : char
-----------------------------------------
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountyOfOrigin() : String
+ getBirthDay() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex() : char
+ setSurname(surname : String) : void
+ setGivenName(givenName : String) : void
+ setUscisNumber(uscisNumber : String) : void
+ setCountryOfOrigin(countryOfOrigin : String) : void
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate : int) : void
+ setExpirationDate(expirationDate : int) : void
+ setSex(sex : char) : void
+ setAll(surname:String, givenName:String, uscisNumber:String, countryOfOrigin:String, birthday:int, validFromDate:int, expirationDate:int,sex:char) : void
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	//DONE: Declare the instance variables. 
  private String surname;
  private String givenName;
  private String uscisNumber;
  private String countryOfOrigin;
  private int birthday, validFromDate, expirationDate;
  private char sex;


	/***** ACCESSORS *****/
	//DONE: Write the getter for each instance variable. Remember to include documentation for each method.
  /** DESCRIPTION: Returns the surname of the calling DACArecipient object. */
  public String getSurname()
  {
    return surname;
  }
  public String getGivenName()
  {
    return givenName;
  }
  public String getUscisNumber()
  {
    return uscisNumber;
  }
  public String getCountryOfOrigin()
  {
    return countryOfOrigin;
  }
  public int getBirthday()
  {
    return birthday;
  }
  public int getValidFromDate()
  {
    return validFromDate;
  }
  public int getExpirationDate()
  {
    return expirationDate;
  }
	public char getSex()
  {
    return sex;
  }

	/***** MUTATORS *****/
	//DONE: Write the setter for each instance variable. Remember to include documentation for each method.
  /** DESCRIPTION: Assigns the parameter to the calling DACArecipient's surname instance variable.*/
  public void setSurname(String surname)
  {
    this.surname = surname;
  }
  public void setGivenName(String givenName)
  {
    this.givenName = givenName;
  }
  public void setUscisNumber(String uscisNumber)
  {
    this.uscisNumber = uscisNumber;
  }
  public void setCountryOfOrigin(String countryOfOrigin)
  {
    this.countryOfOrigin = countryOfOrigin;
  }
  public void setBirthday(int birthday)
  {
    this.birthday = birthday;
  }
  public void setValidFromDate(int validFromDate)
  {
    this.validFromDate = validFromDate;
  }
  public void setExpirationDate(int expirationDate)
  {
    this.expirationDate = expirationDate;
  }
  public void setSex(char sex)
  {
    this.sex = sex;
  }

  //DONE: Write the setAll method. Remember to include documentation.
    public void setAll(String surname, String givenName, String uscisNumber, String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex)
    {
      this.surname = surname;
      this.givenName = givenName;
      this.uscisNumber = uscisNumber;
      this.countryOfOrigin = countryOfOrigin;
      this.birthday = birthday;
      this.validFromDate = validFromDate;
      this.expirationDate = expirationDate;
      this.sex = sex;
    }

}
