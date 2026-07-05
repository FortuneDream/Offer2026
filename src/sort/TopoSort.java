package sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopoSort {
    public boolean canFinish(int numCourses, int[][] prerequisites){
        List<List<Integer>> edges =new ArrayList<>();
        int[] indeg= new int[numCourses];
        for (int i = 0;i<numCourses;i++){
            edges.add(new ArrayList<>());
        }

        for (int[] node :prerequisites){
            edges.get(node[1]).add(node[0]); //出度点
            indeg[node[0]]++;//入度数
        }

        Queue<Integer> queue =new LinkedList<>();
        for (int i = 0 ; i<numCourses;i++){
            if (indeg[i]==0){
                queue.add(i);
            }
        }
        int visited =0 ;
        while (!queue.isEmpty()){
            visited++;
            int node = queue.poll();
            for (int v: edges.get(node)){
                indeg[v]--;
                if (indeg[v]==0){
                    queue.add(v);
                }
            }
        }
        return numCourses == visited;
    }
}
