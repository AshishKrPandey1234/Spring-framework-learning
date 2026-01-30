package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        //directly access database here
        return "User Details from the Database";
    }
}
