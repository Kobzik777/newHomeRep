package epam.ua;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Robot alfa1 = new Robot(12,15);
        Operator operator = new Operator("Вася", "Пупкин");
        operator.setRobot(alfa1);
        alfa1.setOperator(operator);
        alfa1.setCourse(50);
        alfa1.forward(50);
        alfa1.printCoordinates();
        alfa1.setCourse(50);
        alfa1.forward(50);
        alfa1.printCoordinates();
    }
}
