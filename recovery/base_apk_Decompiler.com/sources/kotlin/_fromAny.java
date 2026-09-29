package kotlin;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import kotlin._resolveSuperClass;
import kotlin.collectAndResolveSubtypesByTypeId;
import kotlin.initExtraTracks;
import kotlin.unknownType;

/* JADX INFO: loaded from: classes2.dex */
public final class _fromAny {
    public static _resolveSuperClass.read write(_verifyAndResolvePlaceholders _verifyandresolveplaceholders) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iMediaBrowserCompatCustomActionResultReceiver = _verifyandresolveplaceholders.MediaBrowserCompatCustomActionResultReceiver();
        int i = 0;
        for (int i2 = 0; i2 < iMediaBrowserCompatCustomActionResultReceiver; i2++) {
            if (_verifyandresolveplaceholders.write(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new _resolveSuperClass.read(1, 0, iMediaBrowserCompatCustomActionResultReceiver, i);
    }

    public static collectAndResolveSubtypesByTypeId AudioAttributesCompatParcelizer(unknownType.write writeVar, _referenceType[] _referencetypeArr) {
        List[] listArr = new List[_referencetypeArr.length];
        for (int i = 0; i < _referencetypeArr.length; i++) {
            _referenceType _referencetype = _referencetypeArr[i];
            listArr[i] = _referencetype != null ? initExtraTracks.read(_referencetype) : initExtraTracks.AudioAttributesImplApi26Parcelizer();
        }
        return AudioAttributesCompatParcelizer(writeVar, (List<? extends _referenceType>[]) listArr);
    }

    private static collectAndResolveSubtypesByTypeId AudioAttributesCompatParcelizer(unknownType.write writeVar, List<? extends _referenceType>[] listArr) {
        boolean z;
        initExtraTracks.IconCompatParcelizer iconCompatParcelizer = new initExtraTracks.IconCompatParcelizer();
        for (int i = 0; i < writeVar.write(); i++) {
            _writeAsBinary _writeasbinaryWrite = writeVar.write(i);
            List<? extends _referenceType> list = listArr[i];
            for (int i2 = 0; i2 < _writeasbinaryWrite.RemoteActionCompatParcelizer; i2++) {
                setName setnameRemoteActionCompatParcelizer = _writeasbinaryWrite.RemoteActionCompatParcelizer(i2);
                boolean z2 = writeVar.AudioAttributesCompatParcelizer(i, i2) != 0;
                int[] iArr = new int[setnameRemoteActionCompatParcelizer.write];
                boolean[] zArr = new boolean[setnameRemoteActionCompatParcelizer.write];
                for (int i3 = 0; i3 < setnameRemoteActionCompatParcelizer.write; i3++) {
                    iArr[i3] = writeVar.AudioAttributesCompatParcelizer(i, i2, i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= list.size()) {
                            z = false;
                            break;
                        }
                        _referenceType _referencetype = list.get(i4);
                        if (_referencetype.AudioAttributesImplBaseParcelizer().equals(setnameRemoteActionCompatParcelizer) && _referencetype.RemoteActionCompatParcelizer(i3) != -1) {
                            z = true;
                            break;
                        }
                        i4++;
                    }
                    zArr[i3] = z;
                }
                iconCompatParcelizer.read(new collectAndResolveSubtypesByTypeId.write(setnameRemoteActionCompatParcelizer, z2, iArr, zArr));
            }
        }
        _writeAsBinary _writeasbinaryIconCompatParcelizer = writeVar.IconCompatParcelizer();
        for (int i5 = 0; i5 < _writeasbinaryIconCompatParcelizer.RemoteActionCompatParcelizer; i5++) {
            setName setnameRemoteActionCompatParcelizer2 = _writeasbinaryIconCompatParcelizer.RemoteActionCompatParcelizer(i5);
            int[] iArr2 = new int[setnameRemoteActionCompatParcelizer2.write];
            Arrays.fill(iArr2, 0);
            iconCompatParcelizer.read(new collectAndResolveSubtypesByTypeId.write(setnameRemoteActionCompatParcelizer2, false, iArr2, new boolean[setnameRemoteActionCompatParcelizer2.write]));
        }
        return new collectAndResolveSubtypesByTypeId(iconCompatParcelizer.IconCompatParcelizer());
    }
}
