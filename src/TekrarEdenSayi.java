import java.util.HashMap;

public class TekrarEdenSayi {

    /** String s= "ABCCDE" var diyelim tekrar eden karakteri bul ve dön örnek için C dönecek*/

    public static void main(String[] args) {

    }

    public static String tekrarlayanKarekterBul(String s){

        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            String karakter = s.substring(i,i+1);

            if(!hashMap.containsKey(karakter))
                hashMap.put(karakter,1);
            else
                return karakter;
        }

        return null;
    }


}
