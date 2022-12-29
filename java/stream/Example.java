package net.codeamos.java.stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Example {
	
	public static void main(String[] args) {
		Usuario u10 = new Usuario("juan", 10, true);
		Usuario u11 = new Usuario("luis", 10, true);
		Usuario u12 = new Usuario("miguel", 10, true);
		Usuario u13 = new Usuario("juan", 11, true);
		Usuario u14 = new Usuario("pedro", 10, true);
		Usuario u15 = new Usuario("pablo", 10, false);
		Usuario u16 = new Usuario("juan", 12, true);
		Usuario u17 = new Usuario("pedro", 11, true);
		
		List<Usuario> usuariosList = List.of(u10,u11,u12,u13,u14,u15,u16,u17);
		
//		Map<String, String> subscriptionsMap = usuariosList.stream().collect(Collectors.toMap(x -> x.getNombre(), x -> x.getNombre()));
//		System.out.println("MAP:"+subscriptionsMap.toString());		
		
		Map<String, String> subscriptionsMap = usuariosList.stream().collect(Collectors.toMap(x -> x.getNombre(), x -> x.toString(), (oldValue, newValue) -> oldValue));
		System.out.println("MAP:"+subscriptionsMap.toString());	
		
		Map<String, String> subscriptionsMap2 = usuariosList.stream()
															.filter(x -> x.getStatus())
															.collect(
																	Collectors.toMap(x -> x.getNombre(), 
																	x -> x.toString(), 
																	(oldValue, newValue) -> newValue,
																	TreeMap::new) //LinkedHashMap::new <- ordenados de acuerdo a lista inicial
																	);
		System.out.println("MAP:"+subscriptionsMap2.toString());						
		
		Map<String, String> subscriptionsMap3 = usuariosList.stream()
				.filter(x -> x.getStatus())
				.collect(
						Collectors.toMap(x -> x.getNombre(), 
								x -> x.toString(), 
								(oldValue, newValue) -> newValue,
								LinkedHashMap::new) // <- ordenados de acuerdo a lista inicial
						);
		System.out.println("MAP:"+subscriptionsMap3.toString());							
	}
}