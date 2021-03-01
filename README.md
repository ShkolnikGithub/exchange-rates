## exchange-rates
![hippo](https://media.giphy.com/media/LdOyjZ7io5Msw/giphy.gif)

Создать сервис, который обращается к сервису курсов валют, и отдает gif в ответ:

если курс по отношению к рублю за сегодня стал выше вчерашнего, то отдаем рандомную отсюда https://giphy.com/search/rich

если ниже - отсюда https://giphy.com/search/broke
## Ссылки
REST API курсов валют - https://docs.openexchangerates.org/

REST API гифок - https://developers.giphy.com/docs/api#quick-start-guide
## Must Have
Сервис на Spring Boot 2 + Java / Kotlin

Запросы приходят на HTTP endpoint, туда передается код валюты

Для взаимодействия с внешними сервисами используется Feign

Все параметры (валюта по отношению к которой смотрится курс, адреса внешних сервисов и т.д.) вынесены в настройки

На сервис написаны тесты (для мока внешних сервисов можно использовать @mockbean или WireMock)

Для сборки должен использоваться Gradle

Результатом выполнения должен быть репо на GitHub с инструкцией по запуску
## Nice to Have
Сборка и запуск Docker контейнера с этим сервисом.

## Инструкция по запуску:

Перед запуском приложения можем задать настройки (выбрать валюту (поле «rate.base»), по отношению к которой смотрится курс(по умолчанию задан рубль - RUB), задать ключевые слова для отображени гифок (раздел Keywords) и т.д.).
Можно указать любой код из перечня поддерживаемых валют, представленного на сайте https://docs.openexchangerates.org/docs/supported-currencies
Ключевые слова также могут быть любые.

Настройки находятся в файле:

/src/main/resources/ application.properties (доступно после клона проекта)

Запуск:
```
git clone https://github.com/ShkolnikGithub/exchange-rates.git
cd exchange-rates
gradle clean
gradle build
cd build/libs
java -jar exchange-rates-0.0.1-SNAPSHOT.jar
```

Далее в браузере открываем: 
http://localhost:8080/compare/USD

(вместо USD можем ввести любой код из перечня поддерживаемых валют, представленного на сайте https://docs.openexchangerates.org/docs/supported-currencies)

В зависимости от того, вырос курс или нет, будет показана гифка по ключевому слову rich или broke соответственно.
Если курс не изменился, то увидим гифку по ключевому слову duck. Такую ситуацию можно смоделировать самостоятельно, отправив запрос http://localhost:8080/compare/RUB.
