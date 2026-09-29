package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class NumberSerializersIntLikeSerializer implements findAnnotatedContentSerializer {
    private findConstructor AudioAttributesCompatParcelizer;
    private closeOnFailAndThrowAsIOE IconCompatParcelizer;
    private final getClassDescription write;

    public NumberSerializersIntLikeSerializer(getClassDescription getclassdescription) {
        this.write = getclassdescription;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    @Override // kotlin.findAnnotatedContentSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void read(kotlin.JsonNullFormatVisitor r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, kotlin.findRawSuperTypes r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NumberSerializersIntLikeSerializer.read(o.JsonNullFormatVisitor, android.net.Uri, java.util.Map, long, long, o.findRawSuperTypes):void");
    }

    @Override // kotlin.findAnnotatedContentSerializer
    public final void AudioAttributesCompatParcelizer() {
        findConstructor findconstructor = this.AudioAttributesCompatParcelizer;
        if (findconstructor != null) {
            findconstructor.RemoteActionCompatParcelizer();
            this.AudioAttributesCompatParcelizer = null;
        }
        this.IconCompatParcelizer = null;
    }

    @Override // kotlin.findAnnotatedContentSerializer
    public final void RemoteActionCompatParcelizer() {
        findConstructor findconstructor = this.AudioAttributesCompatParcelizer;
        if (findconstructor != null) {
            findConstructor findconstructorWrite = findconstructor.write();
            if (findconstructorWrite instanceof IgnorePropertiesUtil) {
                ((IgnorePropertiesUtil) findconstructorWrite).read();
            }
        }
    }

    @Override // kotlin.findAnnotatedContentSerializer
    public final long write() {
        closeOnFailAndThrowAsIOE closeonfailandthrowasioe = this.IconCompatParcelizer;
        if (closeonfailandthrowasioe != null) {
            return closeonfailandthrowasioe.IconCompatParcelizer();
        }
        return -1L;
    }

    @Override // kotlin.findAnnotatedContentSerializer
    public final void read(long j, long j2) {
        ((findConstructor) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).write(j, j2);
    }

    @Override // kotlin.findAnnotatedContentSerializer
    public final int RemoteActionCompatParcelizer(isJacksonStdImpl isjacksonstdimpl) throws IOException {
        return ((findConstructor) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).RemoteActionCompatParcelizer((closeOnFailAndThrowAsIOE) buildTypeSerializer.IconCompatParcelizer(this.IconCompatParcelizer), isjacksonstdimpl);
    }
}
