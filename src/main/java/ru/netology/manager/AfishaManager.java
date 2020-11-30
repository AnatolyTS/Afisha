package ru.netology.manager;

import ru.netology.domain.Film;

public class AfishaManager {
    private Film[] items = new Film[0];
    private int itemsToShow;

    public AfishaManager(int itemsToShow) {
        this.itemsToShow = itemsToShow;
    }

    public void add(Film item) {
        int length = items.length + 1;
        Film[] tmp = new Film[length];

        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Film[] getLastAddedItems() {
        int lenght = itemsToShow;
        if (lenght > items.length) {
            lenght = items.length;
        }

        Film[] result = new Film[lenght];

        for (int i = 0; i < lenght; i++) {
            int index = items.length - i -1;
            result[i] = items[index];
        }
        return result;
    }
}
