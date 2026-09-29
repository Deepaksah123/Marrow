package kotlin;

import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.areModulesAlreadyInstalled;

/* JADX INFO: renamed from: o.zzae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/zzae;", "Lo/getInstrumentationInfo;", "Landroidx/fragment/app/Fragment;", "p0", "Lo/ConnectionTracker;", "p1", "", "Lo/setWindow;", "p2", "<init>", "(Landroidx/fragment/app/Fragment;Lo/ConnectionTracker;Ljava/util/List;)V", "", "AudioAttributesCompatParcelizer", "(Ljava/util/List;)V", "", "getItemCount", "()I", "IconCompatParcelizer", "(I)Landroidx/fragment/app/Fragment;", "MediaBrowserCompatItemReceiver", "Lo/ConnectionTracker;", "read", "AudioAttributesImplApi26Parcelizer", "Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0238zzae extends getInstrumentationInfo {

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    public List<setWindow> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    public ConnectionTracker read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C0238zzae(Fragment fragment, ConnectionTracker connectionTracker, List<setWindow> list) {
        super(fragment);
        toMagicModuleMetaRepoModel.write(fragment, "");
        toMagicModuleMetaRepoModel.write(connectionTracker, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.read = connectionTracker;
        this.AudioAttributesCompatParcelizer = list;
    }

    public /* synthetic */ C0238zzae(Fragment fragment, ConnectionTracker connectionTracker, List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(fragment, connectionTracker, (i & 4) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
    }

    public final void AudioAttributesCompatParcelizer(List<setWindow> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer = p0;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.AudioAttributesCompatParcelizer.size();
    }

    @Override // kotlin.getInstrumentationInfo
    public final Fragment IconCompatParcelizer(int p0) {
        areModulesAlreadyInstalled.Companion writeVar = areModulesAlreadyInstalled.INSTANCE;
        ConnectionTracker connectionTracker = this.read;
        return areModulesAlreadyInstalled.Companion.write(ConnectionTracker.write(this.AudioAttributesCompatParcelizer.get(p0).read(), connectionTracker.MediaBrowserCompatItemReceiver, connectionTracker.MediaBrowserCompatCustomActionResultReceiver, connectionTracker.AudioAttributesCompatParcelizer, connectionTracker.write, connectionTracker.IconCompatParcelizer, connectionTracker.AudioAttributesImplApi26Parcelizer));
    }
}
