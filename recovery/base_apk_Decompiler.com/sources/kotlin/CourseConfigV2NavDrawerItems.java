package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public enum CourseConfigV2NavDrawerItems {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;

    public static final write write = new write(0);

    public static final class write {
        private write() {
        }

        public static CourseConfigV2NavDrawerItems write(boolean z, boolean z2, boolean z3) {
            if (z) {
                return CourseConfigV2NavDrawerItems.SEALED;
            }
            if (z2) {
                return CourseConfigV2NavDrawerItems.ABSTRACT;
            }
            if (z3) {
                return CourseConfigV2NavDrawerItems.OPEN;
            }
            return CourseConfigV2NavDrawerItems.FINAL;
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }
}
