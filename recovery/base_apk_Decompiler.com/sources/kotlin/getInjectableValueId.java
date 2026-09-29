package kotlin;

import kotlin.Metadata;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0003\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0014\u0010 \u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#"}, d2 = {"Lo/getInjectableValueId;", "Lo/_reportMissingSetter$write;", "Lo/_unwrapAndDeserialize;", "p0", "Lo/tryToResolveUnresolvedObjectId;", "p1", "Lo/_handleUnknownKeyDeserializer;", "p2", "Lo/markAsIgnorable;", "p3", "Lo/hasMatch;", "p4", "<init>", "(Lo/_unwrapAndDeserialize;Lo/tryToResolveUnresolvedObjectId;Lo/_handleUnknownKeyDeserializer;Lo/markAsIgnorable;Lo/hasMatch;)V", "Lo/_reportMissingSetter;", "Lo/getDataStream;", "Lo/withValueDeserializer;", "Lo/_findFormat;", "Lo/parseDouble;", "", "RemoteActionCompatParcelizer", "(Lo/_reportMissingSetter;Lo/getDataStream;II)Lo/parseDouble;", "Lo/_createDeserializer;", "read", "(Lo/_createDeserializer;)Lo/parseDouble;", "AudioAttributesCompatParcelizer", "Lo/_unwrapAndDeserialize;", "Lo/tryToResolveUnresolvedObjectId;", "AudioAttributesImplApi21Parcelizer", "Lo/_handleUnknownKeyDeserializer;", "write", "Lo/markAsIgnorable;", "IconCompatParcelizer", "Lo/hasMatch;", "Lkotlin/Function1;", "Lo/getAnswerMap;", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getInjectableValueId implements _reportMissingSetter.write {
    private final _unwrapAndDeserialize AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final _handleUnknownKeyDeserializer write;
    private final hasMatch IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final markAsIgnorable read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final tryToResolveUnresolvedObjectId RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getAnswerMap<_createDeserializer, Object> AudioAttributesImplBaseParcelizer;

    public getInjectableValueId(_unwrapAndDeserialize _unwrapanddeserialize, tryToResolveUnresolvedObjectId trytoresolveunresolvedobjectid, _handleUnknownKeyDeserializer _handleunknownkeydeserializer, markAsIgnorable markasignorable, hasMatch hasmatch) {
        this.AudioAttributesCompatParcelizer = _unwrapanddeserialize;
        this.RemoteActionCompatParcelizer = trytoresolveunresolvedobjectid;
        this.write = _handleunknownkeydeserializer;
        this.read = markasignorable;
        this.IconCompatParcelizer = hasmatch;
        this.AudioAttributesImplBaseParcelizer = new getAnswerMap() { // from class: o.isIgnorable
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getInjectableValueId.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, (_createDeserializer) obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ getInjectableValueId(_unwrapAndDeserialize _unwrapanddeserialize, tryToResolveUnresolvedObjectId trytoresolveunresolvedobjectid, _handleUnknownKeyDeserializer _handleunknownkeydeserializer, markAsIgnorable markasignorable, hasMatch hasmatch, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(_unwrapanddeserialize, (i & 2) != 0 ? tryToResolveUnresolvedObjectId.INSTANCE.read() : trytoresolveunresolvedobjectid, (i & 4) != 0 ? fixAccess.write() : _handleunknownkeydeserializer, (i & 8) != 0 ? new markAsIgnorable(fixAccess.AudioAttributesCompatParcelizer(), null, 2, 0 == true ? 1 : 0) : markasignorable, (i & 16) != 0 ? new hasMatch() : hasmatch);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object RemoteActionCompatParcelizer(getInjectableValueId getinjectablevalueid, _createDeserializer _createdeserializer) {
        return getinjectablevalueid.read(_createDeserializer.write$default(_createdeserializer, null, null, 0, 0, null, 30, null)).getRemoteActionCompatParcelizer();
    }

    @Override // o._reportMissingSetter.write
    public final parseDouble<Object> RemoteActionCompatParcelizer(_reportMissingSetter p0, getDataStream p1, int p2, int p3) {
        return read(new _createDeserializer(this.RemoteActionCompatParcelizer.read(p0), this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p1), this.RemoteActionCompatParcelizer.read(p2), this.RemoteActionCompatParcelizer.IconCompatParcelizer(p3), this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer(), null));
    }

    private final parseDouble<Object> read(final _createDeserializer p0) {
        return this.write.write(p0, new getAnswerMap() { // from class: o.deserializeSetAndReturn
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getInjectableValueId.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, p0, (getAnswerMap) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _findCachedDeserializer IconCompatParcelizer(getInjectableValueId getinjectablevalueid, _createDeserializer _createdeserializer, getAnswerMap getanswermap) {
        _findCachedDeserializer _findcacheddeserializerRemoteActionCompatParcelizer = getinjectablevalueid.read.RemoteActionCompatParcelizer(_createdeserializer, getinjectablevalueid.AudioAttributesCompatParcelizer, getanswermap, getinjectablevalueid.AudioAttributesImplBaseParcelizer);
        if (_findcacheddeserializerRemoteActionCompatParcelizer != null) {
            return _findcacheddeserializerRemoteActionCompatParcelizer;
        }
        _findCachedDeserializer _findcacheddeserializer = getinjectablevalueid.IconCompatParcelizer.read(_createdeserializer, getinjectablevalueid.AudioAttributesCompatParcelizer, getanswermap, getinjectablevalueid.AudioAttributesImplBaseParcelizer);
        if (_findcacheddeserializer != null) {
            return _findcacheddeserializer;
        }
        throw new IllegalStateException("Could not load font");
    }
}
