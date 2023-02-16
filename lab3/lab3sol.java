import java.util.*;
class lab3sol{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        // collecting  integer array from the user 
        System.out.println("enter the size of array");
        int size = scan.nextInt();
        int[] array=new int[size];
        System.out.println("enter the values for the array");
        for(int i = 0 ; i < size ; i++){
            array[i]=scan.nextInt();
        }
        // display menu of item and choosing
        System.out.println("1. Mean: ");
        System.out.println("2.Median: " ) ;  
        System.out.println("3.Mode: ") ;
        System.out.println("select any of the option: ") ;
        int option = scan.nextInt();
        switch(option){
            case 1: float mean= fnmean(array);
            System.out.println(" mean is: " + mean);
            break;
            case 2: float median = fnmedian(array);
            System.out.println("median is : " + median);
            break;
            case 3: int mode =fnmode(array);
            System.out.println("mode is" + mode);
            break;
            default:
            System.out.println(" invalid option");
        }
        scan.close();


    }
    //first function for mean
    static float fnmean(int[]array){
        int sum=0;
        for(int i=0 ; i < array.length ; i++){
            sum +=array[i];
            }
            return (float) sum/array.length;
    }
    //second function for median
    static float fnmedian(int[]array){
        Arrays.sort(array);
        if(array.length%2==0){
            int midvalue1= array.length/2 - 1; 
            int midvalue2=array.length/2;
            return( float) (array[midvalue1]+array[midvalue2])/2;
        }else{
            int midvalue=array.length/2;
            return(float)(array[midvalue]);
        }

    }
    public static int fnmode(int[] array) {
    Arrays.sort(array);

    int mode = array[0];
    int count = 1;
    int maxCount = 1;

    for (int i = 1; i < array.length; i++) {
        if (array[i] == array[i-1]) {
            count++;
        } else {
            count = 1;
        }

        if (count > maxCount) {
            maxCount = count;
            mode = array[i];
        }
    }

    return mode;
    }
}
   
    
