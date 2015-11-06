package info.smartkit.eip.iot.obtuse_octo_parakeet;

import io.silverspoon.bulldog.core.gpio.DigitalOutput;
import io.silverspoon.bulldog.core.platform.Board;
import io.silverspoon.bulldog.core.platform.Platform;
import io.silverspoon.bulldog.core.util.BulldogUtil;
import io.silverspoon.bulldog.raspberrypi.RaspiNames;

public class App {

    public static void main(String[] args) throws Exception {
        //Detect the board we are running on.
        Board board = Platform.createBoard();
        //Set up a digital output
        DigitalOutput digitalOutput = board.getPin(RaspiNames.PWM_PIN).as(DigitalOutput.class);
        //Blink the LED
        digitalOutput.high();
        BulldogUtil.sleepMs(1000);
        digitalOutput.low();
    }
}