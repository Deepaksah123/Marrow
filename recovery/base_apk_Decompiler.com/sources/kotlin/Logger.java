package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class Logger extends RecyclerView.IconCompatParcelizer<AudioAttributesCompatParcelizer> {
    private final List<readUnsignedInt> AudioAttributesCompatParcelizer;
    private final getAnswerMap<readUnsignedInt, getShowPopup> read;

    /* JADX WARN: Multi-variable type inference failed */
    public Logger(List<readUnsignedInt> list, getAnswerMap<? super readUnsignedInt, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.AudioAttributesCompatParcelizer = list;
        this.read = getanswermap;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return IconCompatParcelizer(viewGroup);
    }

    private AudioAttributesCompatParcelizer IconCompatParcelizer(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        bindSampleQueue bindsamplequeueRemoteActionCompatParcelizer = bindSampleQueue.RemoteActionCompatParcelizer(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bindsamplequeueRemoteActionCompatParcelizer, "");
        return new AudioAttributesCompatParcelizer(this, bindsamplequeueRemoteActionCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        audioAttributesCompatParcelizer.read(this.AudioAttributesCompatParcelizer.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.AudioAttributesCompatParcelizer.size();
    }

    public final class AudioAttributesCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private final bindSampleQueue read;
        private /* synthetic */ Logger write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(Logger logger, bindSampleQueue bindsamplequeue) {
            super(bindsamplequeue.IconCompatParcelizer());
            toMagicModuleMetaRepoModel.write(bindsamplequeue, "");
            this.write = logger;
            this.read = bindsamplequeue;
        }

        public final void read(final readUnsignedInt readunsignedint) {
            toMagicModuleMetaRepoModel.write(readunsignedint, "");
            int i = readunsignedint.read();
            String strIconCompatParcelizer = readunsignedint.IconCompatParcelizer();
            StringBuilder sb = new StringBuilder();
            sb.append(strIconCompatParcelizer);
            sb.append(" (");
            sb.append(i);
            sb.append(")");
            String string = sb.toString();
            write(i > 0);
            this.read.write.setText(string);
            ConstraintLayout constraintLayoutIconCompatParcelizer = this.read.IconCompatParcelizer();
            final Logger logger = this.write;
            constraintLayoutIconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zzal
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.AudioAttributesCompatParcelizer.read(logger, readunsignedint);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void read(Logger logger, readUnsignedInt readunsignedint) {
            logger.read.invoke(readunsignedint);
        }

        private void write(boolean z) {
            this.read.IconCompatParcelizer().setEnabled(z);
            this.read.write.setEnabled(z);
        }
    }
}
