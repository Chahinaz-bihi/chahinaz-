package ext;

import org.springframework.stereotype.Component;


import dao.IDao;
@Component("dao2")
public class DaoImpV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Vesrion web service");
        double t = 77;
        return t;
    }
}
