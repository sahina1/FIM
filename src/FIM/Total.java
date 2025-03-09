package FIM;

import java.util.ArrayList;

public class Total {
	public static int total(ArrayList<Integer> ic)
	{
		int tot=0;
		for(int element : ic) {
			tot+=element;
		}
		return tot;
	}
}
