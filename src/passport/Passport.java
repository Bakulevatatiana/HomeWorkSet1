package passport;

import java.util.Objects;

public class Passport {
    private final int number;
    private final String lastName;
    private final String name;
    private final String middleName;
    private final java.time.LocalDate LocalDate;

    public Passport(int number, String lastName, String name, String middleName, java.time.LocalDate localDate) {
        this.number = number;
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        LocalDate = localDate;
    }

    public int getNumber() {
        return number;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public java.time.LocalDate getLocalDate() {
        return LocalDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
