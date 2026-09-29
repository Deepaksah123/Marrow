package kotlin;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.AbstractFloatValueParser;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0005\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0010\u0010\u0012\u001a\u000f\u0010\r\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\r\u0010\u0014\u001a\u001f\u0010\u0010\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0016\u001a\u000f\u0010\u0006\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0006\u0010\u0014\"$\u0010\u0010\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0017\"*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0018\u0010\u0006\u001a\u00060\u001bj\u0002`\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001d"}, d2 = {"T", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lkotlin/Function1;", "", "", "p0", "write", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lo/getAnswerMap;)Z", "Lo/checkUTF16;", "", "Lo/AbstractFloatValueParser;", "p1", "p2", "AudioAttributesCompatParcelizer", "(Lo/checkUTF16;ILo/AbstractFloatValueParser;Z)Z", "Lo/reportWeirdUCS4;", "IconCompatParcelizer", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lo/AbstractFloatValueParser;)Lo/reportWeirdUCS4;", "(ILo/getAnswerMap;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "()Ljava/lang/Void;", "", "(II)V", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)I", "RemoteActionCompatParcelizer", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)Lo/checkUTF16;", "read", "", "Lo/SynchronizedObject;", "Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class flog10threeQuartersPow2 {
    private static final Object read = new Object();

    public static final <T> boolean AudioAttributesCompatParcelizer(checkUTF16<T> checkutf16, int i, AbstractFloatValueParser<? extends T> abstractFloatValueParser, boolean z) {
        boolean z2;
        synchronized (read) {
            if (checkutf16.getRemoteActionCompatParcelizer() == i) {
                checkutf16.RemoteActionCompatParcelizer(abstractFloatValueParser);
                z2 = true;
                if (z) {
                    checkutf16.IconCompatParcelizer(checkutf16.getWrite() + 1);
                }
                checkutf16.write(checkutf16.getRemoteActionCompatParcelizer() + 1);
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public static final <T> reportWeirdUCS4 IconCompatParcelizer(SnapshotStateList<T> snapshotStateList, AbstractFloatValueParser<? extends T> abstractFloatValueParser) {
        parseDigitsRecursive parsedigitsrecursiveMediaBrowserCompatSearchResultReceiver = toChars3.MediaBrowserCompatSearchResultReceiver();
        checkUTF16 checkutf16 = new checkUTF16(parsedigitsrecursiveMediaBrowserCompatSearchResultReceiver.getIconCompatParcelizer(), abstractFloatValueParser);
        if (!(parsedigitsrecursiveMediaBrowserCompatSearchResultReceiver instanceof JavaDoubleBitsFromCharArray)) {
            checkutf16.RemoteActionCompatParcelizer(new checkUTF16(toDecimal.RemoteActionCompatParcelizer(1), abstractFloatValueParser));
        }
        return checkutf16;
    }

    public static final <T> checkUTF16<T> RemoteActionCompatParcelizer(SnapshotStateList<T> snapshotStateList) {
        reportWeirdUCS4 remoteActionCompatParcelizer = snapshotStateList.getRemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
        return (checkUTF16) toChars3.read((checkUTF16) remoteActionCompatParcelizer, snapshotStateList);
    }

    public static final <T> SnapshotStateList<T> IconCompatParcelizer(int i, getAnswerMap<? super Integer, ? extends T> getanswermap) {
        if (i == 0) {
            return new SnapshotStateList<>();
        }
        AbstractFloatValueParser.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemoteActionCompatParcelizer = reportStrangeStream.read().RemoteActionCompatParcelizer();
        for (int i2 = 0; i2 < i; i2++) {
            audioAttributesCompatParcelizerRemoteActionCompatParcelizer.add(getanswermap.invoke(Integer.valueOf(i2)));
        }
        return new SnapshotStateList<>(audioAttributesCompatParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void AudioAttributesCompatParcelizer() {
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(int i, int i2) {
        if (i < 0 || i >= i2) {
            StringBuilder sb = new StringBuilder("index (");
            sb.append(i);
            sb.append(") is out of bound of [0, ");
            sb.append(i2);
            sb.append(')');
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void write() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()".toString());
    }

    public static final <T> boolean write(SnapshotStateList<T> snapshotStateList, getAnswerMap<? super List<T>, Boolean> getanswermap) {
        int iWrite;
        AbstractFloatValueParser<T> abstractFloatValueParser;
        Boolean boolInvoke;
        parseDigitsRecursive parsedigitsrecursiveAudioAttributesCompatParcelizer;
        boolean zAudioAttributesCompatParcelizer;
        do {
            synchronized (read) {
                reportWeirdUCS4 remoteActionCompatParcelizer = snapshotStateList.getRemoteActionCompatParcelizer();
                toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
                checkUTF16 checkutf16 = (checkUTF16) toChars3.IconCompatParcelizer((checkUTF16) remoteActionCompatParcelizer);
                iWrite = checkutf16.getRemoteActionCompatParcelizer();
                abstractFloatValueParser = checkutf16.read();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            toMagicModuleMetaRepoModel.write(abstractFloatValueParser);
            AbstractFloatValueParser.AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizerRemoteActionCompatParcelizer = abstractFloatValueParser.RemoteActionCompatParcelizer();
            boolInvoke = getanswermap.invoke(audioAttributesCompatParcelizerRemoteActionCompatParcelizer);
            AbstractFloatValueParser<T> abstractFloatValueParserIconCompatParcelizer = audioAttributesCompatParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractFloatValueParserIconCompatParcelizer, abstractFloatValueParser)) {
                break;
            }
            reportWeirdUCS4 remoteActionCompatParcelizer2 = snapshotStateList.getRemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer2, "");
            checkUTF16 checkutf162 = (checkUTF16) remoteActionCompatParcelizer2;
            SnapshotStateList<T> snapshotStateList2 = snapshotStateList;
            synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                parsedigitsrecursiveAudioAttributesCompatParcelizer = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer();
                zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((checkUTF16) toChars3.IconCompatParcelizer(checkutf162, snapshotStateList2, parsedigitsrecursiveAudioAttributesCompatParcelizer), iWrite, abstractFloatValueParserIconCompatParcelizer, true);
            }
            toChars3.AudioAttributesCompatParcelizer(parsedigitsrecursiveAudioAttributesCompatParcelizer, snapshotStateList2);
        } while (!zAudioAttributesCompatParcelizer);
        return boolInvoke.booleanValue();
    }

    public static final <T> int IconCompatParcelizer(SnapshotStateList<T> snapshotStateList) {
        reportWeirdUCS4 remoteActionCompatParcelizer = snapshotStateList.getRemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
        return ((checkUTF16) toChars3.IconCompatParcelizer((checkUTF16) remoteActionCompatParcelizer)).getWrite();
    }
}
