public class Palindrome {
    
    private String removeSpecial(String sentence){
        return sentence.replaceAll("[^\\p{L}\\p{Z}]","");
    }
    
    private String removeSpaces(String sentence){
        return sentence.replaceAll("\\s","");
    }
     
    private String toUpper(String sentence){
        return sentence.toUpperCase();
    }
    
    public boolean check(String sentence) {
        //pre-process the string to remove special characters and spaces
        sentence = toUpper(removeSpaces(removeSpecial(sentence)));
        int i,length = sentence.length();

        //checking if it is palindrome
        for(i = 0 ; i < length/2 ; i++){
            //check if characters at index i from start and end are equal or not.
            //If not, then it is not palindrome
            if(sentence.charAt(i) != sentence.charAt(length-1-i))
                return false;
        }
        return true;
    }
    
}
