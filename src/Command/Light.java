package Command;
public class Light {
    private int brightness;

    public void dim(int brightness) {
        this.brightness = brightness;
        System.out.println("Light dimmed to " + brightness + "%");
    }

    public int getBrightness() {
        return brightness;
    }
}
