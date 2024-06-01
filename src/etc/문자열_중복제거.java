package etc;

import java.util.*;

/*
* 문자열 중복 제거
* 방법 1. Set 사용 방법 2. Stream의 distinct 사용
*/
public class 문자열_중복제거 {
    public static void main(String[] args) {
        String[] arr = {"H", "E", "L", "L", "O"};

        // Arrays.asList == new ArrayList<String>();
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(arr));
        System.out.println(hashSet.size());
        System.out.println(hashSet.toString());
        // 중복은 제거하지만, 배열의 순서는 보장 X

        // 배열의 순서 보장 가능
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(linkedHashSet.size());
        System.out.println(linkedHashSet.toString());

        // Stream의 distinct 사용
        String[] list = Arrays.stream(arr).distinct().toArray(String[]::new);
        System.out.println(list.length);
        System.out.println(Arrays.toString(list));
    }
}