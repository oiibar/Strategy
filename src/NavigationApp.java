class NavigationApp {
    private Strategy routeStrategy;

    public void setRouteStrategy(Strategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void navigate(String start, String end) {
        if (routeStrategy == null) {
            throw new IllegalStateException("No route strategy selected!");
        }
        routeStrategy.buildRoute(start, end);
    }
}