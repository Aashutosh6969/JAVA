package model;

import java.util.ArrayList;

public class Student {
   ArrayList<Result> result = new ArrayList<>();
    int student_id;
    String name;

    public ArrayList<Result> getResult() {
        return result;
    }

    public void setResult(ArrayList<Result> result) {
        this.result = result;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    int roll_no;

    public Student(ArrayList<Result> result, int student_id, String name, int roll_no) {
        this.result = result;
        this.student_id = student_id;
        this.name = name;
        this.roll_no = roll_no;
    }







}
