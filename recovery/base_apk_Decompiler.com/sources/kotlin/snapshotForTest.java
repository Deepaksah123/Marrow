package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class snapshotForTest extends RecyclerView.IconCompatParcelizer<read> {
    private List<String> IconCompatParcelizer;
    private final getAnswerMap<Integer, getShowPopup> write;

    /* JADX WARN: Multi-variable type inference failed */
    public snapshotForTest(getAnswerMap<? super Integer, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.write = getanswermap;
        this.IconCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return IconCompatParcelizer(viewGroup);
    }

    public final void RemoteActionCompatParcelizer(List<String> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.IconCompatParcelizer = list;
        notifyDataSetChanged();
    }

    private read IconCompatParcelizer(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_college_selection, viewGroup, false);
        toMagicModuleMetaRepoModel.write(viewInflate);
        return new read(this, viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.IconCompatParcelizer.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(read readVar, final int i) {
        toMagicModuleMetaRepoModel.write(readVar, "");
        readVar.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.get(i));
        readVar.write().setOnClickListener(new View.OnClickListener() { // from class: o.getMap
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                snapshotForTest.IconCompatParcelizer(this.IconCompatParcelizer, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(snapshotForTest snapshotfortest, int i) {
        snapshotfortest.write.invoke(Integer.valueOf(i));
    }

    public final class read extends RecyclerView.onMediaButtonEvent {
        private /* synthetic */ snapshotForTest AudioAttributesCompatParcelizer;
        private final TextView RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(snapshotForTest snapshotfortest, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.AudioAttributesCompatParcelizer = snapshotfortest;
            View viewFindViewById = view.findViewById(R.id.tvItemCollege);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
            this.RemoteActionCompatParcelizer = (TextView) viewFindViewById;
        }

        public final TextView write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void AudioAttributesCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer.setText(str);
        }
    }
}
