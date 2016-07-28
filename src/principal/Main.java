package principal;

import interpretador.Memory;
import exp.EseqExp;
import exp.Exp;
import exp.IdExp;
import exp.MinusExp;
import exp.NumExp;
import exp.PlusExp;
import exp.TimesExp;
import expList.PairExpList;
import expList.SingleExpList;
import stm.AssignStm;
import stm.CompoundStm;
import stm.PrintStm;
import stm.Stm;

public class Main {

	public static void main(String[] args) {
		/*Stm prog = new CompoundStm(new AssignStm("a", 
											new PlusExp(new NumExp(5), 
													new NumExp(3))),
					   new CompoundStm(new AssignStm("b", new EseqExp(new PrintStm(
							   new PairExpList(new IdExp("a"), 
									   new SingleExpList(new MinusExp(new IdExp("a"), 
											   new NumExp(1))))), 
							   new TimesExp(new NumExp(10), new IdExp("a")))), 
					   new PrintStm(new SingleExpList(new IdExp("b")))));
			System.out.println(prog.print());
		*/
		Memory mem = new Memory();		
		Stm prog = new CompoundStm(new AssignStm("x",new NumExp(8)),new AssignStm("a",
				new PlusExp(new IdExp("x"),new NumExp(3))));
		prog.interpretStament(prog, mem);
		System.out.println(mem.lookup("a"));
	}
}
