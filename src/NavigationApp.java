class NavigationApp {
    private Strategy routeStrategy;

    public void setRouteStrategy(Strategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void navigate(String start, String end) {
        routeStrategy.buildRoute(start, end);
    }
}