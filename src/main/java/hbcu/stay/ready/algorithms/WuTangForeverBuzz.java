package hbcu.stay.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan(){
        String result = "";
        for(int x = 1; x<= 15; x++){
            if (x % 3 == 0 && x % 5 == 0){
                System.out.println("Wutang Forever");
            } else if (x % 3 == 0){
                System.out.println("Wu");
            } else if (x % 5 == 0) {
                System.out.println("Tang");
            }
            else {
                System.out.println(x);
            }
            result += x;
        }
        return result;
    }
}
