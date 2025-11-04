//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
                int n = Integer.parseInt(args[1]);

                int wordLength = word.length();

                String vowels[] = {"A", "E", "F", "H", "I", "L", "M", "N", "O", "R", "S", "X"};
                
                //going across input word letters
                for (int i = 0; i < wordLength; i++) {
                        String currentLetter = (""+word.charAt(i)).toLowerCase();
                        String prefix = "a ";
                        
                        //going across the vowels
                        for (int j = 0; j<vowels.length; j++) {
                                String CurrentVowel = vowels[j].toLowerCase();
                                
                                if (currentLetter.equals(CurrentVowel)) {
                                        prefix = "an";
                                }
                        }
                        // System.out.println(currentLetter);
                        System.out.println("Give me " + prefix + " " + currentLetter.toUpperCase() + ": " + currentLetter.toUpperCase() + "!");


                        // System.out.println(word);
                }
                

                // System.out.println("a" == "A".toLowerCase());
                System.out.println("What does that spell?");
                for (int i = 0; i<n; i++) {
                        System.out.println(word.toUpperCase()+"!!!");
                }
        }
}
