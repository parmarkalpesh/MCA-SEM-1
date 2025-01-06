import java.util.*;

public class ex70
{
	public static void main(String[] args) 
	{
		System.out.println("Tree Set Example!");
		TreeSet tree = new TreeSet();

	  	tree.add(62);
		tree.add(23);
		tree.add(30);
		tree.add(18);
		tree.add(45);

		Iterator iterator;
		iterator = tree.iterator();

		System.out.print("Tree set data: ");

		//Displaying the Tree set data
		while (iterator.hasNext())
		{
			System.out.print(iterator.next() + " ");
		}

		System.out.println();
		
		//Check impty or not
		if (tree.isEmpty())
		{
			System.out.print("Tree Set is empty.");
		}
		else
		{
			System.out.println("Tree Set size: " + tree.size());
  		}

		//Retrieve first data from tree set
		System.out.println("First data: " + tree.first());

		//Retrieve last data from tree set
		System.out.println("Last data: " + tree.last());

		if (tree.remove(30))
		{
			System.out.println("Data is removed from tree set");
		}
		else
		{
			System.out.println("Data doesn't exist!");
		}

		System.out.print("Now the tree set contain: ");
		
		iterator = tree.iterator();
		//Displaying the Tree set data
		while (iterator.hasNext())
		{
	  		System.out.print(iterator.next() + " ");
  		}
		
		System.out.println();
		System.out.println("Now the size of tree set: " + tree.size());
		
		//Remove all
		tree.clear();
		if(tree.isEmpty())
		{
			System.out.print("Tree Set is empty.");
		}
		else
		{
			System.out.println("Tree Set size: " + tree.size());
		}
	}
}