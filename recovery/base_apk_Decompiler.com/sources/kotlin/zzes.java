package kotlin;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.shouldEscapeCharacter;
import kotlin.zzex;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001b\u001a\u0016B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/zzes;", "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;", "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;", "", "Lo/zzex;", "p0", "<init>", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "", "p1", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;", "getItemViewType", "(I)I", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)V", "getItemCount", "()I", "Lo/zzex$AudioAttributesCompatParcelizer;", "", "write", "(Lo/zzex$AudioAttributesCompatParcelizer;)Z", "RemoteActionCompatParcelizer", "Ljava/util/List;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzes extends RecyclerView.IconCompatParcelizer<RecyclerView.onMediaButtonEvent> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<zzex> AudioAttributesCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public zzes(List<? extends zzex> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesCompatParcelizer = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p1 == 0) {
            setMetadataType setmetadatatype = setMetadataType.read(LayoutInflater.from(p0.getContext()), p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setmetadatatype, "");
            return new IconCompatParcelizer(this, setmetadatatype);
        }
        HlsMediaSource1 hlsMediaSource1AudioAttributesCompatParcelizer = HlsMediaSource1.AudioAttributesCompatParcelizer(LayoutInflater.from(p0.getContext()), p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsMediaSource1AudioAttributesCompatParcelizer, "");
        return new AudioAttributesCompatParcelizer(this, hlsMediaSource1AudioAttributesCompatParcelizer);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemViewType(int p0) {
        zzex zzexVar = this.AudioAttributesCompatParcelizer.get(p0);
        if (zzexVar instanceof zzex.RemoteActionCompatParcelizer) {
            return 0;
        }
        return zzexVar instanceof zzex.AudioAttributesCompatParcelizer ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void onBindViewHolder(RecyclerView.onMediaButtonEvent p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        zzex zzexVar = this.AudioAttributesCompatParcelizer.get(p1);
        if (zzexVar instanceof zzex.RemoteActionCompatParcelizer) {
            ((IconCompatParcelizer) p0).write((zzex.RemoteActionCompatParcelizer) zzexVar);
        } else if (zzexVar instanceof zzex.AudioAttributesCompatParcelizer) {
            ((AudioAttributesCompatParcelizer) p0).IconCompatParcelizer((zzex.AudioAttributesCompatParcelizer) zzexVar);
        } else {
            if (!(zzexVar instanceof zzex.read)) {
                throw new RenewEligibleCreator();
            }
            ((AudioAttributesCompatParcelizer) p0).AudioAttributesCompatParcelizer();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.AudioAttributesCompatParcelizer.size();
    }

    public final class IconCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private /* synthetic */ zzes RemoteActionCompatParcelizer;
        private final setMetadataType write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(zzes zzesVar, setMetadataType setmetadatatype) {
            super(setmetadatatype.IconCompatParcelizer());
            toMagicModuleMetaRepoModel.write(setmetadatatype, "");
            this.RemoteActionCompatParcelizer = zzesVar;
            this.write = setmetadatatype;
        }

        public final void write(zzex.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            LinearLayout linearLayoutIconCompatParcelizer = this.write.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayoutIconCompatParcelizer);
            this.write.read.setText(remoteActionCompatParcelizer.IconCompatParcelizer());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean write(zzex.AudioAttributesCompatParcelizer p0) {
        return !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0.IconCompatParcelizer(), (Object) SessionDescription.SUPPORTED_SDP_VERSION) && p0.IconCompatParcelizer().length() > 0;
    }

    public final class AudioAttributesCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private final HlsMediaSource1 IconCompatParcelizer;
        private /* synthetic */ zzes read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(zzes zzesVar, HlsMediaSource1 hlsMediaSource1) {
            super(hlsMediaSource1.IconCompatParcelizer());
            toMagicModuleMetaRepoModel.write(hlsMediaSource1, "");
            this.read = zzesVar;
            this.IconCompatParcelizer = hlsMediaSource1;
        }

        public final void IconCompatParcelizer(zzex.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
            LinearLayout linearLayoutIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayoutIconCompatParcelizer);
            this.IconCompatParcelizer.RemoteActionCompatParcelizer.setText(audioAttributesCompatParcelizer.read());
            this.IconCompatParcelizer.read.setText(audioAttributesCompatParcelizer.IconCompatParcelizer());
            TextView textView = this.IconCompatParcelizer.read;
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            Context context = textView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            textView.setTextColor(shouldEscapeCharacter.Companion.read(context, R.attr.onBackgroundSurface2, new TypedValue(), true));
            this.itemView.setAlpha(1.0f);
            read(R.attr.onSurfaceBgDivider, BitmapDescriptorFactory.HUE_RED);
            if (zzes.write(audioAttributesCompatParcelizer)) {
                read(R.attr.colorSurfaceVariant9, 8.0f);
            }
            if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer()) {
                TextView textView2 = this.IconCompatParcelizer.read;
                shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
                Context context2 = textView2.getContext();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
                textView2.setTextColor(shouldEscapeCharacter.Companion.read(context2, R.attr.colorOnPrimary, new TypedValue(), true));
                read(R.attr.onSurfaceBlue, BitmapDescriptorFactory.HUE_RED);
            }
            if (audioAttributesCompatParcelizer.IconCompatParcelizer().length() == 0) {
                this.itemView.setAlpha(0.5f);
            }
        }

        public final void AudioAttributesCompatParcelizer() {
            View view = this.itemView;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void read(int i, float f) {
            CardView cardView = this.IconCompatParcelizer.AudioAttributesCompatParcelizer;
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            Context context = cardView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            cardView.setCardBackgroundColor(shouldEscapeCharacter.Companion.read(context, i, new TypedValue(), true));
            cardView.setCardElevation(f);
        }
    }
}
