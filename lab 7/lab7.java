// Create a new folder in git named 'Lab 7' for the following question and solve the following: create a flowchart and document the results, 
// /constraints, etc., in the README.md file for the lab.

// Given the famous iris dataset, find the 5-point summary [Mean, Median, Mode, Min, Max] for the attributes: SepalLengthCm, SepalWidthCm, 
//PetalLengthCm, PetalWidthCm.

// Once the overall summary statistics have been calculated, identify the summary statistics for each Species of iris flower 
//[Iris-setosa, Iris-versicolor, Iris-virginica].

// Present your results in the appropriate format and write the results in a file.
    
    
import java.util.Arrays;
import java.util.*;
import java.io.*;
class lab7{
    static float fnmean (float [] num){
        float sum = 0;
        for(int i =0; i<num.length;i++){
            sum += num[i];
        }
        float mean = sum/num.length;
        return mean;
    }
    static float fnmedian(float[] num) {
        Arrays.sort(num);
        if (num.length % 2 == 0) {
            float median = (num[num.length / 2] + num[(num.length / 2) - 1]) / 2;
            return median;
        } else {
            float median = num[(num.length / 2)];
            return median;
        }
    }
    public static float fnmode(float[] num){
        ;
        
        int co = 0;
        float element =0;
        float elementX;
        
        for (int i = 0; i < num.length; i++){
            elementX =num[i];
            int coX=0;
            for (int j = 0; j < num.length; j++){
                if(num[j]==num[i]){
                    coX++;
                 }
                

            }if(coX>co){
                co=coX;
                element=elementX;
            }
        }
       return element;
    }
    
   
    
    static float fnmax(float [] num){
    
        Arrays.sort(num);
        float max = num[(num.length -1)];
        return max;

    }
    static float fnmin( float[] num){
        
        Arrays.sort(num);
        float min = num[0];
        return min;
    }
   

    public static void main (String [] args){



        try {
            File file = new File("output.txt");
            FileWriter writer = new FileWriter(file, true); // true means append to file if it exists
            // writer.write(output);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

       float [] sepal_length =  new float [150];
       float [] sepal_width =  new float [150];
       float [] petal_length=  new float [150];
       float [] petal_width =  new float [150];
      try{
        File file = new File ("iris.csv");
        Scanner sc = new Scanner ( file);
        
        int i =0;
        while(sc.hasNextLine()){
            String temp = sc.nextLine();
            String [] ary = temp.split(",");
            sepal_length [i]=Float.parseFloat(ary[1]);
            sepal_width [i] =Float.parseFloat(ary[2]);
            petal_length[i] =Float.parseFloat(ary[3]);
            petal_width[i]  = Float.parseFloat(ary[4]);
            i++;

        }

        

        try {
            File file1 = new File("output.txt");
            FileWriter writer = new FileWriter(file1, true); // true means append to file if it exists
            // writer.write(output);
        
        
        writer.write("                         SUMMARY                       ");
        writer.write("\nNAME              MEAN            MEDIAN          MODE       MAXIMUM         MINIMUM  ");
        writer.write("\nSepal Length   "+fnmean(sepal_length)+"            "+fnmedian(sepal_length)+"             "+fnmode(sepal_length)+"           "+fnmin(sepal_length)+"          "+fnmax(sepal_length));
        writer.write("\nSepal Width    "+fnmean(sepal_width)+"             "+fnmedian(sepal_width)+"              "+fnmode(sepal_width)+"            "+fnmin(sepal_width)+"           "+fnmax(sepal_width));
        writer.write("\nPetal Length   "+fnmean(petal_length)+"            "+fnmedian(petal_length)+"             "+fnmode(petal_length)+"            "+fnmin(petal_length)+"         "+fnmax(petal_length));
        writer.write("\nPetal Width    "+fnmean(petal_width)+"             "+fnmedian(petal_width)+"              "+fnmode(petal_width)+"             "+fnmin(petal_width)+"          "+fnmax(petal_width));
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
        System.out.println("                         SUMMARY                       ");
        System.out.println("--------------------------------------------------------");
        System.out.println("NAME   MEAN    MEDIAN    MODE   MAXIMUM  MINIMUM  ");
        System.out.println("Sepal Length"+fnmean(sepal_length)+" "+fnmedian(sepal_length)+" "+fnmode(sepal_length)+" "+fnmin(sepal_length)+" "+fnmax(sepal_length));
        System.out.println("Sepal Width"+fnmean(sepal_width)+" "+fnmedian(sepal_width)+" "+fnmode(sepal_width)+" "+fnmin(sepal_width)+" "+fnmax(sepal_width));
        System.out.println("Petal Length"+fnmean(petal_length)+" "+fnmedian(petal_length)+" "+fnmode(petal_length)+" "+fnmin(petal_length)+" "+fnmax(petal_length));
        System.out.println("Petal Width"+fnmean(petal_width)+" "+fnmedian(petal_width)+" "+fnmode(petal_width)+" "+fnmin(petal_width)+" "+fnmax(petal_width));

            float[] setosas_length = new float[50];
            float[] setosas_width = new float[50];
            float[] setosap_length = new float[50];
            float[] setosap_width = new float[50];

            for(int p = 0;p<50;p++){
                setosas_length[p] = sepal_length[p];
                setosas_width[p] = sepal_width[p];
                setosap_length[p] = petal_length[p];
                setosap_width[p] = petal_width[p]; 
            }

            System.out.println(setosap_length[2]);

            System.out.println("                       SUMMARY OF  SETOSA                        ");

            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  "+fnmean(setosas_length)+"      "+fnmedian(setosas_length)+"        "+fnmode(setosas_length)+"         "+fnmin(setosas_length)+"     "+fnmax(setosas_length));
            System.out.println("Sepal Width   "+fnmean(setosas_width)+"     "+fnmedian(setosas_width)+"        "+fnmode(setosas_width)+"         "+fnmin(setosas_width)+"           "+fnmax(setosas_width));
            System.out.println("Petal Length  "+fnmean(setosap_length)+"     "+fnmedian(setosap_length)+"        "+fnmode(setosap_length)+"         "+fnmin(setosap_length)+"      "+fnmax(setosap_length));
            System.out.println("Petal Width   "+fnmean(setosap_width)+"    "+fnmedian(setosap_width)+"        "+fnmode(setosap_width)+"         "+fnmin(setosap_width)+"           "+fnmax(setosap_width));


            float[] versis_length = new float[50];
            float[] versis_width = new float[50];
            float[] versip_length = new float[50];
            float[] versip_width = new float[50];

            for(int p = 0;p<50;p++){
                versis_length[p] = sepal_length[p+50];
                versis_width[p] = sepal_width[p+50];
                versip_length[p] = petal_length[p+50];
                versip_width[p] = petal_width[p+50]; 
            }

            
            System.out.println("                     SUMMARY OF VERSICOLOR                     ");
 
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  "+fnmean(versis_length)+"      "+fnmedian(versis_length)+"   "+fnmode(versis_length)+" "+fnmin(versis_length)+"  "+fnmax(versis_length));
            System.out.println("Sepal Width   "+fnmean(versis_width)+"       "+fnmedian(versis_width)+"    "+fnmode(versis_width)+"  "+fnmin(versis_width)+" "+fnmax(versis_width));
            System.out.println("Petal Length  "+fnmean(versip_length)+"  "+fnmedian(versip_length)+"    "+fnmode(versip_length)+" "+fnmin(versip_length)+"  "+fnmax(versip_length));
            System.out.println("Petal Width   "+fnmean(versip_width)+"  "+fnmedian(versip_width)+"     "+fnmode(versip_width)+"     "+fnmin(versip_width)+"  "+fnmax(versip_width));


            float[] virgis_length = new float[50];
            float[] virgis_width = new float[50];
            float[] virgip_length = new float[50];
            float[] virgip_width = new float[50];

            for(int p = 0;p<50;p++){
                virgis_length[p] = sepal_length[p+100];
                virgis_width[p] = sepal_width[p+100];
                virgip_length[p] = petal_length[p+100];
                virgip_width[p] = petal_width[p+100]; 
            }

            
            System.out.println("                     SUMMARY OF VIRGINICA                        ");
           
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  "+fnmean(virgis_length)+" "+fnmedian(virgis_length)+"  "+fnmode(virgis_length)+" "+fnmin(virgis_length)+"  "+fnmax(virgis_length));
            System.out.println("Sepal Width   "+fnmean(virgis_width)+"  "+fnmedian(virgis_width)+" "+fnmode(virgis_width)+" "+fnmin(virgis_width)+"   "+fnmax(virgis_width));
            System.out.println("Petal Length  "+fnmean(virgip_length)+" "+fnmedian(virgip_length)+"  "+fnmode(virgip_length)+" "+fnmin(virgip_length)+" "+fnmax(virgip_length));
            System.out.println("Petal Width   "+fnmean(virgip_width)+" "+fnmedian(virgip_width)+" "+fnmode(virgip_width)+" "+fnmin(virgip_width)+"  "+fnmax(virgip_width));
           
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
