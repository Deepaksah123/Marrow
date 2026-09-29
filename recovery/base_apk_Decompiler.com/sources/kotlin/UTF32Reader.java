package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003uvwB!\b\u0001\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010\u001dJ\u001b\u0010\u001a\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010 J\u001c\u0010!\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#J\u001c\u0010!\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0017\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0086\bJ\u0017\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\bJ\u0019\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010$J\u001c\u0010!\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000%J\u0014\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000%J(\u0010&\u001a\u00020\u001b2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J(\u0010)\u001a\u00020\u001b2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u0006\u0010+\u001a\u00020\u001eJ\u0016\u0010,\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u001dJ\u0014\u0010-\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#J\u0014\u0010-\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000%J\u0014\u0010-\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010.\u001a\u00020\u001b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0011\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u0007H\u0086\bJ\u0010\u00102\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u0007H\u0001J\u000b\u00103\u001a\u00028\u0000¢\u0006\u0002\u00104J-\u00103\u001a\u00028\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00105J\t\u00106\u001a\u000207H\u0081\bJ\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0001J\u0010\u0010:\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0002\u00104J/\u0010:\u001a\u0004\u0018\u00018\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00105JP\u0010;\u001a\u0002H<\"\u0004\b\u0001\u0010<2\u0006\u0010=\u001a\u0002H<2'\u0010>\u001a#\u0012\u0013\u0012\u0011H<¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(B\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H<0?H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010CJe\u0010D\u001a\u0002H<\"\u0004\b\u0001\u0010<2\u0006\u0010=\u001a\u0002H<2<\u0010>\u001a8\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u0011H<¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(B\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H<0EH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010FJP\u0010G\u001a\u0002H<\"\u0004\b\u0001\u0010<2\u0006\u0010=\u001a\u0002H<2'\u0010>\u001a#\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u0011H<¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(B\u0012\u0004\u0012\u0002H<0?H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010CJe\u0010H\u001a\u0002H<\"\u0004\b\u0001\u0010<2\u0006\u0010=\u001a\u0002H<2<\u0010>\u001a8\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u0011H<¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(B\u0012\u0004\u0012\u0002H<0EH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010FJ(\u0010I\u001a\u00020\u001e2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J.\u0010K\u001a\u00020\u001e2\u0018\u0010J\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e0?H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J(\u0010L\u001a\u00020\u001e2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J.\u0010M\u001a\u00020\u001e2\u0018\u0010J\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e0?H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0016\u0010N\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u0007H\u0086\n¢\u0006\u0002\u0010OJ\u0013\u0010P\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010QJ(\u0010R\u001a\u00020\u00072\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J(\u0010S\u001a\u00020\u00072\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\t\u0010T\u001a\u00020\u001bH\u0086\bJ\t\u0010U\u001a\u00020\u001bH\u0086\bJ\u000b\u0010V\u001a\u00028\u0000¢\u0006\u0002\u00104J-\u0010V\u001a\u00028\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00105J\u0013\u0010W\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010QJ\u0010\u0010X\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0002\u00104J/\u0010X\u001a\u0004\u0018\u00018\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00105J;\u0010Y\u001a\b\u0012\u0004\u0012\u0002H<0\u0005\"\u0006\b\u0001\u0010<\u0018\u00012\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H<0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010[JP\u0010\\\u001a\b\u0012\u0004\u0012\u0002H<0\u0005\"\u0006\b\u0001\u0010<\u0018\u00012'\u0010Z\u001a#\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H<0?H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010]JM\u0010^\u001a\b\u0012\u0004\u0012\u0002H<0\u0000\"\u0006\b\u0001\u0010<\u0018\u00012)\u0010Z\u001a%\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u0001H<0?H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J8\u0010_\u001a\b\u0012\u0004\u0012\u0002H<0\u0000\"\u0006\b\u0001\u0010<\u0018\u00012\u0014\u0010Z\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u0001H<0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0016\u0010`\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010aJ\u0016\u0010b\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010aJ\u0013\u0010c\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010\u001dJ\u0014\u0010d\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#J\u0014\u0010d\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010d\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000%J\u0013\u0010e\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0002\u0010OJ\u0016\u0010f\u001a\u00020\u001e2\u0006\u0010g\u001a\u00020\u00072\u0006\u0010h\u001a\u00020\u0007J\u0010\u0010i\u001a\u00020\u001e2\u0006\u0010j\u001a\u00020\u0007H\u0001J\u001d\u0010k\u001a\u00020\u001e2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0(H\u0086\bJ\u0014\u0010l\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000%J\u001e\u0010m\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010nJ\u001e\u0010o\u001a\u00020\u001e2\u0016\u0010p\u001a\u0012\u0012\u0004\u0012\u00028\u00000qj\b\u0012\u0004\u0012\u00028\u0000`rJ(\u0010s\u001a\u00020\u00072\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001R\"\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00058\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\f\u0012\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0012\u0010\u0014\u001a\u00020\u00158Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006x"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "content", "", "size", "", "<init>", "([Ljava/lang/Object;I)V", "getContent$annotations", "()V", "[Ljava/lang/Object;", "list", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getSize", "()I", "lastIndex", "getLastIndex", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "getContent", "()[Ljava/lang/Object;", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "([Ljava/lang/Object;)Z", "", "any", "predicate", "Lkotlin/Function1;", "reversedAny", "asMutableList", "clear", "contains", "containsAll", "contentEquals", "other", "ensureCapacity", "capacity", "resizeStorage", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "throwNoSuchElementException", "", "message", "", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "block", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastIndexOf", "lastOrNull", "map", "transform", "(Lkotlin/jvm/functions/Function1;)[Ljava/lang/Object;", "mapIndexed", "(Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "mapIndexedNotNull", "mapNotNull", "plusAssign", "(Ljava/lang/Object;)V", "minusAssign", "remove", "removeAll", "removeAt", "removeRange", TtmlNode.START, TtmlNode.END, "setSize", "newSize", "removeIf", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "sortWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "sumBy", "selector", "VectorListIterator", "MutableVectorList", "SubList", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UTF32Reader<T> implements RandomAccess {
    public static final int read = 8;
    private int AudioAttributesCompatParcelizer;
    public T[] IconCompatParcelizer;
    private List<T> write;

    public UTF32Reader(T[] tArr, int i) {
        this.IconCompatParcelizer = tArr;
        this.AudioAttributesCompatParcelizer = i;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean read(T t) {
        int i = this.AudioAttributesCompatParcelizer + 1;
        if (this.IconCompatParcelizer.length < i) {
            IconCompatParcelizer(i);
        }
        T[] tArr = this.IconCompatParcelizer;
        int i2 = this.AudioAttributesCompatParcelizer;
        tArr[i2] = t;
        this.AudioAttributesCompatParcelizer = i2 + 1;
        return true;
    }

    public final void RemoteActionCompatParcelizer(int i, T t) {
        int i2 = this.AudioAttributesCompatParcelizer + 1;
        if (this.IconCompatParcelizer.length < i2) {
            IconCompatParcelizer(i2);
        }
        T[] tArr = this.IconCompatParcelizer;
        int i3 = this.AudioAttributesCompatParcelizer;
        if (i != i3) {
            System.arraycopy(tArr, i, tArr, i + 1, i3 - i);
        }
        tArr[i] = t;
        this.AudioAttributesCompatParcelizer++;
    }

    public final boolean write(int i, List<? extends T> list) {
        if (list.isEmpty()) {
            return false;
        }
        int size = list.size();
        int i2 = this.AudioAttributesCompatParcelizer + size;
        if (this.IconCompatParcelizer.length < i2) {
            IconCompatParcelizer(i2);
        }
        T[] tArr = this.IconCompatParcelizer;
        int i3 = this.AudioAttributesCompatParcelizer;
        if (i != i3) {
            System.arraycopy(tArr, i, tArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            tArr[i + i4] = list.get(i4);
        }
        this.AudioAttributesCompatParcelizer += size;
        return true;
    }

    public final boolean read(int i, UTF32Reader<T> uTF32Reader) {
        int i2 = uTF32Reader.AudioAttributesCompatParcelizer;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.AudioAttributesCompatParcelizer + i2;
        if (this.IconCompatParcelizer.length < i3) {
            IconCompatParcelizer(i3);
        }
        T[] tArr = this.IconCompatParcelizer;
        int i4 = this.AudioAttributesCompatParcelizer;
        if (i != i4) {
            System.arraycopy(tArr, i, tArr, i + i2, i4 - i);
        }
        System.arraycopy(uTF32Reader.IconCompatParcelizer, 0, tArr, i, i2);
        this.AudioAttributesCompatParcelizer += i2;
        return true;
    }

    public final boolean RemoteActionCompatParcelizer(int i, Collection<? extends T> collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.AudioAttributesCompatParcelizer + size;
        if (this.IconCompatParcelizer.length < i3) {
            IconCompatParcelizer(i3);
        }
        T[] tArr = this.IconCompatParcelizer;
        int i4 = this.AudioAttributesCompatParcelizer;
        if (i != i4) {
            System.arraycopy(tArr, i, tArr, i + size, i4 - i);
        }
        for (T t : collection) {
            if (i2 < 0) {
                IntermediateLoginResponseBody.read();
            }
            tArr[i2 + i] = t;
            i2++;
        }
        this.AudioAttributesCompatParcelizer += size;
        return true;
    }

    public final boolean read(Collection<? extends T> collection) {
        return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, (Collection) collection);
    }

    public final List<T> read() {
        List<T> list = this.write;
        if (list != null) {
            return list;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this);
        this.write = remoteActionCompatParcelizer;
        return remoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer() {
        T[] tArr = this.IconCompatParcelizer;
        int i = this.AudioAttributesCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            tArr[i2] = null;
        }
        this.AudioAttributesCompatParcelizer = 0;
    }

    public final boolean IconCompatParcelizer(Collection<? extends T> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!write(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void IconCompatParcelizer(int i) {
        T[] tArr = this.IconCompatParcelizer;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(i, length << 1)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.IconCompatParcelizer = tArr2;
    }

    public final Void AudioAttributesCompatParcelizer(String str) {
        throw new NoSuchElementException(str);
    }

    public final int AudioAttributesCompatParcelizer(T t) {
        T[] tArr = this.IconCompatParcelizer;
        int i = this.AudioAttributesCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(t, tArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final int RemoteActionCompatParcelizer(T t) {
        T[] tArr = this.IconCompatParcelizer;
        for (int i = this.AudioAttributesCompatParcelizer - 1; i >= 0; i--) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(t, tArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public final boolean IconCompatParcelizer(T t) {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(t);
        if (iAudioAttributesCompatParcelizer < 0) {
            return false;
        }
        RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer);
        return true;
    }

    public final boolean RemoteActionCompatParcelizer(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i = this.AudioAttributesCompatParcelizer;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            IconCompatParcelizer(it.next());
        }
        return i != this.AudioAttributesCompatParcelizer;
    }

    public final T RemoteActionCompatParcelizer(int i) {
        T[] tArr = this.IconCompatParcelizer;
        T t = tArr[i];
        if (i != getAudioAttributesCompatParcelizer() - 1) {
            int i2 = i + 1;
            System.arraycopy(tArr, i2, tArr, i, this.AudioAttributesCompatParcelizer - i2);
        }
        int i3 = this.AudioAttributesCompatParcelizer - 1;
        this.AudioAttributesCompatParcelizer = i3;
        tArr[i3] = null;
        return t;
    }

    public final void read(int i, int i2) {
        if (i2 > i) {
            int i3 = this.AudioAttributesCompatParcelizer;
            if (i2 < i3) {
                T[] tArr = this.IconCompatParcelizer;
                System.arraycopy(tArr, i2, tArr, i, i3 - i2);
            }
            int i4 = this.AudioAttributesCompatParcelizer - (i2 - i);
            int audioAttributesCompatParcelizer = getAudioAttributesCompatParcelizer() - 1;
            if (i4 <= audioAttributesCompatParcelizer) {
                int i5 = i4;
                while (true) {
                    this.IconCompatParcelizer[i5] = null;
                    if (i5 == audioAttributesCompatParcelizer) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.AudioAttributesCompatParcelizer = i4;
        }
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public final boolean write(Collection<? extends T> collection) {
        int i = this.AudioAttributesCompatParcelizer;
        for (int audioAttributesCompatParcelizer = getAudioAttributesCompatParcelizer() - 1; audioAttributesCompatParcelizer >= 0; audioAttributesCompatParcelizer--) {
            if (!collection.contains(this.IconCompatParcelizer[audioAttributesCompatParcelizer])) {
                RemoteActionCompatParcelizer(audioAttributesCompatParcelizer);
            }
        }
        return i != this.AudioAttributesCompatParcelizer;
    }

    public final T AudioAttributesCompatParcelizer(int i, T t) {
        T[] tArr = this.IconCompatParcelizer;
        T t2 = tArr[i];
        tArr[i] = t;
        return t2;
    }

    public final void AudioAttributesCompatParcelizer(Comparator<T> comparator) {
        getOrderDetails.write(this.IconCompatParcelizer, comparator, this.AudioAttributesCompatParcelizer);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lo/UTF32Reader$write;", "T", "", "", "p0", "", "p1", "<init>", "(Ljava/util/List;I)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "remove", "()V", "hasPrevious", "nextIndex", "()I", "previous", "previousIndex", "add", "(Ljava/lang/Object;)V", "set", "IconCompatParcelizer", "Ljava/util/List;", "read", "RemoteActionCompatParcelizer", "I", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class write<T> implements ListIterator<T>, getOffline {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final List<T> read;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private int AudioAttributesCompatParcelizer;

        public write(List<T> list, int i) {
            this.read = list;
            this.AudioAttributesCompatParcelizer = i;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.AudioAttributesCompatParcelizer < this.read.size();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            List<T> list = this.read;
            int i = this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = i + 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i = this.AudioAttributesCompatParcelizer - 1;
            this.AudioAttributesCompatParcelizer = i;
            this.read.remove(i);
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.AudioAttributesCompatParcelizer > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            int i = this.AudioAttributesCompatParcelizer - 1;
            this.AudioAttributesCompatParcelizer = i;
            return this.read.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.AudioAttributesCompatParcelizer - 1;
        }

        @Override // java.util.ListIterator
        public final void add(T p0) {
            this.read.add(this.AudioAttributesCompatParcelizer, p0);
            this.AudioAttributesCompatParcelizer++;
        }

        @Override // java.util.ListIterator
        public final void set(T p0) {
            this.read.set(this.AudioAttributesCompatParcelizer, p0);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u000f\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\tJ\u001f\u0010\u0018\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u001bJ%\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\u0004\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010#J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b$\u0010\tJ\u001d\u0010%\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b%\u0010\fJ\u0017\u0010&\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010\u000fJ\u001d\u0010'\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b'\u0010\fJ \u0010(\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010,\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/"}, d2 = {"Lo/UTF32Reader$RemoteActionCompatParcelizer;", "T", "", "Lo/UTF32Reader;", "p0", "<init>", "(Lo/UTF32Reader;)V", "", "contains", "(Ljava/lang/Object;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "p1", "", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "AudioAttributesCompatParcelizer", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "(II)Ljava/util/List;", "IconCompatParcelizer", "Lo/UTF32Reader;", "read", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer<T> implements List<T>, getModulesCompleted {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final UTF32Reader<T> AudioAttributesCompatParcelizer;

        public RemoteActionCompatParcelizer(UTF32Reader<T> uTF32Reader) {
            this.AudioAttributesCompatParcelizer = uTF32Reader;
        }

        @Override // java.util.List
        public final T remove(int i) {
            return AudioAttributesCompatParcelizer(i);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return read();
        }

        public final int read() {
            return this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object p0) {
            return this.AudioAttributesCompatParcelizer.write(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<?> p0) {
            return this.AudioAttributesCompatParcelizer.IconCompatParcelizer((Collection) p0);
        }

        @Override // java.util.List
        public final T get(int p0) {
            SerializedString.RemoteActionCompatParcelizer(this, p0);
            return this.AudioAttributesCompatParcelizer.IconCompatParcelizer[p0];
        }

        @Override // java.util.List
        public final int indexOf(Object p0) {
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new write(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object p0) {
            return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T p0) {
            return this.AudioAttributesCompatParcelizer.read(p0);
        }

        @Override // java.util.List
        public final void add(int p0, T p1) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0, p1);
        }

        @Override // java.util.List
        public final boolean addAll(int p0, Collection<? extends T> p1) {
            return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0, (Collection) p1);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> p0) {
            return this.AudioAttributesCompatParcelizer.read((Collection) p0);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new write(this, 0);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int p0) {
            return new write(this, p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object p0) {
            return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<?> p0) {
            return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer((Collection) p0);
        }

        public final T AudioAttributesCompatParcelizer(int p0) {
            SerializedString.RemoteActionCompatParcelizer(this, p0);
            return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<?> p0) {
            return this.AudioAttributesCompatParcelizer.write((Collection) p0);
        }

        @Override // java.util.List
        public final T set(int p0, T p1) {
            SerializedString.RemoteActionCompatParcelizer(this, p0);
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1);
        }

        @Override // java.util.List
        public final List<T> subList(int p0, int p1) {
            RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer = this;
            SerializedString.read(remoteActionCompatParcelizer, p0, p1);
            return new AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, p0, p1);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return markCompletelambda1.read(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) markCompletelambda1.RemoteActionCompatParcelizer(this, tArr);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00028\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u000bJ\u001f\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ%\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u001c\u0010\u000eJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010#J\u0017\u0010$\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b$\u0010\u000bJ\u001d\u0010%\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b%\u0010\u000eJ\u0017\u0010&\u001a\u00028\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0010J\u001d\u0010'\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b'\u0010\u000eJ \u0010(\u001a\u00028\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010,R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u0010/\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00101"}, d2 = {"Lo/UTF32Reader$AudioAttributesCompatParcelizer;", "T", "", "p0", "", "p1", "p2", "<init>", "(Ljava/util/List;II)V", "", "contains", "(Ljava/lang/Object;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "write", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "(II)Ljava/util/List;", "Ljava/util/List;", "RemoteActionCompatParcelizer", "I", "read", "IconCompatParcelizer", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer<T> implements List<T>, getModulesCompleted {

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final int write;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private int IconCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final List<T> RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(List<T> list, int i, int i2) {
            this.RemoteActionCompatParcelizer = list;
            this.write = i;
            this.IconCompatParcelizer = i2;
        }

        @Override // java.util.List
        public final T remove(int i) {
            return write(i);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return read();
        }

        public final int read() {
            return this.IconCompatParcelizer - this.write;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object p0) {
            int i = this.IconCompatParcelizer;
            for (int i2 = this.write; i2 < i; i2++) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.get(i2), p0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<?> p0) {
            Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int p0) {
            SerializedString.RemoteActionCompatParcelizer(this, p0);
            return this.RemoteActionCompatParcelizer.get(p0 + this.write);
        }

        @Override // java.util.List
        public final int indexOf(Object p0) {
            int i = this.IconCompatParcelizer;
            for (int i2 = this.write; i2 < i; i2++) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.get(i2), p0)) {
                    return i2 - this.write;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.IconCompatParcelizer == this.write;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new write(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object p0) {
            int i = this.IconCompatParcelizer - 1;
            int i2 = this.write;
            if (i2 > i) {
                return -1;
            }
            while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.get(i), p0)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.write;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T p0) {
            List<T> list = this.RemoteActionCompatParcelizer;
            int i = this.IconCompatParcelizer;
            this.IconCompatParcelizer = i + 1;
            list.add(i, p0);
            return true;
        }

        @Override // java.util.List
        public final void add(int p0, T p1) {
            this.RemoteActionCompatParcelizer.add(p0 + this.write, p1);
            this.IconCompatParcelizer++;
        }

        @Override // java.util.List
        public final boolean addAll(int p0, Collection<? extends T> p1) {
            this.RemoteActionCompatParcelizer.addAll(p0 + this.write, p1);
            int size = p1.size();
            this.IconCompatParcelizer += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> p0) {
            this.RemoteActionCompatParcelizer.addAll(this.IconCompatParcelizer, p0);
            int size = p0.size();
            this.IconCompatParcelizer += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.IconCompatParcelizer - 1;
            int i2 = this.write;
            if (i2 <= i) {
                while (true) {
                    this.RemoteActionCompatParcelizer.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.IconCompatParcelizer = this.write;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new write(this, 0);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int p0) {
            return new write(this, p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object p0) {
            int i = this.IconCompatParcelizer;
            for (int i2 = this.write; i2 < i; i2++) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.get(i2), p0)) {
                    this.RemoteActionCompatParcelizer.remove(i2);
                    this.IconCompatParcelizer--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<?> p0) {
            int i = this.IconCompatParcelizer;
            Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.IconCompatParcelizer;
        }

        public final T write(int p0) {
            SerializedString.RemoteActionCompatParcelizer(this, p0);
            this.IconCompatParcelizer--;
            return this.RemoteActionCompatParcelizer.remove(p0 + this.write);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<?> p0) {
            int i = this.IconCompatParcelizer;
            int i2 = i - 1;
            int i3 = this.write;
            if (i3 <= i2) {
                while (true) {
                    if (!p0.contains(this.RemoteActionCompatParcelizer.get(i2))) {
                        this.RemoteActionCompatParcelizer.remove(i2);
                        this.IconCompatParcelizer--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.IconCompatParcelizer;
        }

        @Override // java.util.List
        public final T set(int p0, T p1) {
            SerializedString.RemoteActionCompatParcelizer(this, p0);
            return this.RemoteActionCompatParcelizer.set(p0 + this.write, p1);
        }

        @Override // java.util.List
        public final List<T> subList(int p0, int p1) {
            AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer = this;
            SerializedString.read(audioAttributesCompatParcelizer, p0, p1);
            return new AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer, p0, p1);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return markCompletelambda1.read(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) markCompletelambda1.RemoteActionCompatParcelizer(this, tArr);
        }
    }

    public final boolean write(T t) {
        int audioAttributesCompatParcelizer = getAudioAttributesCompatParcelizer() - 1;
        if (audioAttributesCompatParcelizer >= 0) {
            for (int i = 0; !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer[i], t); i++) {
                if (i != audioAttributesCompatParcelizer) {
                }
            }
            return true;
        }
        return false;
    }

    public final T IconCompatParcelizer() {
        if (getAudioAttributesCompatParcelizer() == 0) {
            AudioAttributesCompatParcelizer("MutableVector is empty.");
            throw new PlanDetailsCreator();
        }
        return this.IconCompatParcelizer[0];
    }

    public final T AudioAttributesCompatParcelizer() {
        if (getAudioAttributesCompatParcelizer() == 0) {
            AudioAttributesCompatParcelizer("MutableVector is empty.");
            throw new PlanDetailsCreator();
        }
        return this.IconCompatParcelizer[getAudioAttributesCompatParcelizer() - 1];
    }
}
