package com.spring.api.rest.connection.Entity;
import javax.persistence.*;
import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "user_tbl")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String role;
    private String password;
    private String salt;
    private String email;
    private String resetPassword;
    private LocalTime deactivateReset;



    public User() {
    }
    public User(String name, String role, String password, String salt, String email) {
        this.name = name;
        this.role = role;
        this.password = password;
        this.salt = salt;
        this.email = email;
        this.resetPassword = resetPassword;
        this.deactivateReset = deactivateReset;
    }

    public String getResetPassword() {
        return resetPassword;
    }

    public void setResetPassword(String resetPassword) {
        this.resetPassword = resetPassword;
    }

    public LocalTime getDeactivateReset() {
        return deactivateReset;
    }

    public void setDeactivateReset(LocalTime deactivateReset) {
        this.deactivateReset = deactivateReset;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
        User user = (User) o;
        return id.equals(user.id) &&
                name.equals(user.name) &&
                role.equals(user.role) &&
                password.equals(user.password) &&
                salt.equals(user.salt) &&
                email.equals(user.email) &&
                Objects.equals(resetPassword, user.resetPassword) &&
                Objects.equals(deactivateReset, user.deactivateReset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, role, password, salt, email, resetPassword, deactivateReset);
    }
}