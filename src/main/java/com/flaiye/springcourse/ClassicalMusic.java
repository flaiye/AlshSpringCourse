package com.flaiye.springcourse;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void initRock() {
        System.out.println("Bean initialized!");
    }

    public void destroyRock() {
        System.out.println("Bean destroyed!");
    }

    @Override
    public String getSong() {
        return "Rondo Alla Turca";
    }
}
