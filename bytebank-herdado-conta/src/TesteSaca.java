
public class TesteSaca {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente(123, 321);
		conta.deposita(200.0);
		try {
			conta.saca(210.0);
		} catch (SacaException ex) {
			System.out.println("Exception: " + ex.getMessage());

		}

		System.out.println(conta.getSaldo());

	}

}
