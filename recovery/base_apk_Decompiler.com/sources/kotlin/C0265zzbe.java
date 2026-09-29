package kotlin;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow2.ui.qbank.play.QBankPlayViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.withPropertyNamingStrategy;

/* JADX INFO: renamed from: o.zzbe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0265zzbe extends RecyclerView.IconCompatParcelizer<C0264zzbd> {
    private final QBankPlayViewModel AudioAttributesCompatParcelizer;
    private List<String> IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final zzhs read;
    private final String write;

    public C0265zzbe(String str, zzhs zzhsVar, boolean z, QBankPlayViewModel qBankPlayViewModel) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(zzhsVar, "");
        toMagicModuleMetaRepoModel.write(qBankPlayViewModel, "");
        this.write = str;
        this.read = zzhsVar;
        this.RemoteActionCompatParcelizer = z;
        this.AudioAttributesCompatParcelizer = qBankPlayViewModel;
        this.IconCompatParcelizer = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return write(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ void onViewRecycled(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        RemoteActionCompatParcelizer((C0264zzbd) onmediabuttonevent);
    }

    public final List<String> read() {
        return this.IconCompatParcelizer;
    }

    private static C0264zzbd write(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        Context context = viewGroup.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(withPropertyNamingStrategy.IconCompatParcelizer.INSTANCE);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new C0264zzbd(composeView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.IconCompatParcelizer.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C0264zzbd c0264zzbd, int i) {
        toMagicModuleMetaRepoModel.write(c0264zzbd, "");
        c0264zzbd.RemoteActionCompatParcelizer(this.write, this.IconCompatParcelizer, i, this.read, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer.get(i));
    }

    private static void RemoteActionCompatParcelizer(C0264zzbd c0264zzbd) {
        toMagicModuleMetaRepoModel.write(c0264zzbd, "");
        c0264zzbd.read().RemoteActionCompatParcelizer();
    }
}
