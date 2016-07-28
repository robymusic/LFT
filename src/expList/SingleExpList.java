package expList;

import java.util.ArrayList;

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

	public ArrayList<Integer> interpretExp(ExpList e, Memory mem) {	
		ArrayList<Integer> ep = new ArrayList<Integer>(); 
		ep.add(exp.interpretExp(exp, mem));
		return ep;
	}
}
