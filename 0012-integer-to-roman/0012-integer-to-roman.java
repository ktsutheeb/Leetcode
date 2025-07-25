// class Solution {
//     public String intToRoman(int num) {
//         String M[] = {"", "M", "MM", "MMM"};
//     String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
//     String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
//     String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
//     return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
//     }
// }
class Solution {
     public String intToRoman(int num) {
        int []value={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String []symbol={"m","cm","d","cd","c","xc","l","xl","x","ix","v","iv","i"};
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<value.length;i++){
            while(num>=value[i]){
                num-=value[i];
                sb.append(symbol[i]);
            }
        }
        return sb.toString().toUpperCase();
     }
}