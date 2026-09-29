package kotlin;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\r\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\f2\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u0011\u001a\u00020\u000f*\u00020\u000f2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0004\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014*\f\b\u0000\u0010\u0015\"\u00020\u00052\u00020\u0005"}, d2 = {"Lo/setEncoding;", "p0", "Lo/_closeInput;", "", "p1", "", "p2", "", "AudioAttributesCompatParcelizer", "(Lo/setEncoding;Lo/_closeInput;I)V", "IconCompatParcelizer", "(Lo/setEncoding;)I", "Lo/_parseSlowFloat;", "RemoteActionCompatParcelizer", "(Lo/setEncoding;Lo/_parseSlowFloat;Lo/_closeInput;)I", "", "Lo/_outputUptoMillion;", "write", "(Ljava/lang/Throwable;Lo/_outputUptoMillion;Lo/setEncoding;Lo/_parseSlowFloat;)Ljava/lang/Throwable;", "read", "(Lo/_outputUptoMillion;Lo/setEncoding;)Lo/_outputUptoMillion;", "IntParameter"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _outputSmallestL {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(setEncoding setencoding, _closeInput<Object> _closeinput, int i) {
        while (!setencoding.MediaDescriptionCompat(i)) {
            setencoding.onCommand();
            if (setencoding.MediaMetadataCompat(setencoding.getOnCommand())) {
                _closeinput.IconCompatParcelizer();
            }
            setencoding.RemoteActionCompatParcelizer();
        }
    }

    private static final int IconCompatParcelizer(setEncoding setencoding) {
        int audioAttributesImplApi26Parcelizer = setencoding.getAudioAttributesImplApi26Parcelizer();
        int onCommand = setencoding.getOnCommand();
        while (onCommand >= 0 && !setencoding.MediaMetadataCompat(onCommand)) {
            onCommand = setencoding.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(onCommand);
        }
        int iAudioAttributesImplBaseParcelizer = onCommand + 1;
        int iHandleMediaPlayPauseIfPendingOnHandler = 0;
        while (iAudioAttributesImplBaseParcelizer < audioAttributesImplApi26Parcelizer) {
            if (setencoding.write(audioAttributesImplApi26Parcelizer, iAudioAttributesImplBaseParcelizer)) {
                if (setencoding.MediaMetadataCompat(iAudioAttributesImplBaseParcelizer)) {
                    iHandleMediaPlayPauseIfPendingOnHandler = 0;
                }
                iAudioAttributesImplBaseParcelizer++;
            } else {
                iHandleMediaPlayPauseIfPendingOnHandler += setencoding.MediaMetadataCompat(iAudioAttributesImplBaseParcelizer) ? 1 : setencoding.handleMediaPlayPauseIfPendingOnHandler(iAudioAttributesImplBaseParcelizer);
                iAudioAttributesImplBaseParcelizer += setencoding.AudioAttributesImplBaseParcelizer(iAudioAttributesImplBaseParcelizer);
            }
        }
        return iHandleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(setEncoding setencoding, _parseSlowFloat _parseslowfloat, _closeInput<Object> _closeinput) {
        int i = setencoding.read(_parseslowfloat);
        if (setencoding.getAudioAttributesImplApi26Parcelizer() >= i) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Check failed");
        }
        AudioAttributesCompatParcelizer(setencoding, _closeinput, i);
        int iIconCompatParcelizer = IconCompatParcelizer(setencoding);
        while (setencoding.getAudioAttributesImplApi26Parcelizer() < i) {
            if (setencoding.RatingCompat(i)) {
                if (setencoding.MediaBrowserCompatMediaItem()) {
                    _closeinput.AudioAttributesCompatParcelizer(setencoding.onCustomAction(setencoding.getAudioAttributesImplApi26Parcelizer()));
                    iIconCompatParcelizer = 0;
                }
                setencoding.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            } else {
                iIconCompatParcelizer += setencoding.onAddQueueItem();
            }
        }
        if (setencoding.getAudioAttributesImplApi26Parcelizer() != i) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Check failed");
        }
        return iIconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable write(Throwable th, final _outputUptoMillion _outputuptomillion, final setEncoding setencoding, final _parseSlowFloat _parseslowfloat) {
        return _outputuptomillion == null ? th : _reportCantWriteValueExpectName.RemoteActionCompatParcelizer(th, (getCreatedOnDateMs<_verifyPrettyValueWrite>) new getCreatedOnDateMs() { // from class: o.outputInt
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return _outputSmallestL.AudioAttributesCompatParcelizer(_parseslowfloat, setencoding, _outputuptomillion);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _verifyPrettyValueWrite AudioAttributesCompatParcelizer(_parseSlowFloat _parseslowfloat, setEncoding setencoding, _outputUptoMillion _outputuptomillion) {
        if (_parseslowfloat != null) {
            setencoding.IconCompatParcelizer(_parseslowfloat);
        }
        List listWrite$default = isDup.write$default(setencoding, null, 0, null, 7, null);
        JsonGeneratorImpl jsonGeneratorImpl = (JsonGeneratorImpl) IntermediateLoginResponseBody.MediaMetadataCompat(listWrite$default);
        Integer write = jsonGeneratorImpl != null ? jsonGeneratorImpl.getWrite() : null;
        List<JsonGeneratorImpl> listAudioAttributesCompatParcelizer = _outputuptomillion.AudioAttributesCompatParcelizer(write);
        if (write != null && !listAudioAttributesCompatParcelizer.isEmpty()) {
            listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) IntermediateLoginResponseBody.RemoteActionCompatParcelizer(JsonGeneratorImpl.read$default((JsonGeneratorImpl) IntermediateLoginResponseBody.RatingCompat((List) listAudioAttributesCompatParcelizer), 0, null, write, 3, null)), (Iterable) IntermediateLoginResponseBody.IconCompatParcelizer((Iterable) listAudioAttributesCompatParcelizer, 1));
        }
        return new _verifyPrettyValueWrite(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) listWrite$default, (Iterable) listAudioAttributesCompatParcelizer));
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/_outputSmallestL$RemoteActionCompatParcelizer;", "Lo/_outputUptoMillion;", "", "p0", "", "Lo/JsonGeneratorImpl;", "AudioAttributesCompatParcelizer", "(Ljava/lang/Integer;)Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements _outputUptoMillion {
        final /* synthetic */ _outputUptoMillion IconCompatParcelizer;
        final /* synthetic */ setEncoding read;

        RemoteActionCompatParcelizer(_outputUptoMillion _outputuptomillion, setEncoding setencoding) {
            this.IconCompatParcelizer = _outputuptomillion;
            this.read = setencoding;
        }

        @Override // kotlin._outputUptoMillion
        public final List<JsonGeneratorImpl> AudioAttributesCompatParcelizer(Integer p0) {
            List<JsonGeneratorImpl> listAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(null);
            int onCommand = this.read.getOnCommand();
            if (onCommand < 0) {
                return listAudioAttributesCompatParcelizer;
            }
            setEncoding setencoding = this.read;
            return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) isDup.write(setencoding, p0, onCommand, Integer.valueOf(setencoding.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(onCommand))), (Iterable) listAudioAttributesCompatParcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _outputUptoMillion read(_outputUptoMillion _outputuptomillion, setEncoding setencoding) {
        return new RemoteActionCompatParcelizer(_outputuptomillion, setencoding);
    }
}
