package com.springboot_app.spring_first_app.Service;

import com.springboot_app.spring_first_app.Model.User;
import com.springboot_app.spring_first_app.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
@Autowired
    private UserRepository userRepository;
    public List<User> getusers(){
        return userRepository.findAll();
    }
    public void saveUser(User user){
       userRepository.save(user);
    }

    public void updateUser(User user, long id) {
        User user1 = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user1.setFirstName(user.getFirstName());
        user1.setLastName(user.getLastName());
        user1.setEmail(user.getEmail());
        user1.setPhoneNumber(user.getPhoneNumber());
        userRepository.save(user1);
    }
   public void deleteUser(long id){
        userRepository.deleteById(id);
     }
}
