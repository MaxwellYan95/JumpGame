package test;

import functions.GasStation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GasStationTest {
    @Test
    public void test1() {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int result = GasStation.canCompleteCircuit(gas, cost);
        assertEquals(result, 3);
    }

    @Test
    public void test2() {
        int[] gas = {2,3,4};
        int[] cost = {3,4,3};
        int result = GasStation.canCompleteCircuit(gas, cost);
        assertEquals(result, -1);
    }
}
