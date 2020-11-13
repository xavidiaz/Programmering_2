package A_Uppgift;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    String name;
    String surname;
    String email;
    String phoneNumber;
    LocalDate dateOfBirth;

    public Person(String name, String surname, String email, String phoneNumber, LocalDate dateOfBirth) {
        this.name        = name;
        this.surname     = surname;
        this.email       = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }
    public Person(String name, String surname, String email, String phoneNumber, String dateOfBirth) {
        this.name        = name;
        this.surname        = surname;
        this.email       = email;
        this.phoneNumber = phoneNumber;
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public int getAge(String dateOfBirth) {
        LocalDate today = LocalDate.now();
        Period period = Period.between(this.dateOfBirth, today);
        return period.getYears();
    }
}
