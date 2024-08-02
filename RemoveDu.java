public static List<List<Integer>> remDupSub(int arr[])
	{
		List<List<Integer>> outer=new ArrayList<>();
		outer.add(new ArrayList<>());
		int start=0;
		int end=0;
		for(int i=0;i<arr.length;i++)
		{
			start=0;
			if(i>0&&arr[i]==arr[i-1])
			{
				start=end+1;
			}
			end=outer.size();
			int num=arr[i];
			int n=outer.size();
			for(int j=start;j<n;j++)
			{
				List<Integer> internal=new ArrayList<>(outer.get(j));
				internal.add(arr[j]);
				outer.add(internal);
			}
		}
		return outer;
	}
