class Solution {
    public String reformat(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        char[] letters = new char[n];
        char[] numbers = new char [n];
        int letter = 0;
        int number = 0;

        for (char  ch : arr) {
            if (Character.isDigit(ch)) {
                numbers[number++] = ch;
            } else {
                letters[letter++] = ch;
            }
        }

        if (Math.abs(letter - number) > 1) {
            return "";
        }
        
        boolean letterTurn = letter >= number;
        
        for (int i = 0; i < n; i++) {
            if (letterTurn) {
                arr[i] = letters[--letter];
            } else {
                arr[i] = numbers[--number];
            }
            letterTurn = !letterTurn;
        }

        return new String(arr);
    }
}