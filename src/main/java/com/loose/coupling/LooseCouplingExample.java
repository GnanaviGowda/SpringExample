package com.loose.coupling;

import com.ioc.coupling.NewDatabaseProvider;
import com.ioc.coupling.UserDataProvider;
import com.ioc.coupling.UserDatabaseProvider;
import com.ioc.coupling.UserManager;
import com.ioc.coupling.WebServiceDataProvider;

public class LooseCouplingExample {
    public static void main(String[] args) {
        com.ioc.coupling.UserDataProvider databaseProvider = new UserDatabaseProvider();
        com.ioc.coupling.UserManager userManagerWithDB = new com.ioc.coupling.UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        com.ioc.coupling.UserDataProvider webServiceProvider = new WebServiceDataProvider();
        com.ioc.coupling.UserManager userManagerWithWS = new com.ioc.coupling.UserManager(webServiceProvider);
        System.out.println(userManagerWithWS.getUserInfo());

        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
        com.ioc.coupling.UserManager userManagerWithNewDB = new UserManager(newDatabaseProvider);
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}
