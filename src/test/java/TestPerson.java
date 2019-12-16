import lambdaslab.Person;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class TestPerson {

    @Test
    public void TestConstructor1() {
        // Given
        Integer expectedAge =  28;
        String expectedName = "Waldo";
        LocalDate expectedBirthday = LocalDate.of(1991, 05, 9);
        Person.Sex expectedSex = Person.Sex.MALE;
        String expectedEmail = "wheresWaldo@gmail.com";

        // When
        Person person = new Person(expectedName, expectedSex, expectedBirthday, expectedEmail);

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Person.Sex actualSex = person.getGender();
        String actualEmail = person.getEmailAddress();
        LocalDate actualBirthday = person.getBirthday();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedSex, actualSex);
        Assert.assertEquals(expectedEmail, actualEmail);
        Assert.assertEquals(expectedBirthday, actualBirthday);
    }
}
