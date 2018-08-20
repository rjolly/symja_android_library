package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules14 { 
  public static IAST RULES = List( 
IIntegrate(4797,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Int(PolynomialDivide(Power(Plus(d,Times(e,x)),m),Plus(a,Times(b,x),Times(c,Sqr(x))),x),x),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),IGtQ(m,C1),Or(NeQ(d,C0),GtQ(m,C2))))),
IIntegrate(4798,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Int(PolynomialDivide(Power(Plus(d,Times(e,x)),m),Plus(a,Times(c,Sqr(x))),x),x),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IGtQ(m,C1),Or(NeQ(d,C0),GtQ(m,C2))))),
IIntegrate(4799,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Times(c,Plus(m,Negate(C1))),-1)),x),Dist(Power(c,-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Simp(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e)),Times(e,Plus(Times(C2,c,d),Times(CN1,b,e)),x)),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),GtQ(m,C1)))),
IIntegrate(4800,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Times(c,Plus(m,Negate(C1))),-1)),x),Dist(Power(c,-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Simp(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e)),Times(C2,c,d,e,x)),x),Power(Plus(a,Times(c,Sqr(x))),-1)),x),x)),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),GtQ(m,C1)))),
IIntegrate(4801,Int(Power(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),-1),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(e),Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),-1)),Int(Power(Plus(d,Times(e,x)),-1),x),x),Dist(Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),-1),Int(Times(Plus(Times(c,d),Times(CN1,b,e),Times(CN1,c,e,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0)))),
IIntegrate(4802,Int(Power(Times(Plus(d_,Times(e_DEFAULT,x_)),Plus(a_,Times(c_DEFAULT,Sqr(x_)))),-1),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(e),Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),-1)),Int(Power(Plus(d,Times(e,x)),-1),x),x),Dist(Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),-1),Int(Times(Plus(Times(c,d),Times(CN1,c,e,x)),Power(Plus(a,Times(c,Sqr(x))),-1)),x),x)),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0)))),
IIntegrate(4803,Int(Power(Times(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),-1),x_Symbol),
    Condition(Dist(Times(C2,e),Subst(Int(Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e)),Times(CN1,Plus(Times(C2,c,d),Times(CN1,b,e)),Sqr(x)),Times(c,Power(x,4))),-1),x),x,Sqrt(Plus(d,Times(e,x)))),x),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0)))),
IIntegrate(4804,Int(Power(Times(Plus(a_,Times(c_DEFAULT,Sqr(x_))),Sqrt(Plus(d_,Times(e_DEFAULT,x_)))),-1),x_Symbol),
    Condition(Dist(Times(C2,e),Subst(Int(Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e)),Times(CN1,C2,c,d,Sqr(x)),Times(c,Power(x,4))),-1),x),x,Sqrt(Plus(d,Times(e,x)))),x),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0)))),
IIntegrate(4805,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Times(Plus(m,C1),Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e)))),-1)),x),Dist(Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Simp(Plus(Times(c,d),Times(CN1,b,e),Times(CN1,c,e,x)),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),LtQ(m,CN1)))),
IIntegrate(4806,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Times(Plus(m,C1),Plus(Times(c,Sqr(d)),Times(a,Sqr(e)))),-1)),x),Dist(Times(c,Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Plus(d,Times(CN1,e,x)),Power(Plus(a,Times(c,Sqr(x))),-1)),x),x)),And(FreeQ(List(a,c,d,e,m),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),LtQ(m,CN1)))),
IIntegrate(4807,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),-1),x),x),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),Not(IntegerQ(m))))),
IIntegrate(4808,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(c,Sqr(x))),-1),x),x),And(FreeQ(List(a,c,d,e,m),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(m))))),
IIntegrate(4809,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(d,Times(e,x)),FracPart(p)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),FracPart(p)),Power(Power(Plus(Times(a,d),Times(c,e,Power(x,3))),FracPart(p)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(p))),Power(Plus(Times(a,d),Times(c,e,Power(x,3))),p)),x),x),And(FreeQ(List(a,b,c,d,e,m,p),x),EqQ(Plus(Times(b,d),Times(a,e)),C0),EqQ(Plus(Times(c,d),Times(b,e)),C0),IGtQ(Plus(m,Negate(p),C1),C0),Not(IntegerQ(p))))),
IIntegrate(4810,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Int(Times(Power(Plus(d,Times(e,x)),m),Power(Times(Sqrt(Times(b,x)),Sqrt(Plus(C1,Times(c,x,Power(b,-1))))),-1)),x),And(FreeQ(List(b,c,d,e),x),NeQ(Plus(Times(c,d),Times(CN1,b,e)),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),EqQ(Sqr(m),C1D4),LtQ(c,C0),RationalQ(b)))),
IIntegrate(4811,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(x),Sqrt(Plus(b,Times(c,x))),Power(Plus(Times(b,x),Times(c,Sqr(x))),CN1D2)),Int(Times(Power(Plus(d,Times(e,x)),m),Power(Times(Sqrt(x),Sqrt(Plus(b,Times(c,x)))),-1)),x),x),And(FreeQ(List(b,c,d,e),x),NeQ(Plus(Times(c,d),Times(CN1,b,e)),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),EqQ(Sqr(m),C1D4)))),
IIntegrate(4812,Int(Times(Power(x_,m_),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(C2,Subst(Int(Times(Power(x,Plus(Times(C2,m),C1)),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),CN1D2)),x),x,Sqrt(x)),x),And(FreeQ(List(a,b,c),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Sqr(m),C1D4)))),
IIntegrate(4813,Int(Times(Power(Times(e_,x_),m_),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Power(Times(e,x),m),Power(Power(x,m),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1D2)),x),x),And(FreeQ(List(a,b,c,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Sqr(m),C1D4)))),
IIntegrate(4814,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(C2,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2),Power(Plus(d,Times(e,x)),m),Sqrt(Times(CN1,c,Plus(a,Times(b,x),Times(c,Sqr(x))),Power(Plus(Sqr(b),Times(CN1,C4,a,c)),-1))),Power(Times(c,Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c,Plus(d,Times(e,x)),Power(Plus(Times(C2,c,d),Times(CN1,b,e),Times(CN1,e,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),-1)),m)),-1)),Subst(Int(Times(Power(Plus(C1,Times(C2,e,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2),Sqr(x),Power(Plus(Times(C2,c,d),Times(CN1,b,e),Times(CN1,e,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),-1))),m),Power(Plus(C1,Negate(Sqr(x))),CN1D2)),x),x,Sqrt(Times(Plus(b,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2),Times(C2,c,x)),Power(Times(C2,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2)),-1)))),x),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),EqQ(Sqr(m),C1D4)))),
IIntegrate(4815,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(C2,a,Rt(Times(CN1,c,Power(a,-1)),C2),Power(Plus(d,Times(e,x)),m),Sqrt(Plus(C1,Times(c,Sqr(x),Power(a,-1)))),Power(Times(c,Sqrt(Plus(a,Times(c,Sqr(x)))),Power(Times(c,Plus(d,Times(e,x)),Power(Plus(Times(c,d),Times(CN1,a,e,Rt(Times(CN1,c,Power(a,-1)),C2))),-1)),m)),-1)),Subst(Int(Times(Power(Plus(C1,Times(C2,a,e,Rt(Times(CN1,c,Power(a,-1)),C2),Sqr(x),Power(Plus(Times(c,d),Times(CN1,a,e,Rt(Times(CN1,c,Power(a,-1)),C2))),-1))),m),Power(Plus(C1,Negate(Sqr(x))),CN1D2)),x),x,Sqrt(Times(C1D2,Plus(C1,Times(CN1,Rt(Times(CN1,c,Power(a,-1)),C2),x))))),x),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),EqQ(Sqr(m),C1D4)))),
IIntegrate(4816,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Plus(Times(d,b),Times(CN1,C2,a,e),Times(Plus(Times(C2,c,d),Times(CN1,b,e)),x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Power(Times(C2,Plus(m,C1),Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e)))),-1)),x)),Dist(Times(p,Plus(Sqr(b),Times(CN1,C4,a,c)),Power(Times(C2,Plus(m,C1),Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e)))),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C2)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),EqQ(Plus(m,Times(C2,p),C2),C0),GtQ(p,C0)))),
IIntegrate(4817,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Plus(Times(CN2,a,e),Times(C2,c,d,x)),Power(Plus(a,Times(c,Sqr(x))),p),Power(Times(C2,Plus(m,C1),Plus(Times(c,Sqr(d)),Times(a,Sqr(e)))),-1)),x)),Negate(Dist(Times(C4,a,c,p,Power(Times(C2,Plus(m,C1),Plus(Times(c,Sqr(d)),Times(a,Sqr(e)))),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C2)),Power(Plus(a,Times(c,Sqr(x))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),EqQ(Plus(m,Times(C2,p),C2),C0),GtQ(p,C0)))),
IIntegrate(4818,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Plus(Times(d,b),Times(CN1,C2,a,e),Times(Plus(Times(C2,c,d),Times(CN1,b,e)),x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x),Negate(Dist(Times(C2,Plus(Times(C2,p),C3),Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),Power(Times(Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),EqQ(Plus(m,Times(C2,p),C2),C0),LtQ(p,CN1)))),
IIntegrate(4819,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Plus(Times(a,e),Times(CN1,c,d,x)),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(C2,a,c,Plus(p,C1)),-1)),x),Dist(Times(Plus(Times(C2,p),C3),Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),Power(Times(C2,a,c,Plus(p,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1))),x),x)),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),EqQ(Plus(m,Times(C2,p),C2),C0),LtQ(p,CN1)))),
IIntegrate(4820,Int(Power(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(Dist(CN2,Subst(Int(Power(Plus(Times(C4,c,Sqr(d)),Times(CN1,C4,b,d,e),Times(C4,a,Sqr(e)),Negate(Sqr(x))),-1),x),x,Times(Plus(Times(C2,a,e),Times(CN1,b,d),Times(CN1,Plus(Times(C2,c,d),Times(CN1,b,e)),x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1D2))),x),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0)))),
IIntegrate(4821,Int(Power(Times(Plus(d_,Times(e_DEFAULT,x_)),Sqrt(Plus(a_,Times(c_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(Negate(Subst(Int(Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e)),Negate(Sqr(x))),-1),x),x,Times(Plus(Times(a,e),Times(CN1,c,d,x)),Power(Plus(a,Times(c,Sqr(x))),CN1D2)))),FreeQ(List(a,c,d,e),x))),
IIntegrate(4822,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Negate(Simp(Times(Plus(b,Negate(Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2)),Times(C2,c,x)),Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Hypergeometric2F1(Plus(m,C1),Negate(p),Plus(m,C2),Times(CN4,c,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2),Plus(d,Times(e,x)),Power(Times(Plus(Times(C2,c,d),Times(CN1,b,e),Times(CN1,e,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(b,Negate(Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2)),Times(C2,c,x))),-1))),Power(Times(Plus(m,C1),Plus(Times(C2,c,d),Times(CN1,b,e),Times(e,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Power(Times(Plus(Times(C2,c,d),Times(CN1,b,e),Times(e,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(b,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2),Times(C2,c,x)),Power(Times(Plus(Times(C2,c,d),Times(CN1,b,e),Times(CN1,e,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(b,Negate(Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2)),Times(C2,c,x))),-1)),p)),-1)),x)),And(FreeQ(List(a,b,c,d,e,m,p),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),Not(IntegerQ(p)),EqQ(Plus(m,Times(C2,p),C2),C0)))),
IIntegrate(4823,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Simp(Times(Plus(Rt(Times(CN1,a,c),C2),Times(CN1,c,x)),Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(c,Sqr(x))),p),Hypergeometric2F1(Plus(m,C1),Negate(p),Plus(m,C2),Times(C2,c,Rt(Times(CN1,a,c),C2),Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),Times(CN1,e,Rt(Times(CN1,a,c),C2))),Plus(Rt(Times(CN1,a,c),C2),Times(CN1,c,x))),-1))),Power(Times(Plus(m,C1),Plus(Times(c,d),Times(e,Rt(Times(CN1,a,c),C2))),Power(Times(Plus(Times(c,d),Times(e,Rt(Times(CN1,a,c),C2))),Plus(Rt(Times(CN1,a,c),C2),Times(c,x)),Power(Times(Plus(Times(c,d),Times(CN1,e,Rt(Times(CN1,a,c),C2))),Plus(Negate(Rt(Times(CN1,a,c),C2)),Times(c,x))),-1)),p)),-1)),x),And(FreeQ(List(a,c,d,e,m,p),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),EqQ(Plus(m,Times(C2,p),C2),C0)))),
IIntegrate(4824,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),m),Plus(b,Times(C2,c,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x),Dist(Times(m,Plus(Times(C2,c,d),Times(CN1,b,e)),Power(Times(Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,m,p),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),EqQ(Plus(m,Times(C2,p),C3),C0),LtQ(p,CN1)))),
IIntegrate(4825,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(d,Times(e,x)),m),C2,c,x,Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(C4,a,c,Plus(p,C1)),-1)),x)),Negate(Dist(Times(m,C2,c,d,Power(Times(C4,a,c,Plus(p,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1))),x),x))),And(FreeQ(List(a,c,d,e,m,p),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),EqQ(Plus(m,Times(C2,p),C3),C0),LtQ(p,CN1)))),
IIntegrate(4826,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(Plus(m,C1),Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e)))),-1)),x),Dist(Times(Plus(Times(C2,c,d),Times(CN1,b,e)),Power(Times(C2,Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e)))),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,m,p),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),EqQ(Plus(m,Times(C2,p),C3),C0)))),
IIntegrate(4827,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(Plus(m,C1),Plus(Times(c,Sqr(d)),Times(a,Sqr(e)))),-1)),x),Dist(Times(c,d,Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,c,d,e,m,p),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),EqQ(Plus(m,Times(C2,p),C3),C0)))),
IIntegrate(4828,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Power(Times(e,Plus(m,C1)),-1)),x),Negate(Dist(Times(p,Power(Times(e,Plus(m,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Plus(b,Times(C2,c,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),GtQ(p,C0),Or(IntegerQ(p),LtQ(m,CN1)),NeQ(m,CN1),Not(ILtQ(Plus(m,Times(C2,p),C1),C0)),IntQuadraticQ(a,b,c,d,e,m,p,x)))),
IIntegrate(4829,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(c,Sqr(x))),p),Power(Times(e,Plus(m,C1)),-1)),x),Negate(Dist(Times(C2,c,p,Power(Times(e,Plus(m,C1)),-1)),Int(Times(x,Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(c,Sqr(x))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,c,d,e,m),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),GtQ(p,C0),Or(IntegerQ(p),LtQ(m,CN1)),NeQ(m,CN1),Not(ILtQ(Plus(m,Times(C2,p),C1),C0)),IntQuadraticQ(a,C0,c,d,e,m,p,x)))),
IIntegrate(4830,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Power(Times(e,Plus(m,Times(C2,p),C1)),-1)),x),Negate(Dist(Times(p,Power(Times(e,Plus(m,Times(C2,p),C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),m),Simp(Plus(Times(b,d),Times(CN1,C2,a,e),Times(Plus(Times(C2,c,d),Times(CN1,b,e)),x)),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),GtQ(p,C0),NeQ(Plus(m,Times(C2,p),C1),C0),Or(Not(RationalQ(m)),LtQ(m,C1)),Not(ILtQ(Plus(m,Times(C2,p)),C0)),IntQuadraticQ(a,b,c,d,e,m,p,x)))),
IIntegrate(4831,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(c,Sqr(x))),p),Power(Times(e,Plus(m,Times(C2,p),C1)),-1)),x),Dist(Times(C2,p,Power(Times(e,Plus(m,Times(C2,p),C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),m),Simp(Plus(Times(a,e),Times(CN1,c,d,x)),x),Power(Plus(a,Times(c,Sqr(x))),Plus(p,Negate(C1)))),x),x)),And(FreeQ(List(a,c,d,e,m),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),GtQ(p,C0),NeQ(Plus(m,Times(C2,p),C1),C0),Or(Not(RationalQ(m)),LtQ(m,C1)),Not(ILtQ(Plus(m,Times(C2,p)),C0)),IntQuadraticQ(a,C0,c,d,e,m,p,x)))),
IIntegrate(4832,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),m),Plus(b,Times(C2,c,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x),Negate(Dist(Power(Times(Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Plus(Times(b,e,m),Times(C2,c,d,Plus(Times(C2,p),C3)),Times(C2,c,e,Plus(m,Times(C2,p),C3),x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),LtQ(p,CN1),GtQ(m,C0),Or(LtQ(m,C1),And(ILtQ(Plus(m,Times(C2,p),C3),C0),NeQ(m,C2))),IntQuadraticQ(a,b,c,d,e,m,p,x)))),
IIntegrate(4833,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(C2,a,Plus(p,C1)),-1)),x)),Dist(Power(Times(C2,a,Plus(p,C1)),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Plus(Times(d,Plus(Times(C2,p),C3)),Times(e,Plus(m,Times(C2,p),C3),x)),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1))),x),x)),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),LtQ(p,CN1),GtQ(m,C0),Or(LtQ(m,C1),And(ILtQ(Plus(m,Times(C2,p),C3),C0),NeQ(m,C2))),IntQuadraticQ(a,C0,c,d,e,m,p,x)))),
IIntegrate(4834,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Plus(Times(d,b),Times(CN1,C2,a,e),Times(Plus(Times(C2,c,d),Times(CN1,b,e)),x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x),Dist(Power(Times(Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Simp(Plus(Times(e,Plus(Times(C2,a,e,Plus(m,Negate(C1))),Times(b,d,Plus(Times(C2,p),Negate(m),C4)))),Times(CN1,C2,c,Sqr(d),Plus(Times(C2,p),C3)),Times(e,Plus(Times(b,e),Times(CN1,C2,d,c)),Plus(m,Times(C2,p),C2),x)),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),LtQ(p,CN1),GtQ(m,C1),IntQuadraticQ(a,b,c,d,e,m,p,x)))),
IIntegrate(4835,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Plus(Times(a,e),Times(CN1,c,d,x)),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(C2,a,c,Plus(p,C1)),-1)),x),Dist(Power(Times(Plus(p,C1),CN2,a,c),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Simp(Plus(Times(a,Sqr(e),Plus(m,Negate(C1))),Times(CN1,c,Sqr(d),Plus(Times(C2,p),C3)),Times(CN1,d,c,e,Plus(m,Times(C2,p),C2),x)),x),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1))),x),x)),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),LtQ(p,CN1),GtQ(m,C1),IntQuadraticQ(a,C0,c,d,e,m,p,x)))),
IIntegrate(4836,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Plus(Times(b,c,d),Times(CN1,Sqr(b),e),Times(C2,a,c,e),Times(c,Plus(Times(C2,c,d),Times(CN1,b,e)),x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c)),Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e)))),-1)),x),Dist(Power(Times(Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c)),Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e)))),-1),Int(Times(Power(Plus(d,Times(e,x)),m),Simp(Plus(Times(b,c,d,e,Plus(Times(C2,p),Negate(m),C2)),Times(Sqr(b),Sqr(e),Plus(m,p,C2)),Times(CN1,C2,Sqr(c),Sqr(d),Plus(Times(C2,p),C3)),Times(CN1,C2,a,c,Sqr(e),Plus(m,Times(C2,p),C3)),Times(CN1,c,e,Plus(Times(C2,c,d),Times(CN1,b,e)),Plus(m,Times(C2,p),C4),x)),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),LtQ(p,CN1),IntQuadraticQ(a,b,c,d,e,m,p,x)))),
IIntegrate(4837,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Plus(Times(a,e),Times(c,d,x)),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(C2,a,Plus(p,C1),Plus(Times(c,Sqr(d)),Times(a,Sqr(e)))),-1)),x)),Dist(Power(Times(C2,a,Plus(p,C1),Plus(Times(c,Sqr(d)),Times(a,Sqr(e)))),-1),Int(Times(Power(Plus(d,Times(e,x)),m),Simp(Plus(Times(c,Sqr(d),Plus(Times(C2,p),C3)),Times(a,Sqr(e),Plus(m,Times(C2,p),C3)),Times(c,e,d,Plus(m,Times(C2,p),C4),x)),x),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1))),x),x)),And(FreeQ(List(a,c,d,e,m),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),LtQ(p,CN1),IntQuadraticQ(a,C0,c,d,e,m,p,x)))),
IIntegrate(4838,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(c,Plus(m,Times(C2,p),C1)),-1)),x),Dist(Power(Times(c,Plus(m,Times(C2,p),C1)),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Simp(Plus(Times(c,Sqr(d),Plus(m,Times(C2,p),C1)),Times(CN1,e,Plus(Times(a,e,Plus(m,Negate(C1))),Times(b,d,Plus(p,C1)))),Times(e,Plus(Times(C2,c,d),Times(CN1,b,e)),Plus(m,p),x)),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,m,p),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),If(RationalQ(m),GtQ(m,C1),SumSimplerQ(m,CN2)),NeQ(Plus(m,Times(C2,p),C1),C0),IntQuadraticQ(a,b,c,d,e,m,p,x)))),
IIntegrate(4839,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(c,Plus(m,Times(C2,p),C1)),-1)),x),Dist(Power(Times(c,Plus(m,Times(C2,p),C1)),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Simp(Plus(Times(c,Sqr(d),Plus(m,Times(C2,p),C1)),Times(CN1,a,Sqr(e),Plus(m,Negate(C1))),Times(C2,c,d,e,Plus(m,p),x)),x),Power(Plus(a,Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,c,d,e,m,p),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),If(RationalQ(m),GtQ(m,C1),SumSimplerQ(m,CN2)),NeQ(Plus(m,Times(C2,p),C1),C0),IntQuadraticQ(a,C0,c,d,e,m,p,x)))),
IIntegrate(4840,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(Plus(m,C1),Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e)))),-1)),x),Dist(Power(Times(Plus(m,C1),Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e)))),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Simp(Plus(Times(c,d,Plus(m,C1)),Times(CN1,b,e,Plus(m,p,C2)),Times(CN1,c,e,Plus(m,Times(C2,p),C3),x)),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,m,p),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),NeQ(m,CN1),Or(And(LtQ(m,CN1),IntQuadraticQ(a,b,c,d,e,m,p,x)),And(SumSimplerQ(m,C1),IntegerQ(p)),ILtQ(Simplify(Plus(m,Times(C2,p),C3)),C0))))),
IIntegrate(4841,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(Plus(m,C1),Plus(Times(c,Sqr(d)),Times(a,Sqr(e)))),-1)),x),Dist(Times(c,Power(Times(Plus(m,C1),Plus(Times(c,Sqr(d)),Times(a,Sqr(e)))),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Simp(Plus(Times(d,Plus(m,C1)),Times(CN1,e,Plus(m,Times(C2,p),C3),x)),x),Power(Plus(a,Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,c,d,e,m,p),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),NeQ(m,CN1),Or(And(LtQ(m,CN1),IntQuadraticQ(a,C0,c,d,e,m,p,x)),And(SumSimplerQ(m,C1),IntegerQ(p)),ILtQ(Simplify(Plus(m,Times(C2,p),C3)),C0))))),
IIntegrate(4842,Int(Power(Times(Plus(d_,Times(e_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),C1D4)),-1),x_Symbol),
    Condition(Plus(Dist(d,Int(Power(Times(Plus(Sqr(d),Times(CN1,Sqr(e),Sqr(x))),Power(Plus(a,Times(c,Sqr(x))),C1D4)),-1),x),x),Negate(Dist(e,Int(Times(x,Power(Times(Plus(Sqr(d),Times(CN1,Sqr(e),Sqr(x))),Power(Plus(a,Times(c,Sqr(x))),C1D4)),-1)),x),x))),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0)))),
IIntegrate(4843,Int(Power(Times(Plus(d_,Times(e_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),QQ(3L,4L))),-1),x_Symbol),
    Condition(Plus(Dist(d,Int(Power(Times(Plus(Sqr(d),Times(CN1,Sqr(e),Sqr(x))),Power(Plus(a,Times(c,Sqr(x))),QQ(3L,4L))),-1),x),x),Negate(Dist(e,Int(Times(x,Power(Times(Plus(Sqr(d),Times(CN1,Sqr(e),Sqr(x))),Power(Plus(a,Times(c,Sqr(x))),QQ(3L,4L))),-1)),x),x))),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0)))),
IIntegrate(4844,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Power(Power(Times(CN4,c,Power(Plus(Sqr(b),Times(CN1,C4,a,c)),-1)),p),-1),Subst(Int(Times(Power(Simp(Plus(C1,Times(CN1,Sqr(x),Power(Plus(Sqr(b),Times(CN1,C4,a,c)),-1))),x),p),Power(Simp(Plus(Times(C2,c,d),Times(CN1,b,e),Times(e,x)),x),-1)),x),x,Plus(b,Times(C2,c,x))),x),And(FreeQ(List(a,b,c,d,e,p),x),GtQ(Plus(Times(C4,a),Times(CN1,Sqr(b),Power(c,-1))),C0),IntegerQ(Times(C4,p))))),
IIntegrate(4845,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Power(Power(Times(CN1,c,Plus(a,Times(b,x),Times(c,Sqr(x))),Power(Plus(Sqr(b),Times(CN1,C4,a,c)),-1)),p),-1)),Int(Times(Power(Plus(Times(CN1,a,c,Power(Plus(Sqr(b),Times(CN1,C4,a,c)),-1)),Times(CN1,b,c,x,Power(Plus(Sqr(b),Times(CN1,C4,a,c)),-1)),Times(CN1,Sqr(c),Sqr(x),Power(Plus(Sqr(b),Times(CN1,C4,a,c)),-1))),p),Power(Plus(d,Times(e,x)),-1)),x),x),And(FreeQ(List(a,b,c,d,e,p),x),Not(GtQ(Plus(Times(C4,a),Times(CN1,Sqr(b),Power(c,-1))),C0)),IntegerQ(Times(C4,p))))),
IIntegrate(4846,Int(Power(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),C1D3)),-1),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(C3,c,Sqr(e),Plus(Times(C2,c,d),Times(CN1,b,e))),C3))),Plus(Negate(Simp(Times(CSqrt3,c,e,ArcTan(Plus(C1DSqrt3,Times(C2,Plus(Times(c,d),Times(CN1,b,e),Times(CN1,c,e,x)),Power(Times(CSqrt3,q,Power(Plus(a,Times(b,x),Times(c,Sqr(x))),C1D3)),-1)))),Power(q,-2)),x)),Negate(Simp(Times(C3,c,e,Log(Plus(d,Times(e,x))),Power(Times(C2,Sqr(q)),-1)),x)),Simp(Times(C3,c,e,Log(Plus(Times(c,d),Times(CN1,b,e),Times(CN1,c,e,x),Times(CN1,q,Power(Plus(a,Times(b,x),Times(c,Sqr(x))),C1D3)))),Power(Times(C2,Sqr(q)),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Times(CN1,b,c,d,e),Times(Sqr(b),Sqr(e)),Times(CN1,C3,a,c,Sqr(e))),C0),PosQ(Times(c,Sqr(e),Plus(Times(C2,c,d),Times(CN1,b,e)))))))
  );
}