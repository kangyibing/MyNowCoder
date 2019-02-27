/**
 * 遍历法
 * 假设字符串的长度是 n 。对每个空格字符，需要移动后面 O(n) 个字符，因此对含有 O(n) 个空格字符的字符串而言总的时间复杂度是 O(n^2) 
 */
public class ReplaceSpace1 {
    public String replaceSpace(StringBuffer str) {
         if (str == null)
        return null;
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < str.length(); i++) {
        if (String.valueOf(str.charAt(i)).equals(" ")) {
            sb.append("%20");
        }else {
            sb.append(str.charAt(i));
        }
    }
    return String.valueOf(sb);
    }
    public static void main(String[] args) {
        String str = new ReplaceSpace1().replaceSpace(new StringBuffer("we are family"));
        System.out.println(str);
    }
}