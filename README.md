# SpringPractise
ТРЕБОВАНИЯ
idea ultimate
postgreSQL
ЗАПУСК
в файле application.properties меняем данные о подключении к базе данных на данные пустой схемы (в моём примере используется база данных с названием Spring и схема Main)
меняем данные о пользователе postgress
проводим миграцию в вкладке maven(maven->Plaguns->flyway->flyway:migrate)
через вкладку database устанавливаем подключение к базе данных и схеме, которую указали в файле конфигурации
проект готов к использованию
