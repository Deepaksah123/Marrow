package kotlin;

import kotlin.Metadata;
import kotlin._skipWSOrEnd;
import kotlin.onResume;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$"}, d2 = {"Lo/onResume;", "Lo/writerFor;", "Lo/performConfigurationChanged;", "Lo/access100;", "p0", "", "p1", "Lkotlin/Function2;", "Lo/getKey;", "Lo/tryToResolveUnresolved;", "Lo/hasReferringProperties;", "p2", "", "p3", "", "p4", "<init>", "(Lo/access100;ZLo/MagicModuleSubmissionRequestBody;Ljava/lang/Object;Ljava/lang/String;)V", "RemoteActionCompatParcelizer", "()Lo/performConfigurationChanged;", "", "IconCompatParcelizer", "(Lo/performConfigurationChanged;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lo/access100;", "read", "AudioAttributesImplBaseParcelizer", "Z", "write", "Lo/MagicModuleSubmissionRequestBody;", "AudioAttributesCompatParcelizer", "Ljava/lang/Object;", "Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class onResume extends writerFor<performConfigurationChanged> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final access100 read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Object write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final MagicModuleSubmissionRequestBody<getKey, tryToResolveUnresolved, hasReferringProperties> AudioAttributesCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public onResume(access100 access100Var, boolean z, MagicModuleSubmissionRequestBody<? super getKey, ? super tryToResolveUnresolved, hasReferringProperties> magicModuleSubmissionRequestBody, Object obj, String str) {
        this.read = access100Var;
        this.IconCompatParcelizer = z;
        this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
        this.write = obj;
        this.RemoteActionCompatParcelizer = str;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final performConfigurationChanged IconCompatParcelizer() {
        return new performConfigurationChanged(this.read, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.writerFor
    public final void IconCompatParcelizer(performConfigurationChanged p0) {
        p0.IconCompatParcelizer(this.read);
        p0.read(this.IconCompatParcelizer);
        p0.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || getClass() != p0.getClass()) {
            return false;
        }
        onResume onresume = (onResume) p0;
        return this.read == onresume.read && this.IconCompatParcelizer == onresume.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, onresume.write);
    }

    public final int hashCode() {
        return (((this.read.hashCode() * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + this.write.hashCode();
    }

    /* JADX INFO: renamed from: o.onResume$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/onResume$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/_skipWSOrEnd$write;", "p0", "", "p1", "Lo/onResume;", "write", "(Lo/_skipWSOrEnd$write;Z)Lo/onResume;", "Lo/_skipWSOrEnd$read;", "RemoteActionCompatParcelizer", "(Lo/_skipWSOrEnd$read;Z)Lo/onResume;", "Lo/_skipWSOrEnd;", "read", "(Lo/_skipWSOrEnd;Z)Lo/onResume;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final onResume write(final _skipWSOrEnd.write p0, boolean p1) {
            return new onResume(access100.RemoteActionCompatParcelizer, p1, new MagicModuleSubmissionRequestBody() { // from class: o.onViewCreated
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return onResume.Companion.write(p0, (getKey) obj, (tryToResolveUnresolved) obj2);
                }
            }, p0, "wrapContentWidth");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hasReferringProperties write(_skipWSOrEnd.write writeVar, getKey getkey, tryToResolveUnresolved trytoresolveunresolved) {
            return hasReferringProperties.write(hasReferringProperties.read(((long) writeVar.IconCompatParcelizer(0, (int) (getkey.getRemoteActionCompatParcelizer() >> 32), trytoresolveunresolved)) << 32));
        }

        public final onResume RemoteActionCompatParcelizer(final _skipWSOrEnd.read p0, boolean p1) {
            return new onResume(access100.AudioAttributesCompatParcelizer, p1, new MagicModuleSubmissionRequestBody() { // from class: o.onPrepareOptionsMenu
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return onResume.Companion.write(p0, (getKey) obj, (tryToResolveUnresolved) obj2);
                }
            }, p0, "wrapContentHeight");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hasReferringProperties write(_skipWSOrEnd.read readVar, getKey getkey, tryToResolveUnresolved trytoresolveunresolved) {
            long j = -1;
            return hasReferringProperties.write(hasReferringProperties.read(((long) readVar.read(0, (int) getkey.getRemoteActionCompatParcelizer())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
        }

        public final onResume read(final _skipWSOrEnd p0, boolean p1) {
            return new onResume(access100.IconCompatParcelizer, p1, new MagicModuleSubmissionRequestBody() { // from class: o.onOptionsMenuClosed
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return onResume.Companion.AudioAttributesCompatParcelizer(p0, (getKey) obj, (tryToResolveUnresolved) obj2);
                }
            }, p0, "wrapContentSize");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hasReferringProperties AudioAttributesCompatParcelizer(_skipWSOrEnd _skipwsorend, getKey getkey, tryToResolveUnresolved trytoresolveunresolved) {
            return hasReferringProperties.write(_skipwsorend.IconCompatParcelizer(getKey.INSTANCE.RemoteActionCompatParcelizer(), getkey.getRemoteActionCompatParcelizer(), trytoresolveunresolved));
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
