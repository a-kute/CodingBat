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


    public static void main (String ... args){
        SolutionsOCT19 sol = new SolutionsOCT19();
        String result = sol.stringSplosion("hello");
        System.out.println(result);

    }
}
