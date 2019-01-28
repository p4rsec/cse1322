import java.util.*;
public class Class1_Tests{
    public static void main(String arg[]){
        Student[] class1 = new Student[10];
        Scanner sc = new Scanner(System.in);
        double class_avg = 0.0;


        System.out.println("Please input students in the following format: firstName [enter]" +
                "lastName [enter] test1 [enter] test 2 [enter]...test5 [enter].");

        /*
            this section creates new student objects
            within the class1 object array for each
            of ten students, by taking input from
            the user for the first and last names,
            as well as each of the 5 test scores.
         */
        for(int i=0;i<class1.length;i++){
            int[] scores = new int[5];

            System.out.printf("Student %d:\n",i+1);
            String first = sc.nextLine();
            String last = sc.nextLine();

            for(int t=0;t<scores.length;t++){
                scores[i] = sc.nextInt();
            }
            System.out.println();
            class1[i] = new Student(first,last,scores); // instantiates student object within array
        }

        for(int i=0;i<class1.length;i++){
            class_avg += class1[i].getAverage();
        }
        class_avg /= 10.0;

        System.out.println("First Name\t\t\tLastName\t\t\tTest1\tTest2\tTest3\tTest4\tTest5\tAverage\tGrade");
        for(int i=0;i<class1.length;i++){
            System.out.println(class1[i]);
        }
        System.out.println();
        System.out.println("Class Average: "+class_avg);
    }
}