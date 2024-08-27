package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();

    builder.append(kkSaysHello());
    builder.append(keenanSaysHello());
    builder.append(macSaysHello());
    builder.append(nicSaysHello());

    return builder.toString();
  }

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

  private String macSaysHello() {
    return "Mac says 'hello!'\n";
  }

  private String keenanSaysHello() {
    return "Keenan says 'whats up!'\n";
  }
}
