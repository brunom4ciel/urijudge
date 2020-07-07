//Problem: 1024 - String - Criptografia (https://www.urionlinejudge.com.br/judge/pt/problems/view/1024)

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
* IMPORTANT:
*      O nome da classe deve ser "Main" para que a sua solução execute
*      Class name must be "Main" for your solution to execute
*      El nombre de la clase debe ser "Main" para que su solución ejecutar
*/
/**
 * Solicitaram para que você construisse um programa simples de criptografia. 
 * Este programa deve possibilitar enviar mensagens codificadas sem que alguém 
 * consiga lê-las. O processo é muito simples. São feitas três passadas em todo 
 * o texto.
 * 
 * Na primeira passada, somente caracteres que sejam letras minúsculas e 
 * maiúsculas devem ser deslocadas 3 posições para a direita, segundo a tabela 
 * ASCII: letra 'a' deve virar letra 'd', letra 'y' deve virar caractere '|' 
 * e assim sucessivamente. Na segunda passada, a linha deverá ser invertida. 
 * Na terceira e última passada, todo e qualquer caractere a partir da metade 
 * em diante (truncada) devem ser deslocados uma posição para a esquerda na 
 * tabela ASCII. Neste caso, 'b' vira 'a' e 'a' vira '`'.
 * 
 * Por exemplo, se a entrada for “Texto #3”, o primeiro processamento sobre 
 * esta entrada deverá produzir “Wh{wr #3”. O resultado do segundo 
 * processamento inverte os caracteres e produz “3# rw{hW”. Por último, com 
 * o deslocamento dos caracteres da metade em diante, o resultado final deve 
 * ser “3# rvzgV”.
 * 
 * Entrada
 * 
 * A entrada contém vários casos de teste. A primeira linha de cada caso de 
 * teste contém um inteiro N (1 ≤ N ≤ 1*104), indicando a quantidade de linhas 
 * que o problema deve tratar. 
 * As N linhas contém cada uma delas M (1 ≤ M ≤ 1*103) caracteres.
 * 
 * Saída
 * 
 * Para cada entrada, deve-se apresentar a mensagem criptografada.
 *
 * @author Bruno Maciel <brunom4ciel>
 * @version $Revision: 1 $
 */
public class URI1024criptografia {
	
	static BufferedReader in = new BufferedReader(
											new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) throws IOException {	 
		// TODO Auto-generated method stub
					
		char[] str;
		int n = Integer.parseInt(in.readLine());
		int i = 0;		
		
		while(i < n) {
			
			int j = 0;
			int x = 0;
			
			str = in.readLine().toCharArray();			
			x = str.length;
			
			while(j < x){
				
				int m = (int) str[j];
				m += 3;
				
				if(str[j] >= 'a' && str[j] <= 'z'){
					str[j] = (char) m;
				}else if(str[j] >= 'A' && str[j] <= 'Z'){
					str[j] = (char) m;
				}				
				j++;
			}
			
			char c;
			int m;

			for(m=0; m<x/2;m++){
				c = str[m];
				str[m] = str[x-1-m];
				str[x-1-m] = c;
			}
			int a;
			
			for (a = x/2; a < x; a++)
			{
				int z = (int) str[a];
				z -= 1;				
				str[a] = (char) z;
			}
			
			out.println(str);			
			i++;			
		}		
		out.close();				
	}
}
