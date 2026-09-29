package kotlin;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionCompatToken {

    static final class read extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ boolean AudioAttributesCompatParcelizer;
        final /* synthetic */ getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;
        final /* synthetic */ int RemoteActionCompatParcelizer;
        final /* synthetic */ int read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(boolean z, getCreatedOnDateMs<getShowPopup> getcreatedondatems, int i, int i2) {
            super(2);
            this.AudioAttributesCompatParcelizer = z;
            this.IconCompatParcelizer = getcreatedondatems;
            this.read = i;
            this.RemoteActionCompatParcelizer = i2;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape);
            return getShowPopup.INSTANCE;
        }

        private void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
            MediaSessionCompatToken.write(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, _handleunrecognizedcharacterescape, this.read | 1, this.RemoteActionCompatParcelizer);
        }
    }

    /* JADX INFO: renamed from: o.MediaSessionCompatToken$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/StreamConstraintsException;", "Lo/_wrapError;", "read", "(Lo/StreamConstraintsException;)Lo/_wrapError;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<StreamConstraintsException, _wrapError> {
        final /* synthetic */ write $AudioAttributesCompatParcelizer;
        final /* synthetic */ hasGetter $IconCompatParcelizer;
        final /* synthetic */ onSetRating $write;

        /* JADX INFO: renamed from: o.MediaSessionCompatToken$5$write */
        public static final class write implements _wrapError {
            final /* synthetic */ write IconCompatParcelizer;

            public write(write writeVar) {
                this.IconCompatParcelizer = writeVar;
            }

            @Override // kotlin._wrapError
            public final void RemoteActionCompatParcelizer() {
                this.IconCompatParcelizer.remove();
            }
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final _wrapError invoke(StreamConstraintsException streamConstraintsException) {
            this.$write.AudioAttributesCompatParcelizer(this.$IconCompatParcelizer, this.$AudioAttributesCompatParcelizer);
            return new write(this.$AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(onSetRating onsetrating, hasGetter hasgetter, write writeVar) {
            super(1);
            this.$write = onsetrating;
            this.$IconCompatParcelizer = hasgetter;
            this.$AudioAttributesCompatParcelizer = writeVar;
        }
    }

    public static final void write(boolean z, getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(getcreatedondatems) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !_handleunrecognizedcharacterescapeWrite.onPlay()) {
            if (i4 != 0) {
                z = true;
            }
            parseDouble parsedouble = _qbuf.read(getcreatedondatems, _handleunrecognizedcharacterescapeWrite, (i3 >> 3) & 14);
            _handleunrecognizedcharacterescapeWrite.read(-971159753);
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new write(z, parsedouble);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            write writeVar = (write) objOnPause;
            _handleunrecognizedcharacterescapeWrite.RatingCompat();
            _handleunrecognizedcharacterescapeWrite.read(-971159481);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(writeVar);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z);
            AnonymousClass2 anonymousClass2OnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || anonymousClass2OnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                anonymousClass2OnPause = new AnonymousClass2(writeVar, z);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((Object) anonymousClass2OnPause);
            }
            _handleunrecognizedcharacterescapeWrite.RatingCompat();
            StreamReadException.write((getCreatedOnDateMs) anonymousClass2OnPause, _handleunrecognizedcharacterescapeWrite, 0);
            MediaSessionCompatQueueItem mediaSessionCompatQueueItem = MediaSessionCompatQueueItem.INSTANCE;
            onSetShuffleMode onsetshufflemodeRemoteActionCompatParcelizer = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite);
            if (onsetshufflemodeRemoteActionCompatParcelizer == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
            onSetRating iconCompatParcelizer = onsetshufflemodeRemoteActionCompatParcelizer.getIconCompatParcelizer();
            hasGetter hasgetter = (hasGetter) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            _handleunrecognizedcharacterescapeWrite.read(-971159120);
            boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(iconCompatParcelizer);
            boolean zAudioAttributesCompatParcelizer4 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(hasgetter);
            boolean zAudioAttributesCompatParcelizer5 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(writeVar);
            AnonymousClass5 anonymousClass5OnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zAudioAttributesCompatParcelizer3 | zAudioAttributesCompatParcelizer4 | zAudioAttributesCompatParcelizer5) || anonymousClass5OnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                anonymousClass5OnPause = new AnonymousClass5(iconCompatParcelizer, hasgetter, writeVar);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(anonymousClass5OnPause);
            }
            _handleunrecognizedcharacterescapeWrite.RatingCompat();
            StreamReadException.RemoteActionCompatParcelizer(hasgetter, iconCompatParcelizer, (getAnswerMap) anonymousClass5OnPause, _handleunrecognizedcharacterescapeWrite, 0);
        } else {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new read(z, getcreatedondatems, i, i2));
        }
    }

    public static final class write extends onRemoveQueueItemAt {
        final /* synthetic */ parseDouble<getCreatedOnDateMs<getShowPopup>> RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        write(boolean z, parseDouble<? extends getCreatedOnDateMs<getShowPopup>> parsedouble) {
            super(z);
            this.RemoteActionCompatParcelizer = parsedouble;
        }

        @Override // kotlin.onRemoveQueueItemAt
        public final void handleOnBackPressed() {
            MediaSessionCompatToken.read(this.RemoteActionCompatParcelizer).invoke();
        }
    }

    /* JADX INFO: renamed from: o.MediaSessionCompatToken$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ boolean $RemoteActionCompatParcelizer;
        final /* synthetic */ write $read;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            RemoteActionCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer() {
            this.$read.setEnabled(this.$RemoteActionCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(write writeVar, boolean z) {
            super(0);
            this.$read = writeVar;
            this.$RemoteActionCompatParcelizer = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getCreatedOnDateMs<getShowPopup> read(parseDouble<? extends getCreatedOnDateMs<getShowPopup>> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer();
    }
}
