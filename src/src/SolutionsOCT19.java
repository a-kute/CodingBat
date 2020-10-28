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
        int result = sol.reverse(1534236469);
        System.out.println(result);
        System.out.println(Integer.MAX_VALUE);



    }
}
