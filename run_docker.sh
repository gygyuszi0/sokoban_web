#! /bin/bash

/usr/lib/postgresql/15/bin/postgres -D /usr/local/pgsql/data >logfile 2>&1 &
/usr/lib/postgresql/15/bin/psql -U postgres -d postgres -c "alter user postgres with password 'root';"

java -jar target/sokoban-web-1.0-SNAPSHOT-jar-with-dependencies.jar &

sleep 6s
cd frontend
npm run dev &
