package LESSON.Exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

 public class Test  {
    static Scanner scr = new Scanner(System.in);


    public static int domination(int a, int b) {


        return a / b;
    }

    boolean loop = true;

    public static void SaveRes(int res) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(new PrintWriter("txt.txt"));
        writer.println(" Result " + res);
        writer.close();

    }

    public static void main(String[] args) {

        try {  int a = scr.nextInt();
         int b = scr.nextInt();


            SaveRes(domination(a,b));
        } catch (FileNotFoundException e) {
