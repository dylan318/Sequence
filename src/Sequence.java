public class Sequence {
    public static void main(String[] args) {
        
        int[] passList = {8, 4, 15, 9, 1, 30, 2, 1, 20};

        
        int longestSequence = findLongestCompletePassSequence(passList);

        
        System.out.println("The length of the longest sequence of complete passes is: " + longestSequence);
    }

    private static int findLongestCompletePassSequence(int[] passList) {
        int totalItems = passList[0];
        int currentSequenceLength = 0;
        int longestSequence = 0;

        for (int i = 1; i <= totalItems; i++) {
            if (passList[i] == -1) {
                
                currentSequenceLength = 0;
            } else {
                
                currentSequenceLength++;

                
                if (currentSequenceLength > longestSequence) {
                    longestSequence = currentSequenceLength;
                }
            }
        }

        return longestSequence;
    }
}

