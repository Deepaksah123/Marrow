package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public interface getIntroDurationSeconds {
    public static final getIntroDurationSeconds AudioAttributesCompatParcelizer = new getIntroDurationSeconds() { // from class: o.getIntroDurationSeconds.3
        public final String toString() {
            return "NO_SOURCE";
        }

        @Override // kotlin.getIntroDurationSeconds
        public final CourseConfigV2VideoPageItem AudioAttributesCompatParcelizer() {
            CourseConfigV2VideoPageItem courseConfigV2VideoPageItem = CourseConfigV2VideoPageItem.read;
            if (courseConfigV2VideoPageItem == null) {
                read();
            }
            return courseConfigV2VideoPageItem;
        }

        private static /* synthetic */ void read() {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }
    };

    CourseConfigV2VideoPageItem AudioAttributesCompatParcelizer();
}
