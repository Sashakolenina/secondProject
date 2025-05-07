package hiber.service;

import hiber.dao.UserDao;
import hiber.model.Car;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Override
    public User getUserByCarModelAndSeries(String model, int series) {
        return userDao.getUserByCarModelAndSeries(model, series);
    }

   @Autowired
   private UserDao userDao;

    @Override
    public Car getUserByCar(String model, int series) {
        return userDao.getUserByCar(model, series);
    }

    @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }

    @Override
    public void getUserByCar(Car car) {

    }

}
