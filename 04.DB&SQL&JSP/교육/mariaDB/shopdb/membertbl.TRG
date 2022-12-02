TYPE=TRIGGERS
triggers='CREATE DEFINER=`root`@`localhost` TRIGGER `trg_DeletedMemberTBL` AFTER DELETE ON `membertbl` FOR EACH ROW BEGIN\nINSERT INTO deletedmembertbl VALUES(OLD.memberID, OLD.memberName,OLD.memberAddress, CURDATE());\nEND'
sql_modes=1411383296
definers='root@localhost'
client_cs_names='utf8mb4'
connection_cl_names='utf8mb4_general_ci'
db_cl_names='utf8mb4_unicode_ci'
created=165908214727
