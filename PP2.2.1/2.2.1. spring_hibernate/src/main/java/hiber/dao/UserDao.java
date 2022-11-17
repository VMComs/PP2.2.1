package hiber.dao;

import hiber.model.User;
import hiber.model.Car;

import java.util.List;

public interface UserDao {
   void addUser(User user);
   List<User> getUsersList();

   List<User> getUserByCar(String model, int series);
}
