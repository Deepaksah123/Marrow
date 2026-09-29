package kotlin;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin.clearImageOutput;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0012*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u000f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0000¢\u0006\u0004\b\t\u0010\u0014"}, d2 = {"", "p0", "Lo/_properties;", "p1", "Lo/Typed3EpoxyController;", "p2", "", "write", "(ZLo/_properties;Lo/Typed3EpoxyController;Lo/_handleUnrecognizedCharacterEscape;I)V", "AudioAttributesCompatParcelizer", "(Lo/Typed3EpoxyController;Z)Z", "Lo/getKey;", "Lo/getReferencedType;", "RemoteActionCompatParcelizer", "(Lo/Typed3EpoxyController;J)J", "Lo/setRound;", "Lo/parseDouble;", "Lo/setUserDefaultTextSize;", "Lkotlin/Function1;", "Lo/setCrossfade;", "(Lo/Typed3EpoxyController;Lo/setRound;Lo/parseDouble;)Lo/getAnswerMap;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getCurrentData {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[onContentAspectRatioChanged.values().length];
            try {
                iArr[onContentAspectRatioChanged.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onContentAspectRatioChanged.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onContentAspectRatioChanged.AudioAttributesCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            read = iArr;
        }
    }

    public static final void write(final boolean z, final _properties _propertiesVar, final Typed3EpoxyController typed3EpoxyController, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1344558920);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(_propertiesVar.ordinal()) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(typed3EpoxyController) ? 256 : 128;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 147) != 146, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1344558920, i2, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1356)");
            }
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(typed3EpoxyController);
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z2 | zAudioAttributesCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = typed3EpoxyController.AudioAttributesImplBaseParcelizer(z);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            MediaRouteButton mediaRouteButton = (MediaRouteButton) objOnPause;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(typed3EpoxyController);
            boolean z3 = i3 == 4;
            read readVarOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zIconCompatParcelizer | z3) || readVarOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                readVarOnPause = new read(typed3EpoxyController, z);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(readVarOnPause);
            }
            addInterceptor addinterceptor = (addInterceptor) readVarOnPause;
            boolean zAudioAttributesImplApi21Parcelizer = findProperty.AudioAttributesImplApi21Parcelizer(typed3EpoxyController.onRemoveQueueItem().getAudioAttributesCompatParcelizer());
            float fRemoteActionCompatParcelizer = typed3EpoxyController.RemoteActionCompatParcelizer(z);
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(mediaRouteButton);
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zIconCompatParcelizer2 || audioAttributesCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                audioAttributesCompatParcelizerOnPause = new AudioAttributesCompatParcelizer(mediaRouteButton);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(audioAttributesCompatParcelizerOnPause);
            }
            setModels.IconCompatParcelizer(addinterceptor, z, _propertiesVar, zAudioAttributesImplApi21Parcelizer, 0L, fRemoteActionCompatParcelizer, hasSomeOfFeatures.IconCompatParcelizer(companion, mediaRouteButton, (PointerInputEventHandler) audioAttributesCompatParcelizerOnPause), _handleunrecognizedcharacterescapeWrite, (i2 << 3) & AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED, 16);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setAnimationFromJson
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return getCurrentData.write(z, _propertiesVar, typed3EpoxyController, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read implements addInterceptor {
        final /* synthetic */ boolean read;
        final /* synthetic */ Typed3EpoxyController write;

        @Override // kotlin.addInterceptor
        public final long read() {
            return this.write.read(this.read);
        }

        read(Typed3EpoxyController typed3EpoxyController, boolean z) {
            this.write = typed3EpoxyController;
            this.read = z;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer implements PointerInputEventHandler {
        final /* synthetic */ MediaRouteButton AudioAttributesCompatParcelizer;

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
            Object objRemoteActionCompatParcelizer = setFixedTextSize.RemoteActionCompatParcelizer(handlebadmerge, this.AudioAttributesCompatParcelizer, sampleVideos);
            return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer(MediaRouteButton mediaRouteButton) {
            this.AudioAttributesCompatParcelizer = mediaRouteButton;
        }
    }

    public static final boolean AudioAttributesCompatParcelizer(Typed3EpoxyController typed3EpoxyController, boolean z) {
        isAbstract isabstractMediaBrowserCompatCustomActionResultReceiver;
        WritableTypeIdInclusion writableTypeIdInclusion;
        setImageDisplayMode write = typed3EpoxyController.getWrite();
        if (write == null || (isabstractMediaBrowserCompatCustomActionResultReceiver = write.MediaBrowserCompatCustomActionResultReceiver()) == null || (writableTypeIdInclusion = setItemSpacingDp.read(isabstractMediaBrowserCompatCustomActionResultReceiver)) == null) {
            return false;
        }
        return setItemSpacingDp.AudioAttributesCompatParcelizer(writableTypeIdInclusion, typed3EpoxyController.read(z));
    }

    public static final long RemoteActionCompatParcelizer(Typed3EpoxyController typed3EpoxyController, long j) {
        int iAudioAttributesImplBaseParcelizer;
        hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer;
        WebViewSubtitleOutput iconCompatParcelizer;
        AbstractDeserializer iconCompatParcelizer2;
        getReferencedType getreferencedtypeMediaBrowserCompatMediaItem = typed3EpoxyController.MediaBrowserCompatMediaItem();
        if (getreferencedtypeMediaBrowserCompatMediaItem == null) {
            return getReferencedType.INSTANCE.read();
        }
        long write = getreferencedtypeMediaBrowserCompatMediaItem.getWrite();
        AbstractDeserializer abstractDeserializerOnPrepareFromMediaId = typed3EpoxyController.onPrepareFromMediaId();
        if (abstractDeserializerOnPrepareFromMediaId == null || abstractDeserializerOnPrepareFromMediaId.length() == 0) {
            return getReferencedType.INSTANCE.read();
        }
        onContentAspectRatioChanged oncontentaspectratiochangedOnCommand = typed3EpoxyController.onCommand();
        int i = oncontentaspectratiochangedOnCommand == null ? -1 : WhenMappings.read[oncontentaspectratiochangedOnCommand.ordinal()];
        if (i == -1) {
            return getReferencedType.INSTANCE.read();
        }
        if (i == 1 || i == 2) {
            iAudioAttributesImplBaseParcelizer = findProperty.AudioAttributesImplBaseParcelizer(typed3EpoxyController.onRemoveQueueItem().getAudioAttributesCompatParcelizer());
        } else {
            if (i != 3) {
                throw new RenewEligibleCreator();
            }
            iAudioAttributesImplBaseParcelizer = findProperty.read(typed3EpoxyController.onRemoveQueueItem().getAudioAttributesCompatParcelizer());
        }
        setImageDisplayMode write2 = typed3EpoxyController.getWrite();
        if (write2 == null || (hasstableidsAudioAttributesImplApi26Parcelizer = write2.AudioAttributesImplApi26Parcelizer()) == null) {
            return getReferencedType.INSTANCE.read();
        }
        setImageDisplayMode write3 = typed3EpoxyController.getWrite();
        if (write3 == null || (iconCompatParcelizer = write3.getIconCompatParcelizer()) == null || (iconCompatParcelizer2 = iconCompatParcelizer.getIconCompatParcelizer()) == null) {
            return getReferencedType.INSTANCE.read();
        }
        int iWrite = getQues.write(typed3EpoxyController.getIconCompatParcelizer().RemoteActionCompatParcelizer(iAudioAttributesImplBaseParcelizer), 0, iconCompatParcelizer2.length());
        float fIntBitsToFloat = Float.intBitsToFloat((int) (hasstableidsAudioAttributesImplApi26Parcelizer.write(write) >> 32));
        deserializeFromNumber audioAttributesCompatParcelizer = hasstableidsAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(iWrite);
        float fMediaBrowserCompatCustomActionResultReceiver = audioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(iAudioAttributesCompatParcelizer);
        float fMediaBrowserCompatItemReceiver = audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver(iAudioAttributesCompatParcelizer);
        float f = getQues.read(fIntBitsToFloat, Math.min(fMediaBrowserCompatCustomActionResultReceiver, fMediaBrowserCompatItemReceiver), Math.max(fMediaBrowserCompatCustomActionResultReceiver, fMediaBrowserCompatItemReceiver));
        if (!getKey.AudioAttributesCompatParcelizer(j, getKey.INSTANCE.RemoteActionCompatParcelizer()) && Math.abs(fIntBitsToFloat - f) > ((int) (j >> 32)) / 2) {
            return getReferencedType.INSTANCE.read();
        }
        float fAudioAttributesImplBaseParcelizer = audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(iAudioAttributesCompatParcelizer);
        long j2 = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(((audioAttributesCompatParcelizer.read(iAudioAttributesCompatParcelizer) - fAudioAttributesImplBaseParcelizer) / 2.0f) + fAudioAttributesImplBaseParcelizer)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    public static final getAnswerMap<setCrossfade, getShowPopup> AudioAttributesCompatParcelizer(final Typed3EpoxyController typed3EpoxyController, final setRound setround, final parseDouble<setUserDefaultTextSize> parsedouble) {
        return new getAnswerMap() { // from class: o.ViewHolderStateViewState
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getCurrentData.write(parsedouble, typed3EpoxyController, setround, (setCrossfade) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(parseDouble parsedouble, final Typed3EpoxyController typed3EpoxyController, setRound setround, setCrossfade setcrossfade) {
        int audioAttributesCompatParcelizer = ((setUserDefaultTextSize) parsedouble.getRemoteActionCompatParcelizer()).getAudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer(setcrossfade, setround, setShowDisableOption.AudioAttributesCompatParcelizer, setUserDefaultTextSize.IconCompatParcelizer(audioAttributesCompatParcelizer), new getCreatedOnDateMs() { // from class: o.setAnimation
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getCurrentData.MediaBrowserCompatCustomActionResultReceiver(typed3EpoxyController);
            }
        });
        AudioAttributesCompatParcelizer(setcrossfade, setround, setShowDisableOption.IconCompatParcelizer, setUserDefaultTextSize.read(audioAttributesCompatParcelizer), new getCreatedOnDateMs() { // from class: o.setAnimationFromUrl
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getCurrentData.MediaBrowserCompatItemReceiver(typed3EpoxyController);
            }
        });
        AudioAttributesCompatParcelizer(setcrossfade, setround, setShowDisableOption.read, setUserDefaultTextSize.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer), new getCreatedOnDateMs() { // from class: o.StickyHeaderLinearLayoutManagerSavedState
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getCurrentData.AudioAttributesImplApi21Parcelizer(typed3EpoxyController);
            }
        });
        AudioAttributesCompatParcelizer(setcrossfade, setround, setShowDisableOption.write, setUserDefaultTextSize.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer), new getCreatedOnDateMs() { // from class: o.LottieAnimationView
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getCurrentData.AudioAttributesImplBaseParcelizer(typed3EpoxyController);
            }
        });
        if (isTypeVisible.AudioAttributesCompatParcelizer()) {
            AudioAttributesCompatParcelizer(setcrossfade, setround, setShowDisableOption.RemoteActionCompatParcelizer, setUserDefaultTextSize.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer), new getCreatedOnDateMs() { // from class: o.setCacheComposition
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return getCurrentData.AudioAttributesImplApi26Parcelizer(typed3EpoxyController);
                }
            });
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(Typed3EpoxyController typed3EpoxyController) {
        typed3EpoxyController.MediaBrowserCompatItemReceiver();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(Typed3EpoxyController typed3EpoxyController) {
        typed3EpoxyController.write(false);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(Typed3EpoxyController typed3EpoxyController) {
        typed3EpoxyController.onRemoveQueueItemAt();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(Typed3EpoxyController typed3EpoxyController) {
        typed3EpoxyController.onRewind();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(Typed3EpoxyController typed3EpoxyController) {
        typed3EpoxyController.RemoteActionCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    private static final void AudioAttributesCompatParcelizer(setCrossfade setcrossfade, setRound setround, setShowDisableOption setshowdisableoption, boolean z, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        if (z) {
            setCrossfade.AudioAttributesCompatParcelizer$default(setcrossfade, new clearImageOutput.RemoteActionCompatParcelizer(setshowdisableoption), null, false, null, new clearImageOutput.AudioAttributesCompatParcelizer(getcreatedondatems, setround), 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(boolean z, _properties _propertiesVar, Typed3EpoxyController typed3EpoxyController, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        write(z, _propertiesVar, typed3EpoxyController, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
