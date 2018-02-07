public class Robot {
    public  String id;
    public  static int count = 0;
    public Robot() {
        id = "Robot-";
        count++;
        id += id+count;
    }

    public static int getNumberOfRobots() {
        return count;
    }
}
