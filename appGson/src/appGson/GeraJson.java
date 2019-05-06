package appGson;

import java.io.FileWriter;

import com.google.gson.Gson;

public class GeraJson {

	public static void main(String[] args) {
		Cerveja skol = new Cerveja();
		skol.setAno(2010);
		skol.setMalte("Puro Malte");
		skol.setMarca("Skol");
		skol.setNome("Skol Ice Blue Red");
		
		Gson g = new Gson();
		String json =g.toJson(skol); //transforme em Json o que for passado como parametro. a classe java vai converter em um arquivo json
		System.out.println(json);  //imprime na tela o arquivo json criado
		
		
		try {
		FileWriter fw =  new FileWriter("cerveja.json");
		fw.write(json);
		fw.close();
		
		}
		catch(Exception e) {
			
		}
	}
}
