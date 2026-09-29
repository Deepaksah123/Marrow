package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\b\u001a*\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\u0015\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007X\u008a\u0084\u0002"}, d2 = {"Dialog", "", "onDismissRequest", "Lkotlin/Function0;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DialogLayout", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ui", "currentContent"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _fromInt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesCompatParcelizer;
        final /* synthetic */ getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;
        final /* synthetic */ int RemoteActionCompatParcelizer;
        final /* synthetic */ int read;
        final /* synthetic */ CollectionDeserializerCollectionReferring write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems, CollectionDeserializerCollectionReferring collectionDeserializerCollectionReferring, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, int i, int i2) {
            super(2);
            this.IconCompatParcelizer = getcreatedondatems;
            this.write = collectionDeserializerCollectionReferring;
            this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
            this.read = i;
            this.RemoteActionCompatParcelizer = i2;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            _fromInt.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.write, this.AudioAttributesCompatParcelizer, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.read | 1), this.RemoteActionCompatParcelizer);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ _handleOddName AudioAttributesCompatParcelizer;
        final /* synthetic */ int IconCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> RemoteActionCompatParcelizer;
        final /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(_handleOddName _handleoddname, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, int i, int i2) {
            super(2);
            this.AudioAttributesCompatParcelizer = _handleoddname;
            this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
            this.IconCompatParcelizer = i;
            this.write = i2;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            IconCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            _fromInt.write(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.IconCompatParcelizer | 1), this.write);
        }
    }

    /* JADX INFO: renamed from: o._fromInt$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/StreamConstraintsException;", "Lo/_wrapError;", "AudioAttributesCompatParcelizer", "(Lo/StreamConstraintsException;)Lo/_wrapError;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<StreamConstraintsException, _wrapError> {
        final /* synthetic */ handleNonArray $write;

        /* JADX INFO: renamed from: o._fromInt$2$write */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lo/StreamConstraintsException$read;", "Lo/_wrapError;", "", "RemoteActionCompatParcelizer", "()V", "o/StreamConstraintsException$read"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class write implements _wrapError {
            final /* synthetic */ handleNonArray read;

            public write(handleNonArray handlenonarray) {
                this.read = handlenonarray;
            }

            @Override // kotlin._wrapError
            public final void RemoteActionCompatParcelizer() {
                this.read.dismiss();
                this.read.write();
            }
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final _wrapError invoke(StreamConstraintsException streamConstraintsException) {
            this.$write.show();
            return new write(this.$write);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(handleNonArray handlenonarray) {
            super(1);
            this.$write = handlenonarray;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AudioAttributesCompatParcelizer(kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r24, kotlin.CollectionDeserializerCollectionReferring r25, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r26, kotlin._handleUnrecognizedCharacterEscape r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._fromInt.AudioAttributesCompatParcelizer(o.getCreatedOnDateMs, o.CollectionDeserializerCollectionReferring, o.MagicModuleSubmissionRequestBody, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: renamed from: o._fromInt$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/UUID;", "write", "()Ljava/util/UUID;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<UUID> {
        public static final AnonymousClass4 AudioAttributesCompatParcelizer = new AnonymousClass4();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }

        AnonymousClass4() {
            super(0);
        }
    }

    /* JADX INFO: renamed from: o._fromInt$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "IconCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;I)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ parseDouble<MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup>> $RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o._fromInt$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getConfigOverride;", "", "RemoteActionCompatParcelizer", "(Lo/getConfigOverride;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<getConfigOverride, getShowPopup> {
            public static final AnonymousClass2 write = new AnonymousClass2();

            public final void RemoteActionCompatParcelizer(getConfigOverride getconfigoverride) {
                MapperBuilder.IconCompatParcelizer(getconfigoverride);
            }

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(getConfigOverride getconfigoverride) {
                RemoteActionCompatParcelizer(getconfigoverride);
                return getShowPopup.INSTANCE;
            }

            AnonymousClass2() {
                super(1);
            }
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            IconCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(346960332, i, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:213)");
            }
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            AnonymousClass2 anonymousClass2OnPause = _handleunrecognizedcharacterescape.onPause();
            if (anonymousClass2OnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                anonymousClass2OnPause = AnonymousClass2.write;
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(anonymousClass2OnPause);
            }
            _fromInt.write(withValueInstantiators.read$default(companion, false, (getAnswerMap) anonymousClass2OnPause, 1, null), _fromInt.AudioAttributesCompatParcelizer(this.$RemoteActionCompatParcelizer), _handleunrecognizedcharacterescape, 0, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(parseDouble<? extends MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>> parsedouble) {
            super(2);
            this.$RemoteActionCompatParcelizer = parsedouble;
        }
    }

    /* JADX INFO: renamed from: o._fromInt$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "write", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ tryToResolveUnresolved $AudioAttributesCompatParcelizer;
        final /* synthetic */ handleNonArray $IconCompatParcelizer;
        final /* synthetic */ getCreatedOnDateMs<getShowPopup> $RemoteActionCompatParcelizer;
        final /* synthetic */ CollectionDeserializerCollectionReferring $write;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            write();
            return getShowPopup.INSTANCE;
        }

        public final void write() {
            this.$IconCompatParcelizer.write(this.$RemoteActionCompatParcelizer, this.$write, this.$AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(handleNonArray handlenonarray, getCreatedOnDateMs<getShowPopup> getcreatedondatems, CollectionDeserializerCollectionReferring collectionDeserializerCollectionReferring, tryToResolveUnresolved trytoresolveunresolved) {
            super(0);
            this.$IconCompatParcelizer = handlenonarray;
            this.$RemoteActionCompatParcelizer = getcreatedondatems;
            this.$write = collectionDeserializerCollectionReferring;
            this.$AudioAttributesCompatParcelizer = trytoresolveunresolved;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(_handleOddName _handleoddname, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1090521195);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 19) != 18, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (i4 != 0) {
                _handleoddname = _handleOddName.INSTANCE;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1090521195, i3, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:687)");
            }
            AnonymousClass5 anonymousClass5OnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (anonymousClass5OnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                anonymousClass5OnPause = new withTypeHandler() { // from class: o._fromInt.5

                    /* JADX INFO: renamed from: o._fromInt$5$5, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "write", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    static final class C00555 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
                        final /* synthetic */ List<_parser> $write;

                        @Override // kotlin.getAnswerMap
                        public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
                            write(iconCompatParcelizer);
                            return getShowPopup.INSTANCE;
                        }

                        public final void write(_parser.IconCompatParcelizer iconCompatParcelizer) {
                            List<_parser> list = this.$write;
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, list.get(i), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C00555(List<? extends _parser> list) {
                            super(1);
                            this.$write = list;
                        }
                    }

                    @Override // kotlin.withTypeHandler
                    public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int iMediaBrowserCompatItemReceiver = 0;
                        int iMediaBrowserCompatCustomActionResultReceiver = 0;
                        for (int i5 = 0; i5 < size; i5++) {
                            _parser _parserVarWrite = list.get(i5).write(j);
                            iMediaBrowserCompatItemReceiver = Math.max(iMediaBrowserCompatItemReceiver, _parserVarWrite.getRead());
                            iMediaBrowserCompatCustomActionResultReceiver = Math.max(iMediaBrowserCompatCustomActionResultReceiver, _parserVarWrite.getRemoteActionCompatParcelizer());
                            arrayList.add(_parserVarWrite);
                        }
                        ArrayList arrayList2 = arrayList;
                        if (list.isEmpty()) {
                            iMediaBrowserCompatItemReceiver = PropertyValueAny.MediaBrowserCompatItemReceiver(j);
                            iMediaBrowserCompatCustomActionResultReceiver = PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j);
                        }
                        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, iMediaBrowserCompatItemReceiver, iMediaBrowserCompatCustomActionResultReceiver, null, new C00555(arrayList2), 4, null);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(anonymousClass5OnPause);
            }
            withTypeHandler withtypehandler = (withTypeHandler) anonymousClass5OnPause;
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname);
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
            magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf(((((((((i3 >> 3) & 14) | RendererCapabilities.MODE_SUPPORT_MASK) | ((i3 << 3) & 112)) << 6) & 896) | 6) >> 6) & 14));
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new RemoteActionCompatParcelizer(_handleoddname, magicModuleSubmissionRequestBody, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesCompatParcelizer(parseDouble<? extends MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>> parsedouble) {
        return (MagicModuleSubmissionRequestBody) parsedouble.getRemoteActionCompatParcelizer();
    }
}
