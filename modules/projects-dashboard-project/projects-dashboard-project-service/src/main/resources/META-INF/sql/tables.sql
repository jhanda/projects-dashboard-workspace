create table PD_Project (
	uuid_ VARCHAR(75) null,
	projectId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	businessUnitId LONG,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	priority INTEGER,
	health INTEGER,
	expectedStartDate DATE null,
	expectedEndDate DATE null,
	actualStartDate DATE null,
	actualEndDate DATE null,
	status INTEGER
);