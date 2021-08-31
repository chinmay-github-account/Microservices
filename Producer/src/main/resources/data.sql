DROP TABLE IF EXISTS cars;

CREATE TABLE cars (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  manufacturer VARCHAR(250) NOT NULL,
  model VARCHAR(250) NOT NULL,
  build YEAR DEFAULT NULL
);

INSERT INTO cars (manufacturer, model, build) VALUES
  ('Ford', 'Model T', 2001),
  ('Tesla', 'Model 3', 2017),
  ('Tesla', 'Cybertruck', 2019),
  ('Hyundai', 'Creta', 2021),
  ('Suzuki', 'Swift', 2020);