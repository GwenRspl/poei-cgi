package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CompteSimpleTest {

	@Test
	void testCompteCB() {
		CompteCB cb = new CompteCB("Capitaine Haddock", CB.AMEX);
		assertEquals(15, cb.getSolde());
	}

	@Test
	void testCompteSimple() {
		CompteSimple simple = new CompteSimple("Professeur Tournesol");
		assertEquals(20, simple.getSolde());
	}

	@Test
	void should_credit_when_all_is_correct() throws OperationNegException {
		CompteSimple simple = new CompteSimple("Professeur Tournesol");
		simple.crediter(101);
		assertEquals(120, simple.getSolde());
	}

	@Test
	void should_debit_when_all_is_correct() throws SoldeInsuffisantException, OperationNegException {
		CompteSimple simple = new CompteSimple("Professeur Tournesol");
		simple.debiter(10);
		assertEquals(9, simple.getSolde());
	}

	@Test
	void should_not_debit_when_all_solde_is_too_low() {
		CompteSimple simple = new CompteSimple("Professeur Tournesol");
		assertThrows(SoldeInsuffisantException.class, () -> simple.debiter(100));
	}

}
