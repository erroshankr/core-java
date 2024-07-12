package collectionapi;

import java.util.HashMap;
import java.util.Map;

// key : hashcode , equals : override ::
public class MapDemo2 {

    public static void main(String[] args) {
        Map<String, Map<String,Integer>>  res = new HashMap<>();

        String name1 = "Ram";
        Map<String,Integer> m1 = new HashMap<>();
        m1.put("English", 60);
        m1.put("Maths",80);
        m1.put("Science",90);

        res.put(name1,m1);

        System.out.println(res);

    }
}

//Collections.retainAll(l1,l2)

/*
 * Count Frequency of Elements in a List:
 * Write a function to count the frequency of each element in a list of integers using a map.
 *
 * Group Strings by Their Length:
 * Write a function to group strings by their length.
 *
 * Find the Most Frequent Element in a List:
 * Write a function to find the most frequent element in a list of integers.
 *
 * Check for Anagrams:
 * Write a function to check if two strings are anagrams using a map.
 *
 * Group Numbers by Even and Odd:
 * Given a list of integers, write a function to group numbers into a map where the keys are "even" and "odd" and the values are lists of even and odd numbers, respectively.
 *
 * Count Words in Sentences:
 * Given a list of sentences, write a function to count the occurrences of each word across all sentences using a map.
 *
 * Group Employees by Department:
 * Given a list of employees where each employee has a name and a department, write a function to group employees by their department.
 *
 * Index Words by First Letter:
  Given a list of words, write a function to index these words by their first letter.
*
* Employee Salary Distribution:
  Given a list of employees with their names and salaries, write a function to create a map where the keys are salary ranges (e.g., "0-1000", "1001-2000", etc.) and the values are lists of employee names who fall within those salary ranges.
 *
 * Group Transactions by User and Month:
Given a list of transactions where each transaction has a user, date, and amount, write a function to group transactions by user and month.
*
*s1.retainAll(s2)  --> s1 (common in both s1, s2)
*
 */