class ScenicRoute implements Strategy {
    @Override
    public String buildRoute(String startPoint, String endPoint) {
        return "Calculating the most scenic route from " + startPoint + " to " + endPoint + ".";
    }
}