public class Calculate {  
  
    public static int getMax(int arra[]){  
        int maximum=0;  
        for(int i=1;i<arra.length;i++){  
            if(maximum<arra[i])  
                maximum=arra[i];  
        }  
        return maximum;  
    }  
}  