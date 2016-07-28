package expList;

import java.util.ArrayList;

import interpretador.Memory;
import exp.Exp;

public abstract class ExpList {
	abstract public String print();
	abstract public ArrayList<Integer> interpretExp(ExpList e, Memory mem);
}
