package questoes;

import java.util.Scanner;


public class Questoes {

    static Scanner sc=new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        //q1();
        //q2();
        //q3();
        //q4();
    	//q5();
    	//q6();
    	//q7();
    	//q8();
    	//q9();
    	//q10();
    	//q11();
    	//q12();
    	//q13();
    	//q14();
    	//q15();
    	//q16();
    	//q17();
    	q18();
    	
    }
    static void q1(){
    int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        System.out.println("resultado √©: "+ (n1+n2) );
        System.out.println("resultado √©: "+ (n1-n2) );
        System.out.println("resultado √©: "+ (n1*n2) );
        System.out.println("resultado √©: "+ (n1/n2) );
        
        
        
}
    
//Escreva um algoritmo para determinar o consumo m√©dio de um autom√≥vel	
//sendo	 fornecida a dist√¢ncia total percorrida pelo autom√≥vel e o total de	
//combust√≠vel	gasto.
     public static void q2 (){
         
         System.out.println("informe o quantidade em combustivel");
         double gas = sc.nextDouble();
         System.out.println("informe o valor em kilometros");
         double km = sc.nextDouble();
         
         
         
         
         
         System.out.println("o consumo medio de gasolina √©: " +(km/gas));
      
         
     }
    // Escreva um algoritmo que	leia o nome de um vendedor, o seu sal√°rio fixo e	
    // o total de vendas efetuadas por ele no m√™s(em dinheiro).	Sabendo	que este	
    // vendedor	ganha 15% de comiss√£o sobre suas vendas	efetuadas, informar o	
    // seu nome,o sal√°rio fixoe sal√°riono final do m√™s
     static void q3(){
         
         System.out.println("Nome do vendedor: ");
         String nome = sc.next();
         System.out.println("Informe o salario fixo");
         double salariof = sc.nextDouble();
         System.out.println("Informe o Total de Vendas");
         double com = sc.nextDouble();
         
         System.out.println("O salario final e: " + (salariof+com*0.15));
             
     }
    // Escreva	 um	 algoritmo	 que	 leia uma	 temperatura	 em	 graus	 Celsius	 e	
//apresent√°-la	convertida	em	graus	Fahrenheit.	A	f√≥rmula	de	convers√£o	√©:	F =
//(9*C+160)/5,	sendo	F	a	temperatura	em	Fahrenheit	e	C	a	temperatura	em	
//Celsius
    static void q4(){
        
        System.out.println("informe os graus em Celsius");
        double c = sc.nextDouble();
        
        System.out.println("o valor em Fahrenheint √©: "+ (9*c+160)/5);
        
        
    }
    static void q5() {
    	
    	System.out.println("(  !  ) Informe o Cambio do Dolar: ");
    	double dolar = sc.nextDouble();
    	
    	System.out.println("(  !  ) Quantidades de Dolares disponiveis na conta:");
    	double saldo = sc.nextDouble();
    	
    	System.out.println("(  !  ) Saldo disponivel apos convers„o e " + (dolar*saldo));
    }
    
    static void q6() {
    	
    	System.out.println("(  !  ) Informe o valor Depositado: ");
    	double saldo = sc.nextDouble();
    		
    	System.out.println("(  !  )  O rendimento È " + (saldo*1.007));
    	
    }
    static void q7() {
    	
    	System.out.println("(  !  ) Informe o valor da compra: ");
    	double valor = sc.nextDouble();
    	
    	System.out.println("(  !  ) O valor das prestaÁoes È: " + (valor/5) + " reais");
    }
    
    static void q8() {
    	
    	System.out.println();
    }
    
    static void q9( ) {
    	System.out.println("(  !  ) Informe o valor do custo de fabrica do corro: ");
    	double valor = sc.nextDouble();
    	
    	System.out.println("(  !  ) O valor final do carro È " + (valor*1.45)*1.28 + " reais");
    }
    static void q10() {
    	System.out.println("(  !  ) Informe o volar A: ");
    	int a = sc.nextInt();
    	System.out.println("(  !  ) Informe o volar B: ");
    	int b = sc.nextInt();
    	int c;
    	
    	c = a; a = b; b = c;
    	
    	
    	System.out.println("Numero de A: " + a);
    	System.out.println("Numero de B: " + b);
    	
    }
    static void q11() {
    	// Letra a) No "escreva(b)" mostar· 120, j· no "escreva(A, B)" vai mostrar 100, 234"
    	// Letra b) No "escreva(A,B,C)" mostar· 67,34, 79
    	// Letra c) No "escreva(c)" mostar· 500, "escreva(B,C)" mostar· 140, 500; e no "escreva(A, B, C)" mostar· 300,140,440.
        // Letra d) No "escreva(z)" mostar· -22			
    }
    
    
    static void q12() {
    	
    	// 1 - mesmo resultado
    	// 2 - n„o da mesmo resultado
    	// 3 - n„o da mesmo resultado
    	
    }
    
    static void q13() {
    	
    	//A = 6*(3+2))
    	//B = 2+6*(3+2))
        //C = 2+3*6/(2+4))
    	//D = 2*(8/(3+1)))
    	//E = 3+(16-2)/(2*(9-2)))
    	//F = 6/3+8/2)
    	//G = 3+(8/2)*4+3*2)
    	//H = (6*3*3+6-10))
    	//I = (10*8+3)*9);
    	//J = (-12*-4)+(3*-4))
    
    }
    static void q14() {
    	
    	System.out.println("(   !   ) Informe um numero: ");
    	int num = sc.nextInt();
    		
    	System.out.println("Seu antecessor: " + (num-1));
    	System.out.println("Seu sucessor: " + (num+1));
    }
    
    static void q15() {
    	
    	System.out.println("(   !   ) Infotme a base e a altura: ");
    	double base = sc.nextDouble(), altura= sc.nextDouble();
    	
    	System.out.println("(   !   ) A area e: " + base*altura + " metros quadrados");
    	
    }
    
    static void q16() {
    	
    	System.out.println(" *** Informe sua idade: ");
    	double idade = sc.nextDouble();
    	double sobra;
    	int ano;
    	
    	ano = (int) idade;
    	sobra = idade - ano;
    	
    	System.out.println(" *** Escolha o estilo do tempo abaixo");
    	System.out.println(" *** 1 - Anos, 2 - Meses e 3 - Dias");
    	int num = sc.nextInt();
    	
    	switch (num) {
    		case 1:
    			System.out.println((ano*365)+(sobra*10)*30 + " dias");
    			break;
    		case 2:
    			System.out.println((ano*30)+(sobra*10) + " dias");
    			break;
    		default:
    			System.out.println(idade + " dias");
    			break;
    	}
    }
    
    static void q17() {
    	
    	System.out.println("--------------------------------------");
    	System.out.println("Informe o dados dos eleitores     ");
    	System.out.println("");
    	System.out.println("Numero total: ");
    	double total = sc.nextDouble();
    	System.out.println("Votos brancos: ");
    	double brancos = sc.nextDouble();
    	System.out.println("Votos nulos: ");
    	double nulos = sc.nextDouble();
    	System.out.println("Votos Validos: ");
    	double validos = sc.nextDouble();
    	
    	double pb = brancos/total;
    	double pn = nulos/total;
    	double pv = validos/total;
    	
    	System.out.println("");
    	System.out.println(" Brancos: " + pb*100 + " %");
    	System.out.println(" Nulos: " + pn*100 + " %");
    	System.out.println(" Validos: " + pv*100 + " %");
    	
    }
    
    static void  q18() {
    	    	
    	    	System.out.println(" *** Informe o salario atual: ");
    	    	double sal = sc.nextDouble();
    	    	System.out.println(" *** Informe o percentual de reajuste em %: ");
    	    	double rer = sc.nextDouble();
    	    	
    	    	nsal = sal*(rer/100)
    	    	
    	    	System.out.println("");
    	    	System.out.println(" *** Seu novo salrio È: " + nsal);
    	
    }
}
