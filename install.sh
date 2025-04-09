#! /bin/bash

sudo apt install git -y
sudo apt install npm openjdk-17-jdk postgresql maven -y

#Config backend
sudo -u postgres psql -U postgres -d postgres -c "alter user postgres with password 'root';"
mvn package

cd frontend
npm install
cd ..
