package kotlin;

import android.os.Trace;
import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.booleanValue;
import kotlin.createForPropertyOverride;
import kotlin.getCurrentTrackSelections;
import kotlin.isTestDiscarded;
import kotlin.setAudioSessionId;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJC\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0016\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u001c\u0010\u0019\u001a\u00020\u00108\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\u0019\u0010\""}, d2 = {"Lo/setAudioSessionId;", "", "Lo/AudioAttributesCompat;", "p0", "Lo/booleanValue;", "p1", "Lo/setPriority;", "p2", "<init>", "(Lo/AudioAttributesCompat;Lo/booleanValue;Lo/setPriority;)V", "", "RemoteActionCompatParcelizer", "()V", "", "Lo/PropertyValueAny;", "Lo/setMediaSources;", "", "p3", "Lkotlin/Function1;", "Lo/getCurrentTrackSelections$write;", "p4", "Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "(IJLo/setMediaSources;ZLo/getAnswerMap;)Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;", "Lo/setPauseAtEndOfMediaItems;", "read", "(Lo/setPriority;Lo/setPauseAtEndOfMediaItems;Z)V", "(ILo/setMediaSources;)Lo/setPauseAtEndOfMediaItems;", "write", "Lo/AudioAttributesCompat;", "Lo/booleanValue;", "AudioAttributesCompatParcelizer", "Lo/setPriority;", "Z", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setAudioSessionId {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setPriority write;
    private boolean IconCompatParcelizer = true;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final booleanValue AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final AudioAttributesCompat RemoteActionCompatParcelizer;

    public setAudioSessionId(AudioAttributesCompat audioAttributesCompat, booleanValue booleanvalue, setPriority setpriority) {
        this.RemoteActionCompatParcelizer = audioAttributesCompat;
        this.AudioAttributesCompatParcelizer = booleanvalue;
        this.write = setpriority;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    public final void RemoteActionCompatParcelizer() {
        this.IconCompatParcelizer = false;
    }

    public final getCurrentTrackSelections.RemoteActionCompatParcelizer IconCompatParcelizer(int p0, long p1, setMediaSources p2, boolean p3, getAnswerMap<? super getCurrentTrackSelections.write, getShowPopup> p4) {
        setPriority setpriority = this.write;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this, p0, p1, p2, setpriority instanceof setPriorityTaskManager ? (setPriorityTaskManager) setpriority : null, p4, null);
        read(this.write, remoteActionCompatParcelizer, p3);
        AtomicIntegerDeserializer.AudioAttributesCompatParcelizer("compose:lazy:schedule_prefetch:index", p0);
        return remoteActionCompatParcelizer;
    }

    public final void read(setPriority setpriority, setPauseAtEndOfMediaItems setpauseatendofmediaitems, boolean z) {
        if (!(setpriority instanceof setPriorityTaskManager)) {
            setpriority.write(setpauseatendofmediaitems);
        } else if (z) {
            ((setPriorityTaskManager) setpriority).AudioAttributesCompatParcelizer(setpauseatendofmediaitems);
        } else {
            ((setPriorityTaskManager) setpriority).read(setpauseatendofmediaitems);
        }
    }

    public final setPauseAtEndOfMediaItems read(int p0, setMediaSources p1) {
        setPriority setpriority = this.write;
        return new RemoteActionCompatParcelizer(p0, p1, setpriority instanceof setPriorityTaskManager ? (setPriorityTaskManager) setpriority : null, null);
    }

    @Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0019B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBA\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0012\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u0013\u0010\u0012\u001a\u00020\u0018*\u00020\u001dH\u0016¢\u0006\u0004\b\u0012\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u0013J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u001dH\u0002¢\u0006\u0004\b\u0019\u0010\u001eJ-\u0010\u0014\u001a\u00020\u000b*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020 2\b\u0010\u0007\u001a\u0004\u0018\u00010 2\u0006\u0010\t\u001a\u00020!H\u0002¢\u0006\u0004\b\u0014\u0010\"J!\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020 2\b\u0010\u0007\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\u001f\u0010#J\u000f\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0004\b$\u0010\u0013J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0004\b%\u0010\u001bJ\u0019\u0010(\u001a\f\u0018\u00010&R\u00060\u0000R\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R\u001a\u0010\u001f\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010-\u001a\u0004\b\u0019\u0010.R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010(\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010$\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0016\u0010\u001c\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010>R\u0018\u00108\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010@R\u0016\u0010;\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010>R \u00103\u001a\f\u0018\u00010&R\u00060\u0000R\u00020'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010A\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010>R\u0014\u0010D\u001a\u00020\u00188CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010CR\u0014\u0010E\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010.R\u0016\u0010G\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010FR\u0016\u00105\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010FR\u0016\u0010/\u001a\u00020H8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bG\u0010FR\u0016\u00101\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010>"}, d2 = {"Lo/setAudioSessionId$RemoteActionCompatParcelizer;", "Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;", "Lo/setPauseAtEndOfMediaItems;", "Lo/getCurrentTrackSelections$write;", "", "p0", "Lo/setMediaSources;", "p1", "Lo/setPriorityTaskManager;", "p2", "Lkotlin/Function1;", "", "p3", "<init>", "(Lo/setAudioSessionId;ILo/setMediaSources;Lo/setPriorityTaskManager;Lo/getAnswerMap;)V", "Lo/PropertyValueAny;", "p4", "(Lo/setAudioSessionId;IJLo/setMediaSources;Lo/setPriorityTaskManager;Lo/getAnswerMap;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "AudioAttributesCompatParcelizer", "()V", "write", "Lo/getKey;", "(I)J", "", "", "IconCompatParcelizer", "(JJ)Z", "(J)V", "AudioAttributesImplBaseParcelizer", "Lo/setHandleAudioBecomingNoisy;", "(Lo/setHandleAudioBecomingNoisy;)Z", "read", "", "Lo/getExecutor;", "(Lo/setHandleAudioBecomingNoisy;Ljava/lang/Object;Ljava/lang/Object;Lo/getExecutor;)V", "(Ljava/lang/Object;Ljava/lang/Object;)V", "AudioAttributesImplApi21Parcelizer", "RemoteActionCompatParcelizer", "Lo/setAudioSessionId$RemoteActionCompatParcelizer$IconCompatParcelizer;", "Lo/setAudioSessionId;", "MediaBrowserCompatItemReceiver", "()Lo/setAudioSessionId$RemoteActionCompatParcelizer$IconCompatParcelizer;", "", "toString", "()Ljava/lang/String;", "I", "()I", "onAddQueueItem", "Lo/setMediaSources;", "onCustomAction", "Lo/setPriorityTaskManager;", "MediaMetadataCompat", "Lo/getAnswerMap;", "onCommand", "Lo/PropertyValueAny;", "Lo/booleanValue$IconCompatParcelizer;", "MediaBrowserCompatMediaItem", "Lo/booleanValue$IconCompatParcelizer;", "Lo/booleanValue$RemoteActionCompatParcelizer;", "MediaBrowserCompatSearchResultReceiver", "Lo/booleanValue$RemoteActionCompatParcelizer;", "MediaBrowserCompatCustomActionResultReceiver", "Z", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/Object;", "RatingCompat", "Lo/setAudioSessionId$RemoteActionCompatParcelizer$IconCompatParcelizer;", "()Z", "MediaDescriptionCompat", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "J", "handleMediaPlayPauseIfPendingOnHandler", "Lo/isTestDiscarded$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class RemoteActionCompatParcelizer implements getCurrentTrackSelections.RemoteActionCompatParcelizer, setPauseAtEndOfMediaItems, getCurrentTrackSelections.write {

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
        private boolean RatingCompat;
        private boolean AudioAttributesImplApi26Parcelizer;
        private boolean AudioAttributesImplBaseParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private boolean MediaBrowserCompatSearchResultReceiver;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private boolean AudioAttributesImplApi21Parcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private Object MediaBrowserCompatMediaItem;

        /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
        private booleanValue.IconCompatParcelizer MediaBrowserCompatItemReceiver;

        /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
        private booleanValue.RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;

        /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
        private boolean onCustomAction;

        /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
        private final getAnswerMap<getCurrentTrackSelections.write, getShowPopup> IconCompatParcelizer;

        /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
        private IconCompatParcelizer MediaMetadataCompat;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private long onCommand;

        /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
        private long onAddQueueItem;

        /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
        private final setMediaSources RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
        private PropertyValueAny write;

        /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
        private final setPriorityTaskManager AudioAttributesCompatParcelizer;
        private final int read;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private long handleMediaPlayPauseIfPendingOnHandler;

        /* JADX WARN: Multi-variable type inference failed */
        public RemoteActionCompatParcelizer(int i, setMediaSources setmediasources, setPriorityTaskManager setprioritytaskmanager, getAnswerMap<? super getCurrentTrackSelections.write, getShowPopup> getanswermap) {
            this.read = i;
            this.RemoteActionCompatParcelizer = setmediasources;
            this.AudioAttributesCompatParcelizer = setprioritytaskmanager;
            this.IconCompatParcelizer = getanswermap;
            isTestDiscarded.RemoteActionCompatParcelizer remoteActionCompatParcelizer = isTestDiscarded.RemoteActionCompatParcelizer.INSTANCE;
            this.onAddQueueItem = isTestDiscarded.RemoteActionCompatParcelizer.read();
        }

        @Override // o.getCurrentTrackSelections.write
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final int getRead() {
            return this.read;
        }

        private RemoteActionCompatParcelizer(setAudioSessionId setaudiosessionid, int i, long j, setMediaSources setmediasources, setPriorityTaskManager setprioritytaskmanager, getAnswerMap<? super getCurrentTrackSelections.write, getShowPopup> getanswermap) {
            this(i, setmediasources, setprioritytaskmanager, getanswermap);
            this.write = PropertyValueAny.read(j);
        }

        private final boolean AudioAttributesImplApi26Parcelizer() {
            booleanValue.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
            return this.AudioAttributesImplBaseParcelizer || ((remoteActionCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver) != null && remoteActionCompatParcelizer.getRead());
        }

        @Override // o.getCurrentTrackSelections.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            if (this.AudioAttributesImplApi26Parcelizer) {
                return;
            }
            this.AudioAttributesImplApi26Parcelizer = true;
            read();
        }

        @Override // o.getCurrentTrackSelections.RemoteActionCompatParcelizer
        public final void write() {
            this.RatingCompat = true;
        }

        @Override // o.getCurrentTrackSelections.write
        public final int RemoteActionCompatParcelizer() {
            booleanValue.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatItemReceiver;
            if (iconCompatParcelizer != null) {
                return iconCompatParcelizer.AudioAttributesCompatParcelizer();
            }
            return 0;
        }

        @Override // o.getCurrentTrackSelections.write
        public final long AudioAttributesCompatParcelizer(int p0) {
            booleanValue.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatItemReceiver;
            return iconCompatParcelizer != null ? iconCompatParcelizer.RemoteActionCompatParcelizer(p0) : getKey.INSTANCE.RemoteActionCompatParcelizer();
        }

        private final boolean IconCompatParcelizer(long p0, long p1) {
            if (this.RatingCompat) {
                p1 = 0;
            }
            return p0 > p1;
        }

        private final void AudioAttributesCompatParcelizer(long p0) {
            this.handleMediaPlayPauseIfPendingOnHandler = p0;
            isTestDiscarded.RemoteActionCompatParcelizer remoteActionCompatParcelizer = isTestDiscarded.RemoteActionCompatParcelizer.INSTANCE;
            this.onAddQueueItem = isTestDiscarded.RemoteActionCompatParcelizer.read();
            this.onCommand = 0L;
            AtomicIntegerDeserializer.AudioAttributesCompatParcelizer("compose:lazy:prefetch:available_time_nanos", p0);
        }

        private final void AudioAttributesImplBaseParcelizer() {
            isTestDiscarded.RemoteActionCompatParcelizer remoteActionCompatParcelizer = isTestDiscarded.RemoteActionCompatParcelizer.INSTANCE;
            long j = isTestDiscarded.RemoteActionCompatParcelizer.read();
            long jAudioAttributesCompatParcelizer = getTestPattern.AudioAttributesCompatParcelizer(isTestDiscarded.RemoteActionCompatParcelizer.C0118RemoteActionCompatParcelizer.write(j, this.onAddQueueItem));
            this.onCommand = jAudioAttributesCompatParcelizer;
            long j2 = this.handleMediaPlayPauseIfPendingOnHandler - jAudioAttributesCompatParcelizer;
            this.handleMediaPlayPauseIfPendingOnHandler = j2;
            this.onAddQueueItem = j;
            AtomicIntegerDeserializer.AudioAttributesCompatParcelizer("compose:lazy:prefetch:available_time_nanos", j2);
        }

        @Override // kotlin.setPauseAtEndOfMediaItems
        public final boolean AudioAttributesCompatParcelizer(setHandleAudioBecomingNoisy sethandleaudiobecomingnoisy) {
            boolean zIconCompatParcelizer;
            if (!setAudioSessionId.this.IconCompatParcelizer) {
                return false;
            }
            if (!this.RatingCompat) {
                zIconCompatParcelizer = IconCompatParcelizer(sethandleaudiobecomingnoisy);
            } else {
                Trace.beginSection("compose:lazy:prefetch:execute:urgent");
                try {
                    zIconCompatParcelizer = IconCompatParcelizer(sethandleaudiobecomingnoisy);
                } finally {
                    Trace.endSection();
                }
            }
            AtomicIntegerDeserializer.AudioAttributesCompatParcelizer("compose:lazy:prefetch:execute:item", -1L);
            return zIconCompatParcelizer;
        }

        private final void read() {
            booleanValue.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
            if (remoteActionCompatParcelizer != null) {
                remoteActionCompatParcelizer.write();
            }
            this.MediaBrowserCompatCustomActionResultReceiver = null;
            booleanValue.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatItemReceiver;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.IconCompatParcelizer();
            }
            this.MediaBrowserCompatItemReceiver = null;
            this.MediaMetadataCompat = null;
        }

        private final boolean IconCompatParcelizer(setHandleAudioBecomingNoisy sethandleaudiobecomingnoisy) {
            AtomicIntegerDeserializer.AudioAttributesCompatParcelizer("compose:lazy:prefetch:execute:item", getRead());
            AudioAttributesImplApi21 audioAttributesImplApi21Invoke = setAudioSessionId.this.RemoteActionCompatParcelizer.write().invoke();
            if (!this.AudioAttributesImplApi26Parcelizer) {
                int i = audioAttributesImplApi21Invoke.read();
                int read = getRead();
                if (read >= 0 && read < i) {
                    Object objIconCompatParcelizer = audioAttributesImplApi21Invoke.IconCompatParcelizer(getRead());
                    Object obj = this.MediaBrowserCompatMediaItem;
                    if (obj != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(objIconCompatParcelizer, obj)) {
                        read();
                        return false;
                    }
                    Object objRemoteActionCompatParcelizer = audioAttributesImplApi21Invoke.RemoteActionCompatParcelizer(getRead());
                    getExecutor getexecutorAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(objRemoteActionCompatParcelizer);
                    boolean zAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
                    AudioAttributesCompatParcelizer(sethandleaudiobecomingnoisy.RemoteActionCompatParcelizer());
                    if (!AudioAttributesImplApi26Parcelizer()) {
                        if (getDesignInfoListui_tooling.read) {
                            if (IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, getexecutorAudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() + getexecutorAudioAttributesCompatParcelizer.getRead())) {
                                Trace.beginSection("compose:lazy:prefetch:compose");
                                try {
                                    write(sethandleaudiobecomingnoisy, objIconCompatParcelizer, objRemoteActionCompatParcelizer, getexecutorAudioAttributesCompatParcelizer);
                                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                                } finally {
                                }
                            }
                        } else if (IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, getexecutorAudioAttributesCompatParcelizer.getWrite())) {
                            Trace.beginSection("compose:lazy:prefetch:compose");
                            try {
                                read(objIconCompatParcelizer, objRemoteActionCompatParcelizer);
                                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                                Trace.endSection();
                                AudioAttributesImplBaseParcelizer();
                                getexecutorAudioAttributesCompatParcelizer.read(this.onCommand);
                            } finally {
                            }
                        }
                        if (!AudioAttributesImplApi26Parcelizer()) {
                            return true;
                        }
                    }
                    if (this.MediaBrowserCompatCustomActionResultReceiver != null) {
                        if (!IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, getexecutorAudioAttributesCompatParcelizer.getIconCompatParcelizer())) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:apply");
                        try {
                            AudioAttributesImplApi21Parcelizer();
                            getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
                            Trace.endSection();
                            AudioAttributesImplBaseParcelizer();
                            getexecutorAudioAttributesCompatParcelizer.IconCompatParcelizer(this.onCommand);
                        } finally {
                        }
                    }
                    if (!this.MediaBrowserCompatSearchResultReceiver) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler <= 0) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            this.MediaMetadataCompat = MediaBrowserCompatItemReceiver();
                            this.MediaBrowserCompatSearchResultReceiver = true;
                            getShowPopup getshowpopup4 = getShowPopup.INSTANCE;
                        } finally {
                        }
                    }
                    IconCompatParcelizer iconCompatParcelizer = this.MediaMetadataCompat;
                    if (iconCompatParcelizer != null && iconCompatParcelizer.RemoteActionCompatParcelizer(sethandleaudiobecomingnoisy, getexecutorAudioAttributesCompatParcelizer.getAudioAttributesImplApi21Parcelizer(), this.RatingCompat)) {
                        return true;
                    }
                    IconCompatParcelizer iconCompatParcelizer2 = this.MediaMetadataCompat;
                    if (iconCompatParcelizer2 != null && iconCompatParcelizer2.getWrite()) {
                        AudioAttributesImplBaseParcelizer();
                        AtomicIntegerDeserializer.AudioAttributesCompatParcelizer("compose:lazy:prefetch:execute:item", getRead());
                        IconCompatParcelizer iconCompatParcelizer3 = this.MediaMetadataCompat;
                        if (iconCompatParcelizer3 != null) {
                            iconCompatParcelizer3.read(false);
                        }
                    }
                    PropertyValueAny propertyValueAny = this.write;
                    if (!this.AudioAttributesImplApi21Parcelizer && propertyValueAny != null) {
                        if ((setAudioSessionId.this.getRead() && !zAudioAttributesImplApi26Parcelizer) || !IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, getexecutorAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer())) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            RemoteActionCompatParcelizer(propertyValueAny.getRead());
                            getShowPopup getshowpopup5 = getShowPopup.INSTANCE;
                            Trace.endSection();
                            AudioAttributesImplBaseParcelizer();
                            getexecutorAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.onCommand);
                            getAnswerMap<getCurrentTrackSelections.write, getShowPopup> getanswermap = this.IconCompatParcelizer;
                            if (getanswermap != null) {
                                getanswermap.invoke(this);
                            }
                        } finally {
                        }
                    }
                    IconCompatParcelizer iconCompatParcelizer4 = this.MediaMetadataCompat;
                    if (this.AudioAttributesImplApi21Parcelizer && this.MediaBrowserCompatSearchResultReceiver && iconCompatParcelizer4 != null) {
                        int iWrite = iconCompatParcelizer4.write();
                        getexecutorAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iWrite);
                        if (iconCompatParcelizer4.RemoteActionCompatParcelizer() < iWrite) {
                            getexecutorAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                        }
                    }
                    return false;
                }
            }
            read();
            return false;
        }

        private final void write(setHandleAudioBecomingNoisy sethandleaudiobecomingnoisy, Object obj, Object obj2, final getExecutor getexecutor) {
            booleanValue.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = this.MediaBrowserCompatCustomActionResultReceiver;
            if (remoteActionCompatParcelizerWrite == null) {
                setAudioSessionId setaudiosessionid = setAudioSessionId.this;
                remoteActionCompatParcelizerWrite = setaudiosessionid.AudioAttributesCompatParcelizer.write(obj, setaudiosessionid.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(getRead(), obj, obj2));
                this.MediaBrowserCompatCustomActionResultReceiver = remoteActionCompatParcelizerWrite;
                this.MediaBrowserCompatMediaItem = obj;
            }
            this.onCustomAction = false;
            while (!remoteActionCompatParcelizerWrite.getRead() && !this.onCustomAction) {
                remoteActionCompatParcelizerWrite.read(new isResourceManaged() { // from class: o.setMediaSource
                    @Override // kotlin.isResourceManaged
                    public final boolean AudioAttributesCompatParcelizer() {
                        return setAudioSessionId.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.read, getexecutor);
                    }
                });
            }
            AudioAttributesImplBaseParcelizer();
            if (this.onCustomAction) {
                getexecutor.AudioAttributesCompatParcelizer(this.onCommand);
            } else {
                getexecutor.write(this.onCommand);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, getExecutor getexecutor) {
            if (!remoteActionCompatParcelizer.onCustomAction) {
                remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
                getexecutor.write(remoteActionCompatParcelizer.onCommand);
                remoteActionCompatParcelizer.onCustomAction = !remoteActionCompatParcelizer.IconCompatParcelizer(remoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler, getexecutor.getAudioAttributesCompatParcelizer() + getexecutor.getRead());
            }
            return remoteActionCompatParcelizer.onCustomAction;
        }

        private final void read(Object p0, Object p1) {
            if (this.MediaBrowserCompatItemReceiver != null) {
                getRootStableInsets.RemoteActionCompatParcelizer("Request was already composed!");
            }
            MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBodyRemoteActionCompatParcelizer = setAudioSessionId.this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(getRead(), p0, p1);
            this.MediaBrowserCompatMediaItem = p0;
            this.MediaBrowserCompatItemReceiver = setAudioSessionId.this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0, magicModuleSubmissionRequestBodyRemoteActionCompatParcelizer);
            this.AudioAttributesImplBaseParcelizer = true;
        }

        private final void AudioAttributesImplApi21Parcelizer() {
            booleanValue.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
            if (remoteActionCompatParcelizer == null) {
                throw new IllegalArgumentException("Nothing to apply!".toString());
            }
            this.MediaBrowserCompatItemReceiver = remoteActionCompatParcelizer.read();
            this.MediaBrowserCompatCustomActionResultReceiver = null;
            this.AudioAttributesImplBaseParcelizer = true;
        }

        private final void RemoteActionCompatParcelizer(long p0) {
            if (this.AudioAttributesImplApi26Parcelizer) {
                getRootStableInsets.RemoteActionCompatParcelizer("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.AudioAttributesImplApi21Parcelizer) {
                getRootStableInsets.RemoteActionCompatParcelizer("Request was already measured!");
            }
            this.AudioAttributesImplApi21Parcelizer = true;
            booleanValue.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatItemReceiver;
            if (iconCompatParcelizer != null) {
                int iAudioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer();
                for (int i = 0; i < iAudioAttributesCompatParcelizer; i++) {
                    iconCompatParcelizer.AudioAttributesCompatParcelizer(i, p0);
                }
                return;
            }
            getRootStableInsets.read("performComposition() must be called before performMeasure()");
            throw new PlanDetailsCreator();
        }

        private final IconCompatParcelizer MediaBrowserCompatItemReceiver() {
            booleanValue.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatItemReceiver;
            if (iconCompatParcelizer != null) {
                final MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
                iconCompatParcelizer.IconCompatParcelizer("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new getAnswerMap() { // from class: o.setImageOutput
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return setAudioSessionId.RemoteActionCompatParcelizer.write(writeVar, (createForPropertyOverride) obj);
                    }
                });
                List list = (List) writeVar.write;
                if (list != null) {
                    return new IconCompatParcelizer(list);
                }
                return null;
            }
            getRootStableInsets.read("Should precompose before resolving nested prefetch states");
            throw new PlanDetailsCreator();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final createForPropertyOverride.Companion.IconCompatParcelizer write(MagicModuleUseCaseImplWhenMappings.write writeVar, createForPropertyOverride createforpropertyoverride) {
            T tWrite;
            toMagicModuleMetaRepoModel.read(createforpropertyoverride, "");
            getCurrentTrackSelections getcurrenttrackselectionsWrite = ((setVideoChangeFrameRateStrategy) createforpropertyoverride).getIconCompatParcelizer();
            List list = (List) writeVar.write;
            if (list != null) {
                list.add(getcurrenttrackselectionsWrite);
                tWrite = list;
            } else {
                tWrite = IntermediateLoginResponseBody.write(getcurrenttrackselectionsWrite);
            }
            writeVar.write = tWrite;
            return createForPropertyOverride.Companion.IconCompatParcelizer.IconCompatParcelizer;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
            sb.append(getRead());
            sb.append(", constraints = ");
            sb.append(this.write);
            sb.append(", isComposed = ");
            sb.append(AudioAttributesImplApi26Parcelizer());
            sb.append(", isMeasured = ");
            sb.append(this.AudioAttributesImplApi21Parcelizer);
            sb.append(", isCanceled = ");
            sb.append(this.AudioAttributesImplApi26Parcelizer);
            sb.append(" }");
            return sb.toString();
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u000eR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0015\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\"\u0010\r\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019\"\u0004\b\u0017\u0010\u001a"}, d2 = {"Lo/setAudioSessionId$RemoteActionCompatParcelizer$IconCompatParcelizer;", "", "", "Lo/getCurrentTrackSelections;", "p0", "<init>", "(Lo/setAudioSessionId$RemoteActionCompatParcelizer;Ljava/util/List;)V", "Lo/setHandleAudioBecomingNoisy;", "", "", "p1", "RemoteActionCompatParcelizer", "(Lo/setHandleAudioBecomingNoisy;IZ)Z", "write", "()I", "MediaBrowserCompatItemReceiver", "Ljava/util/List;", "", "Lo/setPauseAtEndOfMediaItems;", "AudioAttributesCompatParcelizer", "[Ljava/util/List;", "IconCompatParcelizer", "I", "read", "Z", "()Z", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
        final class IconCompatParcelizer {
            private final List<setPauseAtEndOfMediaItems>[] AudioAttributesCompatParcelizer;

            /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
            private int read;

            /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
            private final List<getCurrentTrackSelections> RemoteActionCompatParcelizer;

            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
            private int IconCompatParcelizer;

            /* JADX INFO: renamed from: read, reason: from kotlin metadata */
            private boolean write;

            public IconCompatParcelizer(List<getCurrentTrackSelections> list) {
                this.RemoteActionCompatParcelizer = list;
                this.AudioAttributesCompatParcelizer = new List[list.size()];
                if (list.isEmpty()) {
                    getRootStableInsets.RemoteActionCompatParcelizer("NestedPrefetchController shouldn't be created with no states");
                }
            }

            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
            public final boolean getWrite() {
                return this.write;
            }

            public final void read(boolean z) {
                this.write = z;
            }

            public final boolean RemoteActionCompatParcelizer(setHandleAudioBecomingNoisy sethandleaudiobecomingnoisy, int i, boolean z) {
                if (this.read >= this.RemoteActionCompatParcelizer.size()) {
                    return false;
                }
                if (RemoteActionCompatParcelizer.this.AudioAttributesImplApi26Parcelizer) {
                    getRootStableInsets.AudioAttributesCompatParcelizer("Should not execute nested prefetch on canceled request");
                }
                Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                try {
                    List<getCurrentTrackSelections> list = this.RemoteActionCompatParcelizer;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        list.get(i2).RemoteActionCompatParcelizer(i);
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    Trace.endSection();
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while (this.read < this.RemoteActionCompatParcelizer.size()) {
                        try {
                            if (this.AudioAttributesCompatParcelizer[this.read] == null) {
                                if (sethandleaudiobecomingnoisy.RemoteActionCompatParcelizer() <= 0) {
                                    return true;
                                }
                                List<setPauseAtEndOfMediaItems>[] listArr = this.AudioAttributesCompatParcelizer;
                                int i3 = this.read;
                                listArr[i3] = this.RemoteActionCompatParcelizer.get(i3).IconCompatParcelizer();
                            }
                            List<setPauseAtEndOfMediaItems> list2 = this.AudioAttributesCompatParcelizer[this.read];
                            toMagicModuleMetaRepoModel.write(list2);
                            while (this.IconCompatParcelizer < list2.size()) {
                                setPauseAtEndOfMediaItems setpauseatendofmediaitems = list2.get(this.IconCompatParcelizer);
                                if (z) {
                                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = setpauseatendofmediaitems instanceof RemoteActionCompatParcelizer ? (RemoteActionCompatParcelizer) setpauseatendofmediaitems : null;
                                    if (remoteActionCompatParcelizer != null) {
                                        remoteActionCompatParcelizer.write();
                                    }
                                }
                                this.write = true;
                                if (setpauseatendofmediaitems.AudioAttributesCompatParcelizer(sethandleaudiobecomingnoisy)) {
                                    return true;
                                }
                                this.IconCompatParcelizer++;
                            }
                            this.IconCompatParcelizer = 0;
                            this.read++;
                        } finally {
                        }
                    }
                    getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                    return false;
                } finally {
                }
            }

            public final int write() {
                List<getCurrentTrackSelections> list = this.RemoteActionCompatParcelizer;
                int size = list.size();
                int iMin = Integer.MAX_VALUE;
                for (int i = 0; i < size; i++) {
                    iMin = Math.min(iMin, list.get(i).getAudioAttributesImplApi21Parcelizer());
                }
                if (iMin == Integer.MAX_VALUE) {
                    return 0;
                }
                return iMin;
            }

            public final int RemoteActionCompatParcelizer() {
                List<getCurrentTrackSelections> list = this.RemoteActionCompatParcelizer;
                int size = list.size();
                int iMin = Integer.MAX_VALUE;
                for (int i = 0; i < size; i++) {
                    iMin = Math.min(iMin, list.get(i).getMediaBrowserCompatItemReceiver());
                }
                if (iMin == Integer.MAX_VALUE) {
                    return 0;
                }
                return iMin;
            }
        }

        public /* synthetic */ RemoteActionCompatParcelizer(setAudioSessionId setaudiosessionid, int i, long j, setMediaSources setmediasources, setPriorityTaskManager setprioritytaskmanager, getAnswerMap getanswermap, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(setaudiosessionid, i, j, setmediasources, setprioritytaskmanager, getanswermap);
        }
    }
}
