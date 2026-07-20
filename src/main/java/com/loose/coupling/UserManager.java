package com.loose.coupling;

import com.ioc.coupling.UserDataProvider;

public class UserManager {
    private com.ioc.coupling.UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo(){
        return userDataProvider.getUserDetails();
    }
}
