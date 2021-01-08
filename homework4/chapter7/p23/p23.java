package endTermHomeWork.homework4.chapter7.p23;

public class p23 {
    public static void main(String[] args) {
        boolean[] box = new boolean[100];
        for (int i = 0; i < 100; i++) {
            box[i]=false;
        }
        for (int i = 1; i <=100 ; i++) {
            for (int j = i; j <=100 ; j+=i) {
                box[j-1]=!box[j-1];
            }
        }
        for (int i = 0; i < 100; i++) {
            if(box[i]){
                System.out.print(i+1+" ");
            }
        }
    }
}
