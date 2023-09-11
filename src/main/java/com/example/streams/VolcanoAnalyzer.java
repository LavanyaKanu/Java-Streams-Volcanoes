package com.example.streams;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class VolcanoAnalyzer {

    public List<Volcano> volcanoes;

    public VolcanoAnalyzer() throws FileNotFoundException {
        
        BufferedReader bufferedReader = new BufferedReader(new FileReader(getFileFromResources("volcanoes.json")));
        volcanoes = new Gson().fromJson(bufferedReader, new TypeToken<ArrayList<Volcano>>() {
        }.getType());

    }

    // get file from classpath, resources folder
    private File getFileFromResources(String fileName) {

        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }

    }

    public List<Volcano> eruptedIn1970s(){
        return volcanoes.stream().filter(volcano -> volcano.getYear() <= 1979 && volcano.getYear() >= 1970).toList();
    }

    public double percentageOfMudflow(){
        long mudFlowCount =  volcanoes.stream().filter(volcano -> "M".equals(volcano.getAgent())).count();
        double totalVolcanoes = (double)volcanoes.size();
        return volcanoes.size() == 0 ? 0.0 : mudFlowCount * 100.0 / totalVolcanoes;
    }

    public List<String> getEruptionNames(int elevationThreshold){
        return volcanoes.stream()
                .filter(volcano -> volcano.getElevation() >= elevationThreshold)
                .map(volcano -> volcano.getName())
                .collect(Collectors.toList());
    }

    public List<Volcano> getTemDeadlyEruptions() {
        List<String> deadlyVolcano = new ArrayList<>();
        List<Volcano> topTenDeadlyEruptions = volcanoes.stream()
                .sorted(Comparator.comparingInt(Volcano::getDEATHS).reversed()).limit(10)
                .collect(Collectors.toList());
        return topTenDeadlyEruptions;
    }
}
