FROM debian:bookworm-slim

COPY pom.xml /
COPY src /src
COPY frontend /frontend
COPY install_docker.sh /

# RUN apt update
# RUN apt install npm openjdk-17-jdk postgresql maven locate -y
# RUN /usr/lib/postgresql/15/bin/ postgres -D /usr/local/pgsql/data >logfile 2>&1 &
# RUN psql -U postgres -d postgres -c "alter user postgres with password 'root';"


RUN sh install_docker.sh

EXPOSE 5137

CMD [ "sh run.sh" ]
