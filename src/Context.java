class Context {
    private Strategy routeStrategy;

    public void setRouteStrategy(Strategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public String navigate(String start, String end) {
        return routeStrategy.buildRoute(start, end);
    }
}