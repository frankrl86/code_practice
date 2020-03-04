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
        //Test 1
		Integer [ ] arrayIntegers = {3,5,-4,8,11,1,-1,6};
        Integer targetSum = 10;
		System.out.println(TwoNumberSum.getArrayTwoNumberSum(Arrays.asList(arrayIntegers), targetSum));
		
		//Test 2
		Integer [ ] arrayIntegers2 = {2,-7,4,8,-11};
        targetSum = 56;
        System.out.println(TwoNumberSum.getArrayTwoNumberSum(Arrays.asList(arrayIntegers2), targetSum));
		
	}

}
