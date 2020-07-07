package org.example.data;

import org.example.model.AppUser;
import org.example.service.AppUserIdSequencer;

import java.util.ArrayList;
import java.util.List;

public class AppUserInMemoryStorage implements AppUserDAO{

    private List<AppUser> users = new ArrayList<>();

    private AppUserIdSequencer appUserIdSequencer;

    public AppUserInMemoryStorage(AppUserIdSequencer appUserIdSequencer) {
        this.appUserIdSequencer = appUserIdSequencer;
    }

    @Override
    public AppUser createNewAppUser(String email, String password, String name) {
    AppUser user = new AppUser(appUserIdSequencer.nextid(),email,password,name);

    if(!users.contains(user)){
        users.add(user);
    }
return user;
    }
}
