package com.s22034.goldys;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaFileReader {

    private final String FILE_PATH = "C:\\Users\\MM\\IdeaProjects\\mg_labs13\\src\\com\\s22034\\goldys\\JavaFile.java";

    String[] tableOfJavaWords = {"while", "int", "private" ,"do," ,"import"};
    int[] tableOfCounters = new int[tableOfJavaWords.length];

    void runJavaFileReader(){

        try{
            FileReader fileReader = new FileReader(FILE_PATH);
            int data = fileReader.read();
            StringBuilder stringBuilder = new StringBuilder();
            while (data != -1){
                stringBuilder.append((char) data);
                data = fileReader.read();
            }

            String tmp = stringBuilder.toString();

            String[] words = tmp.split("\\P{L}+");

            for(String s : words){
                for(int i = 0; i < tableOfJavaWords.length; i++){
                    if (s.equals(tableOfJavaWords[i])){
                        tableOfCounters[i] += 1;
                    }
                }
            }

            System.out.println(
                    stringBuilder
            );

            for(int i = 0; i < tableOfCounters.length; i++){

                System.out.println(
                        "Slowo kluczowe: " + tableOfJavaWords[i] + ", wystapilo: " + tableOfCounters[i]
                );

            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}