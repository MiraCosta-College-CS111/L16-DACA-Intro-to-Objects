//**********************SOLUTION VERSION******************************
class Main 
{
  public static void main(String[] args) 
  {

    //Person 1 example: using mutators
    DACArecipient person1 = new DACArecipient();
    person1.setSurname("Mendez");
    person1.setGivenName("Javier");
    person1.setUscisNumber("56-3-445");
    person1.setCountryOfOrigin("El Salvador");
    person1.setBirthday(2451564);
    person1.setValidFromDate(3956753);
    person1.setExpirationDate(3956840);
    person1.setSex('M');

    //Person 2 example: using the setAll method
    DACArecipient person2 = new DACArecipient();
    person2.setAll("Kim", "Seo-yun", "25-6-567", "South Korea", 2451257, 39567322, 39567818, 'F');

    System.out.println("Person 1\n-----------------------------");
    printDetails(person1);

    System.out.println("\nPerson 2\n-----------------------------");
    printDetails(person2);

  }

  public static void printDetails(DACArecipient person)
  {
    System.out.println("Surname: " + person.getSurname());
    System.out.println("Given name: " + person.getGivenName());
    System.out.println("USCIS Number: " + person.getUscisNumber());
    System.out.println("Country of Origin: " + person.getCountryOfOrigin());
    System.out.println("Birthday(JDN): " + person.getBirthday());
    System.out.println("Valid From Date(JDN): " + person.getValidFromDate());
    System.out.println("Expiration Date(JDN): " + person.getExpirationDate());
    System.out.println("Sex: " + person.getSex());
  }
}