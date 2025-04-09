#! /bin/bash

java -jar target/sokoban-web-1.0-SNAPSHOT-jar-with-dependencies.jar &

cd frontend
npm run dev &