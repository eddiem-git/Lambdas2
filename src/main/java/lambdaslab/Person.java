package lambdaslab;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }
    String name = "eddie";
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    Boolean test = false;

    public Person () {
        new ArrayList<Person>();
    }

    public Person (String name, LocalDate birthday,  Sex gender, String emailAddress) {
        this.name =name;
        this.gender = gender;
        this.birthday = birthday;
        this.emailAddress = emailAddress;
    }

    public Person (Sex gender, LocalDate birthday, String emailAddress) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.emailAddress = emailAddress;
    }

    public LocalDate getNow() {
        return test ? LocalDate.of(2019, 12, 1) : LocalDate.now();
    }

    public Integer getAge() {
        return getNow().compareTo(birthday);
    }

    public void printPerson() {
        System.out.println(this.toString());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getGender() {
        return this.gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public void setBirthday(LocalDate date) {
        this.birthday = date;
    }

    public void setBirthday(Integer year, Integer month, Integer day) {
        this.birthday = LocalDate.of(year, month, day);
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String toString() {
        return (String.format("\nPerson:\n" +
                        "\tName:\t\t%s\n" +
                        "\tSex:\t\t%s\n" +
                        "\tBirthday:\t%s\n" +
                        "\tEmail:\t\t%s\n",
                this.getName(), this.getGender().name(),
                this.getBirthday().format(DateTimeFormatter.ofPattern("mm-dd-yyyy")),
                this.getEmailAddress()));
    }
}