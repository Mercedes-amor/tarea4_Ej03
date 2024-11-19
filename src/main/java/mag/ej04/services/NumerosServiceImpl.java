package mag.ej04.services;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS) // Añadimos proxyMode
public class NumerosServiceImpl implements NumerosService {
    
    Random random = new Random();
    public Set<Integer> lista = new LinkedHashSet<>(); // Similar a ArrayList pero no admite duplicados

    public Set <Integer> getLista() {
        return lista;
    }

    public void add() {
        boolean added;
        do{
            added = lista.add(random.nextInt(100) + 1);
        } while (!added);

    }

    public void delete(Integer id) {
        lista.remove(id);

    }
}
