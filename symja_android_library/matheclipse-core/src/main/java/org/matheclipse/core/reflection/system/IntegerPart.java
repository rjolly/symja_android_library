package org.matheclipse.core.reflection.system;

import static org.matheclipse.core.expression.F.IntegerPart;
import static org.matheclipse.core.expression.F.Negate;

import org.matheclipse.core.builtin.function.NumericQ;
import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractFunctionEvaluator;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISignedNumber;
import org.matheclipse.core.interfaces.ISymbol;

public class IntegerPart extends AbstractFunctionEvaluator {

	public IntegerPart() {
	}

	@Override
	public IExpr evaluate(final IAST ast) {
		Validate.checkSize(ast, 2);

		try {
			IExpr arg1 = ast.arg1();
			ISignedNumber signedNumber = NumericQ.getSignedNumberNumericQ(arg1);
			if (signedNumber != null) {
				return signedNumberIntegerPart(signedNumber);
			}
			IExpr negExpr = AbstractFunctionEvaluator.getNormalizedNegativeExpression(arg1);
			if (negExpr != null) {
				return Negate(IntegerPart(negExpr));
			}
		} catch (ArithmeticException ae) {
			// ISignedNumber#floor() or #ceil() may throw ArithmeticException
		}
		return null;
	}

	private IExpr signedNumberIntegerPart(ISignedNumber arg1) {
		final ISignedNumber signedNumber = (ISignedNumber) arg1;
		if ((signedNumber).isNegative()) {
			return (signedNumber).ceil();
		} else {
			return (signedNumber).floor();
		}
	}

	@Override
	public IExpr numericEval(final IAST ast) {
		return evaluate(ast);
	}

	@Override
	public void setUp(final ISymbol symbol) {
		symbol.setAttributes(ISymbol.NHOLDALL | ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		super.setUp(symbol);
	}

}
