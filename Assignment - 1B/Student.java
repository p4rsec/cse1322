public class Student{
    String first, last;
    int[] scores = new int[5]{0,0,0,0,0};
    float average = 0.0;
    char grade = ' ';

    /*
        student object which takes first/last name
        as initial parameters.
     */

    public Student(String first, String last, int[] scores){
        this.first = first;
        this.last = last;
        this.scores = scores;
        this.average = setAverage(scores);
        this.grade = setGrade(average);
    }

    public static int[] getScores(){
        return scores;
    }

    public static char getGrade(){
        return grade;
    }

    public static String getName(){
        String fullName = first + ' ' + last;
        return fullName;
    }

    /*
        adds all indices together and takes the average to get
        the average score in the form of a float.
     */

    private static float setAverage(int[] scores){
        int total = 0;
        for(int i=0;i<scores.length;i++)
            total += scores[i];
        average = (float)total/5.0;
    }

    /*
        takes average and converts it into something usable by
        a switch statement. uses a switch statement to determine
        the letter grade.
     */

    private static char setGrade(float average){
        int avg = (int)average;
        avg /= 10;

        switch (avg)
        {
            case 10:
                return 'A';
                break;
            case 9:
                return 'A';
                break;
            case 8:
                return 'B';
                break;
            case 7:
                return 'C';
                break;
            case 6:
                return 'F';
                break;
            default:
                if(avg>10)
                    return 'A';
                else if(avg<6)
                    return 'F';
                break;
        }
    }

    public String toString(){
        return getName() + "\t\t\t" + scores[0] + "\t" + scores[1] + "\t" + scores[2] + "\t" + scores[3] +
                "\t" + scores[4] + "\t" + average + "\t" + grade
    }
}