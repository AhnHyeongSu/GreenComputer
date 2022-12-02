TYPE=VIEW
query=select `u`.`userID` AS `userid`,`u`.`uName` AS `uname`,`b`.`prodName` AS `prodname`,`u`.`addr` AS `addr`,concat(`u`.`moblie1`,`u`.`mobile2`) AS `연락처` from (`tabledb`.`usertbl` `u` join `tabledb`.`buytbl` `b` on(`u`.`userID` = `b`.`userID`))
md5=590ed65a3f21a7b5e79433d77ec503f8
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=2
with_check_option=0
timestamp=2022-08-04 01:58:54
create-version=2
source=SELECT u.userid, u.uname, b.prodname, u.addr,\nCONCAT(u.moblie1, u.mobile2) AS \'연락처\'\nFROM usertbl U\nINNER JOIN buytbl B\nON U.userID = B.userID
client_cs_name=utf8mb4
connection_cl_name=utf8mb4_general_ci
view_body_utf8=select `u`.`userID` AS `userid`,`u`.`uName` AS `uname`,`b`.`prodName` AS `prodname`,`u`.`addr` AS `addr`,concat(`u`.`moblie1`,`u`.`mobile2`) AS `연락처` from (`tabledb`.`usertbl` `u` join `tabledb`.`buytbl` `b` on(`u`.`userID` = `b`.`userID`))
mariadb-version=100608
