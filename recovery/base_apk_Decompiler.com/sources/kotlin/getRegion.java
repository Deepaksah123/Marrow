package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getRegion implements TopUserCompanion {
    private final CurrentQuery write;

    public getRegion(CurrentQuery currentQuery) {
        this.write = currentQuery;
    }

    @Override // kotlin.TopUserCompanion
    public final CurrentQuery bj_() {
        return this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoroutineScope(coroutineContext=");
        sb.append(bj_());
        sb.append(')');
        return sb.toString();
    }
}
