import java.util.ArrayList;
public class WordChecker {

    private ArrayList<String> wordList;

    public WordChecker(ArrayList<String> list)
    {
        wordList = list;
    }

    public WordChecker() 
    {
        wordList = new ArrayList<String>();
    }
    /** Initialized in the constructor and contains no null elements */

    /**
     * Returns true if each element of wordList (except the first) contains the
     * previous
     * element as a substring and returns false otherwise, as described in part (a)
     * Precondition: wordList contains at least two elements.
     * Postcondition: wordList is unchanged.
     */
    public boolean isWordChain() {
        for(int i = 1; i < wordList.size(); i++) {
            String after = wordList.get(i);
            String before = wordList.get(i - 1);
            if(after.indexOf(before) < 0) return false;
        }
        return true;
    }

    /**
     * Returns an ArrayList<String> based on strings from wordList that start
     * with target, as described in part (b). Each element of the returned ArrayList
     * has had
     * the initial occurrence of target removed.
     * Postconditions: wordList is unchanged.
     * Items appear in the returned list in the same order as they appear in
     * wordList.
     */
    public ArrayList<String> createList(String target) {
        ArrayList<String> list = new ArrayList<String>();
        for (String s : wordList) {
            if(s.indexOf(target) == 0) {
                list.add(s.substring(target.length()));
            }
        }
        return list;
    }
}