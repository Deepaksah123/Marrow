package kotlin;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ReflectionCache {
    static final IconCompatParcelizer write = new IconCompatParcelizer() { // from class: o.ReflectionCache.5
        @Override // o.ReflectionCache.IconCompatParcelizer
        public final boolean write(float[] fArr) {
            return (IconCompatParcelizer(fArr) || read(fArr) || AudioAttributesCompatParcelizer(fArr)) ? false : true;
        }

        private static boolean read(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        private static boolean IconCompatParcelizer(float[] fArr) {
            return fArr[2] >= 0.95f;
        }

        private static boolean AudioAttributesCompatParcelizer(float[] fArr) {
            float f = fArr[0];
            return f >= 10.0f && f <= 37.0f && fArr[1] <= 0.82f;
        }
    };
    private final List<read> AudioAttributesCompatParcelizer;
    private final List<checkConstructorIsCreatorAnnotated> RemoteActionCompatParcelizer;
    private final SparseBooleanArray MediaBrowserCompatItemReceiver = new SparseBooleanArray();
    private final Map<checkConstructorIsCreatorAnnotated, read> read = new setTitleOptional();
    private final read IconCompatParcelizer = IconCompatParcelizer();

    public interface IconCompatParcelizer {
        boolean write(float[] fArr);
    }

    ReflectionCache(List<read> list, List<checkConstructorIsCreatorAnnotated> list2) {
        this.AudioAttributesCompatParcelizer = list;
        this.RemoteActionCompatParcelizer = list2;
    }

    public final List<read> write() {
        return Collections.unmodifiableList(this.AudioAttributesCompatParcelizer);
    }

    final void AudioAttributesCompatParcelizer() {
        int size = this.RemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            checkConstructorIsCreatorAnnotated checkconstructoriscreatorannotated = this.RemoteActionCompatParcelizer.get(i);
            checkconstructoriscreatorannotated.RatingCompat();
            this.read.put(checkconstructoriscreatorannotated, write(checkconstructoriscreatorannotated));
        }
        this.MediaBrowserCompatItemReceiver.clear();
    }

    private read write(checkConstructorIsCreatorAnnotated checkconstructoriscreatorannotated) {
        read readVarIconCompatParcelizer = IconCompatParcelizer(checkconstructoriscreatorannotated);
        if (readVarIconCompatParcelizer != null && checkconstructoriscreatorannotated.AudioAttributesImplApi21Parcelizer()) {
            this.MediaBrowserCompatItemReceiver.append(readVarIconCompatParcelizer.AudioAttributesCompatParcelizer(), true);
        }
        return readVarIconCompatParcelizer;
    }

    private read IconCompatParcelizer(checkConstructorIsCreatorAnnotated checkconstructoriscreatorannotated) {
        int size = this.AudioAttributesCompatParcelizer.size();
        float f = BitmapDescriptorFactory.HUE_RED;
        read readVar = null;
        for (int i = 0; i < size; i++) {
            read readVar2 = this.AudioAttributesCompatParcelizer.get(i);
            if (IconCompatParcelizer(readVar2, checkconstructoriscreatorannotated)) {
                float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(readVar2, checkconstructoriscreatorannotated);
                if (readVar == null || fRemoteActionCompatParcelizer > f) {
                    readVar = readVar2;
                    f = fRemoteActionCompatParcelizer;
                }
            }
        }
        return readVar;
    }

    private boolean IconCompatParcelizer(read readVar, checkConstructorIsCreatorAnnotated checkconstructoriscreatorannotated) {
        float[] fArrIconCompatParcelizer = readVar.IconCompatParcelizer();
        return fArrIconCompatParcelizer[1] >= checkconstructoriscreatorannotated.write() && fArrIconCompatParcelizer[1] <= checkconstructoriscreatorannotated.AudioAttributesCompatParcelizer() && fArrIconCompatParcelizer[2] >= checkconstructoriscreatorannotated.RemoteActionCompatParcelizer() && fArrIconCompatParcelizer[2] <= checkconstructoriscreatorannotated.IconCompatParcelizer() && !this.MediaBrowserCompatItemReceiver.get(readVar.AudioAttributesCompatParcelizer());
    }

    private float RemoteActionCompatParcelizer(read readVar, checkConstructorIsCreatorAnnotated checkconstructoriscreatorannotated) {
        float[] fArrIconCompatParcelizer = readVar.IconCompatParcelizer();
        read readVar2 = this.IconCompatParcelizer;
        int iRemoteActionCompatParcelizer = readVar2 != null ? readVar2.RemoteActionCompatParcelizer() : 1;
        float fMediaBrowserCompatCustomActionResultReceiver = checkconstructoriscreatorannotated.MediaBrowserCompatCustomActionResultReceiver();
        float fMediaBrowserCompatItemReceiver = BitmapDescriptorFactory.HUE_RED;
        float fMediaBrowserCompatCustomActionResultReceiver2 = fMediaBrowserCompatCustomActionResultReceiver > BitmapDescriptorFactory.HUE_RED ? checkconstructoriscreatorannotated.MediaBrowserCompatCustomActionResultReceiver() * (1.0f - Math.abs(fArrIconCompatParcelizer[1] - checkconstructoriscreatorannotated.AudioAttributesImplApi26Parcelizer())) : 0.0f;
        float fAbs = checkconstructoriscreatorannotated.read() > BitmapDescriptorFactory.HUE_RED ? checkconstructoriscreatorannotated.read() * (1.0f - Math.abs(fArrIconCompatParcelizer[2] - checkconstructoriscreatorannotated.AudioAttributesImplBaseParcelizer())) : 0.0f;
        if (checkconstructoriscreatorannotated.MediaBrowserCompatItemReceiver() > BitmapDescriptorFactory.HUE_RED) {
            fMediaBrowserCompatItemReceiver = checkconstructoriscreatorannotated.MediaBrowserCompatItemReceiver() * (readVar.RemoteActionCompatParcelizer() / iRemoteActionCompatParcelizer);
        }
        return fMediaBrowserCompatCustomActionResultReceiver2 + fAbs + fMediaBrowserCompatItemReceiver;
    }

    private read IconCompatParcelizer() {
        int size = this.AudioAttributesCompatParcelizer.size();
        int iRemoteActionCompatParcelizer = Integer.MIN_VALUE;
        read readVar = null;
        for (int i = 0; i < size; i++) {
            read readVar2 = this.AudioAttributesCompatParcelizer.get(i);
            if (readVar2.RemoteActionCompatParcelizer() > iRemoteActionCompatParcelizer) {
                iRemoteActionCompatParcelizer = readVar2.RemoteActionCompatParcelizer();
                readVar = readVar2;
            }
        }
        return readVar;
    }

    public static final class read {
        private int AudioAttributesCompatParcelizer;
        private final int AudioAttributesImplApi21Parcelizer;
        private final int AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private float[] IconCompatParcelizer;
        private final int MediaBrowserCompatItemReceiver;
        private final int RemoteActionCompatParcelizer;
        private final int read;
        private boolean write;

        public read(int i, int i2) {
            this.AudioAttributesImplApi21Parcelizer = Color.red(i);
            this.RemoteActionCompatParcelizer = Color.green(i);
            this.read = Color.blue(i);
            this.MediaBrowserCompatItemReceiver = i;
            this.AudioAttributesImplApi26Parcelizer = i2;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final float[] IconCompatParcelizer() {
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = new float[3];
            }
            _verifyNumberForScalarCoercion.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer);
            return this.IconCompatParcelizer;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        private int AudioAttributesImplApi21Parcelizer() {
            write();
            return this.AudioAttributesImplBaseParcelizer;
        }

        private int read() {
            write();
            return this.AudioAttributesCompatParcelizer;
        }

        private void write() {
            int iAudioAttributesCompatParcelizer;
            int iAudioAttributesCompatParcelizer2;
            if (this.write) {
                return;
            }
            int iIconCompatParcelizer = _verifyNumberForScalarCoercion.IconCompatParcelizer(-1, this.MediaBrowserCompatItemReceiver, 4.5f);
            int iIconCompatParcelizer2 = _verifyNumberForScalarCoercion.IconCompatParcelizer(-1, this.MediaBrowserCompatItemReceiver, 3.0f);
            if (iIconCompatParcelizer != -1 && iIconCompatParcelizer2 != -1) {
                this.AudioAttributesCompatParcelizer = _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(-1, iIconCompatParcelizer);
                this.AudioAttributesImplBaseParcelizer = _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(-1, iIconCompatParcelizer2);
                this.write = true;
                return;
            }
            int iIconCompatParcelizer3 = _verifyNumberForScalarCoercion.IconCompatParcelizer(-16777216, this.MediaBrowserCompatItemReceiver, 4.5f);
            int iIconCompatParcelizer4 = _verifyNumberForScalarCoercion.IconCompatParcelizer(-16777216, this.MediaBrowserCompatItemReceiver, 3.0f);
            if (iIconCompatParcelizer3 != -1 && iIconCompatParcelizer4 != -1) {
                this.AudioAttributesCompatParcelizer = _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(-16777216, iIconCompatParcelizer3);
                this.AudioAttributesImplBaseParcelizer = _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(-16777216, iIconCompatParcelizer4);
                this.write = true;
                return;
            }
            if (iIconCompatParcelizer != -1) {
                iAudioAttributesCompatParcelizer = _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(-1, iIconCompatParcelizer);
            } else {
                iAudioAttributesCompatParcelizer = _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(-16777216, iIconCompatParcelizer3);
            }
            this.AudioAttributesCompatParcelizer = iAudioAttributesCompatParcelizer;
            if (iIconCompatParcelizer2 != -1) {
                iAudioAttributesCompatParcelizer2 = _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(-1, iIconCompatParcelizer2);
            } else {
                iAudioAttributesCompatParcelizer2 = _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(-16777216, iIconCompatParcelizer4);
            }
            this.AudioAttributesImplBaseParcelizer = iAudioAttributesCompatParcelizer2;
            this.write = true;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(getClass().getSimpleName());
            sb.append(" [RGB: #");
            sb.append(Integer.toHexString(AudioAttributesCompatParcelizer()));
            sb.append("] [HSL: ");
            sb.append(Arrays.toString(IconCompatParcelizer()));
            sb.append("] [Population: ");
            sb.append(this.AudioAttributesImplApi26Parcelizer);
            sb.append("] [Title Text: #");
            sb.append(Integer.toHexString(AudioAttributesImplApi21Parcelizer()));
            sb.append("] [Body Text: #");
            sb.append(Integer.toHexString(read()));
            sb.append(']');
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            read readVar = (read) obj;
            return this.AudioAttributesImplApi26Parcelizer == readVar.AudioAttributesImplApi26Parcelizer && this.MediaBrowserCompatItemReceiver == readVar.MediaBrowserCompatItemReceiver;
        }

        public final int hashCode() {
            return (this.MediaBrowserCompatItemReceiver * 31) + this.AudioAttributesImplApi26Parcelizer;
        }
    }

    public static final class write {
        private int AudioAttributesCompatParcelizer;
        private final List<read> AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private Rect IconCompatParcelizer;
        private final List<checkConstructorIsCreatorAnnotated> MediaBrowserCompatCustomActionResultReceiver;
        private int RemoteActionCompatParcelizer;
        private final List<IconCompatParcelizer> read;
        private final Bitmap write;

        public write(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.MediaBrowserCompatCustomActionResultReceiver = arrayList;
            this.AudioAttributesCompatParcelizer = 16;
            this.RemoteActionCompatParcelizer = 12544;
            this.AudioAttributesImplBaseParcelizer = -1;
            ArrayList arrayList2 = new ArrayList();
            this.read = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(ReflectionCache.write);
            this.write = bitmap;
            this.AudioAttributesImplApi21Parcelizer = null;
            arrayList.add(checkConstructorIsCreatorAnnotated.write);
            arrayList.add(checkConstructorIsCreatorAnnotated.AudioAttributesImplBaseParcelizer);
            arrayList.add(checkConstructorIsCreatorAnnotated.IconCompatParcelizer);
            arrayList.add(checkConstructorIsCreatorAnnotated.RemoteActionCompatParcelizer);
            arrayList.add(checkConstructorIsCreatorAnnotated.AudioAttributesCompatParcelizer);
            arrayList.add(checkConstructorIsCreatorAnnotated.read);
        }

        public final write IconCompatParcelizer() {
            this.AudioAttributesCompatParcelizer = 1;
            return this;
        }

        public final ReflectionCache read() {
            List<read> listAudioAttributesCompatParcelizer;
            IconCompatParcelizer[] iconCompatParcelizerArr;
            Bitmap bitmap = this.write;
            if (bitmap != null) {
                Bitmap bitmapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bitmap);
                int[] iArrIconCompatParcelizer = IconCompatParcelizer(bitmapRemoteActionCompatParcelizer);
                int i = this.AudioAttributesCompatParcelizer;
                if (this.read.isEmpty()) {
                    iconCompatParcelizerArr = null;
                } else {
                    List<IconCompatParcelizer> list = this.read;
                    iconCompatParcelizerArr = (IconCompatParcelizer[]) list.toArray(new IconCompatParcelizer[list.size()]);
                }
                getCompanionObjectInstance getcompanionobjectinstance = new getCompanionObjectInstance(iArrIconCompatParcelizer, i, iconCompatParcelizerArr);
                if (bitmapRemoteActionCompatParcelizer != this.write) {
                    bitmapRemoteActionCompatParcelizer.recycle();
                }
                listAudioAttributesCompatParcelizer = getcompanionobjectinstance.AudioAttributesCompatParcelizer();
            } else {
                listAudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer;
                if (listAudioAttributesCompatParcelizer == null) {
                    throw new AssertionError();
                }
            }
            ReflectionCache reflectionCache = new ReflectionCache(listAudioAttributesCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver);
            reflectionCache.AudioAttributesCompatParcelizer();
            return reflectionCache;
        }

        private int[] IconCompatParcelizer(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            return iArr;
        }

        private Bitmap RemoteActionCompatParcelizer(Bitmap bitmap) {
            int iMax;
            int i;
            double dSqrt = -1.0d;
            if (this.RemoteActionCompatParcelizer > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.RemoteActionCompatParcelizer;
                if (width > i2) {
                    dSqrt = Math.sqrt(((double) i2) / ((double) width));
                }
            } else if (this.AudioAttributesImplBaseParcelizer > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.AudioAttributesImplBaseParcelizer)) {
                dSqrt = ((double) i) / ((double) iMax);
            }
            return dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        }
    }
}
