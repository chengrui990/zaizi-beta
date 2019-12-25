package com.crui.zaizi.member.controller;

import java.util.Random;

/**
 * VM Args:
 *
 * @author crui
 */
public class RandomPeople {
    public static void main(String[] args) {
        Random colRandom = new Random();
        Random rowRandom = new Random();
        int col = colRandom.nextInt(4)+1;
        int row = rowRandom.nextInt(8) + 1;
        System.out.println("有请" + col + "排" + row + "列");
    }
}
