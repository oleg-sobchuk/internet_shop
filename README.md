# internet_shop
spring4+mvc+hibernate4+security

Product entity: table name = products
CREATE TABLE products
(
  id           INT AUTO_INCREMENT
    PRIMARY KEY,
  product_name VARCHAR(65)  NOT NULL,
  dateAdd      DATETIME     NULL,
  dateUpdate   DATETIME     NULL,
  ownerName    VARCHAR(65)  NULL,
  description  VARCHAR(255) NULL
)
  ENGINE = InnoDB;

User entity: table name = user
CREATE TABLE user
(
  id    INT AUTO_INCREMENT
    PRIMARY KEY,
  name  VARCHAR(255) NULL,
  email VARCHAR(255) NULL,
  age   INT          NULL,
  CONSTRAINT user_id_uindex
  UNIQUE (id)
)
  ENGINE = InnoDB;