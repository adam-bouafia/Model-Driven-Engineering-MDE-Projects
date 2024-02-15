--insert values into programs table
INSERT INTO program (id, name, total_credits) VALUES (1, "EDISS", 120);
--insert values into scholarships table
INSERT INTO scholarship (name, type, tuition_fee, travel_grant, allowance) VALUES ("Erasmus Mundus Europe","partnerCountry",2000,1000,24000);
--insert values into scholarships table
INSERT INTO scholarship (name, type, tuition_fee, travel_grant, allowance) VALUES ("Erasmus Mundus Global","programCountry",2000,3000,24000);

--insert values into universities table
INSERT INTO university (name, credits) VALUES ("Abo Akademi University",60);
--insert values into courses table
INSERT INTO course (name, course_code, credits, faculty) VALUES ("Data Science","DS001",5,"Informatics");
--insert values into courses table
INSERT INTO course (name, course_code, credits, faculty) VALUES ("Machine Learning","ML001",5,"Informatics");

--insert values into location table
INSERT INTO location (country_name, city_name) VALUES ("Finland","Turku");

--insert values into universities table
INSERT INTO university (name, credits) VALUES ("University of L'Aquila",60);
--insert values into courses table
INSERT INTO course (name, course_code, credits, faculty) VALUES ("Model Driven Engineering","MDE001",6,"Informatics");
--insert values into courses table
INSERT INTO course (name, course_code, credits, faculty) VALUES ("Software Architectures","SA001",6,"Informatics");

--insert values into location table
INSERT INTO location (country_name, city_name) VALUES ("Italy","L'Aquila");


--insert values into partners table
INSERT INTO partner (name, type) VALUES ("Nokia","industrial");
--insert values into results table
INSERT INTO result (year, total_admitted, scholarships_awarded, admitted_students) VALUES (2023,25,20,"Sherkhan, Ricardo, Alex");

--insert values into steps table
INSERT INTO step (name, description, start_date, end_date) VALUES ("1","Gather documents","01/12/2023","01/02/2024");
--insert values into steps table
INSERT INTO step (name, description, start_date, end_date) VALUES ("2","Apply online","01/12/2024","01/02/2024");


--insert values into degree requirements table
INSERT INTO degree (name, field_of_study, level) VALUES ("Bachelor","Computer Science","bachelor");


