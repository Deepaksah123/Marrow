package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.getLength;

/* JADX INFO: loaded from: classes5.dex */
public final class updatePeekBuffer {
    private final getLength AudioAttributesCompatParcelizer;
    private final float[] AudioAttributesImplApi26Parcelizer;
    private final List<getLength> AudioAttributesImplBaseParcelizer;
    private final float[] IconCompatParcelizer;
    private final List<getLength> RemoteActionCompatParcelizer;
    private final float read;
    private final float write;

    private updatePeekBuffer(getLength getlength, List<getLength> list, List<getLength> list2) {
        this.AudioAttributesCompatParcelizer = getlength;
        this.AudioAttributesImplBaseParcelizer = Collections.unmodifiableList(list);
        this.RemoteActionCompatParcelizer = Collections.unmodifiableList(list2);
        float f = list.get(list.size() - 1).write().read - getlength.write().read;
        this.write = f;
        float f2 = getlength.MediaBrowserCompatCustomActionResultReceiver().read - list2.get(list2.size() - 1).MediaBrowserCompatCustomActionResultReceiver().read;
        this.read = f2;
        this.AudioAttributesImplApi26Parcelizer = read(f, list, true);
        this.IconCompatParcelizer = read(f2, list2, false);
    }

    public static updatePeekBuffer write(readFromUpstream readfromupstream, getLength getlength) {
        return new updatePeekBuffer(getlength, IconCompatParcelizer(readfromupstream, getlength), RemoteActionCompatParcelizer(readfromupstream, getlength));
    }

    public final getLength IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final getLength RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer.get(r1.size() - 1);
    }

    public final getLength write() {
        return this.RemoteActionCompatParcelizer.get(r1.size() - 1);
    }

    public final getLength RemoteActionCompatParcelizer(float f, float f2, float f3) {
        return write(f, f2, f3);
    }

    private getLength write(float f, float f2, float f3) {
        float fRemoteActionCompatParcelizer;
        List<getLength> list;
        float[] fArr;
        float f4 = this.write + f2;
        float f5 = f3 - this.read;
        if (f < f4) {
            fRemoteActionCompatParcelizer = BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(1.0f, BitmapDescriptorFactory.HUE_RED, f2, f4, f);
            list = this.AudioAttributesImplBaseParcelizer;
            fArr = this.AudioAttributesImplApi26Parcelizer;
        } else if (f > f5) {
            fRemoteActionCompatParcelizer = BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, 1.0f, f5, f3, f);
            list = this.RemoteActionCompatParcelizer;
            fArr = this.IconCompatParcelizer;
        } else {
            return this.AudioAttributesCompatParcelizer;
        }
        return RemoteActionCompatParcelizer(list, fRemoteActionCompatParcelizer, fArr);
    }

    private static getLength RemoteActionCompatParcelizer(List<getLength> list, float f, float[] fArr) {
        float[] fArrIconCompatParcelizer = IconCompatParcelizer(list, f, fArr);
        return getLength.AudioAttributesCompatParcelizer(list.get((int) fArrIconCompatParcelizer[1]), list.get((int) fArrIconCompatParcelizer[2]), fArrIconCompatParcelizer[0]);
    }

    private static float[] IconCompatParcelizer(List<getLength> list, float f, float[] fArr) {
        int size = list.size();
        float f2 = fArr[0];
        int i = 1;
        while (i < size) {
            float f3 = fArr[i];
            if (f <= f3) {
                return new float[]{BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, 1.0f, f2, f3, f), i - 1, i};
            }
            i++;
            f2 = f3;
        }
        return new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    }

    private static float[] read(float f, List<getLength> list, boolean z) {
        float f2;
        int size = list.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            getLength getlength = list.get(i2);
            getLength getlength2 = list.get(i);
            if (z) {
                f2 = getlength2.write().read - getlength.write().read;
            } else {
                f2 = getlength.MediaBrowserCompatCustomActionResultReceiver().read - getlength2.MediaBrowserCompatCustomActionResultReceiver().read;
            }
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + (f2 / f);
            i++;
        }
        return fArr;
    }

    private static boolean RemoteActionCompatParcelizer(getLength getlength) {
        return getlength.read().write - (getlength.read().AudioAttributesImplApi26Parcelizer / 2.0f) >= BitmapDescriptorFactory.HUE_RED && getlength.read() == getlength.RemoteActionCompatParcelizer();
    }

    private static boolean read(readFromUpstream readfromupstream, getLength getlength) {
        int iIconCompatParcelizer = readfromupstream.IconCompatParcelizer();
        if (readfromupstream.RemoteActionCompatParcelizer()) {
            iIconCompatParcelizer = readfromupstream.AudioAttributesCompatParcelizer();
        }
        return getlength.AudioAttributesImplApi26Parcelizer().write + (getlength.AudioAttributesImplApi26Parcelizer().AudioAttributesImplApi26Parcelizer / 2.0f) <= ((float) iIconCompatParcelizer) && getlength.AudioAttributesImplApi26Parcelizer() == getlength.MediaMetadataCompat();
    }

    private static List<getLength> IconCompatParcelizer(readFromUpstream readfromupstream, getLength getlength) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getlength);
        int iIconCompatParcelizer = IconCompatParcelizer(getlength);
        if (!RemoteActionCompatParcelizer(getlength) && iIconCompatParcelizer != -1) {
            int iIconCompatParcelizer2 = getlength.IconCompatParcelizer() - iIconCompatParcelizer;
            float fAudioAttributesCompatParcelizer = readfromupstream.RemoteActionCompatParcelizer() ? readfromupstream.AudioAttributesCompatParcelizer() : readfromupstream.IconCompatParcelizer();
            float f = getlength.write().write - (getlength.write().AudioAttributesImplApi26Parcelizer / 2.0f);
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (iIconCompatParcelizer2 <= 0 && getlength.read().IconCompatParcelizer > BitmapDescriptorFactory.HUE_RED) {
                arrayList.add(IconCompatParcelizer(getlength, f + getlength.read().IconCompatParcelizer, fAudioAttributesCompatParcelizer));
                return arrayList;
            }
            int i = 0;
            while (i < iIconCompatParcelizer2) {
                getLength getlength2 = (getLength) arrayList.get(arrayList.size() - 1);
                int i2 = iIconCompatParcelizer + i;
                int size = getlength.AudioAttributesImplApi21Parcelizer().size() - 1;
                float f3 = f2 + getlength.AudioAttributesImplApi21Parcelizer().get(i2).IconCompatParcelizer;
                arrayList.add(IconCompatParcelizer(getlength2, iIconCompatParcelizer, i2 - 1 >= 0 ? RemoteActionCompatParcelizer(getlength2, getlength.AudioAttributesImplApi21Parcelizer().get(r3).AudioAttributesCompatParcelizer) - 1 : size, f + f3, (getlength.IconCompatParcelizer() - i) - 1, (getlength.AudioAttributesImplBaseParcelizer() - i) - 1, fAudioAttributesCompatParcelizer));
                i++;
                f2 = f3;
            }
        }
        return arrayList;
    }

    private static List<getLength> RemoteActionCompatParcelizer(readFromUpstream readfromupstream, getLength getlength) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getlength);
        int i = read(getlength);
        if (!read(readfromupstream, getlength) && i != -1) {
            int iAudioAttributesImplBaseParcelizer = i - getlength.AudioAttributesImplBaseParcelizer();
            float fAudioAttributesCompatParcelizer = readfromupstream.RemoteActionCompatParcelizer() ? readfromupstream.AudioAttributesCompatParcelizer() : readfromupstream.IconCompatParcelizer();
            float f = getlength.write().write - (getlength.write().AudioAttributesImplApi26Parcelizer / 2.0f);
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (iAudioAttributesImplBaseParcelizer <= 0 && getlength.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer > BitmapDescriptorFactory.HUE_RED) {
                arrayList.add(IconCompatParcelizer(getlength, f - getlength.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer, fAudioAttributesCompatParcelizer));
                return arrayList;
            }
            int i2 = 0;
            while (i2 < iAudioAttributesImplBaseParcelizer) {
                getLength getlength2 = (getLength) arrayList.get(arrayList.size() - 1);
                int i3 = i - i2;
                float f3 = f2 + getlength.AudioAttributesImplApi21Parcelizer().get(i3).IconCompatParcelizer;
                int i4 = i3 + 1;
                arrayList.add(IconCompatParcelizer(getlength2, i, i4 < getlength.AudioAttributesImplApi21Parcelizer().size() ? AudioAttributesCompatParcelizer(getlength2, getlength.AudioAttributesImplApi21Parcelizer().get(i4).AudioAttributesCompatParcelizer) + 1 : 0, f - f3, getlength.IconCompatParcelizer() + i2 + 1, getlength.AudioAttributesImplBaseParcelizer() + i2 + 1, fAudioAttributesCompatParcelizer));
                i2++;
                f2 = f3;
            }
        }
        return arrayList;
    }

    private static getLength IconCompatParcelizer(getLength getlength, float f, float f2) {
        return IconCompatParcelizer(getlength, 0, 0, f, getlength.IconCompatParcelizer(), getlength.AudioAttributesImplBaseParcelizer(), f2);
    }

    private static getLength IconCompatParcelizer(getLength getlength, int i, int i2, float f, int i3, int i4, float f2) {
        ArrayList arrayList = new ArrayList(getlength.AudioAttributesImplApi21Parcelizer());
        arrayList.add(i2, (getLength.RemoteActionCompatParcelizer) arrayList.remove(i));
        getLength.write writeVar = new getLength.write(getlength.MediaBrowserCompatItemReceiver(), f2);
        int i5 = 0;
        while (i5 < arrayList.size()) {
            getLength.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (getLength.RemoteActionCompatParcelizer) arrayList.get(i5);
            writeVar.IconCompatParcelizer(f + (remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer / 2.0f), remoteActionCompatParcelizer.AudioAttributesCompatParcelizer, remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer, i5 >= i3 && i5 <= i4, remoteActionCompatParcelizer.RemoteActionCompatParcelizer, remoteActionCompatParcelizer.IconCompatParcelizer);
            f += remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer;
            i5++;
        }
        return writeVar.AudioAttributesCompatParcelizer();
    }

    private static int RemoteActionCompatParcelizer(getLength getlength, float f) {
        for (int iAudioAttributesImplBaseParcelizer = getlength.AudioAttributesImplBaseParcelizer(); iAudioAttributesImplBaseParcelizer < getlength.AudioAttributesImplApi21Parcelizer().size(); iAudioAttributesImplBaseParcelizer++) {
            if (f == getlength.AudioAttributesImplApi21Parcelizer().get(iAudioAttributesImplBaseParcelizer).AudioAttributesCompatParcelizer) {
                return iAudioAttributesImplBaseParcelizer;
            }
        }
        return getlength.AudioAttributesImplApi21Parcelizer().size() - 1;
    }

    private static int AudioAttributesCompatParcelizer(getLength getlength, float f) {
        for (int iIconCompatParcelizer = getlength.IconCompatParcelizer() - 1; iIconCompatParcelizer >= 0; iIconCompatParcelizer--) {
            if (f == getlength.AudioAttributesImplApi21Parcelizer().get(iIconCompatParcelizer).AudioAttributesCompatParcelizer) {
                return iIconCompatParcelizer;
            }
        }
        return 0;
    }

    private static int IconCompatParcelizer(getLength getlength) {
        for (int i = 0; i < getlength.AudioAttributesImplApi21Parcelizer().size(); i++) {
            if (!getlength.AudioAttributesImplApi21Parcelizer().get(i).RemoteActionCompatParcelizer) {
                return i;
            }
        }
        return -1;
    }

    private static int read(getLength getlength) {
        for (int size = getlength.AudioAttributesImplApi21Parcelizer().size() - 1; size >= 0; size--) {
            if (!getlength.AudioAttributesImplApi21Parcelizer().get(size).RemoteActionCompatParcelizer) {
                return size;
            }
        }
        return -1;
    }

    public final Map<Integer, getLength> read(int i, int i2, int i3, boolean z) {
        float fMediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
        HashMap map = new HashMap();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= i) {
                break;
            }
            int i6 = z ? (i - i4) - 1 : i4;
            if (i6 * fMediaBrowserCompatItemReceiver * (z ? -1 : 1) > i3 - this.read || i4 >= i - this.RemoteActionCompatParcelizer.size()) {
                List<getLength> list = this.RemoteActionCompatParcelizer;
                map.put(Integer.valueOf(i6), list.get(StdKeyDeserializer.read(i5, 0, list.size() - 1)));
                i5++;
            }
            i4++;
        }
        int i7 = 0;
        for (int i8 = i - 1; i8 >= 0; i8--) {
            int i9 = z ? (i - i8) - 1 : i8;
            if (i9 * fMediaBrowserCompatItemReceiver * (z ? -1 : 1) < i2 + this.write || i8 < this.AudioAttributesImplBaseParcelizer.size()) {
                List<getLength> list2 = this.AudioAttributesImplBaseParcelizer;
                map.put(Integer.valueOf(i9), list2.get(StdKeyDeserializer.read(i7, 0, list2.size() - 1)));
                i7++;
            }
        }
        return map;
    }
}
