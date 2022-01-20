package edu.neu.csye6200;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class WeightLossClubFinal {
	
	private Consumer<Integer> graphIntegers = (n) -> {
		System.out.print(n+" ");
		while (n-- > 0) System.out.print("*");
		System.out.println();
	}; 
	
	public void graphUpDownIntegers(List<Integer> nList) {
		System.out.println();
		nList.forEach(n-> graphIntegers.accept(n));
	}
	
	public static void demo() {
		
		WeightLossClubFinal wlcf = new WeightLossClubFinal();
		WeightLossClub wlc = new WeightLossClub();
		
		WeightLossClub.persons.add(new Person("1,25,Jim,311,11")); 
		WeightLossClub.persons.add(new Person("2,21,Sam,315,15")); 
		WeightLossClub.persons.add(new Person("3,17,Dan,314,14")); 
		WeightLossClub.persons.add(new Person("4,19,Bob,312,12")); 
		WeightLossClub.persons.add(new Person("5,16,Ann,310,10")); 
		WeightLossClub.persons.add(new Person("6,23,Eve,313,13")); 
		System.out.println("\n\n============================================ Weightloss Graph Output ===========================================");
		System.out.println("\n\nSorting by Person ID (Natural Order) : ");
		wlc.sortAndShow(Comparator.comparingInt(AbstractPerson::getId), System.out::println);
		
		System.out.println("\nSorting by Person Age : ");
		wlc.sortAndShow(Comparator.comparingInt(AbstractPerson::getAge), System.out::println);
		
		System.out.println("\nSorting by Person Name : ");
		wlc.sortAndShow(Comparator.comparing(AbstractPerson::getName), System.out::println);
		
		System.out.println("\nSorting by Person Weight : ");
		wlc.sortAndShow(Comparator.comparingInt(AbstractPerson::getWeightLbs), System.out::println);
		
		System.out.println("\nSorting by Person Weightloss : ");
		wlc.sortAndShow(Comparator.comparingInt(AbstractPerson::getWeightLossLbs), System.out::println);
		
		System.out.println("\nPlotting graph of weight loss : ");
		wlcf.graphUpDownIntegers(wlc.getWeightLossStats());
		
		System.out.println("\nPlotting Graph of weight losses sorted in Ascending order");
		wlcf.graphUpDownIntegers(wlc.getWeightLossStats().stream().sorted().toList());
		
		System.out.println("\nPlotting Graph of weight losses sorted in Descending order");
		wlcf.graphUpDownIntegers(wlc.getWeightLossStats().stream().sorted(Comparator.reverseOrder()).toList());
		
		System.out.println("\nPlotting Graph of weight losses after 1 month");
		wlcf.graphUpDownIntegers(wlc.getWeightLossStats().stream().map(n->n+10).toList());
		
		System.out.println("\nPlotting Graph of weight losses after 1 month sorted in Ascending order");
		wlcf.graphUpDownIntegers(wlc.getWeightLossStats().stream().sorted().map(n->n+10).toList());
			
		System.out.println("\nPlotting Graph of weight losses after 1 month sorted in Descending order");
		wlcf.graphUpDownIntegers(wlc.getWeightLossStats().stream().sorted(Comparator.reverseOrder()).map(n->n+10).toList());
	
		System.out.println("\nPlotting Graph of weight losses after 12 month");
		wlcf.graphUpDownIntegers(wlc.getWeightLossStats().stream().map(n->(n+10)*10).toList());
		
		System.out.println("\nPlotting Graph of weight losses after 12 months sorted in Ascending order");
		wlcf.graphUpDownIntegers(wlc.getWeightLossStats().stream().sorted().map(n->(n+10)*10).toList());
		
		System.out.println("\nPlotting Graph of weight losses after 12 months sorted in Descending order");
		wlcf.graphUpDownIntegers(wlc.getWeightLossStats().stream().sorted(Comparator.reverseOrder()).map(n->(n+10)*10).toList());
	}
}
