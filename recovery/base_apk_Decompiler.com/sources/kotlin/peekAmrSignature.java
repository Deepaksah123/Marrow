package kotlin;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
final class peekAmrSignature extends readAmrHeader {
    private boolean AudioAttributesImplApi21Parcelizer = false;
    private float MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;

    peekAmrSignature(View view) {
        write(view);
    }

    @Override // kotlin.readAmrHeader
    final boolean RemoteActionCompatParcelizer() {
        return !this.AudioAttributesImplApi21Parcelizer || this.read;
    }

    @Override // kotlin.readAmrHeader
    final void read(View view) {
        this.MediaBrowserCompatCustomActionResultReceiver = AudioAttributesCompatParcelizer();
        this.AudioAttributesImplApi21Parcelizer = read() || write();
        view.setClipToOutline(!RemoteActionCompatParcelizer());
        if (RemoteActionCompatParcelizer()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    private float AudioAttributesCompatParcelizer() {
        return (this.write == null || this.AudioAttributesCompatParcelizer == null) ? BitmapDescriptorFactory.HUE_RED : this.write.MediaMetadataCompat.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    private boolean read() {
        if (this.AudioAttributesCompatParcelizer.isEmpty() || this.write == null) {
            return false;
        }
        return this.write.read(this.AudioAttributesCompatParcelizer);
    }

    private boolean write() {
        if (this.AudioAttributesCompatParcelizer.isEmpty() || this.write == null || !this.IconCompatParcelizer || this.write.read(this.AudioAttributesCompatParcelizer) || !RemoteActionCompatParcelizer(this.write)) {
            return false;
        }
        float fIconCompatParcelizer = this.write.MediaBrowserCompatSearchResultReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        float fIconCompatParcelizer2 = this.write.MediaMetadataCompat().IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        float fIconCompatParcelizer3 = this.write.read().IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        float fIconCompatParcelizer4 = this.write.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        if (fIconCompatParcelizer == BitmapDescriptorFactory.HUE_RED && fIconCompatParcelizer3 == BitmapDescriptorFactory.HUE_RED && fIconCompatParcelizer2 == fIconCompatParcelizer4) {
            this.AudioAttributesCompatParcelizer.set(this.AudioAttributesCompatParcelizer.left - fIconCompatParcelizer2, this.AudioAttributesCompatParcelizer.top, this.AudioAttributesCompatParcelizer.right, this.AudioAttributesCompatParcelizer.bottom);
            this.MediaBrowserCompatCustomActionResultReceiver = fIconCompatParcelizer2;
            return true;
        }
        if (fIconCompatParcelizer == BitmapDescriptorFactory.HUE_RED && fIconCompatParcelizer2 == BitmapDescriptorFactory.HUE_RED && fIconCompatParcelizer3 == fIconCompatParcelizer4) {
            this.AudioAttributesCompatParcelizer.set(this.AudioAttributesCompatParcelizer.left, this.AudioAttributesCompatParcelizer.top - fIconCompatParcelizer3, this.AudioAttributesCompatParcelizer.right, this.AudioAttributesCompatParcelizer.bottom);
            this.MediaBrowserCompatCustomActionResultReceiver = fIconCompatParcelizer3;
            return true;
        }
        if (fIconCompatParcelizer2 == BitmapDescriptorFactory.HUE_RED && fIconCompatParcelizer4 == BitmapDescriptorFactory.HUE_RED && fIconCompatParcelizer == fIconCompatParcelizer3) {
            this.AudioAttributesCompatParcelizer.set(this.AudioAttributesCompatParcelizer.left, this.AudioAttributesCompatParcelizer.top, this.AudioAttributesCompatParcelizer.right + fIconCompatParcelizer, this.AudioAttributesCompatParcelizer.bottom);
            this.MediaBrowserCompatCustomActionResultReceiver = fIconCompatParcelizer;
            return true;
        }
        if (fIconCompatParcelizer3 != BitmapDescriptorFactory.HUE_RED || fIconCompatParcelizer4 != BitmapDescriptorFactory.HUE_RED || fIconCompatParcelizer != fIconCompatParcelizer2) {
            return false;
        }
        this.AudioAttributesCompatParcelizer.set(this.AudioAttributesCompatParcelizer.left, this.AudioAttributesCompatParcelizer.top, this.AudioAttributesCompatParcelizer.right, this.AudioAttributesCompatParcelizer.bottom + fIconCompatParcelizer);
        this.MediaBrowserCompatCustomActionResultReceiver = fIconCompatParcelizer;
        return true;
    }

    private static boolean RemoteActionCompatParcelizer(isValidFrameType isvalidframetype) {
        return (isvalidframetype.AudioAttributesImplApi26Parcelizer() instanceof isWideBandValidFrameType) && (isvalidframetype.RatingCompat() instanceof isWideBandValidFrameType) && (isvalidframetype.write() instanceof isWideBandValidFrameType) && (isvalidframetype.AudioAttributesCompatParcelizer() instanceof isWideBandValidFrameType);
    }

    private void write(View view) {
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: o.peekAmrSignature.2
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                if (peekAmrSignature.this.write == null || peekAmrSignature.this.AudioAttributesCompatParcelizer.isEmpty()) {
                    return;
                }
                outline.setRoundRect((int) peekAmrSignature.this.AudioAttributesCompatParcelizer.left, (int) peekAmrSignature.this.AudioAttributesCompatParcelizer.top, (int) peekAmrSignature.this.AudioAttributesCompatParcelizer.right, (int) peekAmrSignature.this.AudioAttributesCompatParcelizer.bottom, peekAmrSignature.this.MediaBrowserCompatCustomActionResultReceiver);
            }
        });
    }
}
