package com.rafiquebro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student(
                "Huzaifa Rafique",
                "19K-1081",
                "SE",
                6,
                525,
                600
                );
       /*
        s1.setName("Bro");
        System.out.println(s1.getName());
       */
        System.out.println("NAME: "+s1.name);
        System.out.println("ID: "+s1.id);
        System.out.println("Department ID: "+s1.depName);
        System.out.println("Total no. of Subjects: "+s1.sixSub);
        System.out.println("Marks Obtained: "+s1.obtainMarks);
        System.out.println("Total Marks: "+s1.totalMarks);
        s1.setSixSub(s1.sixSub);
        s1.setCal();
    }

    static class Student {

        Scanner input = new Scanner(System.in);

        String name;
        String id;
        String depName;
        int sixSub;
        double obtainMarks;
        double totalMarks;

        /*
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
*/

        Student(String name,
                String id,
                String depName,
                int sixSub,
                double obtainMarks,
                double totalMarks) {
            this.name = name;
            this.id = id;
            this.depName = depName;
            this.sixSub = sixSub;
            this.obtainMarks = obtainMarks;
            this.totalMarks = totalMarks;
        }

        void setSixSub(int a) {
            System.out.println("Total no. of subjects: " + a);
            System.out.println("Enter Subject Names:");
            ArrayList<String> List;
            List = new ArrayList<>();
            for (int i = 0; i < a; i++) {
                System.out.print(i + 1 + ". ");
                String userInputSub = input.nextLine();
                List.add(userInputSub);
            }

        }

        void setCal() {
            double result = (obtainMarks / totalMarks) * 100;
            System.out.println("Result: " + result);
            System.out.print("Grade: ");
            switch ((int) result / 10) {
                case 9:
                    if (result >= 90 && result > 100) {
                        System.out.println("A");
                    }
                    break;
                case 8:
                    if (result >= 80 && result <= 89) {
                        System.out.println("B");
                    }
                    break;
                case 7:
                    if (result >= 70 && result <= 79) {
                        System.out.println("C");
                    }
                    break;
                case 6:
                    if (result >= 60 && result <= 69) {
                        System.out.println("D");
                    }
                    break;
                case 5:
                    if (result >= 50 && result <= 59) {
                        System.out.println("F");
                    }
                    break;
                default:
                    System.out.println("Grade Not Found");
                    break;
            }
        }
    }
}