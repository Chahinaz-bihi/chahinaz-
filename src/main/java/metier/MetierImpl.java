package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{

   private IDao dao;//couplage faible

    //Injection des dépendences via le constructeur
    public MetierImpl (@Qualifier ("dao2") IDao dao) {
        this.dao = dao;
    }



    @Override
    public double calcul() {
       double t=dao.getData();
        return t*43/3;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
