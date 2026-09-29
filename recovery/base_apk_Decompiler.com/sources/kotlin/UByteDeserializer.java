package kotlin;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class UByteDeserializer extends serializeOzbTUA {
    private UIntDeserializer IconCompatParcelizer;
    private UIntDeserializer read;

    @Override // kotlin.serializeOzbTUA
    public final int[] write(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, View view) {
        int[] iArr = new int[2];
        if (mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer()) {
            iArr[0] = RemoteActionCompatParcelizer(view, IconCompatParcelizer(mediaBrowserCompatItemReceiver));
        } else {
            iArr[0] = 0;
        }
        if (mediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer()) {
            iArr[1] = RemoteActionCompatParcelizer(view, RemoteActionCompatParcelizer(mediaBrowserCompatItemReceiver));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.serializeOzbTUA
    public final int AudioAttributesCompatParcelizer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, int i, int i2) {
        int iOnPrepareFromMediaId;
        View viewAudioAttributesCompatParcelizer;
        int iMediaDescriptionCompat;
        int i3;
        PointF pointFRemoteActionCompatParcelizer;
        int iAudioAttributesCompatParcelizer;
        int iAudioAttributesCompatParcelizer2;
        if (!(mediaBrowserCompatItemReceiver instanceof RecyclerView.onCustomAction.RemoteActionCompatParcelizer) || (iOnPrepareFromMediaId = mediaBrowserCompatItemReceiver.onPrepareFromMediaId()) == 0 || (viewAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(mediaBrowserCompatItemReceiver)) == null || (iMediaDescriptionCompat = RecyclerView.MediaBrowserCompatItemReceiver.MediaDescriptionCompat(viewAudioAttributesCompatParcelizer)) == -1 || (pointFRemoteActionCompatParcelizer = ((RecyclerView.onCustomAction.RemoteActionCompatParcelizer) mediaBrowserCompatItemReceiver).RemoteActionCompatParcelizer(iOnPrepareFromMediaId - 1)) == null) {
            return -1;
        }
        if (mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer()) {
            iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(mediaBrowserCompatItemReceiver, IconCompatParcelizer(mediaBrowserCompatItemReceiver), i, 0);
            if (pointFRemoteActionCompatParcelizer.x < BitmapDescriptorFactory.HUE_RED) {
                iAudioAttributesCompatParcelizer = -iAudioAttributesCompatParcelizer;
            }
        } else {
            iAudioAttributesCompatParcelizer = 0;
        }
        if (mediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer()) {
            iAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(mediaBrowserCompatItemReceiver, RemoteActionCompatParcelizer(mediaBrowserCompatItemReceiver), 0, i2);
            if (pointFRemoteActionCompatParcelizer.y < BitmapDescriptorFactory.HUE_RED) {
                iAudioAttributesCompatParcelizer2 = -iAudioAttributesCompatParcelizer2;
            }
        } else {
            iAudioAttributesCompatParcelizer2 = 0;
        }
        if (mediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer()) {
            iAudioAttributesCompatParcelizer = iAudioAttributesCompatParcelizer2;
        }
        if (iAudioAttributesCompatParcelizer == 0) {
            return -1;
        }
        int i4 = iMediaDescriptionCompat + iAudioAttributesCompatParcelizer;
        int i5 = i4 >= 0 ? i4 : 0;
        return i5 >= iOnPrepareFromMediaId ? i3 : i5;
    }

    @Override // kotlin.serializeOzbTUA
    public final View AudioAttributesCompatParcelizer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        if (mediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer()) {
            return RemoteActionCompatParcelizer(mediaBrowserCompatItemReceiver, RemoteActionCompatParcelizer(mediaBrowserCompatItemReceiver));
        }
        if (mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer()) {
            return RemoteActionCompatParcelizer(mediaBrowserCompatItemReceiver, IconCompatParcelizer(mediaBrowserCompatItemReceiver));
        }
        return null;
    }

    private static int RemoteActionCompatParcelizer(View view, UIntDeserializer uIntDeserializer) {
        return (uIntDeserializer.AudioAttributesCompatParcelizer(view) + (uIntDeserializer.RemoteActionCompatParcelizer(view) / 2)) - (uIntDeserializer.AudioAttributesImplApi21Parcelizer() + (uIntDeserializer.MediaBrowserCompatItemReceiver() / 2));
    }

    private int AudioAttributesCompatParcelizer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, UIntDeserializer uIntDeserializer, int i, int i2) {
        int[] iArrIconCompatParcelizer = IconCompatParcelizer(i, i2);
        float f = read(mediaBrowserCompatItemReceiver, uIntDeserializer);
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        return Math.round((Math.abs(iArrIconCompatParcelizer[0]) > Math.abs(iArrIconCompatParcelizer[1]) ? iArrIconCompatParcelizer[0] : iArrIconCompatParcelizer[1]) / f);
    }

    private static View RemoteActionCompatParcelizer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, UIntDeserializer uIntDeserializer) {
        int iOnPlay = mediaBrowserCompatItemReceiver.onPlay();
        View view = null;
        if (iOnPlay == 0) {
            return null;
        }
        int iAudioAttributesImplApi21Parcelizer = uIntDeserializer.AudioAttributesImplApi21Parcelizer();
        int iMediaBrowserCompatItemReceiver = uIntDeserializer.MediaBrowserCompatItemReceiver() / 2;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iOnPlay; i2++) {
            View viewMediaBrowserCompatCustomActionResultReceiver = mediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver(i2);
            int iAbs = Math.abs((uIntDeserializer.AudioAttributesCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver) + (uIntDeserializer.RemoteActionCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver) / 2)) - (iAudioAttributesImplApi21Parcelizer + iMediaBrowserCompatItemReceiver));
            if (iAbs < i) {
                view = viewMediaBrowserCompatCustomActionResultReceiver;
                i = iAbs;
            }
        }
        return view;
    }

    private static float read(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, UIntDeserializer uIntDeserializer) {
        int iOnPlay = mediaBrowserCompatItemReceiver.onPlay();
        if (iOnPlay == 0) {
            return 1.0f;
        }
        View view = null;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i3 = 0; i3 < iOnPlay; i3++) {
            View viewMediaBrowserCompatCustomActionResultReceiver = mediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver(i3);
            int iMediaDescriptionCompat = RecyclerView.MediaBrowserCompatItemReceiver.MediaDescriptionCompat(viewMediaBrowserCompatCustomActionResultReceiver);
            if (iMediaDescriptionCompat != -1) {
                if (iMediaDescriptionCompat < i) {
                    view = viewMediaBrowserCompatCustomActionResultReceiver;
                    i = iMediaDescriptionCompat;
                }
                if (iMediaDescriptionCompat > i2) {
                    view2 = viewMediaBrowserCompatCustomActionResultReceiver;
                    i2 = iMediaDescriptionCompat;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int iMax = Math.max(uIntDeserializer.IconCompatParcelizer(view), uIntDeserializer.IconCompatParcelizer(view2)) - Math.min(uIntDeserializer.AudioAttributesCompatParcelizer(view), uIntDeserializer.AudioAttributesCompatParcelizer(view2));
        if (iMax == 0) {
            return 1.0f;
        }
        return iMax / ((i2 - i) + 1);
    }

    private UIntDeserializer RemoteActionCompatParcelizer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        UIntDeserializer uIntDeserializer = this.read;
        if (uIntDeserializer == null || uIntDeserializer.RemoteActionCompatParcelizer != mediaBrowserCompatItemReceiver) {
            this.read = UIntDeserializer.AudioAttributesCompatParcelizer(mediaBrowserCompatItemReceiver);
        }
        return this.read;
    }

    private UIntDeserializer IconCompatParcelizer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        UIntDeserializer uIntDeserializer = this.IconCompatParcelizer;
        if (uIntDeserializer == null || uIntDeserializer.RemoteActionCompatParcelizer != mediaBrowserCompatItemReceiver) {
            this.IconCompatParcelizer = UIntDeserializer.IconCompatParcelizer(mediaBrowserCompatItemReceiver);
        }
        return this.IconCompatParcelizer;
    }
}
