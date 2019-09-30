import java.util.Scanner;

public class find_ArryMax {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner sc =new Scanner(System.in);

        do{
            System.out.println("Enter a size");
            size =sc.nextInt();
            if(size >20){
                System.out.println("Size should not exceed 20");
            }
        }while(size >20);
        //nhap mang
        array =new int[size];
        for(int i =0;i<size;i++){
            System.out.println("enter element "+(i+1)+":");
            array[i] =sc.nextInt();
        }
        //xuat mang
        System.out.println("Porperty list :");
        for (int i =0 ;i<array.length;i++){
            System.out.print(array[i]+ "\t");
        }
        int max =array[0];
        int index = 1;
        for(int i =0 ;i<array.length;i++){
            if(array[i] >max){
                max =array[i];
                index =i +1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);

    }
}
