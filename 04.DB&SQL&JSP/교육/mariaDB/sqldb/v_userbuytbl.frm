TYPE=VIEW
query=select `u`.`userID` AS `userid`,`u`.`userName` AS `username`,`b`.`prodName` AS `prodName`,`u`.`addr` AS `addr`,concat(`u`.`mobile1`,`u`.`mobile2`) AS `mobile` from (`sqldb`.`usertbl` `u` join `sqldb`.`buytbl` `b` on(`u`.`userID` = `b`.`userID`))
md5=b9dcd0bac0ecd0f0302e4900255ac720
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=2
with_check_option=0
timestamp=2022-08-04 02:31:56
create-version=2
source=SELECT U.userid, U.username, B.prodName, U.addr, CONCAT(U.mobile1, U.mobile2) AS\nmobile\nFROM userTBL U\nINNER JOIN buyTBL B\nON U.userid = B.userid
client_cs_name=utf8mb4
connection_cl_name=utf8mb4_general_ci
view_body_utf8=select `u`.`userID` AS `userid`,`u`.`userName` AS `username`,`b`.`prodName` AS `prodName`,`u`.`addr` AS `addr`,concat(`u`.`mobile1`,`u`.`mobile2`) AS `mobile` from (`sqldb`.`usertbl` `u` join `sqldb`.`buytbl` `b` on(`u`.`userID` = `b`.`userID`))
mariadb-version=100608
