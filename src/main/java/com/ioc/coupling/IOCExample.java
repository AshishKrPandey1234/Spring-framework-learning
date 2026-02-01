package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIoCLooseCouplingExample.xml");
    //      UserDataProvider databaseProvider=new UserDatabaseProvider();
    //    UserManager userManagerWithDB=new UserManager(databaseProvider);
        UserManager userManagerWithDB=(UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());
        //        UserDataProvider webserviceProvider=new WebServiceDataProvider();
        //        UserManager userManagerWithWebservice=new UserManager(webserviceProvider);
        UserManager userManagerWithWS=(UserManager) context.getBean("userManagerWithWebServiceProvider");
        System.out.println(userManagerWithWS.getUserInfo());


//        UserDataProvider newDatabaseProvider=new NewDatabaseProvider();
//        UserManager newDatabaseManagerWithNewDB=new UserManager(newDatabaseProvider);
        UserManager userManagerWithNewDB=(UserManager) context.getBean("userManagerWithNewDatabaseProvider");
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}
