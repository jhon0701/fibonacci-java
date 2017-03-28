public class fibonacci {
	
	public static void main (String args[]) {
		fibonacci fib= new fibonacci();
		fib.tiempoIterativo(45);
        fib.tiempoIterativo_otro(45);
		fib.tiempoRecursivo(45);
                //System.out.println(fib.calcfibonacciIterativo(45));
                //System.out.println(fib.calcfibonacciIterativOtro(5));
                //System.out.println(fib.calcfibonacciRecursivo(45));
                // System.out.println(fib.calcfibonacciIterativo_otro(45));
	}
	fibonacci(){
		}
	int calcfibonacciRecursivo(int n){
		if (n == 1 || n == 2 ) return 1;
		else return calcfibonacciRecursivo(n-1) + calcfibonacciRecursivo(n-2);
		}
	int calcfibonacciIterativo(int num){
		int numero, anterior1, anterior2,n;
		anterior1 = anterior2 = 1;
                n=num-1;
		numero = n;
		if ((n==1) || (n==2)) numero = 1;
		else {
			for (int i=2;i<=n;i++){
				numero = anterior1 + anterior2;
				anterior2 = anterior1;
				anterior1 = numero;
			    }
			}
		return numero;
		}
	int calcfibonacciIterativOtro(int n){
		int numero, anterior1, anterior2;
		anterior1 = 1;anterior2 = 1; numero = 0;
		while (numero <= n){
				int aux = anterior1;
				anterior1 = anterior2;
				anterior2=numero;
				numero=anterior1+anterior2;
			}
		return numero;
		}
        int calcfibonacciIterativo_otro (int n){
		int numero,incremento,sumatoria; 
                numero=0;incremento=1;
		int aux = 0;
		while (aux < n){
			sumatoria=numero+incremento;
			numero=incremento;
			incremento=sumatoria;
			aux++;
			}
                return numero;
		}
        
	void tiempoRecursivo(int n){
		long start, end;
		start = System.nanoTime();
		calcfibonacciRecursivo(n);
		end = System.nanoTime();
		System.out.println("tiempo : "+(end-start));
		}
	void tiempoIterativo(int n){
		long start, end;
		start = System.nanoTime();
		calcfibonacciIterativo(n);
		end = System.nanoTime();
		System.out.println("tiempo : "+(end-start));
		}
        void tiempoIterativo_otro(int n){
                long start, end;
		start = System.nanoTime();
		calcfibonacciIterativo_otro(n);
		end = System.nanoTime();
		System.out.println("tiempo : "+(end-start));
                }
}
