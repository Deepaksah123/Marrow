package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class User {
    private static final getUserNameInitials<Object> MediaBrowserCompatMediaItem = new getUserNameInitials<>(-1, null, null, 0);
    public static final int RemoteActionCompatParcelizer = accessgetVideoConfigurationC3cp.AudioAttributesCompatParcelizer("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);
    private static final int MediaBrowserCompatCustomActionResultReceiver = accessgetVideoConfigurationC3cp.AudioAttributesCompatParcelizer("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);
    public static final accessgetVideoConfigurationC2cp write = new accessgetVideoConfigurationC2cp("BUFFERED");
    private static final accessgetVideoConfigurationC2cp MediaDescriptionCompat = new accessgetVideoConfigurationC2cp("SHOULD_BUFFER");
    private static final accessgetVideoConfigurationC2cp onCustomAction = new accessgetVideoConfigurationC2cp("S_RESUMING_BY_RCV");
    private static final accessgetVideoConfigurationC2cp MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new accessgetVideoConfigurationC2cp("RESUMING_BY_EB");
    private static final accessgetVideoConfigurationC2cp MediaBrowserCompatSearchResultReceiver = new accessgetVideoConfigurationC2cp("POISONED");
    private static final accessgetVideoConfigurationC2cp AudioAttributesImplBaseParcelizer = new accessgetVideoConfigurationC2cp("DONE_RCV");
    private static final accessgetVideoConfigurationC2cp AudioAttributesImplApi21Parcelizer = new accessgetVideoConfigurationC2cp("INTERRUPTED_SEND");
    private static final accessgetVideoConfigurationC2cp AudioAttributesImplApi26Parcelizer = new accessgetVideoConfigurationC2cp("INTERRUPTED_RCV");
    private static final accessgetVideoConfigurationC2cp IconCompatParcelizer = new accessgetVideoConfigurationC2cp("CHANNEL_CLOSED");
    private static final accessgetVideoConfigurationC2cp onCommand = new accessgetVideoConfigurationC2cp("SUSPEND");
    private static final accessgetVideoConfigurationC2cp handleMediaPlayPauseIfPendingOnHandler = new accessgetVideoConfigurationC2cp("SUSPEND_NO_WAITER");
    private static final accessgetVideoConfigurationC2cp MediaBrowserCompatItemReceiver = new accessgetVideoConfigurationC2cp("FAILED");
    private static final accessgetVideoConfigurationC2cp RatingCompat = new accessgetVideoConfigurationC2cp("NO_RECEIVE_RESULT");
    private static final accessgetVideoConfigurationC2cp AudioAttributesCompatParcelizer = new accessgetVideoConfigurationC2cp("CLOSE_HANDLER_CLOSED");
    private static final accessgetVideoConfigurationC2cp read = new accessgetVideoConfigurationC2cp("CLOSE_HANDLER_INVOKED");
    private static final accessgetVideoConfigurationC2cp MediaMetadataCompat = new accessgetVideoConfigurationC2cp("NO_CLOSE_CAUSE");

    /* JADX INFO: Access modifiers changed from: private */
    public static final long IconCompatParcelizer(long j, boolean z) {
        return (z ? 4611686018427387904L : 0L) + j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long read(long j, int i) {
        return (((long) i) << 60) + j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long write(int i) {
        if (i == 0) {
            return 0L;
        }
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    final /* synthetic */ class read<E> extends MagicModuleRepositoryImpl_Factory implements MagicModuleSubmissionRequestBody<Long, getUserNameInitials<E>, getUserNameInitials<E>> {
        public static final read AudioAttributesCompatParcelizer = new read();

        private static getUserNameInitials<E> IconCompatParcelizer(long j, getUserNameInitials<E> getusernameinitials) {
            return User.AudioAttributesCompatParcelizer(j, getusernameinitials);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Object invoke(Long l, Object obj) {
            return IconCompatParcelizer(l.longValue(), (getUserNameInitials) obj);
        }

        read() {
            super(2, User.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }
    }

    public static final <E> getErrorMessageId<getUserNameInitials<E>> handleMediaPlayPauseIfPendingOnHandler() {
        return read.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> getUserNameInitials<E> AudioAttributesCompatParcelizer(long j, getUserNameInitials<E> getusernameinitials) {
        return new getUserNameInitials<>(j, getusernameinitials, getusernameinitials.write(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean RemoteActionCompatParcelizer(setStateRank<? super T> setstaterank, T t, getModuleData<? super Throwable, ? super T, ? super CurrentQuery, getShowPopup> getmoduledata) {
        Object obj = setstaterank.read(t, null, getmoduledata);
        if (obj == null) {
            return false;
        }
        setstaterank.write(obj);
        return true;
    }

    public static final accessgetVideoConfigurationC2cp MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return IconCompatParcelizer;
    }
}
