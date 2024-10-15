FROM mysql:latest

ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_DATABASE=ControleDeEstoque


COPY ./SQL/ControleDeEstoque.sql /docker-entrypoint-initdb.d/

EXPOSE 3306

# docker build -t mysql_estoque .

# docker run -d -p 33061:3306 mysql_estoque

# docker exec -it id mysql -u root -p
