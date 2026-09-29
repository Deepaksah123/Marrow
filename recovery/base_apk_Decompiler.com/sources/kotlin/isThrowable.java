package kotlin;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin._assertNotNull;
import kotlin._handleOddName;
import kotlin._parser;
import kotlin.booleanValue;
import kotlin.createForPropertyOverride;
import kotlin.isArray;
import kotlin.parseDigitsRecursive;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0003\u000b\t\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u000b\u0010\u0019J'\u0010\u000b\u001a\u0004\u0018\u00010\r2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u000b\u0010\u001bJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001a¢\u0006\u0004\b\u000b\u0010\u001cJ\u001b\u0010\f\u001a\u00020\b*\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\f\u0010\u001eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0011\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010\nJ\r\u0010!\u001a\u00020\b¢\u0006\u0004\b!\u0010\nJ\u0013\u0010\f\u001a\u00020\b*\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\"J\u001b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\t\u0010#J'\u0010\t\u001a\u00020(2\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0$¢\u0006\u0004\b\t\u0010)J\u000f\u0010*\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010\nJ%\u0010\t\u001a\u00020+2\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\t\u0010,J/\u0010\u0011\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0011\u0010-J\u001b\u0010\u0016\u001a\u00020\b*\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010.J\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0018H\u0002¢\u0006\u0004\b\u000b\u0010/J\u0019\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\f\u00100J\u0019\u0010\u0016\u001a\u00020+2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u00101J%\u0010\u000b\u001a\u0002022\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u000b\u00103J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u0011\u00104J)\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u001a2\b\b\u0002\u0010\u0014\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u0016\u00105J\u001b\u0010\t\u001a\u00020\b*\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\t\u0010.J-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001e\u0010\f\u001a\u0004\u0018\u0001088\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\t\u00109\"\u0004\b\t\u0010:R$\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b;\u0010<\"\u0004\b\t\u0010=R\u0016\u0010\u0016\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\u000b\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010?R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00180@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010AR\"\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00020@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u0018\u0010!\u001a\u00060CR\u00020\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010H\u001a\u00060FR\u00020\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010GR\"\u0010*\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00020@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bH\u0010AR\u0014\u0010J\u001a\u00020I8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\"\u0010B\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020+0@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010AR\u001c\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0L8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u00106\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010?R\u0016\u0010D\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010?R\u0016\u0010P\u001a\u0004\u0018\u00010\u001d8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010OR\u0014\u0010S\u001a\u00020Q8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0011\u0010R"}, d2 = {"Lo/isThrowable;", "Lo/_getByteArrayBuilder;", "Lo/_assertNotNull;", "p0", "Lo/isArray;", "p1", "<init>", "(Lo/_assertNotNull;Lo/isArray;)V", "", "read", "()V", "AudioAttributesCompatParcelizer", "write", "", "Lkotlin/Function0;", "", "Lo/isTypeOrSuperTypeOf;", "IconCompatParcelizer", "(Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;)Ljava/util/List;", "", "p2", "p3", "RemoteActionCompatParcelizer", "(Lo/_assertNotNull;Ljava/lang/Object;ZLo/MagicModuleSubmissionRequestBody;)V", "Lo/isThrowable$AudioAttributesCompatParcelizer;", "(Lo/_assertNotNull;Lo/isThrowable$AudioAttributesCompatParcelizer;Z)V", "", "(Ljava/util/List;I)Ljava/lang/Object;", "(I)V", "Lo/_new;", "(Lo/isThrowable$AudioAttributesCompatParcelizer;Lo/_new;)V", "(Z)V", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "(Lo/_assertNotNull;)V", "(Ljava/lang/Object;)Lo/_assertNotNull;", "Lkotlin/Function2;", "Lo/getNodeType;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "Lo/withTypeHandler;", "(Lo/MagicModuleSubmissionRequestBody;)Lo/withTypeHandler;", "AudioAttributesImplBaseParcelizer", "Lo/booleanValue$IconCompatParcelizer;", "(Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;)Lo/booleanValue$IconCompatParcelizer;", "(Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;Z)V", "(Lo/isThrowable$AudioAttributesCompatParcelizer;Z)V", "(Lo/isThrowable$AudioAttributesCompatParcelizer;)V", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;)Lo/booleanValue$IconCompatParcelizer;", "Lo/booleanValue$RemoteActionCompatParcelizer;", "(Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;)Lo/booleanValue$RemoteActionCompatParcelizer;", "(I)Lo/_assertNotNull;", "(III)V", "MediaBrowserCompatMediaItem", "Lo/_assertNotNull;", "Lo/convertNumberToLong;", "Lo/convertNumberToLong;", "(Lo/convertNumberToLong;)V", "onCommand", "Lo/isArray;", "(Lo/isArray;)V", "AudioAttributesImplApi26Parcelizer", "I", "Lo/setKeyListener;", "Lo/setKeyListener;", "MediaMetadataCompat", "Lo/isThrowable$read;", "MediaDescriptionCompat", "Lo/isThrowable$read;", "Lo/isThrowable$IconCompatParcelizer;", "Lo/isThrowable$IconCompatParcelizer;", "MediaBrowserCompatItemReceiver", "Lo/isArray$read;", "RatingCompat", "Lo/isArray$read;", "Lo/UTF32Reader;", "MediaBrowserCompatSearchResultReceiver", "Lo/UTF32Reader;", "()Lo/_new;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "", "Ljava/lang/String;", "onAddQueueItem"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class isThrowable implements _getByteArrayBuilder {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private int MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private int MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final _assertNotNull IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private isArray read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private convertNumberToLong write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setKeyListener<_assertNotNull, AudioAttributesCompatParcelizer> AudioAttributesImplApi26Parcelizer = setAutoSizeTextTypeUniformWithPresetSizes.read();

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final setKeyListener<Object, _assertNotNull> MediaBrowserCompatCustomActionResultReceiver = setAutoSizeTextTypeUniformWithPresetSizes.read();

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final read AudioAttributesImplApi21Parcelizer = new read();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final IconCompatParcelizer MediaBrowserCompatItemReceiver = new IconCompatParcelizer();

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setKeyListener<Object, _assertNotNull> AudioAttributesImplBaseParcelizer = setAutoSizeTextTypeUniformWithPresetSizes.read();
    private final isArray.read RatingCompat = new isArray.read(null, 1, null);

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setKeyListener<Object, booleanValue.IconCompatParcelizer> MediaMetadataCompat = setAutoSizeTextTypeUniformWithPresetSizes.read();
    private final UTF32Reader<Object> MediaBrowserCompatSearchResultReceiver = new UTF32Reader<>(new Object[16], 0);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String onAddQueueItem = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesImplApi26Parcelizer() {
        return false;
    }

    public isThrowable(_assertNotNull _assertnotnull, isArray isarray) {
        this.IconCompatParcelizer = _assertnotnull;
        this.read = isarray;
    }

    public final void read(convertNumberToLong convertnumbertolong) {
        this.write = convertnumbertolong;
    }

    public final void read(isArray isarray) {
        if (this.read != isarray) {
            this.read = isarray;
            IconCompatParcelizer(false);
            _assertNotNull.AudioAttributesCompatParcelizer$default(this.IconCompatParcelizer, false, false, false, 7, null);
        }
    }

    @Override // kotlin._getByteArrayBuilder
    public final void read() {
        IconCompatParcelizer(false);
    }

    @Override // kotlin._getByteArrayBuilder
    public final void AudioAttributesCompatParcelizer() {
        IconCompatParcelizer(true);
    }

    @Override // kotlin._getByteArrayBuilder
    public final void write() {
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public final List<isTypeOrSuperTypeOf> IconCompatParcelizer(Object p0, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p1) {
        AudioAttributesImplApi21Parcelizer();
        _assertNotNull.RemoteActionCompatParcelizer remoteActionCompatParcelizerOnSkipToQueueItem = this.IconCompatParcelizer.onSkipToQueueItem();
        if (remoteActionCompatParcelizerOnSkipToQueueItem != _assertNotNull.RemoteActionCompatParcelizer.write && remoteActionCompatParcelizerOnSkipToQueueItem != _assertNotNull.RemoteActionCompatParcelizer.read && remoteActionCompatParcelizerOnSkipToQueueItem != _assertNotNull.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer && remoteActionCompatParcelizerOnSkipToQueueItem != _assertNotNull.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer) {
            reportWrongTokenException.read("subcompose can only be used inside the measure or layout blocks");
        }
        setKeyListener<Object, _assertNotNull> setkeylistener = this.MediaBrowserCompatCustomActionResultReceiver;
        _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = setkeylistener.AudioAttributesImplApi26Parcelizer(p0);
        if (_assertnotnullAudioAttributesImplApi26Parcelizer == null) {
            _assertnotnullAudioAttributesImplApi26Parcelizer = this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(p0);
            if (_assertnotnullAudioAttributesImplApi26Parcelizer != null) {
                this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer(_assertnotnullAudioAttributesImplApi26Parcelizer);
                if (this.MediaDescriptionCompat <= 0) {
                    reportWrongTokenException.read("Check failed.");
                }
                this.MediaDescriptionCompat--;
            } else {
                _assertnotnullAudioAttributesImplApi26Parcelizer = read(p0);
                if (_assertnotnullAudioAttributesImplApi26Parcelizer == null) {
                    _assertnotnullAudioAttributesImplApi26Parcelizer = IconCompatParcelizer(this.RemoteActionCompatParcelizer);
                }
            }
            setkeylistener.RemoteActionCompatParcelizer(p0, _assertnotnullAudioAttributesImplApi26Parcelizer);
        }
        _assertNotNull _assertnotnull = _assertnotnullAudioAttributesImplApi26Parcelizer;
        if (IntermediateLoginResponseBody.read((List) this.IconCompatParcelizer.onPrepareFromMediaId(), this.RemoteActionCompatParcelizer) != _assertnotnull) {
            int iIndexOf = this.IconCompatParcelizer.onPrepareFromMediaId().indexOf(_assertnotnull);
            if (iIndexOf < this.RemoteActionCompatParcelizer) {
                StringBuilder sb = new StringBuilder("Key \"");
                sb.append(p0);
                sb.append("\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                reportWrongTokenException.AudioAttributesCompatParcelizer(sb.toString());
            }
            int i = this.RemoteActionCompatParcelizer;
            if (i != iIndexOf) {
                RemoteActionCompatParcelizer$default(this, iIndexOf, i, 0, 4, null);
            }
        }
        this.RemoteActionCompatParcelizer++;
        RemoteActionCompatParcelizer(_assertnotnull, p0, false, p1);
        if (remoteActionCompatParcelizerOnSkipToQueueItem == _assertNotNull.RemoteActionCompatParcelizer.write || remoteActionCompatParcelizerOnSkipToQueueItem == _assertNotNull.RemoteActionCompatParcelizer.read) {
            return _assertnotnull.onFastForward();
        }
        return _assertnotnull.onMediaButtonEvent();
    }

    private final void RemoteActionCompatParcelizer(_assertNotNull p0, Object p1, boolean p2, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p3) {
        setKeyListener<_assertNotNull, AudioAttributesCompatParcelizer> setkeylistener = this.AudioAttributesImplApi26Parcelizer;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer = setkeylistener.AudioAttributesImplApi26Parcelizer(p0);
        if (audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer == null) {
            audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer = new AudioAttributesCompatParcelizer(p1, JavaType.write.write(), null, 4, null);
            setkeylistener.RemoteActionCompatParcelizer(p0, audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer);
        }
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer;
        boolean z = audioAttributesCompatParcelizer.write() != p3;
        if (audioAttributesCompatParcelizer.getAudioAttributesImplBaseParcelizer() != null) {
            if (z) {
                AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
            } else if (p2) {
                return;
            } else {
                read(audioAttributesCompatParcelizer, true);
            }
        }
        InterfaceC0163contentReference read2 = audioAttributesCompatParcelizer.getRead();
        boolean zAudioAttributesCompatParcelizer = read2 != null ? read2.AudioAttributesCompatParcelizer() : true;
        if (z || zAudioAttributesCompatParcelizer || audioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()) {
            audioAttributesCompatParcelizer.write(p3);
            AudioAttributesCompatParcelizer(p0, audioAttributesCompatParcelizer, p2);
            audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(false);
        }
    }

    private final _new MediaBrowserCompatItemReceiver() {
        return _serializerProvider.AudioAttributesCompatParcelizer(this.IconCompatParcelizer).onCommand();
    }

    private final void AudioAttributesCompatParcelizer(_assertNotNull p0, AudioAttributesCompatParcelizer p1, boolean p2) {
        if (p1.getAudioAttributesImplBaseParcelizer() != null) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("new subcompose call while paused composition is still active");
        }
        parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
        parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
        getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
        parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
        try {
            _assertNotNull _assertnotnull = this.IconCompatParcelizer;
            _assertnotnull.onPrepareFromUri = true;
            toBigDecimalRec read2 = p1.getRead();
            convertNumberToLong convertnumbertolong = this.write;
            if (convertnumbertolong == null) {
                reportWrongTokenException.write("parent composition reference not set");
                throw new PlanDetailsCreator();
            }
            if (read2 == null || read2.IconCompatParcelizer()) {
                if (p2) {
                    read2 = getClassIntrospector.RemoteActionCompatParcelizer(p0, convertnumbertolong);
                } else {
                    read2 = getClassIntrospector.IconCompatParcelizer(p0, convertnumbertolong);
                }
            }
            p1.RemoteActionCompatParcelizer(read2);
            FastIntegerMathUInt128 fastIntegerMathUInt128Write = p1.write();
            if (MediaBrowserCompatItemReceiver() != null) {
                p1.write(false);
            } else {
                p1.write(true);
                fastIntegerMathUInt128Write = multiplyFft.IconCompatParcelizer(1524156494, true, new AnonymousClass4(p1, fastIntegerMathUInt128Write));
            }
            if (p2) {
                toMagicModuleMetaRepoModel.read(read2, "");
                if (p1.getWrite()) {
                    p1.AudioAttributesCompatParcelizer(((toBigDecimalRec) read2).write(fastIntegerMathUInt128Write));
                } else {
                    p1.AudioAttributesCompatParcelizer(((toBigDecimalRec) read2).RemoteActionCompatParcelizer(fastIntegerMathUInt128Write));
                }
            } else if (p1.getWrite()) {
                read2.read(fastIntegerMathUInt128Write);
            } else {
                read2.IconCompatParcelizer(fastIntegerMathUInt128Write);
            }
            p1.IconCompatParcelizer(false);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            _assertnotnull.onPrepareFromUri = false;
            getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        } finally {
            companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
        }
    }

    /* JADX INFO: renamed from: o.isThrowable$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;I)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ AudioAttributesCompatParcelizer $IconCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> $read;

        public final void RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(1524156494, i, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:706)");
                }
                boolean zRemoteActionCompatParcelizer = this.$IconCompatParcelizer.RemoteActionCompatParcelizer();
                MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody = this.$read;
                _handleunrecognizedcharacterescape.write(207, Boolean.valueOf(zRemoteActionCompatParcelizer));
                boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(zRemoteActionCompatParcelizer);
                if (zRemoteActionCompatParcelizer) {
                    magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescape, 0);
                } else {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(zAudioAttributesCompatParcelizer);
                }
                _handleunrecognizedcharacterescape.MediaDescriptionCompat();
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    return;
                }
                return;
            }
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody) {
            super(2);
            this.$IconCompatParcelizer = audioAttributesCompatParcelizer;
            this.$read = magicModuleSubmissionRequestBody;
        }
    }

    private final Object AudioAttributesCompatParcelizer(List<_assertNotNull> p0, int p1) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer(p0.get(p1));
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer);
        return audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.getIconCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer(int p0) {
        this.MediaBrowserCompatMediaItem = 0;
        List<_assertNotNull> listOnPrepareFromMediaId = this.IconCompatParcelizer.onPrepareFromMediaId();
        int size = (listOnPrepareFromMediaId.size() - this.MediaDescriptionCompat) - 1;
        if (p0 <= size) {
            this.RatingCompat.clear();
            if (p0 <= size) {
                int i = p0;
                while (true) {
                    this.RatingCompat.add(AudioAttributesCompatParcelizer(listOnPrepareFromMediaId, i));
                    if (i == size) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.read.write(this.RatingCompat);
            parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
            parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
            getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
            parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
            boolean z = false;
            while (size >= p0) {
                try {
                    _assertNotNull _assertnotnull = listOnPrepareFromMediaId.get(size);
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer(_assertnotnull);
                    toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer);
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer;
                    Object iconCompatParcelizer = audioAttributesCompatParcelizer.getIconCompatParcelizer();
                    if (!this.RatingCompat.contains(iconCompatParcelizer)) {
                        _assertNotNull _assertnotnull2 = this.IconCompatParcelizer;
                        _assertnotnull2.onPrepareFromUri = true;
                        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(_assertnotnull);
                        InterfaceC0163contentReference read2 = audioAttributesCompatParcelizer.getRead();
                        if (read2 != null) {
                            read2.RemoteActionCompatParcelizer();
                        }
                        this.IconCompatParcelizer.IconCompatParcelizer(size, 1);
                        getShowPopup getshowpopup = getShowPopup.INSTANCE;
                        _assertnotnull2.onPrepareFromUri = false;
                    } else {
                        this.MediaBrowserCompatMediaItem++;
                        if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer()) {
                            write(_assertnotnull);
                            RemoteActionCompatParcelizer(audioAttributesCompatParcelizer, false);
                            if (audioAttributesCompatParcelizer.getMediaBrowserCompatItemReceiver()) {
                                z = true;
                            }
                        }
                    }
                    this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(iconCompatParcelizer);
                    size--;
                } finally {
                    companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
                }
            }
            getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            if (z) {
                parseDigitsRecursive.INSTANCE.read();
            }
        }
        AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: renamed from: o.isThrowable$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "read", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ AudioAttributesCompatParcelizer $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            read();
            return getShowPopup.INSTANCE;
        }

        public final void read() {
            InterfaceC0163contentReference read;
            if (this.$IconCompatParcelizer.RemoteActionCompatParcelizer() || (read = this.$IconCompatParcelizer.getRead()) == null) {
                return;
            }
            read.MediaBrowserCompatCustomActionResultReceiver();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            super(0);
            this.$IconCompatParcelizer = audioAttributesCompatParcelizer;
        }
    }

    private final void write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, _new _newVar) {
        _newVar.write(new AnonymousClass3(audioAttributesCompatParcelizer));
    }

    private final void IconCompatParcelizer(boolean p0) {
        this.MediaDescriptionCompat = 0;
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer();
        List<_assertNotNull> listOnPrepareFromMediaId = this.IconCompatParcelizer.onPrepareFromMediaId();
        int size = listOnPrepareFromMediaId.size();
        if (this.MediaBrowserCompatMediaItem != size) {
            this.MediaBrowserCompatMediaItem = size;
            parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
            parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
            getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
            parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
            for (int i = 0; i < size; i++) {
                try {
                    _assertNotNull _assertnotnull = listOnPrepareFromMediaId.get(i);
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer(_assertnotnull);
                    if (audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer != null && audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer()) {
                        write(_assertnotnull);
                        RemoteActionCompatParcelizer(audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer, p0);
                        audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(fieldNames.read);
                    }
                } catch (Throwable th) {
                    companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
                    throw th;
                }
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
            this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer();
        }
        AudioAttributesImplApi21Parcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void MediaBrowserCompatCustomActionResultReceiver() {
        /*
            r15 = this;
            o._assertNotNull r0 = r15.IconCompatParcelizer
            r1 = 1
            kotlin._assertNotNull.write(r0, r1)
            o.setKeyListener<o._assertNotNull, o.isThrowable$AudioAttributesCompatParcelizer> r1 = r15.AudioAttributesImplApi26Parcelizer
            o.AppCompatButton r1 = (kotlin.AppCompatButton) r1
            java.lang.Object[] r2 = r1.MediaBrowserCompatItemReceiver
            long[] r1 = r1.RemoteActionCompatParcelizer
            int r3 = r1.length
            int r3 = r3 + (-2)
            r4 = 0
            if (r3 < 0) goto L55
            r5 = r4
        L15:
            r6 = r1[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L50
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2f:
            if (r10 >= r8) goto L4e
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4a
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            o.isThrowable$AudioAttributesCompatParcelizer r11 = (o.isThrowable.AudioAttributesCompatParcelizer) r11
            o.contentReference r11 = r11.getRead()
            if (r11 == 0) goto L4a
            r11.RemoteActionCompatParcelizer()
        L4a:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2f
        L4e:
            if (r8 != r9) goto L55
        L50:
            if (r5 == r3) goto L55
            int r5 = r5 + 1
            goto L15
        L55:
            o._assertNotNull r1 = r15.IconCompatParcelizer
            r1.getLastCustomNonConfigurationInstance()
            o.getShowPopup r1 = kotlin.getShowPopup.INSTANCE
            kotlin._assertNotNull.write(r0, r4)
            o.setKeyListener<o._assertNotNull, o.isThrowable$AudioAttributesCompatParcelizer> r0 = r15.AudioAttributesImplApi26Parcelizer
            r0.AudioAttributesCompatParcelizer()
            o.setKeyListener<java.lang.Object, o._assertNotNull> r0 = r15.MediaBrowserCompatCustomActionResultReceiver
            r0.AudioAttributesCompatParcelizer()
            r15.MediaDescriptionCompat = r4
            r15.MediaBrowserCompatMediaItem = r4
            o.setKeyListener<java.lang.Object, o._assertNotNull> r0 = r15.AudioAttributesImplBaseParcelizer
            r0.AudioAttributesCompatParcelizer()
            r15.AudioAttributesImplApi21Parcelizer()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isThrowable.MediaBrowserCompatCustomActionResultReceiver():void");
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        int size = this.IconCompatParcelizer.onPrepareFromMediaId().size();
        if (this.AudioAttributesImplApi26Parcelizer.getWrite() != size) {
            StringBuilder sb = new StringBuilder("Inconsistency between the count of nodes tracked by the state (");
            sb.append(this.AudioAttributesImplApi26Parcelizer.getWrite());
            sb.append(") and the children count on the SubcomposeLayout (");
            sb.append(size);
            sb.append("). Are you trying to use the state of the disposed SubcomposeLayout?");
            reportWrongTokenException.AudioAttributesCompatParcelizer(sb.toString());
        }
        if ((size - this.MediaBrowserCompatMediaItem) - this.MediaDescriptionCompat < 0) {
            StringBuilder sb2 = new StringBuilder("Incorrect state. Total children ");
            sb2.append(size);
            sb2.append(". Reusable children ");
            sb2.append(this.MediaBrowserCompatMediaItem);
            sb2.append(". Precomposed children ");
            sb2.append(this.MediaDescriptionCompat);
            reportWrongTokenException.AudioAttributesCompatParcelizer(sb2.toString());
        }
        if (this.AudioAttributesImplBaseParcelizer.getWrite() == this.MediaDescriptionCompat) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("Incorrect state. Precomposed children ");
        sb3.append(this.MediaDescriptionCompat);
        sb3.append(". Map size ");
        sb3.append(this.AudioAttributesImplBaseParcelizer.getWrite());
        reportWrongTokenException.AudioAttributesCompatParcelizer(sb3.toString());
    }

    private final void write(_assertNotNull _assertnotnull) {
        _assertnotnull.ParcelableVolumeInfo().RemoteActionCompatParcelizer(_assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer);
        setPropertyNamingStrategy setpropertynamingstrategyMediaSessionCompatToken = _assertnotnull.MediaSessionCompatToken();
        if (setpropertynamingstrategyMediaSessionCompatToken != null) {
            setpropertynamingstrategyMediaSessionCompatToken.write(_assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer);
        }
    }

    private final _assertNotNull read(Object p0) {
        int i;
        if (this.MediaBrowserCompatMediaItem == 0) {
            return null;
        }
        List<_assertNotNull> listOnPrepareFromMediaId = this.IconCompatParcelizer.onPrepareFromMediaId();
        int size = listOnPrepareFromMediaId.size() - this.MediaDescriptionCompat;
        int i2 = size - this.MediaBrowserCompatMediaItem;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 < i2) {
                i = -1;
                break;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(listOnPrepareFromMediaId, i4), p0)) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (i3 >= i2) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer(listOnPrepareFromMediaId.get(i3));
                toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer);
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer;
                if (audioAttributesCompatParcelizer.getIconCompatParcelizer() == fieldNames.read || this.read.read(p0, audioAttributesCompatParcelizer.getIconCompatParcelizer())) {
                    audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0);
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
            i4 = i3;
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            RemoteActionCompatParcelizer(i4, i2, 1);
        }
        this.MediaBrowserCompatMediaItem--;
        _assertNotNull _assertnotnull = listOnPrepareFromMediaId.get(i2);
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer2 = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer(_assertnotnull);
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer2);
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer2;
        audioAttributesCompatParcelizer2.IconCompatParcelizer(available.RemoteActionCompatParcelizer$default(Boolean.TRUE, null, 2, null));
        audioAttributesCompatParcelizer2.IconCompatParcelizer(true);
        audioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer(true);
        return _assertnotnull;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/isThrowable$RemoteActionCompatParcelizer;", "Lo/_assertNotNull$AudioAttributesCompatParcelizer;", "Lo/withContentValueHandler;", "", "Lo/isTypeOrSuperTypeOf;", "p0", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends _assertNotNull.AudioAttributesCompatParcelizer {
        final /* synthetic */ MagicModuleSubmissionRequestBody<getNodeType, PropertyValueAny, withHandlersFrom> read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody<? super getNodeType, ? super PropertyValueAny, ? extends withHandlersFrom> magicModuleSubmissionRequestBody, String str) {
            super(str);
            this.read = magicModuleSubmissionRequestBody;
        }

        @Override // kotlin.withTypeHandler
        public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
            isThrowable.this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(withcontentvaluehandler.getAudioAttributesCompatParcelizer());
            isThrowable.this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver(withcontentvaluehandler.getRead());
            isThrowable.this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver(withcontentvaluehandler.getIconCompatParcelizer());
            if (withcontentvaluehandler.r_() || isThrowable.this.IconCompatParcelizer.getMediaBrowserCompatSearchResultReceiver() == null) {
                isThrowable.this.RemoteActionCompatParcelizer = 0;
                withHandlersFrom withhandlersfromInvoke = this.read.invoke(isThrowable.this.AudioAttributesImplApi21Parcelizer, PropertyValueAny.read(j));
                return new C0119RemoteActionCompatParcelizer(withhandlersfromInvoke, isThrowable.this, isThrowable.this.RemoteActionCompatParcelizer, withhandlersfromInvoke);
            }
            isThrowable.this.AudioAttributesCompatParcelizer = 0;
            withHandlersFrom withhandlersfromInvoke2 = this.read.invoke(isThrowable.this.MediaBrowserCompatItemReceiver, PropertyValueAny.read(j));
            return new write(withhandlersfromInvoke2, isThrowable.this, isThrowable.this.AudioAttributesCompatParcelizer, withhandlersfromInvoke2);
        }

        /* JADX INFO: renamed from: o.isThrowable$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00078\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\f¸\u0006\u0015"}, d2 = {"Lo/isThrowable$write;", "Lo/withHandlersFrom;", "", "onMediaButtonEvent", "()V", "", "Lo/weirdNumberException;", "", "AudioAttributesImplApi26Parcelizer", "()Ljava/util/Map;", "AudioAttributesCompatParcelizer", "onAddQueueItem", "()I", "IconCompatParcelizer", "Lkotlin/Function1;", "Lo/JsonNode;", "onPause", "()Lo/getAnswerMap;", "RemoteActionCompatParcelizer", "onFastForward", "write", "o/isThrowable$write"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0119RemoteActionCompatParcelizer implements withHandlersFrom {
            final /* synthetic */ isThrowable AudioAttributesCompatParcelizer;
            final /* synthetic */ int RemoteActionCompatParcelizer;
            final /* synthetic */ withHandlersFrom read;
            private final /* synthetic */ withHandlersFrom write;

            public C0119RemoteActionCompatParcelizer(withHandlersFrom withhandlersfrom, isThrowable isthrowable, int i, withHandlersFrom withhandlersfrom2) {
                this.AudioAttributesCompatParcelizer = isthrowable;
                this.RemoteActionCompatParcelizer = i;
                this.read = withhandlersfrom2;
                this.write = withhandlersfrom;
            }

            @Override // kotlin.withHandlersFrom
            public final void onMediaButtonEvent() {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer;
                this.read.onMediaButtonEvent();
                if (this.AudioAttributesCompatParcelizer.IconCompatParcelizer.getMediaBrowserCompatSearchResultReceiver() == null) {
                    isThrowable isthrowable = this.AudioAttributesCompatParcelizer;
                    isthrowable.AudioAttributesCompatParcelizer(isthrowable.RemoteActionCompatParcelizer);
                }
            }

            @Override // kotlin.withHandlersFrom
            public final Map<weirdNumberException, Integer> AudioAttributesImplApi26Parcelizer() {
                return this.write.AudioAttributesImplApi26Parcelizer();
            }

            @Override // kotlin.withHandlersFrom
            /* JADX INFO: renamed from: onAddQueueItem */
            public final int getRead() {
                return this.write.getRead();
            }

            @Override // kotlin.withHandlersFrom
            public final getAnswerMap<JsonNode, getShowPopup> onPause() {
                return this.write.onPause();
            }

            @Override // kotlin.withHandlersFrom
            /* JADX INFO: renamed from: onFastForward */
            public final int getAudioAttributesCompatParcelizer() {
                return this.write.getAudioAttributesCompatParcelizer();
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00078\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\f¸\u0006\u0015"}, d2 = {"Lo/isThrowable$write;", "Lo/withHandlersFrom;", "", "onMediaButtonEvent", "()V", "", "Lo/weirdNumberException;", "", "AudioAttributesImplApi26Parcelizer", "()Ljava/util/Map;", "AudioAttributesCompatParcelizer", "onAddQueueItem", "()I", "read", "Lkotlin/Function1;", "Lo/JsonNode;", "onPause", "()Lo/getAnswerMap;", "IconCompatParcelizer", "onFastForward", "write", "o/isThrowable$write"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class write implements withHandlersFrom {
            final /* synthetic */ withHandlersFrom AudioAttributesCompatParcelizer;
            final /* synthetic */ int RemoteActionCompatParcelizer;
            final /* synthetic */ isThrowable read;
            private final /* synthetic */ withHandlersFrom write;

            public write(withHandlersFrom withhandlersfrom, isThrowable isthrowable, int i, withHandlersFrom withhandlersfrom2) {
                this.read = isthrowable;
                this.RemoteActionCompatParcelizer = i;
                this.AudioAttributesCompatParcelizer = withhandlersfrom2;
                this.write = withhandlersfrom;
            }

            @Override // kotlin.withHandlersFrom
            public final void onMediaButtonEvent() {
                this.read.AudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer;
                this.AudioAttributesCompatParcelizer.onMediaButtonEvent();
                this.read.AudioAttributesImplBaseParcelizer();
                isThrowable isthrowable = this.read;
                isthrowable.AudioAttributesCompatParcelizer(isthrowable.RemoteActionCompatParcelizer);
            }

            @Override // kotlin.withHandlersFrom
            public final Map<weirdNumberException, Integer> AudioAttributesImplApi26Parcelizer() {
                return this.write.AudioAttributesImplApi26Parcelizer();
            }

            @Override // kotlin.withHandlersFrom
            /* JADX INFO: renamed from: onAddQueueItem */
            public final int getRead() {
                return this.write.getRead();
            }

            @Override // kotlin.withHandlersFrom
            public final getAnswerMap<JsonNode, getShowPopup> onPause() {
                return this.write.onPause();
            }

            @Override // kotlin.withHandlersFrom
            /* JADX INFO: renamed from: onFastForward */
            public final int getAudioAttributesCompatParcelizer() {
                return this.write.getAudioAttributesCompatParcelizer();
            }
        }
    }

    public final withTypeHandler read(MagicModuleSubmissionRequestBody<? super getNodeType, ? super PropertyValueAny, ? extends withHandlersFrom> p0) {
        return new RemoteActionCompatParcelizer(p0, this.onAddQueueItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplBaseParcelizer() {
        setKeyListener<Object, booleanValue.IconCompatParcelizer> setkeylistener = this.MediaMetadataCompat;
        long[] jArr = setkeylistener.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = setkeylistener.IconCompatParcelizer[i4];
                        booleanValue.IconCompatParcelizer iconCompatParcelizer = (booleanValue.IconCompatParcelizer) setkeylistener.MediaBrowserCompatItemReceiver[i4];
                        int iAudioAttributesCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(obj);
                        if (iAudioAttributesCompatParcelizer < 0 || iAudioAttributesCompatParcelizer >= this.AudioAttributesCompatParcelizer) {
                            if (iAudioAttributesCompatParcelizer >= 0) {
                                this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, fieldNames.RemoteActionCompatParcelizer);
                            }
                            if (this.AudioAttributesImplBaseParcelizer.read(obj)) {
                                iconCompatParcelizer.IconCompatParcelizer();
                            }
                            setkeylistener.AudioAttributesCompatParcelizer(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00078\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\f"}, d2 = {"Lo/isThrowable$write;", "Lo/withHandlersFrom;", "", "onMediaButtonEvent", "()V", "", "Lo/weirdNumberException;", "", "AudioAttributesImplApi26Parcelizer", "()Ljava/util/Map;", "write", "onAddQueueItem", "()I", "RemoteActionCompatParcelizer", "Lkotlin/Function1;", "Lo/JsonNode;", "onPause", "()Lo/getAnswerMap;", "AudioAttributesCompatParcelizer", "onFastForward", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements withHandlersFrom {
        final /* synthetic */ getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;
        private final /* synthetic */ withHandlersFrom read;

        @Override // kotlin.withHandlersFrom
        public final void onMediaButtonEvent() {
            this.IconCompatParcelizer.invoke();
        }

        @Override // kotlin.withHandlersFrom
        public final Map<weirdNumberException, Integer> AudioAttributesImplApi26Parcelizer() {
            return this.read.AudioAttributesImplApi26Parcelizer();
        }

        @Override // kotlin.withHandlersFrom
        /* JADX INFO: renamed from: onAddQueueItem */
        public final int getRead() {
            return this.read.getRead();
        }

        @Override // kotlin.withHandlersFrom
        public final getAnswerMap<JsonNode, getShowPopup> onPause() {
            return this.read.onPause();
        }

        @Override // kotlin.withHandlersFrom
        /* JADX INFO: renamed from: onFastForward */
        public final int getAudioAttributesCompatParcelizer() {
            return this.read.getAudioAttributesCompatParcelizer();
        }
    }

    public final booleanValue.IconCompatParcelizer read(Object p0, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p1) {
        IconCompatParcelizer(p0, p1, false);
        return RemoteActionCompatParcelizer(p0);
    }

    private final void IconCompatParcelizer(Object p0, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p1, boolean p2) {
        if (this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer()) {
            AudioAttributesImplApi21Parcelizer();
            if (this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(p0)) {
                return;
            }
            this.MediaMetadataCompat.IconCompatParcelizer(p0);
            setKeyListener<Object, _assertNotNull> setkeylistener = this.AudioAttributesImplBaseParcelizer;
            _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = setkeylistener.AudioAttributesImplApi26Parcelizer(p0);
            if (_assertnotnullAudioAttributesImplApi26Parcelizer == null) {
                _assertnotnullAudioAttributesImplApi26Parcelizer = read(p0);
                if (_assertnotnullAudioAttributesImplApi26Parcelizer != null) {
                    RemoteActionCompatParcelizer(this.IconCompatParcelizer.onPrepareFromMediaId().indexOf(_assertnotnullAudioAttributesImplApi26Parcelizer), this.IconCompatParcelizer.onPrepareFromMediaId().size(), 1);
                    this.MediaDescriptionCompat++;
                } else {
                    _assertnotnullAudioAttributesImplApi26Parcelizer = IconCompatParcelizer(this.IconCompatParcelizer.onPrepareFromMediaId().size());
                    this.MediaDescriptionCompat++;
                }
                setkeylistener.RemoteActionCompatParcelizer(p0, _assertnotnullAudioAttributesImplApi26Parcelizer);
            }
            RemoteActionCompatParcelizer(_assertnotnullAudioAttributesImplApi26Parcelizer, p0, p2, p1);
        }
    }

    private final void RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z) {
        InterfaceC0163contentReference read2;
        if (z || !audioAttributesCompatParcelizer.getMediaBrowserCompatItemReceiver()) {
            audioAttributesCompatParcelizer.IconCompatParcelizer(available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null));
        } else {
            audioAttributesCompatParcelizer.read(false);
        }
        if (audioAttributesCompatParcelizer.getAudioAttributesImplBaseParcelizer() != null) {
            AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
            return;
        }
        if (z) {
            InterfaceC0163contentReference read3 = audioAttributesCompatParcelizer.getRead();
            if (read3 != null) {
                read3.MediaBrowserCompatCustomActionResultReceiver();
                return;
            }
            return;
        }
        _new _newVarMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (_newVarMediaBrowserCompatItemReceiver != null) {
            write(audioAttributesCompatParcelizer, _newVarMediaBrowserCompatItemReceiver);
        } else {
            if (audioAttributesCompatParcelizer.getMediaBrowserCompatItemReceiver() || (read2 = audioAttributesCompatParcelizer.getRead()) == null) {
                return;
            }
            read2.MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    private final void AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        getInputCodeLatin1 audioAttributesImplBaseParcelizer = audioAttributesCompatParcelizer.getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer != null) {
            audioAttributesImplBaseParcelizer.IconCompatParcelizer();
            audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer((getInputCodeLatin1) null);
            InterfaceC0163contentReference read2 = audioAttributesCompatParcelizer.getRead();
            if (read2 != null) {
                read2.RemoteActionCompatParcelizer();
            }
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(Object p0) {
        AudioAttributesImplApi21Parcelizer();
        _assertNotNull _assertnotnullIconCompatParcelizer = this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(p0);
        if (_assertnotnullIconCompatParcelizer != null) {
            if (this.MediaDescriptionCompat <= 0) {
                reportWrongTokenException.read("No pre-composed items to dispose");
            }
            int iIndexOf = this.IconCompatParcelizer.onPrepareFromMediaId().indexOf(_assertnotnullIconCompatParcelizer);
            if (iIndexOf < this.IconCompatParcelizer.onPrepareFromMediaId().size() - this.MediaDescriptionCompat) {
                reportWrongTokenException.read("Item is not in pre-composed item range");
            }
            this.MediaBrowserCompatMediaItem++;
            this.MediaDescriptionCompat--;
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer(_assertnotnullIconCompatParcelizer);
            if (audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer != null) {
                AudioAttributesCompatParcelizer(audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer);
            }
            int size = (this.IconCompatParcelizer.onPrepareFromMediaId().size() - this.MediaDescriptionCompat) - this.MediaBrowserCompatMediaItem;
            RemoteActionCompatParcelizer(iIndexOf, size, 1);
            AudioAttributesCompatParcelizer(size);
        }
        if (this.MediaBrowserCompatSearchResultReceiver.write(p0)) {
            _assertNotNull.AudioAttributesCompatParcelizer$default(this.IconCompatParcelizer, true, false, false, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/isThrowable$MediaBrowserCompatItemReceiver;", "Lo/booleanValue$IconCompatParcelizer;", "", "IconCompatParcelizer", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaBrowserCompatItemReceiver implements booleanValue.IconCompatParcelizer {
        @Override // o.booleanValue.IconCompatParcelizer
        public final void IconCompatParcelizer() {
        }

        MediaBrowserCompatItemReceiver() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final booleanValue.IconCompatParcelizer RemoteActionCompatParcelizer(Object p0) {
        if (!this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer()) {
            return new MediaBrowserCompatItemReceiver();
        }
        return new MediaBrowserCompatCustomActionResultReceiver(p0);
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0003\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u00138\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0011\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0016"}, d2 = {"Lo/isThrowable$MediaBrowserCompatCustomActionResultReceiver;", "Lo/booleanValue$IconCompatParcelizer;", "", "IconCompatParcelizer", "()V", "", "p0", "Lo/PropertyValueAny;", "p1", "AudioAttributesCompatParcelizer", "(IJ)V", "", "Lkotlin/Function1;", "Lo/createForPropertyOverride;", "Lo/createForPropertyOverride$write$IconCompatParcelizer;", "(Ljava/lang/Object;Lo/getAnswerMap;)V", "Lo/getKey;", "RemoteActionCompatParcelizer", "(I)J", "Lo/setBackgroundDrawable;", "read", "Lo/setBackgroundDrawable;", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaBrowserCompatCustomActionResultReceiver implements booleanValue.IconCompatParcelizer {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final setBackgroundDrawable IconCompatParcelizer = setPopupTheme.AudioAttributesCompatParcelizer();
        final /* synthetic */ Object write;

        MediaBrowserCompatCustomActionResultReceiver(Object obj) {
            this.write = obj;
        }

        @Override // o.booleanValue.IconCompatParcelizer
        public final void IconCompatParcelizer() {
            isThrowable.this.write(this.write);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.booleanValue.IconCompatParcelizer
        public final int AudioAttributesCompatParcelizer() {
            List<_assertNotNull> listOnPause;
            _assertNotNull _assertnotnull = (_assertNotNull) isThrowable.this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer(this.write);
            if (_assertnotnull == null || (listOnPause = _assertnotnull.onPause()) == null) {
                return 0;
            }
            return listOnPause.size();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.booleanValue.IconCompatParcelizer
        public final void AudioAttributesCompatParcelizer(int p0, long p1) {
            _assertNotNull _assertnotnull = (_assertNotNull) isThrowable.this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer(this.write);
            if (_assertnotnull == null || !_assertnotnull.AudioAttributesImplApi26Parcelizer()) {
                return;
            }
            int size = _assertnotnull.onPause().size();
            if (p0 < 0 || p0 >= size) {
                StringBuilder sb = new StringBuilder("Index (");
                sb.append(p0);
                sb.append(") is out of bound of [0, ");
                sb.append(size);
                sb.append(')');
                reportWrongTokenException.IconCompatParcelizer(sb.toString());
            }
            if (_assertnotnull.MediaDescriptionCompat()) {
                reportWrongTokenException.AudioAttributesCompatParcelizer("Pre-measure called on node that is not placed");
            }
            _assertNotNull _assertnotnull2 = isThrowable.this.IconCompatParcelizer;
            _assertnotnull2.onPrepareFromUri = true;
            _serializerProvider.AudioAttributesCompatParcelizer(_assertnotnull).AudioAttributesCompatParcelizer(_assertnotnull.onPause().get(p0), p1);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            _assertnotnull2.onPrepareFromUri = false;
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(p0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.booleanValue.IconCompatParcelizer
        public final void IconCompatParcelizer(Object p0, getAnswerMap<? super createForPropertyOverride, ? extends createForPropertyOverride.Companion.IconCompatParcelizer> p1) {
            ObjectReader objectReader;
            _handleOddName.IconCompatParcelizer audioAttributesImplApi21Parcelizer;
            _assertNotNull _assertnotnull = (_assertNotNull) isThrowable.this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer(this.write);
            if (_assertnotnull == null || (objectReader = _assertnotnull.get_init_lambda2()) == null || (audioAttributesImplApi21Parcelizer = objectReader.getAudioAttributesImplApi21Parcelizer()) == null) {
                return;
            }
            PropertyName.RemoteActionCompatParcelizer(audioAttributesImplApi21Parcelizer, p0, p1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.booleanValue.IconCompatParcelizer
        public final long RemoteActionCompatParcelizer(int p0) {
            _assertNotNull _assertnotnull = (_assertNotNull) isThrowable.this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer(this.write);
            if (_assertnotnull != null && _assertnotnull.AudioAttributesImplApi26Parcelizer()) {
                int size = _assertnotnull.onPause().size();
                if (p0 < 0 || p0 >= size) {
                    StringBuilder sb = new StringBuilder("Index (");
                    sb.append(p0);
                    sb.append(") is out of bound of [0, ");
                    sb.append(size);
                    sb.append(')');
                    reportWrongTokenException.IconCompatParcelizer(sb.toString());
                }
                if (this.IconCompatParcelizer.IconCompatParcelizer(p0)) {
                    long j = -1;
                    return getKey.read((((long) _assertnotnull.onPause().get(p0).IconCompatParcelizer()) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) _assertnotnull.onPause().get(p0).MediaBrowserCompatCustomActionResultReceiver()) << 32));
                }
            }
            return getKey.INSTANCE.RemoteActionCompatParcelizer();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/isThrowable$AudioAttributesImplApi21Parcelizer;", "Lo/supportsUpdate;", "Lo/isResourceManaged;", "p0", "", "read", "(Lo/isResourceManaged;)Z", "Lo/booleanValue$IconCompatParcelizer;", "()Lo/booleanValue$IconCompatParcelizer;", "", "write", "()V", "IconCompatParcelizer", "Z", "AudioAttributesCompatParcelizer", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesImplApi21Parcelizer implements supportsUpdate {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final boolean read = true;
        final /* synthetic */ Object RemoteActionCompatParcelizer;

        @Override // o.booleanValue.RemoteActionCompatParcelizer
        public final boolean read(isResourceManaged p0) {
            return true;
        }

        @Override // o.booleanValue.RemoteActionCompatParcelizer
        public final void write() {
        }

        AudioAttributesImplApi21Parcelizer(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
        }

        @Override // o.booleanValue.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final boolean getRead() {
            return this.read;
        }

        @Override // o.booleanValue.RemoteActionCompatParcelizer
        public final booleanValue.IconCompatParcelizer read() {
            return isThrowable.this.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
    }

    public final booleanValue.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(Object p0, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p1) {
        if (!this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer()) {
            return new AudioAttributesImplApi21Parcelizer(p0);
        }
        IconCompatParcelizer(p0, p1, true);
        return new AudioAttributesImplBaseParcelizer(p0);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/isThrowable$AudioAttributesImplBaseParcelizer;", "Lo/supportsUpdate;", "", "write", "()V", "Lo/isResourceManaged;", "p0", "", "read", "(Lo/isResourceManaged;)Z", "Lo/booleanValue$IconCompatParcelizer;", "()Lo/booleanValue$IconCompatParcelizer;", "Lo/isThrowable$AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "()Lo/isThrowable$AudioAttributesCompatParcelizer;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesImplBaseParcelizer implements supportsUpdate {
        final /* synthetic */ Object IconCompatParcelizer;

        AudioAttributesImplBaseParcelizer(Object obj) {
            this.IconCompatParcelizer = obj;
        }

        @Override // o.booleanValue.RemoteActionCompatParcelizer
        public final void write() {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer = IconCompatParcelizer();
            if ((audioAttributesCompatParcelizerIconCompatParcelizer != null ? audioAttributesCompatParcelizerIconCompatParcelizer.getAudioAttributesImplBaseParcelizer() : null) != null) {
                isThrowable.this.write(this.IconCompatParcelizer);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final AudioAttributesCompatParcelizer IconCompatParcelizer() {
            _assertNotNull _assertnotnull = (_assertNotNull) isThrowable.this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer);
            if (_assertnotnull != null) {
                return (AudioAttributesCompatParcelizer) isThrowable.this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer(_assertnotnull);
            }
            return null;
        }

        @Override // o.booleanValue.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
        public final boolean getRead() {
            getInputCodeLatin1 audioAttributesImplBaseParcelizer;
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer = IconCompatParcelizer();
            if (audioAttributesCompatParcelizerIconCompatParcelizer == null || (audioAttributesImplBaseParcelizer = audioAttributesCompatParcelizerIconCompatParcelizer.getAudioAttributesImplBaseParcelizer()) == null) {
                return true;
            }
            return audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer();
        }

        @Override // o.booleanValue.RemoteActionCompatParcelizer
        public final boolean read(isResourceManaged p0) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer = IconCompatParcelizer();
            getInputCodeLatin1 audioAttributesImplBaseParcelizer = audioAttributesCompatParcelizerIconCompatParcelizer != null ? audioAttributesCompatParcelizerIconCompatParcelizer.getAudioAttributesImplBaseParcelizer() : null;
            if (audioAttributesImplBaseParcelizer == null || audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer()) {
                return true;
            }
            parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
            isThrowable isthrowable = isThrowable.this;
            Object obj = this.IconCompatParcelizer;
            parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
            getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
            parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
            try {
                _assertNotNull _assertnotnull = isthrowable.IconCompatParcelizer;
                _assertnotnull.onPrepareFromUri = true;
                try {
                    boolean zWrite = audioAttributesImplBaseParcelizer.write(p0);
                    _assertnotnull.onPrepareFromUri = false;
                    return zWrite;
                } catch (Throwable th) {
                    if (audioAttributesCompatParcelizerIconCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver() != null) {
                        throw new elements(audioAttributesCompatParcelizerIconCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver(), obj, th);
                    }
                    throw th;
                }
            } finally {
                companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
            }
        }

        @Override // o.booleanValue.RemoteActionCompatParcelizer
        public final booleanValue.IconCompatParcelizer read() {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer = IconCompatParcelizer();
            if (audioAttributesCompatParcelizerIconCompatParcelizer != null) {
                isThrowable.this.read(audioAttributesCompatParcelizerIconCompatParcelizer, false);
            }
            return isThrowable.this.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void RemoteActionCompatParcelizer() {
        /*
            r14 = this;
            o._assertNotNull r0 = r14.IconCompatParcelizer
            java.util.List r0 = r0.onPrepareFromMediaId()
            int r0 = r0.size()
            int r1 = r14.MediaBrowserCompatMediaItem
            if (r1 == r0) goto L85
            o.setKeyListener<o._assertNotNull, o.isThrowable$AudioAttributesCompatParcelizer> r0 = r14.AudioAttributesImplApi26Parcelizer
            o.AppCompatButton r0 = (kotlin.AppCompatButton) r0
            java.lang.Object[] r1 = r0.MediaBrowserCompatItemReceiver
            long[] r0 = r0.RemoteActionCompatParcelizer
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L58
            r3 = 0
            r4 = r3
        L1d:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L53
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L37:
            if (r9 >= r7) goto L51
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4d
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            o.isThrowable$AudioAttributesCompatParcelizer r10 = (o.isThrowable.AudioAttributesCompatParcelizer) r10
            r11 = 1
            r10.AudioAttributesCompatParcelizer(r11)
        L4d:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L37
        L51:
            if (r7 != r8) goto L58
        L53:
            if (r4 == r2) goto L58
            int r4 = r4 + 1
            goto L1d
        L58:
            o._assertNotNull r0 = r14.IconCompatParcelizer
            o._assertNotNull r0 = r0.getMediaBrowserCompatSearchResultReceiver()
            if (r0 == 0) goto L73
            o._assertNotNull r0 = r14.IconCompatParcelizer
            boolean r0 = r0.PlaybackStateCompat()
            if (r0 != 0) goto L85
            o._assertNotNull r1 = r14.IconCompatParcelizer
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 7
            r6 = 0
            kotlin._assertNotNull.IconCompatParcelizer$default(r1, r2, r3, r4, r5, r6)
            return
        L73:
            o._assertNotNull r0 = r14.IconCompatParcelizer
            boolean r0 = r0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()
            if (r0 != 0) goto L85
            o._assertNotNull r1 = r14.IconCompatParcelizer
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 7
            r6 = 0
            kotlin._assertNotNull.AudioAttributesCompatParcelizer$default(r1, r2, r3, r4, r5, r6)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isThrowable.RemoteActionCompatParcelizer():void");
    }

    private final _assertNotNull IconCompatParcelizer(int p0) {
        _assertNotNull _assertnotnull = new _assertNotNull(true, 0, 2, null);
        _assertNotNull _assertnotnull2 = this.IconCompatParcelizer;
        _assertnotnull2.onPrepareFromUri = true;
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p0, _assertnotnull);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        _assertnotnull2.onPrepareFromUri = false;
        return _assertnotnull;
    }

    static /* synthetic */ void RemoteActionCompatParcelizer$default(isThrowable isthrowable, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        isthrowable.RemoteActionCompatParcelizer(i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z) {
        getInputCodeLatin1 audioAttributesImplBaseParcelizer = audioAttributesCompatParcelizer.getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer != null) {
            parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
            parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
            getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
            parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
            try {
                _assertNotNull _assertnotnull = this.IconCompatParcelizer;
                _assertnotnull.onPrepareFromUri = true;
                if (z) {
                    while (!audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer()) {
                        try {
                            audioAttributesImplBaseParcelizer.write(new isResourceManaged() { // from class: o.isMapLikeType
                                @Override // kotlin.isResourceManaged
                                public final boolean AudioAttributesCompatParcelizer() {
                                    return isThrowable.AudioAttributesImplApi26Parcelizer();
                                }
                            });
                        } catch (Throwable th) {
                            setExpandActivityOverflowButtonDrawable mediaBrowserCompatCustomActionResultReceiver = audioAttributesCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver();
                            if (mediaBrowserCompatCustomActionResultReceiver != null) {
                                throw new elements(mediaBrowserCompatCustomActionResultReceiver, audioAttributesCompatParcelizer.getIconCompatParcelizer(), th);
                            }
                            throw th;
                        }
                    }
                }
                audioAttributesImplBaseParcelizer.read();
                audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer((getInputCodeLatin1) null);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                _assertnotnull.onPrepareFromUri = false;
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            } finally {
                companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0012\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0018\u001a\u00020\u001a8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u000e\u0010\u001c\"\u0004\b\u000e\u0010\u001dR\"\u0010\u0012\u001a\u00020\u001a8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b\u0010\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010 8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#\"\u0004\b\u000e\u0010$R\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u001a0%8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0016\u0010&\"\u0004\b\u0010\u0010'R\"\u0010\u001f\u001a\u00020\u001a8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u0010\u0010\u001c\"\u0004\b\u0012\u0010\u001dR$\u0010\f\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u001c\"\u0004\b\u0016\u0010\u001dR\u001c\u0010!\u001a\u0004\u0018\u00010(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b\n\u0010*"}, d2 = {"Lo/isThrowable$AudioAttributesCompatParcelizer;", "", "p0", "Lkotlin/Function0;", "", "p1", "Lo/contentReference;", "p2", "<init>", "(Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;Lo/contentReference;)V", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/Object;", "AudioAttributesImplApi21Parcelizer", "()Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;)V", "IconCompatParcelizer", "Lo/MagicModuleSubmissionRequestBody;", "write", "()Lo/MagicModuleSubmissionRequestBody;", "(Lo/MagicModuleSubmissionRequestBody;)V", "Lo/contentReference;", "read", "()Lo/contentReference;", "RemoteActionCompatParcelizer", "(Lo/contentReference;)V", "", "Z", "()Z", "(Z)V", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatItemReceiver", "Lo/getInputCodeLatin1;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getInputCodeLatin1;", "()Lo/getInputCodeLatin1;", "(Lo/getInputCodeLatin1;)V", "Lo/InputAccessor;", "Lo/InputAccessor;", "(Lo/InputAccessor;)V", "Lo/setExpandActivityOverflowButtonDrawable;", "Lo/setExpandActivityOverflowButtonDrawable;", "()Lo/setExpandActivityOverflowButtonDrawable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer {
        private MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private Object IconCompatParcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private boolean write;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private boolean MediaBrowserCompatItemReceiver;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private getInputCodeLatin1 AudioAttributesImplBaseParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private final setExpandActivityOverflowButtonDrawable MediaBrowserCompatCustomActionResultReceiver;
        private boolean RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private InputAccessor<Boolean> AudioAttributesImplApi26Parcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private InterfaceC0163contentReference read;

        public AudioAttributesCompatParcelizer(Object obj, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, InterfaceC0163contentReference interfaceC0163contentReference) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
            this.read = interfaceC0163contentReference;
            this.AudioAttributesImplApi26Parcelizer = available.RemoteActionCompatParcelizer$default(Boolean.TRUE, null, 2, null);
            this.MediaBrowserCompatCustomActionResultReceiver = null;
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(Object obj, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, InterfaceC0163contentReference interfaceC0163contentReference, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(obj, magicModuleSubmissionRequestBody, (i & 4) != 0 ? null : interfaceC0163contentReference);
        }

        public final void AudioAttributesCompatParcelizer(Object obj) {
            this.IconCompatParcelizer = obj;
        }

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
        public final Object getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> write() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final void write(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody) {
            this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
        }

        public final void RemoteActionCompatParcelizer(InterfaceC0163contentReference interfaceC0163contentReference) {
            this.read = interfaceC0163contentReference;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final InterfaceC0163contentReference getRead() {
            return this.read;
        }

        public final void AudioAttributesCompatParcelizer(boolean z) {
            this.RemoteActionCompatParcelizer = z;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final boolean getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void IconCompatParcelizer(boolean z) {
            this.write = z;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
        public final boolean getWrite() {
            return this.write;
        }

        public final void AudioAttributesCompatParcelizer(getInputCodeLatin1 getinputcodelatin1) {
            this.AudioAttributesImplBaseParcelizer = getinputcodelatin1;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
        public final getInputCodeLatin1 getAudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final void IconCompatParcelizer(InputAccessor<Boolean> inputAccessor) {
            this.AudioAttributesImplApi26Parcelizer = inputAccessor;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final boolean getMediaBrowserCompatItemReceiver() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final void write(boolean z) {
            this.MediaBrowserCompatItemReceiver = z;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.AudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer().booleanValue();
        }

        public final void read(boolean z) {
            this.AudioAttributesImplApi26Parcelizer.write(Boolean.valueOf(z));
        }

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
        public final setExpandActivityOverflowButtonDrawable getMediaBrowserCompatCustomActionResultReceiver() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ]\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000e2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00198\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001b\u001a\u00020\u001f8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010 \u001a\u0004\b\u000b\u0010!\"\u0004\b\"\u0010#R\"\u0010\u0017\u001a\u00020\u001f8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010 \u001a\u0004\b\u0017\u0010!\"\u0004\b$\u0010#R\u0014\u0010\u000b\u001a\u00020%8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'"}, d2 = {"Lo/isThrowable$read;", "Lo/getNodeType;", "<init>", "(Lo/isThrowable;)V", "", "p0", "Lkotlin/Function0;", "", "p1", "", "Lo/isTypeOrSuperTypeOf;", "IconCompatParcelizer", "(Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;)Ljava/util/List;", "", "", "Lo/weirdNumberException;", "p2", "Lkotlin/Function1;", "Lo/JsonNode;", "p3", "Lo/_parser$IconCompatParcelizer;", "p4", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(IILjava/util/Map;Lo/getAnswerMap;Lo/getAnswerMap;)Lo/withHandlersFrom;", "Lo/tryToResolveUnresolved;", "Lo/tryToResolveUnresolved;", "read", "()Lo/tryToResolveUnresolved;", "RemoteActionCompatParcelizer", "(Lo/tryToResolveUnresolved;)V", "", "F", "()F", "MediaBrowserCompatCustomActionResultReceiver", "(F)V", "MediaBrowserCompatItemReceiver", "", "r_", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class read implements getNodeType {
        private float AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private tryToResolveUnresolved RemoteActionCompatParcelizer = tryToResolveUnresolved.RemoteActionCompatParcelizer;
        private float read;

        public read() {
        }

        public final void RemoteActionCompatParcelizer(tryToResolveUnresolved trytoresolveunresolved) {
            this.RemoteActionCompatParcelizer = trytoresolveunresolved;
        }

        @Override // kotlin.getValueHandler
        /* JADX INFO: renamed from: read, reason: from getter */
        public final tryToResolveUnresolved getAudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.bufferMapProperty
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final float getRead() {
            return this.read;
        }

        public final void MediaBrowserCompatCustomActionResultReceiver(float f) {
            this.read = f;
        }

        @Override // kotlin.getParameter
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final float getIconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final void MediaBrowserCompatItemReceiver(float f) {
            this.AudioAttributesCompatParcelizer = f;
        }

        @Override // kotlin.getValueHandler
        public final boolean r_() {
            return isThrowable.this.IconCompatParcelizer.onSkipToQueueItem() == _assertNotNull.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer || isThrowable.this.IconCompatParcelizer.onSkipToQueueItem() == _assertNotNull.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.getNodeType
        public final List<isTypeOrSuperTypeOf> IconCompatParcelizer(Object p0, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p1) {
            return isThrowable.this.IconCompatParcelizer(p0, p1);
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/isThrowable$read$AudioAttributesCompatParcelizer;", "Lo/withHandlersFrom;", "", "onMediaButtonEvent", "()V", "", "onFastForward", "()I", "read", "onAddQueueItem", "IconCompatParcelizer", "", "Lo/weirdNumberException;", "AudioAttributesImplApi26Parcelizer", "()Ljava/util/Map;", "RemoteActionCompatParcelizer", "Lkotlin/Function1;", "Lo/JsonNode;", "onPause", "()Lo/getAnswerMap;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AudioAttributesCompatParcelizer implements withHandlersFrom {
            final /* synthetic */ int AudioAttributesCompatParcelizer;
            final /* synthetic */ read AudioAttributesImplBaseParcelizer;
            final /* synthetic */ int IconCompatParcelizer;
            final /* synthetic */ isThrowable MediaBrowserCompatItemReceiver;
            final /* synthetic */ getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> RemoteActionCompatParcelizer;
            final /* synthetic */ getAnswerMap<JsonNode, getShowPopup> read;
            final /* synthetic */ Map<weirdNumberException, Integer> write;

            /* JADX WARN: Multi-variable type inference failed */
            AudioAttributesCompatParcelizer(int i, int i2, Map<weirdNumberException, Integer> map, getAnswerMap<? super JsonNode, getShowPopup> getanswermap, read readVar, isThrowable isthrowable, getAnswerMap<? super _parser.IconCompatParcelizer, getShowPopup> getanswermap2) {
                this.AudioAttributesCompatParcelizer = i;
                this.IconCompatParcelizer = i2;
                this.write = map;
                this.read = getanswermap;
                this.AudioAttributesImplBaseParcelizer = readVar;
                this.MediaBrowserCompatItemReceiver = isthrowable;
                this.RemoteActionCompatParcelizer = getanswermap2;
            }

            @Override // kotlin.withHandlersFrom
            /* JADX INFO: renamed from: onFastForward, reason: from getter */
            public final int getAudioAttributesCompatParcelizer() {
                return this.AudioAttributesCompatParcelizer;
            }

            @Override // kotlin.withHandlersFrom
            /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
            public final int getRead() {
                return this.IconCompatParcelizer;
            }

            @Override // kotlin.withHandlersFrom
            public final Map<weirdNumberException, Integer> AudioAttributesImplApi26Parcelizer() {
                return this.write;
            }

            @Override // kotlin.withHandlersFrom
            public final getAnswerMap<JsonNode, getShowPopup> onPause() {
                return this.read;
            }

            @Override // kotlin.withHandlersFrom
            public final void onMediaButtonEvent() {
                readerFor readerforMediaMetadataCompat;
                if (!this.AudioAttributesImplBaseParcelizer.r_() || (readerforMediaMetadataCompat = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer.onPrepareFromUri().getAudioAttributesCompatParcelizer()) == null) {
                    this.RemoteActionCompatParcelizer.invoke(this.MediaBrowserCompatItemReceiver.IconCompatParcelizer.onPrepareFromUri().getMediaDescriptionCompat());
                } else {
                    this.RemoteActionCompatParcelizer.invoke(readerforMediaMetadataCompat.getMediaDescriptionCompat());
                }
            }
        }

        @Override // kotlin.withContentValueHandler
        public final withHandlersFrom AudioAttributesCompatParcelizer(int p0, int p1, Map<weirdNumberException, Integer> p2, getAnswerMap<? super JsonNode, getShowPopup> p3, getAnswerMap<? super _parser.IconCompatParcelizer, getShowPopup> p4) {
            if ((p0 & (-16777216)) != 0 || ((-16777216) & p1) != 0) {
                StringBuilder sb = new StringBuilder("Size(");
                sb.append(p0);
                sb.append(" x ");
                sb.append(p1);
                sb.append(") is out of range. Each dimension must be between 0 and 16777215.");
                reportWrongTokenException.read(sb.toString());
            }
            return new AudioAttributesCompatParcelizer(p0, p1, p2, p3, this, isThrowable.this, p4);
        }
    }

    @Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJH\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0012H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J^\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000f2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u00122\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0012H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u001aJ\u0014\u0010\f\u001a\u00020\u000e*\u00020\u001bH\u0096\u0001¢\u0006\u0004\b\f\u0010\u001cJ\u0014\u0010\u001e\u001a\u00020\u000e*\u00020\u001dH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010 \u001a\u00020\u001b*\u00020\u000eH\u0096\u0001¢\u0006\u0004\b \u0010!J\u0014\u0010#\u001a\u00020\u001b*\u00020\"H\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0014\u0010%\u001a\u00020\u001b*\u00020\u001dH\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0014\u0010 \u001a\u00020(*\u00020'H\u0096\u0001¢\u0006\u0004\b \u0010)J\u0014\u0010\u0016\u001a\u00020\"*\u00020\u001bH\u0096\u0001¢\u0006\u0004\b\u0016\u0010$J\u0014\u0010*\u001a\u00020\"*\u00020\u001dH\u0096\u0001¢\u0006\u0004\b*\u0010&J\u0014\u0010+\u001a\u00020'*\u00020(H\u0096\u0001¢\u0006\u0004\b+\u0010)J\u0014\u0010,\u001a\u00020\u001d*\u00020\"H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0014\u0010.\u001a\u00020\u001d*\u00020\u001bH\u0096\u0001¢\u0006\u0004\b.\u0010-R\u0014\u0010#\u001a\u00020\"8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010/R\u0014\u0010\f\u001a\u00020\"8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010/R\u0014\u0010\u0016\u001a\u0002008WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u0010.\u001a\u0002038\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u00104"}, d2 = {"Lo/isThrowable$IconCompatParcelizer;", "Lo/getNodeType;", "Lo/withContentValueHandler;", "<init>", "(Lo/isThrowable;)V", "", "p0", "Lkotlin/Function0;", "", "p1", "", "Lo/isTypeOrSuperTypeOf;", "IconCompatParcelizer", "(Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;)Ljava/util/List;", "", "", "Lo/weirdNumberException;", "p2", "Lkotlin/Function1;", "Lo/_parser$IconCompatParcelizer;", "p3", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(IILjava/util/Map;Lo/getAnswerMap;)Lo/withHandlersFrom;", "Lo/JsonNode;", "p4", "(IILjava/util/Map;Lo/getAnswerMap;Lo/getAnswerMap;)Lo/withHandlersFrom;", "Lo/assignParameter;", "(F)I", "Lo/ReadableObjectIdReferring;", "a_", "(J)I", "b_", "(I)F", "", "write", "(F)F", "e_", "(J)F", "Lo/calloc;", "Lo/handleIdValue;", "(J)J", "c_", "d_", "RemoteActionCompatParcelizer", "(F)J", "read", "()F", "", "r_", "()Z", "Lo/tryToResolveUnresolved;", "()Lo/tryToResolveUnresolved;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class IconCompatParcelizer implements getNodeType {
        private final /* synthetic */ read RemoteActionCompatParcelizer;

        public IconCompatParcelizer() {
            this.RemoteActionCompatParcelizer = isThrowable.this.AudioAttributesImplApi21Parcelizer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.getNodeType
        public final List<isTypeOrSuperTypeOf> IconCompatParcelizer(Object p0, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p1) {
            _assertNotNull _assertnotnull = (_assertNotNull) isThrowable.this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer(p0);
            if (_assertnotnull == null || isThrowable.this.IconCompatParcelizer.onPrepareFromMediaId().indexOf(_assertnotnull) >= isThrowable.this.RemoteActionCompatParcelizer) {
                return isThrowable.this.RemoteActionCompatParcelizer(p0, p1);
            }
            return _assertnotnull.onFastForward();
        }

        @Override // kotlin.bufferMapProperty
        /* JADX INFO: renamed from: IconCompatParcelizer */
        public final float getRead() {
            return this.RemoteActionCompatParcelizer.getRead();
        }

        @Override // kotlin.getParameter
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
        public final float getIconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer.getIconCompatParcelizer();
        }

        @Override // kotlin.getValueHandler
        /* JADX INFO: renamed from: read */
        public final tryToResolveUnresolved getAudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer();
        }

        @Override // kotlin.getValueHandler
        public final boolean r_() {
            return this.RemoteActionCompatParcelizer.r_();
        }

        @Override // kotlin.withContentValueHandler
        public final withHandlersFrom AudioAttributesCompatParcelizer(int p0, int p1, Map<weirdNumberException, Integer> p2, getAnswerMap<? super _parser.IconCompatParcelizer, getShowPopup> p3) {
            return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1, p2, p3);
        }

        @Override // kotlin.withContentValueHandler
        public final withHandlersFrom AudioAttributesCompatParcelizer(int p0, int p1, Map<weirdNumberException, Integer> p2, getAnswerMap<? super JsonNode, getShowPopup> p3, getAnswerMap<? super _parser.IconCompatParcelizer, getShowPopup> p4) {
            return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1, p2, p3, p4);
        }

        @Override // kotlin.bufferMapProperty
        public final int a_(long j) {
            return this.RemoteActionCompatParcelizer.a_(j);
        }

        @Override // kotlin.bufferMapProperty
        public final int IconCompatParcelizer(float f) {
            return this.RemoteActionCompatParcelizer.IconCompatParcelizer(f);
        }

        @Override // kotlin.getParameter
        public final float e_(long j) {
            return this.RemoteActionCompatParcelizer.e_(j);
        }

        @Override // kotlin.bufferMapProperty
        public final float write(float f) {
            return this.RemoteActionCompatParcelizer.write(f);
        }

        @Override // kotlin.bufferMapProperty
        public final float b_(int i) {
            return this.RemoteActionCompatParcelizer.b_(i);
        }

        @Override // kotlin.bufferMapProperty
        public final long b_(long j) {
            return this.RemoteActionCompatParcelizer.b_(j);
        }

        @Override // kotlin.bufferMapProperty
        public final float c_(long j) {
            return this.RemoteActionCompatParcelizer.c_(j);
        }

        @Override // kotlin.bufferMapProperty
        public final float AudioAttributesCompatParcelizer(float f) {
            return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(f);
        }

        @Override // kotlin.bufferMapProperty
        public final long d_(long j) {
            return this.RemoteActionCompatParcelizer.d_(j);
        }

        @Override // kotlin.getParameter
        public final long read(float f) {
            return this.RemoteActionCompatParcelizer.read(f);
        }

        @Override // kotlin.bufferMapProperty
        public final long RemoteActionCompatParcelizer(float f) {
            return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<isTypeOrSuperTypeOf> RemoteActionCompatParcelizer(Object p0, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p1) {
        if (this.MediaBrowserCompatSearchResultReceiver.getAudioAttributesCompatParcelizer() < this.AudioAttributesCompatParcelizer) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer(p0);
        int audioAttributesCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.getAudioAttributesCompatParcelizer();
        int i = this.AudioAttributesCompatParcelizer;
        if (audioAttributesCompatParcelizer == i) {
            this.MediaBrowserCompatSearchResultReceiver.read(p0);
        } else {
            this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(i, p0);
        }
        this.AudioAttributesCompatParcelizer++;
        boolean z = this.AudioAttributesImplBaseParcelizer.read(p0);
        if (!z && _assertnotnullAudioAttributesImplApi26Parcelizer == null) {
            this.MediaMetadataCompat.RemoteActionCompatParcelizer(p0, read(p0, p1));
        } else {
            if (!z && _assertnotnullAudioAttributesImplApi26Parcelizer != null) {
                RemoteActionCompatParcelizer(this.IconCompatParcelizer.onPrepareFromMediaId().indexOf(_assertnotnullAudioAttributesImplApi26Parcelizer), this.IconCompatParcelizer.onPrepareFromMediaId().size(), 1);
                this.MediaDescriptionCompat++;
                this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(p0);
                this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(p0, _assertnotnullAudioAttributesImplApi26Parcelizer);
                this.MediaMetadataCompat.RemoteActionCompatParcelizer(p0, RemoteActionCompatParcelizer(p0));
                if (this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer()) {
                    AudioAttributesImplApi21Parcelizer();
                }
            }
            _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer2 = this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer(p0);
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer = _assertnotnullAudioAttributesImplApi26Parcelizer2 != null ? this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer(_assertnotnullAudioAttributesImplApi26Parcelizer2) : null;
            if (audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer != null && audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer()) {
                RemoteActionCompatParcelizer(_assertnotnullAudioAttributesImplApi26Parcelizer2, p0, false, p1);
            }
            if ((audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer != null ? audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.getAudioAttributesImplBaseParcelizer() : null) != null) {
                read(audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer, true);
            }
        }
        _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer3 = this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer(p0);
        if (_assertnotnullAudioAttributesImplApi26Parcelizer3 != null) {
            List<getSubtypeResolver> listRatingCompat = _assertnotnullAudioAttributesImplApi26Parcelizer3.ParcelableVolumeInfo().RatingCompat();
            int size = listRatingCompat.size();
            for (int i2 = 0; i2 < size; i2++) {
                listRatingCompat.get(i2).onPrepareFromSearch();
            }
            if (listRatingCompat != null) {
                return listRatingCompat;
            }
        }
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    private final void RemoteActionCompatParcelizer(int p0, int p1, int p2) {
        _assertNotNull _assertnotnull = this.IconCompatParcelizer;
        _assertnotnull.onPrepareFromUri = true;
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1, p2);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        _assertnotnull.onPrepareFromUri = false;
    }
}
