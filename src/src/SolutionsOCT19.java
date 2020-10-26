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





    public static void main (String ... args){
        SolutionsOCT19 sol = new SolutionsOCT19();
        int hi = sol.array667(new int[] {6,6,2});
        System.out.println(hi);



    }
}
