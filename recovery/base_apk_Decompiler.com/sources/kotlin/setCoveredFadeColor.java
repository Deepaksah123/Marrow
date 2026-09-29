package kotlin;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.switchAndReturnNext;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0002\u0010\u0005\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a+\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H\u0003¢\u0006\u0002\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\u0019\u001a!\u0010\u001a\u001a\u00020\u00012\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0004\b\u001f\u0010 \"\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, d2 = {"ProvideDefaultTextContextMenuDropdown", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "defaultTextContextMenuDropdown", "Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider;", "DefaultPopupProperties", "Landroidx/compose/ui/window/PopupProperties;", "OpenContextMenu", "session", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuSession;", "dataProvider", "Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;", "anchorLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "(Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuSession;Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DefaultTextContextMenuDropdown", "data", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", "(Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuSession;Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;Landroidx/compose/runtime/Composer;I)V", "IconBox", "resId", "", "tint", "Landroidx/compose/ui/graphics/Color;", "IconBox-RPmYEkk", "(IJLandroidx/compose/runtime/Composer;I)V", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setCoveredFadeColor {
    private static final withDateFormat write = new withDateFormat(true, false, false, false, 14, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);

    public static final void AudioAttributesCompatParcelizer(final _handleOddName _handleoddname, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1392105195);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1392105195, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideDefaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:85)");
            }
            getStrokeAlpha.read(_handleoddname, setTrimPathOffset.RemoteActionCompatParcelizer(), StaggeredGridLayoutManagerLazySpanLookupFullSpanItem.IconCompatParcelizer.RemoteActionCompatParcelizer(), magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescapeWrite, (i2 & 14) | 432 | ((i2 << 6) & 7168));
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setShadowDrawableRight
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setCoveredFadeColor.IconCompatParcelizer(_handleoddname, magicModuleSubmissionRequestBody, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final getFillColor read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1197778906, i, -1, "androidx.compose.foundation.text.contextmenu.internal.defaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:98)");
        }
        getFillColor getfillcolorWrite = getStrokeAlpha.write(StaggeredGridLayoutManagerLazySpanLookupFullSpanItem.IconCompatParcelizer.read(), _handleunrecognizedcharacterescape, 6);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return getfillcolorWrite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(final isRecyclable isrecyclable, final setFillAlpha setfillalpha, final getCreatedOnDateMs<? extends isAbstract> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(isrecyclable) : _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(isrecyclable) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setfillalpha) : _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(setfillalpha) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 256 : 128;
        }
        boolean z = false;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 147) != 146, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-2040393164, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.OpenContextMenu (DefaultTextContextMenuDropdownProvider.android.kt:109)");
            }
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setfillalpha));
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z2 || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new setColorSchemeColors(new setContrast(new getCreatedOnDateMs() { // from class: o.setPanelSlideListener
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setCoveredFadeColor.AudioAttributesCompatParcelizer(setfillalpha, getcreatedondatems);
                    }
                }, (MagicModuleSubmissionRequestBody) null, 2, (MagicModuleRepositoryImplExternalSyntheticLambda0) null));
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            setColorSchemeColors setcolorschemecolors = (setColorSchemeColors) objOnPause;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(isrecyclable))) {
                z = true;
            }
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.setShadowDrawableLeft
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setCoveredFadeColor.RemoteActionCompatParcelizer(isrecyclable);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            popOrNull.RemoteActionCompatParcelizer(setcolorschemecolors, (getCreatedOnDateMs) objOnPause2, write, multiplyFft.AudioAttributesCompatParcelizer(1315155414, true, new MagicModuleSubmissionRequestBody() { // from class: o.setShadowDrawable
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setCoveredFadeColor.AudioAttributesCompatParcelizer(setfillalpha, isrecyclable, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, 3456, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setShadowResourceLeft
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setCoveredFadeColor.write(isrecyclable, setfillalpha, getcreatedondatems, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hasReferringProperties AudioAttributesCompatParcelizer(setFillAlpha setfillalpha, getCreatedOnDateMs getcreatedondatems) {
        return hasReferringProperties.write(referringProperties.AudioAttributesCompatParcelizer(setfillalpha.RemoteActionCompatParcelizer((isAbstract) getcreatedondatems.invoke())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(isRecyclable isrecyclable) {
        isrecyclable.write();
        return getShowPopup.INSTANCE;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final /* synthetic */ class read extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<isAttachedToTransitionOverlay> {
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final isAttachedToTransitionOverlay invoke() {
            return ((setFillAlpha) this.AudioAttributesImplApi26Parcelizer).IconCompatParcelizer();
        }

        read(Object obj) {
            super(0, obj, setFillAlpha.class, "IconCompatParcelizer", "IconCompatParcelizer()Lo/isAttachedToTransitionOverlay;", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(setFillAlpha setfillalpha, isRecyclable isrecyclable, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1315155414, i, -1, "androidx.compose.foundation.text.contextmenu.internal.OpenContextMenu.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:124)");
            }
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setfillalpha);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = _qbuf.RemoteActionCompatParcelizer(new read(setfillalpha));
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            RemoteActionCompatParcelizer(isrecyclable, write((parseDouble) objOnPause), _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    private static final void RemoteActionCompatParcelizer(final isRecyclable isrecyclable, final isAttachedToTransitionOverlay isattachedtotransitionoverlay, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1904307118);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(isrecyclable) : _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(isrecyclable) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(isattachedtotransitionoverlay) ? 32 : 16;
        }
        boolean z = true;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1904307118, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:133)");
            }
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1009482584);
            final Context context = (Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(isattachedtotransitionoverlay);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(isrecyclable))) {
                z = false;
            }
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(context);
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zIconCompatParcelizer2 | zIconCompatParcelizer | z) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.setShadowResourceRight
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return setCoveredFadeColor.read(isattachedtotransitionoverlay, context, isrecyclable, (setCrossfade) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            setImageZoom.read(null, null, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescapeWrite, 0, 3);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setShadowResource
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setCoveredFadeColor.write(isrecyclable, isattachedtotransitionoverlay, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(isAttachedToTransitionOverlay isattachedtotransitionoverlay, Context context, final isRecyclable isrecyclable, setCrossfade setcrossfade) {
        List<getPosition> listAudioAttributesCompatParcelizer = isattachedtotransitionoverlay.AudioAttributesCompatParcelizer();
        int size = listAudioAttributesCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            final getPosition getposition = listAudioAttributesCompatParcelizer.get(i);
            if (getposition instanceof getUnmodifiedPayloads) {
                setCrossfade.AudioAttributesCompatParcelizer$default(setcrossfade, new MagicModuleSubmissionRequestBody() { // from class: o.setBackgroundColor
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return setCoveredFadeColor.write(getposition, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                    }
                }, null, false, ((getUnmodifiedPayloads) getposition).getRead() == 0 ? null : multiplyFft.IconCompatParcelizer(-1930700965, true, new IconCompatParcelizer(getposition)), new getCreatedOnDateMs() { // from class: o.SlidingPaneLayoutLayoutParams
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setCoveredFadeColor.AudioAttributesCompatParcelizer(getposition, isrecyclable);
                    }
                }, 6, null);
            } else if (getposition instanceof isRemoved) {
                setSize.INSTANCE.read(setcrossfade, context, (isRemoved) getposition);
            } else if (getposition instanceof hasAnyOfTheFlags) {
                setcrossfade.IconCompatParcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String write(getPosition getposition, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(666084174);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(666084174, i, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:145)");
        }
        String write2 = ((getUnmodifiedPayloads) getposition).getWrite();
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return write2;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer implements getModuleData<switchToNext, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ getPosition AudioAttributesCompatParcelizer;

        @Override // kotlin.getModuleData
        public final /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(switchToNext switchtonext, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            write(switchtonext.getIconCompatParcelizer(), _handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void write(long j, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if ((i & 6) == 0) {
                i |= _handleunrecognizedcharacterescape.IconCompatParcelizer(j) ? 4 : 2;
            }
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 19) != 18, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1930700965, i, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:150)");
            }
            setCoveredFadeColor.IconCompatParcelizer(((getUnmodifiedPayloads) this.AudioAttributesCompatParcelizer).getRead(), j, _handleunrecognizedcharacterescape, (i << 3) & 112);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        IconCompatParcelizer(getPosition getposition) {
            this.AudioAttributesCompatParcelizer = getposition;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getPosition getposition, isRecyclable isrecyclable) {
        ((getUnmodifiedPayloads) getposition).IconCompatParcelizer().invoke(isrecyclable);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(final int i, final long j, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2) {
        int i3;
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver;
        MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(j) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 19) != 18, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1240244237, i3, -1, "androidx.compose.foundation.text.contextmenu.internal.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:166)");
            }
            Context context = (Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(context);
            boolean z = (i3 & 14) == 4;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z | zAudioAttributesCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            int iIntValue = ((Number) objOnPause).intValue();
            if (iIntValue == -1) {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
                releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
                if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
                    magicModuleSubmissionRequestBody = new MagicModuleSubmissionRequestBody() { // from class: o.SlidingPaneLayoutSavedState
                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        public final Object invoke(Object obj, Object obj2) {
                            return setCoveredFadeColor.RemoteActionCompatParcelizer(i, j, i2, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                        }
                    };
                    releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(magicModuleSubmissionRequestBody);
                }
                return;
            }
            isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(iIntValue, _handleunrecognizedcharacterescapeWrite, 0);
            boolean z2 = (i3 & 112) == 32;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z2 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = j == 16 ? null : switchAndReturnNext.Companion.IconCompatParcelizer$default(switchAndReturnNext.INSTANCE, j, 0, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            AbsSavedState1.RemoteActionCompatParcelizer(_writeLongString.AudioAttributesCompatParcelizer$default(isAdded.AudioAttributesImplBaseParcelizer(_handleOddName.INSTANCE, setSaturation.INSTANCE.MediaBrowserCompatItemReceiver()), isannotationbundleRemoteActionCompatParcelizer, false, null, getContentType.INSTANCE.IconCompatParcelizer(), BitmapDescriptorFactory.HUE_RED, (switchAndReturnNext) objOnPause2, 22, null), _handleunrecognizedcharacterescapeWrite, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            magicModuleSubmissionRequestBody = new MagicModuleSubmissionRequestBody() { // from class: o.setSliderFadeColor
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setCoveredFadeColor.read(i, j, i2, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            };
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(magicModuleSubmissionRequestBody);
        }
    }

    private static final isAttachedToTransitionOverlay write(parseDouble<isAttachedToTransitionOverlay> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(isRecyclable isrecyclable, isAttachedToTransitionOverlay isattachedtotransitionoverlay, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        RemoteActionCompatParcelizer(isrecyclable, isattachedtotransitionoverlay, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(int i, long j, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        IconCompatParcelizer(i, j, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(int i, long j, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        IconCompatParcelizer(i, j, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(isRecyclable isrecyclable, setFillAlpha setfillalpha, getCreatedOnDateMs getcreatedondatems, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        IconCompatParcelizer(isrecyclable, setfillalpha, (getCreatedOnDateMs<? extends isAbstract>) getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleOddName _handleoddname, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        AudioAttributesCompatParcelizer(_handleoddname, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
