import java.util.*;
import java.io.*;

public class cirno
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int classes = 0;
        ArrayList<Integer> grades = new ArrayList<Integer>();
        for(int i = 0; i < n; i++)
        {
            grades.add(scan.nextInt());
        }
        //scan.close();

        for(int i = 0; i < n; i++)
        {
            if(grades.get(i) < x)
            {
                classes++;
            }
            else if(grades.get(i) > y)
            {
                classes++;
            }
        }
         System.out.println(classes-1);
    }
    
    public static int classesNeeded(int n, int x, int y)
    {
        int classes = 0;
        ArrayList<Integer> grades = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i <= n; i++)
        {
            Integer grade = Integer.parseInt(scan.nextLine());
            System.out.println(grade);
            grades.add(grade);
        }
        //scan.close();

        while(grades.size() > 0)
        {
            int i = grades.size();
            for(int j = 0; j < i; j++)
            {
                if(grades.get(j)==100)
                {
                    grades.remove(j);
                }
                int count = 2;
                for(int k=0; k<count; k++)
                {
                    int g = grades.get(k);
                    g++;
                    grades.set(k, g);
                }
            }
        }
        return classes;
    }
}