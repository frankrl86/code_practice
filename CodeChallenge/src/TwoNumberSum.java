import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoNumberSum {
	
	public static List<Integer> getArrayTwoNumberSum(List<Integer> numbers, Integer targetSum) {
		List<Integer> arrayTwoNumber = new ArrayList<Integer>();
		if(numbers.size()>0) {
			Integer sum = 0;
			for(int i = 0; i < numbers.size(); i++) {
				for(int j = i+1; j < numbers.size(); j++) {
					sum = numbers.get(i) + numbers.get(j);
					if(targetSum==sum) {
						arrayTwoNumber.add(numbers.get(i));
						arrayTwoNumber.add(numbers.get(j));
						return arrayTwoNumber;
					}
					
				}
			}
		}
		return arrayTwoNumber;	
	}


	public static void main(String[] args) {
        Integer [ ] arrayIntegers = {2,-7,4,8,-11};
        Integer targetSum = -18;
		System.out.print(TwoNumberSum.getArrayTwoNumberSum(Arrays.asList(arrayIntegers), targetSum));
	}

}
