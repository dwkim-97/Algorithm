package DFSAndBFS;

import java.util.LinkedList;

public class BFS {
    static boolean[] visited = new boolean[6]; // 방문여부 저장 배열
    static LinkedList<Integer> queue = new LinkedList<>(); // 노드번호를 저장할 큐

    // 그래프 matrix로 표현
    static int[][] matrix = {{0,1,1,0,0,0},
                             {1,0,0,1,1,0},
                             {1,0,0,0,1,1},
                             {0,1,0,0,1,0},
                             {0,1,1,1,0,1},
                             {0,0,1,0,1,0}};


    public static void main(String[] args){
        queue.offer(0); // 초기에 큐에 0 삽입
        visited[0] = true; // 0의 방문여부 true

        System.out.print("BFS 탐색 순서: ");

        while(!queue.isEmpty()){ // 큐가 빌 때까지
            int popped = queue.pop(); // 큐의 첫 번째 노드 pop

            System.out.print(popped+" -> ");

            for(int i = 0 ; i < matrix.length; i++){ // popped의 인접노드에 대하여
                if(matrix[popped][i] == 1 && !visited[i]){ // 방문되어있지 않다면
                    visited[i] = true; // 방문체크
                    queue.offer(i); // 큐에 삽입
                }
            }
        }


    }
}
