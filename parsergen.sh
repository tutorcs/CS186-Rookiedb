https://tutorcs.com
WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
#! /usr/bin/bash
rm -rf src/main/java/edu/berkeley/cs186/database/cli/parser
jjtree RookieParser.jjt
javacc src/main/java/edu/berkeley/cs186/database/cli/parser/RookieParser.jj
rm -f src/main/java/edu/berkeley/cs186/database/cli/parser/RookieParser.jj
