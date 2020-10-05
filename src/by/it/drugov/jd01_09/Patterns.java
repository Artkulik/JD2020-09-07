package by.it.drugov.jd01_09;

public interface Patterns {
    String OPERATION = "[-+*/]";
    String SCALAR = "-?[0-9]+\\.?[0-9]*";
    String VECTOR = "\\{(("+SCALAR+"),? ?)+\\}";
    String MATRIX ="\\{("+VECTOR+",?)+\\}";
}
