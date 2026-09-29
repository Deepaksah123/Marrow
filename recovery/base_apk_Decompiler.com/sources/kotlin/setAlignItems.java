package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import com.marrow2.domain.custom_module.model.CustomModuleTopicListModel;
import kotlin.setAlignItems;

/* JADX INFO: loaded from: classes3.dex */
public final class setAlignItems extends deserializeIymvxus<CustomModuleTopicListModel, write> {
    private final AudioAttributesCompatParcelizer write;

    public interface AudioAttributesCompatParcelizer {
        void write(CustomModuleTopicListModel customModuleTopicListModel, boolean z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return RemoteActionCompatParcelizer(viewGroup);
    }

    public final AudioAttributesCompatParcelizer read() {
        return this.write;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setAlignItems(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        super(new setJustifyContent());
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.write = audioAttributesCompatParcelizer;
    }

    private write RemoteActionCompatParcelizer(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cm_topics_list, viewGroup, false);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
        return new write(this, viewInflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(write writeVar, int i) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        CustomModuleTopicListModel customModuleTopicListModel = read(i);
        toMagicModuleMetaRepoModel.write(customModuleTopicListModel);
        writeVar.RemoteActionCompatParcelizer(customModuleTopicListModel);
    }

    public class write extends RecyclerView.onMediaButtonEvent {
        private final CheckBox AudioAttributesCompatParcelizer;
        private final LinearLayout IconCompatParcelizer;
        private final TextView RemoteActionCompatParcelizer;
        private /* synthetic */ setAlignItems read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(setAlignItems setalignitems, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.read = setalignitems;
            this.IconCompatParcelizer = (LinearLayout) view.findViewById(R.id.llTopicItem);
            this.AudioAttributesCompatParcelizer = (CheckBox) view.findViewById(R.id.cbTopicItem);
            this.RemoteActionCompatParcelizer = (TextView) view.findViewById(R.id.tvModulesCount);
        }

        public final void RemoteActionCompatParcelizer(final CustomModuleTopicListModel customModuleTopicListModel) {
            toMagicModuleMetaRepoModel.write(customModuleTopicListModel, "");
            this.AudioAttributesCompatParcelizer.setText(customModuleTopicListModel.getWrite());
            this.AudioAttributesCompatParcelizer.setChecked(customModuleTopicListModel.getRead());
            TextView textView = this.RemoteActionCompatParcelizer;
            int audioAttributesCompatParcelizer = customModuleTopicListModel.getAudioAttributesCompatParcelizer();
            StringBuilder sb = new StringBuilder();
            sb.append(audioAttributesCompatParcelizer);
            sb.append(" Modules");
            textView.setText(sb.toString());
            LinearLayout linearLayout = this.IconCompatParcelizer;
            final setAlignItems setalignitems = this.read;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.FlexItem
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setAlignItems.write.IconCompatParcelizer(setalignitems, customModuleTopicListModel, this);
                }
            });
            this.AudioAttributesCompatParcelizer.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IconCompatParcelizer(setAlignItems setalignitems, CustomModuleTopicListModel customModuleTopicListModel, write writeVar) {
            setalignitems.read().write(customModuleTopicListModel, writeVar.AudioAttributesCompatParcelizer.isChecked());
        }
    }
}
