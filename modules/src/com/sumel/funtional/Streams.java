package com.sumel.funtional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> curos = UtilNames.getList("Perl", "Python", "Java");
        for (String course: curos){
            System.out.println("Cursos para hoy: "+course);
        }

        Stream<String> courseStreams = Stream.of("Perl", "Python", "Java");
        //Stream<Integer> lengtCourses = courseStreams.map(course->course.length());
        //Optional<Integer> longest = lengtCourses.max((x, y)->y-x);

        Stream<String> enfasisStreamCursos = courseStreams.map(curso->curso+"!");
        enfasisStreamCursos.forEach(System.out::println);

       // Stream<String> justJava = courseStreams.filter((curso-> curos.contains("Java")));
        /*
        Stream<String> coursesStream = curos.stream();
        coursesStream.map(course->course+"!!")
                .filter(course->course.contains("Java"))
                .forEach(System.out::println);*/

        Stream<String> coursesStream = curos.stream();
        addOperator(
                coursesStream.map(course->course+"!!")
                .filter(course->course.contains("Java"))).forEach(System.out::println);
    }

    static <T> Stream<T> addOperator(Stream<T> stream){
        //Esta operacion solo permite ver los datos. Sin moficar o alterar el Stram
        return stream.peek(dato-> System.out.println("Dato: "+dato));
    }
}
