DROP TABLE IF EXISTS features;

CREATE TABLE features (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  value VARCHAR(250) NOT NULL
);

INSERT INTO features (name, value) VALUES
  ('Prop1', 'true'),
  ('Prop2', 'false'),
  ('Prop3', 'true');