package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0018\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0017J\r\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010'\u001a\u00020\tHÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u0012\u0012\u0004\u0012\u0002H\u00010\u0004j\b\u0012\u0004\u0012\u0002H\u0001`\u0005¨\u0006*"}, d2 = {"Landroidx/compose/runtime/Stack;", "T", "", "backing", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "constructor-impl", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "size", "", "getSize-impl", "(Ljava/util/ArrayList;)I", "push", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "push-impl", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "pop", "pop-impl", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "peek", "peek-impl", "index", "(Ljava/util/ArrayList;I)Ljava/lang/Object;", "isEmpty", "isEmpty-impl", "(Ljava/util/ArrayList;)Z", "isNotEmpty", "isNotEmpty-impl", "clear", "", "clear-impl", "(Ljava/util/ArrayList;)V", "toArray", "", "toArray-impl", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "equals", "other", "hashCode", "toString", "", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class parseLong<T> {
    private final ArrayList<T> write;

    public static <T> ArrayList<T> AudioAttributesCompatParcelizer(ArrayList<T> arrayList) {
        return arrayList;
    }

    public static /* synthetic */ ArrayList IconCompatParcelizer(ArrayList arrayList, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        if ((i & 1) != 0) {
            arrayList = new ArrayList();
        }
        return AudioAttributesCompatParcelizer(arrayList);
    }

    public static final int IconCompatParcelizer(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    public static final boolean write(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }

    public static final T AudioAttributesImplBaseParcelizer(ArrayList<T> arrayList) {
        return arrayList.remove(IconCompatParcelizer(arrayList) - 1);
    }

    public static final T AudioAttributesImplApi21Parcelizer(ArrayList<T> arrayList) {
        return arrayList.get(IconCompatParcelizer(arrayList) - 1);
    }

    public static final T RemoteActionCompatParcelizer(ArrayList<T> arrayList, int i) {
        return arrayList.get(i);
    }

    public static final boolean write(ArrayList<T> arrayList) {
        return arrayList.isEmpty();
    }

    public static final boolean MediaBrowserCompatCustomActionResultReceiver(ArrayList<T> arrayList) {
        return !write(arrayList);
    }

    public static final void read(ArrayList<T> arrayList) {
        arrayList.clear();
    }

    public static final T[] MediaBrowserCompatItemReceiver(ArrayList<T> arrayList) {
        int size = arrayList.size();
        T[] tArr = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            tArr[i] = arrayList.get(i);
        }
        return tArr;
    }

    public static boolean read(ArrayList<T> arrayList, Object obj) {
        return (obj instanceof parseLong) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(arrayList, ((parseLong) obj).getWrite());
    }

    public static int RemoteActionCompatParcelizer(ArrayList<T> arrayList) {
        return arrayList.hashCode();
    }

    public static String AudioAttributesImplApi26Parcelizer(ArrayList<T> arrayList) {
        StringBuilder sb = new StringBuilder("Stack(backing=");
        sb.append(arrayList);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object other) {
        return read(this.write, other);
    }

    public final int hashCode() {
        return RemoteActionCompatParcelizer(this.write);
    }

    public final String toString() {
        return AudioAttributesImplApi26Parcelizer(this.write);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final /* synthetic */ ArrayList getWrite() {
        return this.write;
    }
}
