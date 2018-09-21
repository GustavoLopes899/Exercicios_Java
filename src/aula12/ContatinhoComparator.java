package aula12;

import java.util.Comparator;

public class ContatinhoComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Contatinho c1 = (Contatinho) o1;
        Contatinho c2 = (Contatinho) o2;
        return c1.getNome().compareTo(c2.getNome());
    }

}
