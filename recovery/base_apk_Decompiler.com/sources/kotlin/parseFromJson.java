package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.parseFromJson;

/* JADX INFO: loaded from: classes4.dex */
public final class parseFromJson extends RecyclerView.IconCompatParcelizer<RemoteActionCompatParcelizer> {
    private List<ProtocolVersion> IconCompatParcelizer;
    private final AudioAttributesCompatParcelizer read;

    public interface AudioAttributesCompatParcelizer {
        void AudioAttributesCompatParcelizer(int i, int i2, String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int IconCompatParcelizer(int i) {
        return i != 1 ? i != 2 ? i != 3 ? R.string.text_sort_by_topics : R.string.text_sort_by_score : R.string.text_sort_by_completion : R.string.text_sort_by_topics;
    }

    public parseFromJson(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.read = audioAttributesCompatParcelizer;
        this.IconCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ void onBindViewHolder(RecyclerView.onMediaButtonEvent onmediabuttonevent, int i) {
        IconCompatParcelizer((RemoteActionCompatParcelizer) onmediabuttonevent, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return IconCompatParcelizer(viewGroup);
    }

    public final AudioAttributesCompatParcelizer read() {
        return this.read;
    }

    public final List<ProtocolVersion> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public class RemoteActionCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private final ConstraintLayout AudioAttributesCompatParcelizer;
        private final View IconCompatParcelizer;
        private final ImageView RemoteActionCompatParcelizer;
        private final TextView read;
        private /* synthetic */ parseFromJson write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(parseFromJson parsefromjson, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.write = parsefromjson;
            this.AudioAttributesCompatParcelizer = (ConstraintLayout) view.findViewById(R.id.clSortMain);
            this.read = (TextView) view.findViewById(R.id.tvIndexTitle);
            this.IconCompatParcelizer = view.findViewById(R.id.viewDivider);
            this.RemoteActionCompatParcelizer = (ImageView) view.findViewById(R.id.ivTick);
        }

        public final void read(final int i) {
            final ProtocolVersion protocolVersion = this.write.IconCompatParcelizer().get(i);
            final String string = this.itemView.getContext().getString(parseFromJson.IconCompatParcelizer(protocolVersion.getRemoteActionCompatParcelizer()));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            this.read.setText(string);
            if (protocolVersion.getIconCompatParcelizer()) {
                this.RemoteActionCompatParcelizer.setVisibility(0);
            } else {
                this.RemoteActionCompatParcelizer.setVisibility(4);
            }
            if (i == this.write.IconCompatParcelizer().size() - 1) {
                this.IconCompatParcelizer.setVisibility(4);
            }
            ConstraintLayout constraintLayout = this.AudioAttributesCompatParcelizer;
            final parseFromJson parsefromjson = this.write;
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: o.KeyHandle
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    parseFromJson.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(parsefromjson, i, protocolVersion, string);
                }
            });
            if (protocolVersion.getIconCompatParcelizer()) {
                _addSuperTypes.RemoteActionCompatParcelizer(this.read, R.style.TextAppearance_Dr_Headline6);
            } else {
                _addSuperTypes.RemoteActionCompatParcelizer(this.read, R.style.TextAppearance_Dr_Body1);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesCompatParcelizer(parseFromJson parsefromjson, int i, ProtocolVersion protocolVersion, String str) {
            parsefromjson.read().AudioAttributesCompatParcelizer(i, protocolVersion.getRemoteActionCompatParcelizer(), str);
        }
    }

    private RemoteActionCompatParcelizer IconCompatParcelizer(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_lesson_sort_item, viewGroup, false);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
        return new RemoteActionCompatParcelizer(this, viewInflate);
    }

    private static void IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        remoteActionCompatParcelizer.read(i);
    }

    public final void read(int i) {
        List<ProtocolVersion> list = this.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        int i2 = -1;
        int i3 = 0;
        for (Object obj : list) {
            if (i3 < 0) {
                IntermediateLoginResponseBody.read();
            }
            ProtocolVersion protocolVersion = (ProtocolVersion) obj;
            if (protocolVersion.getIconCompatParcelizer()) {
                protocolVersion.AudioAttributesCompatParcelizer(false);
                i2 = i3;
            }
            arrayList.add(getShowPopup.INSTANCE);
            i3++;
        }
        this.IconCompatParcelizer.get(i).AudioAttributesCompatParcelizer(true);
        notifyItemChanged(i2);
        notifyItemChanged(i);
    }

    public final void read(List<ProtocolVersion> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.IconCompatParcelizer = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.IconCompatParcelizer.size();
    }
}
