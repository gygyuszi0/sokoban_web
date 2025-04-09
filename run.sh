#! /bin/bash

java -jar target/sokoban-web-1.0-SNAPSHOT-jar-with-dependencies.jar &

sleep 6s
cd frontend
npm run dev &
cd ..

# xdg-open http://localhost:5173