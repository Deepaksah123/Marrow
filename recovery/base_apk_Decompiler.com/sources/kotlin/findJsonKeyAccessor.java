package kotlin;

import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ8\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007J\u0011\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082\bJ\u0014\u0010\u0013\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014J\u0010\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0017R\"\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "<init>", "()V", "nodes", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "nodeData", "", "clear", "", "parsePathString", "pathData", "", "pathStringToNodes", "resizeNodeData", "dataCount", "", "addPathNodes", "", "toNodes", "toPath", "Landroidx/compose/ui/graphics/Path;", CourseConfigKeyConstantsKt.KEY_VIDEO_SUBJECT_ITEM_CHILD_TARGET, "ui-graphics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findJsonKeyAccessor {
    private float[] write = new float[64];

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArrayList RemoteActionCompatParcelizer(findJsonKeyAccessor findjsonkeyaccessor, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 2) != 0) {
            arrayList = new ArrayList();
        }
        return findjsonkeyaccessor.AudioAttributesCompatParcelizer(str, arrayList);
    }

    public final ArrayList<getBeanClass> AudioAttributesCompatParcelizer(String str, ArrayList<getBeanClass> arrayList) {
        int i;
        char cCharAt;
        long j;
        float fIntBitsToFloat;
        int length = str.length();
        int i2 = 0;
        while (i2 < length && toMagicModuleMetaRepoModel.read((int) str.charAt(i2), 32) <= 0) {
            i2++;
        }
        while (length > i2 && toMagicModuleMetaRepoModel.read((int) str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i3 = 0;
        while (i2 < length) {
            while (true) {
                i = i2 + 1;
                cCharAt = str.charAt(i2);
                int i4 = cCharAt | ' ';
                if ((i4 - 97) * (i4 - 122) <= 0 && i4 != 101) {
                    break;
                }
                if (i >= length) {
                    cCharAt = 0;
                    break;
                }
                i2 = i;
            }
            if (cCharAt != 0) {
                int i5 = cCharAt | ' ';
                if (i5 != 122) {
                    while (i < length && toMagicModuleMetaRepoModel.read((int) str.charAt(i), 32) <= 0) {
                        i++;
                    }
                    boolean z = i5 == 97;
                    int i6 = 0;
                    do {
                        if (z && 3 <= i6 && i6 < 5) {
                            j = findBackReferences.read(str, i, Math.min(i + 1, length));
                        } else {
                            j = findBackReferences.read(str, i, length);
                        }
                        i = (int) (j >>> 32);
                        fIntBitsToFloat = Float.intBitsToFloat((int) j);
                        if (!Float.isNaN(fIntBitsToFloat)) {
                            float[] fArr = this.write;
                            int i7 = i6 + 1;
                            fArr[i6] = fIntBitsToFloat;
                            if (i7 >= fArr.length) {
                                float[] fArr2 = new float[i7 << 1];
                                this.write = fArr2;
                                getOrderDetails.IconCompatParcelizer(fArr, fArr2, 0, 0, fArr.length);
                            }
                            i6 = i7;
                        }
                        while (i < length && (toMagicModuleMetaRepoModel.read((int) str.charAt(i), 32) <= 0 || str.charAt(i) == ',')) {
                            i++;
                        }
                        if (i >= length) {
                            break;
                        }
                    } while (!Float.isNaN(fIntBitsToFloat));
                    i3 = i6;
                }
                findMethod.write(cCharAt, arrayList, this.write, i3);
            }
            i2 = i;
        }
        return arrayList;
    }
}
