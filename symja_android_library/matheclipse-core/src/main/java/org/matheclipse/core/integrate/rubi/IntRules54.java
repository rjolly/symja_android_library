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
public class IntRules54 { 
  public static IAST RULES = List( 
IIntegrate(6743,Int(Times(Sqrt(Times(g_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Negate(Sqr(a)),Sqr(b)),C2))),Plus(Dist(Times(a,g,Power(Times(C2,b),-1)),Int(Power(Times(Sqrt(Times(g,Cos(Plus(e,Times(f,x))))),Plus(q,Times(b,Cos(Plus(e,Times(f,x)))))),-1),x),x),Negate(Dist(Times(a,g,Power(Times(C2,b),-1)),Int(Power(Times(Sqrt(Times(g,Cos(Plus(e,Times(f,x))))),Plus(q,Times(CN1,b,Cos(Plus(e,Times(f,x)))))),-1),x),x)),Dist(Times(b,g,Power(f,-1)),Subst(Int(Times(Sqrt(x),Power(Plus(Times(Sqr(g),Plus(Sqr(a),Negate(Sqr(b)))),Times(Sqr(b),Sqr(x))),-1)),x),x,Times(g,Cos(Plus(e,Times(f,x))))),x))),And(FreeQ(List(a,b,e,f,g),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(6744,Int(Power(Times(Sqrt(Times(g_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Negate(Sqr(a)),Sqr(b)),C2))),Plus(Negate(Dist(Times(a,Power(Times(C2,q),-1)),Int(Power(Times(Sqrt(Times(g,Cos(Plus(e,Times(f,x))))),Plus(q,Times(b,Cos(Plus(e,Times(f,x)))))),-1),x),x)),Dist(Times(b,g,Power(f,-1)),Subst(Int(Power(Times(Sqrt(x),Plus(Times(Sqr(g),Plus(Sqr(a),Negate(Sqr(b)))),Times(Sqr(b),Sqr(x)))),-1),x),x,Times(g,Cos(Plus(e,Times(f,x))))),x),Negate(Dist(Times(a,Power(Times(C2,q),-1)),Int(Power(Times(Sqrt(Times(g,Cos(Plus(e,Times(f,x))))),Plus(q,Times(CN1,b,Cos(Plus(e,Times(f,x)))))),-1),x),x)))),And(FreeQ(List(a,b,e,f,g),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(6745,Int(Times(Power(Times(g_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Simp(Times(g,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,Negate(C1))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),AppellF1(Plus(Negate(p),Negate(m)),Times(C1D2,Plus(C1,Negate(p))),Times(C1D2,Plus(C1,Negate(p))),Plus(C1,Negate(p),Negate(m)),Times(Plus(a,b),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),-1)),Times(Plus(a,Negate(b)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),-1))),Power(Times(b,f,Plus(m,p),Power(Times(CN1,b,Plus(C1,Negate(Sin(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),-1)),Times(C1D2,Plus(p,Negate(C1)))),Power(Times(b,Plus(C1,Sin(Plus(e,Times(f,x)))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),-1)),Times(C1D2,Plus(p,Negate(C1))))),-1)),x),And(FreeQ(List(a,b,e,f,g,p),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),ILtQ(m,C0),Not(IGtQ(Plus(m,p,C1),C0))))),
IIntegrate(6746,Int(Times(Power(Times(g_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Dist(Times(g,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,Negate(C1))),Power(Times(f,Power(Plus(C1,Times(CN1,Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Power(Plus(a,Negate(b)),-1))),Times(C1D2,Plus(p,Negate(C1)))),Power(Plus(C1,Times(CN1,Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Power(Plus(a,b),-1))),Times(C1D2,Plus(p,Negate(C1))))),-1)),Subst(Int(Times(Power(Plus(Times(CN1,b,Power(Plus(a,Negate(b)),-1)),Times(CN1,b,x,Power(Plus(a,Negate(b)),-1))),Times(C1D2,Plus(p,Negate(C1)))),Power(Plus(Times(b,Power(Plus(a,b),-1)),Times(CN1,b,x,Power(Plus(a,b),-1))),Times(C1D2,Plus(p,Negate(C1)))),Power(Plus(a,Times(b,x)),m)),x),x,Sin(Plus(e,Times(f,x)))),x),And(FreeQ(List(a,b,e,f,g,m,p),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),Not(IGtQ(m,C0))))),
IIntegrate(6747,Int(Times(Power(Times(g_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(g,Times(C2,IntPart(p))),Power(Times(g,Cos(Plus(e,Times(f,x)))),FracPart(p)),Power(Times(g,Sec(Plus(e,Times(f,x)))),FracPart(p))),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Power(Times(g,Cos(Plus(e,Times(f,x)))),p),-1)),x),x),And(FreeQ(List(a,b,e,f,g,m,p),x),Not(IntegerQ(p))))),
IIntegrate(6748,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1),Power(Times(g_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Times(Sqr(Sec(Plus(e,Times(f,x)))),Power(Times(g,Tan(Plus(e,Times(f,x)))),p)),x),x),Negate(Dist(Power(Times(b,g),-1),Int(Times(Sec(Plus(e,Times(f,x))),Power(Times(g,Tan(Plus(e,Times(f,x)))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,e,f,g,p),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(p,CN1)))),
IIntegrate(6749,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(f,-1),Subst(Int(Times(Power(x,p),Power(Plus(a,x),Plus(m,Times(CN1,C1D2,Plus(p,C1)))),Power(Power(Plus(a,Negate(x)),Times(C1D2,Plus(p,C1))),-1)),x),x,Times(b,Sin(Plus(e,Times(f,x))))),x),And(FreeQ(List(a,b,e,f,m),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(Times(C1D2,Plus(p,C1)))))),
IIntegrate(6750,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),p_)),x_Symbol),
    Condition(Dist(Power(a,p),Int(Times(Power(Sin(Plus(e,Times(f,x))),p),Power(Power(Plus(a,Times(CN1,b,Sin(Plus(e,Times(f,x))))),m),-1)),x),x),And(FreeQ(List(a,b,e,f),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegersQ(m,p),EqQ(p,Times(C2,m))))),
IIntegrate(6751,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),p_)),x_Symbol),
    Condition(Dist(Power(a,p),Int(ExpandIntegrand(Times(Power(Sin(Plus(e,Times(f,x))),p),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Times(CN1,C1D2,p))),Power(Power(Plus(a,Times(CN1,b,Sin(Plus(e,Times(f,x))))),Times(C1D2,p)),-1)),x),x),x),And(FreeQ(List(a,b,e,f),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegersQ(m,Times(C1D2,p)),Or(LtQ(p,C0),GtQ(Plus(m,Times(CN1,C1D2,p)),C0))))),
IIntegrate(6752,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Times(g_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Times(g,Tan(Plus(e,Times(f,x)))),p),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),x),x),And(FreeQ(List(a,b,e,f,g,p),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(m,C0)))),
IIntegrate(6753,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(g_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(a,Times(C2,m)),Int(ExpandIntegrand(Times(Power(Times(g,Tan(Plus(e,Times(f,x)))),p),Power(Power(Sec(Plus(e,Times(f,x))),m),-1)),Power(Plus(Times(a,Sec(Plus(e,Times(f,x)))),Times(CN1,b,Tan(Plus(e,Times(f,x))))),Negate(m)),x),x),x),And(FreeQ(List(a,b,e,f,g,p),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),ILtQ(m,C0)))),
IIntegrate(6754,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Times(a,f,Plus(Times(C2,m),Negate(C1)),Cos(Plus(e,Times(f,x)))),-1)),x),Negate(Dist(Power(Times(Sqr(a),Plus(Times(C2,m),Negate(C1))),-1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Plus(Times(a,m),Times(CN1,b,Plus(Times(C2,m),Negate(C1)),Sin(Plus(e,Times(f,x))))),Power(Cos(Plus(e,Times(f,x))),-2)),x),x))),And(FreeQ(List(a,b,e,f),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),Not(IntegerQ(m)),LtQ(m,C0)))),
IIntegrate(6755,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,m,Cos(Plus(e,Times(f,x)))),-1)),x)),Dist(Power(Times(b,m),-1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Plus(Times(b,Plus(m,C1)),Times(a,Sin(Plus(e,Times(f,x))))),Power(Cos(Plus(e,Times(f,x))),-2)),x),x)),And(FreeQ(List(a,b,e,f,m),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),Not(IntegerQ(m)),Not(LtQ(m,C0))))),
IIntegrate(6756,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),4)),x_Symbol),
    Condition(Plus(Int(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),x),Negate(Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Plus(C1,Times(CN1,C2,Sqr(Sin(Plus(e,Times(f,x)))))),Power(Cos(Plus(e,Times(f,x))),-4)),x))),And(FreeQ(List(a,b,e,f,m),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(Plus(m,Negate(C1D2)))))),
IIntegrate(6757,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),-2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(a,f,Tan(Plus(e,Times(f,x)))),-1)),x)),Dist(Power(b,-2),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Plus(Times(b,m),Times(CN1,a,Plus(m,C1),Sin(Plus(e,Times(f,x))))),Power(Sin(Plus(e,Times(f,x))),-1)),x),x)),And(FreeQ(List(a,b,e,f),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(Plus(m,Negate(C1D2))),LtQ(m,CN1)))),
IIntegrate(6758,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),-2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Times(f,Tan(Plus(e,Times(f,x)))),-1)),x)),Dist(Power(a,-1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Plus(Times(b,m),Times(CN1,a,Plus(m,C1),Sin(Plus(e,Times(f,x))))),Power(Sin(Plus(e,Times(f,x))),-1)),x),x)),And(FreeQ(List(a,b,e,f,m),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(Plus(m,Negate(C1D2))),Not(LtQ(m,CN1))))),
IIntegrate(6759,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),-4)),x_Symbol),
    Condition(Plus(Dist(Times(CN2,Power(Times(a,b),-1)),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C2)),Power(Sin(Plus(e,Times(f,x))),-3)),x),x),Dist(Power(a,-2),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C2)),Plus(C1,Sqr(Sin(Plus(e,Times(f,x))))),Power(Sin(Plus(e,Times(f,x))),-4)),x),x)),And(FreeQ(List(a,b,e,f),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(Plus(m,Negate(C1D2))),LtQ(m,CN1)))),
IIntegrate(6760,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),-4)),x_Symbol),
    Condition(Plus(Int(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),x),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Plus(C1,Times(CN1,C2,Sqr(Sin(Plus(e,Times(f,x)))))),Power(Sin(Plus(e,Times(f,x))),-4)),x)),And(FreeQ(List(a,b,e,f,m),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(Plus(m,Negate(C1D2))),Not(LtQ(m,CN1))))),
IIntegrate(6761,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),p_)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Sqrt(Plus(a,Times(CN1,b,Sin(Plus(e,Times(f,x)))))),Power(Times(b,f,Cos(Plus(e,Times(f,x)))),-1)),Subst(Int(Times(Power(x,p),Power(Plus(a,x),Plus(m,Times(CN1,C1D2,Plus(p,C1)))),Power(Power(Plus(a,Negate(x)),Times(C1D2,Plus(p,C1))),-1)),x),x,Times(b,Sin(Plus(e,Times(f,x))))),x),And(FreeQ(List(a,b,e,f,m),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),Not(IntegerQ(m)),IntegerQ(Times(C1D2,p))))),
IIntegrate(6762,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(g_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(g,Tan(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(CN1,b,Sin(Plus(e,Times(f,x))))),Times(C1D2,Plus(p,C1))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Times(C1D2,Plus(p,C1))),Power(Times(f,g,Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(p,C1))),-1)),Subst(Int(Times(Power(x,p),Power(Plus(a,x),Plus(m,Times(CN1,C1D2,Plus(p,C1)))),Power(Power(Plus(a,Negate(x)),Times(C1D2,Plus(p,C1))),-1)),x),x,Times(b,Sin(Plus(e,Times(f,x))))),x),And(FreeQ(List(a,b,e,f,g,m,p),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),Not(IntegerQ(m)),Not(IntegerQ(p))))),
IIntegrate(6763,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(f,-1),Subst(Int(Times(Power(x,p),Power(Plus(a,x),m),Power(Power(Plus(Sqr(b),Negate(Sqr(x))),Times(C1D2,Plus(p,C1))),-1)),x),x,Times(b,Sin(Plus(e,Times(f,x))))),x),And(FreeQ(List(a,b,e,f,m),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(Times(C1D2,Plus(p,C1)))))),
IIntegrate(6764,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Times(g_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Times(g,Tan(Plus(e,Times(f,x)))),p),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),x),x),And(FreeQ(List(a,b,e,f,g,p),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(m,C0)))),
IIntegrate(6765,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),-2)),x_Symbol),
    Condition(Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Plus(C1,Negate(Sqr(Sin(Plus(e,Times(f,x)))))),Power(Sin(Plus(e,Times(f,x))),-2)),x),And(FreeQ(List(a,b,e,f,m),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(6766,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),-4)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(C3,a,f,Power(Sin(Plus(e,Times(f,x))),3)),-1)),x)),Negate(Dist(Power(Times(C3,Sqr(a),b,Plus(m,C1)),-1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(C6,Sqr(a)),Times(CN1,Sqr(b),Plus(m,Negate(C1)),Plus(m,Negate(C2))),Times(a,b,Plus(m,C1),Sin(Plus(e,Times(f,x)))),Times(CN1,Plus(Times(C3,Sqr(a)),Times(CN1,Sqr(b),m,Plus(m,Negate(C2)))),Sqr(Sin(Plus(e,Times(f,x)))))),x),Power(Sin(Plus(e,Times(f,x))),-3)),x),x)),Negate(Simp(Times(Plus(Times(C3,Sqr(a)),Times(Sqr(b),Plus(m,Negate(C2)))),Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(C3,Sqr(a),b,f,Plus(m,C1),Sqr(Sin(Plus(e,Times(f,x))))),-1)),x))),And(FreeQ(List(a,b,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LtQ(m,CN1),IntegerQ(Times(C2,m))))),
IIntegrate(6767,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),-4)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(C3,a,f,Power(Sin(Plus(e,Times(f,x))),3)),-1)),x)),Negate(Dist(Power(Times(C6,Sqr(a)),-1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Simp(Plus(Times(C8,Sqr(a)),Times(CN1,Sqr(b),Plus(m,Negate(C1)),Plus(m,Negate(C2))),Times(a,b,m,Sin(Plus(e,Times(f,x)))),Times(CN1,Plus(Times(C6,Sqr(a)),Times(CN1,Sqr(b),m,Plus(m,Negate(C2)))),Sqr(Sin(Plus(e,Times(f,x)))))),x),Power(Sin(Plus(e,Times(f,x))),-2)),x),x)),Negate(Simp(Times(b,Plus(m,Negate(C2)),Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(C6,Sqr(a),f,Sqr(Sin(Plus(e,Times(f,x))))),-1)),x))),And(FreeQ(List(a,b,e,f,m),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),Not(LtQ(m,CN1)),IntegerQ(Times(C2,m))))),
IIntegrate(6768,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),-6)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(C5,a,f,Power(Sin(Plus(e,Times(f,x))),5)),-1)),x)),Dist(Power(Times(ZZ(20L),Sqr(a),Sqr(b),m,Plus(m,Negate(C1))),-1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Simp(Plus(Times(ZZ(60L),Power(a,4)),Times(CN1,ZZ(44L),Sqr(a),Sqr(b),Plus(m,Negate(C1)),m),Times(Power(b,4),m,Plus(m,Negate(C1)),Plus(m,Negate(C3)),Plus(m,Negate(C4))),Times(a,b,m,Plus(Times(ZZ(20L),Sqr(a)),Times(CN1,Sqr(b),m,Plus(m,Negate(C1)))),Sin(Plus(e,Times(f,x)))),Times(CN1,Plus(Times(ZZ(40L),Power(a,4)),Times(Power(b,4),m,Plus(m,Negate(C1)),Plus(m,Negate(C2)),Plus(m,Negate(C4))),Times(CN1,ZZ(20L),Sqr(a),Sqr(b),Plus(m,Negate(C1)),Plus(Times(C2,m),C1))),Sqr(Sin(Plus(e,Times(f,x)))))),x),Power(Sin(Plus(e,Times(f,x))),-4)),x),x),Simp(Times(Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,m,Sqr(Sin(Plus(e,Times(f,x))))),-1)),x),Simp(Times(a,Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(Sqr(b),f,m,Plus(m,Negate(C1)),Power(Sin(Plus(e,Times(f,x))),3)),-1)),x),Negate(Simp(Times(b,Plus(m,Negate(C4)),Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(ZZ(20L),Sqr(a),f,Power(Sin(Plus(e,Times(f,x))),4)),-1)),x))),And(FreeQ(List(a,b,e,f,m),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(m,C1),IntegerQ(Times(C2,m))))),
IIntegrate(6769,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1),Power(Times(g_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Dist(Times(a,Power(Plus(Sqr(a),Negate(Sqr(b))),-1)),Int(Times(Power(Times(g,Tan(Plus(e,Times(f,x)))),p),Power(Sin(Plus(e,Times(f,x))),-2)),x),x),Negate(Dist(Times(b,g,Power(Plus(Sqr(a),Negate(Sqr(b))),-1)),Int(Times(Power(Times(g,Tan(Plus(e,Times(f,x)))),Plus(p,Negate(C1))),Power(Cos(Plus(e,Times(f,x))),-1)),x),x)),Negate(Dist(Times(Sqr(a),Sqr(g),Power(Plus(Sqr(a),Negate(Sqr(b))),-1)),Int(Times(Power(Times(g,Tan(Plus(e,Times(f,x)))),Plus(p,Negate(C2))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),-1)),x),x))),And(FreeQ(List(a,b,e,f,g),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegersQ(Times(C2,p)),GtQ(p,C1)))),
IIntegrate(6770,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1),Power(Times(g_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Times(Power(Times(g,Tan(Plus(e,Times(f,x)))),p),Power(Cos(Plus(e,Times(f,x))),-2)),x),x),Negate(Dist(Times(b,Power(Times(Sqr(a),g),-1)),Int(Times(Power(Times(g,Tan(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Cos(Plus(e,Times(f,x))),-1)),x),x)),Negate(Dist(Times(Plus(Sqr(a),Negate(Sqr(b))),Power(Times(Sqr(a),Sqr(g)),-1)),Int(Times(Power(Times(g,Tan(Plus(e,Times(f,x)))),Plus(p,C2)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),-1)),x),x))),And(FreeQ(List(a,b,e,f,g),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegersQ(Times(C2,p)),LtQ(p,CN1)))),
IIntegrate(6771,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1),Sqrt(Times(g_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Dist(Times(Sqrt(Cos(Plus(e,Times(f,x)))),Sqrt(Times(g,Tan(Plus(e,Times(f,x))))),Power(Sin(Plus(e,Times(f,x))),CN1D2)),Int(Times(Sqrt(Sin(Plus(e,Times(f,x)))),Power(Times(Sqrt(Cos(Plus(e,Times(f,x)))),Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),-1)),x),x),And(FreeQ(List(a,b,e,f,g),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(6772,Int(Power(Times(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Times(g_,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1),x_Symbol),
    Condition(Dist(Times(Sqrt(Sin(Plus(e,Times(f,x)))),Power(Times(Sqrt(Cos(Plus(e,Times(f,x)))),Sqrt(Times(g,Tan(Plus(e,Times(f,x)))))),-1)),Int(Times(Sqrt(Cos(Plus(e,Times(f,x)))),Power(Times(Sqrt(Sin(Plus(e,Times(f,x)))),Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),-1)),x),x),And(FreeQ(List(a,b,e,f,g),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(6773,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Sin(Plus(e,Times(f,x))),p),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Power(Plus(C1,Negate(Sqr(Sin(Plus(e,Times(f,x)))))),Times(C1D2,p)),-1)),x),x),And(FreeQ(List(a,b,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegersQ(m,Times(C1D2,p))))),
IIntegrate(6774,Int(Times(Power(Times(g_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(g,Times(C2,IntPart(p))),Power(Times(g,Cot(Plus(e,Times(f,x)))),FracPart(p)),Power(Times(g,Tan(Plus(e,Times(f,x)))),FracPart(p))),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Power(Times(g,Tan(Plus(e,Times(f,x)))),p),-1)),x),x),And(FreeQ(List(a,b,e,f,g,m,p),x),Not(IntegerQ(p))))),
IIntegrate(6775,Int(Times(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(C1D2,Plus(Times(C2,a,c),Times(b,d)),x),x),Negate(Simp(Times(Plus(Times(b,c),Times(a,d)),Cos(Plus(e,Times(f,x))),Power(f,-1)),x)),Negate(Simp(Times(b,d,Cos(Plus(e,Times(f,x))),Sin(Plus(e,Times(f,x))),Power(Times(C2,f),-1)),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0)))),
IIntegrate(6776,Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(b,x,Power(d,-1)),x),Negate(Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1)),Int(Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),-1),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0)))),
IIntegrate(6777,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(a,m),Power(c,m)),Int(Times(Power(Cos(Plus(e,Times(f,x))),Times(C2,m)),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),Plus(n,Negate(m)))),x),x),And(FreeQ(List(a,b,c,d,e,f,n),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(m),Not(And(IntegerQ(n),Or(And(LtQ(m,C0),GtQ(n,C0)),LtQ(C0,n,m),LtQ(m,n,C0))))))),
IIntegrate(6778,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Dist(Times(a,c,Cos(Plus(e,Times(f,x))),Power(Times(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))))),-1)),Int(Times(Cos(Plus(e,Times(f,x))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(6779,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Simp(Times(CN2,b,Cos(Plus(e,Times(f,x))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n),Power(Times(f,Plus(Times(C2,n),C1),Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))))),-1)),x),And(FreeQ(List(a,b,c,d,e,f,n),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(n,Negate(Power(C2,-1)))))),
IIntegrate(6780,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,b,Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n),Power(Times(f,Plus(Times(C2,n),C1)),-1)),x),Negate(Dist(Times(b,Plus(Times(C2,m),Negate(C1)),Power(Times(d,Plus(Times(C2,n),C1)),-1)),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(Plus(m,Negate(C1D2)),C0),LtQ(n,CN1),Not(And(ILtQ(Plus(m,n),C0),GtQ(Plus(Times(C2,m),n,C1),C0)))))),
IIntegrate(6781,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n),Power(Times(f,Plus(m,n)),-1)),x)),Dist(Times(a,Plus(Times(C2,m),Negate(C1)),Power(Plus(m,n),-1)),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n)),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(Plus(m,Negate(C1D2)),C0),Not(LtQ(n,CN1)),Not(And(IGtQ(Plus(n,Negate(C1D2)),C0),LtQ(n,m))),Not(And(ILtQ(Plus(m,n),C0),GtQ(Plus(Times(C2,m),n,C1),C0)))))),
IIntegrate(6782,Int(Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Sqrt(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),-1),x_Symbol),
    Condition(Dist(Times(Cos(Plus(e,Times(f,x))),Power(Times(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))))),-1)),Int(Power(Cos(Plus(e,Times(f,x))),-1),x),x),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(6783,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Simp(Times(b,Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n),Power(Times(a,f,Plus(Times(C2,m),C1)),-1)),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),EqQ(Plus(m,n,C1),C0),NeQ(m,Negate(Power(C2,-1)))))),
IIntegrate(6784,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(b,Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n),Power(Times(a,f,Plus(Times(C2,m),C1)),-1)),x),Dist(Times(Plus(m,n,C1),Power(Times(a,Plus(Times(C2,m),C1)),-1)),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n)),x),x)),And(FreeQ(List(a,b,c,d,e,f,m,n),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),ILtQ(Simplify(Plus(m,n,C1)),C0),NeQ(m,Negate(Power(C2,-1))),Or(SumSimplerQ(m,C1),Not(SumSimplerQ(n,C1)))))),
IIntegrate(6785,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(b,Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n),Power(Times(a,f,Plus(Times(C2,m),C1)),-1)),x),Dist(Times(Plus(m,n,C1),Power(Times(a,Plus(Times(C2,m),C1)),-1)),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n)),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LtQ(m,CN1),Not(LtQ(m,n,CN1)),IntegersQ(Times(C2,m),Times(C2,n))))),
IIntegrate(6786,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Dist(Times(Power(a,IntPart(m)),Power(c,IntPart(m)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),FracPart(m)),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),FracPart(m)),Power(Power(Cos(Plus(e,Times(f,x))),Times(C2,FracPart(m))),-1)),Int(Times(Power(Cos(Plus(e,Times(f,x))),Times(C2,m)),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),Plus(n,Negate(m)))),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),Or(FractionQ(m),Not(FractionQ(n)))))),
IIntegrate(6787,Int(Times(Sqr(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqr(b),Cos(Plus(e,Times(f,x))),Power(Times(d,f),-1)),x)),Dist(Power(d,-1),Int(Times(Simp(Plus(Times(Sqr(a),d),Times(CN1,b,Plus(Times(b,c),Times(CN1,C2,a,d)),Sin(Plus(e,Times(f,x))))),x),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0)))),
IIntegrate(6788,Int(Power(Times(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1),x_Symbol),
    Condition(Plus(Dist(Times(b,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),-1),x),x),Negate(Dist(Times(d,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),-1),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0)))),
IIntegrate(6789,Int(Times(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Dist(c,Int(Power(Times(b,Sin(Plus(e,Times(f,x)))),m),x),x),Dist(Times(d,Power(b,-1)),Int(Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(m,C1)),x),x)),FreeQ(List(b,c,d,e,f,m),x))),
IIntegrate(6790,Int(Times(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Negate(Simp(Times(d,Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Times(f,Plus(m,C1)),-1)),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),EqQ(Plus(Times(a,d,m),Times(b,c,Plus(m,C1))),C0)))),
IIntegrate(6791,Int(Times(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(b,c),Times(CN1,a,d)),Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Times(a,f,Plus(Times(C2,m),C1)),-1)),x),Dist(Times(Plus(Times(a,d,m),Times(b,c,Plus(m,C1))),Power(Times(a,b,Plus(Times(C2,m),C1)),-1)),Int(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LtQ(m,Negate(Power(C2,-1))))))
  );
}
