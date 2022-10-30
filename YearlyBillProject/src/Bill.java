public class Bill {
	private String dueDate;
	private double price;
	private int invoiceNumber;
	private String paymentMethod;
	private String name;

	public Bill() {
		dueDate = "";
		price = 0.0;
		invoiceNumber = 0;
		paymentMethod = "";
		name = "";
	}

	// setters
	public void setDueDate(String newDueDate) {
		dueDate = newDueDate;
	}

	public void setPrice(double newPrice) {
		if (newPrice >= 0) {
			price = newPrice;
		}
	}

	public void setInvoiceNumber(int newInvoiceNumber) {
		if (newInvoiceNumber >= 0) {
			invoiceNumber = newInvoiceNumber;
		}
	}

	public void setPaymentMethod(String newPaymentMethod) {
		paymentMethod = newPaymentMethod;
	}

	public void setName(String newName) {
		name = newName;
	}

	// getters
	public String getDueDate() {
		return dueDate;
	}

	public double getPrice() {
		return price;
	}

	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public String getName() {
		return name;
	}

}
