package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\b\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\u000e\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0010\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u0006"}, d2 = {"", "Lo/_findCustomArrayDeserializer;", "p0", "", "p1", "read", "(Ljava/util/List;I)I", "", "IconCompatParcelizer", "(Ljava/util/List;F)I", "Lo/findProperty;", "Lkotlin/Function1;", "", "p2", "AudioAttributesCompatParcelizer", "(Ljava/util/List;JLo/getAnswerMap;)V", "write"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _addExplicitConstructorCreators {
    public static final int read(List<_findCustomArrayDeserializer> list, int i) {
        int i2;
        byte b;
        int remoteActionCompatParcelizer = ((_findCustomArrayDeserializer) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) list)).getRemoteActionCompatParcelizer();
        if (i > ((_findCustomArrayDeserializer) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) list)).getRemoteActionCompatParcelizer()) {
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(i);
            sb.append(" should be less or equal than last line's end ");
            sb.append(remoteActionCompatParcelizer);
            withStackTrace.read(sb.toString());
        }
        int size = list.size() - 1;
        int i3 = 0;
        while (true) {
            if (i3 > size) {
                i2 = -(i3 + 1);
                break;
            }
            i2 = (i3 + size) >>> 1;
            _findCustomArrayDeserializer _findcustomarraydeserializer = list.get(i2);
            if (_findcustomarraydeserializer.getIconCompatParcelizer() > i) {
                b = 1;
            } else {
                b = _findcustomarraydeserializer.getRemoteActionCompatParcelizer() <= i ? (byte) -1 : (byte) 0;
            }
            if (b >= 0) {
                if (b <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i3 = i2 + 1;
            }
        }
        if (i2 < 0 || i2 >= list.size()) {
            StringBuilder sb2 = new StringBuilder("Found paragraph index ");
            sb2.append(i2);
            sb2.append(" should be in range [0, ");
            sb2.append(list.size());
            sb2.append(").\nDebug info: index=");
            sb2.append(i);
            sb2.append(", paragraphs=[");
            sb2.append(ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer(list, null, null, null, 0, null, new getAnswerMap() { // from class: o._addExplicitPropertyCreator
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return _addExplicitConstructorCreators.AudioAttributesCompatParcelizer((_findCustomArrayDeserializer) obj);
                }
            }, 31, null));
            sb2.append(']');
            withStackTrace.read(sb2.toString());
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence AudioAttributesCompatParcelizer(_findCustomArrayDeserializer _findcustomarraydeserializer) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(_findcustomarraydeserializer.getIconCompatParcelizer());
        sb.append(", ");
        sb.append(_findcustomarraydeserializer.getRemoteActionCompatParcelizer());
        sb.append(')');
        return sb.toString();
    }

    public static final int IconCompatParcelizer(List<_findCustomArrayDeserializer> list, float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        if (f >= ((_findCustomArrayDeserializer) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) list)).getAudioAttributesImplBaseParcelizer()) {
            return IntermediateLoginResponseBody.write((List) list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            _findCustomArrayDeserializer _findcustomarraydeserializer = list.get(i2);
            byte b = _findcustomarraydeserializer.getAudioAttributesImplApi21Parcelizer() > f ? (byte) 1 : _findcustomarraydeserializer.getAudioAttributesImplBaseParcelizer() <= f ? (byte) -1 : (byte) 0;
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void AudioAttributesCompatParcelizer(List<_findCustomArrayDeserializer> list, long j, getAnswerMap<? super _findCustomArrayDeserializer, getShowPopup> getanswermap) {
        int size = list.size();
        for (int i = read(list, findProperty.MediaBrowserCompatCustomActionResultReceiver(j)); i < size; i++) {
            _findCustomArrayDeserializer _findcustomarraydeserializer = list.get(i);
            if (_findcustomarraydeserializer.getIconCompatParcelizer() >= findProperty.AudioAttributesImplApi26Parcelizer(j)) {
                return;
            }
            if (_findcustomarraydeserializer.getIconCompatParcelizer() != _findcustomarraydeserializer.getRemoteActionCompatParcelizer()) {
                getanswermap.invoke(_findcustomarraydeserializer);
            }
        }
    }

    public static final int write(List<_findCustomArrayDeserializer> list, int i) {
        byte b;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            _findCustomArrayDeserializer _findcustomarraydeserializer = list.get(i3);
            if (_findcustomarraydeserializer.getWrite() > i) {
                b = 1;
            } else {
                b = _findcustomarraydeserializer.getRead() <= i ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }
}
