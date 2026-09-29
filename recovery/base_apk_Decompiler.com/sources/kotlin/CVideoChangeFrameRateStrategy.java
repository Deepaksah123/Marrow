package kotlin;

import androidx.work.OverwritingInputMerger;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.getChildPeriodUidFromConcatenatedUid;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 h2\u00020\u0001:\u0003fghB\u0081\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001f\u001a\u00020\f\u0012\b\b\u0002\u0010 \u001a\u00020\u0012\u0012\b\b\u0002\u0010!\u001a\u00020\u0012\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b$\u0010%B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003¢\u0006\u0004\b$\u0010'B\u0019\b\u0016\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0000¢\u0006\u0004\b$\u0010*J\u000e\u0010@\u001a\u00020A2\u0006\u0010\u0015\u001a\u00020\fJ\u000e\u0010E\u001a\u00020A2\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010E\u001a\u00020A2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010F\u001a\u00020\fJ\u0006\u0010G\u001a\u00020\u001aJ\b\u0010H\u001a\u00020\u0003H\u0016J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\tHÆ\u0003J\t\u0010N\u001a\u00020\tHÆ\u0003J\t\u0010O\u001a\u00020\fHÆ\u0003J\t\u0010P\u001a\u00020\fHÆ\u0003J\t\u0010Q\u001a\u00020\fHÆ\u0003J\t\u0010R\u001a\u00020\u0010HÆ\u0003J\t\u0010S\u001a\u00020\u0012HÆ\u0003J\t\u0010T\u001a\u00020\u0014HÆ\u0003J\t\u0010U\u001a\u00020\fHÆ\u0003J\t\u0010V\u001a\u00020\fHÆ\u0003J\t\u0010W\u001a\u00020\fHÆ\u0003J\t\u0010X\u001a\u00020\fHÆ\u0003J\t\u0010Y\u001a\u00020\u001aHÆ\u0003J\t\u0010Z\u001a\u00020\u001cHÆ\u0003J\t\u0010[\u001a\u00020\u0012HÆ\u0003J\t\u0010\\\u001a\u00020\u0012HÆ\u0003J\t\u0010]\u001a\u00020\fHÆ\u0003J\t\u0010^\u001a\u00020\u0012HÆ\u0003J\t\u0010_\u001a\u00020\u0012HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010<J\u008c\u0002\u0010b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0003\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010cJ\u0013\u0010d\u001a\u00020\u001a2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010e\u001a\u00020\u0012HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u0010\u001e\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010,R\u001e\u0010\u001f\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u0010 \u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010,\"\u0004\b5\u0010.R\u0016\u0010!\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R \u0010\"\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010#\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010?\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0011\u0010B\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010D\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bD\u0010C¨\u0006i"}, d2 = {"Landroidx/work/impl/model/WorkSpec;", "", "id", "", NotesDispatchAddressRequestKt.KEY_STATE, "Landroidx/work/WorkInfo$State;", "workerClassName", "inputMergerClassName", "input", "Landroidx/work/Data;", "output", "initialDelay", "", "intervalDuration", "flexDuration", "constraints", "Landroidx/work/Constraints;", "runAttemptCount", "", "backoffPolicy", "Landroidx/work/BackoffPolicy;", "backoffDelayDuration", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "expedited", "", "outOfQuotaPolicy", "Landroidx/work/OutOfQuotaPolicy;", "periodCount", "generation", "nextScheduleTimeOverride", "nextScheduleTimeOverrideGeneration", "stopReason", "traceTag", "backOffOnSystemInterruptions", "<init>", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJIILjava/lang/String;Ljava/lang/Boolean;)V", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "other", "(Ljava/lang/String;Landroidx/work/impl/model/WorkSpec;)V", "getPeriodCount", "()I", "setPeriodCount", "(I)V", "getGeneration", "getNextScheduleTimeOverride", "()J", "setNextScheduleTimeOverride", "(J)V", "getNextScheduleTimeOverrideGeneration", "setNextScheduleTimeOverrideGeneration", "getStopReason", "getTraceTag", "()Ljava/lang/String;", "setTraceTag", "(Ljava/lang/String;)V", "getBackOffOnSystemInterruptions", "()Ljava/lang/Boolean;", "setBackOffOnSystemInterruptions", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setBackoffDelayDuration", "", "isPeriodic", "()Z", "isBackedOff", "setPeriodic", "calculateNextRunTime", "hasConstraints", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJIILjava/lang/String;Ljava/lang/Boolean;)Landroidx/work/impl/model/WorkSpec;", "equals", "hashCode", "IdAndState", "WorkInfoPojo", "Companion", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CVideoChangeFrameRateStrategy {
    public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer(null);
    public e AudioAttributesCompatParcelizer;
    public final String AudioAttributesImplApi21Parcelizer;
    public long AudioAttributesImplApi26Parcelizer;
    public e1 AudioAttributesImplBaseParcelizer;
    public long MediaBrowserCompatCustomActionResultReceiver;
    public String MediaBrowserCompatItemReceiver;
    public long MediaBrowserCompatMediaItem;
    public e1 MediaBrowserCompatSearchResultReceiver;
    public String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public qaa MediaDescriptionCompat;
    public long MediaMetadataCompat;
    public long RatingCompat;
    public verifyPendingInstall RemoteActionCompatParcelizer;
    private Boolean handleMediaPlayPauseIfPendingOnHandler;
    public int onAddQueueItem;
    public getChildPeriodUidFromConcatenatedUid.write onCommand;
    public long onCustomAction;
    private long onFastForward;
    private final int onMediaButtonEvent;
    private int onPause;
    private final int onPlay;
    private int onPlayFromMediaId;
    private String onPlayFromSearch;
    public long read;
    public boolean write;

    public CVideoChangeFrameRateStrategy(String str, getChildPeriodUidFromConcatenatedUid.write writeVar, String str2, String str3, e1 e1Var, e1 e1Var2, long j, long j2, long j3, e eVar, int i, verifyPendingInstall verifypendinginstall, long j4, long j5, long j6, long j7, boolean z, qaa qaaVar, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(e1Var, "");
        toMagicModuleMetaRepoModel.write(e1Var2, "");
        toMagicModuleMetaRepoModel.write(eVar, "");
        toMagicModuleMetaRepoModel.write(verifypendinginstall, "");
        toMagicModuleMetaRepoModel.write(qaaVar, "");
        this.AudioAttributesImplApi21Parcelizer = str;
        this.onCommand = writeVar;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = str2;
        this.MediaBrowserCompatItemReceiver = str3;
        this.AudioAttributesImplBaseParcelizer = e1Var;
        this.MediaBrowserCompatSearchResultReceiver = e1Var2;
        this.MediaBrowserCompatCustomActionResultReceiver = j;
        this.MediaBrowserCompatMediaItem = j2;
        this.AudioAttributesImplApi26Parcelizer = j3;
        this.AudioAttributesCompatParcelizer = eVar;
        this.onAddQueueItem = i;
        this.RemoteActionCompatParcelizer = verifypendinginstall;
        this.read = j4;
        this.RatingCompat = j5;
        this.MediaMetadataCompat = j6;
        this.onCustomAction = j7;
        this.write = z;
        this.MediaDescriptionCompat = qaaVar;
        this.onPlayFromMediaId = i2;
        this.onPlay = i3;
        this.onFastForward = j8;
        this.onPause = i4;
        this.onMediaButtonEvent = i5;
        this.onPlayFromSearch = str4;
        this.handleMediaPlayPauseIfPendingOnHandler = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CVideoChangeFrameRateStrategy(String str, getChildPeriodUidFromConcatenatedUid.write writeVar, String str2, String str3, e1 e1Var, e1 e1Var2, long j, long j2, long j3, e eVar, int i, verifyPendingInstall verifypendinginstall, long j4, long j5, long j6, long j7, boolean z, qaa qaaVar, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool, int i6, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        String str5;
        getChildPeriodUidFromConcatenatedUid.write writeVar2 = (i6 & 2) != 0 ? getChildPeriodUidFromConcatenatedUid.write.AudioAttributesCompatParcelizer : writeVar;
        if ((i6 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
            str5 = name;
        } else {
            str5 = str3;
        }
        this(str, writeVar2, str2, str5, (i6 & 16) != 0 ? e1.IconCompatParcelizer : e1Var, (i6 & 32) != 0 ? e1.IconCompatParcelizer : e1Var2, (i6 & 64) != 0 ? 0L : j, (i6 & 128) != 0 ? 0L : j2, (i6 & 256) != 0 ? 0L : j3, (i6 & 512) != 0 ? e.write : eVar, (i6 & 1024) != 0 ? 0 : i, (i6 & 2048) != 0 ? verifyPendingInstall.AudioAttributesCompatParcelizer : verifypendinginstall, (i6 & 4096) != 0 ? 30000L : j4, (i6 & 8192) != 0 ? -1L : j5, (i6 & 16384) != 0 ? 0L : j6, (32768 & i6) != 0 ? -1L : j7, (65536 & i6) != 0 ? false : z, (131072 & i6) != 0 ? qaa.write : qaaVar, (262144 & i6) != 0 ? 0 : i2, (524288 & i6) != 0 ? 0 : i3, (1048576 & i6) != 0 ? Long.MAX_VALUE : j8, (2097152 & i6) != 0 ? 0 : i4, (4194304 & i6) != 0 ? -256 : i5, (8388608 & i6) != 0 ? null : str4, (i6 & BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getOnPlayFromMediaId() {
        return this.onPlayFromMediaId;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getOnPlay() {
        return this.onPlay;
    }

    public final void read(long j) {
        this.onFastForward = j;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getOnFastForward() {
        return this.onFastForward;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getOnPause() {
        return this.onPause;
    }

    public final void read(int i) {
        this.onPause = i;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final int getOnMediaButtonEvent() {
        return this.onMediaButtonEvent;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final String getOnPlayFromSearch() {
        return this.onPlayFromSearch;
    }

    public final void write(String str) {
        this.onPlayFromSearch = str;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final Boolean getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CVideoChangeFrameRateStrategy(String str, String str2) {
        this(str, null, str2, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554426, null);
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CVideoChangeFrameRateStrategy(String str, CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy) {
        this(str, cVideoChangeFrameRateStrategy.onCommand, cVideoChangeFrameRateStrategy.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, cVideoChangeFrameRateStrategy.MediaBrowserCompatItemReceiver, new e1(cVideoChangeFrameRateStrategy.AudioAttributesImplBaseParcelizer), new e1(cVideoChangeFrameRateStrategy.MediaBrowserCompatSearchResultReceiver), cVideoChangeFrameRateStrategy.MediaBrowserCompatCustomActionResultReceiver, cVideoChangeFrameRateStrategy.MediaBrowserCompatMediaItem, cVideoChangeFrameRateStrategy.AudioAttributesImplApi26Parcelizer, new e(cVideoChangeFrameRateStrategy.AudioAttributesCompatParcelizer), cVideoChangeFrameRateStrategy.onAddQueueItem, cVideoChangeFrameRateStrategy.RemoteActionCompatParcelizer, cVideoChangeFrameRateStrategy.read, cVideoChangeFrameRateStrategy.RatingCompat, cVideoChangeFrameRateStrategy.MediaMetadataCompat, cVideoChangeFrameRateStrategy.onCustomAction, cVideoChangeFrameRateStrategy.write, cVideoChangeFrameRateStrategy.MediaDescriptionCompat, cVideoChangeFrameRateStrategy.onPlayFromMediaId, 0, cVideoChangeFrameRateStrategy.onFastForward, cVideoChangeFrameRateStrategy.onPause, cVideoChangeFrameRateStrategy.onMediaButtonEvent, cVideoChangeFrameRateStrategy.onPlayFromSearch, cVideoChangeFrameRateStrategy.handleMediaPlayPauseIfPendingOnHandler, 524288, null);
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(cVideoChangeFrameRateStrategy, "");
    }

    public final boolean MediaDescriptionCompat() {
        return this.MediaBrowserCompatMediaItem != 0;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.onCommand == getChildPeriodUidFromConcatenatedUid.write.AudioAttributesCompatParcelizer && this.onAddQueueItem > 0;
    }

    public final void AudioAttributesCompatParcelizer(long j, long j2) {
        if (j < 900000) {
            n.write();
        }
        this.MediaBrowserCompatMediaItem = getQues.write(j, 900000L);
        if (j2 < 300000) {
            n.write();
        }
        if (j2 > this.MediaBrowserCompatMediaItem) {
            n.write();
        }
        this.AudioAttributesImplApi26Parcelizer = getQues.AudioAttributesCompatParcelizer(j2, 300000L, this.MediaBrowserCompatMediaItem);
    }

    public final long read() {
        return RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver(), this.onAddQueueItem, this.RemoteActionCompatParcelizer, this.read, this.RatingCompat, this.onPlayFromMediaId, MediaDescriptionCompat(), this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatMediaItem, this.onFastForward);
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(e.write, this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{WorkSpec: ");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append('}');
        return sb.toString();
    }

    public static final class write {
        public String AudioAttributesCompatParcelizer;
        public getChildPeriodUidFromConcatenatedUid.write RemoteActionCompatParcelizer;

        public write(String str, getChildPeriodUidFromConcatenatedUid.write writeVar) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(writeVar, "");
            this.AudioAttributesCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = writeVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) writeVar.AudioAttributesCompatParcelizer) && this.RemoteActionCompatParcelizer == writeVar.RemoteActionCompatParcelizer;
        }

        public final int hashCode() {
            return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IdAndState(id=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(", state=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u00188\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u001b8\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0003\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0011\u0010!\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0011\u0010\"\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0011\u0010\u001e\u001a\u00020#8\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0011\u0010 \u001a\u00020\u000f8\u0006¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u0015\u001a\u00020'8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0016\u0010)\u001a\u00020\b8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010*\u001a\u00020\b8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0016\u0010%\u001a\u00020\u000f8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0011\u0010\u0019\u001a\u00020\u000f8\u0006¢\u0006\u0006\n\u0004\b)\u0010&R\u0011\u0010+\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u0011\u0010\u001c\u001a\u00020\u000f8\u0006¢\u0006\u0006\n\u0004\b,\u0010&R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120-8\u0006¢\u0006\u0006\n\u0004\b.\u0010/R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u001b0-8\u0006¢\u0006\u0006\n\u0004\b+\u0010/R\u0011\u0010,\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b!\u00102R\u0011\u0010.\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u0017\u00102"}, d2 = {"Lo/CVideoChangeFrameRateStrategy$AudioAttributesCompatParcelizer;", "", "Lo/getChildPeriodUidFromConcatenatedUid;", "read", "()Lo/getChildPeriodUidFromConcatenatedUid;", "Lo/getChildPeriodUidFromConcatenatedUid$read;", "AudioAttributesCompatParcelizer", "()Lo/getChildPeriodUidFromConcatenatedUid$read;", "", "write", "()J", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/lang/String;", "IconCompatParcelizer", "Lo/getChildPeriodUidFromConcatenatedUid$write;", "MediaMetadataCompat", "Lo/getChildPeriodUidFromConcatenatedUid$write;", "Lo/e1;", "MediaBrowserCompatMediaItem", "Lo/e1;", "AudioAttributesImplBaseParcelizer", "J", "MediaBrowserCompatItemReceiver", "RemoteActionCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "Lo/e;", "Lo/e;", "RatingCompat", "I", "Lo/verifyPendingInstall;", "Lo/verifyPendingInstall;", "AudioAttributesImplApi26Parcelizer", "MediaDescriptionCompat", "MediaBrowserCompatSearchResultReceiver", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "", "onCommand", "Ljava/util/List;", "handleMediaPlayPauseIfPendingOnHandler", "onAddQueueItem", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AudioAttributesCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        public int RatingCompat;
        private final long AudioAttributesImplApi21Parcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private final int MediaMetadataCompat;

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private final long read;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final e AudioAttributesImplBaseParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private final String IconCompatParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private final long RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
        private final e1 AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
        private final List<e1> onAddQueueItem;

        /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
        private final int MediaBrowserCompatMediaItem;

        /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
        private final long MediaBrowserCompatSearchResultReceiver;

        /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
        private final getChildPeriodUidFromConcatenatedUid.write write;

        /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
        private final int MediaBrowserCompatItemReceiver;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        public long AudioAttributesImplApi26Parcelizer;

        /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
        private final List<String> handleMediaPlayPauseIfPendingOnHandler;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        public verifyPendingInstall MediaBrowserCompatCustomActionResultReceiver;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        public long MediaDescriptionCompat;

        private boolean RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer != 0;
        }

        private boolean IconCompatParcelizer() {
            return this.write == getChildPeriodUidFromConcatenatedUid.write.AudioAttributesCompatParcelizer && this.MediaBrowserCompatItemReceiver > 0;
        }

        public final getChildPeriodUidFromConcatenatedUid read() {
            e1 e1Var = !this.onAddQueueItem.isEmpty() ? this.onAddQueueItem.get(0) : e1.IconCompatParcelizer;
            UUID uuidFromString = UUID.fromString(this.IconCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uuidFromString, "");
            return new getChildPeriodUidFromConcatenatedUid(uuidFromString, this.write, new HashSet(this.handleMediaPlayPauseIfPendingOnHandler), this.AudioAttributesCompatParcelizer, e1Var, this.MediaBrowserCompatItemReceiver, this.MediaMetadataCompat, this.AudioAttributesImplBaseParcelizer, this.read, AudioAttributesCompatParcelizer(), write(), this.MediaBrowserCompatMediaItem);
        }

        private final getChildPeriodUidFromConcatenatedUid.read AudioAttributesCompatParcelizer() {
            long j = this.RemoteActionCompatParcelizer;
            if (j != 0) {
                return new getChildPeriodUidFromConcatenatedUid.read(j, this.AudioAttributesImplApi21Parcelizer);
            }
            return null;
        }

        private final long write() {
            if (this.write != getChildPeriodUidFromConcatenatedUid.write.AudioAttributesCompatParcelizer) {
                return Long.MAX_VALUE;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = CVideoChangeFrameRateStrategy.IconCompatParcelizer;
            return RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(IconCompatParcelizer(), this.MediaBrowserCompatItemReceiver, null, 0L, 0L, 0, RemoteActionCompatParcelizer(), this.read, this.AudioAttributesImplApi21Parcelizer, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatSearchResultReceiver);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) p0;
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) audioAttributesCompatParcelizer.IconCompatParcelizer) || this.write != audioAttributesCompatParcelizer.write || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer) || this.read != audioAttributesCompatParcelizer.read || this.RemoteActionCompatParcelizer != audioAttributesCompatParcelizer.RemoteActionCompatParcelizer || this.AudioAttributesImplApi21Parcelizer != audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer) || this.MediaBrowserCompatItemReceiver != audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver) {
                return false;
            }
            verifyPendingInstall verifypendinginstall = audioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
            if (this.AudioAttributesImplApi26Parcelizer != audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer || this.MediaDescriptionCompat != audioAttributesCompatParcelizer.MediaDescriptionCompat) {
                return false;
            }
            int i = audioAttributesCompatParcelizer.RatingCompat;
            return this.MediaMetadataCompat == audioAttributesCompatParcelizer.MediaMetadataCompat && this.MediaBrowserCompatSearchResultReceiver == audioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver && this.MediaBrowserCompatMediaItem == audioAttributesCompatParcelizer.MediaBrowserCompatMediaItem && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, audioAttributesCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onAddQueueItem, audioAttributesCompatParcelizer.onAddQueueItem);
        }

        public final int hashCode() {
            this.IconCompatParcelizer.hashCode();
            this.write.hashCode();
            this.AudioAttributesCompatParcelizer.hashCode();
            Long.hashCode(this.read);
            Long.hashCode(this.RemoteActionCompatParcelizer);
            Long.hashCode(this.AudioAttributesImplApi21Parcelizer);
            this.AudioAttributesImplBaseParcelizer.hashCode();
            Integer.hashCode(this.MediaBrowserCompatItemReceiver);
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioAttributesCompatParcelizer(IconCompatParcelizer=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", write=");
            sb.append(this.write);
            sb.append(", AudioAttributesCompatParcelizer=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(", read=");
            sb.append(this.read);
            sb.append(", RemoteActionCompatParcelizer=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", AudioAttributesImplApi21Parcelizer=");
            sb.append(this.AudioAttributesImplApi21Parcelizer);
            sb.append(", AudioAttributesImplBaseParcelizer=");
            sb.append(this.AudioAttributesImplBaseParcelizer);
            sb.append(", MediaBrowserCompatItemReceiver=");
            sb.append(this.MediaBrowserCompatItemReceiver);
            sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
            sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
            sb.append(", AudioAttributesImplApi26Parcelizer=");
            sb.append(this.AudioAttributesImplApi26Parcelizer);
            sb.append(", MediaDescriptionCompat=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", RatingCompat=");
            sb.append(this.RatingCompat);
            sb.append(", MediaMetadataCompat=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", MediaBrowserCompatSearchResultReceiver=");
            sb.append(this.MediaBrowserCompatSearchResultReceiver);
            sb.append(", MediaBrowserCompatMediaItem=");
            sb.append(this.MediaBrowserCompatMediaItem);
            sb.append(", handleMediaPlayPauseIfPendingOnHandler=");
            sb.append(this.handleMediaPlayPauseIfPendingOnHandler);
            sb.append(", onAddQueueItem=");
            sb.append(this.onAddQueueItem);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/CVideoChangeFrameRateStrategy$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "p0", "", "p1", "Lo/verifyPendingInstall;", "p2", "", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "AudioAttributesCompatParcelizer", "(ZILo/verifyPendingInstall;JJIZJJJJ)J"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public static long AudioAttributesCompatParcelizer(boolean p0, int p1, verifyPendingInstall p2, long p3, long p4, int p5, boolean p6, long p7, long p8, long p9, long p10) {
            toMagicModuleMetaRepoModel.write(p2, "");
            if (p10 != Long.MAX_VALUE && p6) {
                return p5 == 0 ? p10 : getQues.write(p10, 900000 + p4);
            }
            if (p0) {
                return getQues.AudioAttributesCompatParcelizer(p2 == verifyPendingInstall.RemoteActionCompatParcelizer ? ((long) p1) * p3 : (long) Math.scalb(p3, p1 - 1), 18000000L) + p4;
            }
            if (p6) {
                long j = p5 == 0 ? p4 + p7 : p4 + p9;
                return (p8 == p9 || p5 != 0) ? j : j + (p9 - p8);
            }
            if (p4 == -1) {
                return Long.MAX_VALUE;
            }
            return p4 + p7;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(n.write("WorkSpec"), "");
        new setVisibility() { // from class: o.CVideoScalingMode
            @Override // kotlin.setVisibility
            public final Object RemoteActionCompatParcelizer() {
                return CVideoChangeFrameRateStrategy.write((List) null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List write(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AudioAttributesCompatParcelizer) it.next()).read());
        }
        return arrayList;
    }

    public static /* synthetic */ CVideoChangeFrameRateStrategy write(CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy, String str, getChildPeriodUidFromConcatenatedUid.write writeVar, String str2, String str3, e1 e1Var, e1 e1Var2, long j, long j2, long j3, e eVar, int i, verifyPendingInstall verifypendinginstall, long j4, long j5, long j6, long j7, boolean z, qaa qaaVar, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool, int i6) {
        String str5 = (i6 & 1) != 0 ? cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer : str;
        getChildPeriodUidFromConcatenatedUid.write writeVar2 = (i6 & 2) != 0 ? cVideoChangeFrameRateStrategy.onCommand : writeVar;
        String str6 = (i6 & 4) != 0 ? cVideoChangeFrameRateStrategy.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : str2;
        String str7 = (i6 & 8) != 0 ? cVideoChangeFrameRateStrategy.MediaBrowserCompatItemReceiver : str3;
        e1 e1Var3 = (i6 & 16) != 0 ? cVideoChangeFrameRateStrategy.AudioAttributesImplBaseParcelizer : e1Var;
        e1 e1Var4 = (i6 & 32) != 0 ? cVideoChangeFrameRateStrategy.MediaBrowserCompatSearchResultReceiver : e1Var2;
        long j9 = (i6 & 64) != 0 ? cVideoChangeFrameRateStrategy.MediaBrowserCompatCustomActionResultReceiver : j;
        long j10 = (i6 & 128) != 0 ? cVideoChangeFrameRateStrategy.MediaBrowserCompatMediaItem : j2;
        long j11 = (i6 & 256) != 0 ? cVideoChangeFrameRateStrategy.AudioAttributesImplApi26Parcelizer : j3;
        e eVar2 = (i6 & 512) != 0 ? cVideoChangeFrameRateStrategy.AudioAttributesCompatParcelizer : eVar;
        return AudioAttributesCompatParcelizer(str5, writeVar2, str6, str7, e1Var3, e1Var4, j9, j10, j11, eVar2, (i6 & 1024) != 0 ? cVideoChangeFrameRateStrategy.onAddQueueItem : i, (i6 & 2048) != 0 ? cVideoChangeFrameRateStrategy.RemoteActionCompatParcelizer : verifypendinginstall, (i6 & 4096) != 0 ? cVideoChangeFrameRateStrategy.read : j4, (i6 & 8192) != 0 ? cVideoChangeFrameRateStrategy.RatingCompat : j5, (i6 & 16384) != 0 ? cVideoChangeFrameRateStrategy.MediaMetadataCompat : j6, (i6 & 32768) != 0 ? cVideoChangeFrameRateStrategy.onCustomAction : j7, (i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? cVideoChangeFrameRateStrategy.write : z, (131072 & i6) != 0 ? cVideoChangeFrameRateStrategy.MediaDescriptionCompat : qaaVar, (i6 & 262144) != 0 ? cVideoChangeFrameRateStrategy.onPlayFromMediaId : i2, (i6 & 524288) != 0 ? cVideoChangeFrameRateStrategy.onPlay : i3, (i6 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? cVideoChangeFrameRateStrategy.onFastForward : j8, (i6 & 2097152) != 0 ? cVideoChangeFrameRateStrategy.onPause : i4, (4194304 & i6) != 0 ? cVideoChangeFrameRateStrategy.onMediaButtonEvent : i5, (i6 & 8388608) != 0 ? cVideoChangeFrameRateStrategy.onPlayFromSearch : str4, (i6 & BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? cVideoChangeFrameRateStrategy.handleMediaPlayPauseIfPendingOnHandler : bool);
    }

    private static CVideoChangeFrameRateStrategy AudioAttributesCompatParcelizer(String str, getChildPeriodUidFromConcatenatedUid.write writeVar, String str2, String str3, e1 e1Var, e1 e1Var2, long j, long j2, long j3, e eVar, int i, verifyPendingInstall verifypendinginstall, long j4, long j5, long j6, long j7, boolean z, qaa qaaVar, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(e1Var, "");
        toMagicModuleMetaRepoModel.write(e1Var2, "");
        toMagicModuleMetaRepoModel.write(eVar, "");
        toMagicModuleMetaRepoModel.write(verifypendinginstall, "");
        toMagicModuleMetaRepoModel.write(qaaVar, "");
        return new CVideoChangeFrameRateStrategy(str, writeVar, str2, str3, e1Var, e1Var2, j, j2, j3, eVar, i, verifypendinginstall, j4, j5, j6, j7, z, qaaVar, i2, i3, j8, i4, i5, str4, bool);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CVideoChangeFrameRateStrategy)) {
            return false;
        }
        CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy = (CVideoChangeFrameRateStrategy) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer) && this.onCommand == cVideoChangeFrameRateStrategy.onCommand && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, (Object) cVideoChangeFrameRateStrategy.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) cVideoChangeFrameRateStrategy.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, cVideoChangeFrameRateStrategy.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, cVideoChangeFrameRateStrategy.MediaBrowserCompatSearchResultReceiver) && this.MediaBrowserCompatCustomActionResultReceiver == cVideoChangeFrameRateStrategy.MediaBrowserCompatCustomActionResultReceiver && this.MediaBrowserCompatMediaItem == cVideoChangeFrameRateStrategy.MediaBrowserCompatMediaItem && this.AudioAttributesImplApi26Parcelizer == cVideoChangeFrameRateStrategy.AudioAttributesImplApi26Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, cVideoChangeFrameRateStrategy.AudioAttributesCompatParcelizer) && this.onAddQueueItem == cVideoChangeFrameRateStrategy.onAddQueueItem && this.RemoteActionCompatParcelizer == cVideoChangeFrameRateStrategy.RemoteActionCompatParcelizer && this.read == cVideoChangeFrameRateStrategy.read && this.RatingCompat == cVideoChangeFrameRateStrategy.RatingCompat && this.MediaMetadataCompat == cVideoChangeFrameRateStrategy.MediaMetadataCompat && this.onCustomAction == cVideoChangeFrameRateStrategy.onCustomAction && this.write == cVideoChangeFrameRateStrategy.write && this.MediaDescriptionCompat == cVideoChangeFrameRateStrategy.MediaDescriptionCompat && this.onPlayFromMediaId == cVideoChangeFrameRateStrategy.onPlayFromMediaId && this.onPlay == cVideoChangeFrameRateStrategy.onPlay && this.onFastForward == cVideoChangeFrameRateStrategy.onFastForward && this.onPause == cVideoChangeFrameRateStrategy.onPause && this.onMediaButtonEvent == cVideoChangeFrameRateStrategy.onMediaButtonEvent && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPlayFromSearch, (Object) cVideoChangeFrameRateStrategy.onPlayFromSearch) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, cVideoChangeFrameRateStrategy.handleMediaPlayPauseIfPendingOnHandler);
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesImplApi21Parcelizer.hashCode();
        int iHashCode2 = this.onCommand.hashCode();
        int iHashCode3 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.hashCode();
        int iHashCode4 = this.MediaBrowserCompatItemReceiver.hashCode();
        int iHashCode5 = this.AudioAttributesImplBaseParcelizer.hashCode();
        int iHashCode6 = this.MediaBrowserCompatSearchResultReceiver.hashCode();
        int iHashCode7 = Long.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
        int iHashCode8 = Long.hashCode(this.MediaBrowserCompatMediaItem);
        int iHashCode9 = Long.hashCode(this.AudioAttributesImplApi26Parcelizer);
        int iHashCode10 = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode11 = Integer.hashCode(this.onAddQueueItem);
        int iHashCode12 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode13 = Long.hashCode(this.read);
        int iHashCode14 = Long.hashCode(this.RatingCompat);
        int iHashCode15 = Long.hashCode(this.MediaMetadataCompat);
        int iHashCode16 = Long.hashCode(this.onCustomAction);
        int iHashCode17 = Boolean.hashCode(this.write);
        int iHashCode18 = this.MediaDescriptionCompat.hashCode();
        int iHashCode19 = Integer.hashCode(this.onPlayFromMediaId);
        int iHashCode20 = Integer.hashCode(this.onPlay);
        int iHashCode21 = Long.hashCode(this.onFastForward);
        int iHashCode22 = Integer.hashCode(this.onPause);
        int iHashCode23 = Integer.hashCode(this.onMediaButtonEvent);
        String str = this.onPlayFromSearch;
        int iHashCode24 = str == null ? 0 : str.hashCode();
        Boolean bool = this.handleMediaPlayPauseIfPendingOnHandler;
        return (((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + (bool != null ? bool.hashCode() : 0);
    }
}
