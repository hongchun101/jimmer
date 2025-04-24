package org.babyfish.jimmer.sql.ast.query;

// null排序模式 null在排序时是排在前面还是后面
public enum NullOrderMode {
    // 不指定
    UNSPECIFIED,
    // null排在前面
    NULLS_FIRST,
    // null排在后面
    NULLS_LAST
}
