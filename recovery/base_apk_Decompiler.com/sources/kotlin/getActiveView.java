package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0014\u0010\f\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0014\u0010\u000f\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lo/getActiveView;", "", "Lo/_assertNotNull;", "p0", "<init>", "(Lo/_assertNotNull;)V", "Lo/getAnnotationIntrospector;", "Lo/handleWeirdKey;", "p1", "", "p2", "Lo/handleUnknownProperty;", "IconCompatParcelizer", "(Lo/getAnnotationIntrospector;Lo/handleWeirdKey;Z)I", "", "write", "()V", "AudioAttributesCompatParcelizer", "Lo/_assertNotNull;", "Lo/getNodeFactory;", "Lo/getNodeFactory;", "read", "Lo/getBase64Variant;", "Lo/getBase64Variant;", "Lo/addValueInstantiators;", "Lo/addValueInstantiators;", "RemoteActionCompatParcelizer", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getActiveView {
    private final _assertNotNull AudioAttributesCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getNodeFactory read;
    private final getBase64Variant IconCompatParcelizer = new getBase64Variant();

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final addValueInstantiators write = new addValueInstantiators();

    public getActiveView(_assertNotNull _assertnotnull) {
        this.AudioAttributesCompatParcelizer = _assertnotnull;
        this.read = new getNodeFactory(_assertnotnull.RemoteActionCompatParcelizer());
    }

    public final int IconCompatParcelizer(getAnnotationIntrospector p0, handleWeirdKey p1, boolean p2) {
        boolean z;
        boolean z2;
        if (this.RemoteActionCompatParcelizer) {
            return getDefaultPropertyFormat.AudioAttributesCompatParcelizer(false, false, false);
        }
        boolean z3 = true;
        try {
            this.RemoteActionCompatParcelizer = true;
            introspectForBuilder introspectforbuilderRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(p0, p1);
            int iWrite = introspectforbuilderRemoteActionCompatParcelizer.IconCompatParcelizer().write();
            for (int i = 0; i < iWrite; i++) {
                getArrayBuilders getarraybuildersIconCompatParcelizer = introspectforbuilderRemoteActionCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer(i);
                if (!getarraybuildersIconCompatParcelizer.getRemoteActionCompatParcelizer() && !getarraybuildersIconCompatParcelizer.getAudioAttributesImplApi26Parcelizer()) {
                }
                z = false;
                break;
            }
            z = true;
            int iWrite2 = introspectforbuilderRemoteActionCompatParcelizer.IconCompatParcelizer().write();
            for (int i2 = 0; i2 < iWrite2; i2++) {
                getArrayBuilders getarraybuildersIconCompatParcelizer2 = introspectforbuilderRemoteActionCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer(i2);
                if (z || bufferAsCopyOfValue.read(getarraybuildersIconCompatParcelizer2)) {
                    _assertNotNull.RemoteActionCompatParcelizer$default(this.AudioAttributesCompatParcelizer, getarraybuildersIconCompatParcelizer2.getRead(), this.write, getarraybuildersIconCompatParcelizer2.getMediaBrowserCompatItemReceiver(), false, 8, null);
                    if (!this.write.isEmpty()) {
                        this.read.IconCompatParcelizer(getarraybuildersIconCompatParcelizer2.getIconCompatParcelizer(), this.write, bufferAsCopyOfValue.read(getarraybuildersIconCompatParcelizer2));
                        this.write.clear();
                    }
                }
            }
            boolean zWrite = this.read.write(introspectforbuilderRemoteActionCompatParcelizer, p2);
            if (!introspectforbuilderRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer()) {
                int iWrite3 = introspectforbuilderRemoteActionCompatParcelizer.IconCompatParcelizer().write();
                for (int i3 = 0; i3 < iWrite3; i3++) {
                    getArrayBuilders getarraybuildersIconCompatParcelizer3 = introspectforbuilderRemoteActionCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer(i3);
                    if (bufferAsCopyOfValue.AudioAttributesImplApi21Parcelizer(getarraybuildersIconCompatParcelizer3) && getarraybuildersIconCompatParcelizer3.MediaDescriptionCompat()) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            int iWrite4 = introspectforbuilderRemoteActionCompatParcelizer.IconCompatParcelizer().write();
            int i4 = 0;
            while (true) {
                if (i4 >= iWrite4) {
                    z3 = false;
                    break;
                }
                if (introspectforbuilderRemoteActionCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer(i4).MediaDescriptionCompat()) {
                    break;
                }
                i4++;
            }
            return getDefaultPropertyFormat.AudioAttributesCompatParcelizer(zWrite, z2, z3);
        } finally {
            this.RemoteActionCompatParcelizer = false;
        }
    }

    public final void write() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        this.IconCompatParcelizer.IconCompatParcelizer();
        this.read.IconCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer() {
        this.read.read();
    }
}
