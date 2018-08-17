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
public class IntRules100 { 
  public static IAST RULES = List( 
IIntegrate(8971,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Times(b,c,d,Plus(q,C1)),-1)),x)),Dist(Times(p,Power(Plus(q,C1),-1)),Int(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),IGtQ(p,C0),IGeQ(q,p)))),
IIntegrate(8972,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Times(b,c,d,Plus(q,C1)),-1)),x),Dist(Times(p,Power(Plus(q,C1),-1)),Int(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),IGtQ(p,C0),IGeQ(q,p)))),
IIntegrate(8973,Int(Times(Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),-1),ArcTan(Times(a_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,CI),Int(Times(Log(Plus(C1,Times(CN1,CI,a,x))),Power(Plus(c,Times(d,Power(x,n))),-1)),x),x),Negate(Dist(Times(C1D2,CI),Int(Times(Log(Plus(C1,Times(CI,a,x))),Power(Plus(c,Times(d,Power(x,n))),-1)),x),x))),And(FreeQ(List(a,c,d),x),IntegerQ(n),Not(And(EqQ(n,C2),EqQ(d,Times(Sqr(a),c))))))),
IIntegrate(8974,Int(Times(Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),-1),ArcCot(Times(a_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,CI),Int(Times(Log(Plus(C1,Times(CN1,CI,Power(Times(a,x),-1)))),Power(Plus(c,Times(d,Power(x,n))),-1)),x),x),Negate(Dist(Times(C1D2,CI),Int(Times(Log(Plus(C1,Times(CI,Power(Times(a,x),-1)))),Power(Plus(c,Times(d,Power(x,n))),-1)),x),x))),And(FreeQ(List(a,c,d),x),IntegerQ(n),Not(And(EqQ(n,C2),EqQ(d,Times(Sqr(a),c))))))),
IIntegrate(8975,Int(Times(Power(x_,-1),ArcTan(Times(c_DEFAULT,Power(x_,n_DEFAULT))),Log(Times(d_DEFAULT,Power(x_,m_DEFAULT)))),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,CI),Int(Times(Log(Times(d,Power(x,m))),Log(Plus(C1,Times(CN1,CI,c,Power(x,n)))),Power(x,-1)),x),x),Negate(Dist(Times(C1D2,CI),Int(Times(Log(Times(d,Power(x,m))),Log(Plus(C1,Times(CI,c,Power(x,n)))),Power(x,-1)),x),x))),FreeQ(List(c,d,m,n),x))),
IIntegrate(8976,Int(Times(Power(x_,-1),ArcCot(Times(c_DEFAULT,Power(x_,n_DEFAULT))),Log(Times(d_DEFAULT,Power(x_,m_DEFAULT)))),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,CI),Int(Times(Log(Times(d,Power(x,m))),Log(Plus(C1,Times(CN1,CI,Power(Times(c,Power(x,n)),-1)))),Power(x,-1)),x),x),Negate(Dist(Times(C1D2,CI),Int(Times(Log(Times(d,Power(x,m))),Log(Plus(C1,Times(CI,Power(Times(c,Power(x,n)),-1)))),Power(x,-1)),x),x))),FreeQ(List(c,d,m,n),x))),
IIntegrate(8977,Int(Times(Power(x_,-1),Plus(a_,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),Log(Times(d_DEFAULT,Power(x_,m_DEFAULT)))),x_Symbol),
    Condition(Plus(Dist(a,Int(Times(Log(Times(d,Power(x,m))),Power(x,-1)),x),x),Dist(b,Int(Times(Log(Times(d,Power(x,m))),ArcTan(Times(c,Power(x,n))),Power(x,-1)),x),x)),FreeQ(List(a,b,c,d,m,n),x))),
IIntegrate(8978,Int(Times(Power(x_,-1),Plus(a_,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),Log(Times(d_DEFAULT,Power(x_,m_DEFAULT)))),x_Symbol),
    Condition(Plus(Dist(a,Int(Times(Log(Times(d,Power(x,m))),Power(x,-1)),x),x),Dist(b,Int(Times(Log(Times(d,Power(x,m))),ArcCot(Times(c,Power(x,n))),Power(x,-1)),x),x)),FreeQ(List(a,b,c,d,m,n),x))),
IIntegrate(8979,Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(x,Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Plus(a,Times(b,ArcTan(Times(c,x))))),x),Negate(Dist(Times(b,c),Int(Times(x,Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x)),Negate(Dist(Times(C2,e,g),Int(Times(Sqr(x),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Plus(f,Times(g,Sqr(x))),-1)),x),x))),FreeQ(List(a,b,c,d,e,f,g),x))),
IIntegrate(8980,Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(x,Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Plus(a,Times(b,ArcCot(Times(c,x))))),x),Dist(Times(b,c),Int(Times(x,Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x),Negate(Dist(Times(C2,e,g),Int(Times(Sqr(x),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Plus(f,Times(g,Sqr(x))),-1)),x),x))),FreeQ(List(a,b,c,d,e,f,g),x))),
IIntegrate(8981,Int(Times(Power(x_,-1),ArcTan(Times(c_DEFAULT,x_)),Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Dist(Plus(Log(Plus(f,Times(g,Sqr(x)))),Negate(Log(Plus(C1,Times(CN1,CI,c,x)))),Negate(Log(Plus(C1,Times(CI,c,x))))),Int(Times(ArcTan(Times(c,x)),Power(x,-1)),x),x),Dist(Times(C1D2,CI),Int(Times(Sqr(Log(Plus(C1,Times(CN1,CI,c,x)))),Power(x,-1)),x),x),Negate(Dist(Times(C1D2,CI),Int(Times(Sqr(Log(Plus(C1,Times(CI,c,x)))),Power(x,-1)),x),x))),And(FreeQ(List(c,f,g),x),EqQ(g,Times(Sqr(c),f))))),
IIntegrate(8982,Int(Times(Power(x_,-1),ArcCot(Times(c_DEFAULT,x_)),Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Dist(Plus(Log(Plus(f,Times(g,Sqr(x)))),Negate(Log(Times(Sqr(c),Sqr(x)))),Negate(Log(Plus(C1,Times(CN1,CI,Power(Times(c,x),-1))))),Negate(Log(Plus(C1,Times(CI,Power(Times(c,x),-1)))))),Int(Times(ArcCot(Times(c,x)),Power(x,-1)),x),x),Dist(Times(C1D2,CI),Int(Times(Sqr(Log(Plus(C1,Times(CN1,CI,Power(Times(c,x),-1))))),Power(x,-1)),x),x),Negate(Dist(Times(C1D2,CI),Int(Times(Sqr(Log(Plus(C1,Times(CI,Power(Times(c,x),-1))))),Power(x,-1)),x),x)),Int(Times(Log(Times(Sqr(c),Sqr(x))),ArcCot(Times(c,x)),Power(x,-1)),x)),And(FreeQ(List(c,f,g),x),EqQ(g,Times(Sqr(c),f))))),
IIntegrate(8983,Int(Times(Power(x_,-1),Plus(a_,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Dist(a,Int(Times(Log(Plus(f,Times(g,Sqr(x)))),Power(x,-1)),x),x),Dist(b,Int(Times(Log(Plus(f,Times(g,Sqr(x)))),ArcTan(Times(c,x)),Power(x,-1)),x),x)),FreeQ(List(a,b,c,f,g),x))),
IIntegrate(8984,Int(Times(Power(x_,-1),Plus(a_,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Dist(a,Int(Times(Log(Plus(f,Times(g,Sqr(x)))),Power(x,-1)),x),x),Dist(b,Int(Times(Log(Plus(f,Times(g,Sqr(x)))),ArcCot(Times(c,x)),Power(x,-1)),x),x)),FreeQ(List(a,b,c,f,g),x))),
IIntegrate(8985,Int(Times(Power(x_,-1),Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),Plus(d_,Times(e_DEFAULT,Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Dist(d,Int(Times(Plus(a,Times(b,ArcTan(Times(c,x)))),Power(x,-1)),x),x),Dist(e,Int(Times(Log(Plus(f,Times(g,Sqr(x)))),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(x,-1)),x),x)),FreeQ(List(a,b,c,d,e,f,g),x))),
IIntegrate(8986,Int(Times(Power(x_,-1),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),Plus(d_,Times(e_DEFAULT,Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Dist(d,Int(Times(Plus(a,Times(b,ArcCot(Times(c,x)))),Power(x,-1)),x),x),Dist(e,Int(Times(Log(Plus(f,Times(g,Sqr(x)))),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(x,-1)),x),x)),FreeQ(List(a,b,c,d,e,f,g),x))),
IIntegrate(8987,Int(Times(Power(x_,m_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Plus(m,C1),-1)),x),Negate(Dist(Times(b,c,Power(Plus(m,C1),-1)),Int(Times(Power(x,Plus(m,C1)),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x)),Negate(Dist(Times(C2,e,g,Power(Plus(m,C1),-1)),Int(Times(Power(x,Plus(m,C2)),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Plus(f,Times(g,Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),ILtQ(Times(C1D2,m),C0)))),
IIntegrate(8988,Int(Times(Power(x_,m_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Plus(m,C1),-1)),x),Dist(Times(b,c,Power(Plus(m,C1),-1)),Int(Times(Power(x,Plus(m,C1)),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x),Negate(Dist(Times(C2,e,g,Power(Plus(m,C1),-1)),Int(Times(Power(x,Plus(m,C2)),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Plus(f,Times(g,Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),ILtQ(Times(C1D2,m),C0)))),
IIntegrate(8989,Int(Times(Power(x_,m_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(x,m),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x))))))),x))),Plus(Dist(Plus(a,Times(b,ArcTan(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(ExpandIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g),x),IGtQ(Times(C1D2,Plus(m,C1)),C0)))),
IIntegrate(8990,Int(Times(Power(x_,m_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(x,m),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x))))))),x))),Plus(Dist(Plus(a,Times(b,ArcCot(Times(c,x)))),u,x),Dist(Times(b,c),Int(ExpandIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),IGtQ(Times(C1D2,Plus(m,C1)),C0)))),
IIntegrate(8991,Int(Times(Power(x_,m_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(x,m),Plus(a,Times(b,ArcTan(Times(c,x))))),x))),Plus(Dist(Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),u,x),Negate(Dist(Times(C2,e,g),Int(ExpandIntegrand(Times(x,u,Power(Plus(f,Times(g,Sqr(x))),-1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g),x),IntegerQ(m),NeQ(m,CN1)))),
IIntegrate(8992,Int(Times(Power(x_,m_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(x,m),Plus(a,Times(b,ArcCot(Times(c,x))))),x))),Plus(Dist(Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),u,x),Negate(Dist(Times(C2,e,g),Int(ExpandIntegrand(Times(x,u,Power(Plus(f,Times(g,Sqr(x))),-1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g),x),IntegerQ(m),NeQ(m,CN1)))),
IIntegrate(8993,Int(Times(x_,Sqr(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_))))),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(f,Times(g,Sqr(x))),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Sqr(Plus(a,Times(b,ArcTan(Times(c,x))))),Power(Times(C2,g),-1)),x),Negate(Dist(Times(b,Power(c,-1)),Int(Times(Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Plus(a,Times(b,ArcTan(Times(c,x))))),x),x)),Dist(Times(b,c,e),Int(Times(Sqr(x),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x),Negate(Simp(Times(C1D2,e,Sqr(x),Sqr(Plus(a,Times(b,ArcTan(Times(c,x)))))),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(g,Times(Sqr(c),f))))),
IIntegrate(8994,Int(Times(x_,Sqr(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_))))),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(f,Times(g,Sqr(x))),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Sqr(Plus(a,Times(b,ArcCot(Times(c,x))))),Power(Times(C2,g),-1)),x),Dist(Times(b,Power(c,-1)),Int(Times(Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Plus(a,Times(b,ArcCot(Times(c,x))))),x),x),Negate(Dist(Times(b,c,e),Int(Times(Sqr(x),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x)),Negate(Simp(Times(C1D2,e,Sqr(x),Sqr(Plus(a,Times(b,ArcCot(Times(c,x)))))),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(g,Times(Sqr(c),f))))),
IIntegrate(8995,Int(ArcTan(Times(c_DEFAULT,Power(x_,n_))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcTan(Times(c,Power(x,n)))),x),Negate(Dist(Times(c,n),Int(Times(Power(x,n),Power(Plus(C1,Times(Sqr(c),Power(x,Times(C2,n)))),-1)),x),x))),FreeQ(List(c,n),x))),
IIntegrate(8996,Int(ArcCot(Times(c_DEFAULT,Power(x_,n_))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCot(Times(c,Power(x,n)))),x),Dist(Times(c,n),Int(Times(Power(x,n),Power(Plus(C1,Times(Sqr(c),Power(x,Times(C2,n)))),-1)),x),x)),FreeQ(List(c,n),x))),
IIntegrate(8997,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(C1D2,CI,b,Log(Plus(C1,Times(CN1,CI,c,Power(x,n))))),Times(CN1,C1D2,CI,b,Log(Plus(C1,Times(CI,c,Power(x,n)))))),p),x),x),And(FreeQ(List(a,b,c,n),x),IGtQ(p,C0),IntegerQ(n)))),
IIntegrate(8998,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(C1D2,CI,b,Log(Plus(C1,Times(CN1,CI,Power(Times(Power(x,n),c),-1))))),Times(CN1,C1D2,CI,b,Log(Plus(C1,Times(CI,Power(Times(Power(x,n),c),-1)))))),p),x),x),And(FreeQ(List(a,b,c,n),x),IGtQ(p,C0),IntegerQ(n)))),
IIntegrate(8999,Int(Times(Power(x_,-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,Power(x_,n_))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(x,-1)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,n),x),IGtQ(p,C0)))),
IIntegrate(9000,Int(Times(Power(x_,-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,Power(x_,n_))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(x,-1)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,n),x),IGtQ(p,C0)))),
IIntegrate(9001,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,Power(x_,n_)))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),Plus(a,Times(b,ArcTan(Times(c,Power(x,n))))),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,c,n,Power(Times(d,Plus(m,C1)),-1)),Int(Times(Power(x,Plus(n,Negate(C1))),Power(Times(d,x),Plus(m,C1)),Power(Plus(C1,Times(Sqr(c),Power(x,Times(C2,n)))),-1)),x),x))),And(FreeQ(List(a,b,c,d,m,n),x),NeQ(m,CN1)))),
IIntegrate(9002,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,Power(x_,n_)))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),Plus(a,Times(b,ArcCot(Times(c,Power(x,n))))),Power(Times(d,Plus(m,C1)),-1)),x),Dist(Times(b,c,n,Power(Times(d,Plus(m,C1)),-1)),Int(Times(Power(x,Plus(n,Negate(C1))),Power(Times(d,x),Plus(m,C1)),Power(Plus(C1,Times(Sqr(c),Power(x,Times(C2,n)))),-1)),x),x)),And(FreeQ(List(a,b,c,d,m,n),x),NeQ(m,CN1)))),
IIntegrate(9003,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(d,x),m),Power(Plus(a,Times(C1D2,CI,b,Log(Plus(C1,Times(CN1,CI,c,Power(x,n))))),Times(CN1,C1D2,CI,b,Log(Plus(C1,Times(CI,c,Power(x,n)))))),p)),x),x),And(FreeQ(List(a,b,c,d,m,n),x),IGtQ(p,C0),IntegerQ(m),IntegerQ(n)))),
IIntegrate(9004,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(d,x),m),Power(Plus(a,Times(C1D2,CI,b,Log(Plus(C1,Times(CN1,CI,Power(Times(Power(x,n),c),-1))))),Times(CN1,C1D2,CI,b,Log(Plus(C1,Times(CI,Power(Times(Power(x,n),c),-1)))))),p)),x),x),And(FreeQ(List(a,b,c,d,m,n),x),IGtQ(p,C0),IntegerQ(m),IntegerQ(n)))),
IIntegrate(9005,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Plus(c_,Times(d_DEFAULT,x_))))),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Power(Plus(a,Times(b,ArcTan(x))),p),x),x,Plus(c,Times(d,x))),x),And(FreeQ(List(a,b,c,d),x),IGtQ(p,C0)))),
IIntegrate(9006,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Plus(c_,Times(d_DEFAULT,x_))))),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Power(Plus(a,Times(b,ArcCot(x))),p),x),x,Plus(c,Times(d,x))),x),And(FreeQ(List(a,b,c,d),x),IGtQ(p,C0)))),
IIntegrate(9007,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Plus(c_,Times(d_DEFAULT,x_))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Times(Power(Times(f,x,Power(d,-1)),m),Power(Plus(a,Times(b,ArcTan(x))),p)),x),x,Plus(c,Times(d,x))),x),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(d,e),Times(CN1,c,f)),C0),IGtQ(p,C0)))),
IIntegrate(9008,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Plus(c_,Times(d_DEFAULT,x_))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Times(Power(Times(f,x,Power(d,-1)),m),Power(Plus(a,Times(b,ArcCot(x))),p)),x),x,Plus(c,Times(d,x))),x),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(d,e),Times(CN1,c,f)),C0),IGtQ(p,C0)))),
IIntegrate(9009,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Plus(c_,Times(d_DEFAULT,x_))))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcTan(Plus(c,Times(d,x))))),p),Power(Times(f,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,d,p,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcTan(Plus(c,Times(d,x))))),Plus(p,Negate(C1))),Power(Plus(C1,Sqr(Plus(c,Times(d,x)))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),ILtQ(m,CN1)))),
IIntegrate(9010,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Plus(c_,Times(d_DEFAULT,x_))))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcCot(Plus(c,Times(d,x))))),p),Power(Times(f,Plus(m,C1)),-1)),x),Dist(Times(b,d,p,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcCot(Plus(c,Times(d,x))))),Plus(p,Negate(C1))),Power(Plus(C1,Sqr(Plus(c,Times(d,x)))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),ILtQ(m,CN1)))),
IIntegrate(9011,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Plus(c_,Times(d_DEFAULT,x_))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Times(Power(Plus(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1)),Times(f,x,Power(d,-1))),m),Power(Plus(a,Times(b,ArcTan(x))),p)),x),x,Plus(c,Times(d,x))),x),And(FreeQ(List(a,b,c,d,e,f,m,p),x),IGtQ(p,C0)))),
IIntegrate(9012,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Plus(c_,Times(d_DEFAULT,x_))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Times(Power(Plus(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1)),Times(f,x,Power(d,-1))),m),Power(Plus(a,Times(b,ArcCot(x))),p)),x),x,Plus(c,Times(d,x))),x),And(FreeQ(List(a,b,c,d,e,f,m,p),x),IGtQ(p,C0))))
  );
}
