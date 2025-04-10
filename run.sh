#! /bin/bash

java -jar target/sokoban-web-1.0-SNAPSHOT-jar-with-dependencies.jar &
BACKEND=$!

sleep 6s
cd frontend
npm run dev &
FRONTEND=$!
cd ..

sleep 5
read -n 1 -p "Press any key to close applications ..."
echo "close frontend : ${FRONTEND}"
kill -9 ${FRONTEND}
sleep 5

echo "close backend : ${BACKEND}"
kill -9 ${BACKEND}
sleep 5

# xdg-open http://localhost:5173