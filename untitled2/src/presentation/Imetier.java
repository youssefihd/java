package presentation;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;


public interface Imetier<T,U> {
    void add(T o);
    List<T> getAll() throws Exception;
    T getbyid(U id);
    void delete(U id);
    public  void saveAll() throws Exception;


}
