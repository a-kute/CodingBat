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






    public static void main (String ... args){
        SolutionsOCT19 sol = new SolutionsOCT19();
        int result = sol.caughtSpeeding(60, false);
        System.out.println(result);

    }
}
