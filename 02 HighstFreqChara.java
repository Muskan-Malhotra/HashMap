import java.io.*;
import java.util.*;

class HighestFreq {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        maxFreqChar(s);
    }
    
    public static void maxFreqChar(String s){
        
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(hm.containsKey(c)){
                int oval = hm.get(c);
                int nval = oval+1;
                hm.put(c,nval);
            }
            else{
                hm.put(c,1);
            }
        }
        
        int maxval = 0;
        char chh = '\0';
        for(Character ch : hm.keySet()){
            int val = hm.get(ch);
            if(val>maxval){
                maxval = val;
                chh=ch;
                
            }
            
        }
        
        // System.out.print(maxval+" "+chh);
        System.out.print(chh);
    }

}