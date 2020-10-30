import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionsOCT19 {
    public String stringBits(String str) {
        String hi = "";
        for (int i = 0; i< str.length(); i+=2) {
            hi += str.charAt(i);
        }
        return hi;
    }

    public String stringSplosion(String str) {
        String result = "";
        for (int i = 1; i<=str.length(); i ++) {
            result += str.substring(0,i);
        }
        return result;

    }

    public int last2(String str) {
        if(str.length()<2)
            return 0;
        String l2 = str.substring(str.length()-2,str.length());
        int count = 0;


        for (int i = 0; i< str.length()-2; i++) {
            if (str.substring(i,i+2).equals(l2)) {
                count++;
            }
        }
        return count;

    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        int upperlimit = isSummer ? 100 : 90;
        return (temp>= 60 && temp <= upperlimit);

    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        int booster = isBirthday ? 5 : 0;
        if (speed <= 60 +booster) return 0;
        if(speed <= 80 + booster) return 1;
        return 2;



    }

    public int sortaSum(int a, int b) {
        int sum = a+b;
        return (sum >= 10 && sum<= 19) ? 20 : sum;

    }

    public String alarmClock(int day, boolean vacation) {
        boolean weekday = (day==0||day == 6) ? false :true;
        if (weekday&&vacation) {
            return "10:00";
        }
        if (!weekday && vacation){
            return "off";
        }

        if (weekday && !vacation) {
            return "7:00";
        }
        return "10:00";

    }

    public boolean love6(int a, int b) {
        if(a==6||b==6) {
            return true;
        }
        if((a+b==6)||(a-b==6)||(b-a ==6)) {
            return true;

        }
        return false;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count ++;
            }
        }
        return count;

    }

    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i<nums.length && i<4; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;

    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) {
                return true;
            }
        }
        return false;

    }

    public int stringMatch(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length()-1 && i < b.length()-1 ;i++) {
            if(a.substring(i,i+2).equals(b.substring(i,i+2))) {
                count ++;
            }
        }
        return count;

    }


    public int loneSum(int a, int b, int c) {
        if (a == b) {
            if (a==c) {
                return 0;
            }
            return c;
        }
        if (a==c) {
            return b;
        }
        if(b==c) {
            return a;
        }
        return a+b+c;

    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if( b== 13) {
            return a;
        }
        if (c==13) {
            return a+b;

        }
        return a+b+c;

    }

    public int noTeenSum(int a, int b, int c) {
        a = fixTeen(a);
        b = fixTeen(b);
        c = fixTeen(c);
        return a+b+c;
    }

    public int fixTeen(int n) {
        if (n>=13 && n<15) return 0 ;
        if (n>=17 && n<=19) return 0;
        return n;
    }

    public String stringX(String str) {
       String result = "";
       hello: for (int i = 0; i< str.length();i++) {
           if(str.charAt(i)=='x' &&  (i !=0) && (i != str.length()-1)){
               continue hello;
           }
           result += str.charAt(i);
       }
    return result;

    }

    public String altPairs(String str) {
        String result = "";
        for (int i = 0,j = 1; i < str.length(); i = (j==1) ? i+1 : i + 3, j = (j==1) ? 0 : 1) {
            result += str.charAt(i);

        }
        return result;

    }

    public String stringYak(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i+=1){
            if (i+3 < str.length() && str.substring(i,i+3).equals("yak")) {
                i += 2;
                continue;

            }
            result += str.substring(i,i+1);
        }
        return result;

    }

    public int array667(int[] nums) {

        int count = 0;
        for (int i = 0;  nums.length-2 >=i ;i++) {
            if(nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7))
                count++;
        }
        return count;

    }

    public int roundSum(int a, int b, int c) {
        return (round10(a)+round10(b)+round10(c));

    }

    public int round10(int num){

        int rightMost = num%10;
        int result=0;
        if (num == 0) return 0;
        if (rightMost<5) {
            if (num/10 == 0) {
                return 0;
            }
            result = num/10 * 10;
            return result;
        }
        return ((num/10)+1) * 10;


    }

    public boolean scoresIncreasing(int[] scores) {
        int x = scores[0];
        for (int i = 1 ; i <= scores.length-1 ; i++){
            if (scores[i] >= x) {
                x = scores[i];
            } else if (scores[i] < x) return false;

        }
        return true;

    }

    public String[] wordsFront(String[] words, int n) {
        String[] result = new String[n];
        for (int i = 0 ; i< n; i++) {
            result[i] = words[i];
        }
        return result;
    }
    public List wordsWithoutList(String[] words, int len) {
        var result = new ArrayList();
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() == len) continue;
            result.add(words[i]);

        }
        return result;
    }

    public boolean hasOne(int n) {
        while (n > 0) {
            if (n%10 == 1) return true;
            n /= 10;
        }
        return false;
    }

    public int max1020(int a, int b) {
        int a1 = 0;
        int b1 = 0;

        if (!(a>20 || a < 10) ) a1 = a;
        if (!(b>20 || b < 10) ) b1 = b;

        return(Math.max(a1,b1));

    }

    public int max1020AlternateSolution(int a, int b) {
        int max = Math.max(a,b);
        int min = Math.min(a,b);

        if(max<21 && max>9) return max;
        if(min<21 && min>9) return min;
        return 0;

    }

    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'e') count += 1;
        }
        return (count>0 && count <4) ? true : false;


    }

    public boolean closeFar(int a, int b, int c) {

        if((Math.abs(b-a)<2) && (Math.abs(c-a)>1) && (Math.abs(b-c)>1)) return true;
        if ((Math.abs(c-a)<2) && (Math.abs(b-a)>1) && (Math.abs(b-c)>1)) return true;
        return false;



    }

    public int blackjack(int a, int b) {
        if (a >21) a = 0;
        if(b > 21) b = 0;
        return Math.max(a,b);


    }

    public boolean evenlySpaced(int a, int b, int c) {
        int[] result = {a,b,c};
        Arrays.sort(result);
        return ((Math.abs(result[0]-result[1]) == Math.abs(result[2]-result[1])));

    }
    public int reverse(int x) {
        String integer = Integer.toString(x);
        String newInteger ="";
        if (integer.charAt(0) == '-') {
            newInteger += "-";
            integer = integer.substring(1, integer.length());
        }

        while(integer.length() > 0) {
            char latestDigit = integer.charAt(integer.length()-1);
            newInteger += latestDigit;
            integer = integer.substring(0,integer.length()-1);
        }
        try {
            return Integer.parseInt(newInteger);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    class Solution {
        public int reverse(int x) {
            StringBuilder sb = new StringBuilder();
            String s = Integer.toString(x);
            if(x<0) {
                s = s.substring(1, s.length());
            }
            sb.append(s).reverse();
            if(x<0) sb.append("-",0,1);
            try {
                int a = Integer.parseInt(sb.toString());
                return a;
            } catch( NumberFormatException e) {
                return 0;
            }
        }
    }

    public int[] middleWay(int[] a, int[] b) {
        int [] result = new int [2];
        result[0] = a[1];
        result[1] = b[1];
        return result;

    }
    public int[] makeEnds(int[] nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(nums[0]);
        result.add(nums[nums.length-1]);
        Object[] results = result.toArray();
        int[] resulting= new int[result.size()];
        int counter = 0;
        for (Object a : results) {
            Integer b = (Integer) a;
            resulting[counter] = b.intValue();
            counter++;
        }
        return resulting;

    }

    public boolean has23(int[] nums) {
        for (int i = 0; i < 2; i++) {
            if(nums[i] == 2 || nums[i] == 3) return true;
        }
        return false;

    }

    public boolean no23(int[] nums) {
        boolean a = true;
        for (int i = 0; i< 2; i++) {
            if(nums[i] == 2 || nums[i] == 3) a = false;
        }
        return a;

    }

    public int[] makeLast(int[] nums) {
        int[] result = new int[nums.length*2];
        result[result.length-1] = nums[nums.length-1];
        return result;

    }

    public boolean double23(int[] nums) {
        int two = 0;
        int three =0;

        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 2) two++;
            if(nums[i]==3) three++;
        }

        return (two==2 || three==2);

    }
    public int[] fix23(int[] nums) {
        if(nums[0] == 2 && nums[1] == 3) nums[1] =0;
        if(nums[1] == 2 && nums[2]==3) nums[2] = 0;
        return nums;

    }
    public int start1(int[] a, int[] b) {
        int result = 0;
        if(a.length>0 && a[0] ==1) result++;
        if(b.length >0 &&b[0]==1) result++;
        return  result;

    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sum1 = a[0] + a[1];
        int sum2 = b[0] +b[1];
        return sum1>=sum2 ? a : b;

    }
    public int[] makeMiddle(int[] nums) {
        int[] result = new int[2];
        result[0] =nums[nums.length/2 - 1];
        result[1] = nums[nums.length/2];
        return result;

    }

        public int romanToInt(String s) {
        int result = 0;
            while(s.length()>0){
                if(s.charAt(0) == 'X') {
                    if (s.length() > 1){
                        if (s.charAt(1) == 'L') {
                            result += -10;
                        } else if (s.charAt(1) == 'C') {
                            result += -10;
                        } else {
                            result += 10;
                        }
                } else {
                        result +=10;

                }

                }
                if(s.charAt(0) == 'I') {
                    if (s.length() > 1) {
                        if (s.charAt(1) == 'V') {
                            result += -1;
                        } else if (s.charAt(1) == 'X') {
                            result += -1;
                        } else {
                            result += 1;
                        }
                    } else result += 1;

                }
                if(s.charAt(0) == 'C') {
                    if (s.length() > 1) {
                        if (s.charAt(1) == 'D') {
                            result += -100;
                        } else if (s.charAt(1) == 'M') {
                            result += -100;
                        } else {
                            result += 100;
                        }
                    } else result += 100;

                }
                if(s.charAt(0) == 'D') result += 500;
                if(s.charAt(0)== 'M') result +=1000;
                if(s.charAt(0) == 'L') result += 50;
                if(s.charAt(0)== 'V') result += 5;
                s = s.substring(1,s.length());

            }
            return result;

     }

    public boolean in1To10(int n, boolean outsideMode) {
        return (outsideMode) ? ((n<2)|| (n>9)) : (n>0 && n < 11) ;

    }

    public boolean specialEleven(int n) {
        return (n%11 == 0 || n%11 ==1);

    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];

        String first = strs[0];
        String result = "";
        int counter = first.length();



        for (int i = 1; i < strs.length ; i++ ) {
            if(first.substring(0,counter).isEmpty()) return result;
            if(strs[i].indexOf(first.substring(0,counter)) !=0){
                i=0;
                counter--;
                result = "";
                continue;
            }
            result = first.substring(0,counter);
        }
        return result;



    }
    public int removeDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int counter = i;
            if (nums[i] == Integer.MAX_VALUE) continue;
            int current = nums[i];

            hi: while(counter < nums.length-1) {
                if(nums[counter+1] == Integer.MAX_VALUE){
                    counter++;
                    continue hi;
                }

                if(current == nums[counter+1]){
                    nums[counter+1] = Integer.MAX_VALUE;
                }
                counter++;
            }
        }
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != Integer.MAX_VALUE) total++;
        }
        return total;

    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] result = new int[4];
        result[0] = a[0];
        result[1] = a[1];
        result[2] = b[0];
        result[3] = b[1];
        return result;



    }
    public int[] swapEnds(int[] nums) {
        if (nums.length == 1) return  nums;
        int holder = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = holder;
        return nums;

    }

    public int[] midThree(int[] nums) {
        int[] result = new int[3];
        result[0] = nums[nums.length/2-1];
        result[1] = nums[nums.length/2];
        result[2] = nums[nums.length/2+1];
        return  result;

    }

    public int maxTriple(int[] nums) {
       int max = nums[0] > nums[nums.length-1] ? nums[0]: nums[nums.length-1];
       return max > nums[nums.length/2] ? max : nums[nums.length/2];


    }

    public int[] fix34(int[] nums) {
        int first3;
        int valueAfter3;
        int first4 =1 ;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 3 && nums[i+1]!=4) {
                first3 = i;
                valueAfter3 = nums[i+1];
                for (int j =1 ; j < nums.length; j++) {
                    if(nums[j] == 4 && nums[j-1]!=3) {
                        first4 = j;
                        break;
                    }
                }
                nums[first3+1] = nums[first4];
                nums[first4] = valueAfter3;


            }
        }
        return nums;

    }

    public int[] fix45(int[] nums) {
        int first3;
        int valueAfter3;
        int first4 =1 ;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 4 && nums[i+1]!=5) {
                first3 = i;
                valueAfter3 = nums[i+1];
                for (int j =0 ; j < nums.length; j++) {
                    if(i == 1|| j==0) {
                        if(nums[j] == 5) {
                            first4 = j;
                            break;
                        }
                    }
                    if(nums[j] == 5 && nums[j-1]!=4) {
                        first4 = j;
                        break;
                    }
                }
                nums[first3+1] = nums[first4];
                nums[first4] = valueAfter3;


            }
        }
        return nums;

    }

    public int removeElement(int[] nums, int val) {
        int counter = 0;
        int i = 0;
        while(i< nums.length-counter) {
            if (nums[i] != val) {
                i++;
                continue;
            }
            if (nums[i] == val) {
                int placeHolder = nums[nums.length-counter-1];
                counter++;
                nums[i] = placeHolder;
                continue;
            }

        }
        return nums.length-counter;

    }


















    public boolean isPalindrome(int x) {
            StringBuilder result = new StringBuilder();
            result.append(Integer.toString(x));
            result.reverse();
            System.out.println(result);
            if(result.toString().equals(Integer.toString(x))) return true;
            return false;

        }


    public static void main (String ... args){
        SolutionsOCT19 sol = new SolutionsOCT19();
        int[] hi = {3,2,2,3};
        System.out.println(sol.removeElement(hi,3));
        //System.out.println(Integer.MAX_VALUE);



    }
}





















