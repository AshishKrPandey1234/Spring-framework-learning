package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider databaseProvider=new UserDatabaseProvider();
        UserManager userManagerWithDB=new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());
        UserDataProvider webserviceProvider=new WebServiceDataProvider();
        UserManager userManagerWithWebservice=new UserManager(webserviceProvider);
        System.out.println(userManagerWithWebservice.getUserInfo());

        UserDataProvider newDatabaseProvider=new NewDatabaseProvider();
        UserManager newDatabaseManagerWithNewDB=new UserManager(newDatabaseProvider);
        System.out.println(newDatabaseManagerWithNewDB.getUserInfo());
    }
}
