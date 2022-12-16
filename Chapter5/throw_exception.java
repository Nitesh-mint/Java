public class throw_exception {
        static void validate(int age){
            if(age<18){
                throw new ArithmeticException("Not Valid");
            }
            else{
                System.out.println("Welcome to vote");
            }
        }   
        public static void main(String args[]){
            validate(19);
        }
}
