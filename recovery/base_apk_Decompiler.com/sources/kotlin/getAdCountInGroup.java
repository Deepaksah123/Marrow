package kotlin;

import com.marrow.data.models.user.LoggedUser;
import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0019H\u0002¢\u0006\u0004\b\u0015\u0010\u001cJ%\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u000bJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\bJ\u0011\u0010 \u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b \u0010\bJ\u000f\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u000fJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\f\u0010\u0011J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010\u0011J\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010\u000fJ\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0011J\u000f\u0010'\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010\u000fJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u0011J\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010\u0018J\u000f\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b)\u0010\u000fJ\u000f\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010\u0018J\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0018J\u000f\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010\u000fJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\n\u0010\u0011"}, d2 = {"Lo/getAdCountInGroup;", "Lo/getWriteIndices;", "Lo/getAvailableSegmentCount;", "p0", "<init>", "(Lo/getAvailableSegmentCount;)V", "", "AudioAttributesImplApi26Parcelizer", "()Ljava/lang/String;", "", "IconCompatParcelizer", "(Ljava/lang/String;)V", "AudioAttributesImplBaseParcelizer", "", "MediaBrowserCompatSearchResultReceiver", "()Z", "MediaBrowserCompatCustomActionResultReceiver", "(Z)V", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "Lcom/marrow/data/models/user/LoggedUser;", "write", "(Lcom/marrow/data/models/user/LoggedUser;)V", "onPlayFromMediaId", "()V", "Lkotlin/Function0;", "p1", "read", "(Ljava/lang/String;Lo/getCreatedOnDateMs;)Ljava/lang/String;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Lo/getCreatedOnDateMs;)Z", "MediaDescriptionCompat", "MediaMetadataCompat", "RatingCompat", "", "AudioAttributesCompatParcelizer", "(J)V", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onCommand", "onAddQueueItem", "handleMediaPlayPauseIfPendingOnHandler", "onCustomAction", "onPlay", "MediaBrowserCompatMediaItem"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getAdCountInGroup extends getWriteIndices {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final HashMap<String, Boolean> read = new HashMap<>();
    private static final HashMap<String, Integer> RemoteActionCompatParcelizer = new HashMap<>();
    private static final HashMap<String, Long> IconCompatParcelizer = new HashMap<>();
    private static final HashMap<String, String> AudioAttributesImplApi26Parcelizer = new HashMap<>();
    private static final HashMap<String, String> AudioAttributesImplApi21Parcelizer = new HashMap<>();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public getAdCountInGroup(getAvailableSegmentCount getavailablesegmentcount) {
        super(getavailablesegmentcount);
        toMagicModuleMetaRepoModel.write(getavailablesegmentcount, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String MediaBrowserCompatSearchResultReceiver(getAdCountInGroup getadcountingroup) {
        return super.AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final String AudioAttributesImplApi26Parcelizer() {
        return read("key_course_name", (getCreatedOnDateMs<String>) new getCreatedOnDateMs() { // from class: o.correctFollowingAdGroupTimes
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getAdCountInGroup.MediaBrowserCompatSearchResultReceiver(this.IconCompatParcelizer);
            }
        });
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final void IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.IconCompatParcelizer(p0);
        AudioAttributesImplApi26Parcelizer.put("key_course_name", p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onAddQueueItem(getAdCountInGroup getadcountingroup) {
        return super.AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final String AudioAttributesImplBaseParcelizer() {
        return write("logged_user_id", (getCreatedOnDateMs<String>) new getCreatedOnDateMs() { // from class: o.getMediaPeriodPositionUs
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getAdCountInGroup.onAddQueueItem(this.write);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCustomAction(getAdCountInGroup getadcountingroup) {
        return super.MediaBrowserCompatSearchResultReceiver();
    }

    @Override // kotlin.getWriteIndices
    protected final boolean MediaBrowserCompatSearchResultReceiver() {
        return RemoteActionCompatParcelizer("key_has_subscription", (getCreatedOnDateMs<Boolean>) new getCreatedOnDateMs() { // from class: o.getStreamPositionUsForAd
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(getAdCountInGroup.onCustomAction(this.AudioAttributesCompatParcelizer));
            }
        });
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final void MediaBrowserCompatCustomActionResultReceiver(boolean p0) {
        super.MediaBrowserCompatCustomActionResultReceiver(p0);
        read.put("key_has_subscription", Boolean.valueOf(p0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCommand(getAdCountInGroup getadcountingroup) {
        return super.AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final String AudioAttributesImplApi21Parcelizer() {
        return write("_token", (getCreatedOnDateMs<String>) new getCreatedOnDateMs() { // from class: o.SinglePeriodAdTimeline
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getAdCountInGroup.onCommand(this.read);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String RatingCompat(getAdCountInGroup getadcountingroup) {
        return super.MediaBrowserCompatItemReceiver();
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final String MediaBrowserCompatItemReceiver() {
        return write("_email", (getCreatedOnDateMs<String>) new getCreatedOnDateMs() { // from class: o.ServerSideAdInsertionUtil
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getAdCountInGroup.RatingCompat(this.AudioAttributesCompatParcelizer);
            }
        });
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final void write(LoggedUser p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.write(p0);
        HashMap<String, String> map = AudioAttributesImplApi26Parcelizer;
        map.put("logged_user_id", p0.getInfo().getId());
        String token = p0.getToken();
        if (token != null) {
            map.put("_token", token);
        }
        String email = p0.getEmail();
        if (email != null) {
            map.put("_email", email);
        }
        HashMap<String, Integer> map2 = RemoteActionCompatParcelizer;
        map2.remove("key_course_id");
        map2.remove("current_edition");
        map2.remove("default_edition_key");
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final void onPlayFromMediaId() {
        RemoteActionCompatParcelizer.put("key_review_mode", 2);
        super.onPlayFromMediaId();
    }

    private static String read(String p0, getCreatedOnDateMs<String> p1) {
        HashMap<String, String> map = AudioAttributesImplApi26Parcelizer;
        String str = map.get(p0);
        if (str != null) {
            return str;
        }
        String strInvoke = p1.invoke();
        map.put(p0, strInvoke);
        return strInvoke;
    }

    private static String write(String p0, getCreatedOnDateMs<String> p1) {
        HashMap<String, String> map = AudioAttributesImplApi26Parcelizer;
        String str = map.get(p0);
        if (str != null) {
            return str;
        }
        String strInvoke = p1.invoke();
        if (strInvoke != null) {
            map.put(p0, strInvoke);
        }
        return strInvoke;
    }

    private static boolean RemoteActionCompatParcelizer(String p0, getCreatedOnDateMs<Boolean> p1) {
        HashMap<String, Boolean> map = read;
        Boolean bool = map.get(p0);
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zBooleanValue = p1.invoke().booleanValue();
        map.put(p0, Boolean.valueOf(zBooleanValue));
        return zBooleanValue;
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final void write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesImplApi21Parcelizer.put("video_speed", p0);
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final void RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesImplApi21Parcelizer.put("video_seek_speed", p0);
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final String MediaDescriptionCompat() {
        return AudioAttributesImplApi21Parcelizer.get("video_speed");
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final String MediaMetadataCompat() {
        return AudioAttributesImplApi21Parcelizer.get("video_seek_speed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handleMediaPlayPauseIfPendingOnHandler(getAdCountInGroup getadcountingroup) {
        return super.RatingCompat();
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final boolean RatingCompat() {
        return RemoteActionCompatParcelizer("is_concise_mode_on", (getCreatedOnDateMs<Boolean>) new getCreatedOnDateMs() { // from class: o.getMediaPeriodPositionUsForAd
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(getAdCountInGroup.handleMediaPlayPauseIfPendingOnHandler(this.RemoteActionCompatParcelizer));
            }
        });
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final void AudioAttributesImplBaseParcelizer(boolean p0) {
        super.AudioAttributesImplBaseParcelizer(p0);
        read.put("key_show_ans_pref", Boolean.valueOf(p0));
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final void AudioAttributesCompatParcelizer(long p0) {
        super.AudioAttributesCompatParcelizer(p0);
        IconCompatParcelizer.put("last_recent_update_date", Long.valueOf(p0));
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final void AudioAttributesCompatParcelizer(boolean p0) {
        super.AudioAttributesCompatParcelizer(p0);
        read.put("video_subtitles_enabled", Boolean.valueOf(p0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onPause(getAdCountInGroup getadcountingroup) {
        return super.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return RemoteActionCompatParcelizer("video_interactive_options", (getCreatedOnDateMs<Boolean>) new getCreatedOnDateMs() { // from class: o.getStreamPositionUs
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(getAdCountInGroup.onPause(this.AudioAttributesCompatParcelizer));
            }
        });
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final void MediaBrowserCompatItemReceiver(boolean p0) {
        super.MediaBrowserCompatItemReceiver(p0);
        read.put("video_interactive_options", Boolean.valueOf(p0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onMediaButtonEvent(getAdCountInGroup getadcountingroup) {
        return super.onCommand();
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final boolean onCommand() {
        return RemoteActionCompatParcelizer("interactive_video_tooltip_shown", (getCreatedOnDateMs<Boolean>) new getCreatedOnDateMs() { // from class: o.updateAdPlaybackState
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(getAdCountInGroup.onMediaButtonEvent(this.AudioAttributesCompatParcelizer));
            }
        });
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final void read(boolean p0) {
        super.read(p0);
        read.put("interactive_video_tooltip_shown", Boolean.valueOf(p0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onFastForward(getAdCountInGroup getadcountingroup) {
        return super.onAddQueueItem();
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final boolean onAddQueueItem() {
        return RemoteActionCompatParcelizer("interactive_video_switch_to_landscape_shown", (getCreatedOnDateMs<Boolean>) new getCreatedOnDateMs() { // from class: o.getMediaPeriodPositionUsForContent
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(getAdCountInGroup.onFastForward(this.AudioAttributesCompatParcelizer));
            }
        });
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final void RemoteActionCompatParcelizer(boolean p0) {
        super.RemoteActionCompatParcelizer(p0);
        read.put("interactive_video_switch_to_landscape_shown", Boolean.valueOf(p0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaBrowserCompatMediaItem(getAdCountInGroup getadcountingroup) {
        return super.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final boolean RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer("video_subtitles_enabled", (getCreatedOnDateMs<Boolean>) new getCreatedOnDateMs() { // from class: o.BaseMediaChunkIterator
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(getAdCountInGroup.MediaBrowserCompatMediaItem(this.write));
            }
        });
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final void handleMediaPlayPauseIfPendingOnHandler() {
        super.handleMediaPlayPauseIfPendingOnHandler();
        read.put("is_cross_device_sync_done", Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onPlayFromMediaId(getAdCountInGroup getadcountingroup) {
        return super.onCustomAction();
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final boolean onCustomAction() {
        return RemoteActionCompatParcelizer("is_lesson_sync_done", (getCreatedOnDateMs<Boolean>) new getCreatedOnDateMs() { // from class: o.getFirstSampleIndex
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(getAdCountInGroup.onPlayFromMediaId(this.read));
            }
        });
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final void onPlay() {
        super.onPlay();
        read.put("is_lesson_sync_done", Boolean.TRUE);
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        IconCompatParcelizer.remove("last_course_config_sync");
        RemoteActionCompatParcelizer.remove("course_config_data_version");
        super.MediaBrowserCompatCustomActionResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(getAdCountInGroup getadcountingroup) {
        return super.MediaBrowserCompatMediaItem();
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final boolean MediaBrowserCompatMediaItem() {
        return RemoteActionCompatParcelizer("bookmark_video_is_blocked_by_kyc", (getCreatedOnDateMs<Boolean>) new getCreatedOnDateMs() { // from class: o.BaseMediaChunk
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(getAdCountInGroup.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.IconCompatParcelizer));
            }
        });
    }

    @Override // kotlin.getWriteIndices, kotlin.BundledChunkExtractor
    public final void IconCompatParcelizer(boolean p0) {
        read.put("bookmark_video_is_blocked_by_kyc", Boolean.valueOf(p0));
    }

    /* JADX INFO: renamed from: o.getAdCountInGroup$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0007R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n`\bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f`\bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/marrow/data/dataprovider/preference/CachePreferenceLocalDataSourceImpl$Companion;", "", "<init>", "()V", "sBooleanMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "sIntMap", "", "sLongMap", "", "sStringMap", "sVideoPrefMap", "msLastAppUpdateCheckTime", "clear", "", "isForceClear", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static void read(boolean z) {
            getAdCountInGroup.read.clear();
            getAdCountInGroup.RemoteActionCompatParcelizer.clear();
            getAdCountInGroup.AudioAttributesImplApi26Parcelizer.clear();
            if (z) {
                getAdCountInGroup.AudioAttributesImplApi21Parcelizer.clear();
            }
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final void write(boolean z) {
        Companion.read(z);
    }
}
