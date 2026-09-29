package kotlin;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public class UByteSerializer extends serializeOzbTUA {
    private UIntDeserializer RemoteActionCompatParcelizer;
    private UIntDeserializer write;

    @Override // kotlin.serializeOzbTUA
    public final int[] write(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, View view) {
        int[] iArr = new int[2];
        if (mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer()) {
            iArr[0] = AudioAttributesCompatParcelizer(view, IconCompatParcelizer(mediaBrowserCompatItemReceiver));
        } else {
            iArr[0] = 0;
        }
        if (mediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer()) {
            iArr[1] = AudioAttributesCompatParcelizer(view, RemoteActionCompatParcelizer(mediaBrowserCompatItemReceiver));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // kotlin.serializeOzbTUA
    public View AudioAttributesCompatParcelizer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        if (mediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer()) {
            return RemoteActionCompatParcelizer(mediaBrowserCompatItemReceiver, RemoteActionCompatParcelizer(mediaBrowserCompatItemReceiver));
        }
        if (mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer()) {
            return RemoteActionCompatParcelizer(mediaBrowserCompatItemReceiver, IconCompatParcelizer(mediaBrowserCompatItemReceiver));
        }
        return null;
    }

    @Override // kotlin.serializeOzbTUA
    public final int AudioAttributesCompatParcelizer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, int i, int i2) {
        UIntDeserializer uIntDeserializerWrite;
        int iOnPrepareFromMediaId = mediaBrowserCompatItemReceiver.onPrepareFromMediaId();
        if (iOnPrepareFromMediaId == 0 || (uIntDeserializerWrite = write(mediaBrowserCompatItemReceiver)) == null) {
            return -1;
        }
        int iOnPlay = mediaBrowserCompatItemReceiver.onPlay();
        View view = null;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < iOnPlay; i5++) {
            View viewMediaBrowserCompatCustomActionResultReceiver = mediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver(i5);
            if (viewMediaBrowserCompatCustomActionResultReceiver != null) {
                int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver, uIntDeserializerWrite);
                if (iAudioAttributesCompatParcelizer <= 0 && iAudioAttributesCompatParcelizer > i3) {
                    view2 = viewMediaBrowserCompatCustomActionResultReceiver;
                    i3 = iAudioAttributesCompatParcelizer;
                }
                if (iAudioAttributesCompatParcelizer >= 0 && iAudioAttributesCompatParcelizer < i4) {
                    view = viewMediaBrowserCompatCustomActionResultReceiver;
                    i4 = iAudioAttributesCompatParcelizer;
                }
            }
        }
        boolean z = read(mediaBrowserCompatItemReceiver, i, i2);
        if (z && view != null) {
            return RecyclerView.MediaBrowserCompatItemReceiver.MediaDescriptionCompat(view);
        }
        if (!z && view2 != null) {
            return RecyclerView.MediaBrowserCompatItemReceiver.MediaDescriptionCompat(view2);
        }
        if (z) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iMediaDescriptionCompat = RecyclerView.MediaBrowserCompatItemReceiver.MediaDescriptionCompat(view) + (AudioAttributesImplBaseParcelizer(mediaBrowserCompatItemReceiver) == z ? -1 : 1);
        if (iMediaDescriptionCompat < 0 || iMediaDescriptionCompat >= iOnPrepareFromMediaId) {
            return -1;
        }
        return iMediaDescriptionCompat;
    }

    private static boolean read(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, int i, int i2) {
        return mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer() ? i > 0 : i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean AudioAttributesImplBaseParcelizer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        PointF pointFRemoteActionCompatParcelizer;
        int iOnPrepareFromMediaId = mediaBrowserCompatItemReceiver.onPrepareFromMediaId();
        if (!(mediaBrowserCompatItemReceiver instanceof RecyclerView.onCustomAction.RemoteActionCompatParcelizer) || (pointFRemoteActionCompatParcelizer = ((RecyclerView.onCustomAction.RemoteActionCompatParcelizer) mediaBrowserCompatItemReceiver).RemoteActionCompatParcelizer(iOnPrepareFromMediaId - 1)) == null) {
            return false;
        }
        return pointFRemoteActionCompatParcelizer.x < BitmapDescriptorFactory.HUE_RED || pointFRemoteActionCompatParcelizer.y < BitmapDescriptorFactory.HUE_RED;
    }

    @Override // kotlin.serializeOzbTUA
    protected final RecyclerView.onCustomAction read(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        if (mediaBrowserCompatItemReceiver instanceof RecyclerView.onCustomAction.RemoteActionCompatParcelizer) {
            return new deserializeKeylj4SQcc(this.AudioAttributesCompatParcelizer.getContext()) { // from class: o.UByteSerializer.2
                @Override // kotlin.deserializeKeylj4SQcc, androidx.recyclerview.widget.RecyclerView.onCustomAction
                public final void IconCompatParcelizer(View view, RecyclerView.onCustomAction.write writeVar) {
                    UByteSerializer uByteSerializer = UByteSerializer.this;
                    int[] iArrWrite = uByteSerializer.write(uByteSerializer.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(), view);
                    int i = iArrWrite[0];
                    int i2 = iArrWrite[1];
                    int iWrite = write(Math.max(Math.abs(i), Math.abs(i2)));
                    if (iWrite > 0) {
                        writeVar.IconCompatParcelizer(i, i2, iWrite, ((deserializeKeylj4SQcc) this).write);
                    }
                }

                @Override // kotlin.deserializeKeylj4SQcc
                protected final float AudioAttributesCompatParcelizer(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // kotlin.deserializeKeylj4SQcc
                protected final int IconCompatParcelizer(int i) {
                    return Math.min(100, super.IconCompatParcelizer(i));
                }
            };
        }
        return null;
    }

    private static int AudioAttributesCompatParcelizer(View view, UIntDeserializer uIntDeserializer) {
        return (uIntDeserializer.AudioAttributesCompatParcelizer(view) + (uIntDeserializer.RemoteActionCompatParcelizer(view) / 2)) - (uIntDeserializer.AudioAttributesImplApi21Parcelizer() + (uIntDeserializer.MediaBrowserCompatItemReceiver() / 2));
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

    private UIntDeserializer write(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        if (mediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer()) {
            return RemoteActionCompatParcelizer(mediaBrowserCompatItemReceiver);
        }
        if (mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer()) {
            return IconCompatParcelizer(mediaBrowserCompatItemReceiver);
        }
        return null;
    }

    private UIntDeserializer RemoteActionCompatParcelizer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        UIntDeserializer uIntDeserializer = this.RemoteActionCompatParcelizer;
        if (uIntDeserializer == null || uIntDeserializer.RemoteActionCompatParcelizer != mediaBrowserCompatItemReceiver) {
            this.RemoteActionCompatParcelizer = UIntDeserializer.AudioAttributesCompatParcelizer(mediaBrowserCompatItemReceiver);
        }
        return this.RemoteActionCompatParcelizer;
    }

    private UIntDeserializer IconCompatParcelizer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        UIntDeserializer uIntDeserializer = this.write;
        if (uIntDeserializer == null || uIntDeserializer.RemoteActionCompatParcelizer != mediaBrowserCompatItemReceiver) {
            this.write = UIntDeserializer.IconCompatParcelizer(mediaBrowserCompatItemReceiver);
        }
        return this.write;
    }
}
