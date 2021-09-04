package FootballScore;
import java.util.*;

public class MainPro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String adata = "";
        Person1st First = new Person1st();
        Person2nd Second = new Person2nd();
        HeadQuater hq = new HeadQuater();
        hq.register(First);
        hq.register(Second);
        while(true) {
            adata = sc.nextLine();
            if (adata.equals("")) {
                break;
            }
            else {
                hq.setSomeData(adata);
            }
        }

    }
    
}
