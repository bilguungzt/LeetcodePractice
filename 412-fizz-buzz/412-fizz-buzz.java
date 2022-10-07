class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> list = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            
            String current = "";
            
            if ( i % 3 == 0) {
                current = "Fizz";
                    
            } 
            if ( i % 5 == 0) {
                
                current = "Buzz";
            }
            if ( i % 15 == 0) {
                current = "FizzBuzz";
            }
            if ( current.length() == 0) {
                
                current = String.valueOf(i);
            }
            
            list.add(current);
            }
        return list;
        }
        
    }
