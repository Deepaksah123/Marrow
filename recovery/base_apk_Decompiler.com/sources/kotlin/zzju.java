package kotlin;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.withPropertyNamingStrategy;

/* JADX INFO: loaded from: classes4.dex */
public final class zzju extends RecyclerView.IconCompatParcelizer<zzjv> {
    private final getAnswerMap<Integer, getShowPopup> AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private List<List<String>> IconCompatParcelizer;
    private final InputAccessor<Boolean> MediaBrowserCompatItemReceiver;
    private final zzhs RemoteActionCompatParcelizer;
    private final boolean read;
    private final parseDouble<Boolean> write;

    /* JADX WARN: Multi-variable type inference failed */
    public zzju(String str, zzhs zzhsVar, boolean z, getAnswerMap<? super Integer, getShowPopup> getanswermap, parseDouble<Boolean> parsedouble) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(zzhsVar, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(parsedouble, "");
        this.AudioAttributesImplApi26Parcelizer = str;
        this.RemoteActionCompatParcelizer = zzhsVar;
        this.read = z;
        this.AudioAttributesCompatParcelizer = getanswermap;
        this.write = parsedouble;
        this.IconCompatParcelizer = new ArrayList();
        this.MediaBrowserCompatItemReceiver = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return write(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ void onViewRecycled(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        read((zzjv) onmediabuttonevent);
    }

    public final List<List<String>> AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final InputAccessor<Boolean> IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    private static zzjv write(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        Context context = viewGroup.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(withPropertyNamingStrategy.IconCompatParcelizer.INSTANCE);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new zzjv(composeView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(zzjv zzjvVar, int i) {
        toMagicModuleMetaRepoModel.write(zzjvVar, "");
        zzjvVar.read(this.AudioAttributesImplApi26Parcelizer, this.IconCompatParcelizer.get(i), i, this.read, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesCompatParcelizer, this.write);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.IconCompatParcelizer.size();
    }

    private static void read(zzjv zzjvVar) {
        toMagicModuleMetaRepoModel.write(zzjvVar, "");
        zzjvVar.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer();
    }
}
