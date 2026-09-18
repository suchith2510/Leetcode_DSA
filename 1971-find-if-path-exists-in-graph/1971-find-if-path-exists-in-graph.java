class Solution {
    int leader[];
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        leader =new int[n];
        for(int i=0;i<n;i++){
            leader[i]=i;
        }
            for(int[] edge:edges){
                int u=edge[0],v=edge[1];
                merge(u,v);
            }
        int slu=find(source);
        int slv=find(destination);
        return slu==slv;
       
    }
    public void merge(int u, int v){
        int slu=find(u);
        int slv=find(v);
        leader[slv]=slu;
    }
    public int find(int x){
        if(leader[x]==x) return x;
        return leader[x]=find(leader[x]);
        // return leader[x];
    }
}