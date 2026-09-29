package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0018B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017"}, d2 = {"Lo/newEncryptedObject;", "Lo/getDecryptedContent;", "Lo/EncryptedContentArray;", "", "Lo/LessonMcqUpdateInfo;", "p0", "p1", "<init>", "(II)V", "", "write", "(I)Z", "AudioAttributesImplApi26Parcelizer", "()Z", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "()Ljava/lang/Integer;", "RemoteActionCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class newEncryptedObject extends getDecryptedContent implements EncryptedContentArray<Integer>, LessonMcqUpdateInfo<Integer> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final newEncryptedObject AudioAttributesCompatParcelizer = new newEncryptedObject(1, 0);

    public newEncryptedObject(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // kotlin.EncryptedContentArray
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
    public final Integer write() {
        return Integer.valueOf(getRead());
    }

    @Override // kotlin.EncryptedContentArray
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public final Integer IconCompatParcelizer() {
        return Integer.valueOf(getAudioAttributesCompatParcelizer());
    }

    public final boolean write(int p0) {
        return getRead() <= p0 && p0 <= getAudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getDecryptedContent
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return getRead() > getAudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getDecryptedContent
    public final boolean equals(Object p0) {
        if (!(p0 instanceof newEncryptedObject)) {
            return false;
        }
        if (AudioAttributesImplApi26Parcelizer() && ((newEncryptedObject) p0).AudioAttributesImplApi26Parcelizer()) {
            return true;
        }
        newEncryptedObject newencryptedobject = (newEncryptedObject) p0;
        return getRead() == newencryptedobject.getRead() && getAudioAttributesCompatParcelizer() == newencryptedobject.getAudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getDecryptedContent
    public final int hashCode() {
        if (AudioAttributesImplApi26Parcelizer()) {
            return -1;
        }
        return (getRead() * 31) + getAudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getDecryptedContent
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getRead());
        sb.append("..");
        sb.append(getAudioAttributesCompatParcelizer());
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.newEncryptedObject$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/newEncryptedObject$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/newEncryptedObject;", "AudioAttributesCompatParcelizer", "Lo/newEncryptedObject;", "IconCompatParcelizer", "()Lo/newEncryptedObject;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static newEncryptedObject IconCompatParcelizer() {
            return newEncryptedObject.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
