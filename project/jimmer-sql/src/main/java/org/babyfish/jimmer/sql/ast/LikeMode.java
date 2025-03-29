package org.babyfish.jimmer.sql.ast;

// 模糊查询模式
public enum LikeMode {

    EXACT(true, true),
    START(true, false),
    END(false, true),
    ANYWHERE(false, false);

    private boolean startExact;

    private boolean endExact;

    LikeMode(boolean startExact, boolean endExact) {
        this.startExact = startExact;
        this.endExact = endExact;
    }

    public boolean isStartExact() {
        return startExact;
    }

    public boolean isEndExact() {
        return endExact;
    }
}
