/**
 * ������
 * �����ַ����ĳ����� n ����ÿ���ո��ַ�����Ҫ�ƶ����� O(n) ���ַ�����˶Ժ��� O(n) ���ո��ַ����ַ��������ܵ�ʱ�临�Ӷ��� O(n^2) 
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