package kotlin;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import java.util.ArrayList;
import kotlin.RendererCapabilitiesAdaptiveSupport;

/* JADX INFO: loaded from: classes2.dex */
final class access3500 extends RecyclerView.IconCompatParcelizer {
    private SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 AudioAttributesCompatParcelizer;
    private ArrayList<CTInboxMessage> RemoteActionCompatParcelizer;

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return write(viewGroup, i);
    }

    access3500(ArrayList<CTInboxMessage> arrayList, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0) {
        RendererWakeupListener.MediaMetadataCompat();
        this.RemoteActionCompatParcelizer = arrayList;
        this.AudioAttributesCompatParcelizer = simpleBasePlayerPositionSupplierExternalSyntheticLambda0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.RemoteActionCompatParcelizer.size();
    }

    /* JADX INFO: renamed from: o.access3500$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[setAdBufferedPositionMs.values().length];
            AudioAttributesCompatParcelizer = iArr;
            try {
                iArr[setAdBufferedPositionMs.SimpleMessage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AudioAttributesCompatParcelizer[setAdBufferedPositionMs.IconMessage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AudioAttributesCompatParcelizer[setAdBufferedPositionMs.CarouselMessage.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AudioAttributesCompatParcelizer[setAdBufferedPositionMs.CarouselImageMessage.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemViewType(int i) {
        int i2 = AnonymousClass5.AudioAttributesCompatParcelizer[this.RemoteActionCompatParcelizer.get(i).AudioAttributesImplBaseParcelizer().ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 != 3) {
            return i2 != 4 ? -1 : 3;
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void onBindViewHolder(RecyclerView.onMediaButtonEvent onmediabuttonevent, int i) {
        ((SimpleBasePlayerPlaylistTimeline) onmediabuttonevent).write(this.RemoteActionCompatParcelizer.get(i), this.AudioAttributesCompatParcelizer, i);
    }

    private static SimpleBasePlayerPlaylistTimeline write(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new access3600(LayoutInflater.from(viewGroup.getContext()).inflate(RendererCapabilitiesAdaptiveSupport.IconCompatParcelizer.inbox_simple_message_layout, viewGroup, false));
        }
        if (i == 1) {
            return new access6800(LayoutInflater.from(viewGroup.getContext()).inflate(RendererCapabilitiesAdaptiveSupport.IconCompatParcelizer.inbox_icon_message_layout, viewGroup, false));
        }
        if (i == 2) {
            return new SimpleBasePlayerPeriodDataBuilder(LayoutInflater.from(viewGroup.getContext()).inflate(RendererCapabilitiesAdaptiveSupport.IconCompatParcelizer.inbox_carousel_text_layout, viewGroup, false));
        }
        if (i != 3) {
            return null;
        }
        return new access6600(LayoutInflater.from(viewGroup.getContext()).inflate(RendererCapabilitiesAdaptiveSupport.IconCompatParcelizer.inbox_carousel_layout, viewGroup, false));
    }
}
