package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();

    builder.append(jakobSaysHello());
    builder.append(johnSaysHello());
    builder.append(kkSaysHello());
    builder.append(nicSaysHello());

    return builder.toString();
  }

  private String jakobSaysHello() {
    return "Jakob says 'Hello!'\n";
  }

  private String johnSaysHello() {
    return "John says 'Hello!'\n";
  }

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

}
