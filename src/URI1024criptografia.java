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
public class URI1024criptografia {
	
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
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
