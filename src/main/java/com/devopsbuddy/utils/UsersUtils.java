package com.devopsbuddy.utils;

import com.devopsbuddy.backend.persistence.domain.backend.User;

/**
 * Created by lede on 8/5/16.
 */
public class UsersUtils {

    private UsersUtils() {
        throw new AssertionError("Non instantiable");
    }

    public static User createBasicUser() {
        User user = new User();

        user.setUsername("basicUser");
        user.setPassword("secret");
        user.setEmail("me@example.com");
        user.setFirstName("firstName");
        user.setLastName("lastName");
        user.setPhoneNumber("123456789");
        user.setCountry("GB");
        user.setEnabled(true);
        user.setDescription("A basic user");
        user.setProfileImageUrl("https://blabla.images.com/basicuser");

        return user;

    }
}
