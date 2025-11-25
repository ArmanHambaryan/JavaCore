package homework.user;

import java.util.Objects;

public class User {

    private String name;
    private String surName;
    private String email;
    private String parol;

    public User() {
    }

    public User(String name, String surName, String email, String parol) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.parol = parol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParol() {
        return parol;
    }

    public void setParol(String parol) {
        this.parol = parol;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(surName, user.surName) && Objects.equals(email, user.email) && Objects.equals(parol, user.parol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, email, parol);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", email='" + email + '\'' +
                ", parol='" + parol + '\'' +
                '}';
    }

}
