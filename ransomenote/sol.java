class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        // kind of like valid anagram
        // want to see if same letters
        // except now, extra is okay
        
        // edge cases

        if (magazine.isEmpty() == true && ransomNote.isEmpty() == true){
            return true;
        }
        
        if (magazine.isEmpty() == true && ransomNote.isEmpty() == false){
            return false;
        }

        if (magazine.isEmpty() == false && ransomNote.isEmpty() == true){
            return false;
        }
        
        // count the number of times each character appears in the magazine
        
        for (char c : magazine.toCharArray()) { count[c - 'a']++; }
    
        // check if we can create the ransom note using only the characters from the magazine
        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false;
                }
                count[c - 'a']--;
                }
                
        return true;
    }
}
