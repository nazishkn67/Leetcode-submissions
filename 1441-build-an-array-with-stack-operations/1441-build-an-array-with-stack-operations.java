class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        int targetIndex = 0; 
        int currentNumber = 1; 

        while (targetIndex < target.length) {
            
            if (target[targetIndex] == currentNumber) {
                operations.add("Push");
                targetIndex++;
            } else {
                operations.add("Push");
                operations.add("Pop");
            }
            currentNumber++;
        }
        return operations;
    }
}