/*
 * Copyright (c) 2014 Villu Ruusmann
 *
 * This file is part of JPMML-Evaluator
 *
 * JPMML-Evaluator is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JPMML-Evaluator is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with JPMML-Evaluator.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.jpmml.manager;

import org.dmg.pmml.DataField;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PMMLExceptionTest {

	@Test
	public void formatElement(){
		assertEquals("DataField", PMMLException.formatElement(DataField.class));
	}

	@Test
	public void formatAttribute(){
		assertEquals("isCyclic", PMMLException.formatAttribute(DataField.class, "cyclic"));
	}

	@Test
	public void formatValue(){
		assertEquals("0", PMMLException.formatValue(DataField.Cyclic.ZERO));
		assertEquals("1", PMMLException.formatValue(DataField.Cyclic.ONE));
	}
}