#! /bin/bash

apt update
apt install npm openjdk-17-jdk postgresql maven -y

#Config backend
/usr/lib/postgresql/15/bin/ postgres -D /usr/local/pgsql/data >logfile 2>&1 &
psql -U postgres -d postgres -c "alter user postgres with password 'root';"
mvn package

#Config frontend
cd frontend
npm install
cd ..
