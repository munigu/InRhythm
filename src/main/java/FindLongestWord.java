class FindLongestWord
{
    private String maxWord = null;
    private int maxWordLength = 0;

    private boolean isCharacter(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    void maxLengthWords(String input)
    {
        if (input == null) return;

        int maxLength = 0;
        int currentWordStart = 0;
        int longestWordStart = 0;

        for (int i = 0; i <= input.length(); i++) {
            if (i == input.length() || !isCharacter(input.charAt(i))) {
                int currentLength = i - currentWordStart;

                if (currentLength > maxLength) {
                    maxLength = Math.max(maxLength, currentLength);
                    longestWordStart = currentWordStart;
                }
                currentWordStart = i + 1;
            }
        }

        if (maxLength > 0) {
            maxWord = input.substring(longestWordStart, longestWordStart + maxLength);
        }

        maxWordLength = maxLength;
    }

    public String getMaxWord() {
        return maxWord;
    }

    public int getMaxWordLength() {
        return maxWordLength;
    }


}