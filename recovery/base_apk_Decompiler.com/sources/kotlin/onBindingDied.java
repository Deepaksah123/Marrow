package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.onBindingDied;

/* JADX INFO: loaded from: classes3.dex */
public final class onBindingDied extends RecyclerView.IconCompatParcelizer<write> {
    private List<registerEvent> AudioAttributesCompatParcelizer;
    private String IconCompatParcelizer;
    private final getAnswerMap<registerEvent, getShowPopup> write;

    /* JADX WARN: Multi-variable type inference failed */
    public onBindingDied(getAnswerMap<? super registerEvent, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.write = getanswermap;
        this.AudioAttributesCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        this.IconCompatParcelizer = "";
    }

    public final getAnswerMap<registerEvent, getShowPopup> RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return RemoteActionCompatParcelizer(viewGroup);
    }

    public final List<registerEvent> IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String write() {
        return this.IconCompatParcelizer;
    }

    private write RemoteActionCompatParcelizer(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        setPlaylistTrackerFactory setplaylisttrackerfactory = setPlaylistTrackerFactory.read(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setplaylisttrackerfactory, "");
        return new write(this, setplaylisttrackerfactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(write writeVar, int i) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        writeVar.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.AudioAttributesCompatParcelizer.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void write(onBindingDied onbindingdied, List list, String str, int i) {
        if ((i & 1) != 0) {
            list = onbindingdied.AudioAttributesCompatParcelizer;
        }
        if ((i & 2) != 0) {
            str = onbindingdied.IconCompatParcelizer;
        }
        onbindingdied.write((List<registerEvent>) list, str);
    }

    private void write(List<registerEvent> list, String str) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.AudioAttributesCompatParcelizer = list;
        this.IconCompatParcelizer = str;
        notifyDataSetChanged();
    }

    public final int AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        int i = 0;
        for (Object obj : this.AudioAttributesCompatParcelizer) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((registerEvent) obj).read(), (Object) str)) {
                return i;
            }
            i++;
        }
        return 0;
    }

    public final class write extends RecyclerView.onMediaButtonEvent {
        private /* synthetic */ onBindingDied IconCompatParcelizer;
        private final setPlaylistTrackerFactory read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(onBindingDied onbindingdied, setPlaylistTrackerFactory setplaylisttrackerfactory) {
            super(setplaylisttrackerfactory.IconCompatParcelizer());
            toMagicModuleMetaRepoModel.write(setplaylisttrackerfactory, "");
            this.IconCompatParcelizer = onbindingdied;
            this.read = setplaylisttrackerfactory;
        }

        public final void IconCompatParcelizer(final registerEvent registerevent, int i) {
            toMagicModuleMetaRepoModel.write(registerevent, "");
            this.read.IconCompatParcelizer.setText(registerevent.AudioAttributesCompatParcelizer());
            this.read.AudioAttributesCompatParcelizer.setText(registerevent.IconCompatParcelizer());
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) registerevent.read(), (Object) this.IconCompatParcelizer.write())) {
                View view = this.read.RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
                PlayerControlViewExternalSyntheticLambda1.write(view);
            } else {
                View view2 = this.read.RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
                PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(view2);
            }
            ConstraintLayout constraintLayoutIconCompatParcelizer = this.read.IconCompatParcelizer();
            final onBindingDied onbindingdied = this.IconCompatParcelizer;
            constraintLayoutIconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zzaj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    onBindingDied.write.AudioAttributesCompatParcelizer(onbindingdied, registerevent);
                }
            });
            if (i == this.IconCompatParcelizer.IconCompatParcelizer().size() - 1) {
                View view3 = this.read.read;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view3, "");
                PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(view3);
            } else {
                View view4 = this.read.read;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view4, "");
                PlayerControlViewExternalSyntheticLambda1.write(view4);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesCompatParcelizer(onBindingDied onbindingdied, registerEvent registerevent) {
            onbindingdied.RemoteActionCompatParcelizer().invoke(registerevent);
        }
    }
}
