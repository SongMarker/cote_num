import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 절댓값 기준으로 정렬하는 Comparator 추가
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            if (first_abs == second_abs) {
                return o1 > o2 ? 1 : -1; // 절댓값이 같으면 실제 값이 작은 순
            }
            return first_abs - second_abs; // 절댓값이 작은 순
        });

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                if (pq.isEmpty()) System.out.println(0);
                else System.out.println(pq.poll());
            } else {
                pq.add(x);
            }
        }
    }
}