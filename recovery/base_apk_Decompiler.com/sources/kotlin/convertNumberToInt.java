package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001bR\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u0013*\u00020\u00038CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001cR\u001a\u0010 \u001a\u0004\u0018\u00010\u001e*\u00020\u00038CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001fR\u001a\u0010\"\u001a\u0004\u0018\u00010\u0003*\u00020\u00038CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010!"}, d2 = {"Lo/convertNumberToInt;", "Lo/JsonReadContext;", "Lo/setCurrentName;", "Lo/createChildArrayContext;", "p0", "<init>", "(Lo/createChildArrayContext;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "Lo/JsonReadFeature;", "write", "()Lo/JsonReadFeature;", "RemoteActionCompatParcelizer", "Lo/createChildArrayContext;", "Lo/releaseTokenBuffer;", "AudioAttributesCompatParcelizer", "()Lo/releaseTokenBuffer;", "", "read", "()Ljava/lang/Iterable;", "IconCompatParcelizer", "()Lo/setCurrentName;", "()Lo/JsonReadContext;", "(Lo/createChildArrayContext;)Lo/releaseTokenBuffer;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/convertNumberToLong;", "(Lo/createChildArrayContext;)Lo/convertNumberToLong;", "AudioAttributesImplApi26Parcelizer", "(Lo/createChildArrayContext;)Lo/createChildArrayContext;", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class convertNumberToInt implements JsonReadContext, setCurrentName {
    private final createChildArrayContext RemoteActionCompatParcelizer;

    public convertNumberToInt(createChildArrayContext createchildarraycontext) {
        this.RemoteActionCompatParcelizer = createchildarraycontext;
    }

    private final releaseTokenBuffer AudioAttributesCompatParcelizer() {
        createChildArrayContext createchildarraycontext = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.read(createchildarraycontext, "");
        return ((getTokenLineNr) createchildarraycontext).getAudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.JsonReadContext
    public final Iterable<JsonReadFeature> read() {
        return AudioAttributesCompatParcelizer().read();
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() * 31;
    }

    public final boolean equals(Object p0) {
        return (p0 instanceof convertNumberToInt) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((convertNumberToInt) p0).RemoteActionCompatParcelizer);
    }

    @Override // kotlin.setCurrentName
    public final setCurrentName IconCompatParcelizer() {
        createChildArrayContext createchildarraycontextRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        return createchildarraycontextRemoteActionCompatParcelizer != null ? new convertNumberToInt(createchildarraycontextRemoteActionCompatParcelizer) : null;
    }

    @Override // kotlin.setCurrentName
    public final JsonReadContext RemoteActionCompatParcelizer() {
        return this;
    }

    @Override // kotlin.setCurrentName
    public final JsonReadFeature write() {
        releaseTokenBuffer releasetokenbufferIconCompatParcelizer;
        convertNumberToLong convertnumbertolong;
        Integer numWrite;
        createChildArrayContext createchildarraycontextRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        if (createchildarraycontextRemoteActionCompatParcelizer == null || (releasetokenbufferIconCompatParcelizer = IconCompatParcelizer(createchildarraycontextRemoteActionCompatParcelizer)) == null || (convertnumbertolong = read(this.RemoteActionCompatParcelizer)) == null || (numWrite = isDup.write(releasetokenbufferIconCompatParcelizer, convertnumbertolong)) == null) {
            return null;
        }
        return InputDecorator.write(releasetokenbufferIconCompatParcelizer, numWrite.intValue());
    }

    private final releaseTokenBuffer IconCompatParcelizer(createChildArrayContext createchildarraycontext) {
        getTokenLineNr gettokenlinenr = createchildarraycontext instanceof getTokenLineNr ? (getTokenLineNr) createchildarraycontext : null;
        if (gettokenlinenr != null) {
            return gettokenlinenr.getAudioAttributesImplBaseParcelizer();
        }
        return null;
    }

    private final convertNumberToLong read(createChildArrayContext createchildarraycontext) {
        getTokenLineNr gettokenlinenr = createchildarraycontext instanceof getTokenLineNr ? (getTokenLineNr) createchildarraycontext : null;
        if (gettokenlinenr != null) {
            return gettokenlinenr.getAudioAttributesCompatParcelizer();
        }
        return null;
    }

    private final createChildArrayContext RemoteActionCompatParcelizer(createChildArrayContext createchildarraycontext) {
        convertNumberToLong convertnumbertolong = read(createchildarraycontext);
        if (convertnumbertolong != null) {
            return convertnumbertolong.AudioAttributesImplApi21Parcelizer();
        }
        return null;
    }
}
