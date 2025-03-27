package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
   private IDao dao;//couplage faible

    //Injection des dépendences via le constructeur
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
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
