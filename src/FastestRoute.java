class FastestRoute implements Strategy {
    @Override
    public String buildRoute(String startPoint, String endPoint) {
        return "Calculating the fastest route from " + startPoint + " to " + endPoint + ".";
    }
}