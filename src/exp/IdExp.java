package exp;

import interpretador.Memory;

public class IdExp extends Exp{
	public String id;
	
	public IdExp(String i){
		id = i;
	}

	@Override
	public String print() {		
		return id.toString();
	}

	@Override
	public int interpretExp(Exp e, Memory mem) {		
		return mem.lookup(id);
	}
	
}
