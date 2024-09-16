package functions;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int len = cost.length;
        for (int i = 0; i < len; i++) {
            int sum = 0;
            int index = i;
            do {
                sum -= cost[index];
                sum += gas[index];
                if (index == len-1)
                    index = 0;
                else
                    index++;
                if (sum < cost[index]) // Index was already incremented
                    break;
            }
            while (index != i);
            if (sum >= 0) {
                return i;
            }
        }
        return -1;
    }
}
