class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String firstWord = "";
        String secondWord = "";

        for(String i: word1)
            firstWord += i;
        
        for(String j: word2)
            secondWord += j;
        
        return (firstWord.equals(secondWord)) ? true : false;
    }
}