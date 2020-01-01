package com.kodilla;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Calculations {

    public double calculateBestAverage(Map<Student, Grades> scores) {
        double bestAverage = 0;
        double bestAverage1 = 0;
        double bestAverage2 = 0;
        double bestAverage3 = 0;
        double currentAverage = 0;

        for (Map.Entry<Student, Grades> entry : scores.entrySet()) {
            bestAverage1 = +entry.getValue().getEnglish().stream().mapToDouble(Integer::doubleValue).sum();
            ;
            bestAverage2 = +entry.getValue().getMaths().stream().mapToDouble(Integer::doubleValue).sum();
            ;
            bestAverage3 = +entry.getValue().getPhysics().stream().mapToDouble(Integer::doubleValue).sum();
            ;
            currentAverage =  ((bestAverage1 + bestAverage2 + bestAverage3) / (entry.getValue().getEnglish().size() + entry.getValue().getPhysics().size() + entry.getValue().getMaths().size()));
            if ( currentAverage >bestAverage){
                bestAverage = currentAverage;
            }

        }
        return bestAverage;
    }

    public List<String> findStudentsNamesWithBestAverage(Map<Student, Grades> scores) {

        double bestAverage = 0;
        double bestAverage1 = 0;
        double bestAverage2 = 0;
        double bestAverage3 = 0;
        double currentAverage = 0;
        String name = "";
        List <String> result = new ArrayList<>();

        for (Map.Entry<Student, Grades> entry : scores.entrySet()) {
            bestAverage1 = +entry.getValue().getEnglish().stream().mapToDouble(Integer::doubleValue).sum();
            ;
            bestAverage2 = +entry.getValue().getMaths().stream().mapToDouble(Integer::doubleValue).sum();
            ;
            bestAverage3 = +entry.getValue().getPhysics().stream().mapToDouble(Integer::doubleValue).sum();
            ;
            currentAverage =  ((bestAverage1 + bestAverage2 + bestAverage3) / (entry.getValue().getEnglish().size() + entry.getValue().getPhysics().size() + entry.getValue().getMaths().size()));
            if ( currentAverage >= bestAverage){
                bestAverage = currentAverage;
                result.add(entry.getKey().getFirstName()+" " +entry.getKey().getLastName());
            }

        }
        return result;
    }

    public List<Student> findStudentsWhichSpeakPolishWithAverageFromMathAbove4(Map<Student, Grades> scores) {
        double bestAverage = 0;
        double bestAverage1 = 0;
        double bestAverage2 = 0;
        double bestAverage3 = 0;
        double currentAverage = 0;
        String name = "";
        List <Student> result = new ArrayList<>();

        for (Map.Entry<Student, Grades> entry : scores.entrySet()) {

            bestAverage2 = +entry.getValue().getMaths().stream().mapToDouble(Integer::doubleValue).sum();
            ;

            currentAverage =  ((bestAverage2 ) / (entry.getValue().getMaths().size()));
            if ( (currentAverage >= 4)&&(entry.getKey().getLanguage().equals("PL"))){
                bestAverage = currentAverage;
                result.add(entry.getKey());
            }

        }
        return result;
    }

}
