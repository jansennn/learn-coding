import java.util.*;

class Stock{

    public static void cek(int data[]){
        int max_get = 0;
        int buy = 0;
        int sell = 0;
        for(int i=0;i<data.length-1;i++){
            System.out.println("i = "+ i);
            for(int j=i+1;j<data.length;j++){
                if((data[j] - data[i]) > max_get){
                    max_get = data[j] - data[i];
                    buy = i;
                    sell = j;
                }

                System.out.println("j = "+ j);
            }
        }
        if(buy == 0 && sell == 0){
            System.out.println(0);
        }else{
            System.out.println(buy + " " + sell);
        }

    }
    public static void main(String args[]){
        int data[] = {2,1};

        cek(data);
    }
}