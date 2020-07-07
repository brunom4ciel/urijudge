package iniciante;

//Problem: 1006 - Extremamente Básico (https://www.urionlinejudge.com.br/judge/pt/problems/view/1006)

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
/**
* IMPORTANT:
*      O nome da classe deve ser "Main" para que a sua solução execute
*      Class name must be "Main" for your solution to execute
*      El nombre de la clase debe ser "Main" para que su solución ejecutar
*/
public class URIJudgeProblem1006 {

	public static void main(String[] args) throws IOException {
		double a = 0, b = 0, c = 0, nota = 0;
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader strIn = new BufferedReader(in);
		
		a = Double.parseDouble(strIn.readLine());
		b = Double.parseDouble(strIn.readLine());
		c = Double.parseDouble(strIn.readLine());
		
		nota = ((a * 2) + (b * 3) + (c * 5))/10;
				
		System.out.printf("MEDIA = %.1f\n", nota);
	}

}