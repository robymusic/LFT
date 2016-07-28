package stm;
import interpretador.Memory;
import expList.ExpList;

public class PrintStm extends Stm{
	public ExpList expos;
	
	public PrintStm(ExpList es){
		expos = es;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "print("+expos.print()+")";
	}

	@Override
	public void interpretStament(Stm s, Memory mem) {
		System.out.print(expos.interpretExp(expos, mem));
	}
}
