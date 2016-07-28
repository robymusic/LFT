package stm;

import interpretador.Memory;

public class CompoundStm extends Stm {
	public Stm stm1, stm2;
	public CompoundStm(Stm s1, Stm s2){
		stm1 = s1; stm2 = s2;
	}
	
	public String print() {	
		return stm1.print()+"; "+ stm2.print();
	}

	@Override
	public void interpretStament(Stm s, Memory mem) {
		stm1.interpretStament(stm1, mem);
		stm2.interpretStament(stm2, mem);		
	}
}
