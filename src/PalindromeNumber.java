public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(1221));
    }

    public boolean isPalindrome(int x){

        boolean isPalindrome = true;
        String value = String.valueOf(x);
        int low =0;
        int high = value.length()-1;

        while (low<high){
            if(value.charAt(low) != value.charAt(high)){
                isPalindrome=false;
                break;
            }
            low++;
            high--;

        }

        return isPalindrome;
    }

}
