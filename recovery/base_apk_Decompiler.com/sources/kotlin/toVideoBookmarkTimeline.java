package kotlin;

import java.util.Comparator;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class toVideoBookmarkTimeline {
    public static final getTimelineId<Throwable> AudioAttributesCompatParcelizer;
    public static final isTagActive IconCompatParcelizer;
    public static final Runnable read;
    private static getTimelineId<Object> write;

    public static <T1, T2, R> getSubjectTitle<Object[], R> RemoteActionCompatParcelizer(VideoBookmarkTimelineCompanion<? super T1, ? super T2, ? extends R> videoBookmarkTimelineCompanion) {
        setHasPyt.AudioAttributesCompatParcelizer(videoBookmarkTimelineCompanion, "f is null");
        return new RemoteActionCompatParcelizer(videoBookmarkTimelineCompanion);
    }

    static {
        new MediaBrowserCompatItemReceiver();
        read = new IconCompatParcelizer();
        IconCompatParcelizer = new write();
        write = new read();
        new AudioAttributesImplApi26Parcelizer();
        AudioAttributesCompatParcelizer = new RatingCompat();
        new AudioAttributesCompatParcelizer();
        new MediaDescriptionCompat();
        new AudioAttributesImplBaseParcelizer();
        new MediaBrowserCompatSearchResultReceiver();
        new AudioAttributesImplApi21Parcelizer();
        new MediaBrowserCompatCustomActionResultReceiver();
    }

    public static <T> getTimelineId<T> IconCompatParcelizer() {
        return (getTimelineId<T>) write;
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class RemoteActionCompatParcelizer<T1, T2, R> implements getSubjectTitle<Object[], R> {
        private VideoBookmarkTimelineCompanion<? super T1, ? super T2, ? extends R> write;

        RemoteActionCompatParcelizer(VideoBookmarkTimelineCompanion<? super T1, ? super T2, ? extends R> videoBookmarkTimelineCompanion) {
            this.write = videoBookmarkTimelineCompanion;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getSubjectTitle
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 2) {
                StringBuilder sb = new StringBuilder("Array of size 2 expected but got ");
                sb.append(objArr.length);
                throw new IllegalArgumentException(sb.toString());
            }
            return this.write.read(objArr[0], objArr[1]);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class MediaBrowserCompatItemReceiver implements getSubjectTitle<Object, Object> {
        @Override // kotlin.getSubjectTitle
        public final Object apply(Object obj) {
            return obj;
        }

        MediaBrowserCompatItemReceiver() {
        }

        public final String toString() {
            return "IdentityFunction";
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class IconCompatParcelizer implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }

        IconCompatParcelizer() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class write implements isTagActive {
        @Override // kotlin.isTagActive
        public final void write() {
        }

        write() {
        }

        public final String toString() {
            return "EmptyAction";
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class read implements getTimelineId<Object> {
        @Override // kotlin.getTimelineId
        public final void RemoteActionCompatParcelizer(Object obj) {
        }

        read() {
        }

        public final String toString() {
            return "EmptyConsumer";
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesImplApi26Parcelizer implements getTimelineId<Throwable> {
        AudioAttributesImplApi26Parcelizer() {
        }

        @Override // kotlin.getTimelineId
        public final /* bridge */ /* synthetic */ void RemoteActionCompatParcelizer(Throwable th) throws Exception {
            RemoteActionCompatParcelizer2(th);
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: avoid collision after fix types in other method */
        private static void RemoteActionCompatParcelizer2(Throwable th) {
            getPaymentRefIds.RemoteActionCompatParcelizer(th);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class RatingCompat implements getTimelineId<Throwable> {
        RatingCompat() {
        }

        @Override // kotlin.getTimelineId
        public final /* synthetic */ void RemoteActionCompatParcelizer(Throwable th) throws Exception {
            read(th);
        }

        private static void read(Throwable th) {
            getPaymentRefIds.RemoteActionCompatParcelizer(new VideoBookmarkTimelineModel(th));
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesCompatParcelizer {
        AudioAttributesCompatParcelizer() {
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class MediaDescriptionCompat implements getHasPyt<Object> {
        @Override // kotlin.getHasPyt
        public final boolean IconCompatParcelizer(Object obj) {
            return true;
        }

        MediaDescriptionCompat() {
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesImplBaseParcelizer implements getHasPyt<Object> {
        @Override // kotlin.getHasPyt
        public final boolean IconCompatParcelizer(Object obj) {
            return false;
        }

        AudioAttributesImplBaseParcelizer() {
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class MediaBrowserCompatSearchResultReceiver implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return null;
        }

        MediaBrowserCompatSearchResultReceiver() {
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesImplApi21Parcelizer implements Comparator<Object> {
        AudioAttributesImplApi21Parcelizer() {
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class MediaBrowserCompatCustomActionResultReceiver implements getTimelineId<SchemaLessonStatus> {
        MediaBrowserCompatCustomActionResultReceiver() {
        }

        @Override // kotlin.getTimelineId
        public final /* synthetic */ void RemoteActionCompatParcelizer(SchemaLessonStatus schemaLessonStatus) throws Exception {
            read(schemaLessonStatus);
        }

        private static void read(SchemaLessonStatus schemaLessonStatus) throws Exception {
            schemaLessonStatus.write(Long.MAX_VALUE);
        }
    }
}
