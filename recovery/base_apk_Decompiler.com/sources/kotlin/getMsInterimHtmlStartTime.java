package kotlin;

import java.lang.reflect.InvocationTargetException;
import kotlin.getMasterOrder;

/* JADX INFO: loaded from: classes4.dex */
public final class getMsInterimHtmlStartTime implements getMasterOrder {
    public static final read IconCompatParcelizer = new read(0);
    private final isActiveForNewTag AudioAttributesCompatParcelizer;
    private final Class<?> read;

    private getMsInterimHtmlStartTime(Class<?> cls, isActiveForNewTag isactivefornewtag) {
        this.read = cls;
        this.AudioAttributesCompatParcelizer = isactivefornewtag;
    }

    public final Class<?> IconCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.getMasterOrder
    public final isActiveForNewTag write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static final class read {
        private read() {
        }

        public static getMsInterimHtmlStartTime AudioAttributesCompatParcelizer(Class<?> cls) {
            toMagicModuleMetaRepoModel.write(cls, "");
            getTotalPeopleRated gettotalpeoplerated = new getTotalPeopleRated();
            getHtmlContent gethtmlcontent = getHtmlContent.AudioAttributesCompatParcelizer;
            getHtmlContent.RemoteActionCompatParcelizer(cls, gettotalpeoplerated);
            isActiveForNewTag isactivefornewtag = gettotalpeoplerated.read();
            if (isactivefornewtag == null) {
                return null;
            }
            return new getMsInterimHtmlStartTime(cls, isactivefornewtag, (byte) 0);
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    @Override // kotlin.getMasterOrder
    public final String RemoteActionCompatParcelizer() {
        StringBuilder sb = new StringBuilder();
        String name = this.read.getName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
        sb.append(TestGroupLSModel.AudioAttributesCompatParcelizer(name, '.', '/', false));
        sb.append(".class");
        return sb.toString();
    }

    @Override // kotlin.getMasterOrder
    public final RevisionSubjectStatusModel read() {
        return getFinalImageUrl.AudioAttributesCompatParcelizer(this.read);
    }

    @Override // kotlin.getMasterOrder
    public final void write(getMasterOrder.RemoteActionCompatParcelizer remoteActionCompatParcelizer) throws InvocationTargetException {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        getHtmlContent gethtmlcontent = getHtmlContent.AudioAttributesCompatParcelizer;
        getHtmlContent.RemoteActionCompatParcelizer(this.read, remoteActionCompatParcelizer);
    }

    @Override // kotlin.getMasterOrder
    public final void AudioAttributesCompatParcelizer(getMasterOrder.write writeVar) throws InvocationTargetException {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        getHtmlContent.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.read, writeVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof getMsInterimHtmlStartTime) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, ((getMsInterimHtmlStartTime) obj).read);
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(this.read);
        return sb.toString();
    }

    public /* synthetic */ getMsInterimHtmlStartTime(Class cls, isActiveForNewTag isactivefornewtag, byte b) {
        this(cls, isactivefornewtag);
    }
}
