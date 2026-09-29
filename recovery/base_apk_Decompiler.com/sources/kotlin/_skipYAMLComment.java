package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0002\u001a\u00028\u00002\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00018\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u00018\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b"}, d2 = {"Lo/_skipYAMLComment;", "Lo/_handleOddName;", "p0", "p1", "<init>", "(Lo/_handleOddName;Lo/_handleOddName;)V", "R", "Lkotlin/Function2;", "Lo/_handleOddName$RemoteActionCompatParcelizer;", "read", "(Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "RemoteActionCompatParcelizer", "(Lo/getAnswerMap;)Z", "write", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lo/_handleOddName;", "IconCompatParcelizer", "()Lo/_handleOddName;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _skipYAMLComment implements _handleOddName {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final _handleOddName read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final _handleOddName write;

    public _skipYAMLComment(_handleOddName _handleoddname, _handleOddName _handleoddname2) {
        this.read = _handleoddname;
        this.write = _handleoddname2;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final _handleOddName getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final _handleOddName getRead() {
        return this.read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin._handleOddName
    public final <R> R read(R p0, MagicModuleSubmissionRequestBody<? super R, ? super _handleOddName.RemoteActionCompatParcelizer, ? extends R> p1) {
        return (R) this.write.read(this.read.read(p0, p1), p1);
    }

    @Override // kotlin._handleOddName
    public final boolean RemoteActionCompatParcelizer(getAnswerMap<? super _handleOddName.RemoteActionCompatParcelizer, Boolean> p0) {
        return this.read.RemoteActionCompatParcelizer(p0) || this.write.RemoteActionCompatParcelizer(p0);
    }

    @Override // kotlin._handleOddName
    public final boolean write(getAnswerMap<? super _handleOddName.RemoteActionCompatParcelizer, Boolean> p0) {
        return this.read.write(p0) && this.write.write(p0);
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof _skipYAMLComment)) {
            return false;
        }
        _skipYAMLComment _skipyamlcomment = (_skipYAMLComment) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, _skipyamlcomment.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, _skipyamlcomment.write);
    }

    public final int hashCode() {
        return this.read.hashCode() + (this.write.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append((String) read("", AnonymousClass3.read));
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: o._skipYAMLComment$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "p0", "Lo/_handleOddName$RemoteActionCompatParcelizer;", "p1", "IconCompatParcelizer", "(Ljava/lang/String;Lo/_handleOddName$RemoteActionCompatParcelizer;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<String, _handleOddName.RemoteActionCompatParcelizer, String> {
        public static final AnonymousClass3 read = new AnonymousClass3();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            if (str.length() == 0) {
                return remoteActionCompatParcelizer.toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", ");
            sb.append(remoteActionCompatParcelizer);
            return sb.toString();
        }

        AnonymousClass3() {
            super(2);
        }
    }
}
