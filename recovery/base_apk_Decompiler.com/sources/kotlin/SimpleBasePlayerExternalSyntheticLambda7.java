package kotlin;

import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R*\u0010\f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda7;", "Lo/access4300;", "", "Lo/SimpleBasePlayerMediaItemDataBuilder;", "p0", "Lo/PlaylistTimeline1;", "p1", "<init>", "(Lo/SimpleBasePlayerMediaItemDataBuilder;Lo/PlaylistTimeline1;)V", "Lo/onShuffleModeChanged;", "Lo/getSubscriptionExpiresOn;", "Ljava/io/File;", "read", "()Lo/onShuffleModeChanged;", "Lo/onPlayerReleased;", "IconCompatParcelizer", "()Lo/onPlayerReleased;", "", "RemoteActionCompatParcelizer", "()I", "Lo/SimpleBasePlayerMediaItemDataBuilder;", "write", "MediaBrowserCompatCustomActionResultReceiver", "Lo/PlaylistTimeline1;", "Lo/onShuffleModeChanged;", "Lo/onPlayerReleased;", "AudioAttributesCompatParcelizer", "", "Ljava/lang/Object;", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleBasePlayerExternalSyntheticLambda7 implements access4300<byte[]> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Object IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private onShuffleModeChanged<Pair<byte[], File>> read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final PlaylistTimeline1 RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Object AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final SimpleBasePlayerMediaItemDataBuilder write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private onPlayerReleased AudioAttributesCompatParcelizer;

    public SimpleBasePlayerExternalSyntheticLambda7(SimpleBasePlayerMediaItemDataBuilder simpleBasePlayerMediaItemDataBuilder, PlaylistTimeline1 playlistTimeline1) {
        toMagicModuleMetaRepoModel.write(simpleBasePlayerMediaItemDataBuilder, "");
        this.write = simpleBasePlayerMediaItemDataBuilder;
        this.RemoteActionCompatParcelizer = playlistTimeline1;
        this.IconCompatParcelizer = new Object();
        this.AudioAttributesImplApi26Parcelizer = new Object();
    }

    @Override // kotlin.access4300
    public final onShuffleModeChanged<Pair<byte[], File>> read() {
        if (this.read == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.read == null) {
                    this.read = new onShuffleModeChanged<>(RemoteActionCompatParcelizer(), null, 2, null);
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
        }
        onShuffleModeChanged<Pair<byte[], File>> onshufflemodechanged = this.read;
        toMagicModuleMetaRepoModel.write(onshufflemodechanged);
        return onshufflemodechanged;
    }

    @Override // kotlin.access4300
    public final onPlayerReleased IconCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this.AudioAttributesImplApi26Parcelizer) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = new onPlayerReleased(this.write.AudioAttributesCompatParcelizer(), (int) this.write.write(), this.RemoteActionCompatParcelizer, null, 8, null);
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
        }
        onPlayerReleased onplayerreleased = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(onplayerreleased);
        return onplayerreleased;
    }

    private int RemoteActionCompatParcelizer() {
        int iMax = (int) Math.max(this.write.IconCompatParcelizer(), this.write.read());
        PlaylistTimeline1 playlistTimeline1 = this.RemoteActionCompatParcelizer;
        if (playlistTimeline1 != null) {
            this.write.IconCompatParcelizer();
            this.write.read();
            playlistTimeline1.read();
        }
        return iMax;
    }
}
