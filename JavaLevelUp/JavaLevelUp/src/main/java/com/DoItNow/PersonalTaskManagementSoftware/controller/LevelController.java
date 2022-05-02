package com.DoItNow.PersonalTaskManagementSoftware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LevelController {

    @GetMapping("/levels")
    public String levels(){
        return "levels_page";
    }

    @GetMapping("/levels/level1")
    public String level1(){

        return "/levels/level1";
    }

    @GetMapping("/levels/level2")
    public String level2(){return "/levels/level2";}

    @GetMapping("/levels/level3")
    public String level3(){return "/levels/level3";}

    @GetMapping("/levels/level4")
    public String level4(){return "/levels/level4";}
    @GetMapping("/levels/level5")
    public String level5(){return "/levels/level5";}

    @GetMapping("/levels/level6")
    public String level6(){return "/levels/level6";}

    @GetMapping("/levels/level7")
    public String level7(){return "/levels/level7";}

    @GetMapping("/levels/level8")
    public String level8(){return "/levels/level8";}

    @GetMapping("/levels/level9")
    public String level9(){return "/levels/level9";}

    @GetMapping("/levels/level10")
    public String level10(){return "/levels/level10";}

}
