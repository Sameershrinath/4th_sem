public class Examprep1 {
    public static void main(String[] args) {
        StringBuffer name2=new StringBuffer("Hello");
        int vowel = 0;

        System.out.println("String: " + name2);

        for (int i = name2.length() - 1; i >= 0; i--) {
           
            if (name2.charAt(i) == 'a' || name2.charAt(i) == 'e' || name2.charAt(i) == 'i' || 
                name2.charAt(i) == 'o' || name2.charAt(i) == 'u') {
                vowel++;
            }
        }

        // Count vowels, consonants, and total letters
        System.out.println("Total number of vowels = " + vowel);
        System.out.println("Total number of consonants = " + (name2.length() - vowel));
        System.out.println("Total number of letters = " + name2.length());
        System.out.println("Reversed string " + name2.reverse());
    }
}
