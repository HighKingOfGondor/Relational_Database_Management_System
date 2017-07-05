# Relational_Database_Management_System

Example Commands and Querys:  
  
Commands:  
CREATE TABLE animals (name VARCHAR(20), kind VARCHAR(8), years INTEGER) PRIMARY KEY (name, kind)  
INSERT INTO animals VALUES FROM ("Joe", "cat", 4)  
SHOW animals  
WRITE animals  
CREATE TABLE species (kind VARCHAR(10)) PRIMARY KEY (kind)  
INSERT INTO species VALUES FROM RELATION project (kind) animals  
EXIT
  
  
Querys:  
s <- select (age > 10) animals;  
p <- project (age, kind) animals;  
r <- rename (kind, species) animals;  
union <- animals + other_animals;  
difference <- animals - sub_animals;  
product <- animals * species;  
natual_join <- animals & species;  
