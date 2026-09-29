package kotlin;

import android.graphics.Matrix;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\t\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0010¢\u0006\u0004\b\u000f\u0010\u0011J\u001d\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0010¢\u0006\u0004\b\u000b\u0010\u0011R&\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0019"}, d2 = {"Lo/contentAs;", "T", "", "", "IconCompatParcelizer", "()V", "RemoteActionCompatParcelizer", "p0", "Lo/resetWithShared;", "read", "(Ljava/lang/Object;)[F", "write", "Lo/getType;", "p1", "(Ljava/lang/Object;Lo/getType;)V", "AudioAttributesCompatParcelizer", "Lo/getReferencedType;", "(Ljava/lang/Object;J)J", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "Lo/MagicModuleSubmissionRequestBody;", "Landroid/graphics/Matrix;", "MediaBrowserCompatItemReceiver", "[F", "", "Z", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class contentAs<T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private float[] write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi21Parcelizer;
    private final MagicModuleSubmissionRequestBody<T, Matrix, getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private float[] AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private Matrix RemoteActionCompatParcelizer;

    public final void IconCompatParcelizer() {
        this.read = false;
        this.AudioAttributesImplApi26Parcelizer = false;
        this.AudioAttributesImplBaseParcelizer = true;
        this.AudioAttributesImplApi21Parcelizer = true;
        resetWithShared.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
        resetWithShared.RemoteActionCompatParcelizer(this.write);
    }

    public final void RemoteActionCompatParcelizer() {
        this.read = true;
        this.AudioAttributesImplApi26Parcelizer = true;
    }

    public final float[] read(T p0) {
        float[] fArr = this.AudioAttributesCompatParcelizer;
        if (!this.read) {
            return fArr;
        }
        Matrix matrix = this.RemoteActionCompatParcelizer;
        if (matrix == null) {
            matrix = new Matrix();
            this.RemoteActionCompatParcelizer = matrix;
        }
        this.IconCompatParcelizer.invoke(p0, matrix);
        appendThreeBytes.AudioAttributesCompatParcelizer(fArr, matrix);
        this.read = false;
        this.AudioAttributesImplBaseParcelizer = getTextBuffer.write(fArr);
        return fArr;
    }

    public final float[] write(T p0) {
        float[] fArr = this.write;
        if (this.AudioAttributesImplApi26Parcelizer) {
            this.AudioAttributesImplApi21Parcelizer = contentConverter.AudioAttributesCompatParcelizer(read(p0), fArr);
            this.AudioAttributesImplApi26Parcelizer = false;
        }
        if (this.AudioAttributesImplApi21Parcelizer) {
            return fArr;
        }
        return null;
    }

    public final void read(T p0, getType p1) {
        float[] fArr = read(p0);
        if (this.AudioAttributesImplBaseParcelizer) {
            return;
        }
        resetWithShared.write(fArr, p1);
    }

    public final void AudioAttributesCompatParcelizer(T p0, getType p1) {
        float[] fArrWrite = write(p0);
        if (fArrWrite == null) {
            p1.AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        } else {
            if (this.AudioAttributesImplBaseParcelizer) {
                return;
            }
            resetWithShared.write(fArrWrite, p1);
        }
    }

    public final long AudioAttributesCompatParcelizer(T p0, long p1) {
        return !this.AudioAttributesImplBaseParcelizer ? resetWithShared.AudioAttributesCompatParcelizer(read(p0), p1) : p1;
    }

    public final long write(T p0, long p1) {
        float[] fArrWrite = write(p0);
        if (fArrWrite == null) {
            return getReferencedType.INSTANCE.RemoteActionCompatParcelizer();
        }
        return !this.AudioAttributesImplBaseParcelizer ? resetWithShared.AudioAttributesCompatParcelizer(fArrWrite, p1) : p1;
    }
}
