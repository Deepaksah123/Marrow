package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.putAll;

/* JADX INFO: loaded from: classes4.dex */
public final class putAll extends RecyclerView.IconCompatParcelizer<AudioAttributesCompatParcelizer> {
    private List<zzhb> AudioAttributesCompatParcelizer;
    private final zzgy IconCompatParcelizer;

    public putAll(zzgy zzgyVar) {
        toMagicModuleMetaRepoModel.write(zzgyVar, "");
        this.IconCompatParcelizer = zzgyVar;
        this.AudioAttributesCompatParcelizer = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return AudioAttributesCompatParcelizer(viewGroup);
    }

    private AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        r8lambdaNHXR3M3hRpDAuqCoI6TpK2QA5s r8lambdanhxr3m3hrpdauqcoi6tpk2qa5sRemoteActionCompatParcelizer = r8lambdaNHXR3M3hRpDAuqCoI6TpK2QA5s.RemoteActionCompatParcelizer(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdanhxr3m3hrpdauqcoi6tpk2qa5sRemoteActionCompatParcelizer, "");
        return new AudioAttributesCompatParcelizer(this, r8lambdanhxr3m3hrpdauqcoi6tpk2qa5sRemoteActionCompatParcelizer);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.AudioAttributesCompatParcelizer.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        audioAttributesCompatParcelizer.read(this.AudioAttributesCompatParcelizer.get(i), i);
    }

    public final void write(List<zzhb> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesCompatParcelizer.clear();
        this.AudioAttributesCompatParcelizer.addAll(list);
        notifyDataSetChanged();
    }

    public final class AudioAttributesCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private /* synthetic */ putAll IconCompatParcelizer;
        private final r8lambdaNHXR3M3hRpDAuqCoI6TpK2QA5s write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(putAll putall, r8lambdaNHXR3M3hRpDAuqCoI6TpK2QA5s r8lambdanhxr3m3hrpdauqcoi6tpk2qa5s) {
            super(r8lambdanhxr3m3hrpdauqcoi6tpk2qa5s.IconCompatParcelizer());
            toMagicModuleMetaRepoModel.write(r8lambdanhxr3m3hrpdauqcoi6tpk2qa5s, "");
            this.IconCompatParcelizer = putall;
            this.write = r8lambdanhxr3m3hrpdauqcoi6tpk2qa5s;
        }

        public final void read(zzhb zzhbVar, final int i) {
            toMagicModuleMetaRepoModel.write(zzhbVar, "");
            r8lambdaNHXR3M3hRpDAuqCoI6TpK2QA5s r8lambdanhxr3m3hrpdauqcoi6tpk2qa5s = this.write;
            final putAll putall = this.IconCompatParcelizer;
            r8lambdanhxr3m3hrpdauqcoi6tpk2qa5s.RemoteActionCompatParcelizer.setText(zzhbVar.AudioAttributesCompatParcelizer());
            r8lambdanhxr3m3hrpdauqcoi6tpk2qa5s.RemoteActionCompatParcelizer.setChecked(zzhbVar.read());
            r8lambdanhxr3m3hrpdauqcoi6tpk2qa5s.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zzfr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    putAll.AudioAttributesCompatParcelizer.IconCompatParcelizer(putall, i);
                }
            });
            if (i == putall.AudioAttributesCompatParcelizer.size() - 1) {
                View view = r8lambdanhxr3m3hrpdauqcoi6tpk2qa5s.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(view);
            } else {
                View view2 = r8lambdanhxr3m3hrpdauqcoi6tpk2qa5s.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
                bytesRead.AudioAttributesImplApi21Parcelizer(view2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IconCompatParcelizer(putAll putall, int i) {
            putall.IconCompatParcelizer.IconCompatParcelizer(i, ((zzhb) putall.AudioAttributesCompatParcelizer.get(i)).IconCompatParcelizer());
            putall.notifyDataSetChanged();
        }
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        if (i == -1) {
            return;
        }
        Iterator<T> it = this.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((zzhb) it.next()).RemoteActionCompatParcelizer(false);
        }
        this.AudioAttributesCompatParcelizer.get(i).RemoteActionCompatParcelizer(true);
        notifyDataSetChanged();
    }
}
