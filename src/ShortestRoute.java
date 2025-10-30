class ShortestRoute implements Strategy {
    @Override
    public String buildRoute(String startPoint, String endPoint) {
        return "Calculating the shortest route from " + startPoint + " to " + endPoint + ".";
    }
}