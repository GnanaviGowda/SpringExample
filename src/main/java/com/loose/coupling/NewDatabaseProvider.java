package com.loose.coupling;

import com.ioc.coupling.UserDataProvider;

public class NewDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "New Database in action";
    }
}
