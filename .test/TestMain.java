import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain
{

//    private String getStringProperty(DACArecipient person, String name) throws NoSuchFieldException, IllegalAccessException
//    {
//        // Get the class of the object
//        Class<?> clazz = person.getClass();
//
//        // Get the private field "uscisNumber" using reflection
//        Field uscisNumberField = clazz.getDeclaredField(name);
//
//        // Make the field accessible (since it's private)
//        uscisNumberField.setAccessible(true);
//
//        // Get the value of the field from the person object
//        String value = (String) uscisNumberField.get(person);
//
//        // Print the result
//        return value;
//    }


    void testStringGetter(String name, String data)
    {
        DACArecipient person = new DACArecipient();
        Class<?> clazz = person.getClass();
        Method setterMethod = null;
        Method getterMethod = null;
        try
        {
            setterMethod = clazz.getDeclaredMethod("set" + name, String.class);
            getterMethod = clazz.getDeclaredMethod("get" + name);
            setterMethod.invoke(person, data);
            assertEquals(data, getterMethod.invoke(person));
        } catch (NoSuchMethodException e)
        {
            throw new RuntimeException("Either the set" + name + " or the get" + name + "  method does not exist or has the wrong parameters.");
        } catch (InvocationTargetException e)
        {
            throw new RuntimeException("An error occured in your code.", e);
        } catch (IllegalAccessException e)
        {
            throw new RuntimeException("Could not call either set" + name + " or get" + name + " methods, check that they are public.");
        }
    }

    void testIntGetter(String name, int data)
    {
        DACArecipient person = new DACArecipient();
        Class<?> clazz = person.getClass();
        Method setterMethod = null;
        Method getterMethod = null;
        try
        {
            setterMethod = clazz.getDeclaredMethod("set" + name, int.class);
            getterMethod = clazz.getDeclaredMethod("get" + name);
            setterMethod.invoke(person, data);
            assertEquals(data, getterMethod.invoke(person));
        } catch (NoSuchMethodException e)
        {
            throw new RuntimeException("Either the set" + name + " or the get" + name + "  method does not exist or has the wrong parameters.");
        } catch (InvocationTargetException e)
        {
            throw new RuntimeException("An error occured in your code.", e);
        } catch (IllegalAccessException e)
        {
            throw new RuntimeException("Could not call either set" + name + " or get" + name + " methods, check that they are public.");
        }
    }

    void testCharGetter(String name, char data)
    {
        DACArecipient person = new DACArecipient();
        Class<?> clazz = person.getClass();
        Method setterMethod = null;
        Method getterMethod = null;
        try
        {
            setterMethod = clazz.getDeclaredMethod("set" + name, char.class);
            getterMethod = clazz.getDeclaredMethod("get" + name);
            setterMethod.invoke(person, data);
            assertEquals(data, getterMethod.invoke(person));
        } catch (NoSuchMethodException e)
        {
            throw new RuntimeException("Either the set" + name + " or the get" + name + "  method does not exist or has the wrong parameters.");
        } catch (InvocationTargetException e)
        {
            throw new RuntimeException("An error occured in your code.", e);
        } catch (IllegalAccessException e)
        {
            throw new RuntimeException("Could not call either set" + name + " or get" + name + " methods, check that they are public.");
        }
    }

    private void setAllStringTest(String name, String data, String surname, String givenName, String uscisNumber, String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex)
    {
        DACArecipient person = new DACArecipient();
        Class<?> clazz = person.getClass();
        Method setterMethod = null;
        Method getterMethod = null;
        try
        {
            setterMethod = clazz.getDeclaredMethod("setAll", String.class, String.class, String.class, String.class, int.class, int.class, int.class, char.class);
            getterMethod = clazz.getDeclaredMethod("get" + name);
            setterMethod.invoke(person, surname, givenName, uscisNumber, countryOfOrigin, birthday, validFromDate, expirationDate, sex);
            assertEquals(data, getterMethod.invoke(person));
        } catch (NoSuchMethodException e)
        {
            throw new RuntimeException("Either the setAll or the get" + name + "  method does not exist or has the wrong parameters.");
        } catch (InvocationTargetException e)
        {
            throw new RuntimeException("An error occured in your code.", e);
        } catch (IllegalAccessException e)
        {
            throw new RuntimeException("Could not call either set" + name + " or get" + name + " methods, check that they are public.");
        }
    }

    private void setAllIntTest(String name, int data, String surname, String givenName, String uscisNumber, String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex)
    {
        DACArecipient person = new DACArecipient();
        Class<?> clazz = person.getClass();
        Method setterMethod = null;
        Method getterMethod = null;
        try
        {
            setterMethod = clazz.getDeclaredMethod("setAll", String.class, String.class, String.class, String.class, int.class, int.class, int.class, char.class);
            getterMethod = clazz.getDeclaredMethod("get" + name);
            setterMethod.invoke(person, surname, givenName, uscisNumber, countryOfOrigin, birthday, validFromDate, expirationDate, sex);
            assertEquals(data, getterMethod.invoke(person));
        } catch (NoSuchMethodException e)
        {
            throw new RuntimeException("Either the setAll or the get" + name + "  method does not exist or has the wrong parameters.");
        } catch (InvocationTargetException e)
        {
            throw new RuntimeException("An error occured in your code.", e);
        } catch (IllegalAccessException e)
        {
            throw new RuntimeException("Could not call either set" + name + " or get" + name + " methods, check that they are public.");
        }
    }

    private void setAllCharTest(String name, char data, String surname, String givenName, String uscisNumber, String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex)
    {
        DACArecipient person = new DACArecipient();
        Class<?> clazz = person.getClass();
        Method setterMethod = null;
        Method getterMethod = null;
        try
        {
            setterMethod = clazz.getDeclaredMethod("setAll", String.class, String.class, String.class, String.class, int.class, int.class, int.class, char.class);
            getterMethod = clazz.getDeclaredMethod("get" + name);
            setterMethod.invoke(person, surname, givenName, uscisNumber, countryOfOrigin, birthday, validFromDate, expirationDate, sex);
            assertEquals(data, getterMethod.invoke(person));
        } catch (NoSuchMethodException e)
        {
            throw new RuntimeException("Either the setAll or the get" + name + "  method does not exist or has the wrong parameters.");
        } catch (InvocationTargetException e)
        {
            throw new RuntimeException("An error occured in your code.", e);
        } catch (IllegalAccessException e)
        {
            throw new RuntimeException("Could not call either set" + name + " or get" + name + " methods, check that they are public.");
        }
    }

    @Test
    @DisplayName("testUscisNumber")
    void testUscisNumber()
    {
        DACArecipient person = new DACArecipient();
        testStringGetter("UscisNumber", "12-3-456");
    }

    @Test
    @DisplayName("testGivenName")
    void testGivenName()
    {
        DACArecipient person = new DACArecipient();
        testStringGetter("GivenName", "Javier");
    }

    @Test
    @DisplayName("testSurname")
    void testSurname()
    {
        DACArecipient person = new DACArecipient();
        testStringGetter("Surname", "Mendez");
    }

    @Test
    @DisplayName("testCountryOfOrigin")
    void testCountryOfOrigin()
    {
        DACArecipient person = new DACArecipient();
        testStringGetter("CountryOfOrigin", "Guatamala");
    }

    @Test
    @DisplayName("testBirthday")
    void testBirthday()
    {
        DACArecipient person = new DACArecipient();
        testIntGetter("Birthday", 1234567);
    }

    @Test
    @DisplayName("testValidFromDate")
    void testValidFromDate()
    {
        DACArecipient person = new DACArecipient();
        testIntGetter("ValidFromDate", 1234567);
    }


    @Test
    @DisplayName("testExpirationDate")
    void testExpirationDate()
    {
        DACArecipient person = new DACArecipient();
        testIntGetter("ExpirationDate", 1234567);
    }

    @Test
    @DisplayName("testSex")
    void testSex()
    {
        DACArecipient person = new DACArecipient();
        testCharGetter("Sex", 'M');
    }

    @Test
    @DisplayName("testSetAllPart1")
    void testSetAllPart1()
    {
        setAllStringTest("Surname", "Kim", "Kim", "Seo-yun", "25-6-567", "South Korea", 2451257, 39567322, 39567818, 'F');
    }

    @Test
    @DisplayName("testSetAllPart2")
    void testSetAllPart2()
    {
        setAllStringTest("GivenName", "Seo-yun", "Kim", "Seo-yun", "25-6-567", "South Korea", 2451257, 39567322, 39567818, 'F');
    }

    @Test
    @DisplayName("testSetAllPart3")
    void testSetAllPart3()
    {
        setAllStringTest("UscisNumber", "25-6-567","Kim", "Seo-yun", "25-6-567", "South Korea", 2451257, 39567322, 39567818, 'F');
    }

    @Test
    @DisplayName("testSetAllPart4")
    void testSetAllPart4()
    {
        setAllStringTest("CountryOfOrigin", "South Korea","Kim", "Seo-yun", "25-6-567", "South Korea", 2451257, 39567322, 39567818, 'F');
    }

    @Test
    @DisplayName("testSetAllPart5")
    void testSetAllPart5()
    {
        setAllIntTest("Birthday", 2451257,"Kim", "Seo-yun", "25-6-567", "South Korea", 2451257, 39567322, 39567818, 'F');
    }

    @Test
    @DisplayName("testSetAllPart6")
    void testSetAllPart6()
    {
        setAllIntTest("ValidFromDate", 39567322,"Kim", "Seo-yun", "25-6-567", "South Korea", 2451257, 39567322, 39567818, 'F');
    }

    @Test
    @DisplayName("testSetAllPart7")
    void testSetAllPart7()
    {
        setAllIntTest("ExpirationDate", 39567818,"Kim", "Seo-yun", "25-6-567", "South Korea", 2451257, 39567322, 39567818, 'F');
    }

    @Test
    @DisplayName("testSetAllPart8")
    void testSetAllPart8()
    {
        setAllCharTest("Sex", 'F', "Kim", "Seo-yun", "25-6-567", "South Korea", 2451257, 39567322, 39567818, 'F');
    }
}