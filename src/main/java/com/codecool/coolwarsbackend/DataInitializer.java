package com.codecool.coolwarsbackend;

import com.codecool.coolwarsbackend.model.Dojo;
import com.codecool.coolwarsbackend.model.Language;
import com.codecool.coolwarsbackend.repository.DojoRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private DojoRepository dojoRepository;

    @Override
    public void run(String... args) {
        Dojo dojo1 = Dojo.builder()
                .language(Language.PYTHON)
                .title("Basic Calculator")
                .description("<p>Write a function that adds two numbers <code>(a, b)</code>, and returns the sum.</p>")
                .starterCode("def add(a, b):\n" +
                        "\t# Your code")
                .runnerCode("\nprint(add(5,6))")
                .solution("11")
                .build();
        dojoRepository.saveAndFlush(dojo1);

        Dojo dojo2 = Dojo.builder()
                .language(Language.PYTHON)
                .title("Boolean to Human")
                .description("<p>Complete the method that takes a boolean value and return a <code>\"Yes\"</code> string for true, or a <code>\"No\"</code> string for <code>false</code>.</p>")
                .starterCode("def boolToWord(bool):\n" +
                        "\t# Your code")
                .runnerCode("\nprint(boolToWord(False))")
                .solution("no")
                .build();
        dojoRepository.saveAndFlush(dojo2);

        // input --> 10
        // source --> https://www.codewars.com/kata/514b92a657cdc65150000006
        Dojo dojo3 = Dojo.builder()
                .language(Language.PYTHON)
                .title("Multiples of 3 or 5")
                .description("<p>If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.</p>" +
                        "<p>Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.</p>" +
                        "<p><strong>Note</strong>: If the number is a multiple of both 3 and 5, only count it once.</p>")
                .starterCode("def solution(number):\n" +
                        "\t# Your code")
                .runnerCode("\nprint(solution(10))")
                .solution("23")
                .build();
        dojoRepository.saveAndFlush(dojo3);

        // input --> 'rkqodlw', 'world'
        // source --> https://www.codewars.com/kata/55c04b4cc56a697bb0000048
        Dojo dojo4 = Dojo.builder()
                .language(Language.PYTHON)
                .title("Scramblies")
                .description("<p>Complete the function <code>scramble(str1, str2)</code> that returns <code>true</code> if a portion of <code>str1</code> characters can be rearranged to match <code>str2</code>, otherwise returns <code>false</code>.</p>")
                .starterCode("def scramble(s1, s2):\n" +
                        "\t# Your code")
                .runnerCode("\nprint(scramble('rkqodlw', 'world'))")
                .solution("True")
                .build();
        dojoRepository.saveAndFlush(dojo4);

        // input --> 73
        // source --> https://www.codewars.com/kata/5262119038c0985a5b00029f
        Dojo dojo5 = Dojo.builder()
                .language(Language.PYTHON)
                .title("Is a Number Prime?")
                .description("<p>Define a function that takes an integer argument and returns logical value <code>True</code> or <code>False</code> depending on if the integer is a prime.</p>" +
                        "<p>Per Wikipedia, a prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself.</p>")
                .starterCode("def is_prime(num):\n" +
                        "\t# Your code")
                .runnerCode("\nprint(is_prime(73))")
                .solution("True")
                .build();
        dojoRepository.saveAndFlush(dojo5);

        // input --> 720, 850, 70
        // source --> https://www.codewars.com/kata/55e2adece53b4cdcb900006c
        Dojo dojo6 = Dojo.builder()
                .language(Language.PYTHON)
                .title("Tortoise Racing")
                .description("<p>Two tortoises named <strong><em>A</em></strong> and <strong><em>B</em></strong> must run a race. <strong><em>A</em></strong> starts with an average speed of 720 feet per hour. Young <strong><em>B</em></strong> knows she runs faster than <strong><em>A</em></strong>, and furthermore has not finished her cabbage.</p>" +
                        "<p>When she starts, at last, she can see that <strong><em>A</em></strong> has a 70 feet lead but <strong><em>B</em></strong>'s speed is 850 feet per hour. How long will it take <strong><em>B</em></strong> to catch <strong><em>A</em></strong>?</p>" +
                        "<p>More generally: given two speeds <code>v1</code> (<strong><em>A</em></strong>'s speed, integer > 0) and <code>v2</code> (<strong><em>B</em></strong>'s speed, integer > 0) and a lead <code>g</code> (integer > 0) how long will it take <strong><em>B</em></strong> to catch <strong><em>A</em></strong>?</p>" +
                        "<p>The result will be an array <code>[hour, min, sec]</code> which is the time needed in hours, minutes and seconds (round down to the nearest second) or a string in some languages.</p>" +
                        "<p>If <code>v1 >= v2</code> then return <code>None</code>.</p>")
                .starterCode("def race(v1, v2, g):\n" +
                        "\t# Your code")
                .runnerCode("\nprint(race(720, 850, 70))")
                .solution("[0, 32, 18]")
                .build();
        dojoRepository.saveAndFlush(dojo6);

        // input --> ['live', 'arp', 'strong'], ['lively', 'alive', 'harp', 'sharp', 'armstrong']
        // source --> https://www.codewars.com/kata/550554fd08b86f84fe000a58
        Dojo dojo7 = Dojo.builder()
                .language(Language.PYTHON)
                .title("Which Are In?")
                .description("<p>Given two arrays of strings <code>a1</code> and <code>a2</code> return a sorted array <code>r</code> in lexicographical order of the strings of <code>a1</code> which are substrings of strings of <code>a2</code>.</p>")
                .starterCode("def in_array(array1, array2):\n" +
                        "\t# Your code")
                .runnerCode("\nprint(in_array(['live', 'arp', 'strong'], ['lively', 'alive', 'harp', 'sharp', 'armstrong']))")
                .solution("['arp', 'live', 'strong']")
                .build();
        dojoRepository.saveAndFlush(dojo7);

        // input --> [1, 2, 3, 4, 5], 4
        // source --> https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
        Dojo dojo8 = Dojo.builder()
                .language(Language.PYTHON)
                .title("Left Rotation")
                .description("<p>A left rotation operation on an array shifts each of the array's elements 1 unit to the left. For example, if 2 left rotations are performed on array <code>[1, 2, 3, 4, 5]</code>, then the array would become <code>[3, 4, 5, 1, 2]</code>.</p>" +
                        "<p>Given an array <code>a</code> of <code>n</code> integers and a number, <code>d</code>, perform <code>d</code> left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.</p>")
                .starterCode("def rot_left(a, d):\n" +
                        "\t# Your code\"")
                .runnerCode("\nprint(rot_left([1, 2, 3, 4, 5], 4))")
                .solution("[5, 1, 2, 3, 4]")
                .build();
        dojoRepository.saveAndFlush(dojo8);

        // input --> "ifailuhkqq"
        // source --> https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem
        Dojo dojo9 = Dojo.builder()
                .language(Language.PYTHON)
                .title("Sherlock and Anagrams")
                .description("<p>Two strings are <em>anagrams</em> of each other if the letters of one string can be rearranged to form the other string. Given a string, find the number of pairs of substrings of the string that are anagrams of each other.</p>" +
                        "<p>For example <code>s = mom</code>, the list of all anagrammatic pairs is <code>[m, m], [mo, om]</code> at positions <code>[[0], [2]], [[0, 1], [1, 2]]</code> respectively.</p>")
                .starterCode("def sherlock_and_anagrams(s):\n" +
                        "\t# Your code\"")
                .runnerCode("\nprint(sherlock_and_anagrams(\"ifailuhkqq\")")
                .solution("3")
                .build();
        dojoRepository.saveAndFlush(dojo9);
        Dojo dojo10 = Dojo.builder()
                .language(Language.JAVA)
                .title("Basic Calculator - Java")
                .description("<p>Write a function that adds two numbers <code>(a, b)</code>, and returns the sum.</p>")
                .starterCode("class Main {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Test.test();\n" +
                        "    }\n" +
                        "\n" +
                        "    public static int add(int a, int b) {\n" +
                        "        Your code\n" +
                        "    }\n" +
                        "}")
                .runnerCode("class Test {\n" +
                        "    public static void test() {\n" +
                        "        System.out.println(Main.add(5,6));\n" +
                        "    }\n" +
                        "}")
                .solution("11")
                .build();
        dojoRepository.saveAndFlush(dojo10);

        Dojo dojo11 = Dojo.builder()
                .language(Language.JAVA)
                .title("Boolean to Human - Java")
                .description("<p>Complete the method that takes a boolean value and return a <code>\"Yes\"</code> string for true, or a <code>\"No\"</code> string for <code>false</code>.</p>")
                .starterCode("class Main {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Test.test();\n" +
                        "    }\n" +
                        "\n" +
                        "    public static String boolToWord(boolean bool) {\n" +
                        "        Your code\n" +
                        "    }\n" +
                        "}")
                .runnerCode("\nclass Test {\n" +
                        "    public static void test() {\n" +
                        "        System.out.println(Main.boolToWord(false));\n" +
                        "    }\n" +
                        "}")
                .solution("no")
                .build();
        dojoRepository.saveAndFlush(dojo11);
    }
}
