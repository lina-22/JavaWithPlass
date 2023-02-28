package debut;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecipientTest {

	@Test
	void testConstructeur() {
		//Given
		int espaceLibre = 3;
		int capacite = 5;
		Recipient instance = new Recipient(espaceLibre,capacite);
		//Whene vide car nous testons le constructeur
		//Then 
		assertEquals(2, instance.getQuantite());
		assertEquals(5, instance.getCapacite());

	}
	
	@Test
	
	void testMettreUnDans() {
		//Given
		Recipient instance = new Recipient(2,5);
		Recipient autre = new Recipient(1,4);
		//Whene
		instance.mettreUnDans(autre);
		//Then
		assertEquals(1,instance.getQuantite());
		assertEquals(2,autre.getQuantite());
		assertEquals(5,instance.getCapacite());
		assertEquals(4,autre.getCapacite());

	}
	void testRemplir() {
		//Given
		Recipient instance = new Recipient(2,5);
		Recipient autre = new Recipient(5,6);
		//Whene
		instance.remplir(autre);
		assertTrue(autre.isPlein());
		assertEquals(1,instance.getQuantite());
		
	}
	
	void testViderDans() {
		//Given
		Recipient instance = new Recipient(2,5);
		Recipient autre = new Recipient(3,6);	
		//Whene
		instance.viderDans(autre);
		//Then 
		instance.isVide(instance);
		assertEquals(5,autre.getQuantite());
		assertEquals(5,instance.getCapacite());
		assertEquals(6,autre.getCapacite());
	}
}
