#! /bin/bash

sudo su

apt install git 
apt install npm openjdk-17-jdk postgresql maven

git clone https://github.com/gygyuszi0/sokoban_web.git
cd sokoban_web
mvn package