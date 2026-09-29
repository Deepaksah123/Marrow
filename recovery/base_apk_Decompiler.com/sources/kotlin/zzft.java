package kotlin;

import android.text.SpannableString;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.zzft;

/* JADX INFO: loaded from: classes4.dex */
public final class zzft extends RecyclerView.IconCompatParcelizer<write> {
    private final zzgy AudioAttributesCompatParcelizer;
    private ArrayList<zzhj> RemoteActionCompatParcelizer;

    public zzft(zzgy zzgyVar) {
        toMagicModuleMetaRepoModel.write(zzgyVar, "");
        this.AudioAttributesCompatParcelizer = zzgyVar;
        this.RemoteActionCompatParcelizer = new ArrayList<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return read(viewGroup);
    }

    private write read(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        HlsSampleStream hlsSampleStreamRemoteActionCompatParcelizer = HlsSampleStream.RemoteActionCompatParcelizer(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsSampleStreamRemoteActionCompatParcelizer, "");
        return new write(this, hlsSampleStreamRemoteActionCompatParcelizer);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.RemoteActionCompatParcelizer.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(write writeVar, int i) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        zzhj zzhjVar = this.RemoteActionCompatParcelizer.get(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(zzhjVar, "");
        writeVar.RemoteActionCompatParcelizer(zzhjVar);
    }

    public final void RemoteActionCompatParcelizer(List<zzhj> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer.clear();
        this.RemoteActionCompatParcelizer.addAll(list);
        notifyDataSetChanged();
    }

    public final class write extends RecyclerView.onMediaButtonEvent {
        private /* synthetic */ zzft AudioAttributesCompatParcelizer;
        private final HlsSampleStream RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(zzft zzftVar, HlsSampleStream hlsSampleStream) {
            super(hlsSampleStream.IconCompatParcelizer());
            toMagicModuleMetaRepoModel.write(hlsSampleStream, "");
            this.AudioAttributesCompatParcelizer = zzftVar;
            this.RemoteActionCompatParcelizer = hlsSampleStream;
        }

        public final void RemoteActionCompatParcelizer(final zzhj zzhjVar) {
            toMagicModuleMetaRepoModel.write(zzhjVar, "");
            HlsSampleStream hlsSampleStream = this.RemoteActionCompatParcelizer;
            final zzft zzftVar = this.AudioAttributesCompatParcelizer;
            hlsSampleStream.write.setText(parseEac3SupplementalProperties.write(zzhjVar.read(), "MMMM dd yyyy"));
            TextView textView = hlsSampleStream.AudioAttributesImplApi21Parcelizer;
            zzhe zzheVarMediaBrowserCompatItemReceiver = zzhjVar.MediaBrowserCompatItemReceiver();
            String strAudioAttributesCompatParcelizer = zzheVarMediaBrowserCompatItemReceiver != null ? zzheVarMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer() : null;
            if (strAudioAttributesCompatParcelizer == null) {
                strAudioAttributesCompatParcelizer = "";
            }
            textView.setText(strAudioAttributesCompatParcelizer);
            hlsSampleStream.MediaBrowserCompatItemReceiver.setText(zzhjVar.MediaBrowserCompatCustomActionResultReceiver());
            AudioAttributesCompatParcelizer(zzhjVar.AudioAttributesCompatParcelizer());
            TextView textView2 = hlsSampleStream.read;
            Spanned spannedIconCompatParcelizer = configureFromObjectSettings.IconCompatParcelizer(zzhjVar.write(), 0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(spannedIconCompatParcelizer, "");
            textView2.setText(new SpannableString(TestGroupLSModel.AudioAttributesImplApi26Parcelizer(spannedIconCompatParcelizer)));
            hlsSampleStream.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zzfq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zzft.write.IconCompatParcelizer(zzftVar, zzhjVar);
                }
            });
            List<nextIndex> listAudioAttributesImplApi21Parcelizer = zzhjVar.AudioAttributesImplApi21Parcelizer();
            List<nextIndex> list = listAudioAttributesImplApi21Parcelizer;
            if (list != null && !list.isEmpty()) {
                RemoteActionCompatParcelizer(listAudioAttributesImplApi21Parcelizer);
                RecyclerView recyclerView = hlsSampleStream.IconCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
                PlayerControlViewExternalSyntheticLambda1.write(recyclerView);
                return;
            }
            RecyclerView recyclerView2 = hlsSampleStream.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView2, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(recyclerView2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IconCompatParcelizer(zzft zzftVar, zzhj zzhjVar) {
            zzftVar.AudioAttributesCompatParcelizer.write(zzhjVar.RemoteActionCompatParcelizer(), zzhjVar.MediaBrowserCompatCustomActionResultReceiver());
        }

        private final void AudioAttributesCompatParcelizer(String str) {
            HlsSampleStream hlsSampleStream = this.RemoteActionCompatParcelizer;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                LinearLayout linearLayout = hlsSampleStream.RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout);
            } else {
                LinearLayout linearLayout2 = hlsSampleStream.RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
                PlayerControlViewExternalSyntheticLambda1.write(linearLayout2);
                hlsSampleStream.AudioAttributesImplBaseParcelizer.setText(str2);
            }
        }

        private final void RemoteActionCompatParcelizer(List<nextIndex> list) {
            zzfv zzfvVar = new zzfv(this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
            zzfvVar.AudioAttributesCompatParcelizer(list);
            this.RemoteActionCompatParcelizer.IconCompatParcelizer.setAdapter(zzfvVar);
        }
    }
}
