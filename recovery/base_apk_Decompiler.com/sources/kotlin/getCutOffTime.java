package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getCutOffTime {

    /* JADX INFO: loaded from: classes.dex */
    public enum write implements getTimelineId<SchemaLessonStatus> {
        INSTANCE;

        @Override // kotlin.getTimelineId
        public final /* synthetic */ void RemoteActionCompatParcelizer(SchemaLessonStatus schemaLessonStatus) throws Exception {
            AudioAttributesCompatParcelizer(schemaLessonStatus);
        }

        private static void AudioAttributesCompatParcelizer(SchemaLessonStatus schemaLessonStatus) throws Exception {
            schemaLessonStatus.write(Long.MAX_VALUE);
        }
    }
}
