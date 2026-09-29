package kotlin;

import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\b\u001a\u00020\r8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\n\u001a\u00020\u000f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0012"}, d2 = {"Lo/useStaticType;", "Lo/_parser$IconCompatParcelizer;", "Lo/createDeserializationContext;", "p0", "<init>", "(Lo/createDeserializationContext;)V", "Lo/asText;", "", "IconCompatParcelizer", "(Lo/asText;F)F", "AudioAttributesCompatParcelizer", "Lo/createDeserializationContext;", "write", "", "()I", "Lo/tryToResolveUnresolved;", "RemoteActionCompatParcelizer", "()Lo/tryToResolveUnresolved;", "()F", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class useStaticType extends _parser.IconCompatParcelizer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final createDeserializationContext write;

    public useStaticType(createDeserializationContext createdeserializationcontext) {
        this.write = createdeserializationcontext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o._parser.IconCompatParcelizer
    /* JADX INFO: renamed from: write */
    public final int getIconCompatParcelizer() {
        return this.write.MediaBrowserCompatSearchResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o._parser.IconCompatParcelizer
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final tryToResolveUnresolved getAudioAttributesCompatParcelizer() {
        return this.write.getRead();
    }

    @Override // o._parser.IconCompatParcelizer
    public final float IconCompatParcelizer(asText astext, float f) {
        if (astext.RemoteActionCompatParcelizer() != null) {
            return astext.RemoteActionCompatParcelizer().invoke(this, Float.valueOf(f)).floatValue();
        }
        return this.write.write(astext, f);
    }

    @Override // o._parser.IconCompatParcelizer, kotlin.bufferMapProperty
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public final float getRead() {
        return this.write.getRead();
    }

    @Override // o._parser.IconCompatParcelizer, kotlin.getParameter
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final float getIconCompatParcelizer() {
        return this.write.getIconCompatParcelizer();
    }
}
