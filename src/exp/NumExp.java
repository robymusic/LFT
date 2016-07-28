package exp;

import interpretador.Memory;

public class NumExp extends Exp{
	public int num;
	
	public NumExp(int n){
		num=n;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return String.valueOf(num);
	}
	
	public int interpretExp(Exp e, Memory mem) {		
		return num;
	}
}
