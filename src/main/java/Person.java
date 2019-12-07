import java.time.LocalDate;
import java.time.Period;

public class Person implements CheckPerson{

        public enum Sex {
            MALE, FEMALE
        }

        String name;
        LocalDate birthday;
        Sex gender;
        String emailAddress;

        public Person(){
                this.name = "";
                this.birthday = LocalDate.now();
                this.gender = null;
                this.emailAddress = "";
        }

        public Person(String name, LocalDate birthday, Sex gender, String emailAddress){
                this.name = name;
                this.birthday = birthday;
                this.gender = gender;
                this.emailAddress = emailAddress;
        }
        public int getAge() {
                return Period.between(birthday,LocalDate.now()).getYears();
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public LocalDate getBirthday() {
                return birthday;
        }

        public void setBirthday(LocalDate birthday) {
                this.birthday = birthday;
        }

        public Sex getGender() {
                return gender;
        }

        public void setGender(Sex gender) {
                this.gender = gender;
        }

        public String getEmailAddress() {
                return emailAddress;
        }

        public void setEmailAddress(String emailAddress) {
                this.emailAddress = emailAddress;
        }

        public String printPerson() {
                return "Person = " + name +
                        "\nbirthday = " + birthday +
                        "\ngender = " + gender +
                        "\nemailAddress = " + emailAddress + "\n\n";
        }

        @Override
        public Boolean test(Person p) {
                return p.gender.equals(Sex.MALE);

        }
    }
