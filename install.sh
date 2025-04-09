#! /bin/bash

sudo apt install git -y
sudo apt install npm openjdk-17-jdk postgresql maven -y

# git clone https://github.com/gygyuszi0/sokoban_web.git
# cd sokoban_web

mvn package
