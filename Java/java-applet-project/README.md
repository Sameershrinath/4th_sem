# Java Applet Project

This project demonstrates a simple Java applet that displays a student's name and student ID.

## Project Structure

```
java-applet-project
├── src
│   ├── MyApplet.java
├── index.html
└── README.md
```

## Files Description

- **src/MyApplet.java**: Contains the Java applet class `MyApplet`. It extends the `Applet` class and overrides the `paint` method to display the student's name and student ID on the applet.

- **index.html**: The HTML document that embeds the Java applet. It includes the necessary tags to load and display the applet in a web browser.

## How to Run the Applet

1. Ensure you have the Java Development Kit (JDK) installed on your machine.
2. Compile the Java applet by navigating to the `src` directory and running:
   ```
   javac MyApplet.java
   ```
3. Open the `index.html` file in a web browser that supports Java applets (note that many modern browsers have dropped support for Java applets).
4. If using an older browser, ensure that Java is enabled in the browser settings.

## Dependencies

- Java Development Kit (JDK) for compiling and running the applet.
- A web browser that supports Java applets (consider using an older version of browsers like Internet Explorer or Firefox with Java plugin support).