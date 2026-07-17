class Solution {
        StringBuilder path= new StringBuilder();
        ArrayList<String> allPaths=new ArrayList<>();
        String[] options = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };
    public List<String> letterCombinations(String digits) {
        helper(digits,0);
        return allPaths;

    }
    public void helper(String digits,int i){
        if(i>=digits.length()){
            allPaths.add(path.toString());
            return;
        }
        String letters=options[digits.charAt(i)-'0'];
        for(char ch: letters.toCharArray()){
            path.append(ch);
            helper(digits,i+1);
            path.setLength(path.length()-1);
        }
    }
}