import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class CostEstimatorTest {
	@Test
	void testCostEstimator() {
		CostEstimator ce;
		ce = new CostEstimator(2, 1000, false);
		assertEquals(1800000.0, ce.findCost());
		ce = new CostEstimator(0, 500, true);
		assertEquals(600000.0, ce.findCost());
		ce = new CostEstimator(1, 750.26, true);
		assertEquals(1125390.0, ce.findCost());
		ce = new CostEstimator(2, 150, false);
		assertEquals(270000.0, ce.findCost());
	}
}