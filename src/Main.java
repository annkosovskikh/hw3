public class Main {
    public static void main(String[] args) {
        //number of people
        int numadults = 9;
        int numpensioners = 5;
        int numkids = 11;

        //tickets Discount
        byte pensionerdiscount = 30;
        byte kiddiscount = 50;

        //tickets
        var adulttick = 70;
        var pensionertick = (adulttick * (100 - pensionerdiscount) / 100);
        var kidtick = (adulttick * (100 - kiddiscount) / 100);

        //final cost
        int finalcost = (adulttick * numadults + pensionertick * numpensioners + kidtick * numkids);

        System.out.println("The total cost of the tickets is " + finalcost);
    }
}