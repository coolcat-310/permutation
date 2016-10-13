
import java.util.*;

public class hello{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an interger: ");
        int n = input.nextInt();

        mySet(n);
    }

    public static void mySet(int n){
        byte[] list = new byte[n];

        ArrayList<Integer> num = new ArrayList<>();
        //fill the array with 0s and second array sequential num
        for(int i= 0; i<n; i++){
            list[i]= 0;
            num.add(i+1);
        }
        Collections.reverse(num);

        //Go through the each instance and print out the subset
        for(int i=1; i<= Math.pow(2,n); i++){
            System.out.print("{ ");
            for(int j =0; j<n;j++){
                if(list[j] == 0)
                    continue;
                else{
                    System.out.print(j+1 + " ");
                }
            }
            System.out.println("}");

            //Increments the byte array by 1
            byte carry= 1;
            for(int h = 0; h<list.length; h++){
                byte b = list[h];
                list [h] ^= carry;
                carry &= b;
            }
        }

    }

}