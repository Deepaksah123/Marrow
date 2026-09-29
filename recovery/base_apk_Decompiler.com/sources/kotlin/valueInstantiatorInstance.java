package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u00020\u00112\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00142\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\u00020\u0011*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00142\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001bJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u0012\u0010\u001dJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u0017\u001a\u00020\u00112\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u0017\u0010!J-\u0010\u000e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\"2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00110#H\u0002¢\u0006\u0004\b\u000e\u0010%J\u000f\u0010\u0017\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010&R\u0014\u0010\u0012\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0011\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u001a\u0010\u000e\u001a\u00020\u00068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0015\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0017\u001a\u00020\u00048\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u00102R\u0014\u00105\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u00101R\u0011\u00107\u001a\u0002068G¢\u0006\u0006\u001a\u0004\b7\u00108R\u001a\u0010'\u001a\u0002098\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010:\u001a\u0004\b'\u0010;R\u0011\u0010+\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010?\u001a\u00020>8G¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010A\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010=R\u0011\u0010D\u001a\u00020B8G¢\u0006\u0006\u001a\u0004\bC\u0010@R\u0011\u0010<\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0019\u0010=R\u0014\u0010C\u001a\u00020\r8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010=R\u0014\u00104\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u00101R\u0011\u0010\u001f\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b5\u0010/R\u0014\u0010E\u001a\u00020\u00048CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u00101R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00000\u00148G¢\u0006\u0006\u001a\u0004\b3\u0010GR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00000\u00148AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010GR\u0013\u0010H\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\bD\u0010&"}, d2 = {"Lo/valueInstantiatorInstance;", "", "Lo/_handleOddName$IconCompatParcelizer;", "p0", "", "p1", "Lo/_assertNotNull;", "p2", "Lo/valueInstantiators;", "p3", "<init>", "(Lo/_handleOddName$IconCompatParcelizer;ZLo/_assertNotNull;Lo/valueInstantiators;)V", "Lo/isAbstract;", "Lo/WritableTypeIdInclusion;", "IconCompatParcelizer", "(Lo/isAbstract;)Lo/WritableTypeIdInclusion;", "", "", "AudioAttributesCompatParcelizer", "(Ljava/util/List;Lo/valueInstantiators;)V", "", "write", "(Ljava/util/List;ZZ)Ljava/util/List;", "read", "(Lo/_assertNotNull;Ljava/util/List;Z)V", "RemoteActionCompatParcelizer", "(ZZZ)Ljava/util/List;", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lo/_bindAndClose;", "()Lo/_bindAndClose;", "Lo/hasIndex;", "onCustomAction", "()Lo/hasIndex;", "(Ljava/util/List;)V", "Lo/keyDeserializers;", "Lkotlin/Function1;", "Lo/getConfigOverride;", "(Lo/keyDeserializers;Lo/getAnswerMap;)Lo/valueInstantiatorInstance;", "()Lo/valueInstantiatorInstance;", "AudioAttributesImplApi21Parcelizer", "Lo/_handleOddName$IconCompatParcelizer;", "Z", "Lo/_assertNotNull;", "AudioAttributesImplApi26Parcelizer", "()Lo/_assertNotNull;", "Lo/valueInstantiators;", "handleMediaPlayPauseIfPendingOnHandler", "()Lo/valueInstantiators;", "onAddQueueItem", "()Z", "Lo/valueInstantiatorInstance;", "MediaBrowserCompatItemReceiver", "onCommand", "AudioAttributesImplBaseParcelizer", "Lo/isEnumImplType;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/isEnumImplType;", "", "I", "()I", "RatingCompat", "()Lo/WritableTypeIdInclusion;", "Lo/getKey;", "MediaDescriptionCompat", "()J", "MediaBrowserCompatSearchResultReceiver", "Lo/getReferencedType;", "MediaMetadataCompat", "MediaBrowserCompatMediaItem", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onMediaButtonEvent", "()Ljava/util/List;", "onFastForward"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class valueInstantiatorInstance {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private valueInstantiatorInstance MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final _handleOddName.IconCompatParcelizer AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final C0216valueInstantiators write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final _assertNotNull IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    public valueInstantiatorInstance(_handleOddName.IconCompatParcelizer iconCompatParcelizer, boolean z, _assertNotNull _assertnotnull, C0216valueInstantiators c0216valueInstantiators) {
        this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = _assertnotnull;
        this.write = c0216valueInstantiators;
        this.AudioAttributesImplApi21Parcelizer = _assertnotnull.getIconCompatParcelizer();
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final _assertNotNull getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final C0216valueInstantiators getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    public final boolean onCommand() {
        if (this.read || !MediaBrowserCompatSearchResultReceiver().isEmpty()) {
            return false;
        }
        _assertNotNull _assertnotnull_init_lambda4 = this.IconCompatParcelizer._init_lambda4();
        while (true) {
            if (_assertnotnull_init_lambda4 == null) {
                _assertnotnull_init_lambda4 = null;
                break;
            }
            C0216valueInstantiators c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp = _assertnotnull_init_lambda4.accessgetReportFullyDrawnExecutorp();
            if (c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp != null && c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp.getRead()) {
                break;
            }
            _assertnotnull_init_lambda4 = _assertnotnull_init_lambda4._init_lambda4();
        }
        return _assertnotnull_init_lambda4 == null;
    }

    public final isEnumImplType MediaBrowserCompatCustomActionResultReceiver() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final WritableTypeIdInclusion RatingCompat() {
        hasIndex hasindexOnCustomAction = onCustomAction();
        if (hasindexOnCustomAction == null) {
            return this.IconCompatParcelizer.onPrepareFromUri()._init_lambda4();
        }
        return getValueNulls.write(hasindexOnCustomAction.getRead(), getValueNulls.IconCompatParcelizer(this.write));
    }

    public final long MediaDescriptionCompat() {
        _bindAndClose _bindandcloseAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        return _bindandcloseAudioAttributesCompatParcelizer != null ? _bindandcloseAudioAttributesCompatParcelizer.write() : getKey.INSTANCE.RemoteActionCompatParcelizer();
    }

    public final WritableTypeIdInclusion IconCompatParcelizer() {
        WritableTypeIdInclusion writableTypeIdInclusionIconCompatParcelizer;
        _bindAndClose _bindandcloseAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (_bindandcloseAudioAttributesCompatParcelizer != null) {
            if (!_bindandcloseAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver()) {
                _bindandcloseAudioAttributesCompatParcelizer = null;
            }
            if (_bindandcloseAudioAttributesCompatParcelizer != null && (writableTypeIdInclusionIconCompatParcelizer = hasRawClass.IconCompatParcelizer(_bindandcloseAudioAttributesCompatParcelizer)) != null) {
                return writableTypeIdInclusionIconCompatParcelizer;
            }
        }
        return WritableTypeIdInclusion.INSTANCE.write();
    }

    public final long MediaMetadataCompat() {
        _bindAndClose _bindandcloseAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (_bindandcloseAudioAttributesCompatParcelizer != null) {
            if (!_bindandcloseAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver()) {
                _bindandcloseAudioAttributesCompatParcelizer = null;
            }
            if (_bindandcloseAudioAttributesCompatParcelizer != null) {
                return hasRawClass.AudioAttributesCompatParcelizer(_bindandcloseAudioAttributesCompatParcelizer);
            }
        }
        return getReferencedType.INSTANCE.write();
    }

    public final WritableTypeIdInclusion RemoteActionCompatParcelizer() {
        WritableTypeIdInclusion writableTypeIdInclusionAudioAttributesCompatParcelizer$default;
        _bindAndClose _bindandcloseAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (_bindandcloseAudioAttributesCompatParcelizer != null) {
            if (!_bindandcloseAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver()) {
                _bindandcloseAudioAttributesCompatParcelizer = null;
            }
            if (_bindandcloseAudioAttributesCompatParcelizer != null && (writableTypeIdInclusionAudioAttributesCompatParcelizer$default = hasRawClass.AudioAttributesCompatParcelizer$default(_bindandcloseAudioAttributesCompatParcelizer, false, 1, null)) != null) {
                return writableTypeIdInclusionAudioAttributesCompatParcelizer$default;
            }
        }
        return WritableTypeIdInclusion.INSTANCE.write();
    }

    public final WritableTypeIdInclusion write() {
        isAbstract isabstractOnFastForward;
        _bindAndClose _bindandcloseAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (_bindandcloseAudioAttributesCompatParcelizer != null) {
            if (!_bindandcloseAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver()) {
                _bindandcloseAudioAttributesCompatParcelizer = null;
            }
            if (_bindandcloseAudioAttributesCompatParcelizer != null && (isabstractOnFastForward = _bindandcloseAudioAttributesCompatParcelizer.onFastForward()) != null) {
                return IconCompatParcelizer(isabstractOnFastForward);
            }
        }
        return WritableTypeIdInclusion.INSTANCE.write();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    private final WritableTypeIdInclusion IconCompatParcelizer(isAbstract p0) {
        ?? Write;
        valueInstantiatorInstance valueinstantiatorinstanceMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (valueinstantiatorinstanceMediaBrowserCompatMediaItem == null) {
            return WritableTypeIdInclusion.INSTANCE.write();
        }
        ObjectReader objectReader = valueinstantiatorinstanceMediaBrowserCompatMediaItem.IconCompatParcelizer.get_init_lambda2();
        int iWrite = _bind.write(8);
        if ((objectReader.MediaBrowserCompatSearchResultReceiver() & iWrite) != 0) {
            loop0: for (_handleOddName.IconCompatParcelizer audioAttributesImplApi21Parcelizer = objectReader.getAudioAttributesImplApi21Parcelizer(); audioAttributesImplApi21Parcelizer != null; audioAttributesImplApi21Parcelizer = audioAttributesImplApi21Parcelizer.getAudioAttributesImplBaseParcelizer()) {
                if ((audioAttributesImplApi21Parcelizer.getWrite() & iWrite) != 0) {
                    Write = audioAttributesImplApi21Parcelizer;
                    UTF32Reader uTF32Reader = null;
                    while (Write != 0) {
                        if (Write instanceof hasIndex) {
                            if (((hasIndex) Write).j_()) {
                                break loop0;
                            }
                        } else if ((Write.getWrite() & iWrite) != 0 && (Write instanceof addAbstractTypeResolver)) {
                            _handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) Write).getIconCompatParcelizer();
                            int i = 0;
                            Write = Write;
                            while (iconCompatParcelizer != null) {
                                if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                    i++;
                                    if (i == 1) {
                                        Write = iconCompatParcelizer;
                                    } else {
                                        if (uTF32Reader == null) {
                                            uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                        }
                                        if (Write != 0) {
                                            if (uTF32Reader != null) {
                                                uTF32Reader.read(Write);
                                            }
                                            Write = 0;
                                        }
                                        if (uTF32Reader != null) {
                                            uTF32Reader.read(iconCompatParcelizer);
                                        }
                                    }
                                }
                                iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer();
                                Write = Write;
                            }
                            if (i != 1) {
                            }
                        }
                        Write = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
                    }
                }
                if ((audioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer() & iWrite) == 0) {
                    break;
                }
            }
            Write = 0;
        } else {
            Write = 0;
        }
        hasIndex hasindex = (hasIndex) Write;
        _bindAndClose _bindandcloseWrite = hasindex != null ? collectLongDefaults.write((Module) hasindex, _bind.write(8)) : null;
        if (_bindandcloseWrite == null) {
            return valueinstantiatorinstanceMediaBrowserCompatMediaItem.IconCompatParcelizer(p0);
        }
        return isAbstract.write$default(_bindandcloseWrite, p0, false, 2, null);
    }

    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        _bindAndClose _bindandcloseAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (_bindandcloseAudioAttributesCompatParcelizer != null) {
            return _bindandcloseAudioAttributesCompatParcelizer.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        }
        return false;
    }

    public final C0216valueInstantiators AudioAttributesImplBaseParcelizer() {
        if (onMediaButtonEvent()) {
            C0216valueInstantiators c0216valueInstantiatorsAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer();
            AudioAttributesCompatParcelizer(new ArrayList(), c0216valueInstantiatorsAudioAttributesCompatParcelizer);
            return c0216valueInstantiatorsAudioAttributesCompatParcelizer;
        }
        return this.write;
    }

    private final void AudioAttributesCompatParcelizer(List<valueInstantiatorInstance> p0, C0216valueInstantiators p1) {
        if (this.write.getAudioAttributesImplApi21Parcelizer()) {
            return;
        }
        write$default(this, p0, false, false, 6, null);
        int size = p0.size();
        for (int size2 = p0.size(); size2 < size; size2++) {
            valueInstantiatorInstance valueinstantiatorinstance = p0.get(size2);
            if (!valueinstantiatorinstance.onMediaButtonEvent()) {
                p1.read(valueinstantiatorinstance.write);
                valueinstantiatorinstance.AudioAttributesCompatParcelizer(p0, p1);
            }
        }
    }

    private final boolean onMediaButtonEvent() {
        return this.RemoteActionCompatParcelizer && this.write.getRead();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List write$default(valueInstantiatorInstance valueinstantiatorinstance, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return valueinstantiatorinstance.write(list, z, z2);
    }

    public final List<valueInstantiatorInstance> write(List<valueInstantiatorInstance> p0, boolean p1, boolean p2) {
        if (this.read) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        read(this.IconCompatParcelizer, p0, p2);
        if (p1) {
            read(p0);
        }
        return p0;
    }

    private final void read(_assertNotNull _assertnotnull, List<valueInstantiatorInstance> list, boolean z) {
        UTF32Reader<_assertNotNull> uTF32ReaderAccessonBackPresseds1027565324 = _assertnotnull.accessonBackPresseds1027565324();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAccessonBackPresseds1027565324.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32ReaderAccessonBackPresseds1027565324.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            _assertNotNull _assertnotnull2 = _assertnotnullArr[i];
            if (_assertnotnull2.AudioAttributesImplApi26Parcelizer() && (z || !_assertnotnull2.getAddOnUserLeaveHintListener())) {
                if (_assertnotnull2.get_init_lambda2().write(_bind.write(8))) {
                    list.add(virtualPropertyWriterInstance.write(_assertnotnull2, this.RemoteActionCompatParcelizer));
                } else {
                    read(_assertnotnull2, list, z);
                }
            }
        }
    }

    public final List<valueInstantiatorInstance> MediaBrowserCompatItemReceiver() {
        return RemoteActionCompatParcelizer$default(this, false, false, false, 7, null);
    }

    public final List<valueInstantiatorInstance> MediaBrowserCompatSearchResultReceiver() {
        return RemoteActionCompatParcelizer$default(this, false, true, false, 4, null);
    }

    public static /* synthetic */ List RemoteActionCompatParcelizer$default(valueInstantiatorInstance valueinstantiatorinstance, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = !valueinstantiatorinstance.RemoteActionCompatParcelizer;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return valueinstantiatorinstance.RemoteActionCompatParcelizer(z, z2, z3);
    }

    public final List<valueInstantiatorInstance> RemoteActionCompatParcelizer(boolean p0, boolean p1, boolean p2) {
        if (!p0 && this.write.getAudioAttributesImplApi21Parcelizer()) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        ArrayList arrayList = new ArrayList();
        if (onMediaButtonEvent()) {
            return RemoteActionCompatParcelizer$default(this, arrayList, null, 2, null);
        }
        return write(arrayList, p1, p2);
    }

    public final valueInstantiatorInstance MediaBrowserCompatMediaItem() {
        _assertNotNull _assertnotnull_init_lambda4;
        valueInstantiatorInstance valueinstantiatorinstance = this.MediaBrowserCompatItemReceiver;
        if (valueinstantiatorinstance != null) {
            return valueinstantiatorinstance;
        }
        if (this.RemoteActionCompatParcelizer) {
            _assertnotnull_init_lambda4 = this.IconCompatParcelizer._init_lambda4();
            while (_assertnotnull_init_lambda4 != null) {
                C0216valueInstantiators c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp = _assertnotnull_init_lambda4.accessgetReportFullyDrawnExecutorp();
                if (c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp != null && c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp.getRead()) {
                    break;
                }
                _assertnotnull_init_lambda4 = _assertnotnull_init_lambda4._init_lambda4();
            }
            _assertnotnull_init_lambda4 = null;
        } else {
            _assertnotnull_init_lambda4 = null;
        }
        if (_assertnotnull_init_lambda4 == null) {
            _assertnotnull_init_lambda4 = this.IconCompatParcelizer._init_lambda4();
            while (true) {
                if (_assertnotnull_init_lambda4 == null) {
                    _assertnotnull_init_lambda4 = null;
                    break;
                }
                if (_assertnotnull_init_lambda4.get_init_lambda2().write(_bind.write(8))) {
                    break;
                }
                _assertnotnull_init_lambda4 = _assertnotnull_init_lambda4._init_lambda4();
            }
        }
        if (_assertnotnull_init_lambda4 == null) {
            return null;
        }
        return virtualPropertyWriterInstance.write(_assertnotnull_init_lambda4, this.RemoteActionCompatParcelizer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List RemoteActionCompatParcelizer$default(valueInstantiatorInstance valueinstantiatorinstance, List list, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list2 = new ArrayList();
        }
        return valueinstantiatorinstance.RemoteActionCompatParcelizer(list, list2);
    }

    public final _bindAndClose AudioAttributesCompatParcelizer() {
        _bindAndClose _bindandcloseWrite;
        if (!this.read) {
            hasIndex hasindexOnCustomAction = onCustomAction();
            return (hasindexOnCustomAction == null || (_bindandcloseWrite = collectLongDefaults.write((Module) hasindexOnCustomAction, _bind.write(8))) == null) ? this.IconCompatParcelizer.onPrepareFromUri() : _bindandcloseWrite;
        }
        valueInstantiatorInstance valueinstantiatorinstanceMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (valueinstantiatorinstanceMediaBrowserCompatMediaItem != null) {
            return valueinstantiatorinstanceMediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    private final hasIndex onCustomAction() {
        ?? Write;
        ?? r5 = 0;
        r5 = 0;
        r5 = 0;
        r5 = 0;
        if (this.write.getRead()) {
            ObjectReader objectReader = this.IconCompatParcelizer.get_init_lambda2();
            int iWrite = _bind.write(8);
            if ((objectReader.MediaBrowserCompatSearchResultReceiver() & iWrite) != 0) {
                _handleOddName.IconCompatParcelizer audioAttributesImplApi21Parcelizer = objectReader.getAudioAttributesImplApi21Parcelizer();
                Write = 0;
                while (audioAttributesImplApi21Parcelizer != null) {
                    if ((audioAttributesImplApi21Parcelizer.getWrite() & iWrite) != 0) {
                        ?? Write2 = audioAttributesImplApi21Parcelizer;
                        UTF32Reader uTF32Reader = null;
                        while (Write2 != 0) {
                            if (Write2 instanceof hasIndex) {
                                hasIndex hasindex = (hasIndex) Write2;
                                if (hasindex.j_()) {
                                    if (hasindex.getRead()) {
                                        return hasindex;
                                    }
                                    if (Write == 0) {
                                        Write = hasindex;
                                    }
                                }
                            } else if ((Write2.getWrite() & iWrite) != 0 && (Write2 instanceof addAbstractTypeResolver)) {
                                _handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) Write2).getIconCompatParcelizer();
                                int i = 0;
                                Write2 = Write2;
                                while (iconCompatParcelizer != null) {
                                    if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                        i++;
                                        if (i == 1) {
                                            Write2 = iconCompatParcelizer;
                                        } else {
                                            if (uTF32Reader == null) {
                                                uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (Write2 != 0) {
                                                if (uTF32Reader != null) {
                                                    uTF32Reader.read(Write2);
                                                }
                                                Write2 = 0;
                                            }
                                            if (uTF32Reader != null) {
                                                uTF32Reader.read(iconCompatParcelizer);
                                            }
                                        }
                                    }
                                    iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer();
                                    Write2 = Write2;
                                }
                                if (i == 1) {
                                }
                            }
                            Write2 = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
                        }
                    }
                    if ((audioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer() & iWrite) == 0) {
                        break;
                    }
                    audioAttributesImplApi21Parcelizer = audioAttributesImplApi21Parcelizer.getAudioAttributesImplBaseParcelizer();
                    Write = Write;
                }
                r5 = Write;
            }
        } else {
            ObjectReader objectReader2 = this.IconCompatParcelizer.get_init_lambda2();
            int iWrite2 = _bind.write(8);
            if ((objectReader2.MediaBrowserCompatSearchResultReceiver() & iWrite2) != 0) {
                loop3: for (_handleOddName.IconCompatParcelizer audioAttributesImplApi21Parcelizer2 = objectReader2.getAudioAttributesImplApi21Parcelizer(); audioAttributesImplApi21Parcelizer2 != null; audioAttributesImplApi21Parcelizer2 = audioAttributesImplApi21Parcelizer2.getAudioAttributesImplBaseParcelizer()) {
                    if ((audioAttributesImplApi21Parcelizer2.getWrite() & iWrite2) != 0) {
                        Write = audioAttributesImplApi21Parcelizer2;
                        UTF32Reader uTF32Reader2 = null;
                        while (Write != 0) {
                            if (Write instanceof hasIndex) {
                                if (((hasIndex) Write).j_()) {
                                    r5 = Write;
                                }
                            } else if ((Write.getWrite() & iWrite2) != 0 && (Write instanceof addAbstractTypeResolver)) {
                                _handleOddName.IconCompatParcelizer iconCompatParcelizer2 = ((addAbstractTypeResolver) Write).getIconCompatParcelizer();
                                int i2 = 0;
                                Write = Write;
                                while (iconCompatParcelizer2 != null) {
                                    if ((iconCompatParcelizer2.getWrite() & iWrite2) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            Write = iconCompatParcelizer2;
                                        } else {
                                            if (uTF32Reader2 == null) {
                                                uTF32Reader2 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (Write != 0) {
                                                if (uTF32Reader2 != null) {
                                                    uTF32Reader2.read(Write);
                                                }
                                                Write = 0;
                                            }
                                            if (uTF32Reader2 != null) {
                                                uTF32Reader2.read(iconCompatParcelizer2);
                                            }
                                        }
                                    }
                                    iconCompatParcelizer2 = iconCompatParcelizer2.getAudioAttributesImplBaseParcelizer();
                                    Write = Write;
                                }
                                if (i2 != 1) {
                                }
                            }
                            Write = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader2);
                        }
                    }
                    if ((audioAttributesImplApi21Parcelizer2.getRemoteActionCompatParcelizer() & iWrite2) == 0) {
                        break;
                    }
                }
            }
        }
        return (hasIndex) r5;
    }

    private final void read(List<valueInstantiatorInstance> p0) {
        C0184keyDeserializers c0184keyDeserializers = virtualPropertyWriterInstance.read(this);
        if (c0184keyDeserializers != null && this.write.getRead() && !p0.isEmpty()) {
            p0.add(IconCompatParcelizer(c0184keyDeserializers, new AnonymousClass3(c0184keyDeserializers)));
        }
        if (this.write.read(_this.INSTANCE.IconCompatParcelizer()) && !p0.isEmpty() && this.write.getRead()) {
            List list = (List) withDeserializerModifier.read(this.write, _this.INSTANCE.IconCompatParcelizer());
            String str = list != null ? (String) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(list) : null;
            if (str != null) {
                p0.add(0, IconCompatParcelizer(null, new AnonymousClass2(str)));
            }
        }
    }

    /* JADX INFO: renamed from: o.valueInstantiatorInstance$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getConfigOverride;", "", "read", "(Lo/getConfigOverride;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<getConfigOverride, getShowPopup> {
        final /* synthetic */ C0184keyDeserializers $write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(getConfigOverride getconfigoverride) {
            read(getconfigoverride);
            return getShowPopup.INSTANCE;
        }

        public final void read(getConfigOverride getconfigoverride) {
            MapperBuilder.write(getconfigoverride, this.$write.getWrite());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(C0184keyDeserializers c0184keyDeserializers) {
            super(1);
            this.$write = c0184keyDeserializers;
        }
    }

    /* JADX INFO: renamed from: o.valueInstantiatorInstance$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getConfigOverride;", "", "RemoteActionCompatParcelizer", "(Lo/getConfigOverride;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<getConfigOverride, getShowPopup> {
        final /* synthetic */ String $AudioAttributesCompatParcelizer;

        public final void RemoteActionCompatParcelizer(getConfigOverride getconfigoverride) {
            MapperBuilder.AudioAttributesCompatParcelizer(getconfigoverride, this.$AudioAttributesCompatParcelizer);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(getConfigOverride getconfigoverride) {
            RemoteActionCompatParcelizer(getconfigoverride);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str) {
            super(1);
            this.$AudioAttributesCompatParcelizer = str;
        }
    }

    private final valueInstantiatorInstance IconCompatParcelizer(C0184keyDeserializers p0, getAnswerMap<? super getConfigOverride, getShowPopup> p1) {
        C0216valueInstantiators c0216valueInstantiators = new C0216valueInstantiators();
        c0216valueInstantiators.read(false);
        c0216valueInstantiators.AudioAttributesCompatParcelizer(false);
        p1.invoke(c0216valueInstantiators);
        valueInstantiatorInstance valueinstantiatorinstance = new valueInstantiatorInstance(new AudioAttributesCompatParcelizer(p1), false, new _assertNotNull(true, p0 != null ? virtualPropertyWriterInstance.AudioAttributesImplApi21Parcelizer(this) : virtualPropertyWriterInstance.write(this)), c0216valueInstantiators);
        valueinstantiatorinstance.read = true;
        valueinstantiatorinstance.MediaBrowserCompatItemReceiver = this;
        return valueinstantiatorinstance;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/valueInstantiatorInstance$AudioAttributesCompatParcelizer;", "Lo/hasIndex;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/getConfigOverride;", "", "write", "(Lo/getConfigOverride;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends _handleOddName.IconCompatParcelizer implements hasIndex {
        final /* synthetic */ getAnswerMap<getConfigOverride, getShowPopup> write;

        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(getAnswerMap<? super getConfigOverride, getShowPopup> getanswermap) {
            this.write = getanswermap;
        }

        @Override // kotlin.hasIndex
        public final void write(getConfigOverride getconfigoverride) {
            this.write.invoke(getconfigoverride);
        }
    }

    public final valueInstantiatorInstance read() {
        return new valueInstantiatorInstance(this.AudioAttributesCompatParcelizer, true, this.IconCompatParcelizer, this.write);
    }

    private final List<valueInstantiatorInstance> RemoteActionCompatParcelizer(List<valueInstantiatorInstance> p0, List<valueInstantiatorInstance> p1) {
        write$default(this, p0, false, false, 6, null);
        int size = p0.size();
        for (int size2 = p0.size(); size2 < size; size2++) {
            valueInstantiatorInstance valueinstantiatorinstance = p0.get(size2);
            if (valueinstantiatorinstance.onMediaButtonEvent()) {
                p1.add(valueinstantiatorinstance);
            } else if (!valueinstantiatorinstance.write.getAudioAttributesImplApi21Parcelizer()) {
                valueinstantiatorinstance.RemoteActionCompatParcelizer(p0, p1);
            }
        }
        return p1;
    }
}
