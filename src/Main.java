public class Main {
    public static void main(String[] args) {
        NavigationApp app = new NavigationApp();

        app.setRouteStrategy(new ShortestRoute());
        app.navigate("Home", "University");

        app.setRouteStrategy(new FastestRoute());
        app.navigate("Home", "Airport");

        app.setRouteStrategy(new ScenicRoute());
        app.navigate("Home", "Mall");
    }
}