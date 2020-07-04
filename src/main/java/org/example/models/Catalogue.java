package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    public static List<Work> listsOfWorks= new ArrayList();

    public static boolean exist(List<Work> listsOfWorks, Work work) {
        Boolean present = listsOfWorks.stream()
                .filter(w -> work.getTitle().equals(w.getTitle()) && work.getAnnee().equals(w.getAnnee()) && work.getMainArtist().getName().equals(w.getMainArtist().getName()))
                .findAny()
                .isPresent();
        return present;
    }
}
