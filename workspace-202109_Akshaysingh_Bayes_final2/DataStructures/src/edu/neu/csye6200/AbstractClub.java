package edu.neu.csye6200;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public abstract class AbstractClub {
	
	public abstract void add(AbstractPerson p);
	
	public abstract void sortAndShow(Comparator<AbstractPerson> compare, Consumer<AbstractPerson> action);
	
	public abstract List<Integer> getWeightLossStats();

}
