class MinimumInitialEnergy {
public int minimumEffort(int[][] tasks) {
Arrays.sort(tasks, (a, b)->{
if(a[1]-a[0] == b[1]-b[0]) return a[0] -b[0];
else return ((b[1]-b[0]) - (a[1]-a[0]));
});
int minToComplete =0;
int minToStart =0;
for(int[] t: tasks)
{
minToComplete += t[0];
minToStart = Math.max(t[1], minToComplete);
}
minToComplete = Math.max(minToComplete, minToStart);
int ans = minToComplete;

    for(int[] t: tasks){
        if(minToComplete> t[1]) minToComplete -= t[0];
        else{
            int required = t[1] - minToComplete;
            ans+= required;
            minToComplete += required;
            minToComplete -= t[0];
        }
    }
    return ans;
}
}
