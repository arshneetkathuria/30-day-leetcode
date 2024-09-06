class Solution {

// Approach 1: Using Hash Map where count of each occurance is matched

//     public boolean isAnagram(String s, String t) {
//         Map<Character,Integer> s_map=new HashMap<>();
//         Map<Character,Integer> t_map=new HashMap<>();
//         char[] s_array=s.toCharArray();
//         char[] t_array=t.toCharArray();

//        if(s_array.length!=t_array.length)
//        return false;

//        for (int i=0;i<s_array.length;i++)
//        {
// s_map.put(s_array[i],s_map.getOrDefault(s_array[i],0)+1);
// t_map.put(t_array[i],t_map.getOrDefault(t_array[i],0)+1);
//        }

//        return s_map.equals(t_map);

//     }

// Approach 2: Using ASCII code to fill the array and keep the count
public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length())
    return false;
  
    int[] char_array=new int[26];
  
    for(int i =0;i<s.length();i++)
    {
      char_array[s.charAt(i)-'a']++;
      char_array[t.charAt(i)-'a']--;
    }
  
    for(int i=0;i<char_array.length;i++)
    {
      if(char_array[i]!=0)
      return false;
    }
    return true;
  
      }
}