public static void mobPad(String bef,String aft)
	{
		if (aft.isEmpty()) {
			System.out.println(bef);
			return;
		}
		
		int digit=aft.charAt(0)-'0';
		int range=(digit-1)*3;
		for(int i=range;i<=range+2;i++)
		{
			char ch=(char)('a'+i);
			mobPad(bef +ch,aft.substring(1));
		}
	}

	public static ArrayList<String> mobPad1(String bef, String aft) {
        ArrayList<String> ans = new ArrayList<>();
        
        if (aft.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(bef);
            return list;
        }
        
        int digit = aft.charAt(0) - '0';
        int range = (digit - 1) * 3;
        for (int i = range; i < range + 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(mobPad1(bef + ch, aft.substring(1)));
        }

        return ans;
    }
