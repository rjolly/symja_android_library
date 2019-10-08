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
public class IntRules186 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(4651,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Subtract(Simp(Times(x,Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),CN1)),x),Dist(Times(b,c,n,Power(d,CN1D2)),Int(Times(x,Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Subtract(n,C1)),Power(Plus(d,Times(e,Sqr(x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),GtQ(d,C0))));
IIntegrate(4652,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),CN1)),x),Dist(Times(b,c,n,Power(d,CN1D2)),Int(Times(x,Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Subtract(n,C1)),Power(Plus(d,Times(e,Sqr(x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),GtQ(d,C0))));
IIntegrate(4653,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Subtract(Simp(Times(x,Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),CN1)),x),Dist(Times(b,c,n,Sqrt(Subtract(C1,Times(Sqr(c),Sqr(x)))),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),CN1)),Int(Times(x,Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Subtract(n,C1)),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0))));
IIntegrate(4654,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),CN1)),x),Dist(Times(b,c,n,Sqrt(Subtract(C1,Times(Sqr(c),Sqr(x)))),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),CN1)),Int(Times(x,Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Subtract(n,C1)),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0))));
IIntegrate(4655,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Times(C2,d,Plus(p,C1)),CN1)),x)),Dist(Times(Plus(Times(C2,p),C3),Power(Times(C2,d,Plus(p,C1)),CN1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),Dist(Times(b,c,n,Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(C2,Plus(p,C1),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),FracPart(p))),CN1)),Int(Times(x,Power(Subtract(C1,Times(Sqr(c),Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Subtract(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),LtQ(p,CN1),NeQ(p,QQ(-3L,2L)))));
IIntegrate(4656,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Times(C2,d,Plus(p,C1)),CN1)),x)),Dist(Times(Plus(Times(C2,p),C3),Power(Times(C2,d,Plus(p,C1)),CN1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),Negate(Dist(Times(b,c,n,Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(C2,Plus(p,C1),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),FracPart(p))),CN1)),Int(Times(x,Power(Subtract(C1,Times(Sqr(c),Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Subtract(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),LtQ(p,CN1),NeQ(p,QQ(-3L,2L)))));
IIntegrate(4657,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Dist(Power(Times(c,d),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Sec(x)),x),x,ArcSin(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(n,C0))));
IIntegrate(4658,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Negate(Dist(Power(Times(c,d),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Csc(x)),x),x,ArcCos(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(n,C0))));
IIntegrate(4659,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Sqrt(Subtract(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),CN1)),x),Dist(Times(c,Plus(Times(C2,p),C1),Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(b,Plus(n,C1),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),FracPart(p))),CN1)),Int(Times(x,Power(Subtract(C1,Times(Sqr(c),Sqr(x))),Subtract(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(n,CN1))));
IIntegrate(4660,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Subtract(Negate(Simp(Times(Sqrt(Subtract(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),CN1)),x)),Dist(Times(c,Plus(Times(C2,p),C1),Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(b,Plus(n,C1),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),FracPart(p))),CN1)),Int(Times(x,Power(Subtract(C1,Times(Sqr(c),Sqr(x))),Subtract(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(n,CN1))));
IIntegrate(4661,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(d,p),Power(c,CN1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Cos(x),Plus(Times(C2,p),C1))),x),x,ArcSin(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(Times(C2,p),C0),Or(IntegerQ(p),GtQ(d,C0)))));
IIntegrate(4662,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Times(Power(d,p),Power(c,CN1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Sin(x),Plus(Times(C2,p),C1))),x),x,ArcCos(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(Times(C2,p),C0),Or(IntegerQ(p),GtQ(d,C0)))));
IIntegrate(4663,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(d,Subtract(p,C1D2)),Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1D2)),Int(Times(Power(Subtract(C1,Times(Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(Times(C2,p),C0),Not(Or(IntegerQ(p),GtQ(d,C0))))));
IIntegrate(4664,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(d,Subtract(p,C1D2)),Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1D2)),Int(Times(Power(Subtract(C1,Times(Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(Times(C2,p),C0),Not(Or(IntegerQ(p),GtQ(d,C0))))));
IIntegrate(4665,Int(Times(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(d,Times(e,Sqr(x))),p),x))),Subtract(Dist(Plus(a,Times(b,ArcSin(Times(c,x)))),u,x),Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(Sqr(c),d),e),C0),Or(IGtQ(p,C0),ILtQ(Plus(p,C1D2),C0)))));
IIntegrate(4666,Int(Times(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(d,Times(e,Sqr(x))),p),x))),Plus(Dist(Plus(a,Times(b,ArcCos(Times(c,x)))),u,x),Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(Sqr(c),d),e),C0),Or(IGtQ(p,C0),ILtQ(Plus(p,C1D2),C0)))));
IIntegrate(4667,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Plus(d,Times(e,Sqr(x))),p),x),x),And(FreeQ(List(a,b,c,d,e,n),x),NeQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(p),Or(GtQ(p,C0),IGtQ(n,C0)))));
IIntegrate(4668,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Plus(d,Times(e,Sqr(x))),p),x),x),And(FreeQ(List(a,b,c,d,e,n),x),NeQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(p),Or(GtQ(p,C0),IGtQ(n,C0)))));
IIntegrate(4669,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,n,p),x)));
IIntegrate(4670,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,n,p),x)));
IIntegrate(4671,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),q_)),x_Symbol),
    Condition(Dist(Power(Times(CN1,Sqr(d),g,Power(e,CN1)),q),Int(Times(Power(Plus(d,Times(e,x)),Subtract(p,q)),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),q),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n),x),EqQ(Plus(Times(e,f),Times(d,g)),C0),EqQ(Subtract(Times(Sqr(c),Sqr(d)),Sqr(e)),C0),HalfIntegerQ(p,q),GeQ(Subtract(p,q),C0),GtQ(d,C0),LtQ(Times(g,Power(e,CN1)),C0))));
IIntegrate(4672,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),q_)),x_Symbol),
    Condition(Dist(Power(Times(CN1,Sqr(d),g,Power(e,CN1)),q),Int(Times(Power(Plus(d,Times(e,x)),Subtract(p,q)),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),q),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n),x),EqQ(Plus(Times(e,f),Times(d,g)),C0),EqQ(Subtract(Times(Sqr(c),Sqr(d)),Sqr(e)),C0),HalfIntegerQ(p,q),GeQ(Subtract(p,q),C0),GtQ(d,C0),LtQ(Times(g,Power(e,CN1)),C0))));
IIntegrate(4673,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),q_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(d,Times(e,x)),q),Power(Plus(f,Times(g,x)),q),Power(Power(Subtract(C1,Times(Sqr(c),Sqr(x))),q),CN1)),Int(Times(Power(Plus(d,Times(e,x)),Subtract(p,q)),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),q),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n),x),EqQ(Plus(Times(e,f),Times(d,g)),C0),EqQ(Subtract(Times(Sqr(c),Sqr(d)),Sqr(e)),C0),HalfIntegerQ(p,q),GeQ(Subtract(p,q),C0))));
IIntegrate(4674,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),q_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(d,Times(e,x)),q),Power(Plus(f,Times(g,x)),q),Power(Power(Subtract(C1,Times(Sqr(c),Sqr(x))),q),CN1)),Int(Times(Power(Plus(d,Times(e,x)),Subtract(p,q)),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),q),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n),x),EqQ(Plus(Times(e,f),Times(d,g)),C0),EqQ(Subtract(Times(Sqr(c),Sqr(d)),Sqr(e)),C0),HalfIntegerQ(p,q),GeQ(Subtract(p,q),C0))));
IIntegrate(4675,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Negate(Dist(Power(e,CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Tan(x)),x),x,ArcSin(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(n,C0))));
  }
}
}