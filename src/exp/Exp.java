package exp;

import interpretador.Memory;

//import interpretador.Memory;

public abstract class Exp {
	abstract public String print();
	abstract public int interpretExp(Exp e, Memory mem);
}
