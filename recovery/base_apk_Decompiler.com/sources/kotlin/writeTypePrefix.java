package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.resetWithString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/writeTypePrefix;", "Lo/findAndAddVirtualProperties;", "Lo/handleIdValue;", "p0", "<init>", "(JLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/calloc;", "Lo/tryToResolveUnresolved;", "p1", "Lo/bufferMapProperty;", "p2", "Lo/resetWithString;", "write", "(JLo/tryToResolveUnresolved;Lo/bufferMapProperty;)Lo/resetWithString;", "read", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class writeTypePrefix implements findAndAddVirtualProperties {
    private final long read;

    private writeTypePrefix(long j) {
        this.read = j;
    }

    @Override // kotlin.findAndAddVirtualProperties
    public final resetWithString write(long p0, tryToResolveUnresolved p1, bufferMapProperty p2) {
        removeSoftRefsClearedByGc removesoftrefsclearedbygcWrite = writeIndentation.write();
        float fAudioAttributesCompatParcelizer = p2.AudioAttributesCompatParcelizer(handleIdValue.IconCompatParcelizer(this.read));
        float fAudioAttributesCompatParcelizer2 = p2.AudioAttributesCompatParcelizer(handleIdValue.write(this.read));
        removesoftrefsclearedbygcWrite.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        removesoftrefsclearedbygcWrite.write(fAudioAttributesCompatParcelizer / 2.0f, BitmapDescriptorFactory.HUE_RED);
        removesoftrefsclearedbygcWrite.write(BitmapDescriptorFactory.HUE_RED, fAudioAttributesCompatParcelizer2);
        removesoftrefsclearedbygcWrite.write((-fAudioAttributesCompatParcelizer) / 2.0f, BitmapDescriptorFactory.HUE_RED);
        removesoftrefsclearedbygcWrite.read();
        return new resetWithString.AudioAttributesCompatParcelizer(removesoftrefsclearedbygcWrite);
    }

    public /* synthetic */ writeTypePrefix(long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j);
    }
}
