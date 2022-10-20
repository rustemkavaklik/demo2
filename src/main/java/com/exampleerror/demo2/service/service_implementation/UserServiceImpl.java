package com.exampleerror.demo2.service.service_implementation;

import com.exampleerror.demo2.entity.Users;
import com.exampleerror.demo2.repository.UserRepository;
import com.exampleerror.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@NoArgsConstructor @AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;      //Crud operasyonlari (findAll(), saveAll(), findById()...) icin bu objeye ihtiyac var


    @Override
    public List<Users> getAllUsers() {
        return (List<Users>) userRepository.findAll();
    }

    @Override
    public Users getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public Users addOrUpdateUser(Users users) {
        return userRepository.save(users);
    }

    @Override
    public Users deleteUser(int userId) {
        Users deletedUser = null;
        try{
            deletedUser = userRepository.findById(userId).orElse(null);
            if(deletedUser==null){
                throw new Exception("User malesef bulunamadi.");
            }
        }catch (Exception e){
            e.getMessage();
        }
        return deletedUser ;
    }
}
