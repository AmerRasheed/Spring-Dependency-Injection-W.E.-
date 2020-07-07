package org.example.data;

import org.example.model.AppUser;

public interface AppUserDAO {

    AppUser createNewAppUser(String email, String password, String name);
}
