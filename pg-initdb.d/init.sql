CREATE EXTENSION pgcrypto;
CREATE TABLE IF NOT EXISTS posts(
id  UUID PRIMARY KEY DEFAULT gen_random_uuid() ,
title VARCHAR(255) NOT NULL,
content VARCHAR(255) NOT NULL
);


