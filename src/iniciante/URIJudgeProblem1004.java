package iniciante;

//Problem: 1004 - Extremamente Básico (https://www.urionlinejudge.com.br/judge/pt/problems/view/1004)

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
/**
* IMPORTANT:
*      O nome da classe deve ser "Main" para que a sua solução execute
*      Class name must be "Main" for your solution to execute
*      El nombre de la clase debe ser "Main" para que su solución ejecutar
*/
public class URIJudgeProblem1004 {

	public static void main(String[] args) throws IOException {
		int a = 0, b = 0;
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader strIn = new BufferedReader(in);
		
		a = Integer.parseInt(strIn.readLine());
		b = Integer.parseInt(strIn.readLine());
		
		System.out.println("PROD = " + (a * b));
	}

}