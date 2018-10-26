
package Adapter_Pattern;

public class RunAdapterExample {

    public static void main(String[] args) {
        //create XPay Object
        Xpay xpay = new Xpayimpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Enunwah Stephen Temofe");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short)235);
        xpay.setAmount(2565.23);
        
        PayD payd = new XpayToPayDAdapter(xpay);
        testPayD(payd);
    }
    
    private static void testPayD(PayD payd){
        
        System.out.println(payd.getCardOwnerName());
        System.out.println(payd.getCustCardNo());
        System.out.println(payd.getCardExpMonthDate());
        System.out.println(payd.getCVVNo());
        System.out.println(payd.getTotalAmount());   
        
    }
    
}
