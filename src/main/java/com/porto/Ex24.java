package com.porto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex24 {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime localDate = LocalDateTime.now();

        System.out.println(dateTimeFormatter.format(localDate));
    }
}

//24. **Manipulação de datas:** Crie um programa que imprima a data e hora atuais.
