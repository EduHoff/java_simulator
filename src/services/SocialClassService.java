package services;

public class SocialClassService {
	
	
	public String socialClass(Double money) {
		
		if(money <= 660) {
			return "extreme poverty";
		}else if(money > 660 && money <= 2640) {
			return "poor";
		}else if(money > 2640 && money <= 6600) {
			return "lower middle class";
		}else if(money > 6600 && money <= 20000) {
			return "upper middle class";
		}else if(money > 20000 && money <= 250000) {
			return "rich";
		}else if(money > 250000 && money <= 1000000) {
			return "super rich";
		}else if(money > 1000000 && money <= 50000000) {
			return "millionaire";
		}else if(money > 50000000 && money <= 1000000000) {
			return "multimillionaire";
		}else if(money > 1000000000) {
			return "billionaire";
		}else {
			return null;
		}
	}
	
	

}
