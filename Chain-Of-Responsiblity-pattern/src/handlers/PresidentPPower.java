package handlers;

/**
 * Created by sss on 25/12/2017.
 */
public class PresidentPPower extends PurchasePower {

    protected double getAllowable() {
        return BASE * 60;
    }

    protected String getRole() {
        return "President";
    }
}