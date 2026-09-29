package kotlin;

import java.util.Map;
import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u0010\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\r\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0012\u0010\u0018J5\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00152\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\nJ\u0017\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\r\u0010\u001fJ!\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020 2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\r\u0010!R*\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0007@AX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b\r\u0010&R\u0014\u0010\u0012\u001a\u00020'8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u0013\u001a\u00020\u00018G¢\u0006\u0006\u001a\u0004\b*\u0010+R$\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b\u0013\u00100R.\u0010\u0010\u001a\u0004\u0018\u0001012\b\u0010\u0003\u001a\u0004\u0018\u0001018\u0017@UX\u0097\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b\r\u00106R\u0018\u0010\"\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u00108"}, d2 = {"Lo/_findRootDeserializer;", "Lo/_bindAndClose;", "Lo/_assertNotNull;", "p0", "Lo/_initForReading;", "p1", "<init>", "(Lo/_assertNotNull;Lo/_initForReading;)V", "", "RatingCompat", "()V", "Lo/PropertyValueAny;", "Lo/_parser;", "write", "(J)Lo/_parser;", "", "AudioAttributesCompatParcelizer", "(I)I", "read", "IconCompatParcelizer", "Lo/hasReferringProperties;", "", "Lo/hasAnyGetter;", "p2", "(JFLo/hasAnyGetter;)V", "Lkotlin/Function1;", "Lo/validateAppend;", "RemoteActionCompatParcelizer", "(JFLo/getAnswerMap;)V", "accessensureViewModelStore", "Lo/weirdNumberException;", "(Lo/weirdNumberException;)I", "Lo/JsonParserDelegate;", "(Lo/JsonParserDelegate;Lo/hasAnyGetter;)V", "AudioAttributesImplApi26Parcelizer", "Lo/_initForReading;", "handleMediaPlayPauseIfPendingOnHandler", "()Lo/_initForReading;", "(Lo/_initForReading;)V", "Lo/_handleOddName$IconCompatParcelizer;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()Lo/_handleOddName$IconCompatParcelizer;", "onCommand", "()Lo/_bindAndClose;", "MediaBrowserCompatItemReceiver", "Lo/PropertyValueAny;", "onCustomAction", "()Lo/PropertyValueAny;", "(Lo/PropertyValueAny;)V", "Lo/readerFor;", "AudioAttributesImplApi21Parcelizer", "Lo/readerFor;", "MediaMetadataCompat", "()Lo/readerFor;", "(Lo/readerFor;)V", "Lo/containedType;", "Lo/containedType;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _findRootDeserializer extends _bindAndClose {
    private static final releaseBuffers read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private readerFor AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private _initForReading write;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private PropertyValueAny RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private containedType AudioAttributesImplApi26Parcelizer;

    public _findRootDeserializer(_assertNotNull _assertnotnull, _initForReading _initforreading) {
        super(_assertnotnull);
        this.write = _initforreading;
        containedType containedtype = null;
        this.AudioAttributesCompatParcelizer = _assertnotnull.getMediaBrowserCompatSearchResultReceiver() != null ? new AudioAttributesCompatParcelizer() : null;
        if ((_initforreading.getRead().getWrite() & _bind.write(512)) != 0) {
            toMagicModuleMetaRepoModel.read(_initforreading, "");
            containedtype = new containedType(this, (EnumNamingStrategy) _initforreading);
        }
        this.AudioAttributesImplApi26Parcelizer = containedtype;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final _initForReading getWrite() {
        return this.write;
    }

    public final void write(_initForReading _initforreading) {
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_initforreading, this.write)) {
            _handleOddName.IconCompatParcelizer iconCompatParcelizerOnFastForward = _initforreading.getRead();
            if ((iconCompatParcelizerOnFastForward.getWrite() & _bind.write(512)) != 0) {
                toMagicModuleMetaRepoModel.read(_initforreading, "");
                EnumNamingStrategy enumNamingStrategy = (EnumNamingStrategy) _initforreading;
                containedType containedtype = this.AudioAttributesImplApi26Parcelizer;
                if (containedtype != null) {
                    containedtype.RemoteActionCompatParcelizer(enumNamingStrategy);
                } else {
                    containedtype = new containedType(this, enumNamingStrategy);
                }
                this.AudioAttributesImplApi26Parcelizer = containedtype;
            } else {
                this.AudioAttributesImplApi26Parcelizer = null;
            }
        }
        this.write = _initforreading;
    }

    @Override // kotlin._bindAndClose
    public final _handleOddName.IconCompatParcelizer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.write.getRead();
    }

    public final _bindAndClose onCommand() {
        _bindAndClose read2 = getRead();
        toMagicModuleMetaRepoModel.write(read2);
        return read2;
    }

    public final void IconCompatParcelizer(PropertyValueAny propertyValueAny) {
        this.RemoteActionCompatParcelizer = propertyValueAny;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final PropertyValueAny getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin._bindAndClose
    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final readerFor getWrite() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin._bindAndClose
    protected final void write(readerFor readerfor) {
        this.AudioAttributesCompatParcelizer = readerfor;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0007\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\r"}, d2 = {"Lo/_findRootDeserializer$AudioAttributesCompatParcelizer;", "Lo/readerFor;", "<init>", "(Lo/_findRootDeserializer;)V", "Lo/PropertyValueAny;", "p0", "Lo/_parser;", "write", "(J)Lo/_parser;", "Lo/weirdNumberException;", "", "(Lo/weirdNumberException;)I", "AudioAttributesCompatParcelizer", "(I)I", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class AudioAttributesCompatParcelizer extends readerFor {
        public AudioAttributesCompatParcelizer() {
            super(_findRootDeserializer.this);
        }

        @Override // kotlin.isTypeOrSuperTypeOf
        public final _parser write(long p0) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this;
            _findRootDeserializer _findrootdeserializer = _findRootDeserializer.this;
            audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(p0);
            _findrootdeserializer.IconCompatParcelizer(PropertyValueAny.read(p0));
            readerFor audioAttributesCompatParcelizer2 = _findrootdeserializer.onCommand().getWrite();
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer2);
            audioAttributesCompatParcelizer.read(_findrootdeserializer.getWrite().read(this, audioAttributesCompatParcelizer2, p0));
            return audioAttributesCompatParcelizer;
        }

        @Override // kotlin.createDeserializationContext
        public final int write(weirdNumberException p0) {
            int iAudioAttributesCompatParcelizer = _newWriter.AudioAttributesCompatParcelizer(this, p0);
            MediaMetadataCompat().RemoteActionCompatParcelizer(p0, iAudioAttributesCompatParcelizer);
            return iAudioAttributesCompatParcelizer;
        }

        @Override // kotlin.readerFor, kotlin.hasHandlers
        public final int AudioAttributesCompatParcelizer(int p0) {
            _initForReading write = _findRootDeserializer.this.getWrite();
            readerFor audioAttributesCompatParcelizer = _findRootDeserializer.this.onCommand().getWrite();
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer);
            return write.read((getValueHandler) this, (hasHandlers) audioAttributesCompatParcelizer, p0);
        }

        @Override // kotlin.readerFor, kotlin.hasHandlers
        public final int write(int p0) {
            _initForReading write = _findRootDeserializer.this.getWrite();
            readerFor audioAttributesCompatParcelizer = _findRootDeserializer.this.onCommand().getWrite();
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer);
            return write.RemoteActionCompatParcelizer(this, audioAttributesCompatParcelizer, p0);
        }

        @Override // kotlin.readerFor, kotlin.hasHandlers
        public final int read(int p0) {
            _initForReading write = _findRootDeserializer.this.getWrite();
            readerFor audioAttributesCompatParcelizer = _findRootDeserializer.this.onCommand().getWrite();
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer);
            return write.AudioAttributesCompatParcelizer(this, audioAttributesCompatParcelizer, p0);
        }

        @Override // kotlin.readerFor, kotlin.hasHandlers
        public final int IconCompatParcelizer(int p0) {
            _initForReading write = _findRootDeserializer.this.getWrite();
            readerFor audioAttributesCompatParcelizer = _findRootDeserializer.this.onCommand().getWrite();
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer);
            return write.write(this, audioAttributesCompatParcelizer, p0);
        }
    }

    @Override // kotlin._bindAndClose
    public final void RatingCompat() {
        if (getWrite() == null) {
            write(new AudioAttributesCompatParcelizer());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    @Override // kotlin.isTypeOrSuperTypeOf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin._parser write(long r9) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._findRootDeserializer.write(long):o._parser");
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/_findRootDeserializer$read;", "Lo/withHandlersFrom;", "", "onMediaButtonEvent", "()V", "", "AudioAttributesCompatParcelizer", "I", "onFastForward", "()I", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "onAddQueueItem", "read", "", "Lo/weirdNumberException;", "AudioAttributesImplApi26Parcelizer", "()Ljava/util/Map;", "write", "Lkotlin/Function1;", "Lo/JsonNode;", "onPause", "()Lo/getAnswerMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements withHandlersFrom {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final int IconCompatParcelizer;
        private final /* synthetic */ withHandlersFrom IconCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final int read;

        read(withHandlersFrom withhandlersfrom, _findRootDeserializer _findrootdeserializer) {
            this.IconCompatParcelizer = withhandlersfrom;
            readerFor audioAttributesCompatParcelizer = _findrootdeserializer.getWrite();
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer);
            this.IconCompatParcelizer = audioAttributesCompatParcelizer.getRead();
            readerFor audioAttributesCompatParcelizer2 = _findrootdeserializer.getWrite();
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer2);
            this.read = audioAttributesCompatParcelizer2.getRemoteActionCompatParcelizer();
        }

        @Override // kotlin.withHandlersFrom
        /* JADX INFO: renamed from: onFastForward, reason: from getter */
        public final int getRemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        @Override // kotlin.withHandlersFrom
        /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
        public final int getIconCompatParcelizer() {
            return this.read;
        }

        @Override // kotlin.withHandlersFrom
        public final Map<weirdNumberException, Integer> AudioAttributesImplApi26Parcelizer() {
            return this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        }

        @Override // kotlin.withHandlersFrom
        public final getAnswerMap<JsonNode, getShowPopup> onPause() {
            return this.IconCompatParcelizer.onPause();
        }

        @Override // kotlin.withHandlersFrom
        public final void onMediaButtonEvent() {
            this.IconCompatParcelizer.onMediaButtonEvent();
        }
    }

    @Override // kotlin.hasHandlers
    public final int AudioAttributesCompatParcelizer(int p0) {
        containedType containedtype = this.AudioAttributesImplApi26Parcelizer;
        if (containedtype != null) {
            return containedtype.getRemoteActionCompatParcelizer().read((DeserializationContext1) containedtype, (hasHandlers) onCommand(), p0);
        }
        return this.write.read((getValueHandler) this, (hasHandlers) onCommand(), p0);
    }

    @Override // kotlin.hasHandlers
    public final int write(int p0) {
        containedType containedtype = this.AudioAttributesImplApi26Parcelizer;
        if (containedtype != null) {
            return containedtype.getRemoteActionCompatParcelizer().AudioAttributesCompatParcelizer((DeserializationContext1) containedtype, (hasHandlers) onCommand(), p0);
        }
        return this.write.RemoteActionCompatParcelizer(this, onCommand(), p0);
    }

    @Override // kotlin.hasHandlers
    public final int read(int p0) {
        containedType containedtype = this.AudioAttributesImplApi26Parcelizer;
        if (containedtype != null) {
            return containedtype.getRemoteActionCompatParcelizer().write((DeserializationContext1) containedtype, (hasHandlers) onCommand(), p0);
        }
        return this.write.AudioAttributesCompatParcelizer(this, onCommand(), p0);
    }

    @Override // kotlin.hasHandlers
    public final int IconCompatParcelizer(int p0) {
        containedType containedtype = this.AudioAttributesImplApi26Parcelizer;
        if (containedtype != null) {
            return containedtype.getRemoteActionCompatParcelizer().IconCompatParcelizer(containedtype, onCommand(), p0);
        }
        return this.write.write(this, onCommand(), p0);
    }

    @Override // kotlin._bindAndClose, kotlin._parser
    public final void read(long p0, float p1, hasAnyGetter p2) {
        super.read(p0, p1, p2);
        accessensureViewModelStore();
    }

    @Override // kotlin._bindAndClose, kotlin._parser
    public final void RemoteActionCompatParcelizer(long p0, float p1, getAnswerMap<? super validateAppend, getShowPopup> p2) {
        super.RemoteActionCompatParcelizer(p0, p1, p2);
        accessensureViewModelStore();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void accessensureViewModelStore() {
        /*
            r8 = this;
            boolean r0 = r8.getRatingCompat()
            if (r0 == 0) goto L7
            return
        L7:
            r8._init_lambda2()
            o._bindAndClose r0 = r8.onCommand()
            o.containedType r1 = r8.AudioAttributesImplApi26Parcelizer
            r2 = 0
            if (r1 == 0) goto L6d
            o.EnumNamingStrategy r3 = r1.getRemoteActionCompatParcelizer()
            o._parser$IconCompatParcelizer r4 = r8.getMediaDescriptionCompat()
            o.readerFor r5 = r8.getWrite()
            kotlin.toMagicModuleMetaRepoModel.write(r5)
            o.withContentType r5 = r5.getHandleMediaPlayPauseIfPendingOnHandler()
            o.isAbstract r5 = (kotlin.isAbstract) r5
            boolean r3 = r3.RemoteActionCompatParcelizer(r4, r5)
            if (r3 != 0) goto L69
            boolean r1 = r1.getIconCompatParcelizer()
            if (r1 != 0) goto L69
            long r3 = r8.write()
            o.readerFor r1 = r8.getWrite()
            r5 = 0
            if (r1 == 0) goto L48
            long r6 = r1.onCustomAction()
            o.getKey r1 = kotlin.getKey.AudioAttributesCompatParcelizer(r6)
            goto L49
        L48:
            r1 = r5
        L49:
            boolean r1 = kotlin.getKey.AudioAttributesCompatParcelizer(r3, r1)
            if (r1 == 0) goto L69
            long r3 = r0.write()
            o.readerFor r1 = r0.getWrite()
            if (r1 == 0) goto L61
            long r5 = r1.onCustomAction()
            o.getKey r5 = kotlin.getKey.AudioAttributesCompatParcelizer(r5)
        L61:
            boolean r1 = kotlin.getKey.AudioAttributesCompatParcelizer(r3, r5)
            if (r1 == 0) goto L69
            r1 = 1
            goto L6a
        L69:
            r1 = r2
        L6a:
            r0.AudioAttributesImplApi21Parcelizer(r1)
        L6d:
            boolean r1 = r8.getMediaBrowserCompatMediaItem()
            r0.RemoteActionCompatParcelizer(r1)
            o.withHandlersFrom r8 = r8.onMediaButtonEvent()
            r8.onMediaButtonEvent()
            r0.RemoteActionCompatParcelizer(r2)
            r0.AudioAttributesImplApi21Parcelizer(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._findRootDeserializer.accessensureViewModelStore():void");
    }

    @Override // kotlin.createDeserializationContext
    public final int write(weirdNumberException p0) {
        readerFor audioAttributesCompatParcelizer = getWrite();
        return audioAttributesCompatParcelizer != null ? audioAttributesCompatParcelizer.IconCompatParcelizer(p0) : _newWriter.AudioAttributesCompatParcelizer(this, p0);
    }

    @Override // kotlin._bindAndClose
    public final void write(JsonParserDelegate p0, hasAnyGetter p1) {
        _bindAndClose read2;
        onCommand().AudioAttributesCompatParcelizer(p0, p1);
        if (!_serializerProvider.AudioAttributesCompatParcelizer(getIconCompatParcelizer()).getShowLayoutBounds() || (read2 = getRead()) == null) {
            return;
        }
        if (getKey.AudioAttributesCompatParcelizer(write(), read2.write()) && hasReferringProperties.write(read2.getRead(), hasReferringProperties.INSTANCE.write())) {
            return;
        }
        AudioAttributesCompatParcelizer(p0, read);
    }

    static {
        releaseBuffers releasebuffersAudioAttributesCompatParcelizer = fromInitial.AudioAttributesCompatParcelizer();
        releasebuffersAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(switchToNext.INSTANCE.IconCompatParcelizer());
        releasebuffersAudioAttributesCompatParcelizer.write(1.0f);
        releasebuffersAudioAttributesCompatParcelizer.write(ThreadLocalBufferManager.INSTANCE.write());
        read = releasebuffersAudioAttributesCompatParcelizer;
    }
}
