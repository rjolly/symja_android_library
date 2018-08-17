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
public class IntRules19 { 
  public static IAST RULES = List( 
IIntegrate(5045,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),n_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(c,p),Power(Plus(d,Times(e,x)),Plus(m,Times(C2,p))),Power(Plus(f,Times(g,x)),Plus(n,C1)),Power(Times(g,Power(e,Times(C2,p)),Plus(m,n,Times(C2,p),C1)),-1)),x),Dist(Power(Times(g,Power(e,Times(C2,p)),Plus(m,n,Times(C2,p),C1)),-1),Int(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(f,Times(g,x)),n),ExpandToSum(Plus(Times(g,Plus(m,n,Times(C2,p),C1),Plus(Times(Power(e,Times(C2,p)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),Times(CN1,Power(c,p),Power(Plus(d,Times(e,x)),Times(C2,p))))),Times(CN1,Power(c,p),Plus(Times(e,f),Times(CN1,d,g)),Plus(m,Times(C2,p)),Power(Plus(d,Times(e,x)),Plus(Times(C2,p),Negate(C1))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Plus(Times(e,f),Times(CN1,d,g)),C0),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IGtQ(p,C0),NeQ(Plus(m,n,Times(C2,p),C1),C0),Or(IntegerQ(n),Not(IntegerQ(m)))))),
IIntegrate(5046,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),n_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(c,p),Power(Plus(d,Times(e,x)),Plus(m,Times(C2,p))),Power(Plus(f,Times(g,x)),Plus(n,C1)),Power(Times(g,Power(e,Times(C2,p)),Plus(m,n,Times(C2,p),C1)),-1)),x),Dist(Power(Times(g,Power(e,Times(C2,p)),Plus(m,n,Times(C2,p),C1)),-1),Int(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(f,Times(g,x)),n),ExpandToSum(Plus(Times(g,Plus(m,n,Times(C2,p),C1),Plus(Times(Power(e,Times(C2,p)),Power(Plus(a,Times(c,Sqr(x))),p)),Times(CN1,Power(c,p),Power(Plus(d,Times(e,x)),Times(C2,p))))),Times(CN1,Power(c,p),Plus(Times(e,f),Times(CN1,d,g)),Plus(m,Times(C2,p)),Power(Plus(d,Times(e,x)),Plus(Times(C2,p),Negate(C1))))),x)),x),x)),And(FreeQ(List(a,c,d,e,f,g),x),NeQ(Plus(Times(e,f),Times(CN1,d,g)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IGtQ(p,C0),NeQ(Plus(m,n,Times(C2,p),C1),C0),Or(IntegerQ(n),Not(IntegerQ(m)))))),
IIntegrate(5047,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),-1),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),n_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Dist(Times(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),Power(Times(e,Plus(Times(e,f),Times(CN1,d,g))),-1)),Int(Times(Power(Plus(f,Times(g,x)),Plus(n,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,x)),-1)),x),x),Negate(Dist(Power(Times(e,Plus(Times(e,f),Times(CN1,d,g))),-1),Int(Times(Power(Plus(f,Times(g,x)),n),Plus(Times(c,d,f),Times(CN1,b,e,f),Times(a,e,g),Times(CN1,c,Plus(Times(e,f),Times(CN1,d,g)),x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Plus(Times(e,f),Times(CN1,d,g)),C0),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Not(IntegerQ(n)),Not(IntegerQ(p)),GtQ(p,C0),LtQ(n,CN1)))),
IIntegrate(5048,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),-1),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),n_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Dist(Times(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),Power(Times(e,Plus(Times(e,f),Times(CN1,d,g))),-1)),Int(Times(Power(Plus(f,Times(g,x)),Plus(n,C1)),Power(Plus(a,Times(c,Sqr(x))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,x)),-1)),x),x),Negate(Dist(Power(Times(e,Plus(Times(e,f),Times(CN1,d,g))),-1),Int(Times(Power(Plus(f,Times(g,x)),n),Plus(Times(c,d,f),Times(a,e,g),Times(CN1,c,Plus(Times(e,f),Times(CN1,d,g)),x)),Power(Plus(a,Times(c,Sqr(x))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,c,d,e,f,g),x),NeQ(Plus(Times(e,f),Times(CN1,d,g)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(n)),Not(IntegerQ(p)),GtQ(p,C0),LtQ(n,CN1)))),
IIntegrate(5049,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),-1),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),n_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Dist(Times(e,Plus(Times(e,f),Times(CN1,d,g)),Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),-1)),Int(Times(Power(Plus(f,Times(g,x)),Plus(n,Negate(C1))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Plus(d,Times(e,x)),-1)),x),x),Dist(Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),-1),Int(Times(Power(Plus(f,Times(g,x)),Plus(n,Negate(C1))),Plus(Times(c,d,f),Times(CN1,b,e,f),Times(a,e,g),Times(CN1,c,Plus(Times(e,f),Times(CN1,d,g)),x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Plus(Times(e,f),Times(CN1,d,g)),C0),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Not(IntegerQ(n)),Not(IntegerQ(p)),LtQ(p,CN1),GtQ(n,C0)))),
IIntegrate(5050,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),-1),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),n_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Dist(Times(e,Plus(Times(e,f),Times(CN1,d,g)),Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),-1)),Int(Times(Power(Plus(f,Times(g,x)),Plus(n,Negate(C1))),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Plus(d,Times(e,x)),-1)),x),x),Dist(Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),-1),Int(Times(Power(Plus(f,Times(g,x)),Plus(n,Negate(C1))),Plus(Times(c,d,f),Times(a,e,g),Times(CN1,c,Plus(Times(e,f),Times(CN1,d,g)),x)),Power(Plus(a,Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,c,d,e,f,g),x),NeQ(Plus(Times(e,f),Times(CN1,d,g)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(n)),Not(IntegerQ(p)),LtQ(p,CN1),GtQ(n,C0)))),
IIntegrate(5051,Int(Times(Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),n_),Power(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Times(Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),-1),Times(Power(Plus(f,Times(g,x)),Plus(n,C1D2)),Power(Plus(d,Times(e,x)),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Plus(Times(e,f),Times(CN1,d,g)),C0),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IntegerQ(Plus(n,C1D2))))),
IIntegrate(5052,Int(Times(Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),n_),Power(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Sqrt(Plus(a_,Times(c_DEFAULT,Sqr(x_))))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Times(Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(c,Sqr(x))))),-1),Times(Power(Plus(f,Times(g,x)),Plus(n,C1D2)),Power(Plus(d,Times(e,x)),-1)),x),x),And(FreeQ(List(a,c,d,e,f,g),x),NeQ(Plus(Times(e,f),Times(CN1,d,g)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IntegerQ(Plus(n,C1D2))))),
IIntegrate(5053,Int(Times(Power(Times(g_DEFAULT,x_),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),-1),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Dist(Times(d,Power(Times(g,x),n),Power(Power(x,n),-1)),Int(Times(Power(x,n),Power(Plus(a,Times(c,Sqr(x))),p),Power(Plus(Sqr(d),Times(CN1,Sqr(e),Sqr(x))),-1)),x),x),Negate(Dist(Times(e,Power(Times(g,x),n),Power(Power(x,n),-1)),Int(Times(Power(x,Plus(n,C1)),Power(Plus(a,Times(c,Sqr(x))),p),Power(Plus(Sqr(d),Times(CN1,Sqr(e),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,c,d,e,g,n,p),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),Not(IntegersQ(n,Times(C2,p)))))),
IIntegrate(5054,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),n_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(f,Times(g,x)),n),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Plus(Times(e,f),Times(CN1,d,g)),C0),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Or(IntegerQ(p),And(ILtQ(m,C0),ILtQ(n,C0))),Not(Or(IGtQ(m,C0),IGtQ(n,C0)))))),
IIntegrate(5055,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),n_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(f,Times(g,x)),n),Power(Plus(a,Times(c,Sqr(x))),p)),x),x),And(FreeQ(List(a,c,d,e,f,g),x),NeQ(Plus(Times(e,f),Times(CN1,d,g)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Or(IntegerQ(p),And(ILtQ(m,C0),ILtQ(n,C0))),Not(Or(IGtQ(m,C0),IGtQ(n,C0)))))),
IIntegrate(5056,Int(Times(Power(Times(g_DEFAULT,x_),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(g,x),n),Power(Power(x,n),-1)),Int(ExpandIntegrand(Times(Power(x,n),Power(Plus(a,Times(c,Sqr(x))),p)),Power(Plus(Times(d,Power(Plus(Sqr(d),Times(CN1,Sqr(e),Sqr(x))),-1)),Times(CN1,e,x,Power(Plus(Sqr(d),Times(CN1,Sqr(e),Sqr(x))),-1))),Negate(m)),x),x),x),And(FreeQ(List(a,c,d,e,g,n,p),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),ILtQ(m,C0),Not(IntegerQ(p)),Not(IntegerQ(n))))),
IIntegrate(5057,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,u_)),m_DEFAULT),Power(Plus(f_DEFAULT,Times(g_DEFAULT,u_)),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,u_),Times(c_DEFAULT,Sqr(u_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),-1),Subst(Int(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(f,Times(g,x)),n),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x,u),x),And(FreeQ(List(a,b,c,d,e,f,g,m,n,p),x),LinearQ(u,x),NeQ(u,x)))),
IIntegrate(5058,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,u_)),m_DEFAULT),Power(Plus(f_DEFAULT,Times(g_DEFAULT,u_)),n_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Sqr(u_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),-1),Subst(Int(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(f,Times(g,x)),n),Power(Plus(a,Times(c,Sqr(x))),p)),x),x,u),x),And(FreeQ(List(a,c,d,e,f,g,m,n,p),x),LinearQ(u,x),NeQ(u,x)))),
IIntegrate(5059,Int(Times(Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(c,Power(f,-1)),p),Int(Power(Plus(d,Times(e,x),Times(f,Sqr(x))),Plus(p,q)),x),x),And(FreeQ(List(a,b,c,d,e,f,p,q),x),EqQ(Plus(Times(c,d),Times(CN1,a,f)),C0),EqQ(Plus(Times(b,d),Times(CN1,a,e)),C0),Or(IntegerQ(p),GtQ(Times(c,Power(f,-1)),C0)),Or(Not(IntegerQ(q)),LessEqual(LeafCount(Plus(d,Times(e,x),Times(f,Sqr(x)))),LeafCount(Plus(a,Times(b,x),Times(c,Sqr(x))))))))),
IIntegrate(5060,Int(Times(Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),Power(Plus(d_,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(a,IntPart(p)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),FracPart(p)),Power(Times(Power(d,IntPart(p)),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),FracPart(p))),-1)),Int(Power(Plus(d,Times(e,x),Times(f,Sqr(x))),Plus(p,q)),x),x),And(FreeQ(List(a,b,c,d,e,f,p,q),x),EqQ(Plus(Times(c,d),Times(CN1,a,f)),C0),EqQ(Plus(Times(b,d),Times(CN1,a,e)),C0),Not(IntegerQ(p)),Not(IntegerQ(q)),Not(GtQ(Times(c,Power(f,-1)),C0))))),
IIntegrate(5061,Int(Times(Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),Power(Plus(d_,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),FracPart(p)),Power(Times(Power(Times(C4,c),IntPart(p)),Power(Plus(b,Times(C2,c,x)),Times(C2,FracPart(p)))),-1)),Int(Times(Power(Plus(b,Times(C2,c,x)),Times(C2,p)),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),q)),x),x),And(FreeQ(List(a,b,c,d,e,f,p,q),x),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(p))))),
IIntegrate(5062,Int(Times(Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),Power(Plus(d_,Times(f_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),FracPart(p)),Power(Times(Power(Times(C4,c),IntPart(p)),Power(Plus(b,Times(C2,c,x)),Times(C2,FracPart(p)))),-1)),Int(Times(Power(Plus(b,Times(C2,c,x)),Times(C2,p)),Power(Plus(d,Times(f,Sqr(x))),q)),x),x),And(FreeQ(List(a,b,c,d,f,p,q),x),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(p))))),
IIntegrate(5063,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(b,Times(C2,c,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),q),Power(Times(Plus(Sqr(b),Times(CN1,C4,a,c)),Plus(p,C1)),-1)),x),Negate(Dist(Power(Times(Plus(Sqr(b),Times(CN1,C4,a,c)),Plus(p,C1)),-1),Int(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),Plus(q,Negate(C1))),Simp(Plus(Times(C2,c,d,Plus(Times(C2,p),C3)),Times(b,e,q),Times(Plus(Times(C2,b,f,q),Times(C2,c,e,Plus(Times(C2,p),q,C3))),x),Times(C2,c,f,Plus(Times(C2,p),Times(C2,q),C3),Sqr(x))),x)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Sqr(e),Times(CN1,C4,d,f)),C0),LtQ(p,CN1),GtQ(q,C0),Not(IGtQ(q,C0))))),
IIntegrate(5064,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),Power(Plus(d_DEFAULT,Times(f_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(b,Times(C2,c,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Plus(d,Times(f,Sqr(x))),q),Power(Times(Plus(Sqr(b),Times(CN1,C4,a,c)),Plus(p,C1)),-1)),x),Negate(Dist(Power(Times(Plus(Sqr(b),Times(CN1,C4,a,c)),Plus(p,C1)),-1),Int(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Plus(d,Times(f,Sqr(x))),Plus(q,Negate(C1))),Simp(Plus(Times(C2,c,d,Plus(Times(C2,p),C3)),Times(C2,b,f,q,x),Times(C2,c,f,Plus(Times(C2,p),Times(C2,q),C3),Sqr(x))),x)),x),x))),And(FreeQ(List(a,b,c,d,f),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),LtQ(p,CN1),GtQ(q,C0),Not(IGtQ(q,C0))))),
IIntegrate(5065,Int(Times(Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(x_))),p_),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(C2,c,x,Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),q),Power(Times(CN4,a,c,Plus(p,C1)),-1)),x),Negate(Dist(Power(Times(CN4,a,c,Plus(p,C1)),-1),Int(Times(Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),Plus(q,Negate(C1))),Simp(Plus(Times(C2,c,d,Plus(Times(C2,p),C3)),Times(C2,c,e,Plus(Times(C2,p),q,C3),x),Times(C2,c,f,Plus(Times(C2,p),Times(C2,q),C3),Sqr(x))),x)),x),x))),And(FreeQ(List(a,c,d,e,f),x),NeQ(Plus(Sqr(e),Times(CN1,C4,d,f))),LtQ(p,CN1),GtQ(q,C0),Not(IGtQ(q,C0))))),
IIntegrate(5066,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(C2,a,Sqr(c),e),Times(CN1,Sqr(b),c,e),Times(Power(b,3),f),Times(b,c,Plus(Times(c,d),Times(CN1,C3,a,f))),Times(c,Plus(Times(C2,Sqr(c),d),Times(Sqr(b),f),Times(CN1,c,Plus(Times(b,e),Times(C2,a,f)))),x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),Plus(q,C1)),Power(Times(Plus(Sqr(b),Times(CN1,C4,a,c)),Plus(Sqr(Plus(Times(c,d),Times(CN1,a,f))),Times(CN1,Plus(Times(b,d),Times(CN1,a,e)),Plus(Times(c,e),Times(CN1,b,f)))),Plus(p,C1)),-1)),x),Negate(Dist(Power(Times(Plus(Sqr(b),Times(CN1,C4,a,c)),Plus(Sqr(Plus(Times(c,d),Times(CN1,a,f))),Times(CN1,Plus(Times(b,d),Times(CN1,a,e)),Plus(Times(c,e),Times(CN1,b,f)))),Plus(p,C1)),-1),Int(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),q),Simp(Plus(Times(C2,c,Plus(Sqr(Plus(Times(c,d),Times(CN1,a,f))),Times(CN1,Plus(Times(b,d),Times(CN1,a,e)),Plus(Times(c,e),Times(CN1,b,f)))),Plus(p,C1)),Times(CN1,Plus(Times(C2,Sqr(c),d),Times(Sqr(b),f),Times(CN1,c,Plus(Times(b,e),Times(C2,a,f)))),Plus(Times(a,f,Plus(p,C1)),Times(CN1,c,d,Plus(p,C2)))),Times(CN1,e,Plus(Times(Sqr(b),c,e),Times(CN1,C2,a,Sqr(c),e),Times(CN1,Power(b,3),f),Times(CN1,b,c,Plus(Times(c,d),Times(CN1,C3,a,f)))),Plus(p,q,C2)),Times(Plus(Times(C2,f,Plus(Times(C2,a,Sqr(c),e),Times(CN1,Sqr(b),c,e),Times(Power(b,3),f),Times(b,c,Plus(Times(c,d),Times(CN1,C3,a,f)))),Plus(p,q,C2)),Times(CN1,Plus(Times(C2,Sqr(c),d),Times(Sqr(b),f),Times(CN1,c,Plus(Times(b,e),Times(C2,a,f)))),Plus(Times(b,f,Plus(p,C1)),Times(CN1,c,e,Plus(Times(C2,p),q,C4))))),x),Times(c,f,Plus(Times(C2,Sqr(c),d),Times(Sqr(b),f),Times(CN1,c,Plus(Times(b,e),Times(C2,a,f)))),Plus(Times(C2,p),Times(C2,q),C5),Sqr(x))),x)),x),x))),And(FreeQ(List(a,b,c,d,e,f,q),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Sqr(e),Times(CN1,C4,d,f)),C0),LtQ(p,CN1),NeQ(Plus(Sqr(Plus(Times(c,d),Times(CN1,a,f))),Times(CN1,Plus(Times(b,d),Times(CN1,a,e)),Plus(Times(c,e),Times(CN1,b,f)))),C0),Not(And(Not(IntegerQ(p)),ILtQ(q,CN1))),Not(IGtQ(q,C0))))),
IIntegrate(5067,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),Power(Plus(d_DEFAULT,Times(f_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(Power(b,3),f),Times(b,c,Plus(Times(c,d),Times(CN1,C3,a,f))),Times(c,Plus(Times(C2,Sqr(c),d),Times(Sqr(b),f),Times(CN1,c,C2,a,f)),x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Plus(d,Times(f,Sqr(x))),Plus(q,C1)),Power(Times(Plus(Sqr(b),Times(CN1,C4,a,c)),Plus(Times(Sqr(b),d,f),Sqr(Plus(Times(c,d),Times(CN1,a,f)))),Plus(p,C1)),-1)),x),Negate(Dist(Power(Times(Plus(Sqr(b),Times(CN1,C4,a,c)),Plus(Times(Sqr(b),d,f),Sqr(Plus(Times(c,d),Times(CN1,a,f)))),Plus(p,C1)),-1),Int(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Plus(d,Times(f,Sqr(x))),q),Simp(Plus(Times(C2,c,Plus(Times(Sqr(b),d,f),Sqr(Plus(Times(c,d),Times(CN1,a,f)))),Plus(p,C1)),Times(CN1,Plus(Times(C2,Sqr(c),d),Times(Sqr(b),f),Times(CN1,c,C2,a,f)),Plus(Times(a,f,Plus(p,C1)),Times(CN1,c,d,Plus(p,C2)))),Times(Plus(Times(C2,f,Plus(Times(Power(b,3),f),Times(b,c,Plus(Times(c,d),Times(CN1,C3,a,f)))),Plus(p,q,C2)),Times(CN1,Plus(Times(C2,Sqr(c),d),Times(Sqr(b),f),Times(CN1,c,C2,a,f)),b,f,Plus(p,C1))),x),Times(c,f,Plus(Times(C2,Sqr(c),d),Times(Sqr(b),f),Times(CN1,c,C2,a,f)),Plus(Times(C2,p),Times(C2,q),C5),Sqr(x))),x)),x),x))),And(FreeQ(List(a,b,c,d,f,q),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),LtQ(p,CN1),NeQ(Plus(Times(Sqr(b),d,f),Sqr(Plus(Times(c,d),Times(CN1,a,f)))),C0),Not(And(Not(IntegerQ(p)),ILtQ(q,CN1))),Not(IGtQ(q,C0))))),
IIntegrate(5068,Int(Times(Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(x_))),p_),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(C2,a,Sqr(c),e),Times(c,Plus(Times(C2,Sqr(c),d),Times(CN1,c,C2,a,f)),x)),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),Plus(q,C1)),Power(Times(CN4,a,c,Plus(Times(a,c,Sqr(e)),Sqr(Plus(Times(c,d),Times(CN1,a,f)))),Plus(p,C1)),-1)),x),Negate(Dist(Power(Times(CN4,a,c,Plus(Times(a,c,Sqr(e)),Sqr(Plus(Times(c,d),Times(CN1,a,f)))),Plus(p,C1)),-1),Int(Times(Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),q),Simp(Plus(Times(C2,c,Plus(Sqr(Plus(Times(c,d),Times(CN1,a,f))),Times(CN1,CN1,a,e,c,e)),Plus(p,C1)),Times(CN1,Plus(Times(C2,Sqr(c),d),Times(CN1,c,C2,a,f)),Plus(Times(a,f,Plus(p,C1)),Times(CN1,c,d,Plus(p,C2)))),Times(CN1,e,CN2,a,Sqr(c),e,Plus(p,q,C2)),Times(Plus(Times(C2,f,C2,a,Sqr(c),e,Plus(p,q,C2)),Times(CN1,Plus(Times(C2,Sqr(c),d),Times(CN1,c,C2,a,f)),CN1,c,e,Plus(Times(C2,p),q,C4))),x),Times(c,f,Plus(Times(C2,Sqr(c),d),Times(CN1,c,C2,a,f)),Plus(Times(C2,p),Times(C2,q),C5),Sqr(x))),x)),x),x))),And(FreeQ(List(a,c,d,e,f,q),x),NeQ(Plus(Sqr(e),Times(CN1,C4,d,f)),C0),LtQ(p,CN1),NeQ(Plus(Times(a,c,Sqr(e)),Sqr(Plus(Times(c,d),Times(CN1,a,f)))),C0),Not(And(Not(IntegerQ(p)),ILtQ(q,CN1))),Not(IGtQ(q,C0))))),
IIntegrate(5069,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(b,f,Plus(Times(C3,p),Times(C2,q))),Times(CN1,c,e,Plus(Times(C2,p),q)),Times(C2,c,f,Plus(p,q),x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),Plus(q,C1)),Power(Times(C2,Sqr(f),Plus(p,q),Plus(Times(C2,p),Times(C2,q),C1)),-1)),x),Negate(Dist(Power(Times(C2,Sqr(f),Plus(p,q),Plus(Times(C2,p),Times(C2,q),C1)),-1),Int(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,Negate(C2))),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),q),Simp(Plus(Times(Plus(Times(b,d),Times(CN1,a,e)),Plus(Times(c,e),Times(CN1,b,f)),Plus(C1,Negate(p)),Plus(Times(C2,p),q)),Times(CN1,Plus(p,q),Plus(Times(Sqr(b),d,f,Plus(C1,Negate(p))),Times(CN1,a,Plus(Times(f,Plus(Times(b,e),Times(CN1,C2,a,f)),Plus(Times(C2,p),Times(C2,q),C1)),Times(c,Plus(Times(C2,d,f),Times(CN1,Sqr(e),Plus(Times(C2,p),q)))))))),Times(Plus(Times(C2,Plus(Times(c,d),Times(CN1,a,f)),Plus(Times(c,e),Times(CN1,b,f)),Plus(C1,Negate(p)),Plus(Times(C2,p),q)),Times(CN1,Plus(p,q),Plus(Times(Plus(Sqr(b),Times(CN1,C4,a,c)),e,f,Plus(C1,Negate(p))),Times(b,Plus(Times(c,Plus(Sqr(e),Times(CN1,C4,d,f)),Plus(Times(C2,p),q)),Times(f,Plus(Times(C2,c,d),Times(CN1,b,e),Times(C2,a,f)),Plus(Times(C2,p),Times(C2,q),C1))))))),x),Times(Plus(Times(Sqr(Plus(Times(c,e),Times(CN1,b,f))),Plus(C1,Negate(p)),p),Times(c,Plus(p,q),Plus(Times(f,Plus(Times(b,e),Times(CN1,C2,a,f)),Plus(Times(C4,p),Times(C2,q),Negate(C1))),Times(CN1,c,Plus(Times(C2,d,f,Plus(C1,Times(CN1,C2,p))),Times(Sqr(e),Plus(Times(C3,p),q,Negate(C1)))))))),Sqr(x))),x)),x),x))),And(FreeQ(List(a,b,c,d,e,f,q),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Sqr(e),Times(CN1,C4,d,f)),C0),GtQ(p,C1),NeQ(Plus(p,q),C0),NeQ(Plus(Times(C2,p),Times(C2,q),C1),C0),Not(IGtQ(p,C0)),Not(IGtQ(q,C0))))),
IIntegrate(5070,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),Power(Plus(d_DEFAULT,Times(f_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(b,Plus(Times(C3,p),Times(C2,q))),Times(C2,c,Plus(p,q),x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,Negate(C1))),Power(Plus(d,Times(f,Sqr(x))),Plus(q,C1)),Power(Times(C2,f,Plus(p,q),Plus(Times(C2,p),Times(C2,q),C1)),-1)),x),Negate(Dist(Power(Times(C2,f,Plus(p,q),Plus(Times(C2,p),Times(C2,q),C1)),-1),Int(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,Negate(C2))),Power(Plus(d,Times(f,Sqr(x))),q),Simp(Plus(Times(Sqr(b),d,Plus(p,Negate(C1)),Plus(Times(C2,p),q)),Times(CN1,Plus(p,q),Plus(Times(Sqr(b),d,Plus(C1,Negate(p))),Times(CN1,C2,a,Plus(Times(c,d),Times(CN1,a,f,Plus(Times(C2,p),Times(C2,q),C1)))))),Times(CN1,Plus(Times(C2,b,Plus(Times(c,d),Times(CN1,a,f)),Plus(C1,Negate(p)),Plus(Times(C2,p),q)),Times(CN1,C2,Plus(p,q),b,Plus(Times(C2,c,d,Plus(Times(C2,p),q)),Times(CN1,Plus(Times(c,d),Times(a,f)),Plus(Times(C2,p),Times(C2,q),C1))))),x),Times(Plus(Times(Sqr(b),f,p,Plus(C1,Negate(p))),Times(C2,c,Plus(p,q),Plus(Times(c,d,Plus(Times(C2,p),Negate(C1))),Times(CN1,a,f,Plus(Times(C4,p),Times(C2,q),Negate(C1)))))),Sqr(x))),x)),x),x))),And(FreeQ(List(a,b,c,d,f,q),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),GtQ(p,C1),NeQ(Plus(p,q),C0),NeQ(Plus(Times(C2,p),Times(C2,q),C1),C0),Not(IGtQ(p,C0)),Not(IGtQ(q,C0))))),
IIntegrate(5071,Int(Times(Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(x_))),p_),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(c,Plus(Times(e,Plus(Times(C2,p),q)),Times(CN1,C2,f,Plus(p,q),x)),Power(Plus(a,Times(c,Sqr(x))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),Plus(q,C1)),Power(Times(C2,Sqr(f),Plus(p,q),Plus(Times(C2,p),Times(C2,q),C1)),-1)),x)),Negate(Dist(Power(Times(C2,Sqr(f),Plus(p,q),Plus(Times(C2,p),Times(C2,q),C1)),-1),Int(Times(Power(Plus(a,Times(c,Sqr(x))),Plus(p,Negate(C2))),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),q),Simp(Plus(Times(CN1,a,c,Sqr(e),Plus(C1,Negate(p)),Plus(Times(C2,p),q)),Times(a,Plus(p,q),Plus(Times(CN2,a,Sqr(f),Plus(Times(C2,p),Times(C2,q),C1)),Times(c,Plus(Times(C2,d,f),Times(CN1,Sqr(e),Plus(Times(C2,p),q)))))),Times(Plus(Times(C2,Plus(Times(c,d),Times(CN1,a,f)),c,e,Plus(C1,Negate(p)),Plus(Times(C2,p),q)),Times(C4,a,c,e,f,Plus(C1,Negate(p)),Plus(p,q))),x),Times(Plus(Times(p,Sqr(c),Sqr(e),Plus(C1,Negate(p))),Times(CN1,c,Plus(p,q),Plus(Times(C2,a,Sqr(f),Plus(Times(C4,p),Times(C2,q),Negate(C1))),Times(c,Plus(Times(C2,d,f,Plus(C1,Times(CN1,C2,p))),Times(Sqr(e),Plus(Times(C3,p),q,Negate(C1)))))))),Sqr(x))),x)),x),x))),And(FreeQ(List(a,c,d,e,f,q),x),NeQ(Plus(Sqr(e),Times(CN1,C4,d,f)),C0),GtQ(p,C1),NeQ(Plus(p,q),C0),NeQ(Plus(Times(C2,p),Times(C2,q),C1),C0),Not(IGtQ(p,C0)),Not(IGtQ(q,C0))))),
IIntegrate(5072,Int(Power(Times(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),Plus(d_,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_)))),-1),x_Symbol),
    Condition(With(List(Set(q,Plus(Times(Sqr(c),Sqr(d)),Times(CN1,b,c,d,e),Times(a,c,Sqr(e)),Times(Sqr(b),d,f),Times(CN1,C2,a,c,d,f),Times(CN1,a,b,e,f),Times(Sqr(a),Sqr(f))))),Condition(Plus(Dist(Power(q,-1),Int(Times(Plus(Times(Sqr(c),d),Times(CN1,b,c,e),Times(Sqr(b),f),Times(CN1,a,c,f),Times(CN1,Plus(Times(Sqr(c),e),Times(CN1,b,c,f)),x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),-1)),x),x),Dist(Power(q,-1),Int(Times(Plus(Times(c,Sqr(e)),Times(CN1,c,d,f),Times(CN1,b,e,f),Times(a,Sqr(f)),Times(Plus(Times(c,e,f),Times(CN1,b,Sqr(f))),x)),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),-1)),x),x)),NeQ(q,C0))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Sqr(e),Times(CN1,C4,d,f)),C0)))),
IIntegrate(5073,Int(Power(Times(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),Plus(d_,Times(f_DEFAULT,Sqr(x_)))),-1),x_Symbol),
    Condition(With(List(Set(q,Plus(Times(Sqr(c),Sqr(d)),Times(Sqr(b),d,f),Times(CN1,C2,a,c,d,f),Times(Sqr(a),Sqr(f))))),Condition(Plus(Dist(Power(q,-1),Int(Times(Plus(Times(Sqr(c),d),Times(Sqr(b),f),Times(CN1,a,c,f),Times(b,c,f,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),-1)),x),x),Negate(Dist(Power(q,-1),Int(Times(Plus(Times(c,d,f),Times(CN1,a,Sqr(f)),Times(b,Sqr(f),x)),Power(Plus(d,Times(f,Sqr(x))),-1)),x),x))),NeQ(q,C0))),And(FreeQ(List(a,b,c,d,f),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(5074,Int(Power(Times(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(Dist(Times(CN2,e),Subst(Int(Power(Plus(Times(e,Plus(Times(b,e),Times(CN1,C4,a,f))),Times(CN1,Plus(Times(b,d),Times(CN1,a,e)),Sqr(x))),-1),x),x,Times(Plus(e,Times(C2,f,x)),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),CN1D2))),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Sqr(e),Times(CN1,C4,d,f)),C0),EqQ(Plus(Times(c,e),Times(CN1,b,f)),C0)))),
IIntegrate(5075,Int(Power(Times(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Dist(Times(C2,c,Power(q,-1)),Int(Power(Times(Plus(b,Negate(q),Times(C2,c,x)),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1),x),x),Negate(Dist(Times(C2,c,Power(q,-1)),Int(Power(Times(Plus(b,q,Times(C2,c,x)),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1),x),x)))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Sqr(e),Times(CN1,C4,d,f)),C0),NeQ(Plus(Times(c,e),Times(CN1,b,f)),C0),PosQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
IIntegrate(5076,Int(Power(Times(Plus(a_,Times(c_DEFAULT,Sqr(x_))),Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Power(Times(Plus(a,Times(CN1,Rt(Times(CN1,a,c),C2),x)),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1),x),x),Dist(C1D2,Int(Power(Times(Plus(a,Times(Rt(Times(CN1,a,c),C2),x)),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1),x),x)),And(FreeQ(List(a,c,d,e,f),x),NeQ(Plus(Sqr(e),Times(CN1,C4,d,f)),C0),PosQ(Times(CN1,a,c))))),
IIntegrate(5077,Int(Power(Times(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),Sqrt(Plus(d_,Times(f_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Dist(Times(C2,c,Power(q,-1)),Int(Power(Times(Plus(b,Negate(q),Times(C2,c,x)),Sqrt(Plus(d,Times(f,Sqr(x))))),-1),x),x),Negate(Dist(Times(C2,c,Power(q,-1)),Int(Power(Times(Plus(b,q,Times(C2,c,x)),Sqrt(Plus(d,Times(f,Sqr(x))))),-1),x),x)))),And(FreeQ(List(a,b,c,d,f),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),PosQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
IIntegrate(5078,Int(Power(Times(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(Plus(Times(c,d),Times(CN1,a,f))),Times(CN1,Plus(Times(b,d),Times(CN1,a,e)),Plus(Times(c,e),Times(CN1,b,f)))),C2))),Plus(Dist(Power(Times(C2,q),-1),Int(Times(Plus(Times(c,d),Times(CN1,a,f),q,Times(Plus(Times(c,e),Times(CN1,b,f)),x)),Power(Times(Plus(a,Times(b,x),Times(c,Sqr(x))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1)),x),x),Negate(Dist(Power(Times(C2,q),-1),Int(Times(Plus(Times(c,d),Times(CN1,a,f),Negate(q),Times(Plus(Times(c,e),Times(CN1,b,f)),x)),Power(Times(Plus(a,Times(b,x),Times(c,Sqr(x))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1)),x),x)))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Sqr(e),Times(CN1,C4,d,f)),C0),NeQ(Plus(Times(c,e),Times(CN1,b,f)),C0),NegQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
IIntegrate(5079,Int(Power(Times(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(x_))),Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(Plus(Times(c,d),Times(CN1,a,f))),Times(a,c,Sqr(e))),C2))),Plus(Dist(Power(Times(C2,q),-1),Int(Times(Plus(Times(c,d),Times(CN1,a,f),q,Times(c,e,x)),Power(Times(Plus(a,Times(c,Sqr(x))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1)),x),x),Negate(Dist(Power(Times(C2,q),-1),Int(Times(Plus(Times(c,d),Times(CN1,a,f),Negate(q),Times(c,e,x)),Power(Times(Plus(a,Times(c,Sqr(x))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1)),x),x)))),And(FreeQ(List(a,c,d,e,f),x),NeQ(Plus(Sqr(e),Times(CN1,C4,d,f)),C0),NegQ(Times(CN1,a,c))))),
IIntegrate(5080,Int(Power(Times(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),Sqrt(Plus(d_DEFAULT,Times(f_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(Plus(Times(c,d),Times(CN1,a,f))),Times(Sqr(b),d,f)),C2))),Plus(Dist(Power(Times(C2,q),-1),Int(Times(Plus(Times(c,d),Times(CN1,a,f),q,Times(CN1,b,f,x)),Power(Times(Plus(a,Times(b,x),Times(c,Sqr(x))),Sqrt(Plus(d,Times(f,Sqr(x))))),-1)),x),x),Negate(Dist(Power(Times(C2,q),-1),Int(Times(Plus(Times(c,d),Times(CN1,a,f),Negate(q),Times(CN1,b,f,x)),Power(Times(Plus(a,Times(b,x),Times(c,Sqr(x))),Sqrt(Plus(d,Times(f,Sqr(x))))),-1)),x),x)))),And(FreeQ(List(a,b,c,d,f),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NegQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
IIntegrate(5081,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Power(Plus(d_,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(c,Power(f,-1)),Int(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1D2),x),x),Negate(Dist(Power(f,-1),Int(Times(Plus(Times(c,d),Times(CN1,a,f),Times(Plus(Times(c,e),Times(CN1,b,f)),x)),Power(Times(Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)))),Plus(d,Times(e,x),Times(f,Sqr(x)))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Sqr(e),Times(CN1,C4,d,f)),C0)))),
IIntegrate(5082,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Power(Plus(d_,Times(f_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(c,Power(f,-1)),Int(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1D2),x),x),Negate(Dist(Power(f,-1),Int(Times(Plus(Times(c,d),Times(CN1,a,f),Times(CN1,b,f,x)),Power(Times(Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)))),Plus(d,Times(f,Sqr(x)))),-1)),x),x))),And(FreeQ(List(a,b,c,d,f),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(5083,Int(Times(Sqrt(Plus(a_,Times(c_DEFAULT,Sqr(x_)))),Power(Plus(d_,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(c,Power(f,-1)),Int(Power(Plus(a,Times(c,Sqr(x))),CN1D2),x),x),Negate(Dist(Power(f,-1),Int(Times(Plus(Times(c,d),Times(CN1,a,f),Times(c,e,x)),Power(Times(Sqrt(Plus(a,Times(c,Sqr(x)))),Plus(d,Times(e,x),Times(f,Sqr(x)))),-1)),x),x))),And(FreeQ(List(a,c,d,e,f),x),NeQ(Plus(Sqr(e),Times(CN1,C4,d,f)),C0)))),
IIntegrate(5084,Int(Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Sqrt(Plus(d_,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(With(List(Set(r,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Dist(Times(Sqrt(Plus(b,r,Times(C2,c,x))),Sqrt(Plus(Times(C2,a),Times(Plus(b,r),x))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1D2)),Int(Power(Times(Sqrt(Plus(b,r,Times(C2,c,x))),Sqrt(Plus(Times(C2,a),Times(Plus(b,r),x))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Sqr(e),Times(CN1,C4,d,f)),C0)))),
IIntegrate(5085,Int(Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Sqrt(Plus(d_,Times(f_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(With(List(Set(r,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Dist(Times(Sqrt(Plus(b,r,Times(C2,c,x))),Sqrt(Plus(Times(C2,a),Times(Plus(b,r),x))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1D2)),Int(Power(Times(Sqrt(Plus(b,r,Times(C2,c,x))),Sqrt(Plus(Times(C2,a),Times(Plus(b,r),x))),Sqrt(Plus(d,Times(f,Sqr(x))))),-1),x),x)),And(FreeQ(List(a,b,c,d,f),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(5086,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,u_),Times(c_DEFAULT,Sqr(u_))),p_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,u_),Times(f_DEFAULT,Sqr(u_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),-1),Subst(Int(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),q)),x),x,u),x),And(FreeQ(List(a,b,c,d,e,f,p,q),x),LinearQ(u,x),NeQ(u,x)))),
IIntegrate(5087,Int(Times(Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(u_))),p_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,u_),Times(f_DEFAULT,Sqr(u_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),-1),Subst(Int(Times(Power(Plus(a,Times(c,Sqr(x))),p),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),q)),x),x,u),x),And(FreeQ(List(a,c,d,e,f,p,q),x),LinearQ(u,x),NeQ(u,x)))),
IIntegrate(5088,Int(Times(Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),Power(Plus(d_,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Dist(Power(Times(c,Power(f,-1)),p),Int(Times(Power(Plus(g,Times(h,x)),m),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),Plus(p,q))),x),x),And(FreeQ(List(a,b,c,d,e,f,g,h,p,q),x),EqQ(Plus(Times(c,d),Times(CN1,a,f)),C0),EqQ(Plus(Times(b,d),Times(CN1,a,e)),C0),Or(IntegerQ(p),GtQ(Times(c,Power(f,-1)),C0)),Or(Not(IntegerQ(q)),LessEqual(LeafCount(Plus(d,Times(e,x),Times(f,Sqr(x)))),LeafCount(Plus(a,Times(b,x),Times(c,Sqr(x))))))))),
IIntegrate(5089,Int(Times(Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),Power(Plus(d_,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Dist(Times(Power(a,IntPart(p)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),FracPart(p)),Power(Times(Power(d,IntPart(p)),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),FracPart(p))),-1)),Int(Times(Power(Plus(g,Times(h,x)),m),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),Plus(p,q))),x),x),And(FreeQ(List(a,b,c,d,e,f,g,h,p,q),x),EqQ(Plus(Times(c,d),Times(CN1,a,f)),C0),EqQ(Plus(Times(b,d),Times(CN1,a,e)),C0),Not(IntegerQ(p)),Not(IntegerQ(q)),Not(GtQ(Times(c,Power(f,-1)),C0))))),
IIntegrate(5090,Int(Times(Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),Power(Plus(d_,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),FracPart(p)),Power(Times(Power(Times(C4,c),IntPart(p)),Power(Plus(b,Times(C2,c,x)),Times(C2,FracPart(p)))),-1)),Int(Times(Power(Plus(g,Times(h,x)),m),Power(Plus(b,Times(C2,c,x)),Times(C2,p)),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),q)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,h,m,p,q),x),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0))))
  );
}
