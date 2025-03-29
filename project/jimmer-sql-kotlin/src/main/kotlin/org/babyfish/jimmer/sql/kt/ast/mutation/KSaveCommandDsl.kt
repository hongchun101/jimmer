package org.babyfish.jimmer.sql.kt.ast.mutation

import org.babyfish.jimmer.kt.DslScope
import org.babyfish.jimmer.sql.ast.mutation.AssociatedSaveMode
import org.babyfish.jimmer.sql.ast.mutation.SaveMode

@DslScope
// 保存指令dsl
interface KSaveCommandDsl : KSaveCommandPartialDsl {

    // 设置保存模式
    fun setMode(mode: SaveMode)

    // 设置关联保存模式
    fun setAssociatedModeAll(mode: AssociatedSaveMode)
}