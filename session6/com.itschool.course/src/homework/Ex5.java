package homework;

public class Ex5 {

    public static void main(String[] args) {

        int evenCount = 0;
        int oddCount = 0;

        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
    }
}
