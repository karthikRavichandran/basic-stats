import java.util.Collections;
import java.util.List;


public class MinMaxCalculation  {

	private double min = 0;
	private double max = 0;

	public MinMaxCalculation(List<Double> numbers) {
		min = Collections.max(numbers);
		max = Collections.max(numbers);
	}

	public double getMin() {
		return min;
	}

	public double getMax() {
		return max;
	}
}
