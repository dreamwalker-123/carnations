package carnation;

public class SomeClass {

    public static void main(int start, int end) {
        start = 2; end = 100; String result2 = "";
        for (var i = start; i < end; i++) {
            for (var deliver = i/2 ; deliver != start && deliver > start; deliver --) {
                if ((i % (deliver)) != 0) {
                    result2 = result2 + i;
                }
            }
        }
        System.out.println(result2);
    }
}
