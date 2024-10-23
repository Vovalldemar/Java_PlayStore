# JavaPlayStore

## Описание
Проект, для розыгрыша в магазине игрушек

## Функциональность
1. Добавление игрушек с уникальным ID, названием и частотой выпадения (весом).
2. Использование очереди с приоритетом (`PriorityQueue`), чтобы определить, какая игрушка выпадет в розыгрыше.
3. Проведение 10 розыгрышей игрушек и запись результатов в файл `result.txt`.
4. Проверка на отсутствие игрушек в очереди и соответствующее сообщение в выводе.

## Структура проекта
- **Main.java** — основной класс для запуска программы.
- **Toy.java** — класс модели для представления игрушки с ID, названием и частотой выпадения.
- **ToyQueue.java** — класс для управления очередью игрушек с приоритетом.

## Запуск программы
 java Main