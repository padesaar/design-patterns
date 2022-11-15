package org.example.singleton.exercises;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//lazy singleton
public class Student {
    private static Student instance;
    private static boolean isAdded = false;
    private final List<String> STUDENTS_LIST;

    private Student() {
        STUDENTS_LIST = new ArrayList<>();
    }

    public boolean addStudents(String studentName) {
        if((studentName.startsWith("Senior") || studentName.startsWith
                ("junior")) && !STUDENTS_LIST.contains(studentName)) {
                    return STUDENTS_LIST.add(studentName);
        }
       return false;
    }


    public List<String> getSeniors() {
        return STUDENTS_LIST.stream()
                .filter(student -> student.startsWith("senior"))
                .collect(Collectors.toList());
    }
    public List<String> getJuniors() {
        return STUDENTS_LIST.stream()
                .filter(student -> student.startsWith("junior"))
                .collect(Collectors.toList());
    }

    public Student getInstance() {
        if (instance == null) {
            instance = new Student();
        }
        return instance;
    }
}


/*
public class Students {
    private  static final Students INSTANCE = new Students(); // esimene erinevus
    private final List<String> STUDENT_LIST;
    private boolean isAdded = false;

    private static String prefix;

    private Students() {
        STUDENT_LIST = new ArrayList<>();

    }

    //If student name is prefixed junior or senior we add them to the list
    //as long as they have not been added already
    public boolean addStudent(String studentName) {
        if ((studentName.startsWith("senior") || studentName.startsWith("junior")) && !STUDENT_LIST.contains(studentName)) {
            return STUDENT_LIST.add(studentName);
        }
        return false;
    }

    public List<String> getSeniors() {
        return STUDENT_LIST.stream()
                .filter(student -> student.startsWith("senior"))
                .collect(Collectors.toList());
    }

    public List<String> getJuniors() {
        return STUDENT_LIST.stream()
                .filter(student -> student.startsWith("junior"))
                .collect(Collectors.toList());
    }

    public Students getInstance() { //see on teine erinevus
        return INSTANCE;
    }


}


 */