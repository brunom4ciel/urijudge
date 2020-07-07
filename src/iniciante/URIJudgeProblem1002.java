package iniciante;

//Problem: 1002 - Extremamente Básico (https://www.urionlinejudge.com.br/judge/pt/problems/view/1002)

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
/**
* IMPORTANT:
*      O nome da classe deve ser "Main" para que a sua solução execute
*      Class name must be "Main" for your solution to execute
*      El nombre de la clase debe ser "Main" para que su solución ejecutar
*/
public class URIJudgeProblem1002 {

	public static void main(String[] args) throws IOException {
		double area = 0, n = 3.14159;
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader strIn = new BufferedReader(in);
		
		area = Double.parseDouble(strIn.readLine());
		
		System.out.printf("A=%.4f\n", Math.pow(area,2) * n);
	}

}