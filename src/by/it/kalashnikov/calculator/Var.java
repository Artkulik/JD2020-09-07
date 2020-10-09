package by.it.kalashnikov.calculator;

import java.util.HashMap;
import java.util.Map;

abstract class Var implements Operation {

   private static Map<String,Var> vars = new HashMap<>();

   static  Var saveVar(String name,Var var){
       vars.put(name,var);
       return var;
   }

    static Var createVar (String operand){
        operand=operand.trim().replace("\\s+","");
        if (operand.matches(Patterns.SCALAR))
            return new Scalar(operand);
        if (operand.matches(Patterns.VECTOR))
            return new Vector(operand);
        else if (vars.containsKey(operand))
            return vars.get(operand);
        return null;

    }

    @Override
    public Var add(Var other) {
        System.out.println("Операция "+this+"+"+other+" невозможна");
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("Операция "+this+"-"+other+" невозможна");
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("Операция "+this+"*"+other+" невозможна");
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("Операция "+this+"/"+other+" невозможна");
        return null;
    }
}
