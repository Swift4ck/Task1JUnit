public class CountVowels {


    public int countVowels(String word) {
        if (word == null || word.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.toLowerCase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        return count;
    }

    public CountVowels() {
    }
}