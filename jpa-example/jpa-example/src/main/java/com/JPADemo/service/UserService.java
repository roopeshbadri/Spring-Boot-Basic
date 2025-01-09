package com.JPADemo.service;
import java.util.List;
import java.util.ArrayList;
import com.JPADemo.model.UserRecord;
import com.JPADemo.repository.UserRepository;
//import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;
    public List<UserRecord> getAllUsers(){
        List<UserRecord> userRecords=new ArrayList<>();
        userRepository.findAll().forEach(userRecords::add);
        return userRecords;
    }
    public void addUser(UserRecord userRecord){
        userRepository.save(userRecord);
    }
}

