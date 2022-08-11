package lesson08.Homework_Figure;

/**
 * Задача 1. Написать иерархию классов «Фигуры».
 * Фигура -> Треугольник -> Прямоугольник -> Круг.
 * Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра.
 * Создать массив из 5 фигур.
 * Вывести на экран сумму периметра всех фигур в массиве.
 */

public class MainFigure {

    public static void main(String[] args) {

        Figure circle1 = new Circle(50);
        System.out.printf("""
                        Площадь круга равна - %.3f
                        Периметр круга равен - %.3f
                        """,
                circle1.areaCalculation(), circle1.perimeterCalculation());
        System.out.println();

        Figure circle2 = new Circle(100);
        System.out.printf("""
                        Площадь круга равна - %.3f
                        Периметр круга равен - %.3f
                        """,
                circle2.areaCalculation(), circle2.perimeterCalculation());
        System.out.println();

        Figure rectangle1 = new Rectangle(3, 4);
        System.out.printf("""
                        Площадь прямоугольника равна - %.1f
                        Периметр прямоугольника равен - %.1f
                        """,
                rectangle1.areaCalculation(), rectangle1.perimeterCalculation());
        System.out.println();

        Figure rectangle2 = new Rectangle(5, 10);
        System.out.printf("""
                        Площадь прямоугольника равна - %.1f
                        Периметр прямоугольника равен - %.1f
                        """,
                rectangle2.areaCalculation(), rectangle2.perimeterCalculation());
        System.out.println();

        Figure triangle = new Triangle(10, 7, 8);
        System.out.printf("""
                        Площадь треугольника равна - %.3f
                        Периметр треугольника равен - %.1f
                        """,
                triangle.areaCalculation(), triangle.perimeterCalculation());
        System.out.println();

        Figure[] figures = {circle1, circle2, rectangle1, rectangle2, triangle};
        double sumPerimeters = 0;
        for (Figure figure : figures) {
            sumPerimeters += figure.perimeterCalculation();
        }
        System.out.printf("Сумма периметров всех фигур в массиве - %.3f", sumPerimeters);

    }
}
