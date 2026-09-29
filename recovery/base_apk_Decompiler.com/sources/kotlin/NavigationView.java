package kotlin;

import java.util.List;
import kotlin.buildCacheKey;

/* JADX INFO: loaded from: classes4.dex */
public final class NavigationView {
    public static final NavigationView AudioAttributesCompatParcelizer = new NavigationView();

    private NavigationView() {
    }

    public final void read(_handleOddName _handleoddname, final setTextAppearanceResource settextappearanceresource, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        final _handleOddName _handleoddname2;
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        toMagicModuleMetaRepoModel.write(settextappearanceresource, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1229528503);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            _handleoddname2 = _handleoddname;
        } else if ((i & 6) == 0) {
            _handleoddname2 = _handleoddname;
            i3 = i | (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname2) ? 4 : 2);
        } else {
            _handleoddname2 = _handleoddname;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(settextappearanceresource) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 19) != 18, i3 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            _handleOddName _handleoddname3 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1229528503, i3, -1, "com.marrow2.ui.theme.ThemePreviewElements.GetTestPreview (ThemePreviewElements.kt:17)");
            }
            _handleOddName _handleoddnameIconCompatParcelizer = getParentFragment.IconCompatParcelizer(_handleoddname3, assignParameter.IconCompatParcelizer(16.0f));
            readBlockToCache readblocktocache = readBlockToCache.AudioAttributesImplApi26Parcelizer;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new MagicModuleSubmissionRequestBody() { // from class: o.setItemHorizontalPadding
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return NavigationView.RemoteActionCompatParcelizer((String) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = (MagicModuleSubmissionRequestBody) objOnPause;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getAnswerMap() { // from class: o.setItemHorizontalPaddingResource
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return NavigationView.IconCompatParcelizer((String) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            getAnswerMap getanswermap = (getAnswerMap) objOnPause2;
            Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new MagicModuleSubmissionRequestBody() { // from class: o.setItemIconPadding
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return NavigationView.MediaBrowserCompatItemReceiver((String) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
            }
            MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2 = (MagicModuleSubmissionRequestBody) objOnPause3;
            Object objOnPause4 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new getCreatedOnDateMs() { // from class: o.setItemIconPaddingResource
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return NavigationView.AudioAttributesImplApi26Parcelizer();
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause4);
            }
            getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause4;
            Object objOnPause5 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause5 = new getAnswerMap() { // from class: o.setItemTextAppearance
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return NavigationView.AudioAttributesImplBaseParcelizer();
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause5);
            }
            getAnswerMap getanswermap2 = (getAnswerMap) objOnPause5;
            Object objOnPause6 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause6 = new getCreatedOnDateMs() { // from class: o.setNavigationItemSelectedListener
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return NavigationView.MediaBrowserCompatItemReceiver();
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause6);
            }
            getCreatedOnDateMs getcreatedondatems2 = (getCreatedOnDateMs) objOnPause6;
            Object objOnPause7 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause7 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause7 = new getAnswerMap() { // from class: o.setItemVerticalPadding
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return NavigationView.AudioAttributesImplApi21Parcelizer();
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause7);
            }
            _handleOddName _handleoddname4 = _handleoddname3;
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            setCircularRevealOverlayDrawable.RemoteActionCompatParcelizer(_handleoddnameIconCompatParcelizer, settextappearanceresource, magicModuleSubmissionRequestBody, "12345345", getanswermap, readblocktocache, magicModuleSubmissionRequestBody2, getcreatedondatems, false, getanswermap2, getcreatedondatems2, (getAnswerMap) objOnPause7, _handleunrecognizedcharacterescapeWrite, (i3 & 112) | 920350080, 54);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = _handleoddname4;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setItemMaxLines
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return NavigationView.write(this.RemoteActionCompatParcelizer, _handleoddname2, settextappearanceresource, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver() {
        return getShowPopup.INSTANCE;
    }

    public final void read(_handleOddName _handleoddname, final zzhr zzhrVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        final _handleOddName _handleoddname2;
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        toMagicModuleMetaRepoModel.write(zzhrVar, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1255217644);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            _handleoddname2 = _handleoddname;
        } else if ((i & 6) == 0) {
            _handleoddname2 = _handleoddname;
            i3 = i | (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname2) ? 4 : 2);
        } else {
            _handleoddname2 = _handleoddname;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(zzhrVar) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 19) != 18, i3 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            _handleOddName _handleoddname3 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1255217644, i3, -1, "com.marrow2.ui.theme.ThemePreviewElements.GetMcqPreview (ThemePreviewElements.kt:36)");
            }
            List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(new buildCacheKey.IconCompatParcelizer("<p>The hypoglossal nerve is purely motor cranial nerve and is not involved in olfaction.</p>\n<p>The other three cranial nerves -&nbsp; trigeminal, glossopharyngeal and vagus nerve are mixed cranial nerves and contribute in olfaction.</p>", 1, null, "html", 0L, 0L, false, 116, null));
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new setSelectedItemId();
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            clearTileCache.write(_handleoddname3, zzhrVar, listRemoteActionCompatParcelizer, 1, true, false, (getCreatedOnDateMs) objOnPause, true, null, null, true, _handleunrecognizedcharacterescapeWrite, (i3 & 14) | 14380032 | (i3 & 112), 6, 768);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = _handleoddname3;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setForceCompatClippingEnabled
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return NavigationView.read(this.AudioAttributesCompatParcelizer, _handleoddname2, zzhrVar, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(NavigationView navigationView, _handleOddName _handleoddname, zzhr zzhrVar, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        navigationView.read(_handleoddname, zzhrVar, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(NavigationView navigationView, _handleOddName _handleoddname, setTextAppearanceResource settextappearanceresource, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        navigationView.read(_handleoddname, settextappearanceresource, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
