CREATE TABLE IF NOT EXISTS example (
      uuid VARCHAR(100) NOT NULL,
      name VARCHAR(100),
      create_time TIMESTAMP,
      note VARCHAR(1024),
      number BIGINT,
      administrator CHAR(1)
      CONSTRAINT example_pk PRIMARY KEY (uuid));
