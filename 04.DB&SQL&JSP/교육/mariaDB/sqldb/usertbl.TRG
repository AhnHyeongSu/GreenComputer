TYPE=TRIGGERS
triggers='CREATE DEFINER=`root`@`localhost` TRIGGER backUserTbl_UpdateTrg\n	AFTER UPDATE \n	ON userTbl\n	FOR EACH ROW\nBEGIN\n	INSERT INTO backup_userTbl VALUES(OLD.userid, OLD.username, OLD.birthYear,\n	OLD.addr, OLD.mobile1, OLD.mobile2, OLD.height, OLD.mDate,\n	\'수정\', CURDATE(), CURRENT_USER());\nEND' 'CREATE DEFINER=`root`@`localhost` TRIGGER backUserTbl_DeleteTrg\n	AFTER DELETE\n	ON userTbl\n	FOR EACH ROW\nBEGIN\n	INSERT INTO backup_userTbl VALUES(OLD.userID, OLD.username, OLD.birthYear,\n	OLD.addr, OLD.mobile1, OLD.mobile2, OLD.height, OLD.mDate,\n	\'삭제\', CURDATE(), CURRENT_USER() );\nEND'
sql_modes=1411383296 1411383296
definers='root@localhost' 'root@localhost'
client_cs_names='utf8mb4' 'utf8mb4'
connection_cl_names='utf8mb4_general_ci' 'utf8mb4_general_ci'
db_cl_names='utf8mb4_unicode_ci' 'utf8mb4_unicode_ci'
created=165958435883 165958435885
