package iniciante;

//Problem: 1005 - Extremamente Básico (https://www.urionlinejudge.com.br/judge/pt/problems/view/1005)

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
/**
* IMPORTANT:
*      O nome da classe deve ser "Main" para que a sua solução execute
*      Class name must be "Main" for your solution to execute
*      El nombre de la clase debe ser "Main" para que su solución ejecutar
*/
public class URIJudgeProblem1005 {

	public static void main(String[] args) throws IOException {
		double a = 0, b = 0, nota = 0;
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader strIn = new BufferedReader(in);
		
		a = Double.parseDouble(strIn.readLine());
		b = Double.parseDouble(strIn.readLine());
		
		nota = ((a * 3.5) +(b * 7.5))/11;
				
		System.out.printf("MEDIA = %.5f\n", nota);
	}

}