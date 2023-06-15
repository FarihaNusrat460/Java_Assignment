//15. Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
//"I live in Bangladesh"

public class CountWordChar {
    public static void main(String[] args) {

        String myStr = "I live in Bangladesh";
        char[] arry = myStr.toCharArray();


        //word count
        String[] word = myStr.split(" ");
        System.out.println("Number of words: " + word.length);


        //character count without space
        String replace = myStr.replaceAll(" ", "");
        System.out.println("Number of chars without spaces: " + replace.length());


        int vowel = 0;
        int conso = 0;

        //Number of vowels:
        for (int i = 0; i < myStr.length(); i++) {

            if ((arry[i] == 'a' || arry[i] == 'e' || arry[i] == 'i' || arry[i] == 'o' || arry[i] == 'u') ||
                    (arry[i] == 'A' || arry[i] == 'E' || arry[i] == 'I' || arry[i] == 'O' || arry[i] == 'U')) {
                vowel++;

            }
            // Number of consonant
            else if ((arry[i] >= 'a' && arry[i] <= 'z') || (arry[i] >= 'A' && arry[i] <= 'Z')) {
                conso++;

            }


        }
        System.out.println("Number of vowels:" + vowel);
        System.out.println("Number of consonant: " + conso);


    }
}
