package kotlin;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LessonIndexResponseBody<T> implements findTheInteractiveElementWhichIsInBetween<T> {
    protected abstract void AudioAttributesCompatParcelizer(getUpdates<? super T> getupdates);

    private static int AudioAttributesImplBaseParcelizer() {
        return accessgetEmptyStatecp.AudioAttributesCompatParcelizer();
    }

    private static <T> LessonIndexResponseBody<T> AudioAttributesImplApi26Parcelizer() {
        return getPaymentRefIds.read(component14.IconCompatParcelizer);
    }

    private static LessonIndexResponseBody<Long> write(long j, long j2, TimeUnit timeUnit, getIds getids) {
        setHasPyt.AudioAttributesCompatParcelizer(timeUnit, "unit is null");
        setHasPyt.AudioAttributesCompatParcelizer(getids, "scheduler is null");
        return getPaymentRefIds.read(new getClientAuthToken(Math.max(0L, j), Math.max(0L, j2), timeUnit, getids));
    }

    public static LessonIndexResponseBody<Long> AudioAttributesCompatParcelizer(long j, TimeUnit timeUnit) {
        return write(j, j, timeUnit, PlanBUpgradeData.RemoteActionCompatParcelizer());
    }

    public static LessonIndexResponseBody<Long> IconCompatParcelizer(long j, TimeUnit timeUnit) {
        return write(j, timeUnit, PlanBUpgradeData.RemoteActionCompatParcelizer());
    }

    private static LessonIndexResponseBody<Long> write(long j, TimeUnit timeUnit, getIds getids) {
        setHasPyt.AudioAttributesCompatParcelizer(timeUnit, "unit is null");
        setHasPyt.AudioAttributesCompatParcelizer(getids, "scheduler is null");
        return getPaymentRefIds.read(new getMerchantId(Math.max(j, 0L), timeUnit, getids));
    }

    private LessonIndexResponseBody<T> RemoteActionCompatParcelizer(getTimelineId<? super T> gettimelineid, getTimelineId<? super Throwable> gettimelineid2, isTagActive istagactive, isTagActive istagactive2) {
        setHasPyt.AudioAttributesCompatParcelizer(gettimelineid, "onNext is null");
        setHasPyt.AudioAttributesCompatParcelizer(gettimelineid2, "onError is null");
        setHasPyt.AudioAttributesCompatParcelizer(istagactive, "onComplete is null");
        setHasPyt.AudioAttributesCompatParcelizer(istagactive2, "onAfterTerminate is null");
        return getPaymentRefIds.read(new Payload(this, gettimelineid, gettimelineid2, istagactive, istagactive2));
    }

    public final LessonIndexResponseBody<T> RemoteActionCompatParcelizer(getTimelineId<? super T> gettimelineid) {
        getTimelineId<? super Throwable> gettimelineidIconCompatParcelizer = toVideoBookmarkTimeline.IconCompatParcelizer();
        isTagActive istagactive = toVideoBookmarkTimeline.IconCompatParcelizer;
        return RemoteActionCompatParcelizer(gettimelineid, gettimelineidIconCompatParcelizer, istagactive, istagactive);
    }

    public final getAllOptions write() {
        return getPaymentRefIds.read(new getSdkPayload(this));
    }

    public final <R> LessonIndexResponseBody<R> write(getSubjectTitle<? super T, ? extends R> getsubjecttitle) {
        setHasPyt.AudioAttributesCompatParcelizer(getsubjecttitle, "mapper is null");
        return getPaymentRefIds.read(new component13(this, getsubjecttitle));
    }

    public final LessonIndexResponseBody<T> IconCompatParcelizer(getIds getids) {
        return RemoteActionCompatParcelizer(getids, AudioAttributesImplBaseParcelizer());
    }

    private LessonIndexResponseBody<T> RemoteActionCompatParcelizer(getIds getids, int i) {
        setHasPyt.AudioAttributesCompatParcelizer(getids, "scheduler is null");
        setHasPyt.read(i, "bufferSize");
        return getPaymentRefIds.read(new getCustomerPhone(this, getids, false, i));
    }

    public final LessonIndexResponseBody<T> RemoteActionCompatParcelizer() {
        return MediaBrowserCompatCustomActionResultReceiver();
    }

    private LessonIndexResponseBody<T> MediaBrowserCompatCustomActionResultReceiver() {
        return getPaymentRefIds.read(new getClientId(this, Long.MAX_VALUE));
    }

    public final getEmptyState<T> AudioAttributesCompatParcelizer() {
        return getPaymentRefIds.AudioAttributesCompatParcelizer(new getClientAuthTokenExpiry(this));
    }

    public final LessonDynamicResponseBody<T> IconCompatParcelizer() {
        return getPaymentRefIds.write(new getCustomerId(this));
    }

    public final MarkIncompleteResponseBody read() {
        return IconCompatParcelizer(toVideoBookmarkTimeline.IconCompatParcelizer(), toVideoBookmarkTimeline.AudioAttributesCompatParcelizer, toVideoBookmarkTimeline.IconCompatParcelizer, toVideoBookmarkTimeline.IconCompatParcelizer());
    }

    public final MarkIncompleteResponseBody write(getTimelineId<? super T> gettimelineid) {
        return IconCompatParcelizer(gettimelineid, toVideoBookmarkTimeline.AudioAttributesCompatParcelizer, toVideoBookmarkTimeline.IconCompatParcelizer, toVideoBookmarkTimeline.IconCompatParcelizer());
    }

    public final MarkIncompleteResponseBody RemoteActionCompatParcelizer(getTimelineId<? super T> gettimelineid, getTimelineId<? super Throwable> gettimelineid2) {
        return IconCompatParcelizer(gettimelineid, gettimelineid2, toVideoBookmarkTimeline.IconCompatParcelizer, toVideoBookmarkTimeline.IconCompatParcelizer());
    }

    private MarkIncompleteResponseBody IconCompatParcelizer(getTimelineId<? super T> gettimelineid, getTimelineId<? super Throwable> gettimelineid2, isTagActive istagactive, getTimelineId<? super MarkIncompleteResponseBody> gettimelineid3) {
        setHasPyt.AudioAttributesCompatParcelizer(gettimelineid, "onNext is null");
        setHasPyt.AudioAttributesCompatParcelizer(gettimelineid2, "onError is null");
        setHasPyt.AudioAttributesCompatParcelizer(istagactive, "onComplete is null");
        setHasPyt.AudioAttributesCompatParcelizer(gettimelineid3, "onSubscribe is null");
        McqFaqResponseBody mcqFaqResponseBody = new McqFaqResponseBody(gettimelineid, gettimelineid2, istagactive, gettimelineid3);
        write(mcqFaqResponseBody);
        return mcqFaqResponseBody;
    }

    @Override // kotlin.findTheInteractiveElementWhichIsInBetween
    public final void write(getUpdates<? super T> getupdates) {
        setHasPyt.AudioAttributesCompatParcelizer(getupdates, "observer is null");
        try {
            getUpdates<? super T> getupdates2 = getPaymentRefIds.read(getupdates);
            setHasPyt.AudioAttributesCompatParcelizer(getupdates2, "Plugin returned null Observer");
            AudioAttributesCompatParcelizer(getupdates2);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            getEndTimeMs.RemoteActionCompatParcelizer(th);
            getPaymentRefIds.RemoteActionCompatParcelizer(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final LessonIndexResponseBody<T> write(getIds getids) {
        setHasPyt.AudioAttributesCompatParcelizer(getids, "scheduler is null");
        return getPaymentRefIds.read(new getCustomerEmail(this, getids));
    }

    public final accessgetEmptyStatecp<T> write(InteractiveVideoElementRSModel interactiveVideoElementRSModel) {
        TestGroup testGroup = new TestGroup(this);
        int i = AnonymousClass2.write[interactiveVideoElementRSModel.ordinal()];
        if (i == 1) {
            return testGroup.RemoteActionCompatParcelizer();
        }
        if (i == 2) {
            return testGroup.MediaBrowserCompatItemReceiver();
        }
        if (i == 3) {
            return testGroup;
        }
        if (i == 4) {
            return getPaymentRefIds.read(new isNotesPurchaseAllowed(testGroup));
        }
        return testGroup.IconCompatParcelizer();
    }

    /* JADX INFO: renamed from: o.LessonIndexResponseBody$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[InteractiveVideoElementRSModel.values().length];
            write = iArr;
            try {
                iArr[InteractiveVideoElementRSModel.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                write[InteractiveVideoElementRSModel.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                write[InteractiveVideoElementRSModel.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                write[InteractiveVideoElementRSModel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
