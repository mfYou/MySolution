import java.util.Scanner;

public class Main {
    static int minLen = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int num = Integer.parseInt(sn.nextLine().trim());
        Point[] points = new Point[num];
        for(int i = 0; i<num; i++){
            String[] locations = sn.nextLine().trim().split(",");
            points[i] = new Point(Integer.parseInt(locations[0]), Integer.parseInt(locations[1]));
        }
        Point start = new Point(0,0);
        System.out.println(caculate(start,points, 0, 0));
    }

    public static int caculate(Point start, Point[] points, int sum, int count){
        System.out.println(points.length);
        if (count == points.length){
            minLen = Math.min(minLen, sum+start.getLength(new Point(0,0)));
            return minLen;
        }

        for (int i = 0; i<points.length; i++){
            if (points[i].visited == false){
                System.out.println(points[i].toString());
                sum += points[i].getLength(start);
                if (sum<minLen){
                    points[i].visited = true;
                    caculate(points[i], points, sum, count+1);
                }
                sum -= points[i].getLength(start);
                points[i].visited = false;
            }
        }
        return minLen;
    }
}


class Point{
    int px;
    int py;
    boolean visited;

    public Point(int px, int py) {
        this.px = px;
        this.py = py;
        this.visited = false;
    }

    public int getLength(Point p){
        return Math.abs(px - p.px) + Math.abs(py - p.py);
    }

    @Override
    public String toString() {
        return "Point{" +
                "px=" + px +
                ", py=" + py +
                ", visited=" + visited +
                '}';
    }
}
