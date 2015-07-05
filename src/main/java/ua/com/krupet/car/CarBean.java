package ua.com.krupet.car;

import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

/**
 * Created by krupet on 05.07.2015.
 */
@ManagedBean
@SessionScoped
public class CarBean {

    @Autowired
    CarDao carDao;

    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<String> fetchCarDetails() {

        return carDao.getCarDetails();
    }
}
