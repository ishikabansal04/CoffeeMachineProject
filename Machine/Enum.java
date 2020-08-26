package Machine;

public class Enum {
    enum Secret {
        STAR, CRASH, START, TRASH // ..
    }

    public static void main(String[] args) {
        int count=0;
         Secret arr[]=Secret.values();
         for(Secret sec: arr){
             String str=sec.name();
             if(str.substring(0,4).equals("STAR")){
                 count++;
             }
         }
         System.out.println(count);
    }
}