package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class TestGroup<T> extends accessgetEmptyStatecp<T> {
    private final LessonIndexResponseBody<T> read;

    public TestGroup(LessonIndexResponseBody<T> lessonIndexResponseBody) {
        this.read = lessonIndexResponseBody;
    }

    @Override // kotlin.accessgetEmptyStatecp
    public final void read(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
        this.read.write(new RemoteActionCompatParcelizer(schemaUserStatusRSModel));
    }

    static class RemoteActionCompatParcelizer<T> implements getUpdates<T>, SchemaLessonStatus {
        private final SchemaUserStatusRSModel<? super T> AudioAttributesCompatParcelizer;
        private MarkIncompleteResponseBody read;

        @Override // kotlin.SchemaLessonStatus
        public final void write(long j) {
        }

        RemoteActionCompatParcelizer(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
            this.AudioAttributesCompatParcelizer = schemaUserStatusRSModel;
        }

        @Override // kotlin.getUpdates
        public final void aI_() {
            this.AudioAttributesCompatParcelizer.aJ_();
        }

        @Override // kotlin.getUpdates
        public final void IconCompatParcelizer(Throwable th) {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(th);
        }

        @Override // kotlin.getUpdates
        public final void read(T t) {
            this.AudioAttributesCompatParcelizer.a_(t);
        }

        @Override // kotlin.getUpdates
        public final void AudioAttributesCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            this.read = markIncompleteResponseBody;
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this);
        }

        @Override // kotlin.SchemaLessonStatus
        public final void AudioAttributesCompatParcelizer() {
            this.read.aL_();
        }
    }
}
