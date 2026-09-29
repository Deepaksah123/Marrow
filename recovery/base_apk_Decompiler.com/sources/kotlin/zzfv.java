package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.zzfv;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfv extends RecyclerView.IconCompatParcelizer<RemoteActionCompatParcelizer> {
    private final zzgy AudioAttributesCompatParcelizer;
    private ArrayList<nextIndex> write;

    public zzfv(zzgy zzgyVar) {
        toMagicModuleMetaRepoModel.write(zzgyVar, "");
        this.AudioAttributesCompatParcelizer = zzgyVar;
        this.write = new ArrayList<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return RemoteActionCompatParcelizer(viewGroup);
    }

    public final void AudioAttributesCompatParcelizer(List<nextIndex> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.write.clear();
        this.write.addAll(list);
    }

    private RemoteActionCompatParcelizer RemoteActionCompatParcelizer(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        assertIsPrepared assertispreparedIconCompatParcelizer = assertIsPrepared.IconCompatParcelizer(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(assertispreparedIconCompatParcelizer, "");
        return new RemoteActionCompatParcelizer(this, assertispreparedIconCompatParcelizer);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.write.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        nextIndex nextindex = this.write.get(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(nextindex, "");
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(nextindex);
    }

    public class RemoteActionCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private /* synthetic */ zzfv IconCompatParcelizer;
        private final assertIsPrepared write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(zzfv zzfvVar, assertIsPrepared assertisprepared) {
            super(assertisprepared.IconCompatParcelizer());
            toMagicModuleMetaRepoModel.write(assertisprepared, "");
            this.IconCompatParcelizer = zzfvVar;
            this.write = assertisprepared;
        }

        public final void AudioAttributesCompatParcelizer(final nextIndex nextindex) {
            toMagicModuleMetaRepoModel.write(nextindex, "");
            assertIsPrepared assertisprepared = this.write;
            final zzfv zzfvVar = this.IconCompatParcelizer;
            if (nextindex.write() == 2) {
                assertisprepared.RemoteActionCompatParcelizer.setText(this.itemView.getContext().getString(R.string.pearl_id, nextindex.IconCompatParcelizer()));
                assertisprepared.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zzfw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        zzfv.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(nextindex, zzfvVar);
                    }
                });
            } else {
                assertisprepared.RemoteActionCompatParcelizer.setText(this.itemView.getContext().getString(R.string.mcq_id, nextindex.IconCompatParcelizer()));
                assertisprepared.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zzfu
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        zzfv.RemoteActionCompatParcelizer.IconCompatParcelizer(nextindex, zzfvVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void RemoteActionCompatParcelizer(nextIndex nextindex, zzfv zzfvVar) {
            String strIconCompatParcelizer = nextindex.IconCompatParcelizer();
            if (strIconCompatParcelizer != null) {
                zzfvVar.AudioAttributesCompatParcelizer.IconCompatParcelizer(strIconCompatParcelizer);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IconCompatParcelizer(nextIndex nextindex, zzfv zzfvVar) {
            String strIconCompatParcelizer = nextindex.IconCompatParcelizer();
            if (strIconCompatParcelizer != null) {
                zzfvVar.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(strIconCompatParcelizer);
            }
        }
    }
}
