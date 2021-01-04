package DFSAndBFS;

public class DFS {

    static boolean[] visited = new boolean[6]; // 방문여부 저장 배열

    // 그래프 matrix로 표현
    static int[][] matrix = {{0,1,1,0,0,0},
                             {1,0,0,1,1,0},
                             {1,0,0,0,1,1},
                             {0,1,0,0,1,0},
                             {0,1,1,1,0,1},
                             {0,0,1,0,1,0}};

    public static void main(String[] args){ // main
        System.out.println("[0->5]에 대한 거리: "+dfs(0,5));
    }

    // DFS 탐색을 진행하는 함수
    static int dfs(int current_node, int target_node){
        if(current_node == target_node) // 현재 노드가 타겟 노드와 같으면
            return 1;

        for(int i = 0; i<6; i++){ // 반복문을 통해 방문되지 않은 인접노드 찾아서 방문(dfs)
            if(matrix[current_node][i] == 1 && !visited[i]){
                visited[i] = true;
                return dfs(i, target_node) + 1;
            }
        }
        return 0;
    }

}
