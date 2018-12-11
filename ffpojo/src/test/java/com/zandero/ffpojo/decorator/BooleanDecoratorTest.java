package com.zandero.ffpojo.decorator;

import org.junit.Test;

import com.zandero.ffpojo.exception.FieldDecoratorException;
import com.google.common.truth.Truth;

public class BooleanDecoratorTest {

	private InternalBooleanDecorator booleanDecorator;
	
	@Test
	public void deveDevolverTrueCasoValorIgualAUmEFalseCasoValorIgualZero() throws FieldDecoratorException {
		booleanDecorator =  new InternalBooleanDecorator("1", "0");
		Truth.assert_().that(booleanDecorator.fromString("1")).isTrue();
		Truth.assert_().that(booleanDecorator.fromString("0")).isFalse();
	}

	@Test
	public void deveDevolverTrueCasoValorIgualAEFalseCasoValorIgualB() throws FieldDecoratorException {
		booleanDecorator =  new InternalBooleanDecorator("A", "B");
		Truth.assert_().that(booleanDecorator.fromString("A")).isTrue();
		Truth.assert_().that(booleanDecorator.fromString("B ")).isFalse();
	}
	@Test
	public void deveDevolverTrueCasoValorIgualTrueUmEFalseCasoValorIgualFalse() throws FieldDecoratorException {
		booleanDecorator =  new InternalBooleanDecorator("true", "false");
		Truth.assert_().that(booleanDecorator.fromString("true")).isTrue();
		Truth.assert_().that(booleanDecorator.fromString("false")).isFalse();
	}
	
	@Test
	public void deveDevolverASeValorIgualTrueBSeValorFalse() throws FieldDecoratorException{
		booleanDecorator =  new InternalBooleanDecorator("A", "B");
		Truth.assert_().that(booleanDecorator.toString(true)).isEqualTo("A");
		Truth.assert_().that(booleanDecorator.toString(false)).isEqualTo("B");
	}
	
	@Test
	public void deveDevolverTrueSeValorIgualTrueFalseSeValorFalse() throws FieldDecoratorException{
		booleanDecorator =  new InternalBooleanDecorator("true", "false");
		Truth.assert_().that(booleanDecorator.toString(true)).isEqualTo("true");
		Truth.assert_().that(booleanDecorator.toString(false)).isEqualTo("false");
	}
	
	@Test
	public void deveDevolverUmSeValorIgualTrueZeroSeValorFalse() throws FieldDecoratorException{
		booleanDecorator =  new InternalBooleanDecorator("1", "0");
		Truth.assert_().that(booleanDecorator.toString(true)).isEqualTo("1");
		Truth.assert_().that(booleanDecorator.toString(false)).isEqualTo("0");
	}

	@Test
	public void deveFuncionarIgnorandoCase() throws FieldDecoratorException{
		booleanDecorator =  new InternalBooleanDecorator("A", "B");
		Truth.assert_().that(booleanDecorator.fromString("a")).isTrue();
		Truth.assert_().that(booleanDecorator.fromString("b")).isFalse();
	}

}
