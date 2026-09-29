package kotlin;

import com.google.android.exoplayer2.offline.DownloadService;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.CVideoChangeFrameRateStrategy;
import kotlin.Metadata;
import kotlin.e1;
import kotlin.getChildPeriodUidFromConcatenatedUid;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\n\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\b\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016¢\u0006\u0004\b\b\u0010\u0016J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0003\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\b\u0010\u001cJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0016¢\u0006\u0004\b\u001d\u0010\u0016J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0003\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\n\u0010\u0016J\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0016J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0003\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\n\u0010\u001fJ\u000f\u0010\u0015\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u0015\u0010 J\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010!J\u001f\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\b\u0010#J\u0017\u0010$\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010!J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010'J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u0015\u0010(J\u0017\u0010\u0019\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010%J\u0017\u0010)\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010%J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u0014\u0010*J\u001f\u0010\n\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\n\u0010+J\u000f\u0010&\u001a\u00020\u001bH\u0016¢\u0006\u0004\b&\u0010 J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\n\u0010*R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010,R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010.R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100"}, d2 = {"Lo/CWakeMode;", "Lo/CVolumeFlags;", "Lo/ValueClassSerializerStaticJsonValue;", "p0", "<init>", "(Lo/ValueClassSerializerStaticJsonValue;)V", "Lo/CVideoChangeFrameRateStrategy;", "", "RemoteActionCompatParcelizer", "(Lo/CVideoChangeFrameRateStrategy;)V", "AudioAttributesCompatParcelizer", "", "(Ljava/lang/String;)Lo/CVideoChangeFrameRateStrategy;", "", "Lo/CVideoChangeFrameRateStrategy$write;", "AudioAttributesImplApi26Parcelizer", "(Ljava/lang/String;)Ljava/util/List;", "Lo/getChildPeriodUidFromConcatenatedUid$write;", "(Ljava/lang/String;)Lo/getChildPeriodUidFromConcatenatedUid$write;", "Lo/e1;", "IconCompatParcelizer", "read", "()Ljava/util/List;", "Lo/NewNumberOtpResendRequest;", "", "AudioAttributesImplApi21Parcelizer", "()Lo/NewNumberOtpResendRequest;", "", "(I)Ljava/util/List;", "write", "", "(J)Ljava/util/List;", "()I", "(Ljava/lang/String;)V", "p1", "(Lo/getChildPeriodUidFromConcatenatedUid$write;Ljava/lang/String;)I", "MediaBrowserCompatCustomActionResultReceiver", "(Ljava/lang/String;)I", "MediaBrowserCompatItemReceiver", "(Ljava/lang/String;Lo/e1;)V", "(Ljava/lang/String;J)V", "AudioAttributesImplBaseParcelizer", "(Ljava/lang/String;I)V", "(Ljava/lang/String;J)I", "Lo/ValueClassSerializerStaticJsonValue;", "Lo/serializeE0BElUM;", "Lo/serializeE0BElUM;", "Lo/ULongSerializer;", "Lo/ULongSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CWakeMode implements CVolumeFlags {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final ULongSerializer<CVideoChangeFrameRateStrategy> read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final ValueClassSerializerStaticJsonValue AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final serializeE0BElUM<CVideoChangeFrameRateStrategy> write;

    public CWakeMode(ValueClassSerializerStaticJsonValue valueClassSerializerStaticJsonValue) {
        toMagicModuleMetaRepoModel.write(valueClassSerializerStaticJsonValue, "");
        this.AudioAttributesCompatParcelizer = valueClassSerializerStaticJsonValue;
        this.write = new serializeE0BElUM<CVideoChangeFrameRateStrategy>() { // from class: o.CWakeMode.2
            @Override // kotlin.serializeE0BElUM
            public final /* synthetic */ void IconCompatParcelizer(setDrawEntryLabels setdrawentrylabels, CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy) {
                read(setdrawentrylabels, cVideoChangeFrameRateStrategy);
            }

            @Override // kotlin.serializeE0BElUM
            public final String read() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            private static void read(setDrawEntryLabels setdrawentrylabels, CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy) {
                toMagicModuleMetaRepoModel.write(setdrawentrylabels, "");
                toMagicModuleMetaRepoModel.write(cVideoChangeFrameRateStrategy, "");
                setdrawentrylabels.RemoteActionCompatParcelizer(1, cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer);
                setdrawentrylabels.IconCompatParcelizer(2, syncClocks.IconCompatParcelizer(cVideoChangeFrameRateStrategy.onCommand));
                setdrawentrylabels.RemoteActionCompatParcelizer(3, cVideoChangeFrameRateStrategy.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                setdrawentrylabels.RemoteActionCompatParcelizer(4, cVideoChangeFrameRateStrategy.MediaBrowserCompatItemReceiver);
                e1.Companion companion = e1.INSTANCE;
                setdrawentrylabels.read(5, e1.Companion.IconCompatParcelizer(cVideoChangeFrameRateStrategy.AudioAttributesImplBaseParcelizer));
                e1.Companion companion2 = e1.INSTANCE;
                setdrawentrylabels.read(6, e1.Companion.IconCompatParcelizer(cVideoChangeFrameRateStrategy.MediaBrowserCompatSearchResultReceiver));
                setdrawentrylabels.IconCompatParcelizer(7, cVideoChangeFrameRateStrategy.MediaBrowserCompatCustomActionResultReceiver);
                setdrawentrylabels.IconCompatParcelizer(8, cVideoChangeFrameRateStrategy.MediaBrowserCompatMediaItem);
                setdrawentrylabels.IconCompatParcelizer(9, cVideoChangeFrameRateStrategy.AudioAttributesImplApi26Parcelizer);
                setdrawentrylabels.IconCompatParcelizer(10, cVideoChangeFrameRateStrategy.onAddQueueItem);
                setdrawentrylabels.IconCompatParcelizer(11, syncClocks.read(cVideoChangeFrameRateStrategy.RemoteActionCompatParcelizer));
                setdrawentrylabels.IconCompatParcelizer(12, cVideoChangeFrameRateStrategy.read);
                setdrawentrylabels.IconCompatParcelizer(13, cVideoChangeFrameRateStrategy.RatingCompat);
                setdrawentrylabels.IconCompatParcelizer(14, cVideoChangeFrameRateStrategy.MediaMetadataCompat);
                setdrawentrylabels.IconCompatParcelizer(15, cVideoChangeFrameRateStrategy.onCustomAction);
                setdrawentrylabels.IconCompatParcelizer(16, cVideoChangeFrameRateStrategy.write ? 1L : 0L);
                setdrawentrylabels.IconCompatParcelizer(17, syncClocks.read(cVideoChangeFrameRateStrategy.MediaDescriptionCompat));
                setdrawentrylabels.IconCompatParcelizer(18, cVideoChangeFrameRateStrategy.getOnPlayFromMediaId());
                setdrawentrylabels.IconCompatParcelizer(19, cVideoChangeFrameRateStrategy.getOnPlay());
                setdrawentrylabels.IconCompatParcelizer(20, cVideoChangeFrameRateStrategy.getOnFastForward());
                setdrawentrylabels.IconCompatParcelizer(21, cVideoChangeFrameRateStrategy.getOnPause());
                setdrawentrylabels.IconCompatParcelizer(22, cVideoChangeFrameRateStrategy.getOnMediaButtonEvent());
                String onPlayFromSearch = cVideoChangeFrameRateStrategy.getOnPlayFromSearch();
                if (onPlayFromSearch == null) {
                    setdrawentrylabels.read(23);
                } else {
                    setdrawentrylabels.RemoteActionCompatParcelizer(23, onPlayFromSearch);
                }
                Boolean handleMediaPlayPauseIfPendingOnHandler = cVideoChangeFrameRateStrategy.getHandleMediaPlayPauseIfPendingOnHandler();
                if ((handleMediaPlayPauseIfPendingOnHandler != null ? Integer.valueOf(handleMediaPlayPauseIfPendingOnHandler.booleanValue() ? 1 : 0) : null) == null) {
                    setdrawentrylabels.read(24);
                } else {
                    setdrawentrylabels.IconCompatParcelizer(24, r0.intValue());
                }
                e eVar = cVideoChangeFrameRateStrategy.AudioAttributesCompatParcelizer;
                setdrawentrylabels.IconCompatParcelizer(25, syncClocks.read(eVar.getAudioAttributesCompatParcelizer()));
                setdrawentrylabels.read(26, syncClocks.read(eVar.getRead()));
                setdrawentrylabels.IconCompatParcelizer(27, eVar.getWrite() ? 1L : 0L);
                setdrawentrylabels.IconCompatParcelizer(28, eVar.getRemoteActionCompatParcelizer() ? 1L : 0L);
                setdrawentrylabels.IconCompatParcelizer(29, eVar.getAudioAttributesImplApi21Parcelizer() ? 1L : 0L);
                setdrawentrylabels.IconCompatParcelizer(30, eVar.getAudioAttributesImplApi26Parcelizer() ? 1L : 0L);
                setdrawentrylabels.IconCompatParcelizer(31, eVar.getMediaBrowserCompatItemReceiver());
                setdrawentrylabels.IconCompatParcelizer(32, eVar.getMediaBrowserCompatCustomActionResultReceiver());
                setdrawentrylabels.read(33, syncClocks.read(eVar.write()));
            }
        };
        this.read = new ULongSerializer<CVideoChangeFrameRateStrategy>() { // from class: o.CWakeMode.4
            @Override // kotlin.ULongSerializer
            public final /* bridge */ /* synthetic */ void AudioAttributesCompatParcelizer(setDrawEntryLabels setdrawentrylabels, CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy) {
                AudioAttributesCompatParcelizer2(setdrawentrylabels, cVideoChangeFrameRateStrategy);
            }

            @Override // kotlin.ULongSerializer
            public final String IconCompatParcelizer() {
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            }

            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: avoid collision after fix types in other method */
            private static void AudioAttributesCompatParcelizer2(setDrawEntryLabels setdrawentrylabels, CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy) {
                toMagicModuleMetaRepoModel.write(setdrawentrylabels, "");
                toMagicModuleMetaRepoModel.write(cVideoChangeFrameRateStrategy, "");
                setdrawentrylabels.RemoteActionCompatParcelizer(1, cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer);
                setdrawentrylabels.IconCompatParcelizer(2, syncClocks.IconCompatParcelizer(cVideoChangeFrameRateStrategy.onCommand));
                setdrawentrylabels.RemoteActionCompatParcelizer(3, cVideoChangeFrameRateStrategy.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                setdrawentrylabels.RemoteActionCompatParcelizer(4, cVideoChangeFrameRateStrategy.MediaBrowserCompatItemReceiver);
                e1.Companion companion = e1.INSTANCE;
                setdrawentrylabels.read(5, e1.Companion.IconCompatParcelizer(cVideoChangeFrameRateStrategy.AudioAttributesImplBaseParcelizer));
                e1.Companion companion2 = e1.INSTANCE;
                setdrawentrylabels.read(6, e1.Companion.IconCompatParcelizer(cVideoChangeFrameRateStrategy.MediaBrowserCompatSearchResultReceiver));
                setdrawentrylabels.IconCompatParcelizer(7, cVideoChangeFrameRateStrategy.MediaBrowserCompatCustomActionResultReceiver);
                setdrawentrylabels.IconCompatParcelizer(8, cVideoChangeFrameRateStrategy.MediaBrowserCompatMediaItem);
                setdrawentrylabels.IconCompatParcelizer(9, cVideoChangeFrameRateStrategy.AudioAttributesImplApi26Parcelizer);
                setdrawentrylabels.IconCompatParcelizer(10, cVideoChangeFrameRateStrategy.onAddQueueItem);
                setdrawentrylabels.IconCompatParcelizer(11, syncClocks.read(cVideoChangeFrameRateStrategy.RemoteActionCompatParcelizer));
                setdrawentrylabels.IconCompatParcelizer(12, cVideoChangeFrameRateStrategy.read);
                setdrawentrylabels.IconCompatParcelizer(13, cVideoChangeFrameRateStrategy.RatingCompat);
                setdrawentrylabels.IconCompatParcelizer(14, cVideoChangeFrameRateStrategy.MediaMetadataCompat);
                setdrawentrylabels.IconCompatParcelizer(15, cVideoChangeFrameRateStrategy.onCustomAction);
                setdrawentrylabels.IconCompatParcelizer(16, cVideoChangeFrameRateStrategy.write ? 1L : 0L);
                setdrawentrylabels.IconCompatParcelizer(17, syncClocks.read(cVideoChangeFrameRateStrategy.MediaDescriptionCompat));
                setdrawentrylabels.IconCompatParcelizer(18, cVideoChangeFrameRateStrategy.getOnPlayFromMediaId());
                setdrawentrylabels.IconCompatParcelizer(19, cVideoChangeFrameRateStrategy.getOnPlay());
                setdrawentrylabels.IconCompatParcelizer(20, cVideoChangeFrameRateStrategy.getOnFastForward());
                setdrawentrylabels.IconCompatParcelizer(21, cVideoChangeFrameRateStrategy.getOnPause());
                setdrawentrylabels.IconCompatParcelizer(22, cVideoChangeFrameRateStrategy.getOnMediaButtonEvent());
                String onPlayFromSearch = cVideoChangeFrameRateStrategy.getOnPlayFromSearch();
                if (onPlayFromSearch == null) {
                    setdrawentrylabels.read(23);
                } else {
                    setdrawentrylabels.RemoteActionCompatParcelizer(23, onPlayFromSearch);
                }
                Boolean handleMediaPlayPauseIfPendingOnHandler = cVideoChangeFrameRateStrategy.getHandleMediaPlayPauseIfPendingOnHandler();
                if ((handleMediaPlayPauseIfPendingOnHandler != null ? Integer.valueOf(handleMediaPlayPauseIfPendingOnHandler.booleanValue() ? 1 : 0) : null) == null) {
                    setdrawentrylabels.read(24);
                } else {
                    setdrawentrylabels.IconCompatParcelizer(24, r0.intValue());
                }
                e eVar = cVideoChangeFrameRateStrategy.AudioAttributesCompatParcelizer;
                setdrawentrylabels.IconCompatParcelizer(25, syncClocks.read(eVar.getAudioAttributesCompatParcelizer()));
                setdrawentrylabels.read(26, syncClocks.read(eVar.getRead()));
                setdrawentrylabels.IconCompatParcelizer(27, eVar.getWrite() ? 1L : 0L);
                setdrawentrylabels.IconCompatParcelizer(28, eVar.getRemoteActionCompatParcelizer() ? 1L : 0L);
                setdrawentrylabels.IconCompatParcelizer(29, eVar.getAudioAttributesImplApi21Parcelizer() ? 1L : 0L);
                setdrawentrylabels.IconCompatParcelizer(30, eVar.getAudioAttributesImplApi26Parcelizer() ? 1L : 0L);
                setdrawentrylabels.IconCompatParcelizer(31, eVar.getMediaBrowserCompatItemReceiver());
                setdrawentrylabels.IconCompatParcelizer(32, eVar.getMediaBrowserCompatCustomActionResultReceiver());
                setdrawentrylabels.read(33, syncClocks.read(eVar.write()));
                setdrawentrylabels.RemoteActionCompatParcelizer(34, cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer);
            }
        };
    }

    @Override // kotlin.CVolumeFlags
    public final void RemoteActionCompatParcelizer(final CVideoChangeFrameRateStrategy p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, false, true, new getAnswerMap() { // from class: o.getBackBufferDurationUs
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(CWakeMode cWakeMode, CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy, setDrawHoleEnabled setdrawholeenabled) throws Exception {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        cWakeMode.write.RemoteActionCompatParcelizer(setdrawholeenabled, cVideoChangeFrameRateStrategy);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.CVolumeFlags
    public final void AudioAttributesCompatParcelizer(final CVideoChangeFrameRateStrategy p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, false, true, new getAnswerMap() { // from class: o.setLiveConfiguration
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.read(this.RemoteActionCompatParcelizer, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(CWakeMode cWakeMode, CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy, setDrawHoleEnabled setdrawholeenabled) throws Exception {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        cWakeMode.read.read(setdrawholeenabled, cVideoChangeFrameRateStrategy);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.CVolumeFlags
    public final CVideoChangeFrameRateStrategy AudioAttributesCompatParcelizer(final String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "SELECT * FROM workspec WHERE id=?";
        return (CVideoChangeFrameRateStrategy) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, true, false, new getAnswerMap() { // from class: o.DefaultLivePlaybackSpeedControl1
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.RatingCompat(str, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CVideoChangeFrameRateStrategy RatingCompat(String str, String str2, setDrawHoleEnabled setdrawholeenabled) {
        boolean z;
        int i;
        String strAudioAttributesCompatParcelizer;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(1, str2);
            int iWrite = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "id");
            int iWrite2 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, NotesDispatchAddressRequestKt.KEY_STATE);
            int iWrite3 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "worker_class_name");
            int iWrite4 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "input_merger_class_name");
            int iWrite5 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "input");
            int iWrite6 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "output");
            int iWrite7 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "initial_delay");
            int iWrite8 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "interval_duration");
            int iWrite9 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "flex_duration");
            int iWrite10 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "run_attempt_count");
            int iWrite11 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_policy");
            int iWrite12 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_delay_duration");
            int iWrite13 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "last_enqueue_time");
            int iWrite14 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "minimum_retention_duration");
            int iWrite15 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "schedule_requested_at");
            int iWrite16 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "run_in_foreground");
            int iWrite17 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "out_of_quota_policy");
            int iWrite18 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "period_count");
            int iWrite19 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "generation");
            int iWrite20 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "next_schedule_time_override");
            int iWrite21 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "next_schedule_time_override_generation");
            int iWrite22 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, DownloadService.KEY_STOP_REASON);
            int iWrite23 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trace_tag");
            int iWrite24 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_on_system_interruptions");
            int iWrite25 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "required_network_type");
            int iWrite26 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "required_network_request");
            int iWrite27 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_charging");
            int iWrite28 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_device_idle");
            int iWrite29 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_battery_not_low");
            int iWrite30 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_storage_not_low");
            int iWrite31 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trigger_content_update_delay");
            int iWrite32 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trigger_max_content_delay");
            int iWrite33 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "content_uri_triggers");
            CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy = null;
            Boolean boolValueOf = null;
            if (setdrawentrylabelsIconCompatParcelizer.write()) {
                String strAudioAttributesCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite);
                getChildPeriodUidFromConcatenatedUid.write writeVarIconCompatParcelizer = syncClocks.IconCompatParcelizer((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite2));
                String strAudioAttributesCompatParcelizer3 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite3);
                String strAudioAttributesCompatParcelizer4 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite4);
                byte[] bArrRemoteActionCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(iWrite5);
                e1.Companion companion = e1.INSTANCE;
                e1 e1VarIconCompatParcelizer = e1.Companion.IconCompatParcelizer(bArrRemoteActionCompatParcelizer);
                byte[] bArrRemoteActionCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(iWrite6);
                e1.Companion companion2 = e1.INSTANCE;
                e1 e1VarIconCompatParcelizer2 = e1.Companion.IconCompatParcelizer(bArrRemoteActionCompatParcelizer2);
                long jIconCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite7);
                long jIconCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite8);
                long jIconCompatParcelizer3 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite9);
                int iIconCompatParcelizer = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite10);
                verifyPendingInstall verifypendinginstall = syncClocks.read((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite11));
                long jIconCompatParcelizer4 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite12);
                long jIconCompatParcelizer5 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite13);
                long jIconCompatParcelizer6 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite14);
                long jIconCompatParcelizer7 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite15);
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite16)) != 0) {
                    i = iWrite17;
                    z = true;
                } else {
                    z = false;
                    i = iWrite17;
                }
                qaa qaaVarWrite = syncClocks.write((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i));
                int iIconCompatParcelizer2 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite18);
                int iIconCompatParcelizer3 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite19);
                long jIconCompatParcelizer8 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite20);
                int iIconCompatParcelizer4 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite21);
                int iIconCompatParcelizer5 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite22);
                if (setdrawentrylabelsIconCompatParcelizer.AudioAttributesImplBaseParcelizer(iWrite23)) {
                    i2 = iWrite24;
                    strAudioAttributesCompatParcelizer = null;
                } else {
                    strAudioAttributesCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite23);
                    i2 = iWrite24;
                }
                Integer numValueOf = setdrawentrylabelsIconCompatParcelizer.AudioAttributesImplBaseParcelizer(i2) ? null : Integer.valueOf((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i2));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                ia iaVarRemoteActionCompatParcelizer = syncClocks.RemoteActionCompatParcelizer((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite25));
                buildTextRenderers buildtextrenderersWrite = syncClocks.write(setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(iWrite26));
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite27)) != 0) {
                    i3 = iWrite28;
                    z2 = true;
                } else {
                    z2 = false;
                    i3 = iWrite28;
                }
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i3)) != 0) {
                    i4 = iWrite29;
                    z3 = true;
                } else {
                    z3 = false;
                    i4 = iWrite29;
                }
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i4)) != 0) {
                    i5 = iWrite30;
                    z4 = true;
                } else {
                    z4 = false;
                    i5 = iWrite30;
                }
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i5)) != 0) {
                    i6 = iWrite31;
                    z5 = true;
                } else {
                    z5 = false;
                    i6 = iWrite31;
                }
                cVideoChangeFrameRateStrategy = new CVideoChangeFrameRateStrategy(strAudioAttributesCompatParcelizer2, writeVarIconCompatParcelizer, strAudioAttributesCompatParcelizer3, strAudioAttributesCompatParcelizer4, e1VarIconCompatParcelizer, e1VarIconCompatParcelizer2, jIconCompatParcelizer, jIconCompatParcelizer2, jIconCompatParcelizer3, new e(buildtextrenderersWrite, iaVarRemoteActionCompatParcelizer, z2, z3, z4, z5, setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i6), setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite32), syncClocks.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(iWrite33))), iIconCompatParcelizer, verifypendinginstall, jIconCompatParcelizer4, jIconCompatParcelizer5, jIconCompatParcelizer6, jIconCompatParcelizer7, z, qaaVarWrite, iIconCompatParcelizer2, iIconCompatParcelizer3, jIconCompatParcelizer8, iIconCompatParcelizer4, iIconCompatParcelizer5, strAudioAttributesCompatParcelizer, bool);
            }
            return cVideoChangeFrameRateStrategy;
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final List<CVideoChangeFrameRateStrategy.write> AudioAttributesImplApi26Parcelizer(final String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, true, false, new getAnswerMap() { // from class: o.onPrepared
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.onAddQueueItem(str, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List onAddQueueItem(String str, String str2, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(1, str2);
            ArrayList arrayList = new ArrayList();
            while (setdrawentrylabelsIconCompatParcelizer.write()) {
                arrayList.add(new CVideoChangeFrameRateStrategy.write(setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(0), syncClocks.IconCompatParcelizer((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(1))));
            }
            return arrayList;
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final getChildPeriodUidFromConcatenatedUid.write RemoteActionCompatParcelizer(final String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "SELECT state FROM workspec WHERE id=?";
        return (getChildPeriodUidFromConcatenatedUid.write) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, true, false, new getAnswerMap() { // from class: o.getAllocator
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.MediaDescriptionCompat(str, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getChildPeriodUidFromConcatenatedUid.write MediaDescriptionCompat(String str, String str2, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(1, str2);
            getChildPeriodUidFromConcatenatedUid.write writeVarIconCompatParcelizer = null;
            if (setdrawentrylabelsIconCompatParcelizer.write()) {
                Integer numValueOf = setdrawentrylabelsIconCompatParcelizer.AudioAttributesImplBaseParcelizer(0) ? null : Integer.valueOf((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(0));
                if (numValueOf != null) {
                    writeVarIconCompatParcelizer = syncClocks.IconCompatParcelizer(numValueOf.intValue());
                }
            }
            return writeVarIconCompatParcelizer;
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final List<e1> IconCompatParcelizer(final String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)";
        return (List) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, true, false, new getAnswerMap() { // from class: o.DefaultLivePlaybackSpeedControlBuilder
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.MediaBrowserCompatSearchResultReceiver(str, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List MediaBrowserCompatSearchResultReceiver(String str, String str2, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(1, str2);
            ArrayList arrayList = new ArrayList();
            while (setdrawentrylabelsIconCompatParcelizer.write()) {
                byte[] bArrRemoteActionCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(0);
                e1.Companion companion = e1.INSTANCE;
                arrayList.add(e1.Companion.IconCompatParcelizer(bArrRemoteActionCompatParcelizer));
            }
            return arrayList;
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final List<String> read(final String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, true, false, new getAnswerMap() { // from class: o.adjustTargetLiveOffsetUs
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.MediaMetadataCompat(str, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List MediaMetadataCompat(String str, String str2, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(1, str2);
            ArrayList arrayList = new ArrayList();
            while (setdrawentrylabelsIconCompatParcelizer.write()) {
                arrayList.add(setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(0));
            }
            return arrayList;
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final List<String> RemoteActionCompatParcelizer() {
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)";
        return (List) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, true, false, new getAnswerMap() { // from class: o.smooth
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.AudioAttributesImplApi21Parcelizer(str, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List AudioAttributesImplApi21Parcelizer(String str, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (setdrawentrylabelsIconCompatParcelizer.write()) {
                arrayList.add(setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(0));
            }
            return arrayList;
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final NewNumberOtpResendRequest<Boolean> AudioAttributesImplApi21Parcelizer() {
        final String str = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1";
        return setPaint.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, new String[]{"workspec"}, new getAnswerMap() { // from class: o.shouldContinueLoading
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CWakeMode.MediaMetadataCompat(str, (setDrawHoleEnabled) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaMetadataCompat(String str, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            boolean z = false;
            if (setdrawentrylabelsIconCompatParcelizer.write()) {
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(0)) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final List<CVideoChangeFrameRateStrategy> RemoteActionCompatParcelizer(final int p0) {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))";
        return (List) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, true, false, new getAnswerMap() { // from class: o.setFallbackMaxPlaybackSpeed
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.RemoteActionCompatParcelizer(str, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List RemoteActionCompatParcelizer(String str, int i, setDrawHoleEnabled setdrawholeenabled) {
        int i2;
        boolean z;
        String strAudioAttributesCompatParcelizer;
        int i3;
        int i4;
        int i5;
        int i6;
        Integer numValueOf;
        int i7;
        Boolean boolValueOf;
        int i8;
        boolean z2;
        int i9;
        boolean z3;
        int i10;
        boolean z4;
        int i11;
        boolean z5;
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(1, i);
            int iWrite = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "id");
            int iWrite2 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, NotesDispatchAddressRequestKt.KEY_STATE);
            int iWrite3 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "worker_class_name");
            int iWrite4 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "input_merger_class_name");
            int iWrite5 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "input");
            int iWrite6 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "output");
            int iWrite7 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "initial_delay");
            int iWrite8 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "interval_duration");
            int iWrite9 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "flex_duration");
            int iWrite10 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "run_attempt_count");
            int iWrite11 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_policy");
            int iWrite12 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_delay_duration");
            int iWrite13 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "last_enqueue_time");
            int iWrite14 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "minimum_retention_duration");
            int iWrite15 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "schedule_requested_at");
            int iWrite16 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "run_in_foreground");
            int iWrite17 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "out_of_quota_policy");
            int iWrite18 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "period_count");
            int iWrite19 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "generation");
            int iWrite20 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "next_schedule_time_override");
            int iWrite21 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "next_schedule_time_override_generation");
            int iWrite22 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, DownloadService.KEY_STOP_REASON);
            int iWrite23 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trace_tag");
            int iWrite24 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_on_system_interruptions");
            int iWrite25 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "required_network_type");
            int iWrite26 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "required_network_request");
            int iWrite27 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_charging");
            int iWrite28 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_device_idle");
            int iWrite29 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_battery_not_low");
            int iWrite30 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_storage_not_low");
            int iWrite31 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trigger_content_update_delay");
            int iWrite32 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trigger_max_content_delay");
            int iWrite33 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (setdrawentrylabelsIconCompatParcelizer.write()) {
                String strAudioAttributesCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite);
                int i12 = iWrite13;
                int i13 = iWrite14;
                getChildPeriodUidFromConcatenatedUid.write writeVarIconCompatParcelizer = syncClocks.IconCompatParcelizer((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite2));
                String strAudioAttributesCompatParcelizer3 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite3);
                String strAudioAttributesCompatParcelizer4 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite4);
                byte[] bArrRemoteActionCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(iWrite5);
                e1.Companion companion = e1.INSTANCE;
                e1 e1VarIconCompatParcelizer = e1.Companion.IconCompatParcelizer(bArrRemoteActionCompatParcelizer);
                byte[] bArrRemoteActionCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(iWrite6);
                e1.Companion companion2 = e1.INSTANCE;
                e1 e1VarIconCompatParcelizer2 = e1.Companion.IconCompatParcelizer(bArrRemoteActionCompatParcelizer2);
                long jIconCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite7);
                long jIconCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite8);
                long jIconCompatParcelizer3 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite9);
                int iIconCompatParcelizer = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite10);
                int i14 = iWrite;
                int i15 = iWrite2;
                verifyPendingInstall verifypendinginstall = syncClocks.read((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite11));
                long jIconCompatParcelizer4 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite12);
                long jIconCompatParcelizer5 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i12);
                long jIconCompatParcelizer6 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i13);
                int i16 = iWrite15;
                long jIconCompatParcelizer7 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i16);
                iWrite15 = i16;
                int i17 = iWrite16;
                int i18 = iWrite3;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i17)) != 0) {
                    i2 = iWrite17;
                    z = true;
                } else {
                    i2 = iWrite17;
                    z = false;
                }
                int i19 = iWrite4;
                qaa qaaVarWrite = syncClocks.write((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i2));
                int i20 = iWrite18;
                int i21 = i2;
                int iIconCompatParcelizer2 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i20);
                int i22 = iWrite19;
                int iIconCompatParcelizer3 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i22);
                int i23 = iWrite20;
                long jIconCompatParcelizer8 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i23);
                int i24 = iWrite21;
                int i25 = iWrite5;
                int iIconCompatParcelizer4 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i24);
                int i26 = iWrite7;
                int i27 = iWrite22;
                int i28 = iWrite6;
                int iIconCompatParcelizer5 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i27);
                int i29 = iWrite23;
                if (setdrawentrylabelsIconCompatParcelizer.AudioAttributesImplBaseParcelizer(i29)) {
                    i3 = i24;
                    i4 = iWrite24;
                    strAudioAttributesCompatParcelizer = null;
                } else {
                    strAudioAttributesCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(i29);
                    i3 = i24;
                    i4 = iWrite24;
                }
                if (setdrawentrylabelsIconCompatParcelizer.AudioAttributesImplBaseParcelizer(i4)) {
                    i5 = i29;
                    i6 = iWrite8;
                    numValueOf = null;
                } else {
                    i5 = i29;
                    i6 = iWrite8;
                    numValueOf = Integer.valueOf((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i4));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    i7 = iWrite25;
                } else {
                    i7 = iWrite25;
                    boolValueOf = null;
                }
                int i30 = iWrite9;
                ia iaVarRemoteActionCompatParcelizer = syncClocks.RemoteActionCompatParcelizer((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i7));
                int i31 = iWrite26;
                buildTextRenderers buildtextrenderersWrite = syncClocks.write(setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(i31));
                int i32 = i7;
                int i33 = iWrite27;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i33)) != 0) {
                    i8 = iWrite28;
                    z2 = true;
                } else {
                    i8 = iWrite28;
                    z2 = false;
                }
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i8)) != 0) {
                    i9 = iWrite29;
                    z3 = true;
                } else {
                    i9 = iWrite29;
                    z3 = false;
                }
                int i34 = iWrite10;
                int i35 = i8;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i9)) != 0) {
                    i10 = iWrite30;
                    z4 = true;
                } else {
                    i10 = iWrite30;
                    z4 = false;
                }
                int i36 = i9;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i10)) != 0) {
                    i11 = iWrite31;
                    z5 = true;
                } else {
                    i11 = iWrite31;
                    z5 = false;
                }
                int i37 = iWrite32;
                int i38 = i4;
                int i39 = iWrite33;
                iWrite33 = i39;
                arrayList.add(new CVideoChangeFrameRateStrategy(strAudioAttributesCompatParcelizer2, writeVarIconCompatParcelizer, strAudioAttributesCompatParcelizer3, strAudioAttributesCompatParcelizer4, e1VarIconCompatParcelizer, e1VarIconCompatParcelizer2, jIconCompatParcelizer, jIconCompatParcelizer2, jIconCompatParcelizer3, new e(buildtextrenderersWrite, iaVarRemoteActionCompatParcelizer, z2, z3, z4, z5, setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i11), setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i37), syncClocks.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(i39))), iIconCompatParcelizer, verifypendinginstall, jIconCompatParcelizer4, jIconCompatParcelizer5, jIconCompatParcelizer6, jIconCompatParcelizer7, z, qaaVarWrite, iIconCompatParcelizer2, iIconCompatParcelizer3, jIconCompatParcelizer8, iIconCompatParcelizer4, iIconCompatParcelizer5, strAudioAttributesCompatParcelizer, boolValueOf));
                iWrite3 = i18;
                iWrite32 = i37;
                iWrite = i14;
                iWrite4 = i19;
                iWrite17 = i21;
                iWrite18 = i20;
                iWrite19 = i22;
                iWrite6 = i28;
                iWrite8 = i6;
                iWrite24 = i38;
                iWrite13 = i12;
                iWrite14 = i13;
                iWrite2 = i15;
                iWrite16 = i17;
                iWrite20 = i23;
                iWrite22 = i27;
                iWrite31 = i11;
                iWrite5 = i25;
                iWrite21 = i3;
                iWrite7 = i26;
                iWrite23 = i5;
                iWrite30 = i10;
                iWrite9 = i30;
                iWrite25 = i32;
                iWrite26 = i31;
                iWrite27 = i33;
                iWrite28 = i35;
                iWrite10 = i34;
                iWrite29 = i36;
            }
            return arrayList;
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final List<CVideoChangeFrameRateStrategy> write() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time";
        return (List) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, true, false, new getAnswerMap() { // from class: o.calculateTargetBufferBytes
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.AudioAttributesImplApi26Parcelizer(str, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List AudioAttributesImplApi26Parcelizer(String str, setDrawHoleEnabled setdrawholeenabled) {
        int i;
        boolean z;
        String strAudioAttributesCompatParcelizer;
        int i2;
        int i3;
        int i4;
        int i5;
        Integer numValueOf;
        int i6;
        Boolean boolValueOf;
        int i7;
        boolean z2;
        int i8;
        boolean z3;
        int i9;
        boolean z4;
        int i10;
        boolean z5;
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            int iWrite = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "id");
            int iWrite2 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, NotesDispatchAddressRequestKt.KEY_STATE);
            int iWrite3 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "worker_class_name");
            int iWrite4 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "input_merger_class_name");
            int iWrite5 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "input");
            int iWrite6 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "output");
            int iWrite7 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "initial_delay");
            int iWrite8 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "interval_duration");
            int iWrite9 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "flex_duration");
            int iWrite10 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "run_attempt_count");
            int iWrite11 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_policy");
            int iWrite12 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_delay_duration");
            int iWrite13 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "last_enqueue_time");
            int iWrite14 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "minimum_retention_duration");
            int iWrite15 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "schedule_requested_at");
            int iWrite16 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "run_in_foreground");
            int iWrite17 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "out_of_quota_policy");
            int iWrite18 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "period_count");
            int iWrite19 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "generation");
            int iWrite20 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "next_schedule_time_override");
            int iWrite21 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "next_schedule_time_override_generation");
            int iWrite22 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, DownloadService.KEY_STOP_REASON);
            int iWrite23 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trace_tag");
            int iWrite24 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_on_system_interruptions");
            int iWrite25 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "required_network_type");
            int iWrite26 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "required_network_request");
            int iWrite27 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_charging");
            int iWrite28 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_device_idle");
            int iWrite29 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_battery_not_low");
            int iWrite30 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_storage_not_low");
            int iWrite31 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trigger_content_update_delay");
            int iWrite32 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trigger_max_content_delay");
            int iWrite33 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (setdrawentrylabelsIconCompatParcelizer.write()) {
                String strAudioAttributesCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite);
                int i11 = iWrite14;
                ArrayList arrayList2 = arrayList;
                getChildPeriodUidFromConcatenatedUid.write writeVarIconCompatParcelizer = syncClocks.IconCompatParcelizer((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite2));
                String strAudioAttributesCompatParcelizer3 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite3);
                String strAudioAttributesCompatParcelizer4 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite4);
                byte[] bArrRemoteActionCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(iWrite5);
                e1.Companion companion = e1.INSTANCE;
                e1 e1VarIconCompatParcelizer = e1.Companion.IconCompatParcelizer(bArrRemoteActionCompatParcelizer);
                byte[] bArrRemoteActionCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(iWrite6);
                e1.Companion companion2 = e1.INSTANCE;
                e1 e1VarIconCompatParcelizer2 = e1.Companion.IconCompatParcelizer(bArrRemoteActionCompatParcelizer2);
                long jIconCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite7);
                long jIconCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite8);
                long jIconCompatParcelizer3 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite9);
                int iIconCompatParcelizer = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite10);
                int i12 = iWrite2;
                int i13 = iWrite3;
                verifyPendingInstall verifypendinginstall = syncClocks.read((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite11));
                long jIconCompatParcelizer4 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite12);
                long jIconCompatParcelizer5 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite13);
                long jIconCompatParcelizer6 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i11);
                int i14 = iWrite15;
                long jIconCompatParcelizer7 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i14);
                int i15 = iWrite;
                int i16 = iWrite16;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i16)) != 0) {
                    i = iWrite17;
                    z = true;
                } else {
                    i = iWrite17;
                    z = false;
                }
                int i17 = iWrite4;
                qaa qaaVarWrite = syncClocks.write((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i));
                int i18 = iWrite18;
                int i19 = iWrite5;
                int iIconCompatParcelizer2 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i18);
                int i20 = iWrite19;
                int i21 = i;
                int iIconCompatParcelizer3 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i20);
                int i22 = iWrite20;
                long jIconCompatParcelizer8 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i22);
                int i23 = iWrite21;
                int i24 = iWrite6;
                int iIconCompatParcelizer4 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i23);
                int i25 = iWrite8;
                int i26 = iWrite22;
                int i27 = iWrite7;
                int iIconCompatParcelizer5 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i26);
                int i28 = iWrite23;
                if (setdrawentrylabelsIconCompatParcelizer.AudioAttributesImplBaseParcelizer(i28)) {
                    i2 = i23;
                    i3 = iWrite24;
                    strAudioAttributesCompatParcelizer = null;
                } else {
                    strAudioAttributesCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(i28);
                    i2 = i23;
                    i3 = iWrite24;
                }
                if (setdrawentrylabelsIconCompatParcelizer.AudioAttributesImplBaseParcelizer(i3)) {
                    i4 = i28;
                    i5 = iWrite9;
                    numValueOf = null;
                } else {
                    i4 = i28;
                    i5 = iWrite9;
                    numValueOf = Integer.valueOf((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i3));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    i6 = iWrite25;
                } else {
                    i6 = iWrite25;
                    boolValueOf = null;
                }
                int i29 = iWrite10;
                ia iaVarRemoteActionCompatParcelizer = syncClocks.RemoteActionCompatParcelizer((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i6));
                int i30 = iWrite26;
                buildTextRenderers buildtextrenderersWrite = syncClocks.write(setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(i30));
                int i31 = i6;
                int i32 = iWrite27;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i32)) != 0) {
                    i7 = iWrite28;
                    z2 = true;
                } else {
                    i7 = iWrite28;
                    z2 = false;
                }
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i7)) != 0) {
                    i8 = iWrite29;
                    z3 = true;
                } else {
                    i8 = iWrite29;
                    z3 = false;
                }
                int i33 = iWrite11;
                int i34 = i7;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i8)) != 0) {
                    i9 = iWrite30;
                    z4 = true;
                } else {
                    i9 = iWrite30;
                    z4 = false;
                }
                int i35 = i8;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i9)) != 0) {
                    i10 = iWrite31;
                    z5 = true;
                } else {
                    i10 = iWrite31;
                    z5 = false;
                }
                int i36 = iWrite32;
                int i37 = i3;
                int i38 = iWrite33;
                iWrite33 = i38;
                arrayList2.add(new CVideoChangeFrameRateStrategy(strAudioAttributesCompatParcelizer2, writeVarIconCompatParcelizer, strAudioAttributesCompatParcelizer3, strAudioAttributesCompatParcelizer4, e1VarIconCompatParcelizer, e1VarIconCompatParcelizer2, jIconCompatParcelizer, jIconCompatParcelizer2, jIconCompatParcelizer3, new e(buildtextrenderersWrite, iaVarRemoteActionCompatParcelizer, z2, z3, z4, z5, setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i10), setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i36), syncClocks.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(i38))), iIconCompatParcelizer, verifypendinginstall, jIconCompatParcelizer4, jIconCompatParcelizer5, jIconCompatParcelizer6, jIconCompatParcelizer7, z, qaaVarWrite, iIconCompatParcelizer2, iIconCompatParcelizer3, jIconCompatParcelizer8, iIconCompatParcelizer4, iIconCompatParcelizer5, strAudioAttributesCompatParcelizer, boolValueOf));
                iWrite = i15;
                iWrite15 = i14;
                iWrite32 = i36;
                iWrite4 = i17;
                iWrite5 = i19;
                iWrite17 = i21;
                iWrite16 = i16;
                iWrite7 = i27;
                iWrite9 = i5;
                iWrite24 = i37;
                iWrite14 = i11;
                iWrite18 = i18;
                iWrite19 = i20;
                iWrite20 = i22;
                iWrite22 = i26;
                iWrite31 = i10;
                iWrite6 = i24;
                iWrite21 = i2;
                iWrite3 = i13;
                iWrite8 = i25;
                iWrite23 = i4;
                arrayList = arrayList2;
                iWrite2 = i12;
                iWrite30 = i9;
                iWrite10 = i29;
                iWrite25 = i31;
                iWrite26 = i30;
                iWrite27 = i32;
                iWrite28 = i34;
                iWrite11 = i33;
                iWrite29 = i35;
            }
            return arrayList;
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final List<CVideoChangeFrameRateStrategy> AudioAttributesCompatParcelizer() {
        final String str = "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?";
        final int i = 200;
        return (List) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, true, false, new getAnswerMap(str, i) { // from class: o.onTracksSelected
            public final /* synthetic */ String IconCompatParcelizer;
            public final /* synthetic */ int read = 200;

            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.IconCompatParcelizer(this.IconCompatParcelizer, this.read, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List IconCompatParcelizer(String str, int i, setDrawHoleEnabled setdrawholeenabled) {
        int i2;
        boolean z;
        String strAudioAttributesCompatParcelizer;
        int i3;
        int i4;
        int i5;
        int i6;
        Integer numValueOf;
        int i7;
        Boolean boolValueOf;
        int i8;
        boolean z2;
        int i9;
        boolean z3;
        int i10;
        boolean z4;
        int i11;
        boolean z5;
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(1, i);
            int iWrite = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "id");
            int iWrite2 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, NotesDispatchAddressRequestKt.KEY_STATE);
            int iWrite3 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "worker_class_name");
            int iWrite4 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "input_merger_class_name");
            int iWrite5 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "input");
            int iWrite6 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "output");
            int iWrite7 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "initial_delay");
            int iWrite8 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "interval_duration");
            int iWrite9 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "flex_duration");
            int iWrite10 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "run_attempt_count");
            int iWrite11 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_policy");
            int iWrite12 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_delay_duration");
            int iWrite13 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "last_enqueue_time");
            int iWrite14 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "minimum_retention_duration");
            int iWrite15 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "schedule_requested_at");
            int iWrite16 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "run_in_foreground");
            int iWrite17 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "out_of_quota_policy");
            int iWrite18 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "period_count");
            int iWrite19 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "generation");
            int iWrite20 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "next_schedule_time_override");
            int iWrite21 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "next_schedule_time_override_generation");
            int iWrite22 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, DownloadService.KEY_STOP_REASON);
            int iWrite23 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trace_tag");
            int iWrite24 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_on_system_interruptions");
            int iWrite25 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "required_network_type");
            int iWrite26 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "required_network_request");
            int iWrite27 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_charging");
            int iWrite28 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_device_idle");
            int iWrite29 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_battery_not_low");
            int iWrite30 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_storage_not_low");
            int iWrite31 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trigger_content_update_delay");
            int iWrite32 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trigger_max_content_delay");
            int iWrite33 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (setdrawentrylabelsIconCompatParcelizer.write()) {
                String strAudioAttributesCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite);
                int i12 = iWrite13;
                int i13 = iWrite14;
                getChildPeriodUidFromConcatenatedUid.write writeVarIconCompatParcelizer = syncClocks.IconCompatParcelizer((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite2));
                String strAudioAttributesCompatParcelizer3 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite3);
                String strAudioAttributesCompatParcelizer4 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite4);
                byte[] bArrRemoteActionCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(iWrite5);
                e1.Companion companion = e1.INSTANCE;
                e1 e1VarIconCompatParcelizer = e1.Companion.IconCompatParcelizer(bArrRemoteActionCompatParcelizer);
                byte[] bArrRemoteActionCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(iWrite6);
                e1.Companion companion2 = e1.INSTANCE;
                e1 e1VarIconCompatParcelizer2 = e1.Companion.IconCompatParcelizer(bArrRemoteActionCompatParcelizer2);
                long jIconCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite7);
                long jIconCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite8);
                long jIconCompatParcelizer3 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite9);
                int iIconCompatParcelizer = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite10);
                int i14 = iWrite;
                int i15 = iWrite2;
                verifyPendingInstall verifypendinginstall = syncClocks.read((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite11));
                long jIconCompatParcelizer4 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite12);
                long jIconCompatParcelizer5 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i12);
                long jIconCompatParcelizer6 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i13);
                int i16 = iWrite15;
                long jIconCompatParcelizer7 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i16);
                iWrite15 = i16;
                int i17 = iWrite16;
                int i18 = iWrite3;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i17)) != 0) {
                    i2 = iWrite17;
                    z = true;
                } else {
                    i2 = iWrite17;
                    z = false;
                }
                int i19 = iWrite4;
                qaa qaaVarWrite = syncClocks.write((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i2));
                int i20 = iWrite18;
                int i21 = i2;
                int iIconCompatParcelizer2 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i20);
                int i22 = iWrite19;
                int iIconCompatParcelizer3 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i22);
                int i23 = iWrite20;
                long jIconCompatParcelizer8 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i23);
                int i24 = iWrite21;
                int i25 = iWrite5;
                int iIconCompatParcelizer4 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i24);
                int i26 = iWrite7;
                int i27 = iWrite22;
                int i28 = iWrite6;
                int iIconCompatParcelizer5 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i27);
                int i29 = iWrite23;
                if (setdrawentrylabelsIconCompatParcelizer.AudioAttributesImplBaseParcelizer(i29)) {
                    i3 = i24;
                    i4 = iWrite24;
                    strAudioAttributesCompatParcelizer = null;
                } else {
                    strAudioAttributesCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(i29);
                    i3 = i24;
                    i4 = iWrite24;
                }
                if (setdrawentrylabelsIconCompatParcelizer.AudioAttributesImplBaseParcelizer(i4)) {
                    i5 = i29;
                    i6 = iWrite8;
                    numValueOf = null;
                } else {
                    i5 = i29;
                    i6 = iWrite8;
                    numValueOf = Integer.valueOf((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i4));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    i7 = iWrite25;
                } else {
                    i7 = iWrite25;
                    boolValueOf = null;
                }
                int i30 = iWrite9;
                ia iaVarRemoteActionCompatParcelizer = syncClocks.RemoteActionCompatParcelizer((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i7));
                int i31 = iWrite26;
                buildTextRenderers buildtextrenderersWrite = syncClocks.write(setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(i31));
                int i32 = i7;
                int i33 = iWrite27;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i33)) != 0) {
                    i8 = iWrite28;
                    z2 = true;
                } else {
                    i8 = iWrite28;
                    z2 = false;
                }
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i8)) != 0) {
                    i9 = iWrite29;
                    z3 = true;
                } else {
                    i9 = iWrite29;
                    z3 = false;
                }
                int i34 = iWrite10;
                int i35 = i8;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i9)) != 0) {
                    i10 = iWrite30;
                    z4 = true;
                } else {
                    i10 = iWrite30;
                    z4 = false;
                }
                int i36 = i9;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i10)) != 0) {
                    i11 = iWrite31;
                    z5 = true;
                } else {
                    i11 = iWrite31;
                    z5 = false;
                }
                int i37 = iWrite32;
                int i38 = i4;
                int i39 = iWrite33;
                iWrite33 = i39;
                arrayList.add(new CVideoChangeFrameRateStrategy(strAudioAttributesCompatParcelizer2, writeVarIconCompatParcelizer, strAudioAttributesCompatParcelizer3, strAudioAttributesCompatParcelizer4, e1VarIconCompatParcelizer, e1VarIconCompatParcelizer2, jIconCompatParcelizer, jIconCompatParcelizer2, jIconCompatParcelizer3, new e(buildtextrenderersWrite, iaVarRemoteActionCompatParcelizer, z2, z3, z4, z5, setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i11), setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i37), syncClocks.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(i39))), iIconCompatParcelizer, verifypendinginstall, jIconCompatParcelizer4, jIconCompatParcelizer5, jIconCompatParcelizer6, jIconCompatParcelizer7, z, qaaVarWrite, iIconCompatParcelizer2, iIconCompatParcelizer3, jIconCompatParcelizer8, iIconCompatParcelizer4, iIconCompatParcelizer5, strAudioAttributesCompatParcelizer, boolValueOf));
                iWrite3 = i18;
                iWrite32 = i37;
                iWrite = i14;
                iWrite4 = i19;
                iWrite17 = i21;
                iWrite18 = i20;
                iWrite19 = i22;
                iWrite6 = i28;
                iWrite8 = i6;
                iWrite24 = i38;
                iWrite13 = i12;
                iWrite14 = i13;
                iWrite2 = i15;
                iWrite16 = i17;
                iWrite20 = i23;
                iWrite22 = i27;
                iWrite31 = i11;
                iWrite5 = i25;
                iWrite21 = i3;
                iWrite7 = i26;
                iWrite23 = i5;
                iWrite30 = i10;
                iWrite9 = i30;
                iWrite25 = i32;
                iWrite26 = i31;
                iWrite27 = i33;
                iWrite28 = i35;
                iWrite10 = i34;
                iWrite29 = i36;
            }
            return arrayList;
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final List<CVideoChangeFrameRateStrategy> AudioAttributesImplApi26Parcelizer() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1";
        return (List) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, true, false, new getAnswerMap() { // from class: o.setTargetLiveOffsetOverrideUs
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.RatingCompat(str, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List RatingCompat(String str, setDrawHoleEnabled setdrawholeenabled) {
        int i;
        boolean z;
        String strAudioAttributesCompatParcelizer;
        int i2;
        int i3;
        int i4;
        int i5;
        Integer numValueOf;
        int i6;
        Boolean boolValueOf;
        int i7;
        boolean z2;
        int i8;
        boolean z3;
        int i9;
        boolean z4;
        int i10;
        boolean z5;
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            int iWrite = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "id");
            int iWrite2 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, NotesDispatchAddressRequestKt.KEY_STATE);
            int iWrite3 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "worker_class_name");
            int iWrite4 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "input_merger_class_name");
            int iWrite5 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "input");
            int iWrite6 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "output");
            int iWrite7 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "initial_delay");
            int iWrite8 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "interval_duration");
            int iWrite9 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "flex_duration");
            int iWrite10 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "run_attempt_count");
            int iWrite11 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_policy");
            int iWrite12 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_delay_duration");
            int iWrite13 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "last_enqueue_time");
            int iWrite14 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "minimum_retention_duration");
            int iWrite15 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "schedule_requested_at");
            int iWrite16 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "run_in_foreground");
            int iWrite17 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "out_of_quota_policy");
            int iWrite18 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "period_count");
            int iWrite19 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "generation");
            int iWrite20 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "next_schedule_time_override");
            int iWrite21 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "next_schedule_time_override_generation");
            int iWrite22 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, DownloadService.KEY_STOP_REASON);
            int iWrite23 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trace_tag");
            int iWrite24 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_on_system_interruptions");
            int iWrite25 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "required_network_type");
            int iWrite26 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "required_network_request");
            int iWrite27 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_charging");
            int iWrite28 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_device_idle");
            int iWrite29 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_battery_not_low");
            int iWrite30 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_storage_not_low");
            int iWrite31 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trigger_content_update_delay");
            int iWrite32 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trigger_max_content_delay");
            int iWrite33 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (setdrawentrylabelsIconCompatParcelizer.write()) {
                String strAudioAttributesCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite);
                int i11 = iWrite14;
                ArrayList arrayList2 = arrayList;
                getChildPeriodUidFromConcatenatedUid.write writeVarIconCompatParcelizer = syncClocks.IconCompatParcelizer((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite2));
                String strAudioAttributesCompatParcelizer3 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite3);
                String strAudioAttributesCompatParcelizer4 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite4);
                byte[] bArrRemoteActionCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(iWrite5);
                e1.Companion companion = e1.INSTANCE;
                e1 e1VarIconCompatParcelizer = e1.Companion.IconCompatParcelizer(bArrRemoteActionCompatParcelizer);
                byte[] bArrRemoteActionCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(iWrite6);
                e1.Companion companion2 = e1.INSTANCE;
                e1 e1VarIconCompatParcelizer2 = e1.Companion.IconCompatParcelizer(bArrRemoteActionCompatParcelizer2);
                long jIconCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite7);
                long jIconCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite8);
                long jIconCompatParcelizer3 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite9);
                int iIconCompatParcelizer = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite10);
                int i12 = iWrite2;
                int i13 = iWrite3;
                verifyPendingInstall verifypendinginstall = syncClocks.read((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite11));
                long jIconCompatParcelizer4 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite12);
                long jIconCompatParcelizer5 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite13);
                long jIconCompatParcelizer6 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i11);
                int i14 = iWrite15;
                long jIconCompatParcelizer7 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i14);
                int i15 = iWrite;
                int i16 = iWrite16;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i16)) != 0) {
                    i = iWrite17;
                    z = true;
                } else {
                    i = iWrite17;
                    z = false;
                }
                int i17 = iWrite4;
                qaa qaaVarWrite = syncClocks.write((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i));
                int i18 = iWrite18;
                int i19 = iWrite5;
                int iIconCompatParcelizer2 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i18);
                int i20 = iWrite19;
                int i21 = i;
                int iIconCompatParcelizer3 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i20);
                int i22 = iWrite20;
                long jIconCompatParcelizer8 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i22);
                int i23 = iWrite21;
                int i24 = iWrite6;
                int iIconCompatParcelizer4 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i23);
                int i25 = iWrite8;
                int i26 = iWrite22;
                int i27 = iWrite7;
                int iIconCompatParcelizer5 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i26);
                int i28 = iWrite23;
                if (setdrawentrylabelsIconCompatParcelizer.AudioAttributesImplBaseParcelizer(i28)) {
                    i2 = i23;
                    i3 = iWrite24;
                    strAudioAttributesCompatParcelizer = null;
                } else {
                    strAudioAttributesCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(i28);
                    i2 = i23;
                    i3 = iWrite24;
                }
                if (setdrawentrylabelsIconCompatParcelizer.AudioAttributesImplBaseParcelizer(i3)) {
                    i4 = i28;
                    i5 = iWrite9;
                    numValueOf = null;
                } else {
                    i4 = i28;
                    i5 = iWrite9;
                    numValueOf = Integer.valueOf((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i3));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    i6 = iWrite25;
                } else {
                    i6 = iWrite25;
                    boolValueOf = null;
                }
                int i29 = iWrite10;
                ia iaVarRemoteActionCompatParcelizer = syncClocks.RemoteActionCompatParcelizer((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i6));
                int i30 = iWrite26;
                buildTextRenderers buildtextrenderersWrite = syncClocks.write(setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(i30));
                int i31 = i6;
                int i32 = iWrite27;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i32)) != 0) {
                    i7 = iWrite28;
                    z2 = true;
                } else {
                    i7 = iWrite28;
                    z2 = false;
                }
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i7)) != 0) {
                    i8 = iWrite29;
                    z3 = true;
                } else {
                    i8 = iWrite29;
                    z3 = false;
                }
                int i33 = iWrite11;
                int i34 = i7;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i8)) != 0) {
                    i9 = iWrite30;
                    z4 = true;
                } else {
                    i9 = iWrite30;
                    z4 = false;
                }
                int i35 = i8;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i9)) != 0) {
                    i10 = iWrite31;
                    z5 = true;
                } else {
                    i10 = iWrite31;
                    z5 = false;
                }
                int i36 = iWrite32;
                int i37 = i3;
                int i38 = iWrite33;
                iWrite33 = i38;
                arrayList2.add(new CVideoChangeFrameRateStrategy(strAudioAttributesCompatParcelizer2, writeVarIconCompatParcelizer, strAudioAttributesCompatParcelizer3, strAudioAttributesCompatParcelizer4, e1VarIconCompatParcelizer, e1VarIconCompatParcelizer2, jIconCompatParcelizer, jIconCompatParcelizer2, jIconCompatParcelizer3, new e(buildtextrenderersWrite, iaVarRemoteActionCompatParcelizer, z2, z3, z4, z5, setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i10), setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i36), syncClocks.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(i38))), iIconCompatParcelizer, verifypendinginstall, jIconCompatParcelizer4, jIconCompatParcelizer5, jIconCompatParcelizer6, jIconCompatParcelizer7, z, qaaVarWrite, iIconCompatParcelizer2, iIconCompatParcelizer3, jIconCompatParcelizer8, iIconCompatParcelizer4, iIconCompatParcelizer5, strAudioAttributesCompatParcelizer, boolValueOf));
                iWrite = i15;
                iWrite15 = i14;
                iWrite32 = i36;
                iWrite4 = i17;
                iWrite5 = i19;
                iWrite17 = i21;
                iWrite16 = i16;
                iWrite7 = i27;
                iWrite9 = i5;
                iWrite24 = i37;
                iWrite14 = i11;
                iWrite18 = i18;
                iWrite19 = i20;
                iWrite20 = i22;
                iWrite22 = i26;
                iWrite31 = i10;
                iWrite6 = i24;
                iWrite21 = i2;
                iWrite3 = i13;
                iWrite8 = i25;
                iWrite23 = i4;
                arrayList = arrayList2;
                iWrite2 = i12;
                iWrite30 = i9;
                iWrite10 = i29;
                iWrite25 = i31;
                iWrite26 = i30;
                iWrite27 = i32;
                iWrite28 = i34;
                iWrite11 = i33;
                iWrite29 = i35;
            }
            return arrayList;
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final List<CVideoChangeFrameRateStrategy> IconCompatParcelizer() {
        final String str = "SELECT * FROM workspec WHERE state=1";
        return (List) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, true, false, new getAnswerMap() { // from class: o.setMinUpdateIntervalMs
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.MediaBrowserCompatMediaItem(str, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List MediaBrowserCompatMediaItem(String str, setDrawHoleEnabled setdrawholeenabled) {
        int i;
        boolean z;
        String strAudioAttributesCompatParcelizer;
        int i2;
        int i3;
        int i4;
        int i5;
        Integer numValueOf;
        int i6;
        Boolean boolValueOf;
        int i7;
        boolean z2;
        int i8;
        boolean z3;
        int i9;
        boolean z4;
        int i10;
        boolean z5;
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            int iWrite = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "id");
            int iWrite2 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, NotesDispatchAddressRequestKt.KEY_STATE);
            int iWrite3 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "worker_class_name");
            int iWrite4 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "input_merger_class_name");
            int iWrite5 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "input");
            int iWrite6 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "output");
            int iWrite7 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "initial_delay");
            int iWrite8 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "interval_duration");
            int iWrite9 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "flex_duration");
            int iWrite10 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "run_attempt_count");
            int iWrite11 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_policy");
            int iWrite12 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_delay_duration");
            int iWrite13 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "last_enqueue_time");
            int iWrite14 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "minimum_retention_duration");
            int iWrite15 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "schedule_requested_at");
            int iWrite16 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "run_in_foreground");
            int iWrite17 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "out_of_quota_policy");
            int iWrite18 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "period_count");
            int iWrite19 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "generation");
            int iWrite20 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "next_schedule_time_override");
            int iWrite21 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "next_schedule_time_override_generation");
            int iWrite22 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, DownloadService.KEY_STOP_REASON);
            int iWrite23 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trace_tag");
            int iWrite24 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_on_system_interruptions");
            int iWrite25 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "required_network_type");
            int iWrite26 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "required_network_request");
            int iWrite27 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_charging");
            int iWrite28 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_device_idle");
            int iWrite29 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_battery_not_low");
            int iWrite30 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_storage_not_low");
            int iWrite31 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trigger_content_update_delay");
            int iWrite32 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trigger_max_content_delay");
            int iWrite33 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (setdrawentrylabelsIconCompatParcelizer.write()) {
                String strAudioAttributesCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite);
                int i11 = iWrite14;
                ArrayList arrayList2 = arrayList;
                getChildPeriodUidFromConcatenatedUid.write writeVarIconCompatParcelizer = syncClocks.IconCompatParcelizer((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite2));
                String strAudioAttributesCompatParcelizer3 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite3);
                String strAudioAttributesCompatParcelizer4 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite4);
                byte[] bArrRemoteActionCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(iWrite5);
                e1.Companion companion = e1.INSTANCE;
                e1 e1VarIconCompatParcelizer = e1.Companion.IconCompatParcelizer(bArrRemoteActionCompatParcelizer);
                byte[] bArrRemoteActionCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(iWrite6);
                e1.Companion companion2 = e1.INSTANCE;
                e1 e1VarIconCompatParcelizer2 = e1.Companion.IconCompatParcelizer(bArrRemoteActionCompatParcelizer2);
                long jIconCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite7);
                long jIconCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite8);
                long jIconCompatParcelizer3 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite9);
                int iIconCompatParcelizer = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite10);
                int i12 = iWrite2;
                int i13 = iWrite3;
                verifyPendingInstall verifypendinginstall = syncClocks.read((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite11));
                long jIconCompatParcelizer4 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite12);
                long jIconCompatParcelizer5 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite13);
                long jIconCompatParcelizer6 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i11);
                int i14 = iWrite15;
                long jIconCompatParcelizer7 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i14);
                int i15 = iWrite;
                int i16 = iWrite16;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i16)) != 0) {
                    i = iWrite17;
                    z = true;
                } else {
                    i = iWrite17;
                    z = false;
                }
                int i17 = iWrite4;
                qaa qaaVarWrite = syncClocks.write((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i));
                int i18 = iWrite18;
                int i19 = iWrite5;
                int iIconCompatParcelizer2 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i18);
                int i20 = iWrite19;
                int i21 = i;
                int iIconCompatParcelizer3 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i20);
                int i22 = iWrite20;
                long jIconCompatParcelizer8 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i22);
                int i23 = iWrite21;
                int i24 = iWrite6;
                int iIconCompatParcelizer4 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i23);
                int i25 = iWrite8;
                int i26 = iWrite22;
                int i27 = iWrite7;
                int iIconCompatParcelizer5 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i26);
                int i28 = iWrite23;
                if (setdrawentrylabelsIconCompatParcelizer.AudioAttributesImplBaseParcelizer(i28)) {
                    i2 = i23;
                    i3 = iWrite24;
                    strAudioAttributesCompatParcelizer = null;
                } else {
                    strAudioAttributesCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(i28);
                    i2 = i23;
                    i3 = iWrite24;
                }
                if (setdrawentrylabelsIconCompatParcelizer.AudioAttributesImplBaseParcelizer(i3)) {
                    i4 = i28;
                    i5 = iWrite9;
                    numValueOf = null;
                } else {
                    i4 = i28;
                    i5 = iWrite9;
                    numValueOf = Integer.valueOf((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i3));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    i6 = iWrite25;
                } else {
                    i6 = iWrite25;
                    boolValueOf = null;
                }
                int i29 = iWrite10;
                ia iaVarRemoteActionCompatParcelizer = syncClocks.RemoteActionCompatParcelizer((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i6));
                int i30 = iWrite26;
                buildTextRenderers buildtextrenderersWrite = syncClocks.write(setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(i30));
                int i31 = i6;
                int i32 = iWrite27;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i32)) != 0) {
                    i7 = iWrite28;
                    z2 = true;
                } else {
                    i7 = iWrite28;
                    z2 = false;
                }
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i7)) != 0) {
                    i8 = iWrite29;
                    z3 = true;
                } else {
                    i8 = iWrite29;
                    z3 = false;
                }
                int i33 = iWrite11;
                int i34 = i7;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i8)) != 0) {
                    i9 = iWrite30;
                    z4 = true;
                } else {
                    i9 = iWrite30;
                    z4 = false;
                }
                int i35 = i8;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i9)) != 0) {
                    i10 = iWrite31;
                    z5 = true;
                } else {
                    i10 = iWrite31;
                    z5 = false;
                }
                int i36 = iWrite32;
                int i37 = i3;
                int i38 = iWrite33;
                iWrite33 = i38;
                arrayList2.add(new CVideoChangeFrameRateStrategy(strAudioAttributesCompatParcelizer2, writeVarIconCompatParcelizer, strAudioAttributesCompatParcelizer3, strAudioAttributesCompatParcelizer4, e1VarIconCompatParcelizer, e1VarIconCompatParcelizer2, jIconCompatParcelizer, jIconCompatParcelizer2, jIconCompatParcelizer3, new e(buildtextrenderersWrite, iaVarRemoteActionCompatParcelizer, z2, z3, z4, z5, setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i10), setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i36), syncClocks.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(i38))), iIconCompatParcelizer, verifypendinginstall, jIconCompatParcelizer4, jIconCompatParcelizer5, jIconCompatParcelizer6, jIconCompatParcelizer7, z, qaaVarWrite, iIconCompatParcelizer2, iIconCompatParcelizer3, jIconCompatParcelizer8, iIconCompatParcelizer4, iIconCompatParcelizer5, strAudioAttributesCompatParcelizer, boolValueOf));
                iWrite = i15;
                iWrite15 = i14;
                iWrite32 = i36;
                iWrite4 = i17;
                iWrite5 = i19;
                iWrite17 = i21;
                iWrite16 = i16;
                iWrite7 = i27;
                iWrite9 = i5;
                iWrite24 = i37;
                iWrite14 = i11;
                iWrite18 = i18;
                iWrite19 = i20;
                iWrite20 = i22;
                iWrite22 = i26;
                iWrite31 = i10;
                iWrite6 = i24;
                iWrite21 = i2;
                iWrite3 = i13;
                iWrite8 = i25;
                iWrite23 = i4;
                arrayList = arrayList2;
                iWrite2 = i12;
                iWrite30 = i9;
                iWrite10 = i29;
                iWrite25 = i31;
                iWrite26 = i30;
                iWrite27 = i32;
                iWrite28 = i34;
                iWrite11 = i33;
                iWrite29 = i35;
            }
            return arrayList;
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final List<CVideoChangeFrameRateStrategy> AudioAttributesCompatParcelizer(final long p0) {
        final String str = "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC";
        return (List) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, true, false, new getAnswerMap() { // from class: o.getAdjustedPlaybackSpeed
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.read(str, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List read(String str, long j, setDrawHoleEnabled setdrawholeenabled) {
        int i;
        int i2;
        boolean z;
        String strAudioAttributesCompatParcelizer;
        int i3;
        int i4;
        int i5;
        int i6;
        Integer numValueOf;
        int i7;
        Boolean boolValueOf;
        int i8;
        boolean z2;
        int i9;
        boolean z3;
        int i10;
        boolean z4;
        int i11;
        boolean z5;
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(1, j);
            int iWrite = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "id");
            int iWrite2 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, NotesDispatchAddressRequestKt.KEY_STATE);
            int iWrite3 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "worker_class_name");
            int iWrite4 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "input_merger_class_name");
            int iWrite5 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "input");
            int iWrite6 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "output");
            int iWrite7 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "initial_delay");
            int iWrite8 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "interval_duration");
            int iWrite9 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "flex_duration");
            int iWrite10 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "run_attempt_count");
            int iWrite11 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_policy");
            int iWrite12 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_delay_duration");
            int iWrite13 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "last_enqueue_time");
            int iWrite14 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "minimum_retention_duration");
            int iWrite15 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "schedule_requested_at");
            int iWrite16 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "run_in_foreground");
            int iWrite17 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "out_of_quota_policy");
            int iWrite18 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "period_count");
            int iWrite19 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "generation");
            int iWrite20 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "next_schedule_time_override");
            int iWrite21 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "next_schedule_time_override_generation");
            int iWrite22 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, DownloadService.KEY_STOP_REASON);
            int iWrite23 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trace_tag");
            int iWrite24 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "backoff_on_system_interruptions");
            int iWrite25 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "required_network_type");
            int iWrite26 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "required_network_request");
            int iWrite27 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_charging");
            int iWrite28 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_device_idle");
            int iWrite29 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_battery_not_low");
            int iWrite30 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "requires_storage_not_low");
            int iWrite31 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trigger_content_update_delay");
            int iWrite32 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "trigger_max_content_delay");
            int iWrite33 = setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (setdrawentrylabelsIconCompatParcelizer.write()) {
                String strAudioAttributesCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite);
                int i12 = iWrite13;
                int i13 = iWrite14;
                getChildPeriodUidFromConcatenatedUid.write writeVarIconCompatParcelizer = syncClocks.IconCompatParcelizer((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite2));
                String strAudioAttributesCompatParcelizer3 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite3);
                String strAudioAttributesCompatParcelizer4 = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite4);
                byte[] bArrRemoteActionCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(iWrite5);
                e1.Companion companion = e1.INSTANCE;
                e1 e1VarIconCompatParcelizer = e1.Companion.IconCompatParcelizer(bArrRemoteActionCompatParcelizer);
                byte[] bArrRemoteActionCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(iWrite6);
                e1.Companion companion2 = e1.INSTANCE;
                e1 e1VarIconCompatParcelizer2 = e1.Companion.IconCompatParcelizer(bArrRemoteActionCompatParcelizer2);
                long jIconCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite7);
                long jIconCompatParcelizer2 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite8);
                long jIconCompatParcelizer3 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite9);
                int iIconCompatParcelizer = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite10);
                int i14 = iWrite;
                int i15 = iWrite2;
                verifyPendingInstall verifypendinginstall = syncClocks.read((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite11));
                long jIconCompatParcelizer4 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(iWrite12);
                long jIconCompatParcelizer5 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i12);
                long jIconCompatParcelizer6 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i13);
                int i16 = iWrite15;
                long jIconCompatParcelizer7 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i16);
                iWrite15 = i16;
                int i17 = iWrite16;
                int i18 = iWrite3;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i17)) != 0) {
                    i = iWrite17;
                    i2 = iWrite4;
                    z = true;
                } else {
                    i = iWrite17;
                    i2 = iWrite4;
                    z = false;
                }
                qaa qaaVarWrite = syncClocks.write((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i));
                int i19 = iWrite18;
                int i20 = i;
                int iIconCompatParcelizer2 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i19);
                int i21 = iWrite19;
                int iIconCompatParcelizer3 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i21);
                int i22 = iWrite20;
                long jIconCompatParcelizer8 = setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i22);
                int i23 = iWrite21;
                int i24 = iWrite5;
                int iIconCompatParcelizer4 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i23);
                int i25 = iWrite7;
                int i26 = iWrite22;
                int i27 = iWrite6;
                int iIconCompatParcelizer5 = (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i26);
                int i28 = iWrite23;
                if (setdrawentrylabelsIconCompatParcelizer.AudioAttributesImplBaseParcelizer(i28)) {
                    i3 = i23;
                    i4 = iWrite24;
                    strAudioAttributesCompatParcelizer = null;
                } else {
                    strAudioAttributesCompatParcelizer = setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(i28);
                    i3 = i23;
                    i4 = iWrite24;
                }
                if (setdrawentrylabelsIconCompatParcelizer.AudioAttributesImplBaseParcelizer(i4)) {
                    i5 = i28;
                    i6 = iWrite8;
                    numValueOf = null;
                } else {
                    i5 = i28;
                    i6 = iWrite8;
                    numValueOf = Integer.valueOf((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i4));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    i7 = iWrite25;
                } else {
                    i7 = iWrite25;
                    boolValueOf = null;
                }
                int i29 = iWrite9;
                ia iaVarRemoteActionCompatParcelizer = syncClocks.RemoteActionCompatParcelizer((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i7));
                int i30 = iWrite26;
                buildTextRenderers buildtextrenderersWrite = syncClocks.write(setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(i30));
                int i31 = i7;
                int i32 = iWrite27;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i32)) != 0) {
                    i8 = iWrite28;
                    z2 = true;
                } else {
                    i8 = iWrite28;
                    z2 = false;
                }
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i8)) != 0) {
                    i9 = iWrite29;
                    z3 = true;
                } else {
                    i9 = iWrite29;
                    z3 = false;
                }
                int i33 = iWrite10;
                int i34 = i8;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i9)) != 0) {
                    i10 = iWrite30;
                    z4 = true;
                } else {
                    i10 = iWrite30;
                    z4 = false;
                }
                int i35 = i9;
                if (((int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i10)) != 0) {
                    i11 = iWrite31;
                    z5 = true;
                } else {
                    i11 = iWrite31;
                    z5 = false;
                }
                int i36 = iWrite32;
                int i37 = i4;
                int i38 = iWrite33;
                iWrite33 = i38;
                arrayList.add(new CVideoChangeFrameRateStrategy(strAudioAttributesCompatParcelizer2, writeVarIconCompatParcelizer, strAudioAttributesCompatParcelizer3, strAudioAttributesCompatParcelizer4, e1VarIconCompatParcelizer, e1VarIconCompatParcelizer2, jIconCompatParcelizer, jIconCompatParcelizer2, jIconCompatParcelizer3, new e(buildtextrenderersWrite, iaVarRemoteActionCompatParcelizer, z2, z3, z4, z5, setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i11), setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(i36), syncClocks.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(i38))), iIconCompatParcelizer, verifypendinginstall, jIconCompatParcelizer4, jIconCompatParcelizer5, jIconCompatParcelizer6, jIconCompatParcelizer7, z, qaaVarWrite, iIconCompatParcelizer2, iIconCompatParcelizer3, jIconCompatParcelizer8, iIconCompatParcelizer4, iIconCompatParcelizer5, strAudioAttributesCompatParcelizer, boolValueOf));
                iWrite3 = i18;
                iWrite4 = i2;
                iWrite32 = i36;
                iWrite = i14;
                iWrite17 = i20;
                iWrite18 = i19;
                iWrite19 = i21;
                iWrite6 = i27;
                iWrite8 = i6;
                iWrite24 = i37;
                iWrite13 = i12;
                iWrite14 = i13;
                iWrite2 = i15;
                iWrite16 = i17;
                iWrite20 = i22;
                iWrite22 = i26;
                iWrite31 = i11;
                iWrite5 = i24;
                iWrite21 = i3;
                iWrite7 = i25;
                iWrite23 = i5;
                iWrite30 = i10;
                iWrite9 = i29;
                iWrite25 = i31;
                iWrite26 = i30;
                iWrite27 = i32;
                iWrite28 = i34;
                iWrite10 = i33;
                iWrite29 = i35;
            }
            return arrayList;
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final int read() {
        final String str = "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)";
        return ((Number) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, true, false, new getAnswerMap() { // from class: o.setFallbackMinPlaybackSpeed
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Integer.valueOf(CWakeMode.MediaBrowserCompatItemReceiver(str, (setDrawHoleEnabled) obj));
            }
        })).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MediaBrowserCompatItemReceiver(String str, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            return setdrawentrylabelsIconCompatParcelizer.write() ? (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(0) : 0;
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final void write(final String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "DELETE FROM workspec WHERE id=?";
        setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, false, true, new getAnswerMap() { // from class: o.assertGreaterOrEqual
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.MediaBrowserCompatMediaItem(str, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatMediaItem(String str, String str2, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(1, str2);
            setdrawentrylabelsIconCompatParcelizer.write();
            setdrawentrylabelsIconCompatParcelizer.close();
            return getShowPopup.INSTANCE;
        } catch (Throwable th) {
            setdrawentrylabelsIconCompatParcelizer.close();
            throw th;
        }
    }

    @Override // kotlin.CVolumeFlags
    public final int RemoteActionCompatParcelizer(final getChildPeriodUidFromConcatenatedUid.write p0, final String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        final String str = "UPDATE workspec SET state=? WHERE id=?";
        return ((Number) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, false, true, new getAnswerMap() { // from class: o.setMinPossibleLiveOffsetSmoothingFactor
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Integer.valueOf(CWakeMode.IconCompatParcelizer(str, p0, p1, (setDrawHoleEnabled) obj));
            }
        })).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int IconCompatParcelizer(String str, getChildPeriodUidFromConcatenatedUid.write writeVar, String str2, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(1, syncClocks.IconCompatParcelizer(writeVar));
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(2, str2);
            setdrawentrylabelsIconCompatParcelizer.write();
            return setHighlighter.RemoteActionCompatParcelizer(setdrawholeenabled);
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final int MediaBrowserCompatCustomActionResultReceiver(final String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        return ((Number) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, false, true, new getAnswerMap() { // from class: o.DefaultLoadControl
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Integer.valueOf(CWakeMode.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(str, p0, (setDrawHoleEnabled) obj));
            }
        })).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(String str, String str2, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(1, str2);
            setdrawentrylabelsIconCompatParcelizer.write();
            return setHighlighter.RemoteActionCompatParcelizer(setdrawholeenabled);
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final void MediaBrowserCompatItemReceiver(final String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, false, true, new getAnswerMap() { // from class: o.notifyRebuffer
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.onCustomAction(str, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onCustomAction(String str, String str2, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(1, str2);
            setdrawentrylabelsIconCompatParcelizer.write();
            setdrawentrylabelsIconCompatParcelizer.close();
            return getShowPopup.INSTANCE;
        } catch (Throwable th) {
            setdrawentrylabelsIconCompatParcelizer.close();
            throw th;
        }
    }

    @Override // kotlin.CVolumeFlags
    public final void read(final String p0, final e1 p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        final String str = "UPDATE workspec SET output=? WHERE id=?";
        setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, false, true, new getAnswerMap() { // from class: o.maybeResetTargetLiveOffsetUs
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.read(str, p1, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str, e1 e1Var, String str2, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            e1.Companion companion = e1.INSTANCE;
            setdrawentrylabelsIconCompatParcelizer.read(1, e1.Companion.IconCompatParcelizer(e1Var));
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(2, str2);
            setdrawentrylabelsIconCompatParcelizer.write();
            setdrawentrylabelsIconCompatParcelizer.close();
            return getShowPopup.INSTANCE;
        } catch (Throwable th) {
            setdrawentrylabelsIconCompatParcelizer.close();
            throw th;
        }
    }

    @Override // kotlin.CVolumeFlags
    public final void read(final String p0, final long p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, false, true, new getAnswerMap() { // from class: o.getDefaultBufferSize
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.IconCompatParcelizer(str, p1, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(String str, long j, String str2, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(1, j);
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(2, str2);
            setdrawentrylabelsIconCompatParcelizer.write();
            setdrawentrylabelsIconCompatParcelizer.close();
            return getShowPopup.INSTANCE;
        } catch (Throwable th) {
            setdrawentrylabelsIconCompatParcelizer.close();
            throw th;
        }
    }

    @Override // kotlin.CVolumeFlags
    public final int AudioAttributesImplApi21Parcelizer(final String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        return ((Number) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, false, true, new getAnswerMap() { // from class: o.setTargetLiveOffsetIncrementOnRebufferMs
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Integer.valueOf(CWakeMode.onCommand(str, p0, (setDrawHoleEnabled) obj));
            }
        })).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onCommand(String str, String str2, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(1, str2);
            setdrawentrylabelsIconCompatParcelizer.write();
            return setHighlighter.RemoteActionCompatParcelizer(setdrawholeenabled);
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final int AudioAttributesImplBaseParcelizer(final String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        return ((Number) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, false, true, new getAnswerMap() { // from class: o.updateSmoothedMinPossibleLiveOffsetUs
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Integer.valueOf(CWakeMode.handleMediaPlayPauseIfPendingOnHandler(str, p0, (setDrawHoleEnabled) obj));
            }
        })).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int handleMediaPlayPauseIfPendingOnHandler(String str, String str2, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(1, str2);
            setdrawentrylabelsIconCompatParcelizer.write();
            return setHighlighter.RemoteActionCompatParcelizer(setdrawholeenabled);
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final void IconCompatParcelizer(final String p0, final int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, false, true, new getAnswerMap() { // from class: o.setProportionalControlFactor
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.IconCompatParcelizer(str, p0, p1, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(String str, String str2, int i, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(1, str2);
            setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(2, i);
            setdrawentrylabelsIconCompatParcelizer.write();
            setdrawentrylabelsIconCompatParcelizer.close();
            return getShowPopup.INSTANCE;
        } catch (Throwable th) {
            setdrawentrylabelsIconCompatParcelizer.close();
            throw th;
        }
    }

    @Override // kotlin.CVolumeFlags
    public final int AudioAttributesCompatParcelizer(final String p0, final long p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        return ((Number) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, false, true, new getAnswerMap() { // from class: o.setMaxLiveOffsetErrorMsForUnitSpeed
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Integer.valueOf(CWakeMode.write(str, p1, p0, (setDrawHoleEnabled) obj));
            }
        })).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int write(String str, long j, String str2, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(1, j);
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(2, str2);
            setdrawentrylabelsIconCompatParcelizer.write();
            return setHighlighter.RemoteActionCompatParcelizer(setdrawholeenabled);
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final int MediaBrowserCompatItemReceiver() {
        final String str = "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        return ((Number) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, false, true, new getAnswerMap() { // from class: o.retainBackBufferFromKeyframe
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Integer.valueOf(CWakeMode.MediaDescriptionCompat(str, (setDrawHoleEnabled) obj));
            }
        })).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MediaDescriptionCompat(String str, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.write();
            return setHighlighter.RemoteActionCompatParcelizer(setdrawholeenabled);
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CVolumeFlags
    public final void AudioAttributesCompatParcelizer(final String p0, final int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "UPDATE workspec SET stop_reason=? WHERE id=?";
        setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, false, true, new getAnswerMap() { // from class: o.DefaultLivePlaybackSpeedControl
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CWakeMode.RemoteActionCompatParcelizer(str, p1, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str, int i, String str2, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(1, i);
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(2, str2);
            setdrawentrylabelsIconCompatParcelizer.write();
            setdrawentrylabelsIconCompatParcelizer.close();
            return getShowPopup.INSTANCE;
        } catch (Throwable th) {
            setdrawentrylabelsIconCompatParcelizer.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: o.CWakeMode$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/CWakeMode$read;", "", "<init>", "()V", "", "Lo/isHdPlaybackError;", "RemoteActionCompatParcelizer", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static List<isHdPlaybackError<?>> RemoteActionCompatParcelizer() {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
