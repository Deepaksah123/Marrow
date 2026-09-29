package kotlin;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultSsChunkSourceStreamElementIterator {
    private static final List<String> AudioAttributesCompatParcelizer;

    static {
        parseEac3SupplementalProperties parseeac3supplementalproperties = parseEac3SupplementalProperties.INSTANCE;
        newEncryptedObject newencryptedobject = new newEncryptedObject(2000, parseEac3SupplementalProperties.RemoteActionCompatParcelizer());
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobject, 10));
        Iterator<Integer> it = newencryptedobject.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((getSINGLE_SYNC_RESULT) it).RemoteActionCompatParcelizer()));
        }
        AudioAttributesCompatParcelizer = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteActionCompatParcelizer(final java.lang.String r21, kotlin._handleOddName r22, final kotlin.getAnswerMap<? super java.lang.String, kotlin.getShowPopup> r23, kotlin._handleUnrecognizedCharacterEscape r24, final int r25, final int r26) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultSsChunkSourceStreamElementIterator.RemoteActionCompatParcelizer(java.lang.String, o._handleOddName, o.getAnswerMap, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getAnswerMap getanswermap, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        String str2 = str;
        if (!TextUtils.isDigitsOnly(str2) || str2.length() <= 0) {
            str = "";
        }
        getanswermap.invoke(str);
        return getShowPopup.INSTANCE;
    }

    private static final void write(final String str, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1322867869);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1322867869, i2, -1, "com.marrow.kt.ui.activities.profile.education.updateYearsList (YearSelectionLayout.kt:63)");
            }
            List<String> list = AudioAttributesCompatParcelizer;
            int iIndexOf = list.indexOf(str) + 1;
            int iWrite = IntermediateLoginResponseBody.write((List) list);
            if (iIndexOf <= iWrite) {
                while (true) {
                    AudioAttributesCompatParcelizer.remove(iIndexOf);
                    if (iIndexOf == iWrite) {
                        break;
                    } else {
                        iIndexOf++;
                    }
                }
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.SsChunkSourceFactory
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultSsChunkSourceStreamElementIterator.read(str, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str, _handleOddName _handleoddname, getAnswerMap getanswermap, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(str, _handleoddname, getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(str, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
