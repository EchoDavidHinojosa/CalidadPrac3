package pkg;

public class  Cuenta {
	private static int saldo; 
    
    public Cuenta(int i) {
		 saldo =i;
	}

	public static int suma(int a, int b) {
        return a + b;
    }
	public int getsaldo() {
		return saldo;
	}
    public  void ingresar(int dinero) {
    	saldo +=dinero;
    }
    public void retirar(int dinero) {
    	
    	saldo -=dinero;
    }

}
