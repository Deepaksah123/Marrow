package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.Metadata;

/* JADX INFO: renamed from: o.Metadata, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001aP\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u001d\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0012\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"LazyLayout", "", "itemProvider", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "modifier", "Landroidx/compose/ui/Modifier;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "measurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasurePolicy;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "MaxItemsToRetainForReuse", "", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class C0155Metadata {

    /* JADX INFO: renamed from: o.Metadata$RemoteActionCompatParcelizer */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lo/StreamConstraintsException$read;", "Lo/_wrapError;", "", "RemoteActionCompatParcelizer", "()V", "o/StreamConstraintsException$read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements _wrapError {
        final /* synthetic */ getCurrentTrackSelections RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(getCurrentTrackSelections getcurrenttrackselections) {
            this.RemoteActionCompatParcelizer = getcurrenttrackselections;
        }

        @Override // kotlin._wrapError
        public final void RemoteActionCompatParcelizer() {
            setAudioSessionId remoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer();
            if (remoteActionCompatParcelizer != null) {
                remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            }
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(null);
        }
    }

    public static final void IconCompatParcelizer(final getCreatedOnDateMs<? extends AudioAttributesImplApi21> getcreatedondatems, final _handleOddName _handleoddname, final getCurrentTrackSelections getcurrenttrackselections, final addAnalyticsListener addanalyticslistener, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1055276397);
        if ((i & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(getcurrenttrackselections) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(addanalyticslistener) : _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(addanalyticslistener) ? 2048 : 1024;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 1171) != 1170, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (i4 != 0) {
                _handleoddname = _handleOddName.INSTANCE;
            }
            if (i5 != 0) {
                getcurrenttrackselections = null;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1055276397, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:111)");
            }
            final parseDouble parsedouble = _qbuf.read(getcreatedondatems, _handleunrecognizedcharacterescapeWrite, i3 & 14);
            C0181isReleased.RemoteActionCompatParcelizer(multiplyFft.AudioAttributesCompatParcelizer(-933153643, true, new getModuleData() { // from class: o.StreamKey
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return C0155Metadata.AudioAttributesCompatParcelizer(getcurrenttrackselections, _handleoddname, addanalyticslistener, parsedouble, (subtractTimesI) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, 6);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        final _handleOddName _handleoddname2 = _handleoddname;
        final getCurrentTrackSelections getcurrenttrackselections2 = getcurrenttrackselections;
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.DrmInitDataSchemeData
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return C0155Metadata.write(getcreatedondatems, _handleoddname2, getcurrenttrackselections2, addanalyticslistener, i, i2, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AudioAttributesImplApi21 RemoteActionCompatParcelizer(parseDouble parsedouble) {
        return (AudioAttributesImplApi21) ((getCreatedOnDateMs) parsedouble.getRemoteActionCompatParcelizer()).invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _wrapError AudioAttributesCompatParcelizer(getCurrentTrackSelections getcurrenttrackselections, AudioAttributesCompat audioAttributesCompat, booleanValue booleanvalue, setPriority setpriority, StreamConstraintsException streamConstraintsException) {
        getcurrenttrackselections.AudioAttributesCompatParcelizer(new setAudioSessionId(audioAttributesCompat, booleanvalue, setpriority));
        return new RemoteActionCompatParcelizer(getcurrenttrackselections);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final withHandlersFrom IconCompatParcelizer(AudioAttributesCompat audioAttributesCompat, addAnalyticsListener addanalyticslistener, getNodeType getnodetype, PropertyValueAny propertyValueAny) {
        return addanalyticslistener.IconCompatParcelizer(new ExoPlayer(audioAttributesCompat, getnodetype), propertyValueAny.getRead());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(final getCurrentTrackSelections getcurrenttrackselections, _handleOddName _handleoddname, final addAnalyticsListener addanalyticslistener, final parseDouble parsedouble, subtractTimesI subtracttimesi, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-933153643, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:115)");
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new AudioAttributesCompat(subtracttimesi, new getCreatedOnDateMs() { // from class: o.MetadataEntry
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return C0155Metadata.RemoteActionCompatParcelizer(parsedouble);
                }
            });
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        final AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) objOnPause;
        Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause2 = new booleanValue(new AudioAttributesImplBase(audioAttributesCompat));
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
        }
        final booleanValue booleanvalue = (booleanValue) objOnPause2;
        if (getcurrenttrackselections != null) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(1743490539);
            final setPriority iconCompatParcelizer = getcurrenttrackselections.getIconCompatParcelizer();
            if (iconCompatParcelizer == null) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(887527095);
                iconCompatParcelizer = setPreferredAudioDevice.read(_handleunrecognizedcharacterescape, 0);
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(887526010);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            Object[] objArr = {getcurrenttrackselections, audioAttributesCompat, booleanvalue, iconCompatParcelizer};
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getcurrenttrackselections);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(audioAttributesCompat);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(booleanvalue);
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(iconCompatParcelizer);
            Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer | zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3) || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getAnswerMap() { // from class: o.buildRawResourceUri
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return C0155Metadata.AudioAttributesCompatParcelizer(getcurrenttrackselections, audioAttributesCompat, booleanvalue, iconCompatParcelizer, (StreamConstraintsException) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
            }
            StreamReadException.read(objArr, (getAnswerMap) objOnPause3, _handleunrecognizedcharacterescape, 0);
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(1737291469);
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        _handleOddName _handleoddnameRemoteActionCompatParcelizer = getCurrentTrackGroups.RemoteActionCompatParcelizer(_handleoddname, getcurrenttrackselections);
        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(audioAttributesCompat);
        boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(addanalyticslistener);
        Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
        if ((zAudioAttributesCompatParcelizer2 | zAudioAttributesCompatParcelizer3) || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause4 = new MagicModuleSubmissionRequestBody() { // from class: o.Mp4TimestampData
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return C0155Metadata.IconCompatParcelizer(audioAttributesCompat, addanalyticslistener, (getNodeType) obj, (PropertyValueAny) obj2);
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause4);
        }
        fieldNames.AudioAttributesCompatParcelizer(booleanvalue, _handleoddnameRemoteActionCompatParcelizer, (MagicModuleSubmissionRequestBody) objOnPause4, _handleunrecognizedcharacterescape, booleanValue.read, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getCreatedOnDateMs getcreatedondatems, _handleOddName _handleoddname, getCurrentTrackSelections getcurrenttrackselections, addAnalyticsListener addanalyticslistener, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        IconCompatParcelizer(getcreatedondatems, _handleoddname, getcurrenttrackselections, addanalyticslistener, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
