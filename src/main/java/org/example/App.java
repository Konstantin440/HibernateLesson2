package org.example;

import org.example.dao.AutoDao;
import org.example.entity.Auto;
import org.example.entity.Engine;
import org.example.util.HibernateUtil;


public class App {
    public static void main( String[] args ) {
        AutoDao autoDao = new AutoDao();

        Engine engine = new Engine(300,"Дизель");
        Engine engine1 = new Engine(200,"Форза");

       Auto auto = new Auto( "БМВ", engine );
       Auto auto1 = new Auto("Феррари",engine1);

       autoDao.create(auto);
       autoDao.create(auto1);

       Auto auto2 = autoDao.read(1);

       auto2.setModel("Мицубиcи");
       autoDao.update(auto2);

       HibernateUtil.closeSessionFactory();




    }
}
