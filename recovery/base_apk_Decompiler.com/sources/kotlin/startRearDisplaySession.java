package kotlin;

import kotlin.Metadata;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u000e\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010!"}, d2 = {"Lo/startRearDisplaySession;", "", "Lo/tryToResolveUnresolved;", "p0", "Lo/deserializeWithObjectId;", "p1", "Lo/bufferMapProperty;", "p2", "Lo/_reportMissingSetter$write;", "p3", "<init>", "(Lo/tryToResolveUnresolved;Lo/deserializeWithObjectId;Lo/bufferMapProperty;Lo/_reportMissingSetter$write;)V", "Lo/PropertyValueAny;", "", "read", "(JI)J", "AudioAttributesImplApi21Parcelizer", "Lo/tryToResolveUnresolved;", "RemoteActionCompatParcelizer", "()Lo/tryToResolveUnresolved;", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "Lo/deserializeWithObjectId;", "IconCompatParcelizer", "()Lo/deserializeWithObjectId;", "Lo/bufferMapProperty;", "()Lo/bufferMapProperty;", "Lo/_reportMissingSetter$write;", "write", "()Lo/_reportMissingSetter$write;", "MediaBrowserCompatItemReceiver", "", "MediaBrowserCompatCustomActionResultReceiver", "F", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class startRearDisplaySession {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int read = 8;
    private static startRearDisplaySession write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final tryToResolveUnresolved AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final deserializeWithObjectId IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final bufferMapProperty read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final deserializeWithObjectId RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final _reportMissingSetter.write write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private float AudioAttributesImplBaseParcelizer = Float.NaN;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private float MediaBrowserCompatCustomActionResultReceiver = Float.NaN;

    public startRearDisplaySession(tryToResolveUnresolved trytoresolveunresolved, deserializeWithObjectId deserializewithobjectid, bufferMapProperty buffermapproperty, _reportMissingSetter.write writeVar) {
        this.AudioAttributesCompatParcelizer = trytoresolveunresolved;
        this.IconCompatParcelizer = deserializewithobjectid;
        this.read = buffermapproperty;
        this.write = writeVar;
        this.RemoteActionCompatParcelizer = injectValues.IconCompatParcelizer(deserializewithobjectid, trytoresolveunresolved);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final tryToResolveUnresolved getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final deserializeWithObjectId getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final bufferMapProperty getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final _reportMissingSetter.write getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: o.startRearDisplaySession$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/startRearDisplaySession$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/startRearDisplaySession;", "p0", "Lo/tryToResolveUnresolved;", "p1", "Lo/deserializeWithObjectId;", "p2", "Lo/bufferMapProperty;", "p3", "Lo/_reportMissingSetter$write;", "p4", "IconCompatParcelizer", "(Lo/startRearDisplaySession;Lo/tryToResolveUnresolved;Lo/deserializeWithObjectId;Lo/bufferMapProperty;Lo/_reportMissingSetter$write;)Lo/startRearDisplaySession;", "write", "Lo/startRearDisplaySession;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final startRearDisplaySession IconCompatParcelizer(startRearDisplaySession p0, tryToResolveUnresolved p1, deserializeWithObjectId p2, bufferMapProperty p3, _reportMissingSetter.write p4) {
            if (p0 != null && p1 == p0.getAudioAttributesCompatParcelizer() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(injectValues.IconCompatParcelizer(p2, p1), p0.getIconCompatParcelizer()) && p3.getRead() == p0.getRead().getRead() && p4 == p0.getWrite()) {
                return p0;
            }
            startRearDisplaySession startreardisplaysession = startRearDisplaySession.write;
            if (startreardisplaysession != null && p1 == startreardisplaysession.getAudioAttributesCompatParcelizer() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(injectValues.IconCompatParcelizer(p2, p1), startreardisplaysession.getIconCompatParcelizer()) && p3.getRead() == startreardisplaysession.getRead().getRead() && p4 == startreardisplaysession.getWrite()) {
                return startreardisplaysession;
            }
            startRearDisplaySession startreardisplaysession2 = new startRearDisplaySession(p1, injectValues.IconCompatParcelizer(p2, p1), bufferAnyProperty.IconCompatParcelizer(p3.getRead(), p3.getIconCompatParcelizer()), p4);
            Companion companion = startRearDisplaySession.INSTANCE;
            startRearDisplaySession.write = startreardisplaysession2;
            return startreardisplaysession2;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final long read(long p0, int p1) {
        int iMediaBrowserCompatCustomActionResultReceiver;
        float f = this.MediaBrowserCompatCustomActionResultReceiver;
        float f2 = this.AudioAttributesImplBaseParcelizer;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            f = _findCustomMapLikeDeserializer.IconCompatParcelizer(onDeviceStateChanged.write, this.RemoteActionCompatParcelizer, PropertyValueBuffer.read$default(0, 0, 0, 0, 15, null), this.read, this.write, (64 & 32) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : null, (64 & 64) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 1, (64 & 256) != 0 ? paramName.INSTANCE.RemoteActionCompatParcelizer() : paramName.INSTANCE.RemoteActionCompatParcelizer()).read();
            f2 = _findCustomMapLikeDeserializer.IconCompatParcelizer(onDeviceStateChanged.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, PropertyValueBuffer.read$default(0, 0, 0, 0, 15, null), this.read, this.write, (64 & 32) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : null, (64 & 64) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 2, (64 & 256) != 0 ? paramName.INSTANCE.RemoteActionCompatParcelizer() : paramName.INSTANCE.RemoteActionCompatParcelizer()).read() - f;
            this.MediaBrowserCompatCustomActionResultReceiver = f;
            this.AudioAttributesImplBaseParcelizer = f2;
        }
        if (p1 != 1) {
            iMediaBrowserCompatCustomActionResultReceiver = getQues.RemoteActionCompatParcelizer(getQues.write(Math.round(f + (f2 * (p1 - 1))), 0), PropertyValueAny.AudioAttributesImplApi21Parcelizer(p0));
        } else {
            iMediaBrowserCompatCustomActionResultReceiver = PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(p0);
        }
        return PropertyValueBuffer.read(PropertyValueAny.MediaBrowserCompatItemReceiver(p0), PropertyValueAny.AudioAttributesImplBaseParcelizer(p0), iMediaBrowserCompatCustomActionResultReceiver, PropertyValueAny.AudioAttributesImplApi21Parcelizer(p0));
    }
}
