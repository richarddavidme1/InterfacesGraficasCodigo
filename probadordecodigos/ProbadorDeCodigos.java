package probadordecodigos;
import java.util.Arrays;

public class ProbadorDeCodigos 
{
	public static void main(String[] args) {
		
		///int lista[]= {11,4,3,0,8,7,2,12,14,23,17,1};
		int lista[]= {5,4,1,8};
		System.out.println("Lista no ordenada ");
		System.out.println(Arrays.toString(lista));
		
		for(int i=0;i<(lista.length-1);i++)
			{
				for(int j=i+1;j<(lista.length);j++)
					{
					    
					    
						if(lista[i]>lista[j])
							{
							  
								int variable=lista[i];
								lista[i]=lista[j];
								lista[j]=variable;
							}
					}
				System.out.println("Lista ordenada parcial ");
				System.out.println(Arrays.toString(lista));

			}
		System.out.println("Lista ordenada final ");
		System.out.println(Arrays.toString(lista));
	}

}
