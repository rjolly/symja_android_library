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
public class IntRules36 { 
  public static IAST RULES = List( 
IIntegrate(5876,Int(Times($p("§p2"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(f,Coeff($s("§p2"),x,C0)),Set(g,Coeff($s("§p2"),x,C1)),Set(h,Coeff($s("§p2"),x,C2))),Condition(Simp(Times(h,Power(Times(c,x),Plus(m,C1)),Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1)),Power(Times(b,c,Plus(m,Times(C2,p),C3)),-1)),x),And(EqQ(g,C0),EqQ(Plus(Times(a,h,Plus(m,C1)),Times(CN1,b,f,Plus(m,Times(C2,p),C3))),C0)))),And(FreeQ(List(a,b,c,m,p),x),PolyQ($s("§p2"),x,C2),NeQ(m,CN1)))),
IIntegrate(5877,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(c,x),m),$s("§pq"),Power(Plus(a,Times(b,Sqr(x))),p)),x),x),And(FreeQ(List(a,b,c,m),x),PolyQ($s("§pq"),x),IGtQ(p,CN2)))),
IIntegrate(5878,Int(Times($p("§pq"),Power(x_,m_),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(ASymbol,Coeff($s("§pq"),x,C0)),Set($s("Q"),PolynomialQuotient(Plus($s("§pq"),Negate(Coeff($s("§pq"),x,C0))),Sqr(x),x))),Plus(Simp(Times(ASymbol,Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1)),Power(Times(a,Plus(m,C1)),-1)),x),Dist(Power(Times(a,Plus(m,C1)),-1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(a,Times(b,Sqr(x))),p),Plus(Times(a,Plus(m,C1),$s("Q")),Times(CN1,ASymbol,b,Plus(m,Times(C2,Plus(p,C1)),C1)))),x),x))),And(FreeQ(List(a,b),x),PolyQ($s("§pq"),Sqr(x)),IntegerQ(Times(C1D2,m)),ILtQ(Plus(Times(C1D2,Plus(m,C1)),p),C0),LtQ(Plus(m,Expon($s("§pq"),x),Times(C2,p),C1),C0)))),
IIntegrate(5879,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set($s("Q"),PolynomialQuotient($s("§pq"),Plus(a,Times(b,Sqr(x))),x)),Set(f,Coeff(PolynomialRemainder($s("§pq"),Plus(a,Times(b,Sqr(x))),x),x,C0)),Set(g,Coeff(PolynomialRemainder($s("§pq"),Plus(a,Times(b,Sqr(x))),x),x,C1))),Plus(Simp(Times(Power(Times(c,x),m),Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1)),Plus(Times(a,g),Times(CN1,b,f,x)),Power(Times(C2,a,b,Plus(p,C1)),-1)),x),Dist(Times(c,Power(Times(C2,a,b,Plus(p,C1)),-1)),Int(Times(Power(Times(c,x),Plus(m,Negate(C1))),Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1)),ExpandToSum(Plus(Times(C2,a,b,Plus(p,C1),x,$s("Q")),Times(CN1,a,g,m),Times(b,f,Plus(m,Times(C2,p),C3),x)),x)),x),x))),And(FreeQ(List(a,b,c),x),PolyQ($s("§pq"),x),LtQ(p,CN1),GtQ(m,C0)))),
IIntegrate(5880,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set($s("Q"),PolynomialQuotient(Times(Power(Times(c,x),m),$s("§pq")),Plus(a,Times(b,Sqr(x))),x)),Set(f,Coeff(PolynomialRemainder(Times(Power(Times(c,x),m),$s("§pq")),Plus(a,Times(b,Sqr(x))),x),x,C0)),Set(g,Coeff(PolynomialRemainder(Times(Power(Times(c,x),m),$s("§pq")),Plus(a,Times(b,Sqr(x))),x),x,C1))),Plus(Simp(Times(Plus(Times(a,g),Times(CN1,b,f,x)),Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1)),Power(Times(C2,a,b,Plus(p,C1)),-1)),x),Dist(Power(Times(C2,a,Plus(p,C1)),-1),Int(Times(Power(Times(c,x),m),Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1)),ExpandToSum(Plus(Times(C2,a,Plus(p,C1),$s("Q"),Power(Power(Times(c,x),m),-1)),Times(f,Plus(Times(C2,p),C3),Power(Power(Times(c,x),m),-1))),x)),x),x))),And(FreeQ(List(a,b,c),x),PolyQ($s("§pq"),x),LtQ(p,CN1),ILtQ(m,C0)))),
IIntegrate(5881,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set($s("Q"),PolynomialQuotient($s("§pq"),Plus(a,Times(b,Sqr(x))),x)),Set(f,Coeff(PolynomialRemainder($s("§pq"),Plus(a,Times(b,Sqr(x))),x),x,C0)),Set(g,Coeff(PolynomialRemainder($s("§pq"),Plus(a,Times(b,Sqr(x))),x),x,C1))),Plus(Negate(Simp(Times(Power(Times(c,x),Plus(m,C1)),Plus(f,Times(g,x)),Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1)),Power(Times(C2,a,c,Plus(p,C1)),-1)),x)),Dist(Power(Times(C2,a,Plus(p,C1)),-1),Int(Times(Power(Times(c,x),m),Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1)),ExpandToSum(Plus(Times(C2,a,Plus(p,C1),$s("Q")),Times(f,Plus(m,Times(C2,p),C3)),Times(g,Plus(m,Times(C2,p),C4),x)),x)),x),x))),And(FreeQ(List(a,b,c,m),x),PolyQ($s("§pq"),x),LtQ(p,CN1),Not(GtQ(m,C0))))),
IIntegrate(5882,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set($s("Q"),PolynomialQuotient($s("§pq"),Times(c,x),x)),Set($s("R"),PolynomialRemainder($s("§pq"),Times(c,x),x))),Plus(Simp(Times($s("R"),Power(Times(c,x),Plus(m,C1)),Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1)),Power(Times(a,c,Plus(m,C1)),-1)),x),Dist(Power(Times(a,c,Plus(m,C1)),-1),Int(Times(Power(Times(c,x),Plus(m,C1)),Power(Plus(a,Times(b,Sqr(x))),p),ExpandToSum(Plus(Times(a,c,Plus(m,C1),$s("Q")),Times(CN1,b,$s("R"),Plus(m,Times(C2,p),C3),x)),x)),x),x))),And(FreeQ(List(a,b,c,p),x),PolyQ($s("§pq"),x),LtQ(m,CN1),Or(IntegerQ(Times(C2,p)),NeQ(Expon($s("§pq"),x),C1))))),
IIntegrate(5883,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x))),Condition(Plus(Dist(Times(Coeff($s("§pq"),x,q),Power(Power(c,q),-1)),Int(Times(Power(Times(c,x),Plus(m,q)),Power(Plus(a,Times(b,Sqr(x))),p)),x),x),Dist(Power(Power(c,q),-1),Int(Times(Power(Times(c,x),m),Power(Plus(a,Times(b,Sqr(x))),p),ExpandToSum(Plus(Times(Power(c,q),$s("§pq")),Times(CN1,Coeff($s("§pq"),x,q),Power(Times(c,x),q))),x)),x),x)),Or(EqQ(q,C1),EqQ(Plus(m,q,Times(C2,p),C1),C0)))),And(FreeQ(List(a,b,c,m,p),x),PolyQ($s("§pq"),x),Not(And(IGtQ(m,C0),ILtQ(Plus(p,C1D2),C0)))))),
IIntegrate(5884,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x)),Set(f,Coeff($s("§pq"),x,Expon($s("§pq"),x)))),Condition(Plus(Simp(Times(f,Power(Times(c,x),Plus(m,q,Negate(C1))),Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1)),Power(Times(b,Power(c,Plus(q,Negate(C1))),Plus(m,q,Times(C2,p),C1)),-1)),x),Dist(Power(Times(b,Plus(m,q,Times(C2,p),C1)),-1),Int(Times(Power(Times(c,x),m),Power(Plus(a,Times(b,Sqr(x))),p),ExpandToSum(Plus(Times(b,Plus(m,q,Times(C2,p),C1),$s("§pq")),Times(CN1,b,f,Plus(m,q,Times(C2,p),C1),Power(x,q)),Times(CN1,a,f,Plus(m,q,Negate(C1)),Power(x,Plus(q,Negate(C2))))),x)),x),x)),And(GtQ(q,C1),NeQ(Plus(m,q,Times(C2,p),C1),C0)))),And(FreeQ(List(a,b,c,m,p),x),PolyQ($s("§pq"),x),Or(Not(IGtQ(m,C0)),IGtQ(Plus(p,C1D2),CN1))))),
IIntegrate(5885,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§pq"),Power(Plus(a,Times(b,Sqr(x))),p)),x),x),And(FreeQ(List(a,b),x),PolyQ($s("§pq"),x),IGtQ(p,CN2)))),
IIntegrate(5886,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(Times(x,PolynomialQuotient($s("§pq"),x,x),Power(Plus(a,Times(b,Sqr(x))),p)),x),And(FreeQ(List(a,b,p),x),PolyQ($s("§pq"),x),EqQ(Coeff($s("§pq"),x,C0),C0),Not(MatchQ($s("§pq"),Condition(Times(Power(x,m_DEFAULT),u_DEFAULT),IntegerQ(m))))))),
IIntegrate(5887,Int(Times($p("§px"),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(PolynomialQuotient($s("§px"),Plus(a,Times(b,Sqr(x))),x),Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1))),x),And(FreeQ(List(a,b,p),x),PolyQ($s("§px"),x),EqQ(PolynomialRemainder($s("§px"),Plus(a,Times(b,Sqr(x))),x),C0)))),
IIntegrate(5888,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(ASymbol,Coeff($s("§pq"),x,C0)),Set($s("Q"),PolynomialQuotient(Plus($s("§pq"),Negate(Coeff($s("§pq"),x,C0))),Sqr(x),x))),Plus(Simp(Times(ASymbol,x,Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1)),Power(a,-1)),x),Dist(Power(a,-1),Int(Times(Sqr(x),Power(Plus(a,Times(b,Sqr(x))),p),Plus(Times(a,$s("Q")),Times(CN1,ASymbol,b,Plus(Times(C2,p),C3)))),x),x))),And(FreeQ(List(a,b),x),PolyQ($s("§pq"),Sqr(x)),ILtQ(Plus(p,C1D2),C0),LtQ(Plus(Expon($s("§pq"),x),Times(C2,p),C1),C0)))),
IIntegrate(5889,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set($s("Q"),PolynomialQuotient($s("§pq"),Plus(a,Times(b,Sqr(x))),x)),Set(f,Coeff(PolynomialRemainder($s("§pq"),Plus(a,Times(b,Sqr(x))),x),x,C0)),Set(g,Coeff(PolynomialRemainder($s("§pq"),Plus(a,Times(b,Sqr(x))),x),x,C1))),Plus(Simp(Times(Plus(Times(a,g),Times(CN1,b,f,x)),Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1)),Power(Times(C2,a,b,Plus(p,C1)),-1)),x),Dist(Power(Times(C2,a,Plus(p,C1)),-1),Int(Times(Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1)),ExpandToSum(Plus(Times(C2,a,Plus(p,C1),$s("Q")),Times(f,Plus(Times(C2,p),C3))),x)),x),x))),And(FreeQ(List(a,b),x),PolyQ($s("§pq"),x),LtQ(p,CN1)))),
IIntegrate(5890,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x)),Set(e,Coeff($s("§pq"),x,Expon($s("§pq"),x)))),Plus(Simp(Times(e,Power(x,Plus(q,Negate(C1))),Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1)),Power(Times(b,Plus(q,Times(C2,p),C1)),-1)),x),Dist(Power(Times(b,Plus(q,Times(C2,p),C1)),-1),Int(Times(Power(Plus(a,Times(b,Sqr(x))),p),ExpandToSum(Plus(Times(b,Plus(q,Times(C2,p),C1),$s("§pq")),Times(CN1,a,e,Plus(q,Negate(C1)),Power(x,Plus(q,Negate(C2)))),Times(CN1,b,e,Plus(q,Times(C2,p),C1),Power(x,q))),x)),x),x))),And(FreeQ(List(a,b,p),x),PolyQ($s("§pq"),x),Not(LeQ(p,CN1))))),
IIntegrate(5891,Int(Times(Power(x_,m_DEFAULT),Plus(e_,Times(h_DEFAULT,Power(x_,n_DEFAULT)),Times(f_DEFAULT,Power(x_,q_DEFAULT)),Times(g_DEFAULT,Power(x_,r_DEFAULT))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,n_DEFAULT))),QQ(-3L,2L))),x_Symbol),
    Condition(Negate(Simp(Times(Plus(Times(C2,a,g),Times(C4,a,h,Power(x,Times(C1D4,n))),Times(CN1,C2,c,f,Power(x,Times(C1D2,n)))),Power(Times(a,c,n,Sqrt(Plus(a,Times(c,Power(x,n))))),-1)),x)),And(FreeQ(List(a,c,e,f,g,h,m,n),x),EqQ(q,Times(C1D4,n)),EqQ(r,Times(C1D4,C3,n)),EqQ(Plus(Times(C4,m),Negate(n),C4),C0),EqQ(Plus(Times(c,e),Times(a,h)),C0)))),
IIntegrate(5892,Int(Times(Plus(e_,Times(h_DEFAULT,Power(x_,n_DEFAULT)),Times(f_DEFAULT,Power(x_,q_DEFAULT)),Times(g_DEFAULT,Power(x_,r_DEFAULT))),Power(Times(d_,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,n_DEFAULT))),QQ(-3L,2L))),x_Symbol),
    Condition(Dist(Times(Power(Times(d,x),m),Power(Power(x,m),-1)),Int(Times(Power(x,m),Plus(e,Times(f,Power(x,Times(C1D4,n))),Times(g,Power(x,Times(C1D4,C3,n))),Times(h,Power(x,n))),Power(Plus(a,Times(c,Power(x,n))),QQ(-3L,2L))),x),x),And(FreeQ(List(a,c,d,e,f,g,h,m,n),x),EqQ(Plus(Times(C4,m),Negate(n),C4),C0),EqQ(q,Times(C1D4,n)),EqQ(r,Times(C1D4,C3,n)),EqQ(Plus(Times(c,e),Times(a,h)),C0)))),
IIntegrate(5893,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,x_)),p_)),x_Symbol),
    Condition(With(List(Set(n,Denominator(p))),Dist(Times(n,Power(b,-1)),Subst(Int(Times(Power(x,Plus(Times(n,p),n,Negate(C1))),Power(Plus(Times(CN1,a,c,Power(b,-1)),Times(c,Power(x,n),Power(b,-1))),m),ReplaceAll($s("§pq"),Rule(x,Plus(Times(CN1,a,Power(b,-1)),Times(Power(x,n),Power(b,-1)))))),x),x,Power(Plus(a,Times(b,x)),Power(n,-1))),x)),And(FreeQ(List(a,b,c,m),x),PolyQ($s("§pq"),x),FractionQ(p),ILtQ(m,CN1)))),
IIntegrate(5894,Int(Times($p("§pq"),Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Plus(m,C1),-1),Subst(Int(Times(SubstFor(Power(x,Plus(m,C1)),$s("§pq"),x),Power(Plus(a,Times(b,Power(x,Simplify(Times(n,Power(Plus(m,C1),-1)))))),p)),x),x,Power(x,Plus(m,C1))),x),And(FreeQ(List(a,b,m,n,p),x),NeQ(m,CN1),IGtQ(Simplify(Times(n,Power(Plus(m,C1),-1))),C0),PolyQ($s("§pq"),Power(x,Plus(m,C1)))))),
IIntegrate(5895,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(c,x),m),$s("§pq"),Power(Plus(a,Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,m,n),x),PolyQ($s("§pq"),x),Or(IGtQ(p,C0),EqQ(n,C1))))),
IIntegrate(5896,Int(Times($p("§pq"),Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),SubstFor(Power(x,n),$s("§pq"),x),Power(Plus(a,Times(b,x)),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,m,n,p),x),PolyQ($s("§pq"),Power(x,n)),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(5897,Int(Times($p("§pq"),Power(Times(c_,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(m)),Power(Times(c,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),$s("§pq"),Power(Plus(a,Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,m,n,p),x),PolyQ($s("§pq"),Power(x,n)),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(5898,Int(Times($p("§pq"),Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times($s("§pq"),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),-1)),x),Negate(Dist(Power(Times(b,n,Plus(p,C1)),-1),Int(Times(D($s("§pq"),x),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,m,n),x),PolyQ($s("§pq"),x),EqQ(Plus(m,Negate(n),C1),C0),LtQ(p,CN1)))),
IIntegrate(5899,Int(Times($p("§pq"),Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Dist(Power(d,-1),Int(Times(Power(Times(d,x),Plus(m,C1)),PolynomialQuotient($s("§pq"),x,x),Power(Plus(a,Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,d,m,n,p),x),PolyQ($s("§pq"),x),EqQ(Coeff($s("§pq"),x,C0),C0)))),
IIntegrate(5900,Int(Times($p("§pq"),Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Module(List(Set(u,IntHide(Times(Power(x,m),$s("§pq")),x))),Plus(Simp(Times(u,Power(Plus(a,Times(b,Power(x,n))),p)),x),Negate(Dist(Times(b,n,p),Int(Times(Power(x,Plus(m,n)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,Negate(C1))),ExpandToSum(Times(u,Power(Power(x,Plus(m,C1)),-1)),x)),x),x)))),And(FreeQ(List(a,b),x),PolyQ($s("§pq"),x),IGtQ(n,C0),GtQ(p,C0),LtQ(Plus(m,Expon($s("§pq"),x),C1),C0)))),
IIntegrate(5901,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Module(List(Set(q,Expon($s("§pq"),x)),i),Plus(Simp(Times(Power(Times(c,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Sum(Times(Coeff($s("§pq"),x,i),Power(x,Plus(i,C1)),Power(Plus(m,Times(n,p),i,C1),-1)),List(i,C0,q))),x),Dist(Times(a,n,p),Int(Times(Power(Times(c,x),m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,Negate(C1))),Sum(Times(Coeff($s("§pq"),x,i),Power(x,i),Power(Plus(m,Times(n,p),i,C1),-1)),List(i,C0,q))),x),x))),And(FreeQ(List(a,b,c,m),x),PolyQ($s("§pq"),x),IGtQ(Times(C1D2,Plus(n,Negate(C1))),C0),GtQ(p,C0)))),
IIntegrate(5902,Int(Times($p("§p4"),Sqr(x_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,4))),QQ(-3L,2L))),x_Symbol),
    Condition(With(List(Set(e,Coeff($s("§p4"),x,C0)),Set(f,Coeff($s("§p4"),x,C1)),Set(h,Coeff($s("§p4"),x,C4))),Condition(Negate(Simp(Times(Plus(f,Times(CN1,C2,h,Power(x,3))),Power(Times(C2,b,Sqrt(Plus(a,Times(b,Power(x,4))))),-1)),x)),EqQ(Plus(Times(b,e),Times(CN1,C3,a,h)),C0))),And(FreeQ(List(a,b),x),PolyQ($s("§p4"),x,C4),EqQ(Coeff($s("§p4"),x,C2),C0),EqQ(Coeff($s("§p4"),x,C3),C0)))),
IIntegrate(5903,Int(Times($p("§pq"),Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(With(List(Set(q,Plus(m,Expon($s("§pq"),x)))),Condition(Module(List(Set($s("Q"),PolynomialQuotient(Times(Power(b,Plus(Floor(Times(Plus(q,Negate(C1)),Power(n,-1))),C1)),Power(x,m),$s("§pq")),Plus(a,Times(b,Power(x,n))),x)),Set($s("R"),PolynomialRemainder(Times(Power(b,Plus(Floor(Times(Plus(q,Negate(C1)),Power(n,-1))),C1)),Power(x,m),$s("§pq")),Plus(a,Times(b,Power(x,n))),x))),Plus(Dist(Power(Times(a,n,Plus(p,C1),Power(b,Plus(Floor(Times(Plus(q,Negate(C1)),Power(n,-1))),C1))),-1),Int(Times(Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),ExpandToSum(Plus(Times(a,n,Plus(p,C1),$s("Q")),Times(n,Plus(p,C1),$s("R")),D(Times(x,$s("R")),x)),x)),x),x),Negate(Simp(Times(x,$s("R"),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,n,Plus(p,C1),Power(b,Plus(Floor(Times(Plus(q,Negate(C1)),Power(n,-1))),C1))),-1)),x)))),GeQ(q,n))),And(FreeQ(List(a,b),x),PolyQ($s("§pq"),x),IGtQ(n,C0),LtQ(p,CN1),IGtQ(m,C0)))),
IIntegrate(5904,Int(Times($p("§pq"),Power(x_,m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x))),Module(List(Set($s("Q"),PolynomialQuotient(Times(a,Power(b,Plus(Floor(Times(Plus(q,Negate(C1)),Power(n,-1))),C1)),Power(x,m),$s("§pq")),Plus(a,Times(b,Power(x,n))),x)),Set($s("R"),PolynomialRemainder(Times(a,Power(b,Plus(Floor(Times(Plus(q,Negate(C1)),Power(n,-1))),C1)),Power(x,m),$s("§pq")),Plus(a,Times(b,Power(x,n))),x)),i),Plus(Dist(Power(Times(a,n,Plus(p,C1),Power(b,Plus(Floor(Times(Plus(q,Negate(C1)),Power(n,-1))),C1))),-1),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),ExpandToSum(Plus(Times(n,Plus(p,C1),$s("Q"),Power(Power(x,m),-1)),Sum(Times(Plus(Times(n,Plus(p,C1)),i,C1),Coeff($s("R"),x,i),Power(x,Plus(i,Negate(m))),Power(a,-1)),List(i,C0,Plus(n,Negate(C1))))),x)),x),x),Negate(Simp(Times(x,$s("R"),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(Sqr(a),n,Plus(p,C1),Power(b,Plus(Floor(Times(Plus(q,Negate(C1)),Power(n,-1))),C1))),-1)),x))))),And(FreeQ(List(a,b),x),PolyQ($s("§pq"),x),IGtQ(n,C0),LtQ(p,CN1),ILtQ(m,C0)))),
IIntegrate(5905,Int(Times($p("§pq"),Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(g,GCD(Plus(m,C1),n))),Condition(Dist(Power(g,-1),Subst(Int(Times(Power(x,Plus(Times(Plus(m,C1),Power(g,-1)),Negate(C1))),ReplaceAll($s("§pq"),Rule(x,Power(x,Power(g,-1)))),Power(Plus(a,Times(b,Power(x,Times(n,Power(g,-1))))),p)),x),x,Power(x,g)),x),Unequal(g,C1))),And(FreeQ(List(a,b,p),x),PolyQ($s("§pq"),Power(x,n)),IGtQ(n,C0),IntegerQ(m)))),
IIntegrate(5906,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),-1)),x_Symbol),
    Condition(With(List(Set(v,Sum(Times(Power(Times(c,x),Plus(m,$s("ii"))),Plus(Coeff($s("§pq"),x,$s("ii")),Times(Coeff($s("§pq"),x,Plus(Times(C1D2,n),$s("ii"))),Power(x,Times(C1D2,n)))),Power(Times(Power(c,$s("ii")),Plus(a,Times(b,Power(x,n)))),-1)),List($s("ii"),C0,Plus(Times(C1D2,n),Negate(C1)))))),Condition(Int(v,x),SumQ(v))),And(FreeQ(List(a,b,c,m),x),PolyQ($s("§pq"),x),IGtQ(Times(C1D2,n),C0),Less(Expon($s("§pq"),x),n)))),
IIntegrate(5907,Int(Times($p("§pq"),Power(Times(x_,Sqrt(Plus(a_,Times(b_DEFAULT,Power(x_,n_))))),-1)),x_Symbol),
    Condition(Plus(Dist(Coeff($s("§pq"),x,C0),Int(Power(Times(x,Sqrt(Plus(a,Times(b,Power(x,n))))),-1),x),x),Int(Times(ExpandToSum(Times(Plus($s("§pq"),Negate(Coeff($s("§pq"),x,C0))),Power(x,-1)),x),Power(Plus(a,Times(b,Power(x,n))),CN1D2)),x)),And(FreeQ(List(a,b),x),PolyQ($s("§pq"),x),IGtQ(n,C0),NeQ(Coeff($s("§pq"),x,C0),C0)))),
IIntegrate(5908,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Module(List(Set(q,Expon($s("§pq"),x)),j,k),Int(Sum(Times(Power(Times(c,x),Plus(m,j)),Sum(Times(Coeff($s("§pq"),x,Plus(j,Times(C1D2,k,n))),Power(x,Times(C1D2,k,n))),List(k,C0,Plus(Times(C2,Plus(q,Negate(j)),Power(n,-1)),C1))),Power(Plus(a,Times(b,Power(x,n))),p),Power(Power(c,j),-1)),List(j,C0,Plus(Times(C1D2,n),Negate(C1)))),x)),And(FreeQ(List(a,b,c,m,p),x),PolyQ($s("§pq"),x),IGtQ(Times(C1D2,n),C0),Not(PolyQ($s("§pq"),Power(x,Times(C1D2,n))))))),
IIntegrate(5909,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(c,x),m),$s("§pq"),Power(Plus(a,Times(b,Power(x,n))),-1)),x),x),And(FreeQ(List(a,b,c,m),x),PolyQ($s("§pq"),x),IntegerQ(n),Not(IGtQ(m,C0))))),
IIntegrate(5910,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set($s("§pq0"),Coeff($s("§pq"),x,C0))),Condition(Plus(Simp(Times($s("§pq0"),Power(Times(c,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,c,Plus(m,C1)),-1)),x),Dist(Power(Times(C2,a,c,Plus(m,C1)),-1),Int(Times(Power(Times(c,x),Plus(m,C1)),ExpandToSum(Plus(Times(C2,a,Plus(m,C1),Plus($s("§pq"),Negate($s("§pq0"))),Power(x,-1)),Times(CN1,C2,b,$s("§pq0"),Plus(m,Times(n,Plus(p,C1)),C1),Power(x,Plus(n,Negate(C1))))),x),Power(Plus(a,Times(b,Power(x,n))),p)),x),x)),NeQ($s("§pq0"),C0))),And(FreeQ(List(a,b,c,p),x),PolyQ($s("§pq"),x),IGtQ(n,C0),LtQ(m,CN1),LeQ(Plus(n,Negate(C1)),Expon($s("§pq"),x))))),
IIntegrate(5911,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x))),Condition(With(List(Set($s("§pqq"),Coeff($s("§pq"),x,q))),Plus(Dist(Power(Times(b,Plus(m,q,Times(n,p),C1)),-1),Int(Times(Power(Times(c,x),m),ExpandToSum(Plus(Times(b,Plus(m,q,Times(n,p),C1),Plus($s("§pq"),Times(CN1,$s("§pqq"),Power(x,q)))),Times(CN1,a,$s("§pqq"),Plus(m,q,Negate(n),C1),Power(x,Plus(q,Negate(n))))),x),Power(Plus(a,Times(b,Power(x,n))),p)),x),x),Simp(Times($s("§pqq"),Power(Times(c,x),Plus(m,q,Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(b,Power(c,Plus(q,Negate(n),C1)),Plus(m,q,Times(n,p),C1)),-1)),x))),And(NeQ(Plus(m,q,Times(n,p),C1),C0),GreaterEqual(Plus(q,Negate(n)),C0),Or(IntegerQ(Times(C2,p)),IntegerQ(Plus(p,Times(Plus(q,C1),Power(Times(C2,n),-1)))))))),And(FreeQ(List(a,b,c,m,p),x),PolyQ($s("§pq"),x),IGtQ(n,C0)))),
IIntegrate(5912,Int(Times($p("§pq"),Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x))),Negate(Subst(Int(Times(ExpandToSum(Times(Power(x,q),ReplaceAll($s("§pq"),Rule(x,Power(x,-1)))),x),Power(Plus(a,Times(b,Power(Power(x,n),-1))),p),Power(Power(x,Plus(m,q,C2)),-1)),x),x,Power(x,-1)))),And(FreeQ(List(a,b,p),x),PolyQ($s("§pq"),x),ILtQ(n,C0),IntegerQ(m)))),
IIntegrate(5913,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(g,Denominator(m)),Set(q,Expon($s("§pq"),x))),Negate(Dist(Times(g,Power(c,-1)),Subst(Int(Times(ExpandToSum(Times(Power(x,Times(g,q)),ReplaceAll($s("§pq"),Rule(x,Power(Times(c,Power(x,g)),-1)))),x),Power(Plus(a,Times(b,Power(Times(Power(c,n),Power(x,Times(g,n))),-1))),p),Power(Power(x,Plus(Times(g,Plus(m,q,C1)),C1)),-1)),x),x,Power(Power(Times(c,x),Power(g,-1)),-1)),x))),And(FreeQ(List(a,b,c,p),x),PolyQ($s("§pq"),x),ILtQ(n,C0),FractionQ(m)))),
IIntegrate(5914,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x))),Negate(Dist(Times(Power(Times(c,x),m),Power(Power(x,-1),m)),Subst(Int(Times(ExpandToSum(Times(Power(x,q),ReplaceAll($s("§pq"),Rule(x,Power(x,-1)))),x),Power(Plus(a,Times(b,Power(Power(x,n),-1))),p),Power(Power(x,Plus(m,q,C2)),-1)),x),x,Power(x,-1)),x))),And(FreeQ(List(a,b,c,m,p),x),PolyQ($s("§pq"),x),ILtQ(n,C0),Not(RationalQ(m))))),
IIntegrate(5915,Int(Times($p("§pq"),Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(g,Denominator(n))),Dist(g,Subst(Int(Times(Power(x,Plus(Times(g,Plus(m,C1)),Negate(C1))),ReplaceAll($s("§pq"),Rule(x,Power(x,g))),Power(Plus(a,Times(b,Power(x,Times(g,n)))),p)),x),x,Power(x,Power(g,-1))),x)),And(FreeQ(List(a,b,m,p),x),PolyQ($s("§pq"),x),FractionQ(n)))),
IIntegrate(5916,Int(Times($p("§pq"),Power(Times(c_,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(m)),Power(Times(c,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),$s("§pq"),Power(Plus(a,Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,m,p),x),PolyQ($s("§pq"),x),FractionQ(n)))),
IIntegrate(5917,Int(Times($p("§pq"),Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Power(Plus(m,C1),-1),Subst(Int(Times(ReplaceAll(SubstFor(Power(x,n),$s("§pq"),x),Rule(x,Power(x,Simplify(Times(n,Power(Plus(m,C1),-1)))))),Power(Plus(a,Times(b,Power(x,Simplify(Times(n,Power(Plus(m,C1),-1)))))),p)),x),x,Power(x,Plus(m,C1))),x),And(FreeQ(List(a,b,m,n,p),x),PolyQ($s("§pq"),Power(x,n)),IntegerQ(Simplify(Times(n,Power(Plus(m,C1),-1)))),Not(IntegerQ(n))))),
IIntegrate(5918,Int(Times($p("§pq"),Power(Times(c_,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(m)),Power(Times(c,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),$s("§pq"),Power(Plus(a,Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,m,n,p),x),PolyQ($s("§pq"),Power(x,n)),IntegerQ(Simplify(Times(n,Power(Plus(m,C1),-1)))),Not(IntegerQ(n))))),
IIntegrate(5919,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(c,x),m),$s("§pq"),Power(Plus(a,Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,m,n,p),x),Or(PolyQ($s("§pq"),x),PolyQ($s("§pq"),Power(x,n))),Not(IGtQ(m,C0))))),
IIntegrate(5920,Int(Times($p("§pq"),Power(u_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(v_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Dist(Times(Power(u,m),Power(Times(Coeff(v,x,C1),Power(v,m)),-1)),Subst(Int(Times(Power(x,m),SubstFor(v,$s("§pq"),x),Power(Plus(a,Times(b,Power(x,n))),p)),x),x,v),x),And(FreeQ(List(a,b,m,n,p),x),LinearPairQ(u,v,x),PolyQ($s("§pq"),Power(v,n))))),
IIntegrate(5921,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus($p("a1"),Times($p("b1",true),Power(x_,n_DEFAULT))),p_DEFAULT),Power(Plus($p("a2"),Times($p("b2",true),Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Times(c,x),m),$s("§pq"),Power(Plus(Times($s("a1"),$s("a2")),Times($s("b1"),$s("b2"),Power(x,Times(C2,n)))),p)),x),And(FreeQ(List($s("a1"),$s("b1"),$s("a2"),$s("b2"),c,m,n,p),x),PolyQ($s("§pq"),x),EqQ(Plus(Times($s("a2"),$s("b1")),Times($s("a1"),$s("b2"))),C0),Or(IntegerQ(p),And(GtQ($s("a1"),C0),GtQ($s("a2"),C0)))))),
IIntegrate(5922,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus($p("a1"),Times($p("b1",true),Power(x_,n_DEFAULT))),p_DEFAULT),Power(Plus($p("a2"),Times($p("b2",true),Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Plus($s("a1"),Times($s("b1"),Power(x,n))),FracPart(p)),Power(Plus($s("a2"),Times($s("b2"),Power(x,n))),FracPart(p)),Power(Power(Plus(Times($s("a1"),$s("a2")),Times($s("b1"),$s("b2"),Power(x,Times(C2,n)))),FracPart(p)),-1)),Int(Times(Power(Times(c,x),m),$s("§pq"),Power(Plus(Times($s("a1"),$s("a2")),Times($s("b1"),$s("b2"),Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List($s("a1"),$s("b1"),$s("a2"),$s("b2"),c,m,n,p),x),PolyQ($s("§pq"),x),EqQ(Plus(Times($s("a2"),$s("b1")),Times($s("a1"),$s("b2"))),C0),Not(And(EqQ(n,C1),LinearQ($s("§pq"),x)))))),
IIntegrate(5923,Int(Times(Plus(e_,Times(f_DEFAULT,Power(x_,n_DEFAULT)),Times(g_DEFAULT,Power(x_,$p("n2",true)))),Power(Times(h_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Simp(Times(e,Power(Times(h,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(p,C1)),Power(Times(a,c,h,Plus(m,C1)),-1)),x),And(FreeQ(List(a,b,c,d,e,f,g,h,m,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Times(a,c,f,Plus(m,C1)),Times(CN1,e,Plus(Times(b,c),Times(a,d)),Plus(m,Times(n,Plus(p,C1)),C1))),C0),EqQ(Plus(Times(a,c,g,Plus(m,C1)),Times(CN1,b,d,e,Plus(m,Times(C2,n,Plus(p,C1)),C1))),C0),NeQ(m,CN1)))),
IIntegrate(5924,Int(Times(Plus(e_,Times(g_DEFAULT,Power(x_,$p("n2",true)))),Power(Times(h_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Simp(Times(e,Power(Times(h,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(p,C1)),Power(Times(a,c,h,Plus(m,C1)),-1)),x),And(FreeQ(List(a,b,c,d,e,g,h,m,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(m,Times(n,Plus(p,C1)),C1),C0),EqQ(Plus(Times(a,c,g,Plus(m,C1)),Times(CN1,b,d,e,Plus(m,Times(C2,n,Plus(p,C1)),C1))),C0),NeQ(m,CN1)))),
IIntegrate(5925,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§pq"),Power(Plus(a,Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,n),x),PolyQ($s("§pq"),x),Or(IGtQ(p,C0),EqQ(n,C1)))))
  );
}
