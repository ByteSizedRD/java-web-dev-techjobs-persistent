## Part 1: Test it with SQL
SELECT * FROM techjobs.job;

SHOW COLUMNS FROM techjobs.job;

--id: int(11), employer: varchar(255), name: varchar(255), skills: varchar(255)
## Part 2: Test it with SQL

SELECT * FROM employer
WHERE location='Saint Louis'

## Part 3: Test it with SQL

DROP TABLE techjobs.job;

## Part 4: Test it with SQL

SELECT name, description
FROM skill
INNER JOIN job_skills ON job_skills.skills_id = skill.id;


