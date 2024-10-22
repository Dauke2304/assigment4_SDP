package Command;

public class SetVolume implements Command {
    private Stereo stereo;
    private int previousVolume;
    private int newVolume;

    public SetVolume(Stereo stereo, int newVolume) {
        this.stereo = stereo;
        this.newVolume = newVolume;
    }

    @Override
    public void execute() {
        previousVolume = stereo.getVolume();
        stereo.setVolume(newVolume);
    }

    @Override
    public void undo() {
        stereo.setVolume(previousVolume);
    }
}
