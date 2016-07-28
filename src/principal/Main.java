package principal;

import java.util.ArrayList;

import interpretador.Memory;
import exp.EseqExp;
import exp.Exp;
import exp.IdExp;
import exp.MinusExp;
import exp.NumExp;
import exp.PlusExp;
import exp.TimesExp;
import expList.ExpList;
import expList.PairExpList;
import expList.SingleExpList;
import stm.AssignStm;
import stm.CompoundStm;
import stm.PrintStm;
import stm.Stm;

public class Main {

	public static void main(String[] args) {
		Memory mem = new Memory();
		
/* mini programa 1:  a:=5 + 3; b:=(print(a, a - 1), 10*a); print(b) */
		Stm prog = new CompoundStm(new AssignStm("a", 
											new PlusExp(new NumExp(5), 
													new NumExp(3))),
					   new CompoundStm(new AssignStm("b", new EseqExp(new PrintStm(
							   new PairExpList(new IdExp("a"), 
									   new SingleExpList(new MinusExp(new IdExp("a"), 
											   new NumExp(1))))), 
							   new TimesExp(new NumExp(10), new IdExp("a")))), 
					   new PrintStm(new SingleExpList(new IdExp("b")))));
			System.out.println(prog.print()+"\n");
			prog.interpretStament(prog, mem);
		

/* mini programa 2:  x:=8; a:=(print(x, x + 3), 5*x)	*/	
//		Stm prog = new CompoundStm(new AssignStm("x",new NumExp(8)),new AssignStm("a",
//				new EseqExp(new PrintStm(
//				   new PairExpList(new IdExp("x"), 
//						   new SingleExpList(new PlusExp(new IdExp("x"), 
//								   new NumExp(3))))), 
//				   new TimesExp(new NumExp(5), new IdExp("x")))));
//		
//		System.out.println(prog.print());
//		prog.interpretStament(prog, mem);
		
/*		imprimindo o valor de "a". */
//		System.out.println(mem.lookup("a"));
	}
}
