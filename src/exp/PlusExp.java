package exp;

import interpretador.Memory;

public class PlusExp extends Exp {
	public Exp left, right;

	public PlusExp(Exp l, Exp r) {
		left = l;
		right = r;
	}

	@Override
	public String print() {		
		return left.print()+" + "+right.print();
	}

	@Override
	public int interpretExp(Exp e, Memory mem) {		
		return left.interpretExp(left, mem)+ right.interpretExp(right, mem);
	}
}
