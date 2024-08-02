public class SubSets
{
  public static List<List<Integer>> subset(int arr[])
	{
		List<List<Integer>> outer=new ArrayList<>();
		outer.add(new ArrayList<>());
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			int n=outer.size();
			for(int j=0;j<n;j++)
			{
				List<Integer> internal=new ArrayList<>(outer.get(j));
				internal.add(num);
				outer.add(internal);
			}
		 
		}
		return outer;
	}
}
