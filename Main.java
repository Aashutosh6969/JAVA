import model.Result;
import model.Student;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Result student1_result = new Result(100,94,80);
        Result student2_result = new Result(96,94,79);
        Result student3_result = new Result(100,80,80);
        Result student4_result = new Result(93,72,84);
        Result student5_result = new Result(94,71,85);
        Result student6_result = new Result(95,70,86);
        Result student7_result = new Result(96,79,87);
        Result student8_result = new Result(97,78,88);

        ArrayList<Result> stdents1 = new ArrayList<>();
        stdents1.add(student1_result);
        ArrayList<Result> stdents2 = new ArrayList<>();
        stdents1.add(student2_result);
        ArrayList<Result> stdents3 = new ArrayList<>();
        stdents1.add(student3_result);
        ArrayList<Result> stdents4 = new ArrayList<>();
        stdents1.add(student4_result);
        ArrayList<Result> stdents5 = new ArrayList<>();
        stdents1.add(student5_result);
        ArrayList<Result> stdents6 = new ArrayList<>();
        stdents1.add(student6_result);
        ArrayList<Result> stdents7 = new ArrayList<>();
        stdents1.add(student7_result);
        ArrayList<Result> stdents8 = new ArrayList<>();
        stdents1.add(student8_result);


        Student student1 = new Student(stdents1,1,"Hari",1);
        Student student2 = new Student(stdents2,2,"Shyam",2);
        Student student3 = new Student(stdents3,3,"Ram",3);
        Student student4 = new Student(stdents4,4,"Sita",4);
        Student student5 = new Student(stdents4,5,"Sam",5);
        Student student6 = new Student(stdents4,6,"Prasoon",6);
        Student student7 = new Student(stdents4,7,"Ashraya",7);
        Student student8 = new Student(stdents4,8,"Ishan",8);

        ArrayList<Student> lobutche = new ArrayList<>();
        lobutche.add(student1);
        lobutche.add(student2);
        lobutche.add(student3);
        lobutche.add(student4);


        ArrayList<Student> khumbila = new ArrayList<>();
        khumbila.add(student5);
        khumbila.add(student6);
        khumbila.add(student7);
        khumbila.add(student8);


    }

}
