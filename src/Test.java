public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Triangle triangle = new Triangle();
        System.out.println(triangle);
        System.out.println("Triangle Area is:" +triangle.getArea());
        System.out.println("Triangle Perimeter is:" +triangle.getPerimeter());

        triangle = new Triangle(5,6,8,"red",true);
        System.out.println("Triangle Area is:" +triangle.getArea());
        System.out.println("Triangle Perimeter is:" +triangle.getPerimeter());


    }

}
