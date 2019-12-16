import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Thanos extends Hero implements Comparator<Thanos>{

    public Thanos(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));

        // TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)


        System.out.println("\nOrder by name:");
        Collections.sort(heroes);
        showList(heroes);
        
        

        // TODO 2: Add a Comparator and sort by age (descending)

        System.out.println("$");
        System.out.println("Order by age:");
        Collections.sort(heroes, (h1, h2) -> h2.getAge() - (h1.getAge()));
        showList(heroes);
        }
    



    private static void showList(List<Hero> heroes) {
        for (Hero heroe : heroes) {
            System.out.println(heroe.getName() + ", " + heroe.getAge());
        }
    }

	@Override
	public int compare(Thanos arg0, Thanos arg1) {
		// TODO Auto-generated method stub
		return 0;
	}


   



}