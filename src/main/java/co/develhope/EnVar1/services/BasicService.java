package co.develhope.EnVar1.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class BasicService {

    @Autowired
    private Environment environment;

    public String getEnVars(){
        return "WELCOME!!! \nDEVNAME: "+environment.getProperty("myCustomVarTree.devName")+
                "\n AUTHCODE: "+environment.getProperty("myCustomVarTree.authCode");
    }
}
