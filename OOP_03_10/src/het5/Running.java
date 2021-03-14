package het5;

public class Running {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle aRectangle = new rectangle(4,6);
		rectangle bRectangle = new rectangle(2,7);
		rectangle cRectangle ;
		
		cRectangle = aRectangle;
		
		System.out.println(aRectangle);
		System.out.println(bRectangle);
		System.out.println(cRectangle);
		
		aRectangle.setSide(8,2);
		
		System.out.println(aRectangle);
		System.out.println(bRectangle);
		System.out.println(cRectangle);
		
		System.out.print("\n");
		
		aRectangle.setSide(2, 7);
		
		System.out.println(aRectangle);
		System.out.println(bRectangle);
		System.out.println(cRectangle);
		
		System.out.print("\n");
		System.out.println(aRectangle == bRectangle);
		System.out.println(aRectangle == cRectangle);
		
		System.out.print("\n");
		System.out.println(aRectangle.getAreTheseSidesSame(bRectangle));
		
		rectangle dRectangle = cRectangle;
		System.out.println(dRectangle);
		
	}

}
