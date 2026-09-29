package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;
import kotlin.setVrButtonListener;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aa\u0010\r\u001a:\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007j\u0002`\f0\u00060\u0005*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00002\"\u0010\u0012\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007j\u0002`\f0\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0013\"L\u0010\u0016\u001a:\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007j\u0002`\f0\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015*\u0018\b\u0000\u0010\r\"\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0012\u0004\u0012\u00020\b0\u0007*0\b\u0000\u0010\u0014\"\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u00072\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007"}, d2 = {"Lo/AbstractDeserializer;", "", "", "Lo/setControllerHideDuringAds;", "p0", "Lo/getSubscriptionExpiresOn;", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_findCustomMapDeserializer;", "Lo/RemoteActionCompatParcelizer;", "Lkotlin/Function1;", "", "Lo/write;", "RemoteActionCompatParcelizer", "(Lo/AbstractDeserializer;Ljava/util/Map;)Lo/getSubscriptionExpiresOn;", "", "read", "(Lo/AbstractDeserializer;)Z", "p1", "(Lo/AbstractDeserializer;Ljava/util/List;Lo/_handleUnrecognizedCharacterEscape;I)V", "write", "Lo/getSubscriptionExpiresOn;", "AudioAttributesCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setVrButtonListener {
    private static final Pair<List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>>, List<AbstractDeserializer.AudioAttributesCompatParcelizer<getModuleData<String, _handleUnrecognizedCharacterEscape, Integer, getShowPopup>>>> write = new Pair<>(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());

    public static final Pair<List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>>, List<AbstractDeserializer.AudioAttributesCompatParcelizer<getModuleData<String, _handleUnrecognizedCharacterEscape, Integer, getShowPopup>>>> RemoteActionCompatParcelizer(AbstractDeserializer abstractDeserializer, Map<String, setControllerHideDuringAds> map) {
        if (map == null || map.isEmpty()) {
            return write;
        }
        List<AbstractDeserializer.AudioAttributesCompatParcelizer<String>> list = abstractDeserializer.read("androidx.compose.foundation.text.inlineContent", 0, abstractDeserializer.getIconCompatParcelizer().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractDeserializer.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = list.get(i);
            setControllerHideDuringAds setcontrollerhideduringads = map.get(audioAttributesCompatParcelizer.IconCompatParcelizer());
            if (setcontrollerhideduringads != null) {
                arrayList.add(new AbstractDeserializer.AudioAttributesCompatParcelizer(setcontrollerhideduringads.getRemoteActionCompatParcelizer(), audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer()));
                arrayList2.add(new AbstractDeserializer.AudioAttributesCompatParcelizer(setcontrollerhideduringads.read(), audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer()));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final boolean read(AbstractDeserializer abstractDeserializer) {
        return abstractDeserializer.IconCompatParcelizer("androidx.compose.foundation.text.inlineContent", 0, abstractDeserializer.getIconCompatParcelizer().length());
    }

    public static final void read(final AbstractDeserializer abstractDeserializer, final List<AbstractDeserializer.AudioAttributesCompatParcelizer<getModuleData<String, _handleUnrecognizedCharacterEscape, Integer, getShowPopup>>> list, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1794596951);
        int i2 = (i & 6) == 0 ? (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(abstractDeserializer) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1794596951, i2, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:67)");
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractDeserializer.AudioAttributesCompatParcelizer<getModuleData<String, _handleUnrecognizedCharacterEscape, Integer, getShowPopup>> audioAttributesCompatParcelizer = list.get(i3);
                getModuleData<String, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> getmoduledataRemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                int write2 = audioAttributesCompatParcelizer.getWrite();
                int iWrite = audioAttributesCompatParcelizer.write();
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if (audioAttributesCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    audioAttributesCompatParcelizerOnPause = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(audioAttributesCompatParcelizerOnPause);
                }
                withTypeHandler withtypehandler = (withTypeHandler) audioAttributesCompatParcelizerOnPause;
                _handleOddName.Companion companion = _handleOddName.INSTANCE;
                int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, companion);
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
                NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
                NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                getmoduledataRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(abstractDeserializer.subSequence(write2, iWrite).getIconCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, 0);
                _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setTimeBarMinUpdateInterval
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setVrButtonListener.read(abstractDeserializer, list, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer implements withTypeHandler {
        public static final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();

        @Override // kotlin.withTypeHandler
        public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).write(j));
            }
            final ArrayList arrayList2 = arrayList;
            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, PropertyValueAny.AudioAttributesImplBaseParcelizer(j), PropertyValueAny.AudioAttributesImplApi21Parcelizer(j), null, new getAnswerMap() { // from class: o.setShowShuffleButton
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return setVrButtonListener.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(arrayList2, (_parser.IconCompatParcelizer) obj);
                }
            }, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(List list, _parser.IconCompatParcelizer iconCompatParcelizer) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, (_parser) list.get(i), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
            }
            return getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(AbstractDeserializer abstractDeserializer, List list, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        read(abstractDeserializer, list, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
