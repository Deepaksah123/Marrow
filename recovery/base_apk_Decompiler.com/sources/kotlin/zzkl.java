package kotlin;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.withPropertyNamingStrategy;

/* JADX INFO: loaded from: classes4.dex */
public final class zzkl extends RecyclerView.IconCompatParcelizer<zzkp> {
    private final String AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;
    private final InputAccessor<Boolean> MediaBrowserCompatItemReceiver;
    private List<String> RemoteActionCompatParcelizer;
    private final setUpdatedStatus<Integer> read;
    private final zzhs write;

    public zzkl(String str, zzhs zzhsVar, boolean z, setUpdatedStatus<Integer> setupdatedstatus) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(zzhsVar, "");
        toMagicModuleMetaRepoModel.write(setupdatedstatus, "");
        this.AudioAttributesCompatParcelizer = str;
        this.write = zzhsVar;
        this.IconCompatParcelizer = z;
        this.read = setupdatedstatus;
        this.RemoteActionCompatParcelizer = new ArrayList();
        this.MediaBrowserCompatItemReceiver = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return AudioAttributesCompatParcelizer(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ void onViewRecycled(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        RemoteActionCompatParcelizer((zzkp) onmediabuttonevent);
    }

    public final List<String> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final InputAccessor<Boolean> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    private static zzkp AudioAttributesCompatParcelizer(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        Context context = viewGroup.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(withPropertyNamingStrategy.IconCompatParcelizer.INSTANCE);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new zzkp(composeView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.RemoteActionCompatParcelizer.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(zzkp zzkpVar, int i) {
        toMagicModuleMetaRepoModel.write(zzkpVar, "");
        zzkpVar.write(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer.get(i), i, this.write, this.IconCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.read);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(zzkp zzkpVar, int i, List<Object> list) {
        toMagicModuleMetaRepoModel.write(zzkpVar, "");
        toMagicModuleMetaRepoModel.write(list, "");
        super.onBindViewHolder(zzkpVar, i, list);
    }

    private static void RemoteActionCompatParcelizer(zzkp zzkpVar) {
        toMagicModuleMetaRepoModel.write(zzkpVar, "");
        zzkpVar.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer();
    }
}
