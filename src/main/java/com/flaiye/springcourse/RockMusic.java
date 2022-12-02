package com.flaiye.springcourse;

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
