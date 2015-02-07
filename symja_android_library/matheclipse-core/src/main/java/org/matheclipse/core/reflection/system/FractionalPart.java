package org.matheclipse.core.reflection.system;

import static org.matheclipse.core.expression.F.FractionalPart;
import static org.matheclipse.core.expression.F.Negate;

import java.math.BigInteger;

import org.matheclipse.core.builtin.function.NumericQ;
import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractFunctionEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IFraction;
import org.matheclipse.core.interfaces.INum;
import org.matheclipse.core.interfaces.INumber;
import org.matheclipse.core.interfaces.ISignedNumber;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.parser.client.SyntaxError;

/**
 * Get the fractional part auf a number
 */
public class FractionalPart extends AbstractFunctionEvaluator {

	public FractionalPart() {
	}

	@Override
	public IExpr evaluate(final IAST ast) {
		Validate.checkSize(ast, 2);

		IExpr arg1 = ast.arg1();
		ISignedNumber signedNumber = NumericQ.getSignedNumberNumericQ(arg1);
		if (signedNumber != null) {
			return signedNumberFractionalPart(signedNumber);
		}
		IExpr negExpr = AbstractFunctionEvaluator.getNormalizedNegativeExpression(arg1);
		if (negExpr != null) {
			return Negate(FractionalPart(negExpr));
		}
		return null;
	}

	private IExpr signedNumberFractionalPart(INumber arg1) {
		if (arg1.isInteger()) {
			return F.C0;
		} else if (arg1.isFraction()) {
			IFraction fr = (IFraction) arg1;
			BigInteger num = fr.getBigNumerator();
			BigInteger den = fr.getBigDenominator();
			BigInteger div = num.divide(den);
			if (div.equals(BigInteger.ZERO)) {
				return F.C0;
			}
			return F.fraction(div, den);
			// } else if (arg1.isComplex()) {
			// IComplex fr = (IComplex) arg1;
			// BigFraction re = fr.getRealPart();
			// BigFraction im = fr.getImaginaryPart();
			//
			// IFraction reResult;
			// IFraction imResult;
			// BigInteger num = re.getNumerator();
			// BigInteger den = re.getDenominator();
			// BigInteger div = num.divide(den);
			// if (div.equals(BigInteger.ZERO)) {
			// reResult = F.C0;
			// } else {
			//
			// }
			// return F.complex(div, den);
		} else if (arg1 instanceof INum) {
			INum num = (INum) arg1;
			return F.num(num.getRealPart() % 1);
		}
		return null;
	}

	@Override
	public void setUp(final ISymbol symbol) throws SyntaxError {
		symbol.setAttributes(ISymbol.NHOLDALL | ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		super.setUp(symbol);
	}
}