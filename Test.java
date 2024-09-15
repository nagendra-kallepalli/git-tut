public class Test {

    public static void main(String args[]) {
        System.out.println("Hi, Hello..!");

        int i = 5;
        int j = i++;
        System.out.println(i + ":" + j);

        //Code to display an array
        int arr[] = {1,2,3};

        System.out.print("[");
        for(int x:arr) {
            System.out.print(x + " ");
        } 
        System.out.println("]");
        System.out.println(arr[1]);


        System.out.println("End");

    
    
    }


}
