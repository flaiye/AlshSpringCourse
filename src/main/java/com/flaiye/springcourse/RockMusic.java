package com.flaiye.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    public void initRock() {
        System.out.println("Bean initialized!");
    }

    public void destroyRock(){
        System.out.println("Bean destroyed!");
    }

    @Override
    public String getSong() {
        return "Smoke On The Water";
    }
}
