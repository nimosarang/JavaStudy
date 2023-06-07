package chunjae;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("학생 이름을 입력하세요 : ");
            String name = scanner.next();
            System.out.println("학생 성적을 입력하세요 : ");
            int score = scanner.nextInt();
            students.add(new Student(name, score));
        }

        int total = students.stream().mapToInt(Student::getScore).sum();
        int average = (int) students.stream().mapToInt(Student::getScore).average().orElse(0);
        int max = students.stream().mapToInt(Student::getScore).max().orElse(0);
        int min = students.stream().mapToInt(Student::getScore).min().orElse(0);

        printScore(total, average, max, min);
    }

    private static void printScore(int total, double average, int max, int min) {
        System.out.println("총점: " + total);
        System.out.println("평균: " + average);
        System.out.println("최고 점수: " + max);
        System.out.println("최저 점수: " + min);
    }
}
