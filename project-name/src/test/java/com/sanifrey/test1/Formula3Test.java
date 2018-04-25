/** 
* Устанавливаем принадлежность класса к пакету ProjectTest 
*/
package com.sanifrey.test1;

/** 
* Импортируем библиотеку 
*/
import static org.junit.Assert.*;
/** 
* Импортируем библиотеку 
*/
import org.junit.Test;

/** 
* Импортируем класс Formula
*/

/**
 * Основной класс
 */
public class Formula3Test {
	/**
	 * Объявляем переменную типа Formula
	 */
	private Formula formula;

	/**
	 * Обозначаем , что следующий метод будет тестируемым
	 */
	@Test
	/**
	 * тестируемый метод
	 */
	public void test() {
		/**
		 * Инициализируем переменную formula
		 */
		formula = new Formula();
		/**
		 * Тестируем метод с входными параметрами 70, 3, 7 и с предполагаемым
		 * результатом 49.0 для проверки работы программы с целыми числами. Тестируемый
		 * метод выполняет расчёт свободной площади в комнате по формуле: Z=S-a*b. Z -
		 * Значение свободной площади в комнате; S - Значение всей площади в комнате,
		 * передается первым при вызове метода; a - Значение ширины объекта, передается
		 * вторым при вызове метода; b - Значение длины объекта, передается третьим при
		 * вызове метода; Предполагается, что программа выполнит следующие расчёты:
		 * 70-3*7 и вернёт значение: 49.0.
		 */
		formula.PublicAddObject("3", "7");
		assertEquals("49.0", formula.PFormula("70"));
		formula.PublicDeleteObjects();
	}
}