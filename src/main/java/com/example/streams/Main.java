package com.example.streams;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        VolcanoAnalyzer volcanoAnalyzer = null;
        try {
            volcanoAnalyzer = new VolcanoAnalyzer();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //volcanoAnalyzer.volcanoes.forEach(System.out::println);
        //volcanoAnalyzer.eruptedIn1970s().forEach(System.out::println);
        //System.out.println(volcanoAnalyzer.percentageOfMudflow());
        //volcanoAnalyzer.getEruptionNames(5967).forEach(System.out::println);
        volcanoAnalyzer.getTemDeadlyEruptions();
    }



}
