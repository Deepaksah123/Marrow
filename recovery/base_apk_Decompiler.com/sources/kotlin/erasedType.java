package kotlin;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class erasedType {
    public boolean AudioAttributesCompatParcelizer;
    public boolean AudioAttributesImplBaseParcelizer;
    public int IconCompatParcelizer;
    public int MediaBrowserCompatItemReceiver;
    public int RemoteActionCompatParcelizer;
    public int read;
    public boolean AudioAttributesImplApi21Parcelizer = true;
    public int MediaBrowserCompatCustomActionResultReceiver = 0;
    public int write = 0;

    public final boolean read(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        int i = this.read;
        return i >= 0 && i < mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read();
    }

    public final View RemoteActionCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat) {
        View viewRemoteActionCompatParcelizer = mediaDescriptionCompat.RemoteActionCompatParcelizer(this.read);
        this.read += this.IconCompatParcelizer;
        return viewRemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", mCurrentPosition=");
        sb.append(this.read);
        sb.append(", mItemDirection=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", mLayoutDirection=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", mStartLine=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", mEndLine=");
        sb.append(this.write);
        sb.append('}');
        return sb.toString();
    }
}
