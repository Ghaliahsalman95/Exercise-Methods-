import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("-------------------------Exercise 1--------------------------------!");
//--------------------------Exercise 1---------------------------------
        int [] nums={25,37,29};
        System.out.println("The Smallest number is "+smallest(nums));
        System.out.println("------Exercise 2-------");
        System.out.println("Enter number!");
        typenum(input.nextInt());
        System.out.println("------Exercise 3-------");
        System.out.println("Enter Password!");
        if(valid(input.next())){System.out.println("Password is valid ");}
        else System.out.println("Password is Not valid");
    }

     /*1 - Write a Java method to find the smallest number among three numbers.
        Test Data:*/

        /*Test Data Input the first number: 25
        Input the Second number: 37
        Input the third number: 29
        Expected Output:
        The smallest value is 25.0*/

//--------------------------Exercise 1---------------------------------

    public static int smallest(int []nums){
        int small=nums[0];
        for(int a=0;a<=nums.length-1;a++) {
            if (nums[a] <= small) {
                small = nums[a];}} //end for
         return small;}//end methods
/*2 - Write a Java method that check if the entered number is
negative or positive or zero.
*/
//--------------------------Exercise 2---------------------------------

public static void typenum(int number){
    if(number>0){
        System.out.println("The Number is Positive");
    }else if(number<0){System.out.println("The Number is Negative");}
    else{System.out.println("The Number is Zero");}

}

/*- Write a Java method to check whether a string is a valid password.
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits*/

//--------------------------Exercise 3---------------------------------

 public static boolean valid(String pass){
     boolean check=true;
    // String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";

     int countD=0;//A password must contain at least two digits
     if(pass.length()>=10){//A password must have at least eight characters.

     for(int s=0;s<pass.length();s++){
         if(pass.toUpperCase().charAt(s)>='A'&& pass.toUpperCase().charAt(s)<='Z'){
            check=true;}
         if (pass.charAt(s)>='0'&&pass.charAt(s)<='9'){
             countD+=1;}}
     if(countD>=2){check=true;}
     else {check=false;}
     }
     else return false;//if length less than 10
     return check;


 }


}
