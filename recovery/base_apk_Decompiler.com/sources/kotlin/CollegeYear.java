package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class CollegeYear implements getPassingYear {
    private final boolean write;

    @Override // kotlin.getPassingYear
    public final isYearUpdateRequired bf_() {
        return null;
    }

    public CollegeYear(boolean z) {
        this.write = z;
    }

    @Override // kotlin.getPassingYear
    public final boolean bi_() {
        return this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(bi_() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
