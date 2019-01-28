public class Student{
    String first, last;
    int[] scores = new int[5];
    double average = 0.0;
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

    public int[] getScores(){
        return scores;
    }

    public char getGrade(){
        return grade;
    }

    public String getName(){
        String fullName = first + ' ' + last;
        return fullName;
    }

    public double getAverage(){
        return average;
    }

    /*
        adds all indices together and takes the average to get
        the average score in the form of a double.
     */

    private double setAverage(int[] scores){
        int total = 0;
        for(int i=0;i<scores.length;i++)
            total += scores[i];
        average = (double)total/5.0;
        return average;
    }

    /*
        takes average and converts it into something usable by
        a switch statement. uses a switch statement to determine
        the letter grade.
     */

    private static char setGrade(double average){
        int avg = (int)average;
        avg /= 10;
        char grade = ' ';

        switch (avg)
        {
            case 10:
                grade = 'A';
                break;
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                if(avg>10)
                    grade = 'A';
                else if(avg<6)
                    grade = 'F';
                break;
        }
        
        return grade;
    }

    public String toString(){
        return first+"\t\t\t"+last+"\t\t\t"+scores[0]+"\t"+ scores[1]+"\t"+scores[2]+"\t"+scores[3]+
                "\t"+scores[4]+"\t"+average+"\t"+grade;
    }
}