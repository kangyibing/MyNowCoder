/**
 * ָ�뷨
 */
public class ReplaceSpace2 {
    public String replaceSpace(StringBuffer str) {
       String str1 = str.toString();
        if(str1.equals(""))
            return str1;
        char [] strArray = str1.toCharArray();
        int i =0;
        int lengthSpace = 0;
        while(i < strArray.length){
           if(strArray[i] == ' ')
               lengthSpace++;
           i++;
       }
        int newStrLength = strArray.length + lengthSpace*2;
        char [] newStr = new char[newStrLength];
        int j = newStrLength-1;
        i = strArray.length - 1;
        while(i >= 0){
            if(strArray[i] !=  ' '){
             newStr[j--] = strArray[i--];
           }else{
               newStr[j--] = '0';
               newStr[j--] = '2';
               newStr[j--] = '%';
               i--;
           }
       }
       return new String(newStr);
    }
    public static void main(String[] args) {
        String str = new ReplaceSpace2().replaceSpace(new StringBuffer("we are family"));
        System.out.println(str);
    }
}
