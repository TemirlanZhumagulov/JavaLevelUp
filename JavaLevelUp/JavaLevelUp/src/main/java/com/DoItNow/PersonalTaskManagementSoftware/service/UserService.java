//package com.DoItNow.PersonalTaskManagementSoftware.service;
//
//import com.DoItNow.PersonalTaskManagementSoftware.model.UserModel;
//import com.DoItNow.PersonalTaskManagementSoftware.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//    @Autowired
//    private final UserRepository userRepository;
//
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public UserModel registerUser(String login, String password, String email) {
//        if (login == null || password == null) {
//            return null;
//        } else {
//            if (userRepository.findFirstByLogin(login).isPresent()) {
//                System.out.println("Duplicate login");
//                return null;
//            }
//            UserModel userModel = new UserModel();
//            userModel.setLogin(login);
//            userModel.setPassword(password);
//            userModel.setEmail(email);
//            return userRepository.save(userModel);
//        }
//    }
//
//    public UserModel authenticate(String login, String password) {
//        return userRepository.findByLoginAndPassword(login, password).orElse(null);
//    }
//}
