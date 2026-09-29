package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001e\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002\u001a5\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r0\u000b\"\b\b\u0000\u0010\f*\u00020\t\"\b\b\u0001\u0010\r*\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010\u000f\u001a(\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0002\u001a\u001a\u0010\u0014\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0007H\u0002\u001a\u001a\u0010\u0018\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0007H\u0002\u001a,\u0010\u0019\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0002\u001a$\u0010\u001e\u001a\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0002\u001a\u001c\u0010!\u001a\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010\u0017\u001a\u00020\u0007H\u0002\u001a\"\u0010\"\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0002\u001a7\u0010#\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010%H\u0082\b\u001a\f\u0010&\u001a\u00020\u0007*\u00020'H\u0002\u001a\f\u0010(\u001a\u00020'*\u00020\u0007H\u0002\u001a\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0015*\u00020*2\u0006\u0010+\u001a\u00020,H\u0002\u001a\u001c\u0010-\u001a\u00020\u0007*\u00020.2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007H\u0002\u001a$\u00100\u001a\u00020\u0007*\u00020.2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007H\u0002\"\u0018\u00104\u001a\u00020\t*\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\"\u001e\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u001609j\b\u0012\u0004\u0012\u00020\u0016`:X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"deactivateCurrentGroup", "", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "removeData", "index", "", "data", "", "multiMap", "Landroidx/compose/runtime/collection/MultiValueMap;", "K", "V", "initialCapacity", "(I)Landroidx/collection/MutableScatterMap;", "getKey", AppMeasurementSdk.ConditionalUserProperty.VALUE, TtmlNode.LEFT, TtmlNode.RIGHT, "findLocation", "", "Landroidx/compose/runtime/Invalidation;", "location", "findInsertLocation", "insertIfMissing", "", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "instance", "firstInRange", TtmlNode.START, TtmlNode.END, "removeLocation", "removeRange", "forEachInRange", "block", "Lkotlin/Function1;", "asInt", "", "asBool", "collectNodesFrom", "Landroidx/compose/runtime/SlotTable;", "anchor", "Landroidx/compose/runtime/Anchor;", "distanceFrom", "Landroidx/compose/runtime/SlotReader;", "root", "nearestCommonRootOf", CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, "b", "common", "joinedKey", "Landroidx/compose/runtime/KeyInfo;", "getJoinedKey", "(Landroidx/compose/runtime/KeyInfo;)Ljava/lang/Object;", "InvalidationLocationAscending", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "rootKey", "nodeKey", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class convertNumberToBigDecimal {
    private static final Comparator<filterStartObject> read = new Comparator() { // from class: o.convertNumberToDouble
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return convertNumberToBigDecimal.RemoteActionCompatParcelizer((filterStartObject) obj, (filterStartObject) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int write(boolean z) {
        return z ? 1 : 0;
    }

    public static final void IconCompatParcelizer(final setEncoding setencoding, final allocConcatBuffer allocconcatbuffer) {
        setencoding.AudioAttributesCompatParcelizer(setencoding.getAudioAttributesImplApi26Parcelizer(), new MagicModuleSubmissionRequestBody() { // from class: o.convertNumberToBigInteger
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return convertNumberToBigDecimal.write(allocconcatbuffer, setencoding, ((Integer) obj).intValue(), obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(allocConcatBuffer allocconcatbuffer, setEncoding setencoding, int i, Object obj) {
        if (obj instanceof _getByteArrayBuilder) {
            allocconcatbuffer.IconCompatParcelizer((_getByteArrayBuilder) obj);
        } else if (!(obj instanceof allocWriteEncodingBuffer)) {
            if (obj instanceof constructReadConstrainedTextBuffer) {
                RemoteActionCompatParcelizer(setencoding, i, obj);
                allocconcatbuffer.AudioAttributesCompatParcelizer((constructReadConstrainedTextBuffer) obj);
            } else if (obj instanceof rawReference) {
                RemoteActionCompatParcelizer(setencoding, i, obj);
                ((rawReference) obj).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
        }
        return getShowPopup.INSTANCE;
    }

    private static final void RemoteActionCompatParcelizer(setEncoding setencoding, int i, Object obj) {
        Object objRemoteActionCompatParcelizer = setencoding.RemoteActionCompatParcelizer(i);
        if (obj == objRemoteActionCompatParcelizer) {
            return;
        }
        StringBuilder sb = new StringBuilder("Slot table is out of sync (expected ");
        sb.append(obj);
        sb.append(", got ");
        sb.append(objRemoteActionCompatParcelizer);
        sb.append(')');
        _validJsonValueList.AudioAttributesCompatParcelizer(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> setKeyListener<Object, Object> write(int i) {
        return OutputDecorator.write(new setKeyListener(i));
    }

    private static final int write(List<filterStartObject> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int i4 = toMagicModuleMetaRepoModel.read(list.get(i3).getRead(), i);
            if (i4 < 0) {
                i2 = i3 + 1;
            } else {
                if (i4 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int read(List<filterStartObject> list, int i) {
        int iWrite = write(list, i);
        return iWrite < 0 ? -(iWrite + 1) : iWrite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(List<filterStartObject> list, int i, rawReference rawreference, Object obj) {
        int iWrite = write(list, i);
        if (iWrite < 0) {
            int i2 = -(iWrite + 1);
            if (!(obj instanceof reportInvalidNumber)) {
                obj = null;
            }
            list.add(i2, new filterStartObject(rawreference, i, obj));
            return;
        }
        filterStartObject filterstartobject = list.get(iWrite);
        if (obj instanceof reportInvalidNumber) {
            Object remoteActionCompatParcelizer = filterstartobject.getRemoteActionCompatParcelizer();
            if (remoteActionCompatParcelizer == null) {
                filterstartobject.RemoteActionCompatParcelizer(obj);
                return;
            } else if (remoteActionCompatParcelizer instanceof setEmojiCompatEnabled) {
                ((setEmojiCompatEnabled) remoteActionCompatParcelizer).write(obj);
                return;
            } else {
                filterstartobject.RemoteActionCompatParcelizer(setSupportAllCaps.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, obj));
                return;
            }
        }
        filterstartobject.RemoteActionCompatParcelizer(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final filterStartObject read(List<filterStartObject> list, int i, int i2) {
        int i3 = read(list, i);
        if (i3 >= list.size()) {
            return null;
        }
        filterStartObject filterstartobject = list.get(i3);
        if (filterstartobject.getRead() < i2) {
            return filterstartobject;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final filterStartObject IconCompatParcelizer(List<filterStartObject> list, int i) {
        int iWrite = write(list, i);
        if (iWrite >= 0) {
            return list.remove(iWrite);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(List<filterStartObject> list, int i, int i2) {
        int i3 = read(list, i);
        while (i3 < list.size() && list.get(i3).getRead() < i2) {
            list.remove(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> RemoteActionCompatParcelizer(releaseTokenBuffer releasetokenbuffer, _parseSlowFloat _parseslowfloat) {
        ArrayList arrayList = new ArrayList();
        releaseBase64Buffer releasebase64bufferMediaBrowserCompatMediaItem = releasetokenbuffer.MediaBrowserCompatMediaItem();
        try {
            IconCompatParcelizer(releasebase64bufferMediaBrowserCompatMediaItem, arrayList, releasetokenbuffer.IconCompatParcelizer(_parseslowfloat));
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            return arrayList;
        } finally {
            releasebase64bufferMediaBrowserCompatMediaItem.IconCompatParcelizer();
        }
    }

    private static final void IconCompatParcelizer(releaseBase64Buffer releasebase64buffer, List<Object> list, int i) {
        if (releasebase64buffer.AudioAttributesImplBaseParcelizer(i)) {
            list.add(releasebase64buffer.MediaBrowserCompatSearchResultReceiver(i));
            return;
        }
        int iMediaBrowserCompatCustomActionResultReceiver = i + 1;
        int iMediaBrowserCompatCustomActionResultReceiver2 = releasebase64buffer.MediaBrowserCompatCustomActionResultReceiver(i);
        while (iMediaBrowserCompatCustomActionResultReceiver < i + iMediaBrowserCompatCustomActionResultReceiver2) {
            IconCompatParcelizer(releasebase64buffer, list, iMediaBrowserCompatCustomActionResultReceiver);
            iMediaBrowserCompatCustomActionResultReceiver += releasebase64buffer.MediaBrowserCompatCustomActionResultReceiver(iMediaBrowserCompatCustomActionResultReceiver);
        }
    }

    private static final int AudioAttributesCompatParcelizer(releaseBase64Buffer releasebase64buffer, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = releasebase64buffer.RatingCompat(i);
            i3++;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int write(releaseBase64Buffer releasebase64buffer, int i, int i2, int i3) {
        if (i != i2) {
            if (i == i3 || i2 == i3) {
                return i3;
            }
            if (releasebase64buffer.RatingCompat(i) == i2) {
                return i2;
            }
            if (releasebase64buffer.RatingCompat(i2) != i) {
                if (releasebase64buffer.RatingCompat(i) == releasebase64buffer.RatingCompat(i2)) {
                    return releasebase64buffer.RatingCompat(i);
                }
                int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(releasebase64buffer, i, i3);
                int iAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(releasebase64buffer, i2, i3);
                for (int i4 = 0; i4 < iAudioAttributesCompatParcelizer - iAudioAttributesCompatParcelizer2; i4++) {
                    i = releasebase64buffer.RatingCompat(i);
                }
                for (int i5 = 0; i5 < iAudioAttributesCompatParcelizer2 - iAudioAttributesCompatParcelizer; i5++) {
                    i2 = releasebase64buffer.RatingCompat(i2);
                }
                while (i != i2) {
                    i = releasebase64buffer.RatingCompat(i);
                    i2 = releasebase64buffer.RatingCompat(i2);
                }
                return i;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object RemoteActionCompatParcelizer(includeProperty includeproperty) {
        return includeproperty.getWrite() != null ? new includeEmptyObject(Integer.valueOf(includeproperty.getIconCompatParcelizer()), includeproperty.getWrite()) : Integer.valueOf(includeproperty.getIconCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(filterStartObject filterstartobject, filterStartObject filterstartobject2) {
        return toMagicModuleMetaRepoModel.read(filterstartobject.getRead(), filterstartobject2.getRead());
    }
}
