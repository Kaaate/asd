public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        String[] arr = str.split("");
        for(String i : arr){
            if(i.equals("a")||i.equals("e")||i.equals("i")||i.equals("o")||i.equals("u")){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

}
