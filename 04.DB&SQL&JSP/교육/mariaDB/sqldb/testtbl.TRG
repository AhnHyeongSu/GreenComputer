TYPE=TRIGGERS
triggers='CREATE DEFINER=`root`@`localhost` TRIGGER testTrg\nAFTER DELETE\nON testtbl\nFOR EACH ROW\nBEGIN\nSET @msg = \'가수 그룹이 삭제됨\';\nEND'
sql_modes=1411383296
definers='root@localhost'
client_cs_names='utf8mb4'
connection_cl_names='utf8mb4_general_ci'
db_cl_names='utf8mb4_unicode_ci'
created=165958254733
