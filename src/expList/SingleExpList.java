package expList;

import interpretador.Memory;
import exp.Exp;

public class SingleExpList extends ExpList {
	public Exp exp;

	public SingleExpList(Exp e) {
		exp = e;
	}
	
	public String print(){
		return exp.print();
	}

//	@Override
//	int[] interpretExp(ExpList e, Memory mem) {	
//		int[] x = new int[1]; 
//		x[0]=exp.interpretExp(exp, mem);
//		return x;
//	}
}
