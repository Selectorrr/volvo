README for volvo
==========================
**Дистрибутив содержит директории:**
**bin** - бинарные файлы для запуска приложения
**config** - файлы конфигурации
**lib** - файлы приложения
**examples** - пример демонизации приложения с помощью [runit ](http://habrahabr.ru/post/83775/)

----------

**Запуск**
Для запуска приложения с помощью runit:

 1. распакуйте дистрибутив в подходящую директорию
 2. скопируйте содержимое директории examples/runit в /etc/sv/
 3. измените в /etc/sv/volvo/run путь до start.sh на правильный

запуск:

    sv start volvo

состояние:

    sv status volvo

остановка:

    sv stop volvo

----------

логи приложения будут ротироваться в /var/log/service/volvo
