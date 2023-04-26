package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        StudentsStreamFilter st1 = new StudentsStreamFilter("Ivan", 'm', 22, 3, 8.3);
        StudentsStreamFilter st2 = new StudentsStreamFilter("Alex", 'm', 23, 4, 7.3);
        StudentsStreamFilter st3 = new StudentsStreamFilter("Anna", 'f', 21, 2, 9.4);
        StudentsStreamFilter st4 = new StudentsStreamFilter("Lisa", 'f', 24, 5, 4.6);
        StudentsStreamFilter st5 = new StudentsStreamFilter("Peter", 'm', 19, 1, 7.2);

        List<StudentsStreamFilter> students = new ArrayList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        students = students.stream().filter(element
                        -> element.getAge() > 20 && element.getAvgGrade() > 5.0)
                .collect(Collectors.toList());
        //System.out.println(students);


    }
}


