
# create database procedure (windows)
# a. login with postgres user ( default password - postgres)
# b. C:\Program Files\PostgreSQL\11\bin>

psql -U postgres
CREATE DATABASE <database_name>;
CREATE USER <username> WITH PASSWORD 'my_password';
GRANT ALL PRIVILEGES ON DATABASE "database_name" to <my_username>;

# connect to database
# psql -U Username DatabaseName 
# user name - geru
# database - perfmonitor

psql.exe -U geru perfmonitor
 
# grant permission
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO  <user>;

