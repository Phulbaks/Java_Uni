package Lab4_var14.task_IV;

class Point {
    private double x, y;

    // Конструкторы
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Геттеры
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Пересечение двух отрезков
    public static Point findIntersection(Point p1, Point p2, Point q1, Point q2) {
        double a1 = p2.getY() - p1.getY();
        double b1 = p1.getX() - p2.getX();
        double c1 = a1 * p1.getX() + b1 * p1.getY();

        double a2 = q2.getY() - q1.getY();
        double b2 = q1.getX() - q2.getX();
        double c2 = a2 * q1.getX() + b2 * q1.getY();

        double determinant = a1 * b2 - a2 * b1;

        if (determinant == 0) {
            return null; // Прямые параллельны или совпадают
        }

        // Координаты точки пересечения
        double x = (b2 * c1 - b1 * c2) / determinant;
        double y = (a1 * c2 - a2 * c1) / determinant;

        // принадлежность к отрезкам
        if (isBetween(p1.getX(), p2.getX(), x) &&
                isBetween(p1.getY(), p2.getY(), y) &&
                isBetween(q1.getX(), q2.getX(), x) &&
                isBetween(q1.getY(), q2.getY(), y)) {
            return new Point(x, y);
        }

        return null; // Пересечение вне отрезков
    }

    private static boolean isBetween(double a, double b, double c) {
        return Math.min(a, b) <= c && c <= Math.max(a, b);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Point3D extends Point {
    private double z;

    // Конструкторы
    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    // пересечение двух линий в 3D
    public static Point3D findIntersection(Point3D p1, Point3D p2, Point3D q1, Point3D q2) {
        double[] direction1 = {p2.getX() - p1.getX(), p2.getY() - p1.getY(), p2.getZ() - p1.getZ()};
        double[] direction2 = {q2.getX() - q1.getX(), q2.getY() - q1.getY(), q2.getZ() - q1.getZ()};

        double t = ((q1.getX() - p1.getX()) * direction2[0] +
                (q1.getY() - p1.getY()) * direction2[1] +
                (q1.getZ() - p1.getZ()) * direction2[2]) /
                (direction1[0] * direction2[0] +
                        direction1[1] * direction2[1] +
                        direction1[2] * direction2[2]);

        double x = p1.getX() + t * direction1[0];
        double y = p1.getY() + t * direction1[1];
        double z = p1.getZ() + t * direction1[2];

        return new Point3D(x, y, z);
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}

