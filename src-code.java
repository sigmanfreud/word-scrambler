
public class WordScrambler{
    static String ScrambleBoi(String x){
        ArrayList<String> list1 = new ArrayList<String>();
        for (int i = 0; i < x.length(); i++){
            String s = String.valueOf(x.charAt(i));
            list1.add(s);
        }

        Collections.shuffle(list1);

        String EmptyString = "";
        for (int j = 0; j < list1.size(); j++){
            EmptyString = EmptyString + list1.get(j);
        }

        return EmptyString;
    }    

    public static void main(String[] args){
        System.out.println("This is an Anagram. You will be given a scrambled set of letters. Your goal is to unscramble them. \n");

        ArrayList<String> dictionary = new ArrayList<String>();

        dictionary.add("aardvark"); 
        dictionary.add("barracuda"); 
        dictionary.add("camel"); 
        dictionary.add("beetle");
        dictionary.add("beaver");
        dictionary.add("angelfish");
        dictionary.add("rhinoceros");
        dictionary.add("chimpanzee");
        dictionary.add("monkey");
        dictionary.add("penguin");
        dictionary.add("human");
        dictionary.add("labrador");

        Scanner input = new Scanner(System.in);

        int pointcount = 0;

        for (int j = 4; j > 0; j --){
            int indexvalue = (int) (j * Math.random()); 

            for (int i = 0; i < dictionary.size(); i++){
                String word = dictionary.get(indexvalue);
                String ScrambledWord = ScrambleBoi(word);

                System.out.println(ScrambledWord);
                System.out.println("Enter Unscrambled Word Here: ");

                String UserAnswer = input.nextLine();
                // int pointcount = 0;

                if (UserAnswer.equals(word)){
                    System.out.println("Correct! +1 Points \n");
                    pointcount += 1;
                }
                else{
                    System.out.println("Incorrect. 0 Points");
                    System.out.println("The correct answer is " + "\"" + word + "\"" + ".\n");
                }
                dictionary.remove(indexvalue);

                if (dictionary.size() == 0){
                    System.out.println("Game Over. You scored " + pointcount + " points!");
                }

            }
        }
    }
}

