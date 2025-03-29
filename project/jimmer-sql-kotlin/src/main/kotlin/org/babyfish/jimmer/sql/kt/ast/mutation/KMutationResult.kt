package org.babyfish.jimmer.sql.kt.ast.mutation

import org.babyfish.jimmer.sql.ast.mutation.AffectedTable
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1

interface KMutationResult {

    // 总影响的行数
    val totalAffectedRowCount: Int

    // 影响的表
    val affectedRowCountMap: Map<AffectedTable, Int>

    // 通过实体类型查询影响的行数
    fun affectedRowCount(entityType: KClass<*>): Int


    fun affectedRowCount(prop: KProperty1<*, *>): Int
}