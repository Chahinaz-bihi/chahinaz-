package dao;

import org.springframework.stereotype.Component;
@Component("dao")
public class Daolmpl implements IDao{


    @Override
    public double getData() {
        System.out.println("Version Base de donées");
        double t=23;
        return t;
    }
}
