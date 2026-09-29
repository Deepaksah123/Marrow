package kotlin;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.marrow.R;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Preconditions extends RecyclerView.IconCompatParcelizer<AudioAttributesCompatParcelizer> {
    private List<String> RemoteActionCompatParcelizer;

    public Preconditions(List<String> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return write(viewGroup);
    }

    public final class AudioAttributesCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private /* synthetic */ Preconditions AudioAttributesCompatParcelizer;
        private final setExtractorFactory read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(Preconditions preconditions, setExtractorFactory setextractorfactory) {
            super(setextractorfactory.IconCompatParcelizer());
            toMagicModuleMetaRepoModel.write(setextractorfactory, "");
            this.AudioAttributesCompatParcelizer = preconditions;
            this.read = setextractorfactory;
        }

        public final setExtractorFactory RemoteActionCompatParcelizer() {
            return this.read;
        }
    }

    private AudioAttributesCompatParcelizer write(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        setExtractorFactory setextractorfactoryAudioAttributesCompatParcelizer = setExtractorFactory.AudioAttributesCompatParcelizer(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setextractorfactoryAudioAttributesCompatParcelizer, "");
        return new AudioAttributesCompatParcelizer(this, setextractorfactoryAudioAttributesCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        Glide.write(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer().write.getContext()).RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.get(i)).RemoteActionCompatParcelizer(R.drawable.icv_place_holder_mcq_image).AudioAttributesCompatParcelizer(R.drawable.icv_place_holder_mcq_image).RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer().write);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.RemoteActionCompatParcelizer.size();
    }

    public final void RemoteActionCompatParcelizer(List<String> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = list;
        notifyDataSetChanged();
    }
}
