# Calculator Applet

A simple calculator implemented as a Java Applet (cla.java). The applet provides basic arithmetic operations (addition, subtraction, multiplication, division) and a clear button. This README explains how to compile and run the applet, notes about applet deprecation, and suggestions for improvements.

## Features
- Digit buttons 0–9
- Decimal point (.)
- Addition (+), subtraction (−), multiplication (×), division (÷)
- Equals (=) to compute result
- Clear (clr) to reset the display

## Files
- `cla.java` — Java source file for the applet.
- (Optional) `cla.html` — HTML file to load the applet with `appletviewer` or an old browser plugin.

## Requirements
- Java JDK 8 or earlier to run applets with `appletviewer`. Applets are removed in Java 11+ and modern browsers no longer support the Java plugin.
- If you are using a newer JDK, see the "Run as standalone application" section below.

## Compile
1. Place `cla.java` in a directory.
2. Compile with:
```bash
javac cla.java
```
This produces `cla.class`.

## Run (using appletviewer)
Create a small HTML file (`cla.html`) that references the compiled class:

```html
<!-- cla.html -->
<html>
  <body>
    <!-- Note: applet tag shown here for appletviewer or very old browsers -->
    <applet code="cla.class" width="300" height="250"></applet>
  </body>
</html>
```

Then run:
```bash
appletviewer cla.html
```

Notes:
- `appletviewer` is bundled with older JDKs (e.g., Java 8). It is a convenient way to run applets for development.
- Modern browsers do not support Java applets; do not expect this to work in current browsers.

## Run as a standalone application (recommended for modern Java)
Because applets are deprecated and removed from newer Java versions, you can run the calculator as a simple Swing application by embedding the applet into a JFrame. Add the following wrapper to a new Java file (for example, `ClaApp.java`) and compile both files:

```java
import javax.swing.*;
import java.awt.*;

public class ClaApp {
    public static void main(String[] args) {
        Frame frame = new Frame("Calculator");
        cla applet = new cla(); // create the applet instance
        applet.init();          // initialize applet UI
        applet.start();
        frame.add(applet);
        frame.setSize(320, 320);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        // Close behavior for convenience (AWT Frame)
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });
    }
}
```

Compile and run:
```bash
javac cla.java ClaApp.java
java ClaApp
```

This approach runs the applet UI inside a desktop window without requiring browser support.

## Usage
- Click number buttons to enter the first number.
- Click an operator (+, −, ×, ÷). The display will be cleared for the second number.
- Enter the second number and press `=` to compute the result.
- Press `clr` to reset the display to empty.
- The calculator supports decimal numbers. Note: no input validation beyond simple parsing is implemented.

## Known issues and limitations
- Applet-based approach is deprecated and unsupported in modern browsers and Java releases (11+).
- No input validation: entering invalid numeric text may throw exceptions.
- Division by zero is not specially handled and will produce `Infinity` or an exception in some cases.
- Uses absolute positioning (`setLayout(null)`), which is inflexible and may not scale for different resolutions.
- GUI is implemented with AWT and the legacy Applet API.

## Suggested improvements
- Convert UI to Swing or JavaFX and provide a standalone application.
- Add input validation and error handling (e.g., division-by-zero messages).
- Use layout managers instead of absolute positioning.
- Add keyboard support for number entry and operators.
- Improve UX (history, backspace, +/- toggle, percent, etc.).

## License
MIT License — feel free to reuse and modify.

## Author
- Author: yogeshkumarsaini

## Contact
If you want me to:
- create the `cla.html` example file,
- convert the applet to a full Swing or JavaFX application,
- or add input validation and improved layout —

tell me which one and I will generate the code and files for you.
