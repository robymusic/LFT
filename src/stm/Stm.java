package stm;

import interpretador.Memory;

//import interpretador.Memory;

public abstract class Stm {
	abstract public String print();
	abstract public void interpretStament(Stm s, Memory mem);
}
