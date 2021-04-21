import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem6 {
    public static List < Set <Integer> > dfsResult;

    public static List< Set <Integer> > powerSet(List<Integer> list) {
        // bitmask approach O(2^N)
        List < Set <Integer> > result = new ArrayList<>();

        int n = list.size();

        for(int mask = 0; mask < (1 << n); mask++) {
            Set <Integer> curSet = new HashSet<>();
            for(int i = 0; i < n; i++) {
                if( ((1 << i) & mask) > 0) {
                    curSet.add( list.get(i));
                }
            }
            result.add(curSet);
        }

        return result;
    }

    public static void DFS(List <Integer> list, int index, HashSet <Integer> prevSet) {
        HashSet<Integer> curSet = new HashSet<>(prevSet);
        curSet.add(list.get(index));
        dfsResult.add(curSet );
        for(int i = index + 1; i < list.size(); i++) {
            DFS(list, i, curSet);
        }
    }

    public static List< Set <Integer> > powerSetDFS(List<Integer> list) {
        // DFS approach O(2^N)
        dfsResult = new ArrayList<>();
        dfsResult.add(new HashSet<Integer>() );
        for(int i = 0; i < list.size(); i ++) {
            DFS(list, i, new HashSet<>());
        }

        return dfsResult;
    }
}
