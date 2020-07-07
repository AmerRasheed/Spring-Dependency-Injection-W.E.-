package org.example.model;

import java.util.Objects;

public class AppUser {
    private int UserId;
    private String email;
    private String password;
    private String name;

    public AppUser(int userId, String email, String password, String name) {
        UserId = userId;
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public int getUserId() {
        return UserId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return UserId == appUser.UserId &&
                Objects.equals(email, appUser.email) &&
                Objects.equals(name, appUser.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UserId, email, name);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "UserId=" + UserId +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
