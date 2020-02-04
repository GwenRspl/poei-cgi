package tpCalculException;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TraitementTest {

	@Test
	void should_throw_negatifException_when_number_1_below_zero() {
		NegatifException thrown = assertThrows(NegatifException.class, () -> Traitement.calcul(-8, 5, "-"));
		assertTrue(thrown	.toString()
							.contains("nb1"));
	}

	@Test
	void should_throw_negatifException_when_number_2_below_zero() {
		NegatifException thrown = assertThrows(NegatifException.class, () -> Traitement.calcul(5, -5, "-"));
		assertTrue(thrown	.toString()
							.contains("nb2"));
	}

	@Test
	void should_throw_operateurException_when_operator_string_is_not_correct() {
		OperateurException thrown = assertThrows(OperateurException.class, () -> Traitement.calcul(5, 8, "dfg"));
		assertTrue(thrown	.toString()
							.contains("dfg"));
	}

	@Test
	void should_throw_ArithmeticException_when_trying_to_divide_by_zero() {
		assertThrows(ArithmeticException.class, () -> Traitement.calcul(5, 0, "/"));
	}

}
