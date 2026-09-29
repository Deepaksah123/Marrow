package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000e8\u0017X\u0096D¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/bufferForInputBuffering;", "Lo/getProblemHandlers;", "Lo/extractScalarFromObject;", "p0", "", "p1", "<init>", "(Lo/extractScalarFromObject;Z)V", "Lo/handleWeirdNumberValue;", "AudioAttributesCompatParcelizer", "(I)Z", "", "read", "(Lo/extractScalarFromObject;)V", "", "Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "()Ljava/lang/String;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class bufferForInputBuffering extends getProblemHandlers {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    public bufferForInputBuffering(extractScalarFromObject extractscalarfromobject, boolean z) {
        super(extractscalarfromobject, z, null, 4, null);
        this.RemoteActionCompatParcelizer = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // kotlin.createForPropertyOverride
    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter and merged with bridge method [inline-methods] */
    public final String getRead() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.getProblemHandlers
    public final boolean AudioAttributesCompatParcelizer(int p0) {
        return (handleWeirdNumberValue.read(p0, handleWeirdNumberValue.INSTANCE.read()) || handleWeirdNumberValue.read(p0, handleWeirdNumberValue.INSTANCE.IconCompatParcelizer())) ? false : true;
    }

    @Override // kotlin.getProblemHandlers
    public final void read(extractScalarFromObject p0) {
        findContextualValueDeserializer findcontextualvaluedeserializerAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (findcontextualvaluedeserializerAudioAttributesImplApi21Parcelizer != null) {
            findcontextualvaluedeserializerAudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(p0);
        }
    }
}
