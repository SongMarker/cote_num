import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 백준 문제 풀이를 위한 입출력 최적화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 절댓값 힙 정렬 로직 정의
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            // 1. 절댓값이 같다면 실제 값 비교
            if (abs1 == abs2) {
                return Integer.compare(o1, o2);
            }
            // 2. 절댓값이 다르면 절댓값 기준으로 오름차순
            return Integer.compare(abs1, abs2);
        });

        while (N-- > 0) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (pq.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            } else {
                pq.add(x);
            }
        }
        // 한 번에 출력하여 출력 성능 극대화
        System.out.print(sb);
    }
}