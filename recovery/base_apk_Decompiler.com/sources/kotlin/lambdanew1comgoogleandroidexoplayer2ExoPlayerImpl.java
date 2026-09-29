package kotlin;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017"}, d2 = {"Lo/lambdanew1comgoogleandroidexoplayer2ExoPlayerImpl;", "Lo/findExplicitNames;", "Landroid/content/Context;", "p0", "Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;", "p1", "Lo/updateAvailableCommands;", "p2", "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;Lo/updateAvailableCommands;)V", "", "write", "()V", "onContextDestroyed", "IconCompatParcelizer", "()Landroid/content/Context;", "Ljava/lang/ref/WeakReference;", "AudioAttributesCompatParcelizer", "Ljava/lang/ref/WeakReference;", "read", "Lo/updateAvailableCommands;", "RemoteActionCompatParcelizer", "Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;", "()Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;"}, k = 1, mv = {1, 4, 2})
public final class lambdanew1comgoogleandroidexoplayer2ExoPlayerImpl implements findExplicitNames {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final WeakReference<Context> IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RecyclerView.MediaMetadataCompat AudioAttributesCompatParcelizer;
    private final updateAvailableCommands read;

    public lambdanew1comgoogleandroidexoplayer2ExoPlayerImpl(Context context, RecyclerView.MediaMetadataCompat mediaMetadataCompat, updateAvailableCommands updateavailablecommands) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaMetadataCompat, "");
        toMagicModuleMetaRepoModel.write(updateavailablecommands, "");
        this.AudioAttributesCompatParcelizer = mediaMetadataCompat;
        this.read = updateavailablecommands;
        this.IconCompatParcelizer = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final RecyclerView.MediaMetadataCompat getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Context IconCompatParcelizer() {
        return this.IconCompatParcelizer.get();
    }

    private void write() {
        this.read.write(this);
    }

    @withMember(read = anyIgnorals.read.ON_DESTROY)
    public final void onContextDestroyed() {
        write();
    }
}
