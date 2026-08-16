class Solution {
    public String reverseWords(String s) {
        String trim=s.trim();
        String[] split=trim.split("\\s+");

        int i=0;
        int j=split.length-1;
        while(i<j)
        {
            String temp=split[i];
            split[i]=split[j];
            split[j]=temp;

            i++;
            j--;
        }

    return String.join(" ",split);

        
    }
}