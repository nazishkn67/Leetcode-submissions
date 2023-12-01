class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(String i: word1)
            str1.append(i);
        
        for(String j: word2)
            str2.append(j);
        
        String firstWord = str1.toString();
        String secondWord = str2.toString();
        
        return (firstWord.equals(secondWord)) ? true : false;
    }
}