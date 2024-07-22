# **Lab 16: DACArecipient Class - Intro to Classes/Objects**

# DACA Goes Digital : Back-End Setup

 
To organize and keep track of those enrolled in DACA (Deferred Action for Childhood Arrivals), the government is rebuilding the back-end of their system in Java and tasked a team of interns with building the most fundamental part of the project: tracking the data of each person enrolled in the program.

It's absolutely crucial this `DACArecipient` class is well built since it's used for almost everything in the system.

**Part 1:**

Add the following instance variables to your `DACArecipient` class:

- surname (Ex: Chapeton-Lamas)
- givenName (Ex: Nery)
- uscisNumber (Ex: 12-4-789)
- countryOfOrigin (Ex: Guatemala)
- birthday, validFromDate, and expirationDate (Integers in  the form of a Julian Day number. For example: Jan 1, 2000 = 2451564)
- sex (Ex: 'M' for Male)

**Part 2:**

Complete the UML class diagram for the `DACArecipient` class, including all model-like required methods

**Part 3:**
Write the code! Implement the following methods:
- Accessor methods (getters)
- Mutator methods (setters)
- a `setAll` method that sets the values of all the instance variables

**Part 4:** 
In the `main` method, you test out your `DACArecipient` class by making two objects (representing two people in the DACA program):
- For the first object, use the setters for each instance variable
- For the second object, use the `setAll` method to set the value of all the instance variables at the same time.
- Use the getters to print the contents of both objects to the console in whatever format you would like. For example:
```
Person 1
-----------------------------
Surname: Mendez
Given name: Javier
USCIS Number: 56-3-445
Country of Origin: Venezuela
Birthday(JDN): 2451564
Valid From Date(JDN): 3956753
Expiration Date(JDN): 3956840
Sex: M
```

