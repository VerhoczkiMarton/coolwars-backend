package com.codecool.coolwarsbackend;

import com.codecool.coolwarsbackend.model.Dojo;
import com.codecool.coolwarsbackend.model.Language;
import com.codecool.coolwarsbackend.repository.DojoRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;

import static java.util.Map.entry;

@Component
@AllArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private DojoRepository dojoRepository;

    @Override
    public void run(String... args) {
        // Templates
        String title = "title";
        String description = "description";
        Map<Integer, Map<String, String>> templates = Map.ofEntries(
            entry(1, Map.ofEntries(
                entry(title, "Basic Calculator"),
                entry(description, "<p>Write a function that adds two numbers <code>(a, b)</code>, and returns the sum.</p>")
            )),
            entry(2, Map.ofEntries(
                    entry(title, "Boolean to Human"),
                    entry(description, "<p>Complete the method that takes a boolean value and return a <code>\"Yes\"</code> string for true, or a <code>\"No\"</code> string for <code>false</code>.</p>")
            )),
            entry(3, Map.ofEntries(
                    entry(title, "Multiples of 3 or 5"),
                    entry(description, "<p>If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.</p>" +
                            "<p>Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.</p>" +
                            "<p><strong>Note</strong>: If the number is a multiple of both 3 and 5, only count it once.</p>")
            )),
            entry(4, Map.ofEntries(
                    entry(title, "Scramblies"),
                    entry(description, "<p>Complete the function <code>scramble(str1, str2)</code> that returns <code>true</code> if a portion of <code>str1</code> characters can be rearranged to match <code>str2</code>, otherwise returns <code>false</code>.</p>")
            )),
            entry(5, Map.ofEntries(
                    entry(title, "Is a Number Prime?"),
                    entry(description, "<p>Define a function that takes an integer argument and returns logical value <code>True</code> or <code>False</code> depending on if the integer is a prime.</p>" +
                            "<p>Per Wikipedia, a prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself.</p>")
            )),
            entry(6, Map.ofEntries(
                    entry(title, "Tortoise Racing"),
                    entry(description, "<p>Two tortoises named <strong><em>A</em></strong> and <strong><em>B</em></strong> must run a race. <strong><em>A</em></strong> starts with an average speed of 720 feet per hour. Young <strong><em>B</em></strong> knows she runs faster than <strong><em>A</em></strong>, and furthermore has not finished her cabbage.</p>" +
                            "<p>When she starts, at last, she can see that <strong><em>A</em></strong> has a 70 feet lead but <strong><em>B</em></strong>'s speed is 850 feet per hour. How long will it take <strong><em>B</em></strong> to catch <strong><em>A</em></strong>?</p>" +
                            "<p>More generally: given two speeds <code>v1</code> (<strong><em>A</em></strong>'s speed, integer > 0) and <code>v2</code> (<strong><em>B</em></strong>'s speed, integer > 0) and a lead <code>g</code> (integer > 0) how long will it take <strong><em>B</em></strong> to catch <strong><em>A</em></strong>?</p>" +
                            "<p>The result will be an array <code>[hour, min, sec]</code> which is the time needed in hours, minutes and seconds (round down to the nearest second) or a string in some languages.</p>" +
                            "<p>If <code>v1 >= v2</code> then return <code>None</code>.</p>")
            )),
            entry(7, Map.ofEntries(
                    entry(title, "Which Are In?"),
                    entry(description, "<p>Given two arrays of strings <code>a1</code> and <code>a2</code> return a sorted array <code>r</code> in lexicographical order of the strings of <code>a1</code> which are substrings of strings of <code>a2</code>.</p>")
            )),
            entry(8, Map.ofEntries(
                    entry(title, "Left Rotation"),
                    entry(description, "<p>A left rotation operation on an array shifts each of the array's elements 1 unit to the left. For example, if 2 left rotations are performed on array <code>[1, 2, 3, 4, 5]</code>, then the array would become <code>[3, 4, 5, 1, 2]</code>.</p>" +
                            "<p>Given an array <code>a</code> of <code>n</code> integers and a number, <code>d</code>, perform <code>d</code> left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.</p>")
            )),
            entry(9, Map.ofEntries(
                    entry(title, "Sherlock and Anagrams"),
                    entry(description, "<p>Two strings are <em>anagrams</em> of each other if the letters of one string can be rearranged to form the other string. Given a string, find the number of pairs of substrings of the string that are anagrams of each other.</p>" +
                            "<p>For example <code>s = mom</code>, the list of all anagrammatic pairs is <code>[m, m], [mo, om]</code> at positions <code>[[0], [2]], [[0, 1], [1, 2]]</code> respectively.</p>")
            )),
            entry(10, Map.ofEntries(
                    entry(title, "Connected Cell in a Grid"),
                    entry(description, "<p>Consider a matrix where each cell contains either a 0 or a 1 and any cell containing a 1 is called a filled cell. Two cells are said to be connected if they are adjacent to each other horizontally, vertically, or diagonally. In the diagram below, the two colored regions show cells connected to the filled cells. Black on white are not connected.</p>" +
                            "<p>Cells adjacent to filled cells: <img src=\"https://s3.amazonaws.com/hr-assets/0/1528204809-ea89cbdef6-connected.png\" /></p>" +
                            "<p>If one or more filled cells are also connected, they form a region. Note that each cell in a region is connected to at least one other cell in the region but is not necessarily directly connected to all the other cells in the region.</p>" +
                            "<p>Regions: <img src=\"https://s3.amazonaws.com/hr-assets/0/1528205314-6fa4d1c8c7-connected2.png\" /></p>" +
                            "<p>Given an <code>n × m</code> matrix, find and print the number of cells in the largest region in the matrix.</p>")
            ))
        );

        // Python
        Dojo python1 = Dojo.builder()
                .language(Language.PYTHON)
                .title(templates.get(1).get(title))
                .description(templates.get(1).get(description))
                .starterCode(getPythonStarterCode("add(a, b)"))
                .runnerCode("\nprint(add(5,6))")
                .solution("11")
                .build();
        dojoRepository.saveAndFlush(python1);

        Dojo python2 = Dojo.builder()
                .language(Language.PYTHON)
                .title(templates.get(2).get(title))
                .description(templates.get(2).get(description))
                .starterCode(getPythonStarterCode("boolToWord(bool)"))
                .runnerCode("\nprint(boolToWord(False))")
                .solution("no")
                .build();
        dojoRepository.saveAndFlush(python2);

        // input --> 10
        // source --> https://www.codewars.com/kata/514b92a657cdc65150000006
        Dojo python3 = Dojo.builder()
                .language(Language.PYTHON)
                .title(templates.get(3).get(title))
                .description(templates.get(3).get(description))
                .starterCode(getPythonStarterCode("solution(number)"))
                .runnerCode("\nprint(solution(10))")
                .solution("23")
                .build();
        dojoRepository.saveAndFlush(python3);

        // input --> 'rkqodlw', 'world'
        // source --> https://www.codewars.com/kata/55c04b4cc56a697bb0000048
        Dojo python4 = Dojo.builder()
                .language(Language.PYTHON)
                .title(templates.get(4).get(title))
                .description(templates.get(4).get(description))
                .starterCode(getPythonStarterCode("scramble(s1, s2)"))
                .runnerCode("\nprint(scramble('rkqodlw', 'world'))")
                .solution("True")
                .build();
        dojoRepository.saveAndFlush(python4);

        // input --> 73
        // source --> https://www.codewars.com/kata/5262119038c0985a5b00029f
        Dojo python5 = Dojo.builder()
                .language(Language.PYTHON)
                .title(templates.get(5).get(title))
                .description(templates.get(5).get(description))
                .starterCode(getPythonStarterCode("is_prime(num)"))
                .runnerCode("\nprint(is_prime(73))")
                .solution("True")
                .build();
        dojoRepository.saveAndFlush(python5);

        // input --> 720, 850, 70
        // source --> https://www.codewars.com/kata/55e2adece53b4cdcb900006c
        Dojo python6 = Dojo.builder()
                .language(Language.PYTHON)
                .title(templates.get(6).get(title))
                .description(templates.get(6).get(description))
                .starterCode(getPythonStarterCode("race(v1, v2, g)"))
                .runnerCode("\nprint(race(720, 850, 70))")
                .solution("[0, 32, 18]")
                .build();
        dojoRepository.saveAndFlush(python6);

        // input --> ['live', 'arp', 'strong'], ['lively', 'alive', 'harp', 'sharp', 'armstrong']
        // source --> https://www.codewars.com/kata/550554fd08b86f84fe000a58
        Dojo python7 = Dojo.builder()
                .language(Language.PYTHON)
                .title(templates.get(7).get(title))
                .description(templates.get(7).get(description))
                .starterCode(getPythonStarterCode("in_array(array1, array2)"))
                .runnerCode("\nprint(in_array(['live', 'arp', 'strong'], ['lively', 'alive', 'harp', 'sharp', 'armstrong']))")
                .solution("['arp', 'live', 'strong']")
                .build();
        dojoRepository.saveAndFlush(python7);

        // input --> [1, 2, 3, 4, 5], 4
        // source --> https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
        Dojo python8 = Dojo.builder()
                .language(Language.PYTHON)
                .title(templates.get(8).get(title))
                .description(templates.get(8).get(description))
                .starterCode(getPythonStarterCode("rot_left(a, d)"))
                .runnerCode("\nprint(rot_left([1, 2, 3, 4, 5], 4))")
                .solution("[5, 1, 2, 3, 4]")
                .build();
        dojoRepository.saveAndFlush(python8);

        // input --> "ifailuhkqq"
        // source --> https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem
        Dojo python9 = Dojo.builder()
                .language(Language.PYTHON)
                .title(templates.get(9).get(title))
                .description(templates.get(9).get(description))
                .starterCode(getPythonStarterCode("sherlock_and_anagrams(s)"))
                .runnerCode("\nprint(sherlock_and_anagrams(\"ifailuhkqq\"))")
                .solution("3")
                .build();
        dojoRepository.saveAndFlush(python9);

        // input --> "[[1, 1, 0, 0], [0, 1, 1, 0], [0, 0, 1, 0], [1, 0, 0, 0]]"
        // source --> https://www.hackerrank.com/challenges/ctci-connected-cell-in-a-grid/problem
        Dojo python10 = Dojo.builder()
                .language(Language.PYTHON)
                .title(templates.get(10).get(title))
                .description(templates.get(10).get(description))
                .starterCode(getPythonStarterCode("max_region(grid)"))
                .runnerCode("\nprint(max_region([[1, 1, 0, 0], [0, 1, 1, 0], [0, 0, 1, 0], [1, 0, 0, 0]]))")
                .solution("3")
                .build();
        dojoRepository.saveAndFlush(python10);

        // Java
        Dojo java1 = Dojo.builder()
                .language(Language.JAVA)
                .title(templates.get(1).get(title))
                .description(templates.get(1).get(description))
                .starterCode(getJavaStarterCode("int add(int a, int b)"))
                .runnerCode(getJavaRunnerCode("Main.add(5,6)"))
                .solution("11")
                .build();
        dojoRepository.saveAndFlush(java1);

        Dojo java2 = Dojo.builder()
                .language(Language.JAVA)
                .title(templates.get(2).get(title))
                .description(templates.get(2).get(description))
                .starterCode(getJavaStarterCode("String boolToWord(boolean bool)"))
                .runnerCode(getJavaRunnerCode("Main.boolToWord(false)"))
                .solution("no")
                .build();
        dojoRepository.saveAndFlush(java2);

        Dojo java3 = Dojo.builder()
                .language(Language.JAVA)
                .title(templates.get(3).get(title))
                .description(templates.get(3).get(description))
                .starterCode(getJavaStarterCode("int solution(int number)"))
                .runnerCode(getJavaRunnerCode("Main.solution(10)"))
                .solution("23")
                .build();
        dojoRepository.saveAndFlush(java3);

        Dojo java4 = Dojo.builder()
                .language(Language.JAVA)
                .title(templates.get(4).get(title))
                .description(templates.get(4).get(description))
                .starterCode(getJavaStarterCode("boolean scramble(String str1, String str2)"))
                .runnerCode(getJavaRunnerCode("Main.scramble(\"rkqodlw\", \"world\")"))
                .solution("true")
                .build();
        dojoRepository.saveAndFlush(java4);

        Dojo java5 = Dojo.builder()
                .language(Language.JAVA)
                .title(templates.get(5).get(title))
                .description(templates.get(5).get(description))
                .starterCode(getJavaStarterCode("boolean isPrime(int num)"))
                .runnerCode(getJavaRunnerCode("Main.isPrime(73)"))
                .solution("true")
                .build();
        dojoRepository.saveAndFlush(java5);

        Dojo java6 = Dojo.builder()
                .language(Language.JAVA)
                .title(templates.get(6).get(title))
                .description(templates.get(6).get(description))
                .starterCode(getJavaStarterCode("int[] race(int v1, int v2, int g)"))
                .runnerCode(getJavaRunnerCode("Main.race(720, 850, 70)"))
                .solution("[0, 32, 18]")
                .build();
        dojoRepository.saveAndFlush(java6);

        Dojo java7 = Dojo.builder()
                .language(Language.JAVA)
                .title(templates.get(7).get(title))
                .description(templates.get(7).get(description))
                .starterCode(getJavaStarterCode("String[] inArray(String[] array1, String[] array2)"))
                .runnerCode(getJavaRunnerCode("java.util.Arrays.toString(Main.inArray(new String[]{ \"arp\", \"live\", \"strong\" }, new String[] { \"lively\", \"alive\", \"harp\", \"sharp\", \"armstrong\" }))"))
                .solution("[arp, live, strong]")
                .build();
        dojoRepository.saveAndFlush(java7);

        Dojo java8 = Dojo.builder()
                .language(Language.JAVA)
                .title(templates.get(8).get(title))
                .description(templates.get(8).get(description))
                .starterCode(getJavaStarterCode("int[] rotLeft(int[] a, int d)"))
                .runnerCode(getJavaRunnerCode("java.util.Arrays.toString(Main.rotLeft(new int[] { 1, 2, 3, 4, 5 }, 4))"))
                .solution("[5, 1, 2, 3, 4]")
                .build();
        dojoRepository.saveAndFlush(java8);

        Dojo java9 = Dojo.builder()
                .language(Language.JAVA)
                .title(templates.get(9).get(title))
                .description(templates.get(9).get(description))
                .starterCode(getJavaStarterCode("int sherlockAndAnagrams(String s)"))
                .runnerCode(getJavaRunnerCode("Main.sherlockAndAnagrams(\"ifailuhkqq\")"))
                .solution("3")
                .build();
        dojoRepository.saveAndFlush(java9);

        Dojo java10 = Dojo.builder()
                .language(Language.JAVA)
                .title(templates.get(10).get(title))
                .description(templates.get(10).get(description))
                .starterCode(getJavaStarterCode("int maxRegion(int[][] grid)"))
                .runnerCode(getJavaRunnerCode("Main.maxRegion(new int[][] {{ 1, 1, 0, 0 }, { 0, 1, 1, 0 }, { 0, 0, 1, 0 }, { 1, 0, 0, 0 }})"))
                .solution("5")
                .build();
        dojoRepository.saveAndFlush(java10);
    }

    private String getPythonStarterCode(String sig) {
        return "def " + sig + ":\n" +
                "\t# Your code";
    }

    private String getJavaStarterCode(String sig) {
        return "class Main {\n" +
                "\tpublic static void main(String[] args) {\n" +
                "\t\tTest.test();\n" +
                "\t}\n" +
                "\n" +
                "\tpublic static " + sig + " {\n" +
                "\t\t// Your code\n" +
                "\t}\n" +
                "}";
    }

    private String getJavaRunnerCode(String methodCall) {
        return "\nclass Test {\n" +
                "\tpublic static void test() {\n" +
                "\t\tSystem.out.println(" + methodCall + ");\n" +
                "\t}\n" +
                "}";
    }
}
