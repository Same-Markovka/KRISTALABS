package Provider;

public interface IProvider {
    default <T> update(String entityName, T Do)
    {
    };
}
