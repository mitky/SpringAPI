sudo apt-get install git;
sudo apt-get install spring;
sudo apt-get install maven;
sudo apt-get install openjdk-17-jdk;
sudo apt-get install openjdk-17-jre;
mkdir repo;
cd repo;
git clone https://github.com/mitky/SpringAPI.git;
cd repo; cd SpringAPI;
mvn package;
mvn spring-boot:run;
