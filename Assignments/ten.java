import java.util.Scanner;
class input{
    public static int no_of_subjects;
    void subject_no(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number of subjects(must be 5 or more)");
        no_of_subjects = sc.nextInt();
        marks_input();
    }

    static void marks_input(){
        int count=1,marks;
        float grade,total_grade=0.0f,final_grade;
        if(no_of_subjects<5){
            System.out.println("Sorry subjects number should be greater or equal to 5");
        }
        else{
            while(count<=no_of_subjects){
                System.out.println("Enter the marks of subject"+ count);
                Scanner sc =  new Scanner(System.in);
                marks = sc.nextInt();
                if(marks>100){
                    System.out.println("Makrs should not be greater than 100");
                }
                else{
                    if(marks<35){
                        grade = 0.0f;
                    }
                    else if(marks>=35 && marks<40){
                        grade = 1.6f;
                    }
                    else if(marks>=40 && marks<50){
                        grade = 2.0f;
                    }
                    else if (marks>=50 && marks<60){
                        grade =  2.4f;
                    }
                    else if(marks>=60 && marks<70){
                        grade = 2.8f;
                    }
                    else if(marks>=70 && marks<80){
                        grade = 3.2f;
                    }
                    else if(marks>=80 && marks<90){
                        grade = 3.6f;
                    }
                    else{
                        grade = 4.0f;
                    }
                    count++;
                    total_grade = grade + total_grade;
                }
            }
        }
        final_grade = total_grade/(float)no_of_subjects;
        if(final_grade < 1.6f){
            System.out.println("Not Graded");
        }
        else if(final_grade>=1.6f && final_grade<2.0f){
            System.out.println("Your final result is D");
        }
        else if(final_grade >=2.0f && final_grade < 2.4f){
            System.out.println("Your final result is C");
        }
        else if(final_grade >=2.4f && final_grade < 2.8f){
            System.out.println("Your final result is C+");
        }
        else if(final_grade >=2.8f && final_grade < 3.2f){
            System.out.println("Your final result is B");
        }
        else if(final_grade >= 3.2 && final_grade < 3.6f){
            System.out.println("Your final result is B+");
        }
        else if(final_grade >=3.6 && final_grade < 4.0f){
            System.out.println("Your final result is A");
        }
        else{
            System.out.println("Your final result is A+");
        }
    }
}


public class ten{
    public static void main(String args[]){
        input nitesh = new input();
        nitesh.subject_no();
    }
}