package exp;

import interpretador.Memory;

public class DivExp extends Exp {
	public Exp left, right;

	public DivExp(Exp l, Exp r) {
		left = l;
		right = r;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "("+left.print()+")/("+right.print()+")";
	}
	
	public int interpretExp(Exp e, Memory mem) {		
		return left.interpretExp(left, mem)/ right.interpretExp(right, mem);
	}
}
