public class Conditional {
    public static void main(String[] args) {
        /*
        if(boolean expersion t or f){
        body;
        }else{
        then do this
        }
         */
        int salary = 25600;
        if(salary > 10000){
            salary+=1000;
        } else if (salary>20000) {
            salary+=2000;
        }else {
            salary+=1500;
        }
        System.out.println(salary);

    }
}
