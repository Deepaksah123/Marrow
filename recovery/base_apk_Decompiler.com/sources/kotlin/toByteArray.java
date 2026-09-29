package kotlin;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aI\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\f\u001a\u00020\u000e2\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\f\u0010\u000f\u001a%\u0010\u0011\u001a\u00020\u00102\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0002\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000e\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a-\u0010\u0011\u001a\u00020\u00162\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0017*\n\u0010\u0018\"\u00020\n2\u00020\n"}, d2 = {"Lo/getReferencedType;", "p0", "p1", "", "Lo/switchToNext;", "p2", "", "p3", "Lo/findContentSerializer;", "p4", "Landroid/graphics/Shader;", "Lo/AudioAttributesCompatParcelizer;", "write", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "", "(Ljava/util/List;)I", "", "RemoteActionCompatParcelizer", "(Ljava/util/List;I)[I", "", "read", "(Ljava/util/List;Ljava/util/List;I)[F", "", "(Ljava/util/List;Ljava/util/List;)V", "AudioAttributesCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class toByteArray {
    public static final int write(List<switchToNext> list) {
        return 0;
    }

    public static final Shader write(long j, long j2, List<switchToNext> list, List<Float> list2, int i) {
        RemoteActionCompatParcelizer(list, list2);
        int iWrite = write(list);
        return new LinearGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) j), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) j2), RemoteActionCompatParcelizer(list, iWrite), read(list2, list, iWrite), isInline.read(i));
    }

    public static final int[] RemoteActionCompatParcelizer(List<switchToNext> list, int i) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = RequestPayload.IconCompatParcelizer(list.get(i2).getIconCompatParcelizer());
        }
        return iArr;
    }

    public static final float[] read(List<Float> list, List<switchToNext> list2, int i) {
        if (i == 0) {
            if (list != null) {
                return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection<Float>) list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int iWrite = IntermediateLoginResponseBody.write((List) list2);
        int i2 = 1;
        for (int i3 = 1; i3 < iWrite; i3++) {
            long iconCompatParcelizer = list2.get(i3).getIconCompatParcelizer();
            float fFloatValue = list != null ? list.get(i3).floatValue() : i3 / IntermediateLoginResponseBody.write((List) list2);
            int i4 = i2 + 1;
            fArr[i2] = fFloatValue;
            if (switchToNext.RemoteActionCompatParcelizer(iconCompatParcelizer) == BitmapDescriptorFactory.HUE_RED) {
                i2 += 2;
                fArr[i4] = fFloatValue;
            } else {
                i2 = i4;
            }
        }
        fArr[i2] = list != null ? list.get(IntermediateLoginResponseBody.write((List) list2)).floatValue() : 1.0f;
        return fArr;
    }

    private static final void RemoteActionCompatParcelizer(List<switchToNext> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
