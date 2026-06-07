package OOPs.Interface.Device;

public class SmartPhone implements Camera, MusicPlayer, Phone{

    @Override
    public void clickPhoto() {
        System.out.println("clickPhoto");
    }

    @Override
    public void recordVideo() {
        System.out.println("recordVideo");
    }

    @Override
    public void playMusic() {
        System.out.println("playMusic");

    }

    @Override
    public void stopMusic() {
        System.out.println("stopMusic");

    }

    @Override
    public void makeCall(long number) {
        System.out.println("makeCall to " + number);

    }

    @Override
    public void endCall() {
        System.out.println("endCall");

    }
}
