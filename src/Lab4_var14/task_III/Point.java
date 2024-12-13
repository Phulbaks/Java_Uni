package Lab4_var14.task_III;

public class Point {
    private int x;
    private int y;

    //конструкторы
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // сеттер
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // геттеры
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    // расстояние до точки
    public double distanceFromOrigin() {
        return Math.sqrt((double) x * x + (double) y * y);
    }

    // Находиться ли точка в пределах прямоугольной области
    public boolean isInRectangle(Point topLeft, Point bottomRight) {
        return (topLeft.getX() <= this.x && this.x <= bottomRight.getX()) &&
                (topLeft.getY() >= this.y && this.y >= bottomRight.getY());
    }

    // находится ли точка внутри окружности
    public boolean isInCircle(Point center, double radius) {
        return Math.sqrt(Math.pow((double) this.x - center.getX(), 2) + Math.pow((double) this.y - center.getY(), 2)) <= radius;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }


    public static void main(String[] args) {
        Point3D p1 = new Point3D(3, 3, 3);
        Point3D center = new Point3D(0, 0, 0);

        System.out.println(p1.isInSphere(center, 5));
    }

}
class Point3D extends Point {
    private int z;

    // Конструкторы
    public Point3D() {
        super();
        this.z = 0;
    }
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    // геттер
    public int getZ() {
        return z;
    }

    // сеттеры
    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
        this.z = 0;
    }

    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);
        this.z = z;
    }

    // расстояние до точки в трехмерном пространстве
    @Override
    public double distanceFromOrigin() {
        return Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2) + Math.pow(this.z, 2));
    }

    // Находиться ли точка внутри трехмерного прямоугольного параллелепипеда
    public boolean isInBox(Point3D corner1, Point3D corner2) {
        // минимальные и максимальные значения для каждой оси
        int minX = Math.min(corner1.getX(), corner2.getX());
        int maxX = Math.max(corner1.getX(), corner2.getX());

        int minY = Math.min(corner1.getY(), corner2.getY());
        int maxY = Math.max(corner1.getY(), corner2.getY());

        int minZ = Math.min(corner1.getZ(), corner2.getZ());
        int maxZ = Math.max(corner1.getZ(), corner2.getZ());


        return (minX <= this.getX() && this.getX() <= maxX) &&
                (minY <= this.getY() && this.getY() <= maxY) &&
                (minZ <= this.z && this.z <= maxZ);
    }

    // Находится ли точка внутри сферы
    public boolean isInSphere(Point3D center, double radius) {
        // Вычисляем расстояние от точки до центра сферы
        double distance = Math.sqrt(Math.pow(this.getX() - center.getX(), 2) + Math.pow(this.getY() - center.getY(), 2) + Math.pow(this.z - center.getZ(), 2));
        // Проверяем, находится ли точка внутри сферы
        System.out.println("distance = " + distance);
        return distance <= radius;
    }


    @Override
    public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ", " + z + ")";
    }
}

