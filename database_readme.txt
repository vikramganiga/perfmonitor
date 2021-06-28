
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

# configuration for auto update in database - no script generation

	# data source 
	spring.datasource.url=jdbc:postgresql://localhost:5432/perfmonitor
	spring.datasource.username=postgres
	spring.datasource.password=postgres
	spring.datasource.drive-class-name=org.postgresql.Driver
	
	#show log
	spring.jpa.show-sql=true
	
	#hibernate ddl
	#spring.jpa.generate-ddl=true
	spring.jpa.hibernate.ddl-auto=update
	
	#database 
	spring.jpa.properties.javax.persistence.schema-generation.database.action=drop-and-create
	spring.jpa.properties.javax.persistence.schema-generation.create-source=metadata
	#spring.jpa.properties.javax.persistence.schema-generation.drop-source=metadata
	#spring.jpa.properties.javax.persistence.schema-generation.scripts.action=drop-and-create
	spring.jpa.properties.javax.persistence.schema-generation.scripts.create-target=schema.sql

