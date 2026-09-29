package kotlin;

import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0085\u0001\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\f2\b\b\u0002\u0010\u0005\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJo\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001e2\b\b\u0002\u0010\u0005\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0016\u0010$\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Lo/deserializeFromString;", "", "Lo/_reportMissingSetter$write;", "p0", "Lo/bufferMapProperty;", "p1", "Lo/tryToResolveUnresolved;", "p2", "", "p3", "<init>", "(Lo/_reportMissingSetter$write;Lo/bufferMapProperty;Lo/tryToResolveUnresolved;I)V", "Lo/AbstractDeserializer;", "Lo/deserializeWithObjectId;", "Lo/paramName;", "", "p4", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_findCustomMapDeserializer;", "p5", "Lo/PropertyValueAny;", "p6", "p7", "p8", "p9", "p10", "Lo/deserializeFromNumber;", "RemoteActionCompatParcelizer", "(Lo/AbstractDeserializer;Lo/deserializeWithObjectId;IZILjava/util/List;JLo/tryToResolveUnresolved;Lo/bufferMapProperty;Lo/_reportMissingSetter$write;Z)Lo/deserializeFromNumber;", "", "IconCompatParcelizer", "(Ljava/lang/String;Lo/deserializeWithObjectId;IZIJLo/tryToResolveUnresolved;Lo/bufferMapProperty;Lo/_reportMissingSetter$write;Z)Lo/deserializeFromNumber;", "AudioAttributesCompatParcelizer", "Lo/_reportMissingSetter$write;", "read", "write", "Lo/bufferMapProperty;", "Lo/tryToResolveUnresolved;", "I", "Lo/_resolvedObjectIdProperty;", "AudioAttributesImplApi26Parcelizer", "Lo/_resolvedObjectIdProperty;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class deserializeFromString {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final _reportMissingSetter.write read;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final _resolvedObjectIdProperty write;
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final tryToResolveUnresolved IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final bufferMapProperty AudioAttributesCompatParcelizer;

    public deserializeFromString(_reportMissingSetter.write writeVar, bufferMapProperty buffermapproperty, tryToResolveUnresolved trytoresolveunresolved, int i) {
        this.read = writeVar;
        this.AudioAttributesCompatParcelizer = buffermapproperty;
        this.IconCompatParcelizer = trytoresolveunresolved;
        this.RemoteActionCompatParcelizer = i;
        this.write = i > 0 ? new _resolvedObjectIdProperty(i) : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ deserializeFromNumber RemoteActionCompatParcelizer$default(deserializeFromString deserializefromstring, AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, int i, boolean z, int i2, List list, long j, tryToResolveUnresolved trytoresolveunresolved, bufferMapProperty buffermapproperty, _reportMissingSetter.write writeVar, boolean z2, int i3, Object obj) {
        return deserializefromstring.RemoteActionCompatParcelizer(abstractDeserializer, (i3 & 2) != 0 ? deserializeWithObjectId.INSTANCE.read() : deserializewithobjectid, (i3 & 4) != 0 ? paramName.INSTANCE.RemoteActionCompatParcelizer() : i, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? Integer.MAX_VALUE : i2, (i3 & 32) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i3 & 64) != 0 ? PropertyValueBuffer.read$default(0, 0, 0, 0, 15, null) : j, (i3 & 128) != 0 ? deserializefromstring.IconCompatParcelizer : trytoresolveunresolved, (i3 & 256) != 0 ? deserializefromstring.AudioAttributesCompatParcelizer : buffermapproperty, (i3 & 512) != 0 ? deserializefromstring.read : writeVar, (i3 & 1024) != 0 ? false : z2);
    }

    public final deserializeFromNumber RemoteActionCompatParcelizer(AbstractDeserializer p0, deserializeWithObjectId p1, int p2, boolean p3, int p4, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> p5, long p6, tryToResolveUnresolved p7, bufferMapProperty p8, _reportMissingSetter.write p9, boolean p10) {
        _resolvedObjectIdProperty _resolvedobjectidproperty;
        deserializeFromBoolean deserializefromboolean = new deserializeFromBoolean(p0, p1, p5, p4, p3, p2, p8, p7, p9, p6, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        deserializeFromNumber deserializefromnumber = (p10 || (_resolvedobjectidproperty = this.write) == null) ? null : _resolvedobjectidproperty.read(deserializefromboolean);
        if (deserializefromnumber != null) {
            long j = -1;
            return deserializefromnumber.read(deserializefromboolean, PropertyValueBuffer.write(p6, getKey.read((((long) _findCustomMapLikeDeserializer.RemoteActionCompatParcelizer(deserializefromnumber.getWrite().getIconCompatParcelizer())) << 32) | (((long) _findCustomMapLikeDeserializer.RemoteActionCompatParcelizer(deserializefromnumber.getWrite().getAudioAttributesImplApi21Parcelizer())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))))));
        }
        deserializeFromNumber deserializefromnumberWrite = INSTANCE.write(deserializefromboolean);
        _resolvedObjectIdProperty _resolvedobjectidproperty2 = this.write;
        if (_resolvedobjectidproperty2 != null) {
            _resolvedobjectidproperty2.read(deserializefromboolean, deserializefromnumberWrite);
        }
        return deserializefromnumberWrite;
    }

    public final deserializeFromNumber IconCompatParcelizer(String p0, deserializeWithObjectId p1, int p2, boolean p3, int p4, long p5, tryToResolveUnresolved p6, bufferMapProperty p7, _reportMissingSetter.write p8, boolean p9) {
        return RemoteActionCompatParcelizer$default(this, new AbstractDeserializer(p0, null, 2, null), p1, p2, p3, p4, null, p5, p6, p7, p8, p9, 32, null);
    }

    /* JADX INFO: renamed from: o.deserializeFromString$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/deserializeFromString$IconCompatParcelizer;", "", "<init>", "()V", "Lo/deserializeFromBoolean;", "p0", "Lo/deserializeFromNumber;", "write", "(Lo/deserializeFromBoolean;)Lo/deserializeFromNumber;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final deserializeFromNumber write(deserializeFromBoolean p0) {
            _findParamName _findparamname = new _findParamName(p0.getWrite(), injectValues.IconCompatParcelizer(p0.getRead(), p0.getMediaBrowserCompatItemReceiver()), p0.MediaBrowserCompatCustomActionResultReceiver(), p0.getAudioAttributesImplBaseParcelizer(), p0.getAudioAttributesImplApi21Parcelizer());
            int iMediaBrowserCompatItemReceiver = PropertyValueAny.MediaBrowserCompatItemReceiver(p0.getAudioAttributesImplApi26Parcelizer());
            int iAudioAttributesImplBaseParcelizer = ((p0.getRemoteActionCompatParcelizer() || deserializeFromObjectId.write(p0.getMediaBrowserCompatCustomActionResultReceiver())) && PropertyValueAny.RemoteActionCompatParcelizer(p0.getAudioAttributesImplApi26Parcelizer())) ? PropertyValueAny.AudioAttributesImplBaseParcelizer(p0.getAudioAttributesImplApi26Parcelizer()) : Integer.MAX_VALUE;
            int iconCompatParcelizer = (p0.getRemoteActionCompatParcelizer() || !deserializeFromObjectId.write(p0.getMediaBrowserCompatCustomActionResultReceiver())) ? p0.getIconCompatParcelizer() : 1;
            if (iMediaBrowserCompatItemReceiver != iAudioAttributesImplBaseParcelizer) {
                iAudioAttributesImplBaseParcelizer = getQues.write(_findCustomMapLikeDeserializer.RemoteActionCompatParcelizer(_findparamname.write()), iMediaBrowserCompatItemReceiver, iAudioAttributesImplBaseParcelizer);
            }
            long j = -1;
            return new deserializeFromNumber(p0, new _checkImplicitlyNamedConstructors(_findparamname, PropertyValueAny.INSTANCE.IconCompatParcelizer(0, iAudioAttributesImplBaseParcelizer, 0, PropertyValueAny.AudioAttributesImplApi21Parcelizer(p0.getAudioAttributesImplApi26Parcelizer())), iconCompatParcelizer, p0.getMediaBrowserCompatCustomActionResultReceiver(), null), PropertyValueBuffer.write(p0.getAudioAttributesImplApi26Parcelizer(), getKey.read((((((long) 0) << 32) | (j - ((j >> 63) << 32))) & ((long) ((int) Math.ceil(r14.getAudioAttributesImplApi21Parcelizer())))) | (((long) ((int) Math.ceil(r14.getIconCompatParcelizer()))) << 32))), null);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
