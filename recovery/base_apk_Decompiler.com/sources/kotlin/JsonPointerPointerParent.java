package kotlin;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.Metadata;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0002\u0010\u0006\u001a;\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0003¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"rememberAccessibilityServiceState", "Landroidx/compose/runtime/State;", "", "listenToTouchExplorationState", "listenToSwitchAccessState", "listenToVoiceAccessState", "(ZZZLandroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "ObserveState", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "handleEvent", "Lkotlin/Function1;", "Landroidx/lifecycle/Lifecycle$Event;", "onDispose", "Lkotlin/Function0;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SwitchAccessActivityName", "", "VoiceAccessActivityName", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsonPointerPointerParent {
    public static final parseDouble<Boolean> AudioAttributesCompatParcelizer(boolean z, boolean z2, boolean z3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        boolean z4 = true;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            z3 = true;
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(432241692, i, -1, "androidx.compose.material3.internal.rememberAccessibilityServiceState (AccessibilityServiceStateProvider.android.kt:46)");
        }
        Object systemService = ((Context) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer())).getSystemService("accessibility");
        toMagicModuleMetaRepoModel.read(systemService, "");
        final AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        boolean z5 = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z)) || (i & 6) == 4;
        boolean z6 = (((i & 112) ^ 48) > 32 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z2)) || (i & 48) == 32;
        if ((((i & 896) ^ RendererCapabilities.MODE_SUPPORT_MASK) <= 256 || !_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z3)) && (i & RendererCapabilities.MODE_SUPPORT_MASK) != 256) {
            z4 = false;
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((z5 | z6 | z4) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new writeArrayValueSeparator(z, z2, z3);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        final writeArrayValueSeparator writearrayvalueseparator = (writeArrayValueSeparator) objOnPause;
        hasGetter hasgetter = (hasGetter) _handleunrecognizedcharacterescape.write(isIsGetterVisible.IconCompatParcelizer());
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(writearrayvalueseparator);
        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(accessibilityManager);
        Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
        if ((zAudioAttributesCompatParcelizer | zIconCompatParcelizer) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause2 = new getAnswerMap() { // from class: o.getNestingDepth
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return JsonPointerPointerParent.read(writearrayvalueseparator, accessibilityManager, (anyIgnorals.read) obj);
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
        }
        getAnswerMap getanswermap = (getAnswerMap) objOnPause2;
        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(writearrayvalueseparator);
        boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(accessibilityManager);
        Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
        if ((zAudioAttributesCompatParcelizer2 | zIconCompatParcelizer2) || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause3 = new getCreatedOnDateMs() { // from class: o.getEntryCount
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return JsonPointerPointerParent.write(writearrayvalueseparator, accessibilityManager);
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
        }
        AudioAttributesCompatParcelizer(hasgetter, (getAnswerMap<? super anyIgnorals.read, getShowPopup>) getanswermap, (getCreatedOnDateMs<getShowPopup>) objOnPause3, _handleunrecognizedcharacterescape, 0, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return writearrayvalueseparator;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lo/StreamConstraintsException$read;", "Lo/_wrapError;", "", "RemoteActionCompatParcelizer", "()V", "o/StreamConstraintsException$read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements _wrapError {
        final /* synthetic */ hasGetter IconCompatParcelizer;
        final /* synthetic */ findAccess RemoteActionCompatParcelizer;
        final /* synthetic */ getCreatedOnDateMs write;

        public read(getCreatedOnDateMs getcreatedondatems, hasGetter hasgetter, findAccess findaccess) {
            this.write = getcreatedondatems;
            this.IconCompatParcelizer = hasgetter;
            this.RemoteActionCompatParcelizer = findaccess;
        }

        @Override // kotlin._wrapError
        public final void RemoteActionCompatParcelizer() {
            this.write.invoke();
            this.IconCompatParcelizer.getLifecycle().AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(writeArrayValueSeparator writearrayvalueseparator, AccessibilityManager accessibilityManager, anyIgnorals.read readVar) {
        if (readVar == anyIgnorals.read.ON_RESUME) {
            writearrayvalueseparator.RemoteActionCompatParcelizer(accessibilityManager);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(writeArrayValueSeparator writearrayvalueseparator, AccessibilityManager accessibilityManager) {
        writearrayvalueseparator.AudioAttributesCompatParcelizer(accessibilityManager);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(anyIgnorals.read readVar) {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write() {
        return getShowPopup.INSTANCE;
    }

    private static final void AudioAttributesCompatParcelizer(final hasGetter hasgetter, final getAnswerMap<? super anyIgnorals.read, getShowPopup> getanswermap, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1868327245);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(hasgetter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 256 : 128;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 147) != 146, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (i4 != 0) {
                Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = new getAnswerMap() { // from class: o.JsonStreamContext
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return JsonPointerPointerParent.write((anyIgnorals.read) obj);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
                }
                getanswermap = (getAnswerMap) objOnPause;
            }
            if (i5 != 0) {
                Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
                if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause2 = new getCreatedOnDateMs() { // from class: o.writeExternal
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return JsonPointerPointerParent.write();
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
                }
                getcreatedondatems = (getCreatedOnDateMs) objOnPause2;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1868327245, i3, -1, "androidx.compose.material3.internal.ObserveState (AccessibilityServiceStateProvider.android.kt:82)");
            }
            boolean z = (i3 & 112) == 32;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(hasgetter);
            boolean z2 = (i3 & 896) == 256;
            Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z | zIconCompatParcelizer | z2) || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getAnswerMap() { // from class: o.getMessageSuffix
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return JsonPointerPointerParent.read(hasgetter, getanswermap, getcreatedondatems, (StreamConstraintsException) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
            }
            StreamReadException.RemoteActionCompatParcelizer(hasgetter, (getAnswerMap) objOnPause3, _handleunrecognizedcharacterescapeWrite, i3 & 14);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        final getAnswerMap<? super anyIgnorals.read, getShowPopup> getanswermap2 = getanswermap;
        final getCreatedOnDateMs<getShowPopup> getcreatedondatems2 = getcreatedondatems;
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.JsonProcessingException
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return JsonPointerPointerParent.read(hasgetter, getanswermap2, getcreatedondatems2, i, i2, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(getAnswerMap getanswermap, hasGetter hasgetter, anyIgnorals.read readVar) {
        getanswermap.invoke(readVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _wrapError read(hasGetter hasgetter, final getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems, StreamConstraintsException streamConstraintsException) {
        findAccess findaccess = new findAccess() { // from class: o.getCurrentIndex
            @Override // kotlin.findAccess
            public final void read(hasGetter hasgetter2, anyIgnorals.read readVar) {
                JsonPointerPointerParent.RemoteActionCompatParcelizer(getanswermap, hasgetter2, readVar);
            }
        };
        hasgetter.getLifecycle().IconCompatParcelizer(findaccess);
        return new read(getcreatedondatems, hasgetter, findaccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(hasGetter hasgetter, getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        AudioAttributesCompatParcelizer(hasgetter, (getAnswerMap<? super anyIgnorals.read, getShowPopup>) getanswermap, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
