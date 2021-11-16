package com.huangminghao.CompareTo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/11/01
 * @Time:20:55
 */

public class Code01_Comparator {
    public static class Student {
        public String name;
        public int age;
        public String gender;

        public Student(String name, Integer age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
    }
    //比较器：
    //compare方法里，尊混一个规范
    //返回负数的时候，认为第一个参数排在前面
    //返回正数的时候，认为第二个参数排在前面
    //返回0的时候，两个参数怎么排无所谓
    public static class AgeComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
//            if (o1.age < o2.age) {
//                return -1;
//            } else if (o1.age > o2.age) {
//                return 1;
//            } else {
//                return 0;
//            }
            return o1.age - o2.age;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("A", 12, "男");
        Student student2 = new Student("B", 9, "女");
        Student student3 = new Student("C", 10, "男");
        Student[] students = new Student[] {student1, student2, student3};
        Arrays.sort(students, new AgeComparator());
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.name + "," + s.age + "," + s.gender);
        }

    }
}
