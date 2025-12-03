import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class symmetricalPolygons {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            solveTestCase(sc, out);
        }
        out.flush();
    }
    public static void solveTestCase(FastReader sc, PrintWriter out) {
        int n = sc.nextInt();
        // Use TreeMap to keep stick lengths sorted and easily find min/max.
        TreeMap<Integer, Integer> counts = new TreeMap<>();
        long totalPerimeter = 0;
        
        for (int i = 0; i < n; i++) {
            int stickLength = sc.nextInt();
            totalPerimeter += stickLength;
            counts.put(stickLength, counts.getOrDefault(stickLength, 0) + 1);
        }

        // Use TreeSet to keep track of lengths with odd counts, sorted.
        TreeSet<Integer> odds = new TreeSet<>();
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odds.add(entry.getKey());
            }
        }
        
        int totalSticks = n;

        while (totalSticks >= 3) {
            if (odds.size() > 2) {
                // Symmetry condition violated: more than 2 types of sticks with odd counts.
                // To maximize perimeter, remove the smallest stick that has an odd count.
                int toRemove = odds.first();
                totalPerimeter -= toRemove;
                totalSticks--;
                updateState(toRemove, counts, odds);
            } else {
                // Symmetry condition is met. Check for the non-degenerate condition.
                if (counts.isEmpty()) {
                    break; // No sticks left
                }
                int lmax = counts.lastKey();
                if (totalPerimeter > 2L * lmax) {
                    // This is a valid, non-degenerate, symmetrical polygon.
                    // The greedy strategy ensures this is the first valid polygon found, 
                    // and it will have the maximum possible perimeter.
                    out.println(totalPerimeter);
                    return;
                } else {
                    // Degenerate polygon: the longest side is too long.
                    // We must remove a stick of the maximum length to have a chance to fix this.
                    totalPerimeter -= lmax;
                    totalSticks--;
                    updateState(lmax, counts, odds);
                }
            }
        }
        
        // If the loop finishes without returning, no valid polygon can be formed.
        out.println(0);
    }
    
    /**
     * Helper function to update the state after removing one stick of length l.
     * It updates the counts map and the set of odd-count lengths.
     */
    private static void updateState(int l, TreeMap<Integer, Integer> counts, TreeSet<Integer> odds) {
        int oldCount = counts.get(l);
        
        // The parity of the count for stick 'l' flips. Update the 'odds' set.
        if (oldCount % 2 != 0) {
            odds.remove(l);
        } else {
            odds.add(l);
        }

        // Update the counts map.
        if (oldCount == 1) {
            counts.remove(l);
        } else {
            counts.put(l, oldCount - 1);
        }
    }

    /**
     * Fast I/O reader for competitive programming.
     */
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
     
    