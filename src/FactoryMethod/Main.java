package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        ShapeFactoryMethod shapeFactoryMethod = new ShapeFactoryMethod();
        String input = "oval";


        IShape shape = null;

//        shape = shapeFactoryMethod.getShape(input);
//        shape.draw();
//        input = "oval";

        shape = shapeFactoryMethod.getShape(input);
        shape.draw();
    }
}

class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}


class Oval implements IShape {

    @Override
    public void draw() {
        System.out.println("Drawing Oval");
    }
}

class NoneShape implements IShape {

    @Override
    public void draw() {
        System.out.println("No thing to draw");
    }
}

class ShapeFactoryMethod {
    public IShape getShape(String type) {

        type = type.trim();

        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        } else if (type.equalsIgnoreCase("oval")) {
            return new Oval();
        }

        return new NoneShape();
    }
}