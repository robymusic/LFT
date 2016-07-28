package expList;

import java.util.ArrayList;

import interpretador.Memory;
import exp.Exp;

public class PairExpList extends ExpList{
	public Exp head;
	public ExpList tail;
	public PairExpList(Exp e, ExpList l) { head=e; tail = l; }
	
	public String print() {		
		return (head.print() +", "+ tail.print());
	}

	@Override
	public ArrayList<Integer> interpretExp(ExpList e, Memory mem) {
		ArrayList<Integer> ep = new ArrayList<Integer>(); 
		ep.add(head.interpretExp(head, mem));
		tail.interpretExp(tail, mem);
		return ep;
	}

	
}
