docker run --name mysql-5 -e MYSQL_USER=root -e MYSQL_PASSWORD=root -e MYSQL_DATABASE=homedb -e MYSQL_ALLOW_EMPTY_PASSWORD=root -e MYSQL_ROOT_PASSWORD=root123 -e MYSQL_RANDOM_ROOT_PASSWORD=root123!! -p 3306:3306 -d mysql:5

nanti kalo jalanin yg ini digenerate password, liat log container di docker windows

ooduqu0roh5Eshai3ahcicaiph9es7oS



docker run -d -p 2012:3306 --name mysql-docker-container -e MYSQL_ROOT_PASSWORD=mysql123 -e MYSQL_DATABASE=spring_app_db -e MYSQL_USER=root -e MYSQL_PASSWORD=test123 mysql:latest

kafka notes:

kafka manager on browser: http://localhost:9000/
bootstrap server : kafkaserver / localhost -> set hostname on etc host