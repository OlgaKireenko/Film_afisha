package ru.netology.manager;

import lombok.NoArgsConstructor;
import ru.netology.domain.Film;

@NoArgsConstructor

public class FilmManager {
    private int resultLength;
    private int filmsLimit = 10;
    private Film[] films = new Film[0];

    public FilmManager(int filmsLimit) {
        this.filmsLimit = filmsLimit;
    }


    public void add(Film film) {
        // создаём новый массив размером на единицу больше
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        // itar + tab
        // копируем поэлементно
        // for (int i = 0; i < items.length; i++) {
        //   tmp[i] = items[i];
        // }
        System.arraycopy(films, 0, tmp, 0, films.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
        //System.out.println(films);
    }

    public Film[] getAll() {
        resultLength = films.length;
        if (resultLength<=filmsLimit) {
            resultLength = films.length;
        } else {
            resultLength = filmsLimit;
        }
        // заполняем result из массива что лежит в поле
        // в обратном порядке

        Film[] result = new Film[resultLength];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < resultLength; i++) {


            int index = films.length - i - 1;
            result[i] = films[index];

        }

        return result;

    }


}
