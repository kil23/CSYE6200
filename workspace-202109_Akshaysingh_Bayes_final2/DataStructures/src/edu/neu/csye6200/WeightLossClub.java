package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class WeightLossClub extends AbstractClub {
	
	public static List<AbstractPerson> persons = new ArrayList<AbstractPerson>();

	@Override
	public void add(AbstractPerson p) {
		persons.add(p);
	}

	@Override
	public List<Integer> getWeightLossStats() {
		return persons.stream().map(n -> n.getWeightLossLbs()).collect(Collectors.toList());
	}

	@Override
	public void sortAndShow(Comparator<AbstractPerson> compare, Consumer<AbstractPerson> action) {
		persons.stream().sorted(compare).forEach(action);
	}

}
