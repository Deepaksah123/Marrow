package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.AbstractFloatValueParser;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.checkUTF16;
import kotlin.flog10threeQuartersPow2;
import kotlin.getAnswerMap;
import kotlin.getInputCodeUtf8JsNames;
import kotlin.getModulesCompleted;
import kotlin.getShowPopup;
import kotlin.handleBOM;
import kotlin.markCompletelambda1;
import kotlin.parseDigitsRecursive;
import kotlin.reportStrangeStream;
import kotlin.reportWeirdUCS4;
import kotlin.skipSpace;
import kotlin.toChars3;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.tryMatch;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 H*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00060\u0005j\u0002`\u0006:\u0001HB\u0017\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rH\u0016J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016J\u0016\u0010 \u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0016H\u0096\u0002¢\u0006\u0002\u0010\"J\u0015\u0010#\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u001aH\u0016J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0096\u0002J\u0015\u0010(\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010$J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000*2\u0006\u0010!\u001a\u00020\u0016H\u0016J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016H\u0016J\b\u0010.\u001a\u00020/H\u0016J\u0015\u00100\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u001d\u00100\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u001e\u00102\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016J\u0016\u00102\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016J\b\u00103\u001a\u00020\u0012H\u0016J\u0015\u00104\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u0016\u00105\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016J\u0015\u00106\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0016H\u0016¢\u0006\u0002\u0010\"J\u0016\u00107\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016J\u001e\u00108\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u00109J\u0016\u0010:\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016J+\u0010;\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010<\u001a\u00020\u00162\u0006\u0010=\u001a\u00020\u0016H\u0000¢\u0006\u0002\b>J\u0018\u0010C\u001a\u00020\u00122\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0016H\u0016J\b\u0010G\u001a\u00020\u0016H\u0016R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R \u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148AX\u0080\u0004¢\u0006\f\u0012\u0004\b@\u0010\u000b\u001a\u0004\bA\u0010B¨\u0006I"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroid/os/Parcelable;", "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "persistentList", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "()V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "prependStateRecord", "", "toList", "", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "get", "index", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "toString", "", "add", "(ILjava/lang/Object;)V", "addAll", "clear", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "removeRange", "retainAllInRange", TtmlNode.START, TtmlNode.END, "retainAllInRange$runtime", "debuggerDisplayValue", "getDebuggerDisplayValue$annotations", "getDebuggerDisplayValue", "()Ljava/util/List;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "describeContents", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnapshotStateList<T> implements Parcelable, tryMatch, List<T>, RandomAccess, getModulesCompleted {
    private reportWeirdUCS4 RemoteActionCompatParcelizer;
    public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer(null);
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new AudioAttributesCompatParcelizer();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public SnapshotStateList(AbstractFloatValueParser<? extends T> abstractFloatValueParser) {
        this.RemoteActionCompatParcelizer = flog10threeQuartersPow2.IconCompatParcelizer(this, abstractFloatValueParser);
    }

    @Override // java.util.List
    public final T remove(int i) {
        return read(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return AudioAttributesCompatParcelizer();
    }

    public SnapshotStateList() {
        this(reportStrangeStream.read());
    }

    @Override // kotlin.tryMatch
    /* JADX INFO: renamed from: write, reason: from getter */
    public final reportWeirdUCS4 getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.tryMatch
    public final void RemoteActionCompatParcelizer(reportWeirdUCS4 reportweirducs4) {
        reportweirducs4.RemoteActionCompatParcelizer(getRemoteActionCompatParcelizer());
        toMagicModuleMetaRepoModel.read(reportweirducs4, "");
        this.RemoteActionCompatParcelizer = (checkUTF16) reportweirducs4;
    }

    public final List<T> RemoteActionCompatParcelizer() {
        return flog10threeQuartersPow2.RemoteActionCompatParcelizer(this).read();
    }

    public final int AudioAttributesCompatParcelizer() {
        return flog10threeQuartersPow2.RemoteActionCompatParcelizer(this).read().size();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object element) {
        return flog10threeQuartersPow2.RemoteActionCompatParcelizer(this).read().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> elements) {
        return flog10threeQuartersPow2.RemoteActionCompatParcelizer(this).read().containsAll(elements);
    }

    @Override // java.util.List
    public final T get(int index) {
        return (T) flog10threeQuartersPow2.RemoteActionCompatParcelizer(this).read().get(index);
    }

    @Override // java.util.List
    public final int indexOf(Object element) {
        return flog10threeQuartersPow2.RemoteActionCompatParcelizer(this).read().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return flog10threeQuartersPow2.RemoteActionCompatParcelizer(this).read().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object element) {
        return flog10threeQuartersPow2.RemoteActionCompatParcelizer(this).read().lastIndexOf(element);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new handleBOM(this, 0);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int index) {
        return new handleBOM(this, index);
    }

    @Override // java.util.List
    public final List<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex > toIndex || toIndex > size()) {
            getInputCodeUtf8JsNames.write("fromIndex or toIndex are out of bounds");
        }
        return new skipSpace(this, fromIndex, toIndex);
    }

    public final String toString() {
        reportWeirdUCS4 remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
        checkUTF16 checkutf16 = (checkUTF16) toChars3.IconCompatParcelizer((checkUTF16) remoteActionCompatParcelizer);
        StringBuilder sb = new StringBuilder("SnapshotStateList(value=");
        sb.append(checkutf16.read());
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    @Override // java.util.List
    public final boolean addAll(final int index, final Collection<? extends T> elements) {
        return flog10threeQuartersPow2.write(this, new getAnswerMap() { // from class: o.flog10pow2
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SnapshotStateList.AudioAttributesCompatParcelizer(index, elements, (List) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(int i, Collection collection, List list) {
        return list.addAll(i, collection);
    }

    public final T read(int i) {
        int iWrite;
        AbstractFloatValueParser<T> abstractFloatValueParser;
        parseDigitsRecursive parsedigitsrecursiveAudioAttributesCompatParcelizer;
        boolean zAudioAttributesCompatParcelizer;
        T t = get(i);
        do {
            synchronized (flog10threeQuartersPow2.read) {
                reportWeirdUCS4 remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
                toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
                checkUTF16 checkutf16 = (checkUTF16) toChars3.IconCompatParcelizer((checkUTF16) remoteActionCompatParcelizer);
                iWrite = checkutf16.getRemoteActionCompatParcelizer();
                abstractFloatValueParser = checkutf16.read();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            toMagicModuleMetaRepoModel.write(abstractFloatValueParser);
            AbstractFloatValueParser<T> abstractFloatValueParserIconCompatParcelizer = abstractFloatValueParser.IconCompatParcelizer(i);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractFloatValueParserIconCompatParcelizer, abstractFloatValueParser)) {
                return t;
            }
            reportWeirdUCS4 remoteActionCompatParcelizer2 = getRemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer2, "");
            checkUTF16 checkutf162 = (checkUTF16) remoteActionCompatParcelizer2;
            SnapshotStateList<T> snapshotStateList = this;
            synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                parsedigitsrecursiveAudioAttributesCompatParcelizer = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer();
                zAudioAttributesCompatParcelizer = flog10threeQuartersPow2.AudioAttributesCompatParcelizer((checkUTF16) toChars3.IconCompatParcelizer(checkutf162, snapshotStateList, parsedigitsrecursiveAudioAttributesCompatParcelizer), iWrite, abstractFloatValueParserIconCompatParcelizer, true);
            }
            toChars3.AudioAttributesCompatParcelizer(parsedigitsrecursiveAudioAttributesCompatParcelizer, snapshotStateList);
        } while (!zAudioAttributesCompatParcelizer);
        return t;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(final Collection<?> elements) {
        return flog10threeQuartersPow2.write(this, new getAnswerMap() { // from class: o.FloatToDecimal
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SnapshotStateList.IconCompatParcelizer(elements, (List) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IconCompatParcelizer(Collection collection, List list) {
        return list.retainAll(collection);
    }

    @Override // java.util.List
    public final T set(int index, T element) {
        int iWrite;
        AbstractFloatValueParser<T> abstractFloatValueParser;
        parseDigitsRecursive parsedigitsrecursiveAudioAttributesCompatParcelizer;
        boolean zAudioAttributesCompatParcelizer;
        T t = get(index);
        do {
            synchronized (flog10threeQuartersPow2.read) {
                reportWeirdUCS4 remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
                toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
                checkUTF16 checkutf16 = (checkUTF16) toChars3.IconCompatParcelizer((checkUTF16) remoteActionCompatParcelizer);
                iWrite = checkutf16.getRemoteActionCompatParcelizer();
                abstractFloatValueParser = checkutf16.read();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            toMagicModuleMetaRepoModel.write(abstractFloatValueParser);
            AbstractFloatValueParser<T> abstractFloatValueParserIconCompatParcelizer = abstractFloatValueParser.IconCompatParcelizer(index, element);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractFloatValueParserIconCompatParcelizer, abstractFloatValueParser)) {
                return t;
            }
            reportWeirdUCS4 remoteActionCompatParcelizer2 = getRemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer2, "");
            checkUTF16 checkutf162 = (checkUTF16) remoteActionCompatParcelizer2;
            SnapshotStateList<T> snapshotStateList = this;
            synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                parsedigitsrecursiveAudioAttributesCompatParcelizer = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer();
                zAudioAttributesCompatParcelizer = flog10threeQuartersPow2.AudioAttributesCompatParcelizer((checkUTF16) toChars3.IconCompatParcelizer(checkutf162, snapshotStateList, parsedigitsrecursiveAudioAttributesCompatParcelizer), iWrite, abstractFloatValueParserIconCompatParcelizer, false);
            }
            toChars3.AudioAttributesCompatParcelizer(parsedigitsrecursiveAudioAttributesCompatParcelizer, snapshotStateList);
        } while (!zAudioAttributesCompatParcelizer);
        return t;
    }

    public final int RemoteActionCompatParcelizer(Collection<? extends T> collection, int i, int i2) {
        int iWrite;
        AbstractFloatValueParser<T> abstractFloatValueParser;
        parseDigitsRecursive parsedigitsrecursiveAudioAttributesCompatParcelizer;
        boolean zAudioAttributesCompatParcelizer;
        int size = size();
        do {
            synchronized (flog10threeQuartersPow2.read) {
                reportWeirdUCS4 remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
                toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
                checkUTF16 checkutf16 = (checkUTF16) toChars3.IconCompatParcelizer((checkUTF16) remoteActionCompatParcelizer);
                iWrite = checkutf16.getRemoteActionCompatParcelizer();
                abstractFloatValueParser = checkutf16.read();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            toMagicModuleMetaRepoModel.write(abstractFloatValueParser);
            AbstractFloatValueParser.AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizerRemoteActionCompatParcelizer = abstractFloatValueParser.RemoteActionCompatParcelizer();
            audioAttributesCompatParcelizerRemoteActionCompatParcelizer.subList(i, i2).retainAll(collection);
            getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            AbstractFloatValueParser<T> abstractFloatValueParserIconCompatParcelizer = audioAttributesCompatParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractFloatValueParserIconCompatParcelizer, abstractFloatValueParser)) {
                break;
            }
            reportWeirdUCS4 remoteActionCompatParcelizer2 = getRemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer2, "");
            checkUTF16 checkutf162 = (checkUTF16) remoteActionCompatParcelizer2;
            SnapshotStateList<T> snapshotStateList = this;
            synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                parsedigitsrecursiveAudioAttributesCompatParcelizer = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer();
                zAudioAttributesCompatParcelizer = flog10threeQuartersPow2.AudioAttributesCompatParcelizer((checkUTF16) toChars3.IconCompatParcelizer(checkutf162, snapshotStateList, parsedigitsrecursiveAudioAttributesCompatParcelizer), iWrite, abstractFloatValueParserIconCompatParcelizer, true);
            }
            toChars3.AudioAttributesCompatParcelizer(parsedigitsrecursiveAudioAttributesCompatParcelizer, snapshotStateList);
        } while (!zAudioAttributesCompatParcelizer);
        return size - size();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int flags) {
        List<T> listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int size = listRemoteActionCompatParcelizer.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            parcel.writeValue(listRemoteActionCompatParcelizer.get(i));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00048\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "CREATOR", "Landroid/os/Parcelable$Creator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J)\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\r2\u0006\u0010\u0005\u001a\u00020\fH\u0016¢\u0006\u0004\b\b\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$AudioAttributesCompatParcelizer;", "Landroid/os/Parcelable$ClassLoaderCreator;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "Landroid/os/Parcel;", "p0", "Ljava/lang/ClassLoader;", "p1", "IconCompatParcelizer", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "AudioAttributesCompatParcelizer", "(Landroid/os/Parcel;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "", "(I)[Landroidx/compose/runtime/snapshots/SnapshotStateList;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements Parcelable.ClassLoaderCreator<SnapshotStateList<Object>> {
        AudioAttributesCompatParcelizer() {
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final SnapshotStateList<Object> createFromParcel(final Parcel p0, final ClassLoader p1) {
            if (p1 == null) {
                p1 = getClass().getClassLoader();
            }
            return flog10threeQuartersPow2.IconCompatParcelizer(p0.readInt(), new getAnswerMap() { // from class: o.multiplyHigh
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return SnapshotStateList.AudioAttributesCompatParcelizer.read(p0, p1, ((Integer) obj).intValue());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object read(Parcel parcel, ClassLoader classLoader, int i) {
            return parcel.readValue(classLoader);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final SnapshotStateList<Object> createFromParcel(Parcel p0) {
            return createFromParcel(p0, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final SnapshotStateList<Object>[] newArray(int p0) {
            return new SnapshotStateList[p0];
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T element) {
        int iWrite;
        AbstractFloatValueParser<T> abstractFloatValueParser;
        parseDigitsRecursive parsedigitsrecursiveAudioAttributesCompatParcelizer;
        boolean zAudioAttributesCompatParcelizer;
        do {
            synchronized (flog10threeQuartersPow2.read) {
                reportWeirdUCS4 remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
                toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
                checkUTF16 checkutf16 = (checkUTF16) toChars3.IconCompatParcelizer((checkUTF16) remoteActionCompatParcelizer);
                iWrite = checkutf16.getRemoteActionCompatParcelizer();
                abstractFloatValueParser = checkutf16.read();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            toMagicModuleMetaRepoModel.write(abstractFloatValueParser);
            AbstractFloatValueParser<T> abstractFloatValueParserWrite = abstractFloatValueParser.write(element);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractFloatValueParserWrite, abstractFloatValueParser)) {
                return false;
            }
            reportWeirdUCS4 remoteActionCompatParcelizer2 = getRemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer2, "");
            checkUTF16 checkutf162 = (checkUTF16) remoteActionCompatParcelizer2;
            SnapshotStateList<T> snapshotStateList = this;
            synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                parsedigitsrecursiveAudioAttributesCompatParcelizer = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer();
                zAudioAttributesCompatParcelizer = flog10threeQuartersPow2.AudioAttributesCompatParcelizer((checkUTF16) toChars3.IconCompatParcelizer(checkutf162, snapshotStateList, parsedigitsrecursiveAudioAttributesCompatParcelizer), iWrite, abstractFloatValueParserWrite, true);
            }
            toChars3.AudioAttributesCompatParcelizer(parsedigitsrecursiveAudioAttributesCompatParcelizer, snapshotStateList);
        } while (!zAudioAttributesCompatParcelizer);
        return true;
    }

    @Override // java.util.List
    public final void add(int index, T element) {
        int iWrite;
        AbstractFloatValueParser<T> abstractFloatValueParser;
        parseDigitsRecursive parsedigitsrecursiveAudioAttributesCompatParcelizer;
        boolean zAudioAttributesCompatParcelizer;
        do {
            synchronized (flog10threeQuartersPow2.read) {
                reportWeirdUCS4 remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
                toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
                checkUTF16 checkutf16 = (checkUTF16) toChars3.IconCompatParcelizer((checkUTF16) remoteActionCompatParcelizer);
                iWrite = checkutf16.getRemoteActionCompatParcelizer();
                abstractFloatValueParser = checkutf16.read();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            toMagicModuleMetaRepoModel.write(abstractFloatValueParser);
            AbstractFloatValueParser<T> abstractFloatValueParser2 = abstractFloatValueParser.read(index, element);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractFloatValueParser2, abstractFloatValueParser)) {
                return;
            }
            reportWeirdUCS4 remoteActionCompatParcelizer2 = getRemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer2, "");
            checkUTF16 checkutf162 = (checkUTF16) remoteActionCompatParcelizer2;
            SnapshotStateList<T> snapshotStateList = this;
            synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                parsedigitsrecursiveAudioAttributesCompatParcelizer = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer();
                zAudioAttributesCompatParcelizer = flog10threeQuartersPow2.AudioAttributesCompatParcelizer((checkUTF16) toChars3.IconCompatParcelizer(checkutf162, snapshotStateList, parsedigitsrecursiveAudioAttributesCompatParcelizer), iWrite, abstractFloatValueParser2, true);
            }
            toChars3.AudioAttributesCompatParcelizer(parsedigitsrecursiveAudioAttributesCompatParcelizer, snapshotStateList);
        } while (!zAudioAttributesCompatParcelizer);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> elements) {
        int iWrite;
        AbstractFloatValueParser<T> abstractFloatValueParser;
        parseDigitsRecursive parsedigitsrecursiveAudioAttributesCompatParcelizer;
        boolean zAudioAttributesCompatParcelizer;
        do {
            synchronized (flog10threeQuartersPow2.read) {
                reportWeirdUCS4 remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
                toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
                checkUTF16 checkutf16 = (checkUTF16) toChars3.IconCompatParcelizer((checkUTF16) remoteActionCompatParcelizer);
                iWrite = checkutf16.getRemoteActionCompatParcelizer();
                abstractFloatValueParser = checkutf16.read();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            toMagicModuleMetaRepoModel.write(abstractFloatValueParser);
            AbstractFloatValueParser<T> abstractFloatValueParserIconCompatParcelizer = abstractFloatValueParser.IconCompatParcelizer(elements);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractFloatValueParserIconCompatParcelizer, abstractFloatValueParser)) {
                return false;
            }
            reportWeirdUCS4 remoteActionCompatParcelizer2 = getRemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer2, "");
            checkUTF16 checkutf162 = (checkUTF16) remoteActionCompatParcelizer2;
            SnapshotStateList<T> snapshotStateList = this;
            synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                parsedigitsrecursiveAudioAttributesCompatParcelizer = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer();
                zAudioAttributesCompatParcelizer = flog10threeQuartersPow2.AudioAttributesCompatParcelizer((checkUTF16) toChars3.IconCompatParcelizer(checkutf162, snapshotStateList, parsedigitsrecursiveAudioAttributesCompatParcelizer), iWrite, abstractFloatValueParserIconCompatParcelizer, true);
            }
            toChars3.AudioAttributesCompatParcelizer(parsedigitsrecursiveAudioAttributesCompatParcelizer, snapshotStateList);
        } while (!zAudioAttributesCompatParcelizer);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        parseDigitsRecursive parsedigitsrecursiveAudioAttributesCompatParcelizer;
        reportWeirdUCS4 remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
        checkUTF16 checkutf16 = (checkUTF16) remoteActionCompatParcelizer;
        SnapshotStateList<T> snapshotStateList = this;
        synchronized (toChars3.MediaBrowserCompatMediaItem()) {
            parsedigitsrecursiveAudioAttributesCompatParcelizer = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer();
            checkUTF16 checkutf162 = (checkUTF16) toChars3.IconCompatParcelizer(checkutf16, snapshotStateList, parsedigitsrecursiveAudioAttributesCompatParcelizer);
            synchronized (flog10threeQuartersPow2.read) {
                checkutf162.RemoteActionCompatParcelizer(reportStrangeStream.read());
                checkutf162.write(checkutf162.getRemoteActionCompatParcelizer() + 1);
                checkutf162.IconCompatParcelizer(checkutf162.getWrite() + 1);
            }
        }
        toChars3.AudioAttributesCompatParcelizer(parsedigitsrecursiveAudioAttributesCompatParcelizer, snapshotStateList);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object element) {
        int iWrite;
        AbstractFloatValueParser<T> abstractFloatValueParser;
        parseDigitsRecursive parsedigitsrecursiveAudioAttributesCompatParcelizer;
        boolean zAudioAttributesCompatParcelizer;
        do {
            synchronized (flog10threeQuartersPow2.read) {
                reportWeirdUCS4 remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
                toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
                checkUTF16 checkutf16 = (checkUTF16) toChars3.IconCompatParcelizer((checkUTF16) remoteActionCompatParcelizer);
                iWrite = checkutf16.getRemoteActionCompatParcelizer();
                abstractFloatValueParser = checkutf16.read();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            toMagicModuleMetaRepoModel.write(abstractFloatValueParser);
            AbstractFloatValueParser<T> abstractFloatValueParserIconCompatParcelizer = abstractFloatValueParser.IconCompatParcelizer(element);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractFloatValueParserIconCompatParcelizer, abstractFloatValueParser)) {
                return false;
            }
            reportWeirdUCS4 remoteActionCompatParcelizer2 = getRemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer2, "");
            checkUTF16 checkutf162 = (checkUTF16) remoteActionCompatParcelizer2;
            SnapshotStateList<T> snapshotStateList = this;
            synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                parsedigitsrecursiveAudioAttributesCompatParcelizer = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer();
                zAudioAttributesCompatParcelizer = flog10threeQuartersPow2.AudioAttributesCompatParcelizer((checkUTF16) toChars3.IconCompatParcelizer(checkutf162, snapshotStateList, parsedigitsrecursiveAudioAttributesCompatParcelizer), iWrite, abstractFloatValueParserIconCompatParcelizer, true);
            }
            toChars3.AudioAttributesCompatParcelizer(parsedigitsrecursiveAudioAttributesCompatParcelizer, snapshotStateList);
        } while (!zAudioAttributesCompatParcelizer);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> elements) {
        int iWrite;
        AbstractFloatValueParser<T> abstractFloatValueParser;
        parseDigitsRecursive parsedigitsrecursiveAudioAttributesCompatParcelizer;
        boolean zAudioAttributesCompatParcelizer;
        do {
            synchronized (flog10threeQuartersPow2.read) {
                reportWeirdUCS4 remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
                toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
                checkUTF16 checkutf16 = (checkUTF16) toChars3.IconCompatParcelizer((checkUTF16) remoteActionCompatParcelizer);
                iWrite = checkutf16.getRemoteActionCompatParcelizer();
                abstractFloatValueParser = checkutf16.read();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            toMagicModuleMetaRepoModel.write(abstractFloatValueParser);
            AbstractFloatValueParser<T> abstractFloatValueParserWrite = abstractFloatValueParser.write((Collection<? extends T>) elements);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractFloatValueParserWrite, abstractFloatValueParser)) {
                return false;
            }
            reportWeirdUCS4 remoteActionCompatParcelizer2 = getRemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer2, "");
            checkUTF16 checkutf162 = (checkUTF16) remoteActionCompatParcelizer2;
            SnapshotStateList<T> snapshotStateList = this;
            synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                parsedigitsrecursiveAudioAttributesCompatParcelizer = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer();
                zAudioAttributesCompatParcelizer = flog10threeQuartersPow2.AudioAttributesCompatParcelizer((checkUTF16) toChars3.IconCompatParcelizer(checkutf162, snapshotStateList, parsedigitsrecursiveAudioAttributesCompatParcelizer), iWrite, abstractFloatValueParserWrite, true);
            }
            toChars3.AudioAttributesCompatParcelizer(parsedigitsrecursiveAudioAttributesCompatParcelizer, snapshotStateList);
        } while (!zAudioAttributesCompatParcelizer);
        return true;
    }

    public final void AudioAttributesCompatParcelizer(int i, int i2) {
        int iWrite;
        AbstractFloatValueParser<T> abstractFloatValueParser;
        parseDigitsRecursive parsedigitsrecursiveAudioAttributesCompatParcelizer;
        boolean zAudioAttributesCompatParcelizer;
        do {
            synchronized (flog10threeQuartersPow2.read) {
                reportWeirdUCS4 remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
                toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
                checkUTF16 checkutf16 = (checkUTF16) toChars3.IconCompatParcelizer((checkUTF16) remoteActionCompatParcelizer);
                iWrite = checkutf16.getRemoteActionCompatParcelizer();
                abstractFloatValueParser = checkutf16.read();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            toMagicModuleMetaRepoModel.write(abstractFloatValueParser);
            AbstractFloatValueParser.AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizerRemoteActionCompatParcelizer = abstractFloatValueParser.RemoteActionCompatParcelizer();
            audioAttributesCompatParcelizerRemoteActionCompatParcelizer.subList(i, i2).clear();
            getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            AbstractFloatValueParser<T> abstractFloatValueParserIconCompatParcelizer = audioAttributesCompatParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractFloatValueParserIconCompatParcelizer, abstractFloatValueParser)) {
                return;
            }
            reportWeirdUCS4 remoteActionCompatParcelizer2 = getRemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer2, "");
            checkUTF16 checkutf162 = (checkUTF16) remoteActionCompatParcelizer2;
            SnapshotStateList<T> snapshotStateList = this;
            synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                parsedigitsrecursiveAudioAttributesCompatParcelizer = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer();
                zAudioAttributesCompatParcelizer = flog10threeQuartersPow2.AudioAttributesCompatParcelizer((checkUTF16) toChars3.IconCompatParcelizer(checkutf162, snapshotStateList, parsedigitsrecursiveAudioAttributesCompatParcelizer), iWrite, abstractFloatValueParserIconCompatParcelizer, true);
            }
            toChars3.AudioAttributesCompatParcelizer(parsedigitsrecursiveAudioAttributesCompatParcelizer, snapshotStateList);
        } while (!zAudioAttributesCompatParcelizer);
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
