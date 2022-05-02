package com.DoItNow.PersonalTaskManagementSoftware.controller;

import com.DoItNow.PersonalTaskManagementSoftware.model.UserModel;
import com.DoItNow.PersonalTaskManagementSoftware.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/login")
    public String showLoginPage(){
        Authentication authentication =  SecurityContextHolder.getContext().getAuthentication();
        if(authentication == null || authentication instanceof AnonymousAuthenticationToken){
            return "login_page";
        }
        return "redirect:/";
    }

    @GetMapping("/register")
    public String showSignUpPage(Model model){
        model.addAttribute("user", new UserModel());
        return "register_page";
    }

    @PostMapping("/process_register")
    public String processRegister(UserModel user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepository.save(user);
        return "redirect:/login";
    }

    @GetMapping("/list_users")
    public String viewUsersList(Model model){
        return "levels_page";
    }

//    @Autowired
//    private final UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/register")
//    public String getRegisterPage(Model model){
//        model.addAttribute("registerRequest", new UserModel());
//        return "register_page";
//    }
//
//    @GetMapping("/login")
//    public String getLoginPage(Model model){
//        model.addAttribute("loginRequest", new UserModel());
//        return "login_page";
//    }
//
//    @PostMapping("/register")
//    public String register(@ModelAttribute UserModel userModel){
//        System.out.println("register request " + userModel);
//        UserModel registeredUser = userService.
//                registerUser(userModel.getLogin(),userModel.getPassword(),userModel.getEmail());
//        return registeredUser != null ? "redirect:/login" : "duplicate_data";
//    }
//
//    @PostMapping("/login")
//    public String login(@ModelAttribute UserModel userModel, Model model){
//        System.out.println("login request " + userModel);
//        UserModel authenticatedUser = userService.
//                authenticate(userModel.getLogin(),userModel.getPassword());
//        if(authenticatedUser != null){
//            model.addAttribute("userLogin", authenticatedUser.getLogin());
//            return "personal_page";
//        } else{
//            return "error_page";
//        }
//    }

}
