// YOUR NAME: 
// COLLABORATORS:  
// DATE: 

public class Main
{
	public static void main(String[] args)
	{
		// DECLARATION SECTION
		double avgDacaTaxContribution;
		int avgDacaTaxContributionRounded;
		String stateMostDaca;
		// INITIALIZATION SECTION
		char stateMostDaca1 = 'a';
		char stateMostDaca2 = 'c';
		int numDacaRecipients = 700000;
		long dacaFederalTaxRevenue = 60000000000L;
		// INPUT SECTION
		// N/A (no input for this lab)

		// CALCULATION & PROCESSING SECTION
		avgDacaTaxContribution = (double) dacaFederalTaxRevenue / numDacaRecipients;
		avgDacaTaxContributionRounded = (int) avgDacaTaxContribution;
		stateMostDaca1 = (char) (stateMostDaca1 - 32);
		stateMostDaca2 = (char) (stateMostDaca2 - 32);
		stateMostDaca = "" + stateMostDaca2 + stateMostDaca1;
		// OUTPUT SECTION
		System.out.println("Average DACA-recipient Tax Contribution: $" + avgDacaTaxContribution);
		System.out.println("Rounded down to nearest whole dollar: $" + avgDacaTaxContributionRounded);
		System.out.println("State with most DACA recipients:" + stateMostDaca);
	}
}