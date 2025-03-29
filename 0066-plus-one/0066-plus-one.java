class Solution {
    public int[] plusOne(int[] digits) {
        // StringBuilder sb = new StringBuilder();    // To store digits as a string
        
        // // Loop through array and append each digit
        // for (int num : digits) {
        //     sb.append(num);  // Append digit to string
        // }
        
        // // Convert the string to an integer
        // long result = Long.parseLong(sb.toString());
        // result++;
        // System.out.print(result);
        // String s=String.valueOf(result);
        // int arr[] = new int[s.length()];
        // for(int i=0;i<s.length();i++){
        //     char c= s.charAt(i);
        //     arr[i]=c - '0'; // char to int
        // }
        // // int n=0;
        // // while(res>0){
        // //     int t=res%10;
        // //     res=res/10;
        // //     num=num*10+t;
        // //     n++;
        // // }
        // // int arr[] = new int[n];
        // // int j=0;
        // // while(j<n){
        // //     int te=num%10;
        // //     arr[j++]=te;
        // //     num=num/10;
        // // }
        // // return arr;
        // return arr;

        // long num=0;
        // for(int i:digits)
        // num=(num*10+i);
        // num+=1;
        // String s=num+"";
        // int[] ans=new int[s.length()];
        // for(int i=0;i<s.length();i++)
        // {
        //     ans[i]=s.charAt(i) - '0';
        // }
        // return ans;
        int n=digits.length;
        if(digits[n-1]!=9){
            digits[n-1]++;
            return digits;
        }
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9 && i!=0){
                digits[i]=0;
            }
            else{
                if(digits[i]==9 && i==0){
                    digits[0]=1; 
                } 
                else{
                    digits[i]++;
                    return digits;
                }
                
            }
        }
        int ans[] = new int[n+1];
        for(int i=0;i<n;i++){
            ans[i]=digits[i];
        }
        ans[n]=0;
        return ans;
    }
}