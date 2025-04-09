#! /bin/bash

useradd pg

service postgresql start
# sudo -u pg /usr/lib/postgresql/15/bin/postgres -D /usr/lib/postgresql/15/data
# /usr/lib/postgresql/15/bin/psql -U postgres -d postgres -c "alter user postgres with password 'root';"

# java -jar target/sokoban-web-1.0-SNAPSHOT-jar-with-dependencies.jar &

# sleep 6s
# cd frontend
# npm run dev &
