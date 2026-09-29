package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.target;

/* JADX INFO: loaded from: classes4.dex */
public final class target extends RecyclerView.IconCompatParcelizer<RemoteActionCompatParcelizer> {
    private final getAnswerMap<String, getShowPopup> AudioAttributesCompatParcelizer;
    private List<String> read;

    /* JADX WARN: Multi-variable type inference failed */
    public target(getAnswerMap<? super String, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.AudioAttributesCompatParcelizer = getanswermap;
        this.read = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return write(viewGroup);
    }

    public final void read(List<String> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.read = list;
        notifyDataSetChanged();
    }

    private RemoteActionCompatParcelizer write(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        deriveFormat deriveformatRemoteActionCompatParcelizer = deriveFormat.RemoteActionCompatParcelizer(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(deriveformatRemoteActionCompatParcelizer, "");
        return new RemoteActionCompatParcelizer(this, deriveformatRemoteActionCompatParcelizer);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.read.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        remoteActionCompatParcelizer.IconCompatParcelizer(this.read.get(i));
    }

    public final class RemoteActionCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private final deriveFormat AudioAttributesCompatParcelizer;
        private /* synthetic */ target read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(target targetVar, deriveFormat deriveformat) {
            super(deriveformat.IconCompatParcelizer());
            toMagicModuleMetaRepoModel.write(deriveformat, "");
            this.read = targetVar;
            this.AudioAttributesCompatParcelizer = deriveformat;
        }

        public final void IconCompatParcelizer(final String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer.setText(str);
            TextView textView = this.AudioAttributesCompatParcelizer.IconCompatParcelizer;
            final target targetVar = this.read;
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.CircleOptions
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    target.RemoteActionCompatParcelizer.write(targetVar, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void write(target targetVar, String str) {
            targetVar.AudioAttributesCompatParcelizer.invoke(str);
        }
    }
}
