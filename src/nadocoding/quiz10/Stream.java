package nadocoding.quiz10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
        //스트림
        int[] scores = {100, 95, 90, 85, 80};
        IntStream langStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        java.util.stream.Stream<String> stream = Arrays.stream(langs);

        List<String> langList = new ArrayList<>();
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
        System.out.println(langList.size());

        java.util.stream.Stream<String> langListStream = langList.stream();

        //90점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x-> System.out.println(x));
//        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("-------------------------------------");

        //90점 이상인 사람의 수
        int count= (int) Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("-------------------------------------");

        //90점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("-------------------------------------");

        //90점 이상인 점수들을 정렬
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("-------------------------------------");


        //"python", "java", "javascript", "C", "c++", "c#"
        //c로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x-> x.startsWith("c")).forEach(System.out::println);
        System.out.println("-------------------------------------");

        //java라는 글자를 포함하는 언ㅇ
        Arrays.stream(langs).filter(x-> x.contains("java")).forEach(System.out::println);
        System.out.println("-------------------------------------");

        // 4글자 이하의 언어를 정렬해서 출력
        langList.stream().filter(x -> x.length() <=4).sorted().forEach(System.out::println);
        System.out.println("-------------------------------------");

        //4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어
        langList.stream().filter(x-> x.length()<=4).filter(x-> x.contains("c")).forEach(System.out::println);
        System.out.println("-------------------------------------");

        //4글자 이하의 언어중에서 c라는 글자를 포함하는 언어가 하나라도 있는지 여부
        boolean anyMach = langList.stream().filter(x->x.length()<=4).anyMatch(x->x.contains("c"));
        System.out.println(anyMach);
        System.out.println("-------------------------------------");

        //4글자 이하의 언어들은 모두 c라는 글자를 포함하는지 여부
        boolean allMatch = langList.stream().filter(x->x.length()<=3).allMatch(x->x.contains("c"));
        System.out.println(allMatch);
        System.out.println("-------------------------------------");

        //4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 함께 출력
        //map : 우리가 사용하는 데이터를 원하는 데이터를 가공하거나 데이터중에서 객체중에서 내가 꺼내고 싶은 인스턴스를 지정해주는 역할
        langList.stream().filter(x->x.length()<=4).filter(x->x.contains("c")).map(x->x+"(어려워요)").forEach(System.out::println);
        System.out.println("-------------------------------------");

        //c라는 글자를 포함하는 언어를 대문자로 출력
        langList.stream().filter(x->x.contains("c")).map(String::toUpperCase).forEach(System.out::println);
        System.out.println("--------------------------------");

        //c라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        List<String> langListStreamsWithC = langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        langListStreamsWithC.stream().forEach(System.out::println);

    }
}
