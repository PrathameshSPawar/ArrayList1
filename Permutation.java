public static void permutation(String bef,String aft)
	{
		if(aft.isEmpty())
		{
			System.out.println(bef);
			return;
		}
		char ch=aft.charAt(0);
		for(int i=0;i<=bef.length();i++)
		{
			String a=bef.substring(0,i);
			String p=bef.substring(i,bef.length());
			permutation(a+ch+p, aft.substring(1));
		}
	}
