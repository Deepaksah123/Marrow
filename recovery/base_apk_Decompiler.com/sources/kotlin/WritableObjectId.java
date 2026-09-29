package kotlin;

import java.io.IOException;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class WritableObjectId implements _serializeObjectId {
    private static final isJacksonStdImpl IconCompatParcelizer = new isJacksonStdImpl();
    private final C0170format AudioAttributesCompatParcelizer;
    private final MinimalClassNameIdResolver MediaBrowserCompatItemReceiver;
    private final withTimeZone.IconCompatParcelizer RemoteActionCompatParcelizer;
    final findConstructor read;
    private final boolean write;

    WritableObjectId(findConstructor findconstructor, C0170format c0170format, MinimalClassNameIdResolver minimalClassNameIdResolver, withTimeZone.IconCompatParcelizer iconCompatParcelizer, boolean z) {
        this.read = findconstructor;
        this.AudioAttributesCompatParcelizer = c0170format;
        this.MediaBrowserCompatItemReceiver = minimalClassNameIdResolver;
        this.RemoteActionCompatParcelizer = iconCompatParcelizer;
        this.write = z;
    }

    @Override // kotlin._serializeObjectId
    public final void AudioAttributesCompatParcelizer(findRawSuperTypes findrawsupertypes) {
        this.read.read(findrawsupertypes);
    }

    @Override // kotlin._serializeObjectId
    public final boolean RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        return this.read.RemoteActionCompatParcelizer(closeonfailandthrowasioe, IconCompatParcelizer) == 0;
    }

    @Override // kotlin._serializeObjectId
    public final boolean RemoteActionCompatParcelizer() {
        findConstructor findconstructorWrite = this.read.write();
        return (findconstructorWrite instanceof getPrevious) || (findconstructorWrite instanceof TypeKey) || (findconstructorWrite instanceof isTyped) || (findconstructorWrite instanceof IgnorePropertiesUtil);
    }

    @Override // kotlin._serializeObjectId
    public final boolean read() {
        findConstructor findconstructorWrite = this.read.write();
        return (findconstructorWrite instanceof removeFirst) || (findconstructorWrite instanceof NameTransformerChained);
    }

    @Override // kotlin._serializeObjectId
    public final _serializeObjectId IconCompatParcelizer() {
        findConstructor ignorePropertiesUtil;
        buildTypeSerializer.write(!read());
        boolean z = this.read.write() == this.read;
        StringBuilder sb = new StringBuilder("Can't recreate wrapped extractors. Outer type: ");
        sb.append(this.read.getClass());
        buildTypeSerializer.read(z, sb.toString());
        findConstructor findconstructor = this.read;
        if (findconstructor instanceof ByteArraySerializer) {
            ignorePropertiesUtil = new ByteArraySerializer(this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.MediaBrowserCompatItemReceiver, this.RemoteActionCompatParcelizer, this.write);
        } else if (findconstructor instanceof getPrevious) {
            ignorePropertiesUtil = new getPrevious();
        } else if (findconstructor instanceof TypeKey) {
            ignorePropertiesUtil = new TypeKey();
        } else if (findconstructor instanceof isTyped) {
            ignorePropertiesUtil = new isTyped();
        } else if (findconstructor instanceof IgnorePropertiesUtil) {
            ignorePropertiesUtil = new IgnorePropertiesUtil();
        } else {
            StringBuilder sb2 = new StringBuilder("Unexpected extractor type for recreation: ");
            sb2.append(this.read.getClass().getSimpleName());
            throw new IllegalStateException(sb2.toString());
        }
        return new WritableObjectId(ignorePropertiesUtil, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.RemoteActionCompatParcelizer, this.write);
    }

    @Override // kotlin._serializeObjectId
    public final void AudioAttributesCompatParcelizer() {
        this.read.write(0L, 0L);
    }
}
