class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String firstWord = "";
        String secondWord = "";

        for(int i = 0; i < word1.length; i++)
            firstWord += word1[i];
        
        for(int j = 0; j < word2.length; j++)
            secondWord += word2[j];
        
        return (firstWord.equals(secondWord)) ? true : false;
    }
}