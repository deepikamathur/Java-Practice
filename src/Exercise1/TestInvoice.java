package Exercise1;

public class TestInvoice {

	public static void main(String[] args) {

		InvoiceItem i1 = new InvoiceItem("A1", "Coffee", 10, 100);
		System.out.println(i1.toString());

		System.out.println(i1.getTotal());
	}

}
