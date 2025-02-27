package model;

public class Order {
	
	    private int orderId;
	    private double amount;
	    private double VAT;
	    private int customerId;

	    public int getOrderId() {
	        return orderId;
	    }

	    public void setOrderId(int orderId) {
	        this.orderId = orderId;
	    }

	    public double getAmount() {
	        return amount;
	    }

	    public void setAmount(double amount) {
	        this.amount = amount;
	    }

	    public double getVAT() {
	        return VAT;
	    }

	    public void setVAT(double VAT) {
	        this.VAT = VAT;
	    }

	    public int getCustomerId() {
	        return customerId;
	    }

	    public void setCustomerId(int customerId) {
	        this.customerId = customerId;
	    }

	    @Override
	    public String toString() {
	        return "Order{" +
	                "orderId=" + orderId +
	                ", amount=" + amount +
	                ", VAT=" + VAT +
	                ", customerId=" + customerId +
	                '}';
	    }
}
