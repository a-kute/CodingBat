import java.lang.reflect.Array;
import java.util.*;

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

    public boolean more20(int n) {
        return (n%20==1 || n%20 ==2);

    }

    public boolean old35(int n) {
        return (n%3==0 ^ n%5==0 );

    }

    public boolean less20(int n) {
        return (n%20== 19 || n%20==18);

    }

    public boolean nearTen(int num) {
        return(num%10 > 7 || num%10 <3);

    }

    public int teenSum(int a, int b) {
        boolean isTeen = ((a >12) && (a<20)) ||  ((b >12) && (b<20)) ? true: false;
        return isTeen ? 19 : a+b ;

    }

    public boolean canBalance(int[] nums) {
        int counter = 0;
        int length = nums.length;
        int sum1;
        int sum2;

        while (counter < length-1) {
            sum1 = 0;
            sum2= 0;

            for (int i = 0; i < counter+1; i++){
                sum1 += nums[i];
            }
            for(int i = counter +1 ; i< length; i++) {
                sum2 += nums[i];
            }
            if(sum1==sum2) return true;
            counter++;
        }
        return false;


    }

    public boolean linearIn(int[] outer, int[] inner) {

        for (int a : inner) {
            if(Arrays.binarySearch(outer,a) <0) return false;
        }
        return true;

    }

    public int[] squareUp(int n) {
        int[] result = new int[n*n];
        for(int i = n; i>0;i--){
            for (int j = n-i;j >= 0; j--) {
                result[result.length-(n*j)-i] = i;
            }
        }
        return result;
    }

    public int[] seriesUp(int n) {
        int[] result = new int[n*(n+1)/2];
        int counter = 0;
        for(int i = n; i > 0 ; i--){
            for (int j = i ; j > 0; j--) {
                result[result.length-1-counter] = j;
                counter++;
            }
        }
        return result;


    }

    public int maxMirror(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >9){
                sb.append(" ");
            }
            sb.append(nums[i]);
        }
        String original = sb.toString();
        String reverse = sb.reverse().toString();
        int maxLength = 0;


        Outer: for(int i = 0; i < original.length(); i++){
            String current;
            for (int j =i+1; j <= original.length(); j++) {
                current = original.substring(i,j);
                int length = current.length();
                if (!reverse.contains(current)) continue Outer;
                if(reverse.contains(current)){
                    if (length>maxLength) maxLength = length;
                }
            }
        }
        return maxLength;

    }

    public int countClumps(int[] nums) {
        int clumps = 0;
        int counter = 0;
        while(counter< nums.length-1){
            int local;
            if(nums[counter] == nums[counter +1]) {
                clumps++;
                local = nums[counter];
            } else {
                counter++;
                if (counter == nums.length) return clumps;
                continue;
            }
            while (nums[counter] == local) {
                counter++;
                if (counter == nums.length) return clumps;
            }
        }
        return clumps;


    }

    public int maxSpan(int[] nums) {
        int maxLength = 0;
        int length;
        Outer: for(int i =0; i <= nums.length/2; i++) {
            for (int j = nums.length-1; j >= nums.length/2;j--) {
                if(nums[j] == nums[i]) {
                    length = j - i + 1;
                    if (length > maxLength) {
                        maxLength = length;
                        continue Outer;
                    }
                }
            }
        }
        return maxLength;

    }

    public boolean catDog(String str) {
        int AO = 0;
        int BO = 0;
        str = str.replace("dog","$");
        str = str.replace("cat", "$");
        for (int i = 0; i < str.length(); i++ ) {
            if(str.charAt(i) == '|') AO++;
            if(str.charAt(i) == '$') BO++;
        }

        return (AO==BO);
    }

    public boolean endOther(String a, String b) {
        String longer = " ";
        String shorter = " ";
       if (a.length() > b.length()) {
           longer = a;
           shorter = b;
       } else {
           longer = b;
           shorter = a;
       }

       return(shorter.equalsIgnoreCase(longer.substring(longer.length()-shorter.length(), longer.length())));

    }

    public boolean xyzThere(String str) {
        for (int i = 0; i< str.length()-3; i++ ){
            if(str.substring(i, i+3).matches(".xyz")) return false;
            if(str.substring(i, i+3).matches("xyz")) return true;
        }
        return false;

    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length()-2; i++) {
            if(str.substring(i, i+3).matches("b(\\w)b")) return true;
        }
        return false;
    }

    public boolean xyBalance(String str) {
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) == 'x') {
                if  (str.substring(i+1, str.length()).contains("y")){
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public String mixString(String a, String b) {
        StringBuilder sb = new StringBuilder();
        String longer;
        String shorter;
        if(a.length() > b.length()){
            longer = a;
            shorter = b;
        } else {
            longer = b;
            shorter = a;
        }
        for (int i = 0; i < shorter.length(); i++) {
            sb.append(a.charAt(i));
            sb.append(b.charAt(i));
        }
        sb.append(longer.substring(shorter.length()));
        return sb.toString();

    }

    public String repeatEnd(String str, int n) {
        StringBuilder sb = new StringBuilder();
        String sub = str.substring(str.length() - n);
        for(int i = 0; i < n; i++) {
            sb.append(sub);
        }
        return sb.toString();

    }

    public String repeatFront(String str, int n) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str.substring(0,n-i));
        }
        return sb.toString();

    }

    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count -1 ; i++) {
            sb.append(word+sep);
        }
        if(count>0) sb.append(word);
        return sb.toString();

    }
    public int countYZ(String str) {
        int count= 0;
        for(int i = 0; i< str.length(); i++) {
            if (str.charAt(i) == 'y' || str.charAt(i) == 'z' || str.charAt(i) == 'Y' || str.charAt(i) == 'Z') {
                if(i==str.length()-1){
                    count++;
                    break;
                }
                if(!Character.isLetter(str.charAt(i+1))) count++;
            }
        }
        return count;

    }

    public boolean lastDigit(int a, int b) {
        return (a% 10 == b%10);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int a : nums1) {
            result.add(a);
        }
        for (int a : nums2) {
            result.add(a);
        }
        int size = result.size();
        Collections.sort(result);
        if(result.size()%2 == 0) {
            int total = result.get(size/2 - 1) +result.get(size/2);
            return total/2;
        }
        return result.get(size/2);
    }

    public String endUp(String str) {
        if(str.length()<=3) return str.toUpperCase();
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0,str.length()-3));
        sb.append(str.substring(str.length()-3).toUpperCase());
        return sb.toString();

    }

    public String everyNth(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <str.length(); i+=n) {
            sb.append(str.charAt(i));
        }
        return sb.toString();

    }

    public String front3(String str) {
        if(str.length()<=3) return str+str+str;
        return str.substring(0,3) + str.substring(0,3)+str.substring(0,3);

    }

    public boolean unlucky1(int[] nums) {
        if(nums.length==0 || nums.length==1) return false;

        if (nums[0] == 1) {
            if (nums[1] == 3) return true;
        }
        if (nums[1] == 1) {
            if (nums[2] == 3) return true;
        }
        if (nums[nums.length-2] == 1) {
            if (nums[nums.length-1] == 3) return true;
        }
       return false;



    }

    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        if (a.length == 2) return a;
        if (a.length < 2) {
            if (a.length!=0)  {
                result[0] = a[0];
                result[1] = b[0];
                return  result;
            } else {
                result[0] = b[0];
                result[1] = b[1];
                return  result;

            }
        } else {
            result[0] = a[0];
            result[1] = a[1];
            return  result;
        }


    }

    public int[] front11(int[] a, int[] b) {
        int aL = a.length;
        int bL = b.length;
        if(aL>0 && bL >0) {
            return new int[] {a[0],b[0]};
        }
        if(aL>0 && bL ==0) {
            return new int[] {a[0]};
        }
        if(aL==0 && bL >0) {
            return new int[] {b[0]};
        }
        return  new int[]{};

    }

    public int[] frontPiece(int[] nums) {
        if (nums.length < 2) return nums;
        return new int[] {nums[0],nums[1]};

    }

    public String withoutString(String base, String remove) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < base.length(); i++) {
            if(i<base.length()-remove.length()+1 &&base.substring(i,i+remove.length()).equalsIgnoreCase(remove)) {
                i = i + remove.length()-1;

            } else {
                result.append(base.charAt(i));
            }

        }
        return result.toString();

    }

    public boolean equalIsNot(String str) {
        int isAppears = 0;
        int notAppears = 0;

        for(int i = 0; i < str.length();i ++) {
            str = str.replace("is","_");
            str = str.replace("not","|");
            if(str.charAt(i) == '_') isAppears ++;
            if(str.charAt(i) == '|') notAppears ++;
        }

        return isAppears == notAppears;


    }

    public boolean gHappy(String str) {

        for(int i =0; i< str.length(); i++) {
            if(i == 0) {
                if(str.charAt(i) == 'g') {
                    if(str.length() == 1) return false;
                    if(!(str.charAt(i+1)== 'g')) return false;
                    continue;
                }
            }
            if(i == str.length() -1 ){
                if(str.charAt(i) == 'g') {
                    if(!(str.charAt(i-1)== 'g')) return false;
                    continue;
                }
            }
            if(str.charAt(i) == 'g') {
                if(!(str.charAt(i-1)=='g' || str.charAt(i+1)== 'g')) return false;
            }
        }
        return true;

    }

    public int countTriple(String str) {
        int counter = 0;

        for(int i = 0; i < str.length()-2; i++) {
            char current = str.charAt(i);
            if(str.charAt(i+1) == current && str.charAt(i+2) == current) counter ++;
        }
        return counter;

    }

    public int sumDigits(String str) {
        int sum= 0;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {


                sum += Integer.parseInt(str.substring(i, i + 1));
            }


        }
        return sum;

    }

    public String theEnd(String str, boolean front) {
        if(front) {
            return str.substring(0,1);
        } else {
            return str.substring(str.length()-1, str.length());
        }


    }

    public String withouEnd2(String str) {

        if(str.length() < 1) return str;
        if(str.length() == 1) return "";
        return str.substring(1,str.length()-1);

    }

    public String middleTwo(String str) {

        return str.substring(str.length()/2-1,str.length()/2+1);

    }

    public boolean endsLy(String str) {
        if(str.lastIndexOf("ly") == -1) return false;
        return (str.lastIndexOf("ly") == str.length()-2);

    }

    public String nTwice(String str, int n) {
        String lastSub = str.substring(str.length()-n);
        return str.substring(0,n) + lastSub;

    }
    public String twoChar(String str, int index) {
        if((index > str.length()-2)|| index < 0) return str.substring(0,2);
        return str.substring(index, index + 2);

    }

    public String middleThree(String str) {

        return str.substring(str.length()/2 -1 ,str.length()/2+2);

    }

    public boolean hasBad(String str) {
        return (str.indexOf("bad") == 0 ||str.indexOf("bad") == 1);

    }

    public String atFirst(String str) {
        if(str.length() == 0) return "@@";
        if(str.length() == 1) return str + "@";
        return str.substring(0,2);

    }

    public String lastChars(String a, String b) {
        a = a.length()>0 ? a.substring(0,1) : "@";
        b = b.length()>0 ? b.substring(b.length()-1,b.length()) : "@";
        return a+b;

    }

    public boolean dividesSelf(int n) {
        int a = n;

        while(a>0) {
            int current = a%10;
            if(current == 0) return false;
            if(n%current != 0) return false;
            a = a/10;
        }
        return true;

    }

    public int[] copyEvens(int[] nums, int count) {
        int [] result = new int[count];
        int location = 0;
        for (int i = 0 ; i < nums.length; i++) {
            if(count == location) return result;
            if(nums[i]%2 == 0) {
                result[location] = nums[i];
                location++;
            }
        }
        return result;


    }

    public String conCat(String a, String b) {
        if (a.length() == 0 || b.length()==0) return a + b;
        if (a.charAt(a.length()-1) == b.charAt(0)) {
            return a.substring(0,a.length()) + b.substring(1);
        }
        return a + b;

    }

    public String lastTwo(String str) {
        if (str.length()<2) return str;
        if (str.length() == 2) return str.substring(1) + str.substring(0,1);
        return str.substring(0,str.length()-2) + str.substring(str.length()-1) + str.substring(str.length()-2,str.length()-1);

    }

    public String seeColor(String str) {
        if(str.indexOf("blue") == 0) return "blue";
        if(str.indexOf("red") == 0) return "red";
        return "";

    }

    public boolean frontAgain(String str) {
        if (str.length() <  2) return false;
        return (str.charAt(0) == str.charAt(str.length()-2) && str.charAt(1) == str.charAt(str.length()-1));

    }

    public String minCat(String a, String b) {
        int min = Math.min(a.length(),b.length());
        return (a.substring(a.length()-min,a.length()) + b.substring(b.length()-min,b.length()));

    }

    public String extraFront(String str) {
        if (str.length() < 3) return str+str+str;
        return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);

    }

    public String without2(String str) {
        if(str.length() < 1) return "";
        if (str.length() == 1) return str;
        if(str.substring(0,2).equals(str.substring(str.length()-2,str.length()))) {
            return str.substring(2);
        }
        return str;

    }

    public String deFront(String str) {
        if (str.charAt(0) == 'a') {
            if (str.charAt(1) == 'b') return str;
            return str.substring(0,1) + str.substring(2);
        }
        if (str.charAt(1) == 'b') return str.substring(1);
        return str.substring(2);

    }

    public String startWord(String str, String word) {
        if (word.length() == 1 && str.length() >0) return str.substring(0,1);
        String part = word.substring(1);
        if(str.indexOf(part) == 1) return str.substring(0,word.length());
        return "";

    }

    public String withoutX(String str) {
        if((str.length() == 1 && str.charAt(0) == 'x')|| str.length() == 0) return "";
        int start = 0;
        int last = str.length()-1;
        if (str.charAt(0) == 'x') start = 1;
        if (str.charAt(last) != 'x') last = str.length();
        return str.substring(start,last);

    }

    public String withoutX2(String str) {
        if (str.length()==0 ||(str.charAt(0) == 'x' &&str.length() ==1)) return "";
        if(str.charAt(0) == 'x') {
            if (str.charAt(1) == 'x') {
                return str.substring(2);
            }
            return str.substring(1);
        }
        if (str.charAt(1) == 'x') {
            return str.substring(0,1) + str.substring(2);
        }
        return str;


    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0;
        if (tea/2 >= candy) return 2;
        if (candy/2 >= tea) return 2;
        return 1;

    }

    public String fizzString(String str) {
        if (str.charAt(0)=='f'){
            if(str.charAt(str.length()-1) == 'b' ) {
                return "FizzBuzz";
            }
            return "Fizz";
        }
        if(str.charAt(str.length()-1) == 'b' ) {
            return "Buzz";
        }
        return str;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep) return false;
        if (isMorning && isMom) return true;
        if (!isMorning) return true;
        return false;

    }

    public String fizzString2(int n) {
        if (n%3 == 0) {
            if (n%5 == 0) {
                return "FizzBuzz!";
            }
            return "Fizz!";
        }
        if (n%5 == 0) return "Buzz!";
        return n+ "!";

    }

    public boolean twoAsOne(int a, int b, int c) {
        if (a + b ==c || a+c == b || b +c == a) return true;
        return false;

    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return (c > b);
        }
        return (c >b && a<b);

    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) return (a <= b && b <= c);
        return (a < b && b < c);

    }

    public boolean lastDigit(int a, int b, int c) {
        if (a%10 == b%10 || a%10 == c%10 || b%10 ==c%10) return true;
        return  false;

    }
    public boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a-b) >=10 || Math.abs(b-c) >=10 || Math.abs(a-c) >= 10 );

    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles) {
            if (die1 == die2) {
                if (die1== 6 || die2 == 6) {
                    return 1 + Math.min(die1,die2);
                }
                return 1 + die1 + die2;
            }
            return die1+die2;
        }
        return die1 + die2;

    }

    public int maxMod5(int a, int b) {
        if (a ==b ) return 0;
        if (a%5 == b%5) return Math.min(a,b);
        return Math.max(a,b);

    }

    public int redTicket(int a, int b, int c) {
        if (a == 2 && b ==2 && c ==2) return 10;
        if (a == b && b == c) return 5;
        if (a!= b && c!= a) return 1;
        return 0;

    }

    public int greenTicket(int a, int b, int c) {
        if (a==b && b == c && a ==c ) return 20;
        if (a!=b && b != c && a !=c) return 0;
        return 10;

    }

    public int blueTicket(int a, int b, int c) {
        int sum1 = a + b;
        int sum2 = b + c;
        int sum3 = a + c;

        if ( sum1 == 10 || sum2 == 10|| sum3 == 10) return 10;
        if ( sum1-sum2 == 10 || sum1 - sum3 == 10) return 5;
        return 0;

    }

    public boolean shareDigit(int a, int b) {
        int digit1 = a/10;
        int digit2 = a%10;
        int digit3 = b/10;
        int digit4 = b%10;
        if (digit1 == digit3 || digit1 == digit4 || digit2 == digit3 || digit2 == digit4 ) return true;
        return  false;

    }

    public int sumLimit(int a, int b) {
        int sum = a+b;
        if (String.valueOf(a).length() == String.valueOf(sum).length()) return sum;
        return a;

    }

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int tempSum = 0;
        for (int i = 0; i < nums.length; i++) {
           if (nums[i] < 0) {
               tempSum = 0;
               continue;
           }
           tempSum += nums[i];
           if (tempSum > max) max = tempSum;
        }

        return max;

    }

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return (str.substring(n).contains(prefix));

    }

    public boolean xyzMiddle(String str) {
        int location = str.indexOf("xyz");
        return (location  == str.length()-location+3 || location  == str.length()-location+2 || location  == str.length()-location+4);

    }

    public String getSandwich(String str) {
        int indexOne = str.indexOf("bread");
        int indexTwo = str.lastIndexOf("bread");
        if (indexOne == indexTwo) return "";
        return (str.substring(indexOne + 5, indexTwo));

    }

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length()-1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i-1) == str.charAt(i+1)) continue;
                return false;
            }
        }
        return true;

    }

    public String oneTwo(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str.length()/3; i++) {
            String current = str.substring(i*3, i*3+3);
            sb.append(current.substring(1));
            sb.append(current.substring(0,1));
        }
        return sb.toString();

    }

    public String zipZap(String str) {
        StringBuilder sb = new StringBuilder();
        if (str.length()<3) return str;
        for (int i = 0; i < str.length(); i++) {
            if(i>str.length()-3){
                sb.append(str.substring(i,i+1));
                continue;
            }
            if(str.substring(i, i+3).matches("^z\\w{1}p$")) {
                sb.append("zp");
                i+=2;
                continue;
            } else {
                sb.append(str.substring(i,i+1));
            }
        }
        return sb.toString();

    }

    public String starOut(String str) {
        StringBuilder sb = new StringBuilder();
        if(str.length() ==1) {
            if(str.charAt(0) == '*') return "";
            else return str;
        }
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '*') continue;
            if (i == 0) {
                if(str.charAt(i+1) != '*' ){
                    sb.append(str.charAt(i));
                    continue;
                } else continue;
            }
            if (i == str.length()-1) {
                if(str.charAt(i-1) != '*' ){
                    sb.append(str.charAt(i));
                    continue;
                } else continue;
            }
            if(str.charAt(i+1) != '*' && str.charAt(i-1) != '*'){
                sb.append(str.charAt(i));
                continue;
            }
        }
        return sb.toString();
    }

    public String plusOut(String str, String word) {
        str = str.replace(word,"_");
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< str.length(); i++) {
            if(str.charAt(i) == '_') sb.append(word);
            else sb.append("+");
        }
        return sb.toString();

    }





    public static void main (String ... args){
       // long startTime = System.nanoTime();
        SolutionsOCT19 sol = new SolutionsOCT19();
        int[] hi = {-2,1,-3,4,-1,2,1,-5,4};
        sol.starOut("*a");

       








    }
}





















