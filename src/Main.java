public class Main {
    public static void main(String[] args) {
        Context app = new Context();

        app.setRouteStrategy(new ShortestRoute());
        System.out.println(app.navigate("Home", "University"));

        app.setRouteStrategy(new FastestRoute());
        System.out.println(app.navigate("Home", "Airport"));

        app.setRouteStrategy(new ScenicRoute());
        System.out.println(app.navigate("Home", "Mall"));
    }
}