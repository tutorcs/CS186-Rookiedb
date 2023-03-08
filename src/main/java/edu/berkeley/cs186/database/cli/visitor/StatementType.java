https://tutorcs.com
WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package edu.berkeley.cs186.database.cli.visitor;

public enum StatementType{
    CREATE_TABLE,
    CREATE_INDEX,
    DROP_TABLE,
    DROP_INDEX,
    SELECT,
    INSERT,
    DELETE,
    UPDATE,
    BEGIN,
    COMMIT,
    ROLLBACK,
    SAVEPOINT,
    RELEASE_SAVEPOINT,
    EXPLAIN
}