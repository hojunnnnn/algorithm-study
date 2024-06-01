package etc;

/*
* 문자열 거꾸로 뒤집기
* 방법 1. reverse() 사용
* 방법 2. 문자열 추출 후 반복문으로 뒤집기 */
public class 문자열_뒤집기 {
    public static void main(String[] args) {
        // StringBuilder의 reverse();
        String str = "abced";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);

        // StringBuffer의 reverse();
        StringBuffer sf = new StringBuffer(str);
        sf.reverse();
        System.out.println(sf);

        //char로 변환 > for문 > String 변환
        char[] arr = str.toCharArray();
        char[] reverseArr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseArr[arr.length -1 -i] = arr[i];
        }
        String reverseStr = new String(reverseArr);
        System.out.println(reverseStr);
    }
}