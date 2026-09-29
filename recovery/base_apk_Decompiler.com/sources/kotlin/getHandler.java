package kotlin;

import android.os.Trace;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001#BS\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u001eJ=\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001fJ%\u0010\u0018\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010!J\u0017\u0010\"\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010\u001eJ\u000f\u0010#\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020 *\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020 H\u0002¢\u0006\u0004\b(\u0010$J#\u0010#\u001a\u00020,*\u00020)2\u0006\u0010\u0006\u001a\u00020*2\u0006\u0010\b\u001a\u00020+H\u0016¢\u0006\u0004\b#\u0010-J#\u0010#\u001a\u00020\u000f*\u00020\u00162\u0006\u0010\u0006\u001a\u00020.2\u0006\u0010\b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010/J#\u0010\u001c\u001a\u00020\u000f*\u00020\u00162\u0006\u0010\u0006\u001a\u00020.2\u0006\u0010\b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010/J#\u0010\"\u001a\u00020\u000f*\u00020\u00162\u0006\u0010\u0006\u001a\u00020.2\u0006\u0010\b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010/J#\u0010&\u001a\u00020\u000f*\u00020\u00162\u0006\u0010\u0006\u001a\u00020.2\u0006\u0010\b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010/J\u0013\u0010&\u001a\u00020 *\u000200H\u0016¢\u0006\u0004\b&\u00101R\u0016\u0010\u001c\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010&\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00106R\u0016\u0010\"\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00107R\u0016\u0010#\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00108R\u0016\u00104\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00107R\u0016\u00109\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00107R\u0018\u0010(\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u001a\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010;R$\u0010?\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u000f\u0018\u00010<8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010>R\u0018\u00102\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010@R\u0014\u0010A\u001a\u00020\u00178CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001bR*\u0010F\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C\u0012\u0004\u0012\u00020\r\u0018\u00010B8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010ER\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010I"}, d2 = {"Lo/getHandler;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/_initForReading;", "Lo/addKeySerializers;", "Lo/hasIndex;", "", "p0", "Lo/deserializeWithObjectId;", "p1", "Lo/_reportMissingSetter$write;", "p2", "Lo/paramName;", "p3", "", "p4", "", "p5", "p6", "Lo/MinimalPrettyPrinter;", "p7", "<init>", "(Ljava/lang/String;Lo/deserializeWithObjectId;Lo/_reportMissingSetter$write;IZIILo/MinimalPrettyPrinter;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/getValueHandler;", "Lo/SidecarCompatTranslatingCallback;", "IconCompatParcelizer", "(Lo/getValueHandler;)Lo/SidecarCompatTranslatingCallback;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/SidecarCompatTranslatingCallback;", "AudioAttributesCompatParcelizer", "(Lo/MinimalPrettyPrinter;Lo/deserializeWithObjectId;)Z", "(Ljava/lang/String;)Z", "(Lo/deserializeWithObjectId;IIZLo/_reportMissingSetter$write;I)Z", "", "(ZZZ)V", "RemoteActionCompatParcelizer", "read", "()V", "Lo/getConfigOverride;", "write", "(Lo/getConfigOverride;)V", "AudioAttributesImplApi26Parcelizer", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "Lo/hasHandlers;", "(Lo/getValueHandler;Lo/hasHandlers;I)I", "Lo/findSerializer;", "(Lo/findSerializer;)V", "RatingCompat", "Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "Lo/deserializeWithObjectId;", "Lo/_reportMissingSetter$write;", "I", "Z", "MediaBrowserCompatItemReceiver", "Lo/MinimalPrettyPrinter;", "()Z", "", "Lo/weirdNumberException;", "Ljava/util/Map;", "AudioAttributesImplApi21Parcelizer", "Lo/SidecarCompatTranslatingCallback;", "MediaDescriptionCompat", "Lkotlin/Function1;", "", "Lo/deserializeFromNumber;", "Lo/getAnswerMap;", "MediaMetadataCompat", "Lo/getHandler$read;", "MediaBrowserCompatMediaItem", "Lo/getHandler$read;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getHandler extends _handleOddName.IconCompatParcelizer implements _initForReading, addKeySerializers, hasIndex {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private getAnswerMap<? super List<deserializeFromNumber>, Boolean> MediaMetadataCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private deserializeWithObjectId write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private SidecarCompatTranslatingCallback RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private MinimalPrettyPrinter AudioAttributesImplApi26Parcelizer;
    private read MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private _reportMissingSetter.write IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private Map<weirdNumberException, Integer> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int MediaBrowserCompatItemReceiver;

    @Override // o._handleOddName.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer */
    public final boolean getIconCompatParcelizer() {
        return false;
    }

    private getHandler(String str, deserializeWithObjectId deserializewithobjectid, _reportMissingSetter.write writeVar, int i, boolean z, int i2, int i3, MinimalPrettyPrinter minimalPrettyPrinter) {
        this.AudioAttributesCompatParcelizer = str;
        this.write = deserializewithobjectid;
        this.IconCompatParcelizer = writeVar;
        this.RemoteActionCompatParcelizer = i;
        this.read = z;
        this.AudioAttributesImplBaseParcelizer = i2;
        this.MediaBrowserCompatItemReceiver = i3;
        this.AudioAttributesImplApi26Parcelizer = minimalPrettyPrinter;
    }

    private final SidecarCompatTranslatingCallback write() {
        if (this.RatingCompat == null) {
            this.RatingCompat = new SidecarCompatTranslatingCallback(this.AudioAttributesCompatParcelizer, this.write, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver, null);
        }
        SidecarCompatTranslatingCallback sidecarCompatTranslatingCallback = this.RatingCompat;
        toMagicModuleMetaRepoModel.write(sidecarCompatTranslatingCallback);
        return sidecarCompatTranslatingCallback;
    }

    private final SidecarCompatTranslatingCallback IconCompatParcelizer(getValueHandler getvaluehandler) {
        SidecarCompatTranslatingCallback sidecarCompatTranslatingCallbackMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        sidecarCompatTranslatingCallbackMediaBrowserCompatCustomActionResultReceiver.read(getvaluehandler);
        return sidecarCompatTranslatingCallbackMediaBrowserCompatCustomActionResultReceiver;
    }

    private final SidecarCompatTranslatingCallback MediaBrowserCompatCustomActionResultReceiver() {
        SidecarCompatTranslatingCallback read2;
        read readVar = this.MediaBrowserCompatMediaItem;
        if (readVar != null) {
            if (!readVar.getIconCompatParcelizer()) {
                readVar = null;
            }
            if (readVar != null && (read2 = readVar.getRead()) != null) {
                return read2;
            }
        }
        return write();
    }

    public final boolean AudioAttributesCompatParcelizer(MinimalPrettyPrinter p0, deserializeWithObjectId p1) {
        boolean zRemoteActionCompatParcelizer = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.AudioAttributesImplApi26Parcelizer);
        this.AudioAttributesImplApi26Parcelizer = p0;
        return (zRemoteActionCompatParcelizer && p1.IconCompatParcelizer(this.write)) ? false : true;
    }

    public final boolean IconCompatParcelizer(String p0) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) p0)) {
            return false;
        }
        this.AudioAttributesCompatParcelizer = p0;
        read();
        return true;
    }

    public final boolean AudioAttributesCompatParcelizer(deserializeWithObjectId p0, int p1, int p2, boolean p3, _reportMissingSetter.write p4, int p5) {
        boolean z = !this.write.read(p0);
        this.write = p0;
        if (this.MediaBrowserCompatItemReceiver != p1) {
            this.MediaBrowserCompatItemReceiver = p1;
            z = true;
        }
        if (this.AudioAttributesImplBaseParcelizer != p2) {
            this.AudioAttributesImplBaseParcelizer = p2;
            z = true;
        }
        if (this.read != p3) {
            this.read = p3;
            z = true;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, p4)) {
            this.IconCompatParcelizer = p4;
            z = true;
        }
        if (paramName.write(this.RemoteActionCompatParcelizer, p5)) {
            return z;
        }
        this.RemoteActionCompatParcelizer = p5;
        return true;
    }

    public final void IconCompatParcelizer(boolean p0, boolean p1, boolean p2) {
        if (p1 || p2) {
            write().write(this.AudioAttributesCompatParcelizer, this.write, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver);
        }
        if (getRatingCompat()) {
            if (p1 || (p0 && this.MediaMetadataCompat != null)) {
                getValueNulls.write(this);
            }
            if (p1 || p2) {
                _newReader.RemoteActionCompatParcelizer(this);
                addDeserializers.read(this);
            }
            if (p0) {
                addDeserializers.read(this);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0012\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u0015\u0010\u001bR$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d\"\u0004\b\u0015\u0010\u001e"}, d2 = {"Lo/getHandler$read;", "", "", "p0", "p1", "", "p2", "Lo/SidecarCompatTranslatingCallback;", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLo/SidecarCompatTranslatingCallback;)V", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "IconCompatParcelizer", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "write", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)V", "read", "Z", "()Z", "(Z)V", "Lo/SidecarCompatTranslatingCallback;", "()Lo/SidecarCompatTranslatingCallback;", "(Lo/SidecarCompatTranslatingCallback;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class read {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private SidecarCompatTranslatingCallback read;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final String RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private boolean IconCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private String AudioAttributesCompatParcelizer;

        public read(String str, String str2, boolean z, SidecarCompatTranslatingCallback sidecarCompatTranslatingCallback) {
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = str2;
            this.IconCompatParcelizer = z;
            this.read = sidecarCompatTranslatingCallback;
        }

        public /* synthetic */ read(String str, String str2, boolean z, SidecarCompatTranslatingCallback sidecarCompatTranslatingCallback, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : sidecarCompatTranslatingCallback);
        }

        public final void AudioAttributesCompatParcelizer(String str) {
            this.AudioAttributesCompatParcelizer = str;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final String getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final boolean getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final void write(boolean z) {
            this.IconCompatParcelizer = z;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final SidecarCompatTranslatingCallback getRead() {
            return this.read;
        }

        public final void write(SidecarCompatTranslatingCallback sidecarCompatTranslatingCallback) {
            this.read = sidecarCompatTranslatingCallback;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
            sb.append(this.read);
            sb.append(", isShowingSubstitution=");
            sb.append(this.IconCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof read)) {
                return false;
            }
            read readVar = (read) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) readVar.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) readVar.AudioAttributesCompatParcelizer) && this.IconCompatParcelizer == readVar.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, readVar.read);
        }

        public final int hashCode() {
            int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
            int iHashCode2 = this.AudioAttributesCompatParcelizer.hashCode();
            int iHashCode3 = Boolean.hashCode(this.IconCompatParcelizer);
            SidecarCompatTranslatingCallback sidecarCompatTranslatingCallback = this.read;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (sidecarCompatTranslatingCallback == null ? 0 : sidecarCompatTranslatingCallback.hashCode());
        }
    }

    private final boolean RemoteActionCompatParcelizer(String p0) {
        read readVar = this.MediaBrowserCompatMediaItem;
        if (readVar != null) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) readVar.getAudioAttributesCompatParcelizer())) {
                return false;
            }
            readVar.AudioAttributesCompatParcelizer(p0);
            SidecarCompatTranslatingCallback read2 = readVar.getRead();
            if (read2 == null) {
                return false;
            }
            read2.write(p0, this.write, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver);
            return true;
        }
        read readVar2 = new read(this.AudioAttributesCompatParcelizer, p0, false, null, 12, null);
        SidecarCompatTranslatingCallback sidecarCompatTranslatingCallback = new SidecarCompatTranslatingCallback(p0, this.write, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver, null);
        sidecarCompatTranslatingCallback.read(write().getAudioAttributesImplBaseParcelizer());
        readVar2.write(sidecarCompatTranslatingCallback);
        this.MediaBrowserCompatMediaItem = readVar2;
        return true;
    }

    private final void read() {
        this.MediaBrowserCompatMediaItem = null;
    }

    @Override // kotlin.hasIndex
    public final void write(getConfigOverride getconfigoverride) {
        getAnswerMap<? super List<deserializeFromNumber>, Boolean> getanswermap = this.MediaMetadataCompat;
        if (getanswermap == null) {
            getanswermap = new getAnswerMap() { // from class: o.setDefaultItemSpacingDp
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(getHandler.read(this.AudioAttributesCompatParcelizer, (List) obj));
                }
            };
            this.MediaMetadataCompat = getanswermap;
        }
        MapperBuilder.AudioAttributesCompatParcelizer(getconfigoverride, new AbstractDeserializer(this.AudioAttributesCompatParcelizer, null, 2, null));
        read readVar = this.MediaBrowserCompatMediaItem;
        if (readVar != null) {
            MapperBuilder.AudioAttributesCompatParcelizer(getconfigoverride, readVar.getIconCompatParcelizer());
            MapperBuilder.IconCompatParcelizer(getconfigoverride, new AbstractDeserializer(readVar.getAudioAttributesCompatParcelizer(), null, 2, null));
        }
        MapperBuilder.AudioAttributesImplBaseParcelizer$default(getconfigoverride, (String) null, new getAnswerMap() { // from class: o.setDefaultGlobalSnapHelperFactory
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(getHandler.write(this.IconCompatParcelizer, (AbstractDeserializer) obj));
            }
        }, 1, (Object) null);
        MapperBuilder.MediaBrowserCompatCustomActionResultReceiver$default(getconfigoverride, (String) null, new getAnswerMap() { // from class: o.Size
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(getHandler.IconCompatParcelizer(this.read, ((Boolean) obj).booleanValue()));
            }
        }, 1, (Object) null);
        MapperBuilder.IconCompatParcelizer$default(getconfigoverride, (String) null, new getCreatedOnDateMs() { // from class: o.setPaddingDp
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(getHandler.write(this.AudioAttributesCompatParcelizer));
            }
        }, 1, (Object) null);
        MapperBuilder.RemoteActionCompatParcelizer$default(getconfigoverride, (String) null, getanswermap, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(getHandler gethandler, List list) {
        SidecarCompatTranslatingCallback sidecarCompatTranslatingCallbackWrite = gethandler.write();
        deserializeWithObjectId deserializewithobjectid = gethandler.write;
        MinimalPrettyPrinter minimalPrettyPrinter = gethandler.AudioAttributesImplApi26Parcelizer;
        deserializeFromNumber deserializefromnumberIconCompatParcelizer = sidecarCompatTranslatingCallbackWrite.IconCompatParcelizer(deserializewithobjectid.AudioAttributesCompatParcelizer((16609105 & 1) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer() : minimalPrettyPrinter != null ? minimalPrettyPrinter.write() : switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer(), (16609105 & 2) != 0 ? ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer() : 0L, (16609105 & 4) != 0 ? null : null, (16609105 & 8) != 0 ? null : null, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : null, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer() : 0L, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer() : 0L, (16609105 & 4096) != 0 ? null : null, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? assignIndexes.INSTANCE.AudioAttributesImplApi21Parcelizer() : 0, (16609105 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? withCaseInsensitivity.INSTANCE.MediaBrowserCompatCustomActionResultReceiver() : 0, (16609105 & 131072) != 0 ? ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer() : 0L, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? findSize.INSTANCE.IconCompatParcelizer() : 0, (16609105 & 2097152) != 0 ? _findWithAlias.INSTANCE.AudioAttributesCompatParcelizer() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null));
        if (deserializefromnumberIconCompatParcelizer != null) {
            list.add(deserializefromnumberIconCompatParcelizer);
        } else {
            deserializefromnumberIconCompatParcelizer = null;
        }
        return deserializefromnumberIconCompatParcelizer != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(getHandler gethandler, AbstractDeserializer abstractDeserializer) {
        gethandler.RemoteActionCompatParcelizer(abstractDeserializer.getIconCompatParcelizer());
        gethandler.AudioAttributesImplApi26Parcelizer();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IconCompatParcelizer(getHandler gethandler, boolean z) {
        read readVar = gethandler.MediaBrowserCompatMediaItem;
        if (readVar == null) {
            return false;
        }
        if (readVar != null) {
            readVar.write(z);
        }
        gethandler.AudioAttributesImplApi26Parcelizer();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(getHandler gethandler) {
        gethandler.read();
        gethandler.AudioAttributesImplApi26Parcelizer();
        return true;
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        getValueNulls.write(this);
        _newReader.RemoteActionCompatParcelizer(this);
        addDeserializers.read(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_parser _parserVar, _parser.IconCompatParcelizer iconCompatParcelizer) {
        _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin._initForReading
    public final int read(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return IconCompatParcelizer(getvaluehandler).AudioAttributesCompatParcelizer(getvaluehandler.getAudioAttributesCompatParcelizer());
    }

    @Override // kotlin._initForReading
    public final int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return IconCompatParcelizer(getvaluehandler).write(i, getvaluehandler.getAudioAttributesCompatParcelizer());
    }

    @Override // kotlin._initForReading
    public final int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return IconCompatParcelizer(getvaluehandler).read(getvaluehandler.getAudioAttributesCompatParcelizer());
    }

    @Override // kotlin._initForReading
    public final int write(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return IconCompatParcelizer(getvaluehandler).write(i, getvaluehandler.getAudioAttributesCompatParcelizer());
    }

    @Override // kotlin.addKeySerializers
    public final void write(findSerializer findserializer) {
        if (getRatingCompat()) {
            SidecarCompatTranslatingCallback sidecarCompatTranslatingCallbackMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
            _constructDefaultValueInstantiator mediaBrowserCompatMediaItem = sidecarCompatTranslatingCallbackMediaBrowserCompatCustomActionResultReceiver.getMediaBrowserCompatMediaItem();
            if (mediaBrowserCompatMediaItem == null) {
                StringBuilder sb = new StringBuilder("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=");
                sb.append(this.RatingCompat);
                sb.append(", textSubstitution=");
                sb.append(this.MediaBrowserCompatMediaItem);
                sb.append(')');
                getRootStableInsets.read(sb.toString());
                throw new PlanDetailsCreator();
            }
            JsonParserDelegate jsonParserDelegateIconCompatParcelizer = findserializer.getIconCompatParcelizer().IconCompatParcelizer();
            boolean mediaMetadataCompat = sidecarCompatTranslatingCallbackMediaBrowserCompatCustomActionResultReceiver.getMediaMetadataCompat();
            if (mediaMetadataCompat) {
                float ratingCompat = (int) (sidecarCompatTranslatingCallbackMediaBrowserCompatCustomActionResultReceiver.getRatingCompat() >> 32);
                float ratingCompat2 = (int) sidecarCompatTranslatingCallbackMediaBrowserCompatCustomActionResultReceiver.getRatingCompat();
                jsonParserDelegateIconCompatParcelizer.IconCompatParcelizer();
                JsonParserDelegate.IconCompatParcelizer$default(jsonParserDelegateIconCompatParcelizer, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ratingCompat, ratingCompat2, 0, 16, null);
            }
            try {
                renameAll renameallOnPlayFromMediaId = this.write.onPlayFromMediaId();
                if (renameallOnPlayFromMediaId == null) {
                    renameallOnPlayFromMediaId = renameAll.INSTANCE.write();
                }
                renameAll renameall = renameallOnPlayFromMediaId;
                nopInstance nopinstanceOnFastForward = this.write.onFastForward();
                if (nopinstanceOnFastForward == null) {
                    nopinstanceOnFastForward = nopInstance.INSTANCE.RemoteActionCompatParcelizer();
                }
                nopInstance nopinstance = nopinstanceOnFastForward;
                findTypeResolver findtyperesolverAudioAttributesImplApi26Parcelizer = this.write.AudioAttributesImplApi26Parcelizer();
                if (findtyperesolverAudioAttributesImplApi26Parcelizer == null) {
                    findtyperesolverAudioAttributesImplApi26Parcelizer = findTypeResolver.INSTANCE;
                }
                findViews findviews = findtyperesolverAudioAttributesImplApi26Parcelizer;
                Instantiatable instantiatableWrite = this.write.write();
                if (instantiatableWrite != null) {
                    _constructDefaultValueInstantiator.read$default(mediaBrowserCompatMediaItem, jsonParserDelegateIconCompatParcelizer, instantiatableWrite, this.write.AudioAttributesCompatParcelizer(), nopinstance, renameall, findviews, 0, 64, null);
                } else {
                    MinimalPrettyPrinter minimalPrettyPrinter = this.AudioAttributesImplApi26Parcelizer;
                    long jWrite = minimalPrettyPrinter != null ? minimalPrettyPrinter.write() : switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer();
                    if (jWrite == 16) {
                        if (this.write.MediaBrowserCompatCustomActionResultReceiver() != 16) {
                            jWrite = this.write.MediaBrowserCompatCustomActionResultReceiver();
                        } else {
                            jWrite = switchToNext.INSTANCE.AudioAttributesCompatParcelizer();
                        }
                    }
                    _constructDefaultValueInstantiator.AudioAttributesCompatParcelizer$default(mediaBrowserCompatMediaItem, jsonParserDelegateIconCompatParcelizer, jWrite, nopinstance, renameall, findviews, 0, 32, null);
                }
            } finally {
                if (mediaMetadataCompat) {
                    jsonParserDelegateIconCompatParcelizer.AudioAttributesCompatParcelizer();
                }
            }
        }
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            SidecarCompatTranslatingCallback sidecarCompatTranslatingCallbackIconCompatParcelizer = IconCompatParcelizer(withcontentvaluehandler);
            boolean z = sidecarCompatTranslatingCallbackIconCompatParcelizer.read(j, withcontentvaluehandler.getAudioAttributesCompatParcelizer());
            sidecarCompatTranslatingCallbackIconCompatParcelizer.IconCompatParcelizer();
            _constructDefaultValueInstantiator mediaBrowserCompatMediaItem = sidecarCompatTranslatingCallbackIconCompatParcelizer.getMediaBrowserCompatMediaItem();
            toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem);
            long ratingCompat = sidecarCompatTranslatingCallbackIconCompatParcelizer.getRatingCompat();
            if (z) {
                _newReader.AudioAttributesCompatParcelizer(this);
                HashMap map = this.AudioAttributesImplApi21Parcelizer;
                if (map == null) {
                    map = new HashMap(2);
                    this.AudioAttributesImplApi21Parcelizer = map;
                }
                map.put(wrongTokenException.RemoteActionCompatParcelizer(), Integer.valueOf(Math.round(mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer())));
                map.put(wrongTokenException.IconCompatParcelizer(), Integer.valueOf(Math.round(mediaBrowserCompatMediaItem.write())));
            }
            int i = (int) (ratingCompat >> 32);
            int i2 = (int) ratingCompat;
            final _parser _parserVarWrite = istypeorsupertypeof.write(PropertyValueAny.INSTANCE.IconCompatParcelizer(i, i, i2, i2));
            Map<weirdNumberException, Integer> map2 = this.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.write(map2);
            return withcontentvaluehandler.AudioAttributesCompatParcelizer(i, i2, map2, new getAnswerMap() { // from class: o.setNumViewsToShowOnScreen
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return getHandler.RemoteActionCompatParcelizer(_parserVarWrite, (_parser.IconCompatParcelizer) obj);
                }
            });
        } finally {
            Trace.endSection();
        }
    }

    public /* synthetic */ getHandler(String str, deserializeWithObjectId deserializewithobjectid, _reportMissingSetter.write writeVar, int i, boolean z, int i2, int i3, MinimalPrettyPrinter minimalPrettyPrinter, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, deserializewithobjectid, writeVar, i, z, i2, i3, minimalPrettyPrinter);
    }
}
