# Building the star-wars-api .jar
cd star-wars-api;
mvn clean package -Dmaven.test.skip;
cd ..;

# Building the new-movie-api .jar
cd new-movie-api;
mvn clean package -Dmaven.test.skip;

# Building docker images and running both containers
sudo docker-compose build;
sudo docker-compose up -d;