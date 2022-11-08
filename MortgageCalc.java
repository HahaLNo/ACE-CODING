public class MortgageCalc {
    /**
    * This method calculates the monthly payments for a mortgage payment
    * @param principal    Initial amount of the loan
    * @param numPayments  number of months in the loan
    * @return             the monthly payment for the loan
    */

    public static double payment(double principal, int numPayments)
    {
       return principal*currentRate()*(Math.pow(1+currentRate(), numPayments))/(Math.pow(1+currentRate(), numPayments)-1);
        /* To Be implemented in part A */
    }

    /**
    * This method returns the remaining balance for a given month
    * in the loan.
    * @param originalBal   original balance of the loan
    * @param numPayments   original number of months in the loan
    * @param currPeriod    the month to calculate the remaining balance
    * @return              the remaining balance on the loan
    */

    public static double remainingPrincipal(double originalBal, int numPayments, int currPeriod)
    {
        return originalBal - principalPayment(originalBal, numPayments, currPeriod);
        /* To be implemented in part B */
    }

    /**
    * This method returns the current annual interest rate
    * @return  decimal value of the annual interest rate
    *          example: 4% interest is returned as 0.04
    */

    public static double currentRate()
    {
        /* Implementation not shown */
    }

    /**
    * This method returns the amount of principal paid for a given month
    * in the loan.
    * @param originalBal   original balance of the loan
    * @param numPayments   original number of months in the loan
    * @param currPeriod    the month to calculate the principal payment
    * @return         	   the amount of the payment that is applied to the
    *                 	   principal balance for the currPeriod
    */

    public static double principalPayment(double originalBal, int numPayments, int currPeriod)
    {
        /* Implementation not shown */
    }
}
