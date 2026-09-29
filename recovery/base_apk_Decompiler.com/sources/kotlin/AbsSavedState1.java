package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.AbsSavedState1;
import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aJ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0087\b¢\u0006\u0002\u0010\r\u001a\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002\u001a\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a\u001d\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0017\u001a<\u0010\u0019\u001a\u00020\u0001*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u0005H\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010$\"\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010%\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'\"\u001a\u0010(\u001a\u0004\u0018\u00010)*\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0018\u0010,\u001a\u00020\u0007*\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Box", "", "modifier", "Landroidx/compose/ui/Modifier;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "propagateMinConstraints", "", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "cacheFor", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/ui/layout/MeasurePolicy;", "propagate", "Cache1", "Cache2", "maybeCachedBoxMeasurePolicy", "alignment", "rememberBoxMeasurePolicy", "(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "DefaultBoxMeasurePolicy", "placeInBox", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "boxWidth", "", "boxHeight", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "EmptyBoxMeasurePolicy", "getEmptyBoxMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "boxChildDataNode", "Landroidx/compose/foundation/layout/BoxChildDataNode;", "getBoxChildDataNode", "(Landroidx/compose/ui/layout/Measurable;)Landroidx/compose/foundation/layout/BoxChildDataNode;", "matchesParentSize", "getMatchesParentSize", "(Landroidx/compose/ui/layout/Measurable;)Z", "foundation-layout"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AbsSavedState1 {
    private static final setKeyListener<_skipWSOrEnd, withTypeHandler> RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(true);
    private static final setKeyListener<_skipWSOrEnd, withTypeHandler> read = AudioAttributesCompatParcelizer(false);
    private static final withTypeHandler IconCompatParcelizer = new MergedDataBinderMapper(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
    private static final withTypeHandler AudioAttributesCompatParcelizer = read.RemoteActionCompatParcelizer;

    private static final setKeyListener<_skipWSOrEnd, withTypeHandler> AudioAttributesCompatParcelizer(boolean z) {
        setKeyListener<_skipWSOrEnd, withTypeHandler> setkeylistener = new setKeyListener<>(9);
        setkeylistener.RemoteActionCompatParcelizer(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), new MergedDataBinderMapper(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), z));
        setkeylistener.RemoteActionCompatParcelizer(_skipWSOrEnd.INSTANCE.MediaDescriptionCompat(), new MergedDataBinderMapper(_skipWSOrEnd.INSTANCE.MediaDescriptionCompat(), z));
        setkeylistener.RemoteActionCompatParcelizer(_skipWSOrEnd.INSTANCE.MediaMetadataCompat(), new MergedDataBinderMapper(_skipWSOrEnd.INSTANCE.MediaMetadataCompat(), z));
        setkeylistener.RemoteActionCompatParcelizer(_skipWSOrEnd.INSTANCE.MediaBrowserCompatItemReceiver(), new MergedDataBinderMapper(_skipWSOrEnd.INSTANCE.MediaBrowserCompatItemReceiver(), z));
        setkeylistener.RemoteActionCompatParcelizer(_skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer(), new MergedDataBinderMapper(_skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer(), z));
        setkeylistener.RemoteActionCompatParcelizer(_skipWSOrEnd.INSTANCE.AudioAttributesImplApi26Parcelizer(), new MergedDataBinderMapper(_skipWSOrEnd.INSTANCE.AudioAttributesImplApi26Parcelizer(), z));
        setkeylistener.RemoteActionCompatParcelizer(_skipWSOrEnd.INSTANCE.read(), new MergedDataBinderMapper(_skipWSOrEnd.INSTANCE.read(), z));
        setkeylistener.RemoteActionCompatParcelizer(_skipWSOrEnd.INSTANCE.AudioAttributesCompatParcelizer(), new MergedDataBinderMapper(_skipWSOrEnd.INSTANCE.AudioAttributesCompatParcelizer(), z));
        setkeylistener.RemoteActionCompatParcelizer(_skipWSOrEnd.INSTANCE.IconCompatParcelizer(), new MergedDataBinderMapper(_skipWSOrEnd.INSTANCE.IconCompatParcelizer(), z));
        return setkeylistener;
    }

    public static final withTypeHandler write(_skipWSOrEnd _skipwsorend, boolean z) {
        withTypeHandler withtypehandlerAudioAttributesImplApi26Parcelizer = (z ? RemoteActionCompatParcelizer : read).AudioAttributesImplApi26Parcelizer(_skipwsorend);
        return withtypehandlerAudioAttributesImplApi26Parcelizer == null ? new MergedDataBinderMapper(_skipwsorend, z) : withtypehandlerAudioAttributesImplApi26Parcelizer;
    }

    public static final withTypeHandler IconCompatParcelizer(_skipWSOrEnd _skipwsorend, boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        MergedDataBinderMapper mergedDataBinderMapper;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(56522820, i, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:109)");
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_skipwsorend, _skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver()) && !z) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(244332343);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            mergedDataBinderMapper = IconCompatParcelizer;
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(244380021);
            boolean z2 = true;
            boolean z3 = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(_skipwsorend)) || (i & 6) == 4;
            if ((((i & 112) ^ 48) <= 32 || !_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z)) && (i & 48) != 32) {
                z2 = false;
            }
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((z3 | z2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new MergedDataBinderMapper(_skipwsorend, z);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            mergedDataBinderMapper = (MergedDataBinderMapper) objOnPause;
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return mergedDataBinderMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer, _parser _parserVar, isTypeOrSuperTypeOf istypeorsupertypeof, tryToResolveUnresolved trytoresolveunresolved, int i, int i2, _skipWSOrEnd _skipwsorend) {
        _skipWSOrEnd audioAttributesCompatParcelizer;
        setSmoothScrollingEnabled setsmoothscrollingenabledWrite = write(istypeorsupertypeof);
        long j = -1;
        long j2 = -1;
        _parser.IconCompatParcelizer.write$default(iconCompatParcelizer, _parserVar, ((setsmoothscrollingenabledWrite == null || (audioAttributesCompatParcelizer = setsmoothscrollingenabledWrite.getAudioAttributesCompatParcelizer()) == null) ? _skipwsorend : audioAttributesCompatParcelizer).IconCompatParcelizer(getKey.read((((long) _parserVar.getRead()) << 32) | (((long) _parserVar.getRemoteActionCompatParcelizer()) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))), getKey.read((((long) i) << 32) | (((long) i2) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))))), trytoresolveunresolved), BitmapDescriptorFactory.HUE_RED, 2, null);
    }

    public static final void RemoteActionCompatParcelizer(final _handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-211209833);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-211209833, i2, -1, "androidx.compose.foundation.layout.Box (Box.kt:232)");
            }
            withTypeHandler withtypehandler = AudioAttributesCompatParcelizer;
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.DataBinderMapperImpl
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return AbsSavedState1.AudioAttributesCompatParcelizer(_handleoddname, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read implements withTypeHandler {
        public static final read RemoteActionCompatParcelizer = new read();

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer) {
            return getShowPopup.INSTANCE;
        }

        @Override // kotlin.withTypeHandler
        public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, PropertyValueAny.MediaBrowserCompatItemReceiver(j), PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j), null, new getAnswerMap() { // from class: o.NestedScrollViewSavedState
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return AbsSavedState1.read.AudioAttributesCompatParcelizer((_parser.IconCompatParcelizer) obj);
                }
            }, 4, null);
        }

        read() {
        }
    }

    private static final setSmoothScrollingEnabled write(isTypeOrSuperTypeOf istypeorsupertypeof) {
        Object objQ_ = istypeorsupertypeof.getOnPrepareFromUri();
        if (objQ_ instanceof setSmoothScrollingEnabled) {
            return (setSmoothScrollingEnabled) objQ_;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(isTypeOrSuperTypeOf istypeorsupertypeof) {
        setSmoothScrollingEnabled setsmoothscrollingenabledWrite = write(istypeorsupertypeof);
        if (setsmoothscrollingenabledWrite != null) {
            return setsmoothscrollingenabledWrite.getRead();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleOddName _handleoddname, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        RemoteActionCompatParcelizer(_handleoddname, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
