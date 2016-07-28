package stm;

import interpretador.Memory;
import exp.Exp;

public class AssignStm extends Stm{
	public String id;
	public Exp exp;
	
	public AssignStm(String i,Exp e){
		id=i; exp =e;
	}
	
	public String print() {
		return id.toString()+":="+ exp.print();
	}

	@Override
	public void interpretStament(Stm s, Memory mem) {
		mem.update(id, exp.interpretExp(exp, mem));		
	}
}
