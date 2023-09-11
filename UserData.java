package ru.shum;

import java.time.LocalDate;

/**
 * Этот класс служит для хранения данных пользователя, а его неизменяемая структура позволяет
 * безопасно использовать объекты `UserData` в различных частях программы и предоставлять доступ
 * только для чтения к данным пользователя.
 */
public record UserData(String lastName, String firstName, String middleName, LocalDate dateOfBirth, long phoneNumber,
                       Gender gender) {

}
