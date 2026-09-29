package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaE {
    public static final void write(_handleOddName _handleoddname, final String str, final List<String> list, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        _handleOddName _handleoddname3;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-933358862);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            _handleoddname2 = _handleoddname;
        } else if ((i & 6) == 0) {
            _handleoddname2 = _handleoddname;
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname2) ? 4 : 2) | i;
        } else {
            _handleoddname2 = _handleoddname;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 256 : 128;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 147) != 146, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            _handleoddname3 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-933358862, i3, -1, "com.marrow2.ui.review_components.ui.description.child.UserTagLayout (UserTagLayout.kt:22)");
            }
            dismissNow.AudioAttributesCompatParcelizer(_handleoddname3, null, WindowInsetsCompatImpl30.INSTANCE.read(), null, 0, 0, multiplyFft.AudioAttributesCompatParcelizer(-1333224553, true, new getModuleData() { // from class: o.zzaK
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return zzaE.IconCompatParcelizer(str, list, (setCancelable) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, (i3 & 14) | 1573248, 58);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname4 = _handleoddname3;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzaJ
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzaE.RemoteActionCompatParcelizer(_handleoddname4, str, list, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(String str, final List list, setCancelable setcancelable, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(setcancelable, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1333224553, i, -1, "com.marrow2.ui.review_components.ui.description.child.UserTagLayout.<anonymous> (UserTagLayout.kt:28)");
            }
            int i2 = paramName.INSTANCE.read();
            deserializeWithObjectId deserializewithobjectidAudioAttributesImplBaseParcelizer = TypeKt.AudioAttributesImplBaseParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(str, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetCaptioningEnabled(), 0L, null, null, null, 0L, null, null, 0L, i2, false, 1, 0, null, deserializewithobjectidAudioAttributesImplBaseParcelizer, _handleunrecognizedcharacterescape, 0, 3504, 51194);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescape, 6);
            int size = list.size();
            for (final int i3 = 0; i3 < size; i3++) {
                MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                setOnAnimationStop.read(null, setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(2.0f)), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getAudioAttributesImplApi26Parcelizer(), 0L, null, BitmapDescriptorFactory.HUE_RED, multiplyFft.AudioAttributesCompatParcelizer(1160421124, true, new MagicModuleSubmissionRequestBody() { // from class: o.zzaH
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return zzaE.IconCompatParcelizer(list, i3, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                    }
                }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 1572864, 57);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescape, 6);
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(List list, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1160421124, i2, -1, "com.marrow2.ui.review_components.ui.description.child.UserTagLayout.<anonymous>.<anonymous>.<anonymous> (UserTagLayout.kt:42)");
            }
            _copyCurrentStringValue.IconCompatParcelizer((String) list.get(i), getParentFragment.IconCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(4.0f)), enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).IconCompatParcelizer(), 0L, null, null, null, 0L, null, null, 0L, paramName.INSTANCE.read(), false, 1, 0, null, TypeKt.MediaBrowserCompatItemReceiver(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 48, 3504, 51192);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleOddName _handleoddname, String str, List list, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(_handleoddname, str, list, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
