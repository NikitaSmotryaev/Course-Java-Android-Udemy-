public class HomeWork {
    public static void main(String[] args) {
        boolean isNight = false;
        boolean isGoodWeather = true;
        boolean isGoodWeatherAndDay = !isNight && isGoodWeather;
        boolean isBadWeatherAndDay = !isNight && !isGoodWeather;

        if (isNight) {
            System.out.println("Спать");
        }
        if (isBadWeatherAndDay) {
            System.out.println("Читать книгу");
        }
        if (isGoodWeatherAndDay) {
            System.out.println("Гулять");
        }
    }
}
