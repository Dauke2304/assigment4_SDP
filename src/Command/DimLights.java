package Command;

public class DimLights implements Command {
    private Light light;
    private int previousBrightness;
    private int newBrightness;

    public DimLights(Light light, int newBrightness) {
        this.light = light;
        this.newBrightness = newBrightness;
    }

    @Override
    public void execute() {
        previousBrightness = light.getBrightness();
        light.dim(newBrightness);
    }

    @Override
    public void undo() {
        light.dim(previousBrightness);
    }
}

