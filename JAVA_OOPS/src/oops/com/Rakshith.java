package oops.com;

interface Karthik{
	
	void whatYouWantGift();
}

interface Ganpati extends Karthik{
	void meAndGanpatiDecideToGiveSpecialGiftToYou();
}
public class Rakshith implements Karthik,Ganpati {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Karthik k=new Rakshith();
		Ganpati g=new Rakshith();
		k.whatYouWantGift();
		g.meAndGanpatiDecideToGiveSpecialGiftToYou();
		
	}

	@Override
	public void whatYouWantGift() {
		// TODO Auto-generated method stub
		System.out.println("what you want rakshith bro");
	}

	@Override
	public void meAndGanpatiDecideToGiveSpecialGiftToYou() {
		// TODO Auto-generated method stub
		System.out.println("KARTHIK AND GANAPTI GIVING SPECIAL GIFT TO COGNIZANT RACK STAR RAKSHITH BRO");
		
	}

}
