package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BO\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0010R\u0011\u0010\u000f\u001a\u00020\u00018\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018"}, d2 = {"Lo/JavaFloatBitsFromCharSequence;", "Lo/ParseDigitsTaskCharSequence;", "", "Lo/SnapshotId;", "p0", "Lo/toChars;", "p1", "Lkotlin/Function1;", "", "", "p2", "p3", "p4", "<init>", "(JLo/toChars;Lo/getAnswerMap;Lo/getAnswerMap;Lo/ParseDigitsTaskCharSequence;)V", "write", "()V", "Lo/charsToString;", "IconCompatParcelizer", "()Lo/charsToString;", "onPlay", "MediaBrowserCompatItemReceiver", "Lo/ParseDigitsTaskCharSequence;", "", "Z", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JavaFloatBitsFromCharSequence extends ParseDigitsTaskCharSequence {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final ParseDigitsTaskCharSequence write;

    public JavaFloatBitsFromCharSequence(long j, toChars tochars, getAnswerMap<Object, getShowPopup> getanswermap, getAnswerMap<Object, getShowPopup> getanswermap2, ParseDigitsTaskCharSequence parseDigitsTaskCharSequence) {
        super(j, tochars, getanswermap, getanswermap2);
        this.write = parseDigitsTaskCharSequence;
        parseDigitsTaskCharSequence.AudioAttributesCompatParcelizer(this);
    }

    @Override // kotlin.ParseDigitsTaskCharSequence, kotlin.parseDigitsRecursive
    public final void write() {
        if (getRead()) {
            return;
        }
        super.write();
        onPlay();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071 A[Catch: all -> 0x00db, TryCatch #0 {, blocks: (B:12:0x0036, B:14:0x003e, B:17:0x0045, B:21:0x0061, B:23:0x0069, B:27:0x007f, B:29:0x008b, B:30:0x0090, B:25:0x0071, B:26:0x007a), top: B:39:0x0036 }] */
    @Override // kotlin.ParseDigitsTaskCharSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.charsToString IconCompatParcelizer() {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.JavaFloatBitsFromCharSequence.IconCompatParcelizer():o.charsToString");
    }

    private final void onPlay() {
        if (this.read) {
            return;
        }
        this.read = true;
        this.write.read(this);
    }
}
