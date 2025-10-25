class ShortestRoute implements Strategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("Calculating the shortest route from "
                + startPoint + " to " + endPoint + ".");
    }
}