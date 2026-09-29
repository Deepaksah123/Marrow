package kotlin;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class getCurrentTimeline extends RecyclerView.AudioAttributesImplBaseParcelizer {
    private boolean AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private boolean RemoteActionCompatParcelizer;
    private boolean read;
    private boolean write;

    public getCurrentTimeline() {
        this((byte) 0);
    }

    private getCurrentTimeline(byte b) {
        IconCompatParcelizer(0);
    }

    public final void IconCompatParcelizer(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
    }

    public final int read() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplBaseParcelizer
    public final void IconCompatParcelizer(Rect rect, View view, RecyclerView recyclerView, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        rect.setEmpty();
        int iMediaBrowserCompatItemReceiver = RecyclerView.MediaBrowserCompatItemReceiver(view);
        if (iMediaBrowserCompatItemReceiver == -1) {
            return;
        }
        RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = recyclerView.AudioAttributesImplApi21Parcelizer();
        RemoteActionCompatParcelizer(recyclerView, iMediaBrowserCompatItemReceiver, mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer);
        boolean zIconCompatParcelizer = IconCompatParcelizer();
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        boolean zWrite = write();
        if (!AudioAttributesCompatParcelizer(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer, this.write)) {
            zRemoteActionCompatParcelizer = zIconCompatParcelizer;
            zIconCompatParcelizer = zRemoteActionCompatParcelizer;
        } else if (!this.write) {
            zRemoteActionCompatParcelizer = zIconCompatParcelizer;
            zIconCompatParcelizer = zRemoteActionCompatParcelizer;
            zWrite = zAudioAttributesCompatParcelizer;
            zAudioAttributesCompatParcelizer = zWrite;
        }
        int i = this.MediaBrowserCompatCustomActionResultReceiver / 2;
        rect.right = zIconCompatParcelizer ? i : 0;
        rect.left = zRemoteActionCompatParcelizer ? i : 0;
        rect.top = zAudioAttributesCompatParcelizer ? i : 0;
        if (!zWrite) {
            i = 0;
        }
        rect.bottom = i;
    }

    private void RemoteActionCompatParcelizer(RecyclerView recyclerView, int i, RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        int itemCount = recyclerView.IconCompatParcelizer().getItemCount();
        this.read = i == 0;
        this.AudioAttributesImplBaseParcelizer = i == itemCount + (-1);
        this.write = mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer();
        this.MediaBrowserCompatItemReceiver = mediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer();
        boolean z = mediaBrowserCompatItemReceiver instanceof GridLayoutManager;
        this.AudioAttributesCompatParcelizer = z;
        if (z) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) mediaBrowserCompatItemReceiver;
            GridLayoutManager.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = gridLayoutManager.AudioAttributesCompatParcelizer();
            int iIconCompatParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer(i);
            int iIconCompatParcelizer2 = gridLayoutManager.IconCompatParcelizer();
            int iWrite = iconCompatParcelizerAudioAttributesCompatParcelizer.write(i, iIconCompatParcelizer2);
            this.RemoteActionCompatParcelizer = iWrite == 0;
            this.IconCompatParcelizer = iWrite + iIconCompatParcelizer == iIconCompatParcelizer2;
            boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i, iconCompatParcelizerAudioAttributesCompatParcelizer, iIconCompatParcelizer2);
            this.AudioAttributesImplApi21Parcelizer = zRemoteActionCompatParcelizer;
            this.AudioAttributesImplApi26Parcelizer = !zRemoteActionCompatParcelizer && AudioAttributesCompatParcelizer(i, itemCount, iconCompatParcelizerAudioAttributesCompatParcelizer, iIconCompatParcelizer2);
        }
    }

    private static boolean AudioAttributesCompatParcelizer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, boolean z) {
        boolean z2 = (mediaBrowserCompatItemReceiver instanceof LinearLayoutManager) && ((LinearLayoutManager) mediaBrowserCompatItemReceiver).MediaDescriptionCompat();
        return (z && (mediaBrowserCompatItemReceiver.onPlayFromSearch() == 1)) ? !z2 : z2;
    }

    private boolean write() {
        return this.AudioAttributesCompatParcelizer ? (this.write && !this.IconCompatParcelizer) || (this.MediaBrowserCompatItemReceiver && !this.AudioAttributesImplApi26Parcelizer) : this.MediaBrowserCompatItemReceiver && !this.AudioAttributesImplBaseParcelizer;
    }

    private boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer ? (this.write && !this.RemoteActionCompatParcelizer) || (this.MediaBrowserCompatItemReceiver && !this.AudioAttributesImplApi21Parcelizer) : this.MediaBrowserCompatItemReceiver && !this.read;
    }

    private boolean RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer ? (this.write && !this.AudioAttributesImplApi26Parcelizer) || (this.MediaBrowserCompatItemReceiver && !this.IconCompatParcelizer) : this.write && !this.AudioAttributesImplBaseParcelizer;
    }

    private boolean IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer ? (this.write && !this.AudioAttributesImplApi21Parcelizer) || (this.MediaBrowserCompatItemReceiver && !this.RemoteActionCompatParcelizer) : this.write && !this.read;
    }

    private static boolean RemoteActionCompatParcelizer(int i, GridLayoutManager.IconCompatParcelizer iconCompatParcelizer, int i2) {
        int iIconCompatParcelizer = 0;
        for (int i3 = 0; i3 <= i; i3++) {
            iIconCompatParcelizer += iconCompatParcelizer.IconCompatParcelizer(i3);
            if (iIconCompatParcelizer > i2) {
                return false;
            }
        }
        return true;
    }

    private static boolean AudioAttributesCompatParcelizer(int i, int i2, GridLayoutManager.IconCompatParcelizer iconCompatParcelizer, int i3) {
        int iIconCompatParcelizer = 0;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            iIconCompatParcelizer += iconCompatParcelizer.IconCompatParcelizer(i4);
            if (iIconCompatParcelizer > i3) {
                return false;
            }
        }
        return true;
    }
}
