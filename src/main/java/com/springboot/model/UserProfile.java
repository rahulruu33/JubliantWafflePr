package com.springboot.model;

// Ensure to add the required Lombok dependency in the `pom.xml` (for Maven)
//import lombok.Data;
import org.springframework.context.annotation.Configuration;

//@Data
public class UserProfile {
    private long id;
    private String name;
    private String email;
    private String subscriptionType;
    private String avatar;

    public UserProfile(long id, String name, String email, String subscriptionType, String avatar) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.subscriptionType = subscriptionType;
        this.avatar = avatar;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
