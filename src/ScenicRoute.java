class ScenicRoute implements Strategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("Calculating the most scenic route from "
                + startPoint + " to " + endPoint + ".");
    }
}