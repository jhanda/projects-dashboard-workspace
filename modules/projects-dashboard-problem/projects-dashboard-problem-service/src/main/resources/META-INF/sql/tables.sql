create table PD_Problem (
	problemId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	projectId LONG,
	type_ INTEGER,
	description VARCHAR(75) null,
	status INTEGER,
	statusDate DATE null
);