package kotlin;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.ViewHolderState;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class getMaxSeekToPreviousPosition extends RecyclerView.onMediaButtonEvent {
    private List<Object> AudioAttributesCompatParcelizer;
    private getCurrentPeriodIndex IconCompatParcelizer;
    private ViewParent RemoteActionCompatParcelizer;
    private getCurrentTracks read;
    private ViewHolderState.ViewState write;

    public getMaxSeekToPreviousPosition(ViewParent viewParent, View view, boolean z) {
        super(view);
        this.RemoteActionCompatParcelizer = viewParent;
        if (z) {
            ViewHolderState.ViewState viewState = new ViewHolderState.ViewState();
            this.write = viewState;
            viewState.read(this.itemView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void RemoteActionCompatParcelizer(getCurrentPeriodIndex getcurrentperiodindex, getCurrentPeriodIndex<?> getcurrentperiodindex2, List<Object> list, int i) {
        this.AudioAttributesCompatParcelizer = list;
        if (this.read == null && (getcurrentperiodindex instanceof getMediaMetadata)) {
            getCurrentTracks getcurrenttracksRatingCompat = ((getMediaMetadata) getcurrentperiodindex).RatingCompat();
            this.read = getcurrenttracksRatingCompat;
            getcurrenttracksRatingCompat.read(this.itemView);
        }
        this.RemoteActionCompatParcelizer = null;
        boolean z = getcurrentperiodindex instanceof getPlayWhenReady;
        if (z) {
            ((getPlayWhenReady) getcurrentperiodindex).read(RemoteActionCompatParcelizer(), i);
        }
        if (getcurrentperiodindex2 != null) {
            getcurrentperiodindex.write(RemoteActionCompatParcelizer(), getcurrentperiodindex2);
        } else if (list.isEmpty()) {
            getcurrentperiodindex.read(RemoteActionCompatParcelizer());
        } else {
            getcurrentperiodindex.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(), list);
        }
        if (z) {
            ((getPlayWhenReady) getcurrentperiodindex).IconCompatParcelizer(RemoteActionCompatParcelizer(), i);
        }
        this.IconCompatParcelizer = getcurrentperiodindex;
    }

    final Object RemoteActionCompatParcelizer() {
        getCurrentTracks getcurrenttracks = this.read;
        return getcurrenttracks != null ? getcurrenttracks : this.itemView;
    }

    public final void read() {
        IconCompatParcelizer();
        RemoteActionCompatParcelizer();
        this.IconCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer = null;
    }

    public final getCurrentPeriodIndex<?> write() {
        IconCompatParcelizer();
        return this.IconCompatParcelizer;
    }

    private void IconCompatParcelizer() {
        if (this.IconCompatParcelizer == null) {
            throw new IllegalStateException("This holder is not currently bound.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.onMediaButtonEvent
    public String toString() {
        StringBuilder sb = new StringBuilder("EpoxyViewHolder{epoxyModel=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", view=");
        sb.append(this.itemView);
        sb.append(", super=");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
