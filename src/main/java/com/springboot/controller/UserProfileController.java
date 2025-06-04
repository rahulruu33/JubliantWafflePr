package com.springboot.controller;

import com.springboot.model.UserProfile;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/user-profiles")
public class UserProfileController {
    private final List<UserProfile> userProfiles = new ArrayList<>();

    // Simulate some pre-defined user profiles for the sake of this example
    public UserProfileController() {
        userProfiles.add(new UserProfile(1, "John Doe", "john.doe@example.com", "Premium", "avatar1.png"));
        userProfiles.add(new UserProfile(2, "Jane Doe", "jane.doe@example.com", "Basic", "avatar2.png"));
    }
    // Endpoint to get all user profiles
    @GetMapping
    public List<UserProfile> getUserProfiles() {
        return userProfiles;
    }

    // Endpoint to delete a user profile by ID
    @DeleteMapping("/{id}")
    public void deleteUserProfile(@PathVariable long id) {
        userProfiles.removeIf(profile -> profile.getId() == id);
    }

}
