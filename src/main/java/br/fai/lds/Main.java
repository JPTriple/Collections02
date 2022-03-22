package br.fai.lds;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Main App = new Main();
		App.start();
		
	}
	
	private static void start() {
		Map<String, String> map;
		map = new HashMap<String, String>();
		
		map.put("SRS", "Santa Rita do Sapucai");
		map.put("PA", "Pouso Alegre");
		map.put("ITA", "Itajuba");
		map.put("ZORO", "Conceição dos Ouros");
		map.put("CAXU", "Cachoeira de Minas");
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
            String chave = entry.getKey();
            String valor = entry.getValue();
            System.out.println(String.format("chave: %s | valor: %s", chave, valor));
        }
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
            String chave = entry.getKey();
            String valor = entry.getValue();
            if (chave.equals("ZORO")) {
				System.out.println("\nChave: "+ chave + " Valor: " +valor);
			}
           
        }
		for (Map.Entry<String, String> entry : map.entrySet()) {
            String chave = entry.getKey();
            String valor = entry.getValue();
            if (chave.equals("MG")) {
				System.out.println("\nChave: "+ chave + " Valor: " +valor);
			}else {
				System.out.println("Chave MG não existe");
			}
            
        }
		
		 try {
         	map.put("SRS", "Santa Rita");
         	System.out.println("\nChave SRS Alterada Com Sucesso");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao alterar valor da chave");
			}
        finally {
			System.out.println("");
		}
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
            String chave = entry.getKey();
            String valor = entry.getValue();
            System.out.println(String.format("chave: %s | valor: %s", chave, valor));
		
		
		
		
		
		
	}
		System.out.println("Fim !!!");
	}

}