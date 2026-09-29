package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\r\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\n*\u00020\u0006H\u0002¢\u0006\u0004\b\u0003\u0010\r\u001a\u0013\u0010\f\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\u0010"}, d2 = {"", "p0", "Lo/_skipCComment;", "write", "(Ljava/lang/String;)Lo/_skipCComment;", "read", "Lo/_parseSignedNumber;", "", "IconCompatParcelizer", "(Lo/_parseSignedNumber;)Z", "", "Lo/_nextTokenNotInObject;", "RemoteActionCompatParcelizer", "(Lo/_parseSignedNumber;)Ljava/util/List;", "AudioAttributesCompatParcelizer", "Lo/_parseFloat;", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _skipAfterComma2 {
    public static final _skipCComment write(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            return read(str);
        } catch (_parseNumber2 e) {
            imag.write(e.getMessage(), e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin._skipCComment read(java.lang.String r14) throws kotlin._parseNumber2 {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._skipAfterComma2.read(java.lang.String):o._skipCComment");
    }

    private static final boolean IconCompatParcelizer(_parseSignedNumber _parsesignednumber) {
        return _parsesignednumber.getIconCompatParcelizer() < _parsesignednumber.getAudioAttributesCompatParcelizer().length() - 1 && Character.isLetter(_parsesignednumber.getAudioAttributesCompatParcelizer().charAt(_parsesignednumber.getIconCompatParcelizer())) && _parsesignednumber.getAudioAttributesCompatParcelizer().charAt(_parsesignednumber.getIconCompatParcelizer() + 1) == '(';
    }

    private static final List<_nextTokenNotInObject> RemoteActionCompatParcelizer(_parseSignedNumber _parsesignednumber) throws _parseNumber2 {
        String strRemoteActionCompatParcelizer;
        _parsesignednumber.RemoteActionCompatParcelizer(2);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (!_parsesignednumber.AudioAttributesCompatParcelizer() && !_parsesignednumber.RemoteActionCompatParcelizer(')')) {
            if (_parsesignednumber.RemoteActionCompatParcelizer('!')) {
                _parseSignedNumber.RemoteActionCompatParcelizer$default(_parsesignednumber, 0, 1, null);
                String strAudioAttributesCompatParcelizer = _parsesignednumber.AudioAttributesCompatParcelizer("!,)");
                if (strAudioAttributesCompatParcelizer.length() != 0) {
                    int i = Integer.parseInt(strAudioAttributesCompatParcelizer);
                    int i2 = 0;
                    while (i > 0) {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                if (((_nextTokenNotInObject) arrayList.get(i3)).getWrite() == i2) {
                                    i2++;
                                    break;
                                }
                                i3++;
                            } else {
                                arrayList.add(new _nextTokenNotInObject(i2, null, null, 6, null));
                                i--;
                                break;
                            }
                        }
                    }
                } else {
                    z = true;
                }
            } else {
                int iRemoteActionCompatParcelizer = _parsesignednumber.RemoteActionCompatParcelizer("!:,)");
                if (_parsesignednumber.RemoteActionCompatParcelizer(':')) {
                    _parseSignedNumber.RemoteActionCompatParcelizer$default(_parsesignednumber, 0, 1, null);
                    strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(_parsesignednumber.AudioAttributesCompatParcelizer("!,)"));
                } else {
                    strRemoteActionCompatParcelizer = null;
                }
                if (z) {
                    int i4 = 0;
                    while (i4 < iRemoteActionCompatParcelizer) {
                        int size2 = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 < size2) {
                                if (((_nextTokenNotInObject) arrayList.get(i5)).getWrite() == i4) {
                                    i4++;
                                    break;
                                }
                                i5++;
                            } else {
                                arrayList.add(new _nextTokenNotInObject(i4, null, null, 6, null));
                                break;
                            }
                        }
                    }
                    z = false;
                }
                arrayList.add(new _nextTokenNotInObject(iRemoteActionCompatParcelizer, null, strRemoteActionCompatParcelizer, 2, null));
            }
            if (_parsesignednumber.RemoteActionCompatParcelizer(',')) {
                _parseSignedNumber.RemoteActionCompatParcelizer$default(_parsesignednumber, 0, 1, null);
            }
        }
        _parsesignednumber.IconCompatParcelizer(')');
        _parseSignedNumber.RemoteActionCompatParcelizer$default(_parsesignednumber, 0, 1, null);
        return arrayList;
    }

    private static final List<_nextTokenNotInObject> AudioAttributesCompatParcelizer(_parseSignedNumber _parsesignednumber) throws _parseNumber2 {
        String strRemoteActionCompatParcelizer;
        _parsesignednumber.RemoteActionCompatParcelizer(2);
        ArrayList arrayList = new ArrayList();
        while (!_parsesignednumber.AudioAttributesCompatParcelizer() && !_parsesignednumber.RemoteActionCompatParcelizer(')')) {
            String strAudioAttributesCompatParcelizer = _parsesignednumber.AudioAttributesCompatParcelizer(":,)");
            if (_parsesignednumber.RemoteActionCompatParcelizer(':')) {
                _parseSignedNumber.RemoteActionCompatParcelizer$default(_parsesignednumber, 0, 1, null);
                strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(_parsesignednumber.AudioAttributesCompatParcelizer(",)"));
            } else {
                strRemoteActionCompatParcelizer = null;
            }
            arrayList.add(new _nextTokenNotInObject(arrayList.size(), strAudioAttributesCompatParcelizer, strRemoteActionCompatParcelizer));
            if (_parsesignednumber.RemoteActionCompatParcelizer(',')) {
                _parseSignedNumber.RemoteActionCompatParcelizer$default(_parsesignednumber, 0, 1, null);
            }
        }
        _parsesignednumber.IconCompatParcelizer(')');
        _parseSignedNumber.RemoteActionCompatParcelizer$default(_parsesignednumber, 0, 1, null);
        return arrayList;
    }

    private static final List<_parseFloat> write(_parseSignedNumber _parsesignednumber) throws _parseNumber2 {
        boolean z;
        Integer numValueOf;
        ArrayList arrayList = new ArrayList();
        while (!_parsesignednumber.AudioAttributesCompatParcelizer() && !_parsesignednumber.RemoteActionCompatParcelizer(':')) {
            if (_parsesignednumber.RemoteActionCompatParcelizer('*')) {
                _parseSignedNumber.RemoteActionCompatParcelizer$default(_parsesignednumber, 0, 1, null);
                z = true;
            } else {
                z = false;
            }
            Integer numValueOf2 = !_parsesignednumber.RemoteActionCompatParcelizer('@') ? Integer.valueOf(_parsesignednumber.RemoteActionCompatParcelizer("@") + 1) : null;
            _parseSignedNumber.RemoteActionCompatParcelizer$default(_parsesignednumber, 0, 1, null);
            int iRemoteActionCompatParcelizer = _parsesignednumber.RemoteActionCompatParcelizer("L,:");
            if (_parsesignednumber.RemoteActionCompatParcelizer('L')) {
                _parseSignedNumber.RemoteActionCompatParcelizer$default(_parsesignednumber, 0, 1, null);
                numValueOf = Integer.valueOf(_parsesignednumber.RemoteActionCompatParcelizer(",:"));
            } else {
                numValueOf = null;
            }
            arrayList.add(new _parseFloat(numValueOf2 != null ? numValueOf2.intValue() : -1, iRemoteActionCompatParcelizer, numValueOf != null ? numValueOf.intValue() : -1, z));
            if (_parsesignednumber.RemoteActionCompatParcelizer(',')) {
                _parseSignedNumber.RemoteActionCompatParcelizer$default(_parsesignednumber, 0, 1, null);
            }
        }
        _parseSignedNumber.RemoteActionCompatParcelizer$default(_parsesignednumber, 0, 1, null);
        return arrayList;
    }

    private static final String RemoteActionCompatParcelizer(String str) {
        return TestGroupLSModel.RemoteActionCompatParcelizer(str, "c#", "androidx.compose.", false);
    }
}
