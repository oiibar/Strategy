class FastestRoute implements Strategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("Calculating the fastest route from "
                + startPoint + " to " + endPoint + ".");
    }
}