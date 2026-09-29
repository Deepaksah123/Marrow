package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00108\u0017X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/keyDeserializerInstance;", "Lo/getProblemHandlers;", "Lo/extractScalarFromObject;", "p0", "", "p1", "Lo/addKeyDeserializers;", "p2", "<init>", "(Lo/extractScalarFromObject;ZLo/addKeyDeserializers;)V", "Lo/handleWeirdNumberValue;", "AudioAttributesCompatParcelizer", "(I)Z", "", "read", "(Lo/extractScalarFromObject;)V", "", "Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "()Ljava/lang/String;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class keyDeserializerInstance extends getProblemHandlers {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    public keyDeserializerInstance(extractScalarFromObject extractscalarfromobject, boolean z, addKeyDeserializers addkeydeserializers) {
        super(extractscalarfromobject, z, addkeydeserializers);
        this.RemoteActionCompatParcelizer = "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }

    @Override // kotlin.createForPropertyOverride
    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter and merged with bridge method [inline-methods] */
    public final String getRead() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.getProblemHandlers
    public final boolean AudioAttributesCompatParcelizer(int p0) {
        return handleWeirdNumberValue.read(p0, handleWeirdNumberValue.INSTANCE.read()) || handleWeirdNumberValue.read(p0, handleWeirdNumberValue.INSTANCE.IconCompatParcelizer());
    }

    @Override // kotlin.getProblemHandlers
    public final void read(extractScalarFromObject p0) {
        findContextualValueDeserializer findcontextualvaluedeserializerAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (findcontextualvaluedeserializerAudioAttributesImplApi21Parcelizer != null) {
            findcontextualvaluedeserializerAudioAttributesImplApi21Parcelizer.write(p0);
        }
    }
}
