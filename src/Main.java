import Command.*;
public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        TV tv = new TV();
        Stereo stereo = new Stereo();
        Light light = new Light();

        TurnTVOn tvOn = new TurnTVOn(tv);
        SetVolume stereoSetVolume = new SetVolume(stereo, 10);
        DimLights dimLights = new DimLights(light, 50);

        remote.setCommand(0, tvOn, new NoCommand());  // Slot 0: TV On command
        remote.setCommand(1, stereoSetVolume, new NoCommand());  // Slot 1: Set stereo volume
        remote.setCommand(2, dimLights, new NoCommand());  // Slot 2: Dim Lights

        // Execute commands
        remote.onButtonWasPushed(0);  // Turn TV on
        remote.onButtonWasPushed(1);  // Set stereo volume to 10
        remote.onButtonWasPushed(2);  // Dim lights to 50%

        // Undo last command (dim lights)
        remote.undoButtonWasPushed();

        // Test undo for stereo volume
        remote.onButtonWasPushed(1);  // Set stereo volume again
        remote.undoButtonWasPushed(); // Undo stereo volume change
    }
}