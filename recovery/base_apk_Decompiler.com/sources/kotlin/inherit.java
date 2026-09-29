package kotlin;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import com.marrow.ui.activities.learn.video.overlay.OptionItem;
import java.util.Iterator;
import java.util.List;
import kotlin.inherit;
import kotlin.shouldEscapeCharacter;

/* JADX INFO: loaded from: classes3.dex */
public final class inherit extends RecyclerView.IconCompatParcelizer<RemoteActionCompatParcelizer> {
    private final List<OptionItem> AudioAttributesCompatParcelizer;
    private final getAnswerMap<OptionItem, getShowPopup> IconCompatParcelizer;
    private int read;

    /* JADX WARN: Multi-variable type inference failed */
    public inherit(List<? extends OptionItem> list, OptionItem optionItem, getAnswerMap<? super OptionItem, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.AudioAttributesCompatParcelizer = list;
        this.IconCompatParcelizer = getanswermap;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((OptionItem) it.next()).getIconCompatParcelizer(), (Object) (optionItem != null ? optionItem.getIconCompatParcelizer() : null))) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.read = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return AudioAttributesCompatParcelizer(viewGroup);
    }

    public final class RemoteActionCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private final setUseSessionKeys AudioAttributesCompatParcelizer;
        private /* synthetic */ inherit read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(inherit inheritVar, setUseSessionKeys setusesessionkeys) {
            super(setusesessionkeys.read);
            toMagicModuleMetaRepoModel.write(setusesessionkeys, "");
            this.read = inheritVar;
            this.AudioAttributesCompatParcelizer = setusesessionkeys;
        }

        public final void AudioAttributesCompatParcelizer(OptionItem optionItem, boolean z, final getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            toMagicModuleMetaRepoModel.write(optionItem, "");
            toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.setText(findRubyContainerNode.read(optionItem));
            if (findRubyContainerNode.IconCompatParcelizer(optionItem)) {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer.setChecked(z);
                if (findRubyContainerNode.RemoteActionCompatParcelizer(optionItem)) {
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.setAlpha(0.7f);
                }
                RadioButton radioButton = this.AudioAttributesCompatParcelizer.IconCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(radioButton, "");
                radioButton.setVisibility(0);
            } else {
                TextView textView = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
                shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
                Context context = this.AudioAttributesCompatParcelizer.read.getContext();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
                textView.setTextColor(shouldEscapeCharacter.Companion.read(context, z ? R.attr.onSurfaceBlue : R.attr.onBackgroundSurface3, new TypedValue(), true));
                RadioButton radioButton2 = this.AudioAttributesCompatParcelizer.IconCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(radioButton2, "");
                radioButton2.setVisibility(8);
            }
            this.AudioAttributesCompatParcelizer.read.setOnClickListener(new View.OnClickListener() { // from class: o.getFontFamily
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    inherit.RemoteActionCompatParcelizer.write(getcreatedondatems);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void write(getCreatedOnDateMs getcreatedondatems) {
            getcreatedondatems.invoke();
        }
    }

    private RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        setUseSessionKeys setusesessionkeys = setUseSessionKeys.read(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setusesessionkeys, "");
        return new RemoteActionCompatParcelizer(this, setusesessionkeys);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.get(i), i == this.read, new getCreatedOnDateMs() { // from class: o.chain
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return inherit.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, inherit inheritVar) {
        int i;
        int bindingAdapterPosition = remoteActionCompatParcelizer.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || bindingAdapterPosition == (i = inheritVar.read)) {
            return getShowPopup.INSTANCE;
        }
        inheritVar.read = bindingAdapterPosition;
        if (i != -1) {
            inheritVar.notifyItemChanged(i);
        }
        inheritVar.notifyItemChanged(inheritVar.read);
        inheritVar.IconCompatParcelizer.invoke(inheritVar.AudioAttributesCompatParcelizer.get(inheritVar.read));
        return getShowPopup.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.AudioAttributesCompatParcelizer.size();
    }
}
