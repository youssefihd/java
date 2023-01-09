package presentation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ImetierImpl implements Imetier<Produit,Long> {
      List<Produit> prod = new ArrayList<>();
    @Override
    public void add(Produit o)
    {
        Produit p = getbyid((long) o.getId());
        if(p!=null)
            prod.add(o);

    }

    @Override
    public List<Produit> getAll() throws Exception {
        File file1 = new File("file1");
        FileInputStream fi = new FileInputStream(file1);
        ObjectInputStream oi = new ObjectInputStream(fi);
        List<Produit> p = (List<Produit>) oi.readObject();
        oi.close();
        return p;
    }
    @Override
    public Produit getbyid(Long id) {
        for (Produit p:prod) {
            if(p.getId()==id)
                return p;
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        Produit p = getbyid(id);
        if(p!=null)
        prod.remove(p);

    }
    public  void saveAll() throws Exception {
        File file1 = new File("file1");
        FileOutputStream fi = new FileOutputStream(file1);
        ObjectOutput oi = new ObjectOutputStream(fi);
        oi.writeObject(prod);
        oi.flush();
        oi.close();

    }
}
