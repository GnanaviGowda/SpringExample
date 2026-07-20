package com.loose.coupling;

import com.ioc.coupling.UserDataProvider;

public class WebServiceDataProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "Fetching Data From WebService";
    }
}
