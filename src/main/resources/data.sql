insert into account
values(10001, 'SGSavings875', '568728234', 'Savings', 20230.00, 'SGD');

insert into account
values(10002, 'AUSavings555', '782347212', 'Savings', 5678.88, 'AUD');

insert into account
values(10003, 'AUCurrent433','129089890', 'Current', 38678.45, 'AUD');

insert into transaction
values(20001, 2345.00,'', PARSEDATETIME('2019-01-10 10:21:02', 'yyyy-MM-dd HH:mm:ss'), 'Credit', 10001);
    
insert into transaction
values(20002, 222.77,'purchase at ABC', PARSEDATETIME('2019-01-31 23:59:59', 'yyyy-MM-dd HH:mm:ss'), 'Debit', 10001);

insert into transaction
values(20003, 4500.00 , null , PARSEDATETIME('2018-06-12 14:28:59', 'yyyy-MM-dd HH:mm:ss'), 'Credit', 10001);

insert into transaction
values(20004, 15500.00 , '' , PARSEDATETIME('2018-03-03 09:09:00', 'yyyy-MM-dd HH:mm:ss'), 'Credit', 10003);

insert into transaction
values(20005, 265.72 , '' , PARSEDATETIME('2019-04-19 19:10:22', 'yyyy-MM-dd HH:mm:ss'), 'Debit', 10003);