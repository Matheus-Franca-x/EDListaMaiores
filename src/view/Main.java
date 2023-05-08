package view;

import matheus.ListaInt.ListaInt;

public class Main {

	public static void main(String[] args) 
	{
		ListaInt l = new ListaInt();
		int[] vet = {3, 5, 8, 12, 9, 7, 6, 2, 3, 7, 16};
		int tam = vet.length;
		
		for (int i = 0; i < tam; i++)
		{
			if (l.isEmpty())
			{
				l.addFirst(vet[i]);
			}
			else
			{
				try {
					l.addLast(vet[i]);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		int tamMaior = 0;
		int tamMenor = 0;
		try {
			tamMaior = l.get(0);
			for(int i = 0; i < l.size(); i++)
			{
				for (int j = 0; j < l.size(); j++)
				{
					if (l.get(j) > tamMaior)
					{						
						tamMenor = tamMaior;							
						tamMaior = l.get(j);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("O maior valor e: " + tamMaior);
		System.out.println("O segundo maior valor e: " + tamMenor);
		

	}

}
