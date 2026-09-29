package kotlin;

import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR#\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lo/maybeStartShimmer;", "Lo/DateDeserializersCalendarDeserializer;", "Lo/hasParameter;", "p0", "Lo/bufferMapProperty;", "p1", "Lkotlin/Function2;", "Lo/appendReferring;", "", "p2", "<init>", "(JLo/bufferMapProperty;Lo/MagicModuleSubmissionRequestBody;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/getKey;", "Lo/tryToResolveUnresolved;", "p3", "Lo/hasReferringProperties;", "AudioAttributesCompatParcelizer", "(Lo/appendReferring;JLo/tryToResolveUnresolved;J)J", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "J", "read", "Lo/bufferMapProperty;", "write", "Lo/MagicModuleSubmissionRequestBody;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class maybeStartShimmer implements DateDeserializersCalendarDeserializer {
    private final long IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final bufferMapProperty write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final MagicModuleSubmissionRequestBody<appendReferring, appendReferring, getShowPopup> AudioAttributesCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    private maybeStartShimmer(long j, bufferMapProperty buffermapproperty, MagicModuleSubmissionRequestBody<? super appendReferring, ? super appendReferring, getShowPopup> magicModuleSubmissionRequestBody) {
        this.IconCompatParcelizer = j;
        this.write = buffermapproperty;
        this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
    }

    @Override // kotlin.DateDeserializersCalendarDeserializer
    public final long AudioAttributesCompatParcelizer(appendReferring p0, long p1, tryToResolveUnresolved p2, long p3) {
        getTopRankers gettoprankersWrite;
        Object obj;
        Object next;
        int iIconCompatParcelizer = this.write.IconCompatParcelizer(_predefined.read());
        int iIconCompatParcelizer2 = this.write.IconCompatParcelizer(hasParameter.RemoteActionCompatParcelizer(this.IconCompatParcelizer)) * (p2 == tryToResolveUnresolved.write ? 1 : -1);
        int iIconCompatParcelizer3 = this.write.IconCompatParcelizer(hasParameter.read(this.IconCompatParcelizer));
        int read = p0.getRead() + iIconCompatParcelizer2;
        int i = (int) (p3 >> 32);
        int audioAttributesCompatParcelizer = (p0.getAudioAttributesCompatParcelizer() - i) + iIconCompatParcelizer2;
        int i2 = (int) (p1 >> 32);
        int i3 = i2 - i;
        if (p2 == tryToResolveUnresolved.write) {
            Integer[] numArr = new Integer[3];
            numArr[0] = Integer.valueOf(read);
            numArr[1] = Integer.valueOf(audioAttributesCompatParcelizer);
            if (p0.getRead() < 0) {
                i3 = 0;
            }
            numArr[2] = Integer.valueOf(i3);
            gettoprankersWrite = StateResult.write((Object[]) numArr);
        } else {
            Integer[] numArr2 = new Integer[3];
            numArr2[0] = Integer.valueOf(audioAttributesCompatParcelizer);
            numArr2[1] = Integer.valueOf(read);
            if (p0.getAudioAttributesCompatParcelizer() <= i2) {
                i3 = 0;
            }
            numArr2[2] = Integer.valueOf(i3);
            gettoprankersWrite = StateResult.write((Object[]) numArr2);
        }
        Iterator itWrite = gettoprankersWrite.write();
        while (true) {
            obj = null;
            if (!itWrite.hasNext()) {
                next = null;
                break;
            }
            next = itWrite.next();
            int iIntValue = ((Number) next).intValue();
            if (iIntValue >= 0 && iIntValue + i <= i2) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            audioAttributesCompatParcelizer = num.intValue();
        }
        int iMax = Math.max(p0.getIconCompatParcelizer() + iIconCompatParcelizer3, iIconCompatParcelizer);
        int i4 = (int) p3;
        int write = (p0.getWrite() - i4) + iIconCompatParcelizer3;
        int i5 = (int) p1;
        Iterator itWrite2 = StateResult.write((Object[]) new Integer[]{Integer.valueOf(iMax), Integer.valueOf(write), Integer.valueOf((p0.getWrite() - (i4 / 2)) + iIconCompatParcelizer3), Integer.valueOf((i5 - i4) - iIconCompatParcelizer)}).write();
        while (true) {
            if (!itWrite2.hasNext()) {
                break;
            }
            Object next2 = itWrite2.next();
            int iIntValue2 = ((Number) next2).intValue();
            if (iIntValue2 >= iIconCompatParcelizer && iIntValue2 + i4 <= i5 - iIconCompatParcelizer) {
                obj = next2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            write = num2.intValue();
        }
        this.AudioAttributesCompatParcelizer.invoke(p0, new appendReferring(audioAttributesCompatParcelizer, write, i + audioAttributesCompatParcelizer, i4 + write));
        long j = write;
        long j2 = -1;
        return hasReferringProperties.read((((long) audioAttributesCompatParcelizer) << 32) | (j & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
    }

    public /* synthetic */ maybeStartShimmer(long j, bufferMapProperty buffermapproperty, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, buffermapproperty, magicModuleSubmissionRequestBody);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof maybeStartShimmer)) {
            return false;
        }
        maybeStartShimmer maybestartshimmer = (maybeStartShimmer) p0;
        return hasParameter.write(this.IconCompatParcelizer, maybestartshimmer.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, maybestartshimmer.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, maybestartshimmer.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (((hasParameter.IconCompatParcelizer(this.IconCompatParcelizer) * 31) + this.write.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("maybeStartShimmer(IconCompatParcelizer=");
        sb.append((Object) hasParameter.AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer));
        sb.append(", write=");
        sb.append(this.write);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
