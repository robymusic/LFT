package exp;

import interpretador.Memory;
import stm.Stm;

public class EseqExp extends Exp {
	public Stm stm;
	public Exp exp;

	public EseqExp(Stm s, Exp e) {
		stm = s;
		exp = e;
	}


	public String print() {		
		return "("+stm.print()+", "+exp.print()+")";
	}
	
	public int interpretExp(Exp e, Memory mem) {		
		stm.interpretStament(stm, mem);
		return exp.interpretExp(exp, mem);
	}

}
