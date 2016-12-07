create index IX_981135F4 on PD_BusinessUnit (name[$COLUMN_LENGTH:75$]);
create index IX_CBE8C0A9 on PD_BusinessUnit (uuid_[$COLUMN_LENGTH:75$], companyId);

create index IX_B4007EE on PD_ProjectBU (type_[$COLUMN_LENGTH:75$]);
create index IX_49F94A3B on PD_ProjectBU (uuid_[$COLUMN_LENGTH:75$], companyId);